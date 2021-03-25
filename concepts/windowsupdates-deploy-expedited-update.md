---
title: "Deploy an expedited update using the Windows Update for Business deployment service"
description: "**TODO: Add Description**"
author: "Alice-at-Microsoft"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: conceptualPageType
---

# Deploy an expedited update using the Windows Update for Business deployment service

TO DO: add intro

Deploying an expedited Windows 10 update allows the update to be installed as quickly as possible. Expedited updates have the following characteristics:

* The update starts right away rather than waiting for the next regular update scan, which occurs once every 22 hours by default.
* The update downloads and installs as quickly as possible.
* The update process overrides configured device policy settings, such as days until a forced reboot. After the expedited update is installed, the device returns to the current policy settings.

Today, the deployment service supports deploying expedited Windows 10 quality updates. Deploying an expedited quality update helps achieve compliance against a specific security update, as specified by date.

When you deploy an expedited quality update to a device, Windows Update will offer an update that brings the device above the minimum compliance level specified. Depending on when each device scans and updates, some devices may receive newer updates (e.g. if there is a newer security update than the one corresponding to the desired minimum compliance level), but all devices will meet the specified security update compliance standard.

## Prerequisites

* [deployment service prerequisites]
* [expedite client]

## Step 1: (Optional) Get a list of expeditable updates

All Windows LCU security updates can be expedited, and will be tagged with the `isExpeditable` property set to `true` to identify them.

It is recommended to only show the three most current updates, so the following example includes `$top=3`.

### Request

```http
GET https://graph.microsoft.com/beta/admin/windows/updates/catalog/entries?$top=3&$filter=isof('microsoft.graph.windowsUpdates.qualityUpdateCatalogEntry') and microsoft.graph.windowsUpdates.qualityUpdateCatalogEntry/isExpeditable eq true&$orderby=releaseDate desc
Content-type: application/json
```

### Response

```http
HTTP/1.1 200 OK
Content-Type: application/json

{
    "value": [
        {
            "@odata.type": "#microsoft.graph.windowsUpdates.qualityUpdateCatalogEntry",
            "id": "bd9554dc-2737-4e3c-b794-fa2b8b3f4a30",
            "displayName": "MM/DD/YYYY - YYYY.MM B Security Updates for Windows 10",
            "releaseDate": "String (timestamp)",
            "deployableUntilDateTime": null,
            "isExpeditable": true,
            "classification": "security"
        },
        {
            "@odata.type": "#microsoft.graph.windowsUpdates.qualityUpdateCatalogEntry",
            "id": "68860630-c2d0-4dd2-8c4b-9b9737ee5081",
            "displayName": "MM/DD/YYYY - YYYY.MM B Security Updates for Windows 10",
            "releaseDate": "String (timestamp)",
            "deployableUntilDateTime": null,
            "isExpeditable": true,
            "classification": "security"
        },
        {
            "@odata.type": "#microsoft.graph.windowsUpdates.qualityUpdateCatalogEntry",
            "id": "aa336b13-db33-4d94-89ea-90e43e4ad30b",
            "displayName": "MM/DD/YYYY - YYYY.MM B Security Updates for Windows 10",
            "releaseDate": "String (timestamp)",
            "deployableUntilDateTime": null,
            "isExpeditable": true,
            "classification": "security"
        }
    ]
}
```

## Step 2: Create a deployment

Create a deployment whose content specifies the target compliance date.

You can configure the reboot grace period using the property `daysUntilForcedReboot` in the deployment's user experience settings. The reboot grace period sets the amount of time after installation that the user can control the timing of the reboot. If the device has not rebooted when the grace period expires, it reboots automatically.

Expediting the latest available update (`equivalentContent` set to the default `latestSecurity`) helps keep devices as secure as possible and prevents a device from receiving an expedited update followed by another regular update just days later.

### Request

```http
POST https://graph.microsoft.com/beta/admin/windows/updates/deployments
Content-type: application/json

{
    "@odata.type": "#microsoft.graph.windowsUpdates.deployment",
    "content": {
        "@odata.type": "microsoft.graph.windowsUpdates.expeditedQualityUpdateReference",
        "releaseDate": "YYYY-MM-DD"
    },
    "settings": {
        "@odata.type": "microsoft.graph.windowsUpdates.windowsDeploymentSettings",
        "userExperience": {
            "daysUntilForcedReboot": 2
        }
    }
}
```

### Response

```http
HTTP/1.1 201 Created
Content-Type: application/json

{
    "@odata.type": "#microsoft.graph.windowsUpdates.deployment",
    "id": "b5171742-1742-b517-4217-17b5421717b5",
    "state": {
        "@odata.type": "microsoft.graph.windowsUpdates.deploymentState",
        "value": "offering",
        "reasons": [
            {
                "@odata.type": "microsoft.graph.windowsUpdates.deploymentStateReason",
                "value": "offeringByRequest"
            }
        ],
        "requestedValue": "none",
        "effectiveSinceDate": "String (timestamp)"
    },
    "content": {
        "@odata.type": "microsoft.graph.windowsUpdates.expeditedQualityUpdateReference",
        "releaseDate": "YYYY-MM-DDT00:00:00Z",
        "classification": "security",
        "equivalentContent": "latestSecurity"
    },
    "settings": {
        "@odata.type": "microsoft.graph.windowsUpdates.windowsDeploymentSettings",
        "userExperience": {
            "daysUntilForcedReboot": 2
        },
        "monitoring": null,
        "rollout": null
    },
    "createdDateTime": "String (timestamp)",
    "lastModifiedDateTime": "String (timestamp)"
}
```

## Step 3: Assign devices to the deployment audience

### Request

```http
POST https://graph.microsoft.com/beta/admin/windows/updates/deployments/{deploymentId}/audience/updateAudience
Content-type: application/json

{
    "addMembers": [
        {
            "@odata.type": "#microsoft.graph.windowsUpdates.updatableAssetGroup",
            "id": "String (identifier)"
        },
        {
            "@odata.type": "#microsoft.graph.windowsUpdates.azureADDevice",
            "id": "String (identifier)"
        },
        {
            "@odata.type": "#microsoft.graph.windowsUpdates.azureADDevice",
            "id": "String (identifier)"
        }
    ],
    "addExclusions": [
        {
            "@odata.type": "#microsoft.graph.windowsUpdates.azureADDevice",
            "id": "String (identifier)"
        }
    ]
}
```

### Response

```http
HTTP/1.1 204 No Content
```
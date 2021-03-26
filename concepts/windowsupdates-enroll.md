---
title: "Enroll in update management by the Windows Update for Business deployment service"
description: "**TODO: Add Description**"
author: "Alice-at-Microsoft"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: conceptualPageType
---

# Enroll in update management by the Windows Update for Business deployment service

[supported update categories for enrollment]

## Step 1: (Optional) Register the device with the deployment service

Devices must be registered with the service in order to be managed by the service and receive deployed updates.

Devices are automatically registered when enrolled in management by the service, but they can also be registered directly.

### Request

``` http
POST https://graph.microsoft.com/beta/admin/windows/updates/updatableAssets
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.windowsUpdates.azureADDevice",
  "id": "983f03cd-03cd-983f-cd03-3f98cd033f98"
}
```

### Response

``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.windowsUpdates.azureADDevice",
  "id": "983f03cd-03cd-983f-cd03-3f98cd033f98",
  "errors": [],
  "enrollments": []
}
```

## Step 2: Enroll the device in update management

When you enroll a device in management for a certain update category, the deployment service becomes the authority for updates of that category coming from Windows Update. As a result, device will not receive updates of that category from Windows Update until you deploy an update using the deployment service by assigning it to a deployment.

### Request

``` http
POST https://graph.microsoft.com/beta/admin/windows/updates/updatableAssets/enrollAssets
Content-Type: application/json

{
  "updateCategory": "feature",
  "assets": [
    {
      "@odata.type": "#microsoft.graph.windowsUpdates.azureADDevice",
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
  ]
}
```

### Response

``` http
HTTP/1.1 204 No Content
```

## Unenroll from management by the service or unregister from the service 

When you unenroll a device from management by the service for a given update category, the device is no longer managed by the deployment service and may start receiving other updates from Windows Update based on its policy configuration. If the device is assigned to any deployments for the given update category, it will not receive that content. The device remains registered with the service and is still enrolled and receiving content for other update categories (if applicable).

### Request

``` http
POST https://graph.microsoft.com/beta/admin/windows/updates/updatableAssets/unenrollAssets
Content-Type: application/json

{
  "updateCategory": "feature",
  "assets": [
    {
      "@odata.type": "#microsoft.graph.windowsUpdates.azureADDevice",
      "id": "String (identifier)"
    }
  ]
}
```

### Response

``` http
HTTP/1.1 204 No Content
```

You can unregister a device from the service by deleting the device object. When a device is unregistered, it is automatically unenrolled from management by the service for all update categories and removed from all deployment audiences.

### Request

``` http
DELETE https://graph.microsoft.com/beta/admin/windows/updates/updatableAssets/{azureADDeviceId}
```

### Response
``` http
HTTP/1.1 204 No Content
```


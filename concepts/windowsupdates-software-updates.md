---
title: "Software updates with the Windows Update for Business deployment service"
description: "**TODO: Add Description**"
author: "aarononeal"
localization_priority: Normal
ms.prod: "w10"
doc_type: conceptualPageType
---

# Software updates with the Windows Update for Business deployment service

Software updates are the primary type of content deployable by the service. In order to find specific updates available for deployment you will refer to entries in a catalog.

You may already be familiar with the [Microsoft Update Catalog](http://www.catalog.update.microsoft.com/) which lists software updates for Windows.

For a primer on terms you may wish to refer to a [Description of the standard terminology that is used to describe Microsoft updates](https://support.microsoft.com/en-us/help/824684/description-of-the-standard-terminology-that-is-used-to-describe-micro).

[Windows as a Service (WaaS) quick start](https://docs.microsoft.com/en-us/windows/deployment/update/waas-quick-start) provides a more specific explanation of how Windows 10 is serviced.

## Windows update categories

There are 2 high-level categories of updates in the Windows as a Service (WaaS) model:

| Catagory        | Description                                                                                                                                                                                                                                                                                                                                                                                                                                     |
|-----------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Feature updates | Feature updates are released twice per year, around March and September. As the name suggests, these will add new features to Windows 10, delivered in bite-sized chunks compared to the previous practice of Windows releases every 3-5 years.                                                                                                                                                                                                 |
| Quality updates | Quality updates deliver both security and non-security fixes. They are typically released on the second Tuesday of each month, though they can be released at any time. Quality updates include security updates, critical updates, servicing stack updates, and driver updates. Quality updates are cumulative, so installing the latest quality update is sufficient to get all the available fixes for a specific Windows 10 feature update. |

Quality updates are further classified as `security` and `non-security`. Driver management is not currently included as part of quality update support.

## Identifying updates for deployment

The updates in the **Microsoft Update Catalog** are very granular and specific to individual products, releases, and CPU architectures. The Windows Updates for Business deployment service provides its own [catalog](/graph/api/resources/windowsupdates-catalog?view=graph-rest-1.0) which simplifies decision making and approval workflows by aggregating equivalent updates together under a single catalog entry.

For example, each of these non-security quality updates is considered a different release in the **Microsoft Update Catalog** even though they differ only by architecture:

| Title                                                                                   | Products                           | Classification |
|-----------------------------------------------------------------------------------------|------------------------------------|----------------|
| 2020-03 Cumulative Update for Windows 10 Version 1909 for x64-based Systems (KB4554364) | Windows 10, version 1903 and later | Update         |
| 2020-03 Cumulative Update for Windows 10 Version 1909 for x86-based Systems (KB4554364) | Windows 10, version 1903 and later | Update         |

The catalog provided by the Windows Update for Business deployment service aggregates these togther into a single entry.

| Display name                                           | Type                                                     |
|--------------------------------------------------------|----------------------------------------------------------|
| 03/09/2020 - 2020.03 B Security Updates for Windows 10 | microsoft.graph.windowsUpdates.qualityUpdateCatalogEntry |

Besides collapsing architectures per the above into a single **Universal Update**, another simplification occurs for products. `Windows 10, version 1903 and later`, `Windows 10`, and `Windows 10 LTSB` are distinct products in the **Microsoft Update Catalog**, but all roll up into the same `Windows 10` product representation within the deployment service catalog to simplify the process of approving updates across a diverse installed base.

### Common properties

All updates in the deployment catalog have the following common properties.

| Property                | Description                                                        |
|-------------------------|--------------------------------------------------------------------|
| id                      | Unique identifier for the catalog entry                            |
| displayName             | Title of the software update                                       |
| releaseDateTime         | Date and time the update was released or refreshed                 |
| deployableUntilDateTime | Date and time until the update can no longer be deployed, if known |

### Feature updates

Feature updates in the deployment catalog are currently all for the *Windows 10* product so only a `version` field is provided.

| Property | Description                                       |
|----------|---------------------------------------------------|
| version  | Feature update version for the Windows 10 release |

For example:

| Display name                               | Version |
|--------------------------------------------|---------|
| Feature Update to Windows 10, version 20H1 | 20H1    |
| Feature Update to Windows 10, version 1909 | 1909    |
| Feature Update to Windows 10, version 1903 | 1903    |
| Feature Update to Windows 10, version 1809 | 1809    |

Once a desired version is identified it can be assigned as content to a deployment using a [featureUpdateReference](/graph/api/resources/windowsupdates-featureupdatereference?view=graph-rest-1.0) and specifying the `version` property.

### Quality updates

Quality updates are identified by a release date/time and an update classification.

The following table shows the classification rolloups between the **Microsoft Update Catalog** and deployment service catalogs.

| Deployment service catalog | Delivery catalog                                                                                                               |
|------------------|--------------------------------------------------------------------------------------------------------------------------------|
| Security         | Security Update<br>Critical Update<br>Update (if needed as a dependency)<br>Servicing Stack Update (if needed as a dependency) |
| Non-Security     | Update<br>Servicing Stack Update                                                                                               |

For `classification = nonSecurity` and `releaseDateTime = 2020-03` in the deployment catalog there might be the following entries resolved from the **Microsoft Update Catalog**:

| Title                                                                                          | Products                               | Classification |
|------------------------------------------------------------------------------------------------|----------------------------------------|----------------|
| 2020-03 Cumulative Update for Windows 10 Version 1909 for x64-based Systems (KB4554364)        | Windows 10, version 1903 and later     | Update         |
| 2020-03 Cumulative Update for Windows 10 Version 1909 for x86-based Systems (KB4554364)        | Windows 10, version 1903 and later     | Update         |
| 2020-03 Cumulative Update for Windows Server, version 1909 for ARM64-based Systems (KB4554364) | Windows Server, version 1903 and later | Update         |
| 2020-03 Cumulative Update for Windows 10 Version 1709 for x86-based Systems (KB4554342)        | Windows 10                             | Update         |

## Example

### Get catalog entries

#### Request

```http
GET https://graph.microsoft.com/beta/admin/windows/updates/catalog/entries HTTP/1.1
```

#### Response

```http
HTTP/1.1 200 OK
Content-type: application/json
Content-length: 765

{
    "value": [
        {
            "@odata.type": "#microsoft.graph.windowsUpdates.qualityUpdateCatalogEntry"
            id: <guid>
            displayName: "2020-03 Cumulative Update for Windows 10"
            releaseDateTime: "03/10/2020"
            classification: "security"
        },
        {
            ...
        }
    ]
}
```
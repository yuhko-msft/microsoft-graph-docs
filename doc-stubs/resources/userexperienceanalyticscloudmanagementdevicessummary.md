---
title: "userExperienceAnalyticsCloudManagementDevicesSummary resource type"
description: "The user experience work from anywhere Cloud management devices summary."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# userExperienceAnalyticsCloudManagementDevicesSummary resource type

Namespace: microsoft.graph



The user experience work from anywhere Cloud management devices summary.

## Properties
|Property|Type|Description|
|:---|:---|:---|
|coManagedDeviceCount|Int32|Total number of  co-managed devices.|
|intuneDeviceCount|Int32|The count of intune devices that are not autopilot registerd.|
|tenantAttachDeviceCount|Int32|Total count of tenant attach devices.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.userExperienceAnalyticsCloudManagementDevicesSummary"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.userExperienceAnalyticsCloudManagementDevicesSummary",
  "coManagedDeviceCount": "Integer",
  "intuneDeviceCount": "Integer",
  "tenantAttachDeviceCount": "Integer"
}
```


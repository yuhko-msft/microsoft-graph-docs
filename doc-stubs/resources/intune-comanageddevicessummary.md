---
title: "comanagedDevicesSummary resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# comanagedDevicesSummary resource type

Namespace: microsoft.graph

**TODO: Add Description**

## Properties
|Property|Type|Description|
|:---|:---|:---|
|compliancePolicyCount|Int32|**TODO: Add Description**|
|configurationSettingsCount|Int32|**TODO: Add Description**|
|endpointProtectionCount|Int32|**TODO: Add Description**|
|inventoryCount|Int32|**TODO: Add Description**|
|modernAppsCount|Int32|**TODO: Add Description**|
|officeAppsCount|Int32|**TODO: Add Description**|
|resourceAccessCount|Int32|**TODO: Add Description**|
|totalComanagedCount|Int32|**TODO: Add Description**|
|windowsUpdateForBusinessCount|Int32|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.comanagedDevicesSummary"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.comanagedDevicesSummary",
  "inventoryCount": "Integer",
  "compliancePolicyCount": "Integer",
  "resourceAccessCount": "Integer",
  "configurationSettingsCount": "Integer",
  "windowsUpdateForBusinessCount": "Integer",
  "endpointProtectionCount": "Integer",
  "modernAppsCount": "Integer",
  "officeAppsCount": "Integer",
  "totalComanagedCount": "Integer"
}
```


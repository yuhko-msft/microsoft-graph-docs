---
title: "comanagementEligibleDevicesSummary resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# comanagementEligibleDevicesSummary resource type

Namespace: microsoft.graph



**TODO: Add Description**

## Properties
|Property|Type|Description|
|:---|:---|:---|
|comanagedCount|Int32|Count of devices already Co-Managed|
|eligibleButNotAzureAdJoinedCount|Int32|Count of devices eligible for Co-Management but not yet joined to Azure Active Directory|
|eligibleCount|Int32|Count of devices fully eligible for Co-Management|
|ineligibleCount|Int32|Count of devices ineligible for Co-Management|
|needsOsUpdateCount|Int32|Count of devices that will be eligible for Co-Management after an OS update|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.comanagementEligibleDevicesSummary"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.comanagementEligibleDevicesSummary",
  "comanagedCount": "Integer",
  "eligibleButNotAzureAdJoinedCount": "Integer",
  "eligibleCount": "Integer",
  "ineligibleCount": "Integer",
  "needsOsUpdateCount": "Integer"
}
```


---
title: "PrintUsageSummaryByUser resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# PrintUsageSummaryByUser resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List PrintUsageSummaryByUsers](../api/printusagesummarybyuser-list.md)|[PrintUsageSummaryByUser](../resources/printusagesummarybyuser.md) collection|Get a list of the [PrintUsageSummaryByUser](../resources/printusagesummarybyuser.md) objects and their properties.|
|[Create PrintUsageSummaryByUser](../api/printusagesummarybyuser-create.md)|[PrintUsageSummaryByUser](../resources/printusagesummarybyuser.md)|Create a new [PrintUsageSummaryByUser](../resources/printusagesummarybyuser.md) object.|
|[Get PrintUsageSummaryByUser](../api/printusagesummarybyuser-get.md)|[PrintUsageSummaryByUser](../resources/printusagesummarybyuser.md)|Read the properties and relationships of a [PrintUsageSummaryByUser](../resources/printusagesummarybyuser.md) object.|
|[Update PrintUsageSummaryByUser](../api/printusagesummarybyuser-update.md)|[PrintUsageSummaryByUser](../resources/printusagesummarybyuser.md)|Update the properties of a [PrintUsageSummaryByUser](../resources/printusagesummarybyuser.md) object.|
|[Delete PrintUsageSummaryByUser](../api/printusagesummarybyuser-delete.md)|None|Deletes a [PrintUsageSummaryByUser](../resources/printusagesummarybyuser.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|completedBlackAndWhiteJobCount|Int64|**TODO: Add Description**|
|completedColorJobCount|Int64|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|incompleteJobCount|Int64|**TODO: Add Description**|
|usageDate|Date|**TODO: Add Description**|
|userPrincipalName|String|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.PrintUsageSummaryByUser",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.PrintUsageSummaryByUser",
  "id": "String (identifier)",
  "userPrincipalName": "String",
  "usageDate": "Date",
  "completedBlackAndWhiteJobCount": "Integer",
  "completedColorJobCount": "Integer",
  "incompleteJobCount": "Integer"
}
```


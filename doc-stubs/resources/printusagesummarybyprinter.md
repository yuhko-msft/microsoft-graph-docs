---
title: "PrintUsageSummaryByPrinter resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# PrintUsageSummaryByPrinter resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List PrintUsageSummaryByPrinters](../api/printusagesummarybyprinter-list.md)|[PrintUsageSummaryByPrinter](../resources/printusagesummarybyprinter.md) collection|Get a list of the [PrintUsageSummaryByPrinter](../resources/printusagesummarybyprinter.md) objects and their properties.|
|[Create PrintUsageSummaryByPrinter](../api/printusagesummarybyprinter-create.md)|[PrintUsageSummaryByPrinter](../resources/printusagesummarybyprinter.md)|Create a new [PrintUsageSummaryByPrinter](../resources/printusagesummarybyprinter.md) object.|
|[Get PrintUsageSummaryByPrinter](../api/printusagesummarybyprinter-get.md)|[PrintUsageSummaryByPrinter](../resources/printusagesummarybyprinter.md)|Read the properties and relationships of a [PrintUsageSummaryByPrinter](../resources/printusagesummarybyprinter.md) object.|
|[Update PrintUsageSummaryByPrinter](../api/printusagesummarybyprinter-update.md)|[PrintUsageSummaryByPrinter](../resources/printusagesummarybyprinter.md)|Update the properties of a [PrintUsageSummaryByPrinter](../resources/printusagesummarybyprinter.md) object.|
|[Delete PrintUsageSummaryByPrinter](../api/printusagesummarybyprinter-delete.md)|None|Deletes a [PrintUsageSummaryByPrinter](../resources/printusagesummarybyprinter.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|completedBlackAndWhiteJobCount|Int64|**TODO: Add Description**|
|completedColorJobCount|Int64|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|incompleteJobCount|Int64|**TODO: Add Description**|
|printerId|String|**TODO: Add Description**|
|usageDate|Date|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.PrintUsageSummaryByPrinter",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.PrintUsageSummaryByPrinter",
  "id": "String (identifier)",
  "printerId": "String",
  "usageDate": "Date",
  "completedBlackAndWhiteJobCount": "Integer",
  "completedColorJobCount": "Integer",
  "incompleteJobCount": "Integer"
}
```


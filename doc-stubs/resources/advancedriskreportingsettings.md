---
title: "advancedRiskReportingSettings resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# advancedRiskReportingSettings resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List advancedRiskReportingSettings](../api/advancedriskreportingsettings-list.md)|[advancedRiskReportingSettings](../resources/advancedriskreportingsettings.md) collection|Get a list of the [advancedRiskReportingSettings](../resources/advancedriskreportingsettings.md) objects and their properties.|
|[Create advancedRiskReportingSettings](../api/advancedriskreportingsettings-create.md)|[advancedRiskReportingSettings](../resources/advancedriskreportingsettings.md)|Create a new [advancedRiskReportingSettings](../resources/advancedriskreportingsettings.md) object.|
|[Get advancedRiskReportingSettings](../api/advancedriskreportingsettings-get.md)|[advancedRiskReportingSettings](../resources/advancedriskreportingsettings.md)|Read the properties and relationships of an [advancedRiskReportingSettings](../resources/advancedriskreportingsettings.md) object.|
|[Update advancedRiskReportingSettings](../api/advancedriskreportingsettings-update.md)|[advancedRiskReportingSettings](../resources/advancedriskreportingsettings.md)|Update the properties of an [advancedRiskReportingSettings](../resources/advancedriskreportingsettings.md) object.|
|[Delete advancedRiskReportingSettings](../api/advancedriskreportingsettings-delete.md)|None|Deletes an [advancedRiskReportingSettings](../resources/advancedriskreportingsettings.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|enabledFor|[directoryObjectsSelection](../resources/directoryobjectsselection.md)|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.advancedRiskReportingSettings",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.advancedRiskReportingSettings",
  "enabledFor": {
    "@odata.type": "microsoft.graph.directoryObjectsSelection"
  }
}
```


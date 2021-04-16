---
title: "macOSSoftwareUpdateCategorySummary resource type"
description: "MacOS software update category summary report for a device and user"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# macOSSoftwareUpdateCategorySummary resource type

Namespace: microsoft.graph



MacOS software update category summary report for a device and user


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List macOSSoftwareUpdateCategorySummaries](../api/macossoftwareupdatecategorysummary-list.md)|[macOSSoftwareUpdateCategorySummary](../resources/macossoftwareupdatecategorysummary.md) collection|Get a list of the [macOSSoftwareUpdateCategorySummary](../resources/macossoftwareupdatecategorysummary.md) objects and their properties.|
|[Create macOSSoftwareUpdateCategorySummary](../api/macossoftwareupdatecategorysummary-create.md)|[macOSSoftwareUpdateCategorySummary](../resources/macossoftwareupdatecategorysummary.md)|Create a new [macOSSoftwareUpdateCategorySummary](../resources/macossoftwareupdatecategorysummary.md) object.|
|[Get macOSSoftwareUpdateCategorySummary](../api/macossoftwareupdatecategorysummary-get.md)|[macOSSoftwareUpdateCategorySummary](../resources/macossoftwareupdatecategorysummary.md)|Read the properties and relationships of a [macOSSoftwareUpdateCategorySummary](../resources/macossoftwareupdatecategorysummary.md) object.|
|[Update macOSSoftwareUpdateCategorySummary](../api/macossoftwareupdatecategorysummary-update.md)|[macOSSoftwareUpdateCategorySummary](../resources/macossoftwareupdatecategorysummary.md)|Update the properties of a [macOSSoftwareUpdateCategorySummary](../resources/macossoftwareupdatecategorysummary.md) object.|
|[Delete macOSSoftwareUpdateCategorySummary](../api/macossoftwareupdatecategorysummary-delete.md)|None|Deletes a [macOSSoftwareUpdateCategorySummary](../resources/macossoftwareupdatecategorysummary.md) object.|
|[List updateStateSummaries](../api/macossoftwareupdatecategorysummary-list-updatestatesummaries.md)|[macOSSoftwareUpdateStateSummary](../resources/macossoftwareupdatestatesummary.md) collection|Get the macOSSoftwareUpdateStateSummary resources from the updateStateSummaries navigation property.|
|[Create macOSSoftwareUpdateStateSummary](../api/macossoftwareupdatecategorysummary-post-updatestatesummaries.md)|[macOSSoftwareUpdateStateSummary](../resources/macossoftwareupdatestatesummary.md)|Create a new macOSSoftwareUpdateStateSummary object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|deviceId|String|The device ID.|
|displayName|String|The name of the report|
|failedUpdateCount|Int32|Number of failed updates on the device|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastUpdatedDateTime|DateTimeOffset|Last date time the report for this device was updated.|
|successfulUpdateCount|Int32|Number of successful updates on the device|
|totalUpdateCount|Int32|Number of total updates on the device|
|updateCategory|macOSSoftwareUpdateCategory|Software update type. Possible values are: `critical`, `configurationDataFile`, `firmware`, `other`.|
|userId|String|The user ID.|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|updateStateSummaries|[macOSSoftwareUpdateStateSummary](../resources/macossoftwareupdatestatesummary.md) collection|Summary of the update states.|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.macOSSoftwareUpdateCategorySummary",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.macOSSoftwareUpdateCategorySummary",
  "id": "String (identifier)",
  "deviceId": "String",
  "displayName": "String",
  "failedUpdateCount": "Integer",
  "lastUpdatedDateTime": "String (timestamp)",
  "successfulUpdateCount": "Integer",
  "totalUpdateCount": "Integer",
  "updateCategory": "String",
  "userId": "String"
}
```


---
title: "macOSSoftwareUpdateStateSummary resource type"
description: "MacOS software update state summary for a device and user"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# macOSSoftwareUpdateStateSummary resource type

Namespace: microsoft.graph



MacOS software update state summary for a device and user


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List macOSSoftwareUpdateStateSummaries](../api/macossoftwareupdatestatesummary-list.md)|[macOSSoftwareUpdateStateSummary](../resources/macossoftwareupdatestatesummary.md) collection|Get a list of the [macOSSoftwareUpdateStateSummary](../resources/macossoftwareupdatestatesummary.md) objects and their properties.|
|[Create macOSSoftwareUpdateStateSummary](../api/macossoftwareupdatestatesummary-create.md)|[macOSSoftwareUpdateStateSummary](../resources/macossoftwareupdatestatesummary.md)|Create a new [macOSSoftwareUpdateStateSummary](../resources/macossoftwareupdatestatesummary.md) object.|
|[Get macOSSoftwareUpdateStateSummary](../api/macossoftwareupdatestatesummary-get.md)|[macOSSoftwareUpdateStateSummary](../resources/macossoftwareupdatestatesummary.md)|Read the properties and relationships of a [macOSSoftwareUpdateStateSummary](../resources/macossoftwareupdatestatesummary.md) object.|
|[Update macOSSoftwareUpdateStateSummary](../api/macossoftwareupdatestatesummary-update.md)|[macOSSoftwareUpdateStateSummary](../resources/macossoftwareupdatestatesummary.md)|Update the properties of a [macOSSoftwareUpdateStateSummary](../resources/macossoftwareupdatestatesummary.md) object.|
|[Delete macOSSoftwareUpdateStateSummary](../api/macossoftwareupdatestatesummary-delete.md)|None|Deletes a [macOSSoftwareUpdateStateSummary](../resources/macossoftwareupdatestatesummary.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|displayName|String|Human readable name of the software update|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastUpdatedDateTime|DateTimeOffset|Last date time the report for this device and product key was updated.|
|productKey|String|Product key of the software update.|
|state|macOSSoftwareUpdateState|State of the software update. Possible values are: `success`, `downloading`, `downloaded`, `installing`, `idle`, `available`, `scheduled`, `downloadFailed`, `downloadInsufficientSpace`, `downloadInsufficientPower`, `downloadInsufficientNetwork`, `installInsufficientSpace`, `installInsufficientPower`, `installFailed`, `commandFailed`.|
|updateCategory|macOSSoftwareUpdateCategory|Software update category. Possible values are: `critical`, `configurationDataFile`, `firmware`, `other`.|
|updateVersion|String|Version of the software update|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.macOSSoftwareUpdateStateSummary",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.macOSSoftwareUpdateStateSummary",
  "id": "String (identifier)",
  "displayName": "String",
  "lastUpdatedDateTime": "String (timestamp)",
  "productKey": "String",
  "state": "String",
  "updateCategory": "String",
  "updateVersion": "String"
}
```


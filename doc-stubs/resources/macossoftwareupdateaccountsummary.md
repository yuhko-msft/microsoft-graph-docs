---
title: "macOSSoftwareUpdateAccountSummary resource type"
description: "MacOS software update account summary report for a device and user"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# macOSSoftwareUpdateAccountSummary resource type

Namespace: microsoft.graph



MacOS software update account summary report for a device and user


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List macOSSoftwareUpdateAccountSummaries](../api/macossoftwareupdateaccountsummary-list.md)|[macOSSoftwareUpdateAccountSummary](../resources/macossoftwareupdateaccountsummary.md) collection|Get a list of the [macOSSoftwareUpdateAccountSummary](../resources/macossoftwareupdateaccountsummary.md) objects and their properties.|
|[Create macOSSoftwareUpdateAccountSummary](../api/macossoftwareupdateaccountsummary-create.md)|[macOSSoftwareUpdateAccountSummary](../resources/macossoftwareupdateaccountsummary.md)|Create a new [macOSSoftwareUpdateAccountSummary](../resources/macossoftwareupdateaccountsummary.md) object.|
|[Get macOSSoftwareUpdateAccountSummary](../api/macossoftwareupdateaccountsummary-get.md)|[macOSSoftwareUpdateAccountSummary](../resources/macossoftwareupdateaccountsummary.md)|Read the properties and relationships of a [macOSSoftwareUpdateAccountSummary](../resources/macossoftwareupdateaccountsummary.md) object.|
|[Update macOSSoftwareUpdateAccountSummary](../api/macossoftwareupdateaccountsummary-update.md)|[macOSSoftwareUpdateAccountSummary](../resources/macossoftwareupdateaccountsummary.md)|Update the properties of a [macOSSoftwareUpdateAccountSummary](../resources/macossoftwareupdateaccountsummary.md) object.|
|[Delete macOSSoftwareUpdateAccountSummary](../api/macossoftwareupdateaccountsummary-delete.md)|None|Deletes a [macOSSoftwareUpdateAccountSummary](../resources/macossoftwareupdateaccountsummary.md) object.|
|[List categorySummaries](../api/macossoftwareupdateaccountsummary-list-categorysummaries.md)|[macOSSoftwareUpdateCategorySummary](../resources/macossoftwareupdatecategorysummary.md) collection|Get the macOSSoftwareUpdateCategorySummary resources from the categorySummaries navigation property.|
|[Create macOSSoftwareUpdateCategorySummary](../api/macossoftwareupdateaccountsummary-post-categorysummaries.md)|[macOSSoftwareUpdateCategorySummary](../resources/macossoftwareupdatecategorysummary.md)|Create a new macOSSoftwareUpdateCategorySummary object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|deviceId|String|The device ID.|
|deviceName|String|The device name.|
|displayName|String|The name of the report|
|failedUpdateCount|Int32|Number of failed updates on the device.|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastUpdatedDateTime|DateTimeOffset|Last date time the report for this device was updated.|
|osVersion|String|The OS version.|
|successfulUpdateCount|Int32|Number of successful updates on the device.|
|totalUpdateCount|Int32|Number of total updates on the device.|
|userId|String|The user ID.|
|userPrincipalName|String|The user principal name|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|categorySummaries|[macOSSoftwareUpdateCategorySummary](../resources/macossoftwareupdatecategorysummary.md) collection|Summary of the updates by category.|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.macOSSoftwareUpdateAccountSummary",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.macOSSoftwareUpdateAccountSummary",
  "id": "String (identifier)",
  "deviceId": "String",
  "deviceName": "String",
  "displayName": "String",
  "failedUpdateCount": "Integer",
  "lastUpdatedDateTime": "String (timestamp)",
  "osVersion": "String",
  "successfulUpdateCount": "Integer",
  "totalUpdateCount": "Integer",
  "userId": "String",
  "userPrincipalName": "String"
}
```


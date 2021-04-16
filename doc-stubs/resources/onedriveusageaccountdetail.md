---
title: "oneDriveUsageAccountDetail resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# oneDriveUsageAccountDetail resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List oneDriveUsageAccountDetails](../api/onedriveusageaccountdetail-list.md)|[oneDriveUsageAccountDetail](../resources/onedriveusageaccountdetail.md) collection|Get a list of the [oneDriveUsageAccountDetail](../resources/onedriveusageaccountdetail.md) objects and their properties.|
|[Create oneDriveUsageAccountDetail](../api/onedriveusageaccountdetail-create.md)|[oneDriveUsageAccountDetail](../resources/onedriveusageaccountdetail.md)|Create a new [oneDriveUsageAccountDetail](../resources/onedriveusageaccountdetail.md) object.|
|[Get oneDriveUsageAccountDetail](../api/onedriveusageaccountdetail-get.md)|[oneDriveUsageAccountDetail](../resources/onedriveusageaccountdetail.md)|Read the properties and relationships of an [oneDriveUsageAccountDetail](../resources/onedriveusageaccountdetail.md) object.|
|[Update oneDriveUsageAccountDetail](../api/onedriveusageaccountdetail-update.md)|[oneDriveUsageAccountDetail](../resources/onedriveusageaccountdetail.md)|Update the properties of an [oneDriveUsageAccountDetail](../resources/onedriveusageaccountdetail.md) object.|
|[Delete oneDriveUsageAccountDetail](../api/onedriveusageaccountdetail-delete.md)|None|Deletes an [oneDriveUsageAccountDetail](../resources/onedriveusageaccountdetail.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|activeFileCount|Int64|**TODO: Add Description**|
|fileCount|Int64|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|isDeleted|Boolean|**TODO: Add Description**|
|lastActivityDate|Date|**TODO: Add Description**|
|ownerDisplayName|String|**TODO: Add Description**|
|ownerPrincipalName|String|**TODO: Add Description**|
|reportPeriod|String|**TODO: Add Description**|
|reportRefreshDate|Date|**TODO: Add Description**|
|siteUrl|String|**TODO: Add Description**|
|storageAllocatedInBytes|Int64|**TODO: Add Description**|
|storageUsedInBytes|Int64|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.oneDriveUsageAccountDetail",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.oneDriveUsageAccountDetail",
  "id": "String (identifier)",
  "activeFileCount": "Integer",
  "fileCount": "Integer",
  "isDeleted": "Boolean",
  "lastActivityDate": "Date",
  "ownerDisplayName": "String",
  "ownerPrincipalName": "String",
  "reportPeriod": "String",
  "reportRefreshDate": "Date",
  "siteUrl": "String",
  "storageAllocatedInBytes": "Integer",
  "storageUsedInBytes": "Integer"
}
```


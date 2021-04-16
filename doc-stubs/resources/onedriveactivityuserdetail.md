---
title: "oneDriveActivityUserDetail resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# oneDriveActivityUserDetail resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List oneDriveActivityUserDetails](../api/onedriveactivityuserdetail-list.md)|[oneDriveActivityUserDetail](../resources/onedriveactivityuserdetail.md) collection|Get a list of the [oneDriveActivityUserDetail](../resources/onedriveactivityuserdetail.md) objects and their properties.|
|[Create oneDriveActivityUserDetail](../api/onedriveactivityuserdetail-create.md)|[oneDriveActivityUserDetail](../resources/onedriveactivityuserdetail.md)|Create a new [oneDriveActivityUserDetail](../resources/onedriveactivityuserdetail.md) object.|
|[Get oneDriveActivityUserDetail](../api/onedriveactivityuserdetail-get.md)|[oneDriveActivityUserDetail](../resources/onedriveactivityuserdetail.md)|Read the properties and relationships of an [oneDriveActivityUserDetail](../resources/onedriveactivityuserdetail.md) object.|
|[Update oneDriveActivityUserDetail](../api/onedriveactivityuserdetail-update.md)|[oneDriveActivityUserDetail](../resources/onedriveactivityuserdetail.md)|Update the properties of an [oneDriveActivityUserDetail](../resources/onedriveactivityuserdetail.md) object.|
|[Delete oneDriveActivityUserDetail](../api/onedriveactivityuserdetail-delete.md)|None|Deletes an [oneDriveActivityUserDetail](../resources/onedriveactivityuserdetail.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|assignedProducts|String collection|**TODO: Add Description**|
|deletedDate|Date|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|isDeleted|Boolean|**TODO: Add Description**|
|lastActivityDate|Date|**TODO: Add Description**|
|reportPeriod|String|**TODO: Add Description**|
|reportRefreshDate|Date|**TODO: Add Description**|
|sharedExternallyFileCount|Int64|**TODO: Add Description**|
|sharedInternallyFileCount|Int64|**TODO: Add Description**|
|syncedFileCount|Int64|**TODO: Add Description**|
|userPrincipalName|String|**TODO: Add Description**|
|viewedOrEditedFileCount|Int64|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.oneDriveActivityUserDetail",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.oneDriveActivityUserDetail",
  "id": "String (identifier)",
  "assignedProducts": [
    "String"
  ],
  "deletedDate": "Date",
  "isDeleted": "Boolean",
  "lastActivityDate": "Date",
  "reportPeriod": "String",
  "reportRefreshDate": "Date",
  "sharedExternallyFileCount": "Integer",
  "sharedInternallyFileCount": "Integer",
  "syncedFileCount": "Integer",
  "userPrincipalName": "String",
  "viewedOrEditedFileCount": "Integer"
}
```


---
title: "sharePointActivityUserDetail resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# sharePointActivityUserDetail resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List sharePointActivityUserDetails](../api/sharepointactivityuserdetail-list.md)|[sharePointActivityUserDetail](../resources/sharepointactivityuserdetail.md) collection|Get a list of the [sharePointActivityUserDetail](../resources/sharepointactivityuserdetail.md) objects and their properties.|
|[Create sharePointActivityUserDetail](../api/sharepointactivityuserdetail-create.md)|[sharePointActivityUserDetail](../resources/sharepointactivityuserdetail.md)|Create a new [sharePointActivityUserDetail](../resources/sharepointactivityuserdetail.md) object.|
|[Get sharePointActivityUserDetail](../api/sharepointactivityuserdetail-get.md)|[sharePointActivityUserDetail](../resources/sharepointactivityuserdetail.md)|Read the properties and relationships of a [sharePointActivityUserDetail](../resources/sharepointactivityuserdetail.md) object.|
|[Update sharePointActivityUserDetail](../api/sharepointactivityuserdetail-update.md)|[sharePointActivityUserDetail](../resources/sharepointactivityuserdetail.md)|Update the properties of a [sharePointActivityUserDetail](../resources/sharepointactivityuserdetail.md) object.|
|[Delete sharePointActivityUserDetail](../api/sharepointactivityuserdetail-delete.md)|None|Deletes a [sharePointActivityUserDetail](../resources/sharepointactivityuserdetail.md) object.|

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
|visitedPageCount|Int64|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.sharePointActivityUserDetail",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.sharePointActivityUserDetail",
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
  "viewedOrEditedFileCount": "Integer",
  "visitedPageCount": "Integer"
}
```


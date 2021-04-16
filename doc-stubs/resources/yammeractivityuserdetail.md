---
title: "yammerActivityUserDetail resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# yammerActivityUserDetail resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List yammerActivityUserDetails](../api/yammeractivityuserdetail-list.md)|[yammerActivityUserDetail](../resources/yammeractivityuserdetail.md) collection|Get a list of the [yammerActivityUserDetail](../resources/yammeractivityuserdetail.md) objects and their properties.|
|[Create yammerActivityUserDetail](../api/yammeractivityuserdetail-create.md)|[yammerActivityUserDetail](../resources/yammeractivityuserdetail.md)|Create a new [yammerActivityUserDetail](../resources/yammeractivityuserdetail.md) object.|
|[Get yammerActivityUserDetail](../api/yammeractivityuserdetail-get.md)|[yammerActivityUserDetail](../resources/yammeractivityuserdetail.md)|Read the properties and relationships of a [yammerActivityUserDetail](../resources/yammeractivityuserdetail.md) object.|
|[Update yammerActivityUserDetail](../api/yammeractivityuserdetail-update.md)|[yammerActivityUserDetail](../resources/yammeractivityuserdetail.md)|Update the properties of a [yammerActivityUserDetail](../resources/yammeractivityuserdetail.md) object.|
|[Delete yammerActivityUserDetail](../api/yammeractivityuserdetail-delete.md)|None|Deletes a [yammerActivityUserDetail](../resources/yammeractivityuserdetail.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|assignedProducts|String collection|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastActivityDate|Date|**TODO: Add Description**|
|likedCount|Int64|**TODO: Add Description**|
|postedCount|Int64|**TODO: Add Description**|
|readCount|Int64|**TODO: Add Description**|
|reportPeriod|String|**TODO: Add Description**|
|reportRefreshDate|Date|**TODO: Add Description**|
|stateChangeDate|Date|**TODO: Add Description**|
|userPrincipalName|String|**TODO: Add Description**|
|userState|String|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.yammerActivityUserDetail",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.yammerActivityUserDetail",
  "id": "String (identifier)",
  "assignedProducts": [
    "String"
  ],
  "displayName": "String",
  "lastActivityDate": "Date",
  "likedCount": "Integer",
  "postedCount": "Integer",
  "readCount": "Integer",
  "reportPeriod": "String",
  "reportRefreshDate": "Date",
  "stateChangeDate": "Date",
  "userPrincipalName": "String",
  "userState": "String"
}
```


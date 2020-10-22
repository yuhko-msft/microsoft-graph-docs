---
title: "emailActivityUserDetail resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# emailActivityUserDetail resource type

Namespace: microsoft.graph

**TODO: Add Description**

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List emailActivityUserDetails](../api/emailactivityuserdetail-list.md)|[emailActivityUserDetail](../resources/emailactivityuserdetail.md) collection|Get a list of the [emailActivityUserDetail](../resources/emailactivityuserdetail.md) objects and their properties.|
|[Create emailActivityUserDetail](../api/emailactivityuserdetail-create.md)|[emailActivityUserDetail](../resources/emailactivityuserdetail.md)|Create a new [emailActivityUserDetail](../resources/emailactivityuserdetail.md) object.|
|[Get emailActivityUserDetail](../api/emailactivityuserdetail-get.md)|[emailActivityUserDetail](../resources/emailactivityuserdetail.md)|Read the properties and relationships of an [emailActivityUserDetail](../resources/emailactivityuserdetail.md) object.|
|[Update emailActivityUserDetail](../api/emailactivityuserdetail-update.md)|[emailActivityUserDetail](../resources/emailactivityuserdetail.md)|Update the properties of an [emailActivityUserDetail](../resources/emailactivityuserdetail.md) object.|
|[Delete emailActivityUserDetail](../api/emailactivityuserdetail-delete.md)|None|Deletes an [emailActivityUserDetail](../resources/emailactivityuserdetail.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|assignedProducts|String collection|**TODO: Add Description**|
|deletedDate|Date|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|isDeleted|Boolean|**TODO: Add Description**|
|lastActivityDate|Date|**TODO: Add Description**|
|readCount|Int64|**TODO: Add Description**|
|receiveCount|Int64|**TODO: Add Description**|
|reportPeriod|String|**TODO: Add Description**|
|reportRefreshDate|Date|**TODO: Add Description**|
|sendCount|Int64|**TODO: Add Description**|
|userPrincipalName|String|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.emailActivityUserDetail",
  "baseType": "",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.emailActivityUserDetail",
  "reportRefreshDate": "Date",
  "userPrincipalName": "String",
  "displayName": "String",
  "isDeleted": "Boolean",
  "deletedDate": "Date",
  "lastActivityDate": "Date",
  "sendCount": "Integer",
  "receiveCount": "Integer",
  "readCount": "Integer",
  "assignedProducts": [
    "String"
  ],
  "reportPeriod": "String"
}
```


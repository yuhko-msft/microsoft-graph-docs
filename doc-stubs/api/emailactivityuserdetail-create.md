---
title: "Create emailActivityUserDetail"
description: "Create a new emailActivityUserDetail object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create emailActivityUserDetail
Namespace: microsoft.graph

Create a new [emailActivityUserDetail](../resources/emailactivityuserdetail.md) object.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from most to least privileged)|
|:---|:---|
|Delegated (work or school account)|**TODO: Provide applicable permissions.**|
|Delegated (personal Microsoft account)|**TODO: Provide applicable permissions.**|
|Application|**TODO: Provide applicable permissions.**|

## HTTP request

<!-- {
  "blockType": "ignored"
}
-->
``` http
POST ** Collection URI for microsoft.graph.emailActivityUserDetail not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [emailActivityUserDetail](../resources/emailactivityuserdetail.md) object.

The following table shows the properties that are required when you create the [emailActivityUserDetail](../resources/emailactivityuserdetail.md).

|Property|Type|Description|
|:---|:---|:---|
|reportRefreshDate|Date|**TODO: Add Description**|
|userPrincipalName|String|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|isDeleted|Boolean|**TODO: Add Description**|
|deletedDate|Date|**TODO: Add Description**|
|lastActivityDate|Date|**TODO: Add Description**|
|sendCount|Int64|**TODO: Add Description**|
|receiveCount|Int64|**TODO: Add Description**|
|readCount|Int64|**TODO: Add Description**|
|assignedProducts|String collection|**TODO: Add Description**|
|reportPeriod|String|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and an [emailActivityUserDetail](../resources/emailactivityuserdetail.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_emailactivityuserdetail_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta** Collection URI for microsoft.graph.emailActivityUserDetail not found
Content-Type: application/json
Content-length: 401

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


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.emailActivityUserDetail"
}
-->
``` http
HTTP/1.1 201 Created

Content-Type: application/json
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


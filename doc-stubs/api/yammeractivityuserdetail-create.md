---
title: "Create yammerActivityUserDetail"
description: "Create a new yammerActivityUserDetail object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create yammerActivityUserDetail
Namespace: microsoft.graph



Create a new [yammerActivityUserDetail](../resources/yammeractivityuserdetail.md) object.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from least to most privileged)|
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
POST ** Collection URI for microsoft.graph.yammerActivityUserDetail not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [yammerActivityUserDetail](../resources/yammeractivityuserdetail.md) object.

The following table shows the properties that are required when you create the [yammerActivityUserDetail](../resources/yammeractivityuserdetail.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|assignedProducts|String collection|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|lastActivityDate|Date|**TODO: Add Description**|
|likedCount|Int64|**TODO: Add Description**|
|postedCount|Int64|**TODO: Add Description**|
|readCount|Int64|**TODO: Add Description**|
|reportPeriod|String|**TODO: Add Description**|
|reportRefreshDate|Date|**TODO: Add Description**|
|stateChangeDate|Date|**TODO: Add Description**|
|userPrincipalName|String|**TODO: Add Description**|
|userState|String|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and a [yammerActivityUserDetail](../resources/yammeractivityuserdetail.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_yammeractivityuserdetail_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0** Collection URI for microsoft.graph.yammerActivityUserDetail not found
Content-Type: application/json
Content-length: 405

{
  "@odata.type": "#microsoft.graph.yammerActivityUserDetail",
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


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.yammerActivityUserDetail"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.yammerActivityUserDetail",
  "id": "e5f88e24-8e24-e5f8-248e-f8e5248ef8e5",
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


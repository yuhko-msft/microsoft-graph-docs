---
title: "Update yammerActivityUserDetail"
description: "Update the properties of a yammerActivityUserDetail object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update yammerActivityUserDetail
Namespace: microsoft.graph



Update the properties of a [yammerActivityUserDetail](../resources/yammeractivityuserdetail.md) object.

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
PATCH /yammerActivityUserDetail
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [yammerActivityUserDetail](../resources/yammeractivityuserdetail.md) object.

The following table shows the properties that are required when you update the [yammerActivityUserDetail](../resources/yammeractivityuserdetail.md).

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

If successful, this method returns a `200 OK` response code and an updated [yammerActivityUserDetail](../resources/yammeractivityuserdetail.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_yammeractivityuserdetail"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/yammerActivityUserDetail
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
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK
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


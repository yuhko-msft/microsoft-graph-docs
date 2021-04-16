---
title: "Get yammerGroupsActivityDetail"
description: "Read the properties and relationships of a yammerGroupsActivityDetail object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get yammerGroupsActivityDetail
Namespace: microsoft.graph



Read the properties and relationships of a [yammerGroupsActivityDetail](../resources/yammergroupsactivitydetail.md) object.

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
GET /yammerGroupsActivityDetail
```

## Optional query parameters
This method supports some of the OData query parameters to help customize the response. For general information, see [OData query parameters](/graph/query-parameters).

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|

## Request body
Do not supply a request body for this method.

## Response

If successful, this method returns a `200 OK` response code and a [yammerGroupsActivityDetail](../resources/yammergroupsactivitydetail.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_yammergroupsactivitydetail"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/yammerGroupsActivityDetail
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.yammerGroupsActivityDetail"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.yammerGroupsActivityDetail",
    "id": "04e661a4-61a4-04e6-a461-e604a461e604",
    "groupDisplayName": "String",
    "groupType": "String",
    "isDeleted": "Boolean",
    "lastActivityDate": "Date",
    "likedCount": "Integer",
    "memberCount": "Integer",
    "networkDisplayName": "String",
    "office365Connected": "Boolean",
    "ownerPrincipalName": "String",
    "postedCount": "Integer",
    "readCount": "Integer",
    "reportPeriod": "String",
    "reportRefreshDate": "Date"
  }
}
```


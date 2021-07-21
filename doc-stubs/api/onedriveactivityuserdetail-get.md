---
title: "Get oneDriveActivityUserDetail"
description: "Read the properties and relationships of an oneDriveActivityUserDetail object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get oneDriveActivityUserDetail
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Read the properties and relationships of an [oneDriveActivityUserDetail](../resources/onedriveactivityuserdetail.md) object.

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
GET /oneDriveActivityUserDetail
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

If successful, this method returns a `200 OK` response code and an [oneDriveActivityUserDetail](../resources/onedriveactivityuserdetail.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_onedriveactivityuserdetail"
}
-->
``` http
GET https://graph.microsoft.com/beta/oneDriveActivityUserDetail
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.oneDriveActivityUserDetail"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.oneDriveActivityUserDetail",
    "id": "d783b286-b286-d783-86b2-83d786b283d7",
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
}
```


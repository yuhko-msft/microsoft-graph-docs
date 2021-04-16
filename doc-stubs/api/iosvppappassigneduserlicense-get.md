---
title: "Get iosVppAppAssignedUserLicense"
description: "Read the properties and relationships of an iosVppAppAssignedUserLicense object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get iosVppAppAssignedUserLicense
Namespace: microsoft.graph



Read the properties and relationships of an [iosVppAppAssignedUserLicense](../resources/iosvppappassigneduserlicense.md) object.

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
GET /iosVppAppAssignedUserLicense
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

If successful, this method returns a `200 OK` response code and an [iosVppAppAssignedUserLicense](../resources/iosvppappassigneduserlicense.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_iosvppappassigneduserlicense"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/iosVppAppAssignedUserLicense
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.iosVppAppAssignedUserLicense"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.iosVppAppAssignedUserLicense",
    "id": "c170228a-228a-c170-8a22-70c18a2270c1",
    "userEmailAddress": "String",
    "userId": "String",
    "userName": "String",
    "userPrincipalName": "String"
  }
}
```


---
title: "Get request"
description: "Read the properties and relationships of a request object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get request
Namespace: microsoft.graph



Read the properties and relationships of a [request](../resources/request.md) object.

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
GET /me/appConsentRequestsForApproval/{appConsentRequestId}/userConsentRequests/{userConsentRequestId}/approval/request
GET /users/{usersId}/appConsentRequestsForApproval/{appConsentRequestId}/userConsentRequests/{userConsentRequestId}/approval/request
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

If successful, this method returns a `200 OK` response code and a [request](../resources/request.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_request"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/me/appConsentRequestsForApproval/{appConsentRequestId}/userConsentRequests/{userConsentRequestId}/approval/request
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.request"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.request",
    "id": "b79ba5b1-a5b1-b79b-b1a5-9bb7b1a59bb7",
    "approvalId": "String",
    "completedDateTime": "String (timestamp)",
    "createdBy": {
      "@odata.type": "microsoft.graph.identitySet"
    },
    "createdDateTime": "String (timestamp)",
    "customData": "String",
    "status": "String"
  }
}
```


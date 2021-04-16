---
title: "Add request"
description: "Add request by posting to the request collection."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Add request
Namespace: microsoft.graph



Add request by posting to the request collection.

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
POST /users/{usersId}/appConsentRequestsForApproval/{appConsentRequestId}/userConsentRequests/{userConsentRequestId}/approval/request/$ref
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [request](../resources/request.md) object.

The following table shows the properties that are required when you create the [request](../resources/request.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|approvalId|String|**TODO: Add Description**|
|completedDateTime|DateTimeOffset|**TODO: Add Description**|
|createdBy|[identitySet](../resources/identityset.md)|**TODO: Add Description**|
|createdDateTime|DateTimeOffset|**TODO: Add Description**|
|customData|String|**TODO: Add Description**|
|status|String|**TODO: Add Description**|



## Response

If successful, this method returns a `204 No Content` response code and a [request](../resources/request.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_request_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/users/{usersId}/appConsentRequestsForApproval/{appConsentRequestId}/userConsentRequests/{userConsentRequestId}/approval/request/$ref
Content-Type: application/json
Content-length: 246

{
  "@odata.type": "#microsoft.graph.request",
  "approvalId": "String",
  "completedDateTime": "String (timestamp)",
  "createdBy": {
    "@odata.type": "microsoft.graph.identitySet"
  },
  "customData": "String",
  "status": "String"
}
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
HTTP/1.1 204 No Content
Content-Type: application/json

{
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
```


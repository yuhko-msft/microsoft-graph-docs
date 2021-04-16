---
title: "Get privilegedOperationEvent"
description: "Read the properties and relationships of a privilegedOperationEvent object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get privilegedOperationEvent
Namespace: microsoft.graph



Read the properties and relationships of a [privilegedOperationEvent](../resources/privilegedoperationevent.md) object.

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
GET /privilegedOperationEvents/{privilegedOperationEventsId}
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

If successful, this method returns a `200 OK` response code and a [privilegedOperationEvent](../resources/privilegedoperationevent.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_privilegedoperationevent"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/privilegedOperationEvents/{privilegedOperationEventsId}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.privilegedOperationEvent"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.privilegedOperationEvent",
    "id": "f831ed3d-ed3d-f831-3ded-31f83ded31f8",
    "additionalInformation": "String",
    "creationDateTime": "String (timestamp)",
    "expirationDateTime": "String (timestamp)",
    "referenceKey": "String",
    "referenceSystem": "String",
    "requestorId": "String",
    "requestorName": "String",
    "requestType": "String",
    "roleId": "String",
    "roleName": "String",
    "tenantId": "String",
    "userId": "String",
    "userMail": "String",
    "userName": "String"
  }
}
```


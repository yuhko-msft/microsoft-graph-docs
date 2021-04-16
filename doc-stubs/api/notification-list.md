---
title: "List notifications"
description: "Get a list of the notification objects and their properties."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List notifications
Namespace: microsoft.graph



Get a list of the [notification](../resources/notification.md) objects and their properties.

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
GET /me/notifications
GET /users/{usersId}/notifications
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

If successful, this method returns a `200 OK` response code and a collection of [notification](../resources/notification.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "list_notification"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/me/notifications
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.notification)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
    {
      "@odata.type": "#microsoft.graph.notification",
      "id": "0b23df16-df16-0b23-16df-230b16df230b",
      "displayTimeToLive": "Integer",
      "expirationDateTime": "String (timestamp)",
      "groupName": "String",
      "payload": {
        "@odata.type": "microsoft.graph.payloadTypes"
      },
      "priority": "String",
      "targetHostName": "String",
      "targetPolicy": {
        "@odata.type": "microsoft.graph.targetPolicyEndpoints"
      }
    }
  ]
}
```


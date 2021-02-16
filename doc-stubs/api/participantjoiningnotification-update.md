---
title: "Update participantJoiningNotification"
description: "Update the properties of a participantJoiningNotification object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update participantJoiningNotification
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of a [participantJoiningNotification](../resources/participantjoiningnotification.md) object.

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
PATCH /participantJoiningNotification
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [participantJoiningNotification](../resources/participantjoiningnotification.md) object.

The following table shows the properties that are required when you update the [participantJoiningNotification](../resources/participantjoiningnotification.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [participantJoiningNotification](../resources/participantjoiningnotification.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_participantjoiningnotification"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/participantJoiningNotification
Content-Type: application/json
Content-length: 72

{
  "@odata.type": "#microsoft.graph.participantJoiningNotification"
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
  "@odata.type": "#microsoft.graph.participantJoiningNotification",
  "id": "5ee9c436-c436-5ee9-36c4-e95e36c4e95e"
}
```


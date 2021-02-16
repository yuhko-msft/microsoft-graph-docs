---
title: "Update participantLeftNotification"
description: "Update the properties of a participantLeftNotification object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update participantLeftNotification
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of a [participantLeftNotification](../resources/participantleftnotification.md) object.

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
PATCH /participantLeftNotification
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [participantLeftNotification](../resources/participantleftnotification.md) object.

The following table shows the properties that are required when you update the [participantLeftNotification](../resources/participantleftnotification.md).

|Property|Type|Description|
|:---|:---|:---|
|participantId|String|**TODO: Add Description**|
|id|String|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [participantLeftNotification](../resources/participantleftnotification.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_participantleftnotification"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/participantLeftNotification
Content-Type: application/json
Content-length: 99

{
  "@odata.type": "#microsoft.graph.participantLeftNotification",
  "participantId": "String"
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
  "@odata.type": "#microsoft.graph.participantLeftNotification",
  "participantId": "String",
  "id": "0c41383c-383c-0c41-3c38-410c3c38410c"
}
```


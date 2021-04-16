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
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|participantId|String|**TODO: Add Description**|



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
PATCH https://graph.microsoft.com/v1.0/participantLeftNotification
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
  "id": "e1d6f795-f795-e1d6-95f7-d6e195f7d6e1",
  "participantId": "String"
}
```


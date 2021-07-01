---
title: "Update messageEvent"
description: "Update the properties of a messageEvent object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update messageEvent
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of a [messageEvent](../resources/messageevent.md) object.

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
PATCH /messageEvents/{messageEventsId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [messageEvent](../resources/messageevent.md) object.

The following table shows the properties that are required when you update the [messageEvent](../resources/messageevent.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|dateTime|DateTimeOffset|**TODO: Add Description**|
|eventType|messageEventType|**TODO: Add Description**. Possible values are: `received`, `sent`, `delivered`, `failed`, `processingFailed`, `distributionGroupExpanded`, `submitted`, `delayed`, `redirected`, `resolved`, `dropped`, `recipientsAdded`, `malwareDetected`, `malwareDetectedInMessage`, `malwareDetectedInAttachment`, `ttZapped`, `ttDelivered`, `spamDetected`, `transportRuleTriggered`, `dlpRuleTriggered`, `journaled`, `unknownFutureValue`.|
|description|String|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [messageEvent](../resources/messageevent.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_messageevent"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/messageEvents/{messageEventsId}
Content-Type: application/json
Content-length: 145

{
  "@odata.type": "#microsoft.graph.messageEvent",
  "dateTime": "String (timestamp)",
  "eventType": "String",
  "description": "String"
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.messageEvent",
  "id": "bb1a6d63-6d63-bb1a-636d-1abb636d1abb",
  "dateTime": "String (timestamp)",
  "eventType": "String",
  "description": "String"
}
```


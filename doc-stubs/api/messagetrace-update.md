---
title: "Update messageTrace"
description: "Update the properties of a messageTrace object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update messageTrace
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of a [messageTrace](../resources/messagetrace.md) object.

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
PATCH /messageTraces/{messageTracesId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [messageTrace](../resources/messagetrace.md) object.

The following table shows the properties that are required when you update the [messageTrace](../resources/messagetrace.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|senderEmail|String|**TODO: Add Description**|
|receivedDateTime|DateTimeOffset|**TODO: Add Description**|
|messageId|String|**TODO: Add Description**|
|subject|String|**TODO: Add Description**|
|size|Int32|**TODO: Add Description**|
|sourceIPAddress|String|**TODO: Add Description**|
|destinationIPAddress|String|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [messageTrace](../resources/messagetrace.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_messagetrace"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/messageTraces/{messageTracesId}
Content-Type: application/json
Content-length: 268

{
  "@odata.type": "#microsoft.graph.messageTrace",
  "senderEmail": "String",
  "receivedDateTime": "String (timestamp)",
  "messageId": "String",
  "subject": "String",
  "size": "Integer",
  "sourceIPAddress": "String",
  "destinationIPAddress": "String"
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
  "@odata.type": "#microsoft.graph.messageTrace",
  "id": "16610348-0348-1661-4803-611648036116",
  "senderEmail": "String",
  "receivedDateTime": "String (timestamp)",
  "messageId": "String",
  "subject": "String",
  "size": "Integer",
  "sourceIPAddress": "String",
  "destinationIPAddress": "String"
}
```


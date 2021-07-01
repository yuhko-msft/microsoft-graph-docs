---
title: "Create messageTrace"
description: "Create a new messageTrace object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create messageTrace
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new messageTrace object.

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
POST /admin/exchange/messageTraces
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [messageTrace](../resources/messagetrace.md) object.

The following table shows the properties that are required when you create the [messageTrace](../resources/messagetrace.md).

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

If successful, this method returns a `201 Created` response code and a [messageTrace](../resources/messagetrace.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_messagetrace_from_messagetraces"
}
-->
``` http
POST https://graph.microsoft.com/beta/admin/exchange/messageTraces
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
  "truncated": true,
  "@odata.type": "microsoft.graph.messageTrace"
}
-->
``` http
HTTP/1.1 201 Created
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


---
title: "Create conversationThread"
description: "Create a new conversationThread object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create conversationThread
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new conversationThread object.

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
POST /groups/{groupsId}/threads
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [conversationThread](../resources/conversationthread.md) object.

The following table shows the properties that are required when you create the [conversationThread](../resources/conversationthread.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|ccRecipients|[recipient](../resources/recipient.md) collection|**TODO: Add Description**|
|hasAttachments|Boolean|**TODO: Add Description**|
|isLocked|Boolean|**TODO: Add Description**|
|lastDeliveredDateTime|DateTimeOffset|**TODO: Add Description**|
|preview|String|**TODO: Add Description**|
|topic|String|**TODO: Add Description**|
|toRecipients|[recipient](../resources/recipient.md) collection|**TODO: Add Description**|
|uniqueSenders|String collection|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and a [conversationThread](../resources/conversationthread.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_conversationthread_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/groups/{groupsId}/threads
Content-Type: application/json
Content-length: 438

{
  "@odata.type": "#microsoft.graph.conversationThread",
  "ccRecipients": [
    {
      "@odata.type": "microsoft.graph.recipient"
    }
  ],
  "hasAttachments": "Boolean",
  "isLocked": "Boolean",
  "lastDeliveredDateTime": "String (timestamp)",
  "preview": "String",
  "topic": "String",
  "toRecipients": [
    {
      "@odata.type": "microsoft.graph.recipient"
    }
  ],
  "uniqueSenders": [
    "String"
  ]
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.conversationThread"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.conversationThread",
  "id": "0d66bcc9-bcc9-0d66-c9bc-660dc9bc660d",
  "ccRecipients": [
    {
      "@odata.type": "microsoft.graph.recipient"
    }
  ],
  "hasAttachments": "Boolean",
  "isLocked": "Boolean",
  "lastDeliveredDateTime": "String (timestamp)",
  "preview": "String",
  "topic": "String",
  "toRecipients": [
    {
      "@odata.type": "microsoft.graph.recipient"
    }
  ],
  "uniqueSenders": [
    "String"
  ]
}
```


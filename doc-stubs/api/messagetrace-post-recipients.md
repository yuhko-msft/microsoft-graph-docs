---
title: "Create messageRecipient"
description: "Create a new messageRecipient object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create messageRecipient
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new messageRecipient object.

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
POST /messageTraces/{messageTracesId}/recipients
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [messageRecipient](../resources/messagerecipient.md) object.

The following table shows the properties that are required when you create the [messageRecipient](../resources/messagerecipient.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|recipientEmail|String|**TODO: Add Description**|
|deliveryStatus|messageStatus|**TODO: Add Description**. Possible values are: `gettingStatus`, `pending`, `failed`, `delivered`, `expanded`, `quarantined`, `filteredAsSpam`, `unknownFutureValue`.|



## Response

If successful, this method returns a `201 Created` response code and a [messageRecipient](../resources/messagerecipient.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_messagerecipient_from_messagerecipients"
}
-->
``` http
POST https://graph.microsoft.com/beta/messageTraces/{messageTracesId}/recipients
Content-Type: application/json
Content-length: 120

{
  "@odata.type": "#microsoft.graph.messageRecipient",
  "recipientEmail": "String",
  "deliveryStatus": "String"
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.messageRecipient"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.messageRecipient",
  "id": "b69da0d0-a0d0-b69d-d0a0-9db6d0a09db6",
  "recipientEmail": "String",
  "deliveryStatus": "String"
}
```


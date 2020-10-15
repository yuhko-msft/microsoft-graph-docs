---
title: "Create textClassificationRequest"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "apiPageType"
---

# Create textClassificationRequest

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new textClassificationRequest object.

## Permissions

One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

| Permission type                        | Permissions (from most to least privileged) |
| :------------------------------------- | :------------------------------------------ |
| Delegated (work or school account)     |                                             |
| Delegated (personal Microsoft account) |                                             |
| Application                            |                                             |

## HTTP request

<!-- {
  "blockType": "ignored"
}
-->

```http

```

## Request headers

| Name          | Description                 |
| :------------ | :-------------------------- |
| Authorization | Bearer {token}. Required.   |
| Content-Type  | application/json. Required. |

## Request Body

In the request body, supply JSON representation of the [textClassificationRequest](../resources/-textclassificationrequest.md) object.

<!-- Actions and Functions -->

<!-- CRUD Methods -->

The following table shows the properties that are required when you create a textClassificationRequest object.

| Property         | Type              | Description |
| :--------------- | :---------------- | :---------- |
| fileExtension    | String            |             |
| id               | String            | Read-only.  |
| scopesToRun      | String            |             |
| sensitiveTypeIds | String collection |             |
| text             | String            |             |

## Response

If successful, this method returns a `201 Created` response code and a textClassificationRequest object in the response body.

## Examples

### Request

<!-- {
  "blockType": "request",
  "name": "create_textclassificationrequest"
}
-->

```http
POST https://graph.microsoft.com/beta/dataClassification/classifyText/{id}

Content-Type: application/json
Content-Length: 191

{
  "@odata.type": "#microsoft.graph.textClassificationRequest",
  "fileExtension": "String",
  "scopesToRun": "String",
  "sensitiveTypeIds": [
    "String"
  ],
  "text": "String"
}

```

### Response

**Note:** The response object shown here might be shortened for readability.

<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.dataClassificationService.contract.textClassificationRequest"
}
-->

```http
HTTP 1.1 201 Created

Content-Type: application/json
{
  "value": {
  "@odata.type": "#microsoft.graph.textClassificationRequest",
  "fileExtension": "String",
  "id": "String(identifier)",
  "scopesToRun": "String",
  "sensitiveTypeIds": [
    "String"
  ],
  "text": "String"
}
}

```

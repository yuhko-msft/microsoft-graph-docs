---
title: "Get replies"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "apiPageType"
---

# Get replies

Namespace: microsoft.graph

Read the properties and relationships of a chatMessage object.

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

## Optional query parameters

This method supports some of the OData query parameters to help customize the response. For general information, see [OData query parameters](/graph/query-parameters).

## Request headers

| Name          | Description               |
| :------------ | :------------------------ |
| Authorization | Bearer {token}. Required. |

## Request Body

<!-- Actions and Functions -->

<!-- CRUD Methods -->

Do not supply a request body for this method.

## Response

If successful, this method returns a `200 OK` response code and a chatMessage object in the response body.

## Examples

### Request

<!-- {
  "blockType": "request",
  "name": "get_replies"
}
-->

```http
GET https://graph.microsoft.com/v1.0

```

### Response

**Note:** The response object shown here might be shortened for readability.

<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "$(this.ReturnTypeFullName)"
}
-->

```http
HTTP 1.1 200 OK

Content-Type: application/json
{
  "value": [
  {
    "@odata.type": "#microsoft.graph.chatMessage",
    "attachments": [
      {
        "@odata.type": "#microsoft.graph.chatMessageAttachment",
        "content": "String",
        "contentType": "String",
        "contentUrl": "String",
        "id": "String(identifier)",
        "name": "String",
        "thumbnailUrl": "String"
      }
    ],
    "body": {
      "@odata.type": "#microsoft.graph.itemBody",
      "content": "String",
      "contentType": "String"
    },
    "createdDateTime": "DateTimeOffset",
    "deletedDateTime": "DateTimeOffset",
    "etag": "String",
    "from": {
      "@odata.type": "#microsoft.graph.identitySet",
      "application": {
        "@odata.type": "#microsoft.graph.identity",
        "displayName": "String",
        "id": "String(identifier)"
      },
      "device": {
        "@odata.type": "#microsoft.graph.identity",
        "displayName": "String",
        "id": "String(identifier)"
      },
      "user": {
        "@odata.type": "#microsoft.graph.identity",
        "displayName": "String",
        "id": "String(identifier)"
      }
    },
    "id": "String(identifier)",
    "importance": "String",
    "lastEditedDateTime": "DateTimeOffset",
    "lastModifiedDateTime": "DateTimeOffset",
    "locale": "String",
    "mentions": [
      {
        "@odata.type": "#microsoft.graph.chatMessageMention",
        "id": "String(identifier)",
        "mentionText": "String",
        "mentioned": {
          "@odata.type": "#microsoft.graph.identitySet",
          "application": {
            "@odata.type": "#microsoft.graph.identity",
            "displayName": "String",
            "id": "String(identifier)"
          },
          "device": {
            "@odata.type": "#microsoft.graph.identity",
            "displayName": "String",
            "id": "String(identifier)"
          },
          "user": {
            "@odata.type": "#microsoft.graph.identity",
            "displayName": "String",
            "id": "String(identifier)"
          }
        }
      }
    ],
    "messageType": "String",
    "policyViolation": {
      "@odata.type": "#microsoft.graph.chatMessagePolicyViolation",
      "dlpAction": "String",
      "justificationText": "String",
      "policyTip": {
        "@odata.type": "#microsoft.graph.chatMessagePolicyViolationPolicyTip",
        "complianceUrl": "String",
        "generalText": "String",
        "matchedConditionDescriptions": [
          "String"
        ]
      },
      "userAction": "String",
      "verdictDetails": "String"
    },
    "reactions": [
      {
        "@odata.type": "#microsoft.graph.chatMessageReaction",
        "createdDateTime": "DateTimeOffset",
        "reactionType": "String",
        "user": {
          "@odata.type": "#microsoft.graph.identitySet",
          "application": {
            "@odata.type": "#microsoft.graph.identity",
            "displayName": "String",
            "id": "String(identifier)"
          },
          "device": {
            "@odata.type": "#microsoft.graph.identity",
            "displayName": "String",
            "id": "String(identifier)"
          },
          "user": {
            "@odata.type": "#microsoft.graph.identity",
            "displayName": "String",
            "id": "String(identifier)"
          }
        }
      }
    ],
    "replyToId": "String",
    "subject": "String",
    "summary": "String",
    "webUrl": "String"
  }
]
}

```

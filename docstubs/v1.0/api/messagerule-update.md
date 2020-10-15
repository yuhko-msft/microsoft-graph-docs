---
title: "Update messageRule"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "apiPageType"
---

# Update messageRule

Namespace: microsoft.graph

Update the properties of a messageRule object.

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

In the request body, supply JSON representation of the [messageRule](../resources/-messagerule.md) object.

<!-- Actions and Functions -->

<!-- CRUD Methods -->

The following table shows the properties that are required when you create a messageRule object.

| Property    | Type                                                           | Description |
| :---------- | :------------------------------------------------------------- | :---------- |
| actions     | [messageRuleActions](../resources/messageruleactions.md)       |             |
| conditions  | [messageRulePredicates](../resources/messagerulepredicates.md) |             |
| displayName | String                                                         |             |
| exceptions  | [messageRulePredicates](../resources/messagerulepredicates.md) |             |
| hasError    | Boolean                                                        |             |
| id          | String                                                         | Read-only.  |
| isEnabled   | Boolean                                                        |             |
| isReadOnly  | Boolean                                                        |             |
| sequence    | Int32                                                          |             |

## Response

If successful, this method returns a `200 OK` response code and a messageRule object in the response body.

## Examples

### Request

<!-- {
  "blockType": "request",
  "name": "update_messagerule"
}
-->

```http
PATCH https://graph.microsoft.com/v1.0/users/{id}/mailFolders/{id}/messageRules/{id}

Content-Type: application/json
Content-Length: 4872

{
  "@odata.type": "#microsoft.graph.messageRule",
  "actions": {
    "@odata.type": "#microsoft.graph.messageRuleActions",
    "assignCategories": [
      "String"
    ],
    "copyToFolder": "String",
    "delete": "Boolean",
    "forwardAsAttachmentTo": [
      {
        "@odata.type": "#microsoft.graph.recipient",
        "emailAddress": {
          "@odata.type": "#microsoft.graph.emailAddress",
          "address": "String",
          "name": "String"
        }
      }
    ],
    "forwardTo": [
      {
        "@odata.type": "#microsoft.graph.recipient",
        "emailAddress": {
          "@odata.type": "#microsoft.graph.emailAddress",
          "address": "String",
          "name": "String"
        }
      }
    ],
    "markAsRead": "Boolean",
    "markImportance": "String",
    "moveToFolder": "String",
    "permanentDelete": "Boolean",
    "redirectTo": [
      {
        "@odata.type": "#microsoft.graph.recipient",
        "emailAddress": {
          "@odata.type": "#microsoft.graph.emailAddress",
          "address": "String",
          "name": "String"
        }
      }
    ],
    "stopProcessingRules": "Boolean"
  },
  "conditions": {
    "@odata.type": "#microsoft.graph.messageRulePredicates",
    "bodyContains": [
      "String"
    ],
    "bodyOrSubjectContains": [
      "String"
    ],
    "categories": [
      "String"
    ],
    "fromAddresses": [
      {
        "@odata.type": "#microsoft.graph.recipient",
        "emailAddress": {
          "@odata.type": "#microsoft.graph.emailAddress",
          "address": "String",
          "name": "String"
        }
      }
    ],
    "hasAttachments": "Boolean",
    "headerContains": [
      "String"
    ],
    "importance": "String",
    "isApprovalRequest": "Boolean",
    "isAutomaticForward": "Boolean",
    "isAutomaticReply": "Boolean",
    "isEncrypted": "Boolean",
    "isMeetingRequest": "Boolean",
    "isMeetingResponse": "Boolean",
    "isNonDeliveryReport": "Boolean",
    "isPermissionControlled": "Boolean",
    "isReadReceipt": "Boolean",
    "isSigned": "Boolean",
    "isVoicemail": "Boolean",
    "messageActionFlag": "String",
    "notSentToMe": "Boolean",
    "recipientContains": [
      "String"
    ],
    "senderContains": [
      "String"
    ],
    "sensitivity": "String",
    "sentCcMe": "Boolean",
    "sentOnlyToMe": "Boolean",
    "sentToAddresses": [
      {
        "@odata.type": "#microsoft.graph.recipient",
        "emailAddress": {
          "@odata.type": "#microsoft.graph.emailAddress",
          "address": "String",
          "name": "String"
        }
      }
    ],
    "sentToMe": "Boolean",
    "sentToOrCcMe": "Boolean",
    "subjectContains": [
      "String"
    ],
    "withinSizeRange": {
      "@odata.type": "#microsoft.graph.sizeRange",
      "maximumSize": "Int32",
      "minimumSize": "Int32"
    }
  },
  "displayName": "String",
  "exceptions": {
    "@odata.type": "#microsoft.graph.messageRulePredicates",
    "bodyContains": [
      "String"
    ],
    "bodyOrSubjectContains": [
      "String"
    ],
    "categories": [
      "String"
    ],
    "fromAddresses": [
      {
        "@odata.type": "#microsoft.graph.recipient",
        "emailAddress": {
          "@odata.type": "#microsoft.graph.emailAddress",
          "address": "String",
          "name": "String"
        }
      }
    ],
    "hasAttachments": "Boolean",
    "headerContains": [
      "String"
    ],
    "importance": "String",
    "isApprovalRequest": "Boolean",
    "isAutomaticForward": "Boolean",
    "isAutomaticReply": "Boolean",
    "isEncrypted": "Boolean",
    "isMeetingRequest": "Boolean",
    "isMeetingResponse": "Boolean",
    "isNonDeliveryReport": "Boolean",
    "isPermissionControlled": "Boolean",
    "isReadReceipt": "Boolean",
    "isSigned": "Boolean",
    "isVoicemail": "Boolean",
    "messageActionFlag": "String",
    "notSentToMe": "Boolean",
    "recipientContains": [
      "String"
    ],
    "senderContains": [
      "String"
    ],
    "sensitivity": "String",
    "sentCcMe": "Boolean",
    "sentOnlyToMe": "Boolean",
    "sentToAddresses": [
      {
        "@odata.type": "#microsoft.graph.recipient",
        "emailAddress": {
          "@odata.type": "#microsoft.graph.emailAddress",
          "address": "String",
          "name": "String"
        }
      }
    ],
    "sentToMe": "Boolean",
    "sentToOrCcMe": "Boolean",
    "subjectContains": [
      "String"
    ],
    "withinSizeRange": {
      "@odata.type": "#microsoft.graph.sizeRange",
      "maximumSize": "Int32",
      "minimumSize": "Int32"
    }
  },
  "hasError": "Boolean",
  "isEnabled": "Boolean",
  "isReadOnly": "Boolean",
  "sequence": "Int32"
}

```

### Response

**Note:** The response object shown here might be shortened for readability.

<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Microsoft.OutlookServices.messageRule"
}
-->

```http
HTTP 1.1 200 OK

Content-Type: application/json
{
  "value": {
  "@odata.type": "#microsoft.graph.messageRule",
  "actions": {
    "@odata.type": "#microsoft.graph.messageRuleActions",
    "assignCategories": [
      "String"
    ],
    "copyToFolder": "String",
    "delete": "Boolean",
    "forwardAsAttachmentTo": [
      {
        "@odata.type": "#microsoft.graph.recipient",
        "emailAddress": {
          "@odata.type": "#microsoft.graph.emailAddress",
          "address": "String",
          "name": "String"
        }
      }
    ],
    "forwardTo": [
      {
        "@odata.type": "#microsoft.graph.recipient",
        "emailAddress": {
          "@odata.type": "#microsoft.graph.emailAddress",
          "address": "String",
          "name": "String"
        }
      }
    ],
    "markAsRead": "Boolean",
    "markImportance": "String",
    "moveToFolder": "String",
    "permanentDelete": "Boolean",
    "redirectTo": [
      {
        "@odata.type": "#microsoft.graph.recipient",
        "emailAddress": {
          "@odata.type": "#microsoft.graph.emailAddress",
          "address": "String",
          "name": "String"
        }
      }
    ],
    "stopProcessingRules": "Boolean"
  },
  "conditions": {
    "@odata.type": "#microsoft.graph.messageRulePredicates",
    "bodyContains": [
      "String"
    ],
    "bodyOrSubjectContains": [
      "String"
    ],
    "categories": [
      "String"
    ],
    "fromAddresses": [
      {
        "@odata.type": "#microsoft.graph.recipient",
        "emailAddress": {
          "@odata.type": "#microsoft.graph.emailAddress",
          "address": "String",
          "name": "String"
        }
      }
    ],
    "hasAttachments": "Boolean",
    "headerContains": [
      "String"
    ],
    "importance": "String",
    "isApprovalRequest": "Boolean",
    "isAutomaticForward": "Boolean",
    "isAutomaticReply": "Boolean",
    "isEncrypted": "Boolean",
    "isMeetingRequest": "Boolean",
    "isMeetingResponse": "Boolean",
    "isNonDeliveryReport": "Boolean",
    "isPermissionControlled": "Boolean",
    "isReadReceipt": "Boolean",
    "isSigned": "Boolean",
    "isVoicemail": "Boolean",
    "messageActionFlag": "String",
    "notSentToMe": "Boolean",
    "recipientContains": [
      "String"
    ],
    "senderContains": [
      "String"
    ],
    "sensitivity": "String",
    "sentCcMe": "Boolean",
    "sentOnlyToMe": "Boolean",
    "sentToAddresses": [
      {
        "@odata.type": "#microsoft.graph.recipient",
        "emailAddress": {
          "@odata.type": "#microsoft.graph.emailAddress",
          "address": "String",
          "name": "String"
        }
      }
    ],
    "sentToMe": "Boolean",
    "sentToOrCcMe": "Boolean",
    "subjectContains": [
      "String"
    ],
    "withinSizeRange": {
      "@odata.type": "#microsoft.graph.sizeRange",
      "maximumSize": "Int32",
      "minimumSize": "Int32"
    }
  },
  "displayName": "String",
  "exceptions": {
    "@odata.type": "#microsoft.graph.messageRulePredicates",
    "bodyContains": [
      "String"
    ],
    "bodyOrSubjectContains": [
      "String"
    ],
    "categories": [
      "String"
    ],
    "fromAddresses": [
      {
        "@odata.type": "#microsoft.graph.recipient",
        "emailAddress": {
          "@odata.type": "#microsoft.graph.emailAddress",
          "address": "String",
          "name": "String"
        }
      }
    ],
    "hasAttachments": "Boolean",
    "headerContains": [
      "String"
    ],
    "importance": "String",
    "isApprovalRequest": "Boolean",
    "isAutomaticForward": "Boolean",
    "isAutomaticReply": "Boolean",
    "isEncrypted": "Boolean",
    "isMeetingRequest": "Boolean",
    "isMeetingResponse": "Boolean",
    "isNonDeliveryReport": "Boolean",
    "isPermissionControlled": "Boolean",
    "isReadReceipt": "Boolean",
    "isSigned": "Boolean",
    "isVoicemail": "Boolean",
    "messageActionFlag": "String",
    "notSentToMe": "Boolean",
    "recipientContains": [
      "String"
    ],
    "senderContains": [
      "String"
    ],
    "sensitivity": "String",
    "sentCcMe": "Boolean",
    "sentOnlyToMe": "Boolean",
    "sentToAddresses": [
      {
        "@odata.type": "#microsoft.graph.recipient",
        "emailAddress": {
          "@odata.type": "#microsoft.graph.emailAddress",
          "address": "String",
          "name": "String"
        }
      }
    ],
    "sentToMe": "Boolean",
    "sentToOrCcMe": "Boolean",
    "subjectContains": [
      "String"
    ],
    "withinSizeRange": {
      "@odata.type": "#microsoft.graph.sizeRange",
      "maximumSize": "Int32",
      "minimumSize": "Int32"
    }
  },
  "hasError": "Boolean",
  "id": "String(identifier)",
  "isEnabled": "Boolean",
  "isReadOnly": "Boolean",
  "sequence": "Int32"
}
}

```

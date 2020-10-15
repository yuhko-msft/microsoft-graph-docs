---
title: "Get evaluateLabelJobResponse"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "apiPageType"
---

# Get evaluateLabelJobResponse

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Read the properties and relationships an evaluateLabelJobResponse object.

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

If successful, this method returns a `200 OK` response code and an evaluateLabelJobResponse object in the response body.

## Examples

### Request

<!-- {
  "blockType": "request",
  "name": "get_evaluatelabeljobresponse"
}
-->

```http
GET https://graph.microsoft.com/beta

```

### Response

**Note:** The response object shown here might be shortened for readability.

<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.dataClassificationService.contract.evaluateLabelJobResponse"
}
-->

```http
HTTP 1.1 200 OK

Content-Type: application/json
{
  "value": {
  "@odata.type": "#microsoft.graph.evaluateLabelJobResponse",
  "creationDateTime": "DateTimeOffset",
  "endDateTime": "DateTimeOffset",
  "id": "String(identifier)",
  "result": {
    "@odata.type": "#microsoft.graph.evaluateLabelJobResultGroup",
    "automatic": {
      "@odata.type": "#microsoft.graph.evaluateLabelJobResult",
      "responsiblePolicy": {
        "@odata.type": "#microsoft.graph.responsiblePolicy",
        "id": "String(identifier)",
        "name": "String"
      },
      "responsibleSensitiveTypes": [
        {
          "@odata.type": "#microsoft.graph.responsibleSensitiveType",
          "description": "String",
          "id": "String(identifier)",
          "name": "String",
          "publisherName": "String",
          "rulePackageId": "String",
          "rulePackageType": "String"
        }
      ],
      "sensitivityLabel": {
        "@odata.type": "#microsoft.graph.matchingLabel",
        "applicationMode": "String",
        "description": "String",
        "displayName": "String",
        "id": "String(identifier)",
        "isEndpointProtectionEnabled": "Boolean",
        "labelActions": [
          {
            "@odata.type": "#microsoft.graph.encryptWithTemplate"
          }
        ],
        "name": "String",
        "policyTip": "String",
        "priority": "Int32",
        "toolTip": "String"
      }
    },
    "recommended": {
      "@odata.type": "#microsoft.graph.evaluateLabelJobResult",
      "responsiblePolicy": {
        "@odata.type": "#microsoft.graph.responsiblePolicy",
        "id": "String(identifier)",
        "name": "String"
      },
      "responsibleSensitiveTypes": [
        {
          "@odata.type": "#microsoft.graph.responsibleSensitiveType",
          "description": "String",
          "id": "String(identifier)",
          "name": "String",
          "publisherName": "String",
          "rulePackageId": "String",
          "rulePackageType": "String"
        }
      ],
      "sensitivityLabel": {
        "@odata.type": "#microsoft.graph.matchingLabel",
        "applicationMode": "String",
        "description": "String",
        "displayName": "String",
        "id": "String(identifier)",
        "isEndpointProtectionEnabled": "Boolean",
        "labelActions": [
          {
            "@odata.type": "#microsoft.graph.encryptWithTemplate"
          }
        ],
        "name": "String",
        "policyTip": "String",
        "priority": "Int32",
        "toolTip": "String"
      }
    }
  },
  "startDateTime": "DateTimeOffset",
  "status": "String",
  "tenantId": "String",
  "type": "String"
}
}

```

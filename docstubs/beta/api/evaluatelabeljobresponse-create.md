---
title: "Create evaluateLabelJobResponse"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "apiPageType"
---

# Create evaluateLabelJobResponse

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new evaluateLabelJobResponse object.

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

In the request body, supply JSON representation of the [evaluateLabelJobResponse](../resources/-evaluatelabeljobresponse.md) object.

<!-- Actions and Functions -->

<!-- CRUD Methods -->

The following table shows the properties that are required when you create an evaluateLabelJobResponse object.

| Property | Type                                                                       | Description |
| :------- | :------------------------------------------------------------------------- | :---------- |
| result   | [evaluateLabelJobResultGroup](../resources/evaluatelabeljobresultgroup.md) |             |

## Response

If successful, this method returns a `201 Created` response code and an evaluateLabelJobResponse object in the response body.

## Examples

### Request

<!-- {
  "blockType": "request",
  "name": "create_evaluatelabeljobresponse"
}
-->

```http
POST https://graph.microsoft.com/beta

Content-Type: application/json
Content-Length: 2656

{
  "@odata.type": "#microsoft.graph.evaluateLabelJobResponse",
  "creationDateTime": "DateTimeOffset",
  "endDateTime": "DateTimeOffset",
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
HTTP 1.1 201 Created

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

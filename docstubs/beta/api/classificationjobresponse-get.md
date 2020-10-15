---
title: "Get classificationJobResponse"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "apiPageType"
---

# Get classificationJobResponse

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Read the properties and relationships a classificationJobResponse object.

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

If successful, this method returns a `200 OK` response code and a classificationJobResponse object in the response body.

## Examples

### Request

<!-- {
  "blockType": "request",
  "name": "get_classificationjobresponse"
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
  "@odata.type": "microsoft.dataClassificationService.contract.classificationJobResponse"
}
-->

```http
HTTP 1.1 200 OK

Content-Type: application/json
{
  "value": {
  "@odata.type": "#microsoft.graph.classificationJobResponse",
  "creationDateTime": "DateTimeOffset",
  "endDateTime": "DateTimeOffset",
  "id": "String(identifier)",
  "result": {
    "@odata.type": "#microsoft.graph.detectedSensitiveContentWrapper",
    "classification": [
      {
        "@odata.type": "#microsoft.graph.detectedSensitiveContent",
        "classificationAttributes": [
          {
            "@odata.type": "#microsoft.graph.classificationAttribute",
            "confidence": "Int32",
            "count": "Int32"
          }
        ],
        "classificationMethod": "String",
        "confidence": "Int32",
        "displayName": "String",
        "id": "String(identifier)",
        "matches": [
          {
            "@odata.type": "#microsoft.graph.sensitiveContentLocation",
            "confidence": "Int32",
            "evidences": [
              {
                "@odata.type": "#microsoft.graph.sensitiveContentEvidence",
                "length": "Int32",
                "match": "String",
                "offset": "Int32"
              }
            ],
            "idMatch": "String",
            "length": "Int32",
            "offset": "Int32"
          }
        ],
        "recommendedConfidence": "Int32",
        "scope": "String",
        "sensitiveTypeSource": "String",
        "uniqueCount": "Int32"
      }
    ]
  },
  "startDateTime": "DateTimeOffset",
  "status": "String",
  "tenantId": "String",
  "type": "String"
}
}

```

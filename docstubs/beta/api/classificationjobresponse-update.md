---
title: "Update classificationJobResponse"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "apiPageType"
---

# Update classificationJobResponse

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of a classificationJobResponse object.

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

In the request body, supply JSON representation of the [classificationJobResponse](../resources/-classificationjobresponse.md) object.

<!-- Actions and Functions -->

<!-- CRUD Methods -->

The following table shows the properties that are required when you create a classificationJobResponse object.

| Property | Type                                                                               | Description |
| :------- | :--------------------------------------------------------------------------------- | :---------- |
| result   | [detectedSensitiveContentWrapper](../resources/detectedsensitivecontentwrapper.md) |             |

## Response

If successful, this method returns a `200 OK` response code and a classificationJobResponse object in the response body.

## Examples

### Request

<!-- {
  "blockType": "request",
  "name": "update_classificationjobresponse"
}
-->

```http
PATCH https://graph.microsoft.com/beta

Content-Type: application/json
Content-Length: 1497

{
  "@odata.type": "#microsoft.graph.classificationJobResponse",
  "creationDateTime": "DateTimeOffset",
  "endDateTime": "DateTimeOffset",
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

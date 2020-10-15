---
title: "List people"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "apiPageType"
---

# List people

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Get the person objects from a people navigation property.

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

If successful, this method returns a `200 Ok` response code and a person object in the response body.

## Examples

### Request

<!-- {
  "blockType": "request",
  "name": "list_people"
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
  "@odata.type": "$(this.ReturnTypeFullName)"
}
-->

```http
HTTP 1.1 200 Ok

Content-Type: application/json
{
  "value": [
  {
    "@odata.type": "#microsoft.graph.person",
    "birthday": "String",
    "companyName": "String",
    "department": "String",
    "displayName": "String",
    "emailAddresses": [
      {
        "@odata.type": "#microsoft.graph.rankedEmailAddress",
        "address": "String",
        "rank": "Double"
      }
    ],
    "givenName": "String",
    "id": "String(identifier)",
    "isFavorite": "Boolean",
    "mailboxType": "String",
    "officeLocation": "String",
    "personNotes": "String",
    "personType": "String",
    "phones": [
      {
        "@odata.type": "#microsoft.graph.phone",
        "number": "String",
        "type": "String"
      }
    ],
    "postalAddresses": [
      {
        "@odata.type": "#microsoft.graph.location",
        "address": {
          "@odata.type": "#microsoft.graph.physicalAddress",
          "city": "String",
          "countryOrRegion": "String",
          "postOfficeBox": "String",
          "postalCode": "String",
          "state": "String",
          "street": "String",
          "type": "String"
        },
        "coordinates": {
          "@odata.type": "#microsoft.graph.outlookGeoCoordinates",
          "accuracy": "Double",
          "altitude": "Double",
          "altitudeAccuracy": "Double",
          "latitude": "Double",
          "longitude": "Double"
        },
        "displayName": "String",
        "locationEmailAddress": "String",
        "locationType": "String",
        "locationUri": "String",
        "uniqueId": "String",
        "uniqueIdType": "String"
      }
    ],
    "profession": "String",
    "sources": [
      {
        "@odata.type": "#microsoft.graph.personDataSource",
        "type": "String"
      }
    ],
    "surname": "String",
    "title": "String",
    "userPrincipalName": "String",
    "websites": [
      {
        "@odata.type": "#microsoft.graph.website",
        "address": "String",
        "displayName": "String",
        "type": "String"
      }
    ],
    "yomiCompany": "String"
  }
]
}

```

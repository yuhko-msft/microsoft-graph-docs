---
title: "Update people"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "apiPageType"
---

# Update people

Namespace: microsoft.graph

Update the properties of a person object.

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

In the request body, supply JSON representation of the [person](../resources/-person.md) object.

<!-- Actions and Functions -->

<!-- CRUD Methods -->

The following table shows the properties that are required when you create a person object.

| Property             | Type                                                                | Description |
| :------------------- | :------------------------------------------------------------------ | :---------- |
| birthday             | String                                                              |             |
| companyName          | String                                                              |             |
| department           | String                                                              |             |
| displayName          | String                                                              |             |
| givenName            | String                                                              |             |
| id                   | String                                                              | Read-only.  |
| imAddress            | String                                                              |             |
| isFavorite           | Boolean                                                             |             |
| jobTitle             | String                                                              |             |
| officeLocation       | String                                                              |             |
| personNotes          | String                                                              |             |
| personType           | [personType](../resources/persontype.md)                            |             |
| phones               | [phone](../resources/phone.md) collection                           |             |
| postalAddresses      | [location](../resources/location.md) collection                     |             |
| profession           | String                                                              |             |
| scoredEmailAddresses | [scoredEmailAddress](../resources/scoredemailaddress.md) collection |             |
| surname              | String                                                              |             |
| userPrincipalName    | String                                                              |             |
| websites             | [website](../resources/website.md) collection                       |             |
| yomiCompany          | String                                                              |             |

## Response

If successful, this method returns a `200 OK` response code and a person object in the response body.

## Examples

### Request

<!-- {
  "blockType": "request",
  "name": "update_people"
}
-->

```http
PATCH https://graph.microsoft.com/v1.0

Content-Type: application/json
Content-Length: 2149

[
  {
    "@odata.type": "#microsoft.graph.person",
    "birthday": "String",
    "companyName": "String",
    "department": "String",
    "displayName": "String",
    "givenName": "String",
    "id": "String(identifier)",
    "imAddress": "String",
    "isFavorite": "Boolean",
    "jobTitle": "String",
    "officeLocation": "String",
    "personNotes": "String",
    "personType": {
      "@odata.type": "#microsoft.graph.personType",
      "class": "String",
      "subclass": "String"
    },
    "phones": [
      {
        "@odata.type": "#microsoft.graph.phone",
        "language": "String",
        "number": "String",
        "region": "String",
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
          "postalCode": "String",
          "state": "String",
          "street": "String"
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
    "scoredEmailAddresses": [
      {
        "@odata.type": "#microsoft.graph.scoredEmailAddress",
        "address": "String",
        "itemId": "String",
        "relevanceScore": "Double",
        "selectionLikelihood": "String"
      }
    ],
    "surname": "String",
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
    "@odata.type": "#microsoft.graph.person",
    "birthday": "String",
    "companyName": "String",
    "department": "String",
    "displayName": "String",
    "givenName": "String",
    "id": "String(identifier)",
    "imAddress": "String",
    "isFavorite": "Boolean",
    "jobTitle": "String",
    "officeLocation": "String",
    "personNotes": "String",
    "personType": {
      "@odata.type": "#microsoft.graph.personType",
      "class": "String",
      "subclass": "String"
    },
    "phones": [
      {
        "@odata.type": "#microsoft.graph.phone",
        "language": "String",
        "number": "String",
        "region": "String",
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
          "postalCode": "String",
          "state": "String",
          "street": "String"
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
    "scoredEmailAddresses": [
      {
        "@odata.type": "#microsoft.graph.scoredEmailAddress",
        "address": "String",
        "itemId": "String",
        "relevanceScore": "Double",
        "selectionLikelihood": "String"
      }
    ],
    "surname": "String",
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

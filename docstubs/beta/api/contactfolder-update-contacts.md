---
title: "Update contacts"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "apiPageType"
---

# Update contacts

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of a contact object.

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

In the request body, supply JSON representation of the [contact](../resources/-contact.md) object.

<!-- Actions and Functions -->

<!-- CRUD Methods -->

The following table shows the properties that are required when you create a contact object.

| Property           | Type                                                              | Description |
| :----------------- | :---------------------------------------------------------------- | :---------- |
| assistantName      | String                                                            |             |
| birthday           | DateTimeOffset                                                    |             |
| children           | String collection                                                 |             |
| companyName        | String                                                            |             |
| department         | String                                                            |             |
| displayName        | String                                                            |             |
| emailAddresses     | [typedEmailAddress](../resources/typedemailaddress.md) collection |             |
| fileAs             | String                                                            |             |
| flag               | [followupFlag](../resources/followupflag.md)                      |             |
| gender             | String                                                            |             |
| generation         | String                                                            |             |
| givenName          | String                                                            |             |
| imAddresses        | String collection                                                 |             |
| initials           | String                                                            |             |
| isFavorite         | Boolean                                                           |             |
| jobTitle           | String                                                            |             |
| manager            | String                                                            |             |
| middleName         | String                                                            |             |
| nickName           | String                                                            |             |
| officeLocation     | String                                                            |             |
| parentFolderId     | String                                                            |             |
| personalNotes      | String                                                            |             |
| phones             | [phone](../resources/phone.md) collection                         |             |
| postalAddresses    | [physicalAddress](../resources/physicaladdress.md) collection     |             |
| profession         | String                                                            |             |
| spouseName         | String                                                            |             |
| surname            | String                                                            |             |
| title              | String                                                            |             |
| websites           | [website](../resources/website.md) collection                     |             |
| weddingAnniversary | Date                                                              |             |
| yomiCompanyName    | String                                                            |             |
| yomiGivenName      | String                                                            |             |
| yomiSurname        | String                                                            |             |

## Response

If successful, this method returns a `200 OK` response code and a contact object in the response body.

## Examples

### Request

<!-- {
  "blockType": "request",
  "name": "update_contacts"
}
-->

```http
PATCH https://graph.microsoft.com/beta

Content-Type: application/json
Content-Length: 2588

[
  {
    "@odata.type": "#microsoft.graph.contact",
    "assistantName": "String",
    "birthday": "DateTimeOffset",
    "categories": [
      "String"
    ],
    "changeKey": "String",
    "children": [
      "String"
    ],
    "companyName": "String",
    "createdDateTime": "DateTimeOffset",
    "department": "String",
    "displayName": "String",
    "emailAddresses": [
      {
        "@odata.type": "#microsoft.graph.typedEmailAddress",
        "address": "String",
        "name": "String",
        "otherLabel": "String",
        "type": "String"
      }
    ],
    "fileAs": "String",
    "flag": {
      "@odata.type": "#microsoft.graph.followupFlag",
      "completedDateTime": {
        "@odata.type": "#microsoft.graph.dateTimeTimeZone",
        "dateTime": "String",
        "timeZone": "String"
      },
      "dueDateTime": {
        "@odata.type": "#microsoft.graph.dateTimeTimeZone",
        "dateTime": "String",
        "timeZone": "String"
      },
      "flagStatus": "String",
      "startDateTime": {
        "@odata.type": "#microsoft.graph.dateTimeTimeZone",
        "dateTime": "String",
        "timeZone": "String"
      }
    },
    "gender": "String",
    "generation": "String",
    "givenName": "String",
    "id": "String(identifier)",
    "imAddresses": [
      "String"
    ],
    "initials": "String",
    "isFavorite": "Boolean",
    "jobTitle": "String",
    "lastModifiedDateTime": "DateTimeOffset",
    "manager": "String",
    "middleName": "String",
    "nickName": "String",
    "officeLocation": "String",
    "parentFolderId": "String",
    "personalNotes": "String",
    "phones": [
      {
        "@odata.type": "#microsoft.graph.phone",
        "number": "String",
        "type": "String"
      }
    ],
    "postalAddresses": [
      {
        "@odata.type": "#microsoft.graph.physicalAddress",
        "city": "String",
        "countryOrRegion": "String",
        "postOfficeBox": "String",
        "postalCode": "String",
        "state": "String",
        "street": "String",
        "type": "String"
      }
    ],
    "profession": "String",
    "spouseName": "String",
    "surname": "String",
    "title": "String",
    "websites": [
      {
        "@odata.type": "#microsoft.graph.website",
        "address": "String",
        "displayName": "String",
        "type": "String"
      }
    ],
    "weddingAnniversary": "Date",
    "yomiCompanyName": "String",
    "yomiGivenName": "String",
    "yomiSurname": "String"
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
    "@odata.type": "#microsoft.graph.contact",
    "assistantName": "String",
    "birthday": "DateTimeOffset",
    "categories": [
      "String"
    ],
    "changeKey": "String",
    "children": [
      "String"
    ],
    "companyName": "String",
    "createdDateTime": "DateTimeOffset",
    "department": "String",
    "displayName": "String",
    "emailAddresses": [
      {
        "@odata.type": "#microsoft.graph.typedEmailAddress",
        "address": "String",
        "name": "String",
        "otherLabel": "String",
        "type": "String"
      }
    ],
    "fileAs": "String",
    "flag": {
      "@odata.type": "#microsoft.graph.followupFlag",
      "completedDateTime": {
        "@odata.type": "#microsoft.graph.dateTimeTimeZone",
        "dateTime": "String",
        "timeZone": "String"
      },
      "dueDateTime": {
        "@odata.type": "#microsoft.graph.dateTimeTimeZone",
        "dateTime": "String",
        "timeZone": "String"
      },
      "flagStatus": "String",
      "startDateTime": {
        "@odata.type": "#microsoft.graph.dateTimeTimeZone",
        "dateTime": "String",
        "timeZone": "String"
      }
    },
    "gender": "String",
    "generation": "String",
    "givenName": "String",
    "id": "String(identifier)",
    "imAddresses": [
      "String"
    ],
    "initials": "String",
    "isFavorite": "Boolean",
    "jobTitle": "String",
    "lastModifiedDateTime": "DateTimeOffset",
    "manager": "String",
    "middleName": "String",
    "nickName": "String",
    "officeLocation": "String",
    "parentFolderId": "String",
    "personalNotes": "String",
    "phones": [
      {
        "@odata.type": "#microsoft.graph.phone",
        "number": "String",
        "type": "String"
      }
    ],
    "postalAddresses": [
      {
        "@odata.type": "#microsoft.graph.physicalAddress",
        "city": "String",
        "countryOrRegion": "String",
        "postOfficeBox": "String",
        "postalCode": "String",
        "state": "String",
        "street": "String",
        "type": "String"
      }
    ],
    "profession": "String",
    "spouseName": "String",
    "surname": "String",
    "title": "String",
    "websites": [
      {
        "@odata.type": "#microsoft.graph.website",
        "address": "String",
        "displayName": "String",
        "type": "String"
      }
    ],
    "weddingAnniversary": "Date",
    "yomiCompanyName": "String",
    "yomiGivenName": "String",
    "yomiSurname": "String"
  }
]
}

```

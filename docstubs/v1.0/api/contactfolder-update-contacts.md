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

| Property         | Type                                                    | Description |
| :--------------- | :------------------------------------------------------ | :---------- |
| assistantName    | String                                                  |             |
| birthday         | DateTimeOffset                                          |             |
| businessAddress  | [physicalAddress](../resources/physicaladdress.md)      |             |
| businessHomePage | String                                                  |             |
| businessPhones   | String collection                                       |             |
| children         | String collection                                       |             |
| companyName      | String                                                  |             |
| department       | String                                                  |             |
| displayName      | String                                                  |             |
| emailAddresses   | [emailAddress](../resources/emailaddress.md) collection |             |
| fileAs           | String                                                  |             |
| generation       | String                                                  |             |
| givenName        | String                                                  |             |
| homeAddress      | [physicalAddress](../resources/physicaladdress.md)      |             |
| homePhones       | String collection                                       |             |
| imAddresses      | String collection                                       |             |
| initials         | String                                                  |             |
| jobTitle         | String                                                  |             |
| manager          | String                                                  |             |
| middleName       | String                                                  |             |
| mobilePhone      | String                                                  |             |
| nickName         | String                                                  |             |
| officeLocation   | String                                                  |             |
| otherAddress     | [physicalAddress](../resources/physicaladdress.md)      |             |
| parentFolderId   | String                                                  |             |
| personalNotes    | String                                                  |             |
| profession       | String                                                  |             |
| spouseName       | String                                                  |             |
| surname          | String                                                  |             |
| title            | String                                                  |             |
| yomiCompanyName  | String                                                  |             |
| yomiGivenName    | String                                                  |             |
| yomiSurname      | String                                                  |             |

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
PATCH https://graph.microsoft.com/v1.0

Content-Type: application/json
Content-Length: 2045

[
  {
    "@odata.type": "#microsoft.graph.contact",
    "assistantName": "String",
    "birthday": "DateTimeOffset",
    "businessAddress": {
      "@odata.type": "#microsoft.graph.physicalAddress",
      "city": "String",
      "countryOrRegion": "String",
      "postalCode": "String",
      "state": "String",
      "street": "String"
    },
    "businessHomePage": "String",
    "businessPhones": [
      "String"
    ],
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
        "@odata.type": "#microsoft.graph.emailAddress",
        "address": "String",
        "name": "String"
      }
    ],
    "fileAs": "String",
    "generation": "String",
    "givenName": "String",
    "homeAddress": {
      "@odata.type": "#microsoft.graph.physicalAddress",
      "city": "String",
      "countryOrRegion": "String",
      "postalCode": "String",
      "state": "String",
      "street": "String"
    },
    "homePhones": [
      "String"
    ],
    "id": "String(identifier)",
    "imAddresses": [
      "String"
    ],
    "initials": "String",
    "jobTitle": "String",
    "lastModifiedDateTime": "DateTimeOffset",
    "manager": "String",
    "middleName": "String",
    "mobilePhone": "String",
    "nickName": "String",
    "officeLocation": "String",
    "otherAddress": {
      "@odata.type": "#microsoft.graph.physicalAddress",
      "city": "String",
      "countryOrRegion": "String",
      "postalCode": "String",
      "state": "String",
      "street": "String"
    },
    "parentFolderId": "String",
    "personalNotes": "String",
    "profession": "String",
    "spouseName": "String",
    "surname": "String",
    "title": "String",
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
    "businessAddress": {
      "@odata.type": "#microsoft.graph.physicalAddress",
      "city": "String",
      "countryOrRegion": "String",
      "postalCode": "String",
      "state": "String",
      "street": "String"
    },
    "businessHomePage": "String",
    "businessPhones": [
      "String"
    ],
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
        "@odata.type": "#microsoft.graph.emailAddress",
        "address": "String",
        "name": "String"
      }
    ],
    "fileAs": "String",
    "generation": "String",
    "givenName": "String",
    "homeAddress": {
      "@odata.type": "#microsoft.graph.physicalAddress",
      "city": "String",
      "countryOrRegion": "String",
      "postalCode": "String",
      "state": "String",
      "street": "String"
    },
    "homePhones": [
      "String"
    ],
    "id": "String(identifier)",
    "imAddresses": [
      "String"
    ],
    "initials": "String",
    "jobTitle": "String",
    "lastModifiedDateTime": "DateTimeOffset",
    "manager": "String",
    "middleName": "String",
    "mobilePhone": "String",
    "nickName": "String",
    "officeLocation": "String",
    "otherAddress": {
      "@odata.type": "#microsoft.graph.physicalAddress",
      "city": "String",
      "countryOrRegion": "String",
      "postalCode": "String",
      "state": "String",
      "street": "String"
    },
    "parentFolderId": "String",
    "personalNotes": "String",
    "profession": "String",
    "spouseName": "String",
    "surname": "String",
    "title": "String",
    "yomiCompanyName": "String",
    "yomiGivenName": "String",
    "yomiSurname": "String"
  }
]
}

```

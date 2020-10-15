---
title: "Get contact"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "apiPageType"
---

# Get contact

Namespace: microsoft.graph

Read the properties and relationships a contact object.

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

If successful, this method returns a `200 OK` response code and a contact object in the response body.

## Examples

### Request

<!-- {
  "blockType": "request",
  "name": "get_contact"
}
-->

```http
GET https://graph.microsoft.com/v1.0/users/{id}/contacts/{id}

```

### Response

**Note:** The response object shown here might be shortened for readability.

<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Microsoft.OutlookServices.contact"
}
-->

```http
HTTP 1.1 200 OK

Content-Type: application/json
{
  "value": {
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
}

```

---
title: "Update outlookItem"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "apiPageType"
---

# Update outlookItem

Namespace: microsoft.graph

Update the properties of an outlookItem object.

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

In the request body, supply JSON representation of the [outlookItem](../resources/-outlookitem.md) object.

<!-- Actions and Functions -->

<!-- CRUD Methods -->

The following table shows the properties that are required when you create an outlookItem object.

| Property             | Type              | Description |
| :------------------- | :---------------- | :---------- |
| categories           | String collection |             |
| changeKey            | String            |             |
| createdDateTime      | DateTimeOffset    |             |
| id                   | String            | Read-only.  |
| lastModifiedDateTime | DateTimeOffset    |             |

## Response

If successful, this method returns a `200 OK` response code and an outlookItem object in the response body.

## Examples

### Request

<!-- {
  "blockType": "request",
  "name": "update_outlookitem"
}
-->

```http
PATCH https://graph.microsoft.com/v1.0

Content-Type: application/json
Content-Length: 1852

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

```

### Response

**Note:** The response object shown here might be shortened for readability.

<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Microsoft.OutlookServices.outlookItem"
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

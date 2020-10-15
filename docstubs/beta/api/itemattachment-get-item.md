---
title: "Get item"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "apiPageType"
---

# Get item

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Read the properties and relationships of an outlookItem object.

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

If successful, this method returns a `200 OK` response code and an outlookItem object in the response body.

## Examples

### Request

<!-- {
  "blockType": "request",
  "name": "get_item"
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
}

```

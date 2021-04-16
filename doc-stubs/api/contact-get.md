---
title: "Get contact"
description: "Read the properties and relationships of a contact object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get contact
Namespace: microsoft.graph



Read the properties and relationships of a [contact](../resources/contact.md) object.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from least to most privileged)|
|:---|:---|
|Delegated (work or school account)|**TODO: Provide applicable permissions.**|
|Delegated (personal Microsoft account)|**TODO: Provide applicable permissions.**|
|Application|**TODO: Provide applicable permissions.**|

## HTTP request

<!-- {
  "blockType": "ignored"
}
-->
``` http
GET /me/contacts/{contactId}
```

## Optional query parameters
This method supports some of the OData query parameters to help customize the response. For general information, see [OData query parameters](/graph/query-parameters).

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|

## Request body
Do not supply a request body for this method.

## Response

If successful, this method returns a `200 OK` response code and a [contact](../resources/contact.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_contact"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/me/contacts/{contactId}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.contact"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.contact",
    "id": "e853e491-e491-e853-91e4-53e891e453e8",
    "categories": [
      "String"
    ],
    "changeKey": "String",
    "createdDateTime": "String (timestamp)",
    "lastModifiedDateTime": "String (timestamp)",
    "assistantName": "String",
    "birthday": "String (timestamp)",
    "children": [
      "String"
    ],
    "companyName": "String",
    "department": "String",
    "displayName": "String",
    "emailAddresses": [
      {
        "@odata.type": "microsoft.graph.typedEmailAddress"
      }
    ],
    "fileAs": "String",
    "flag": {
      "@odata.type": "microsoft.graph.followupFlag"
    },
    "gender": "String",
    "generation": "String",
    "givenName": "String",
    "imAddresses": [
      "String"
    ],
    "initials": "String",
    "isFavorite": "Boolean",
    "jobTitle": "String",
    "manager": "String",
    "middleName": "String",
    "nickName": "String",
    "officeLocation": "String",
    "parentFolderId": "String",
    "personalNotes": "String",
    "phones": [
      {
        "@odata.type": "microsoft.graph.phone"
      }
    ],
    "postalAddresses": [
      {
        "@odata.type": "microsoft.graph.physicalAddress"
      }
    ],
    "profession": "String",
    "spouseName": "String",
    "surname": "String",
    "title": "String",
    "websites": [
      {
        "@odata.type": "microsoft.graph.website"
      }
    ],
    "weddingAnniversary": "Date",
    "yomiCompanyName": "String",
    "yomiGivenName": "String",
    "yomiSurname": "String"
  }
}
```


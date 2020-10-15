---
title: "Create managedEBooks"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "apiPageType"
---

# Create managedEBooks

Namespace: microsoft.graph

Create a new managedEBook object.

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

In the request body, supply JSON representation of the [managedEBook](../resources/intune-managedebook.md) object.

<!-- Actions and Functions -->

<!-- CRUD Methods -->

The following table shows the properties that are required when you create a managedEBook object.

| Property              | Type                                       | Description                                         |
| :-------------------- | :----------------------------------------- | :-------------------------------------------------- |
| createdDateTime       | DateTimeOffset                             | The date and time when the eBook file was created.  |
| description           | String                                     | Description.                                        |
| displayName           | String                                     | Name of the eBook.                                  |
| id                    | String                                     | Key of the entity. Read-only.                       |
| informationUrl        | String                                     | The more information Url.                           |
| largeCover            | [mimeContent](../resources/mimecontent.md) | Book cover.                                         |
| lastModifiedDateTime  | DateTimeOffset                             | The date and time when the eBook was last modified. |
| privacyInformationUrl | String                                     | The privacy statement Url.                          |
| publishedDateTime     | DateTimeOffset                             | The date and time when the eBook was published.     |
| publisher             | String                                     | Publisher.                                          |

## Response

If successful, this method returns a `201 Created` response code and a managedEBook object in the response body.

## Examples

### Request

<!-- {
  "blockType": "request",
  "name": "create_managedebooks"
}
-->

```http
POST https://graph.microsoft.com/v1.0

Content-Type: application/json
Content-Length: 778

[
  {
    "@odata.type": "#microsoft.graph.iosVppEBook",
    "appleId": "String",
    "createdDateTime": "DateTimeOffset",
    "description": "String",
    "displayName": "String",
    "genres": [
      "String"
    ],
    "id": "String(identifier)",
    "informationUrl": "String",
    "language": "String",
    "largeCover": {
      "@odata.type": "#microsoft.graph.mimeContent",
      "type": "String",
      "value": "Binary"
    },
    "lastModifiedDateTime": "DateTimeOffset",
    "privacyInformationUrl": "String",
    "publishedDateTime": "DateTimeOffset",
    "publisher": "String",
    "seller": "String",
    "totalLicenseCount": "Int32",
    "usedLicenseCount": "Int32",
    "vppOrganizationName": "String",
    "vppTokenId": "Guid"
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
HTTP 1.1 201 Created

Content-Type: application/json
{
  "value": [
  {
    "@odata.type": "#microsoft.graph.iosVppEBook",
    "appleId": "String",
    "createdDateTime": "DateTimeOffset",
    "description": "String",
    "displayName": "String",
    "genres": [
      "String"
    ],
    "id": "String(identifier)",
    "informationUrl": "String",
    "language": "String",
    "largeCover": {
      "@odata.type": "#microsoft.graph.mimeContent",
      "type": "String",
      "value": "Binary"
    },
    "lastModifiedDateTime": "DateTimeOffset",
    "privacyInformationUrl": "String",
    "publishedDateTime": "DateTimeOffset",
    "publisher": "String",
    "seller": "String",
    "totalLicenseCount": "Int32",
    "usedLicenseCount": "Int32",
    "vppOrganizationName": "String",
    "vppTokenId": "Guid"
  }
]
}

```

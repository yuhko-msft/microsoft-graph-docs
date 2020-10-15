---
title: "Create iosVppEBook"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "apiPageType"
---

# Create iosVppEBook

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new iosVppEBook object.

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

In the request body, supply JSON representation of the [iosVppEBook](../resources/intune-iosvppebook.md) object.

<!-- Actions and Functions -->

<!-- CRUD Methods -->

The following table shows the properties that are required when you create an iosVppEBook object.

| Property            | Type              | Description                                  |
| :------------------ | :---------------- | :------------------------------------------- |
| appleId             | String            | The Apple ID associated with Vpp token.      |
| genres              | String collection | Genres.                                      |
| language            | String            | Language.                                    |
| roleScopeTagIds     | String collection | List of Scope Tags for this Entity instance. |
| seller              | String            | Seller.                                      |
| totalLicenseCount   | Int32             | Total license count.                         |
| usedLicenseCount    | Int32             | Used license count.                          |
| vppOrganizationName | String            | The Vpp token's organization name.           |
| vppTokenId          | Guid              | The Vpp token ID.                            |

## Response

If successful, this method returns a `201 Created` response code and an iosVppEBook object in the response body.

## Examples

### Request

<!-- {
  "blockType": "request",
  "name": "create_iosvppebook"
}
-->

```http
POST https://graph.microsoft.com/beta

Content-Type: application/json
Content-Length: 731

{
  "@odata.type": "#microsoft.graph.iosVppEBook",
  "appleId": "String",
  "createdDateTime": "DateTimeOffset",
  "description": "String",
  "displayName": "String",
  "genres": [
    "String"
  ],
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
  "roleScopeTagIds": [
    "String"
  ],
  "seller": "String",
  "totalLicenseCount": "Int32",
  "usedLicenseCount": "Int32",
  "vppOrganizationName": "String",
  "vppTokenId": "Guid"
}

```

### Response

**Note:** The response object shown here might be shortened for readability.

<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.management.services.api.iosVppEBook"
}
-->

```http
HTTP 1.1 201 Created

Content-Type: application/json
{
  "value": {
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
  "roleScopeTagIds": [
    "String"
  ],
  "seller": "String",
  "totalLicenseCount": "Int32",
  "usedLicenseCount": "Int32",
  "vppOrganizationName": "String",
  "vppTokenId": "Guid"
}
}

```

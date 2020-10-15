---
title: "Update orgContact"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "apiPageType"
---

# Update orgContact

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of an orgContact object.

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

In the request body, supply JSON representation of the [orgContact](../resources/-orgcontact.md) object.

<!-- Actions and Functions -->

<!-- CRUD Methods -->

The following table shows the properties that are required when you create an orgContact object.

| Property                     | Type                                                                                  | Description |
| :--------------------------- | :------------------------------------------------------------------------------------ | :---------- |
| addresses                    | [physicalOfficeAddress](../resources/physicalofficeaddress.md) collection             |             |
| companyName                  | String                                                                                |             |
| department                   | String                                                                                |             |
| displayName                  | String                                                                                |             |
| givenName                    | String                                                                                |             |
| jobTitle                     | String                                                                                |             |
| mail                         | String                                                                                |             |
| mailNickname                 | String                                                                                |             |
| onPremisesLastSyncDateTime   | DateTimeOffset                                                                        |             |
| onPremisesProvisioningErrors | [onPremisesProvisioningError](../resources/onpremisesprovisioningerror.md) collection |             |
| onPremisesSyncEnabled        | Boolean                                                                               |             |
| phones                       | [phone](../resources/phone.md) collection                                             |             |
| proxyAddresses               | String collection                                                                     |             |
| surname                      | String                                                                                |             |

## Response

If successful, this method returns a `200 OK` response code and an orgContact object in the response body.

## Examples

### Request

<!-- {
  "blockType": "request",
  "name": "update_orgcontact"
}
-->

```http
PATCH https://graph.microsoft.com/beta/contacts/{id}

Content-Type: application/json
Content-Length: 1115

{
  "@odata.type": "#microsoft.graph.orgContact",
  "addresses": [
    {
      "@odata.type": "#microsoft.graph.physicalOfficeAddress",
      "city": "String",
      "countryOrRegion": "String",
      "officeLocation": "String",
      "postalCode": "String",
      "state": "String",
      "street": "String"
    }
  ],
  "companyName": "String",
  "deletedDateTime": "DateTimeOffset",
  "department": "String",
  "displayName": "String",
  "givenName": "String",
  "jobTitle": "String",
  "mail": "String",
  "mailNickname": "String",
  "onPremisesLastSyncDateTime": "DateTimeOffset",
  "onPremisesProvisioningErrors": [
    {
      "@odata.type": "#microsoft.graph.onPremisesProvisioningError",
      "category": "String",
      "occurredDateTime": "DateTimeOffset",
      "propertyCausingError": "String",
      "value": "String"
    }
  ],
  "onPremisesSyncEnabled": "Boolean",
  "phones": [
    {
      "@odata.type": "#microsoft.graph.phone",
      "number": "String",
      "type": "String"
    }
  ],
  "proxyAddresses": [
    "String"
  ],
  "surname": "String"
}

```

### Response

**Note:** The response object shown here might be shortened for readability.

<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Microsoft.DirectoryServices.orgContact"
}
-->

```http
HTTP 1.1 200 OK

Content-Type: application/json
{
  "value": {
  "@odata.type": "#microsoft.graph.orgContact",
  "addresses": [
    {
      "@odata.type": "#microsoft.graph.physicalOfficeAddress",
      "city": "String",
      "countryOrRegion": "String",
      "officeLocation": "String",
      "postalCode": "String",
      "state": "String",
      "street": "String"
    }
  ],
  "companyName": "String",
  "deletedDateTime": "DateTimeOffset",
  "department": "String",
  "displayName": "String",
  "givenName": "String",
  "id": "String(identifier)",
  "jobTitle": "String",
  "mail": "String",
  "mailNickname": "String",
  "onPremisesLastSyncDateTime": "DateTimeOffset",
  "onPremisesProvisioningErrors": [
    {
      "@odata.type": "#microsoft.graph.onPremisesProvisioningError",
      "category": "String",
      "occurredDateTime": "DateTimeOffset",
      "propertyCausingError": "String",
      "value": "String"
    }
  ],
  "onPremisesSyncEnabled": "Boolean",
  "phones": [
    {
      "@odata.type": "#microsoft.graph.phone",
      "number": "String",
      "type": "String"
    }
  ],
  "proxyAddresses": [
    "String"
  ],
  "surname": "String"
}
}

```

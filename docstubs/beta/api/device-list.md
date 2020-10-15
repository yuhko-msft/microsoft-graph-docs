---
title: "List device"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "apiPageType"
---

# List device

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Get a list of the device objects and their properties.

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

If successful, this method returns a `200 Ok` response code and a device object in the response body.

## Examples

### Request

<!-- {
  "blockType": "request",
  "name": "list_device"
}
-->

```http
GET https://graph.microsoft.com/beta/devices/{id}

```

### Response

**Note:** The response object shown here might be shortened for readability.

<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Microsoft.DirectoryServices.device"
}
-->

```http
HTTP 1.1 200 Ok

Content-Type: application/json
{
  "value": {
  "@odata.type": "#microsoft.graph.device",
  "accountEnabled": "Boolean",
  "alternativeSecurityIds": [
    {
      "@odata.type": "#microsoft.graph.alternativeSecurityId",
      "identityProvider": "String",
      "key": "Binary",
      "type": "Int32"
    }
  ],
  "approximateLastSignInDateTime": "DateTimeOffset",
  "complianceExpirationDateTime": "DateTimeOffset",
  "deletedDateTime": "DateTimeOffset",
  "deviceCategory": "String",
  "deviceId": "String",
  "deviceMetadata": "String",
  "deviceOwnership": "String",
  "deviceVersion": "Int32",
  "displayName": "String",
  "domainName": "String",
  "enrollmentProfileName": "String",
  "enrollmentType": "String",
  "extensionAttributes": {
    "@odata.type": "#microsoft.graph.onPremisesExtensionAttributes",
    "extensionAttribute1": "String",
    "extensionAttribute10": "String",
    "extensionAttribute11": "String",
    "extensionAttribute12": "String",
    "extensionAttribute13": "String",
    "extensionAttribute14": "String",
    "extensionAttribute15": "String",
    "extensionAttribute2": "String",
    "extensionAttribute3": "String",
    "extensionAttribute4": "String",
    "extensionAttribute5": "String",
    "extensionAttribute6": "String",
    "extensionAttribute7": "String",
    "extensionAttribute8": "String",
    "extensionAttribute9": "String"
  },
  "id": "String(identifier)",
  "isCompliant": "Boolean",
  "isManaged": "Boolean",
  "isRooted": "Boolean",
  "managementType": "String",
  "onPremisesLastSyncDateTime": "DateTimeOffset",
  "onPremisesSyncEnabled": "Boolean",
  "operatingSystem": "String",
  "operatingSystemVersion": "String",
  "physicalIds": [
    "String"
  ],
  "profileType": "String",
  "registrationDateTime": "DateTimeOffset",
  "systemLabels": [
    "String"
  ],
  "trustType": "String"
}
}

```

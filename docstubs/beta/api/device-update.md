---
title: "Update device"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "apiPageType"
---

# Update device

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of a device object.

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

In the request body, supply JSON representation of the [device](../resources/-device.md) object.

<!-- Actions and Functions -->

<!-- CRUD Methods -->

The following table shows the properties that are required when you create a device object.

| Property                      | Type                                                                           | Description |
| :---------------------------- | :----------------------------------------------------------------------------- | :---------- |
| accountEnabled                | Boolean                                                                        |             |
| alternativeSecurityIds        | [alternativeSecurityId](../resources/alternativesecurityid.md) collection      |             |
| approximateLastSignInDateTime | DateTimeOffset                                                                 |             |
| complianceExpirationDateTime  | DateTimeOffset                                                                 |             |
| deviceCategory                | String                                                                         |             |
| deviceId                      | String                                                                         |             |
| deviceMetadata                | String                                                                         |             |
| deviceOwnership               | String                                                                         |             |
| deviceVersion                 | Int32                                                                          |             |
| displayName                   | String                                                                         |             |
| domainName                    | String                                                                         |             |
| enrollmentProfileName         | String                                                                         |             |
| enrollmentType                | String                                                                         |             |
| extensionAttributes           | [onPremisesExtensionAttributes](../resources/onpremisesextensionattributes.md) |             |
| isCompliant                   | Boolean                                                                        |             |
| isManaged                     | Boolean                                                                        |             |
| isRooted                      | Boolean                                                                        |             |
| managementType                | String                                                                         |             |
| onPremisesLastSyncDateTime    | DateTimeOffset                                                                 |             |
| onPremisesSyncEnabled         | Boolean                                                                        |             |
| operatingSystem               | String                                                                         |             |
| operatingSystemVersion        | String                                                                         |             |
| physicalIds                   | String collection                                                              |             |
| profileType                   | String                                                                         |             |
| registrationDateTime          | DateTimeOffset                                                                 |             |
| systemLabels                  | String collection                                                              |             |
| trustType                     | String                                                                         |             |

## Response

If successful, this method returns a `200 OK` response code and a device object in the response body.

## Examples

### Request

<!-- {
  "blockType": "request",
  "name": "update_device"
}
-->

```http
PATCH https://graph.microsoft.com/beta/devices/{id}

Content-Type: application/json
Content-Length: 1831

{
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
HTTP 1.1 200 OK

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

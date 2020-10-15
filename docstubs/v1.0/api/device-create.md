---
title: "Create device"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "apiPageType"
---

# Create device

Namespace: microsoft.graph

Create a new device object.

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

| Property                      | Type                                                                      | Description |
| :---------------------------- | :------------------------------------------------------------------------ | :---------- |
| accountEnabled                | Boolean                                                                   |             |
| alternativeSecurityIds        | [alternativeSecurityId](../resources/alternativesecurityid.md) collection |             |
| approximateLastSignInDateTime | DateTimeOffset                                                            |             |
| complianceExpirationDateTime  | DateTimeOffset                                                            |             |
| deviceId                      | String                                                                    |             |
| deviceMetadata                | String                                                                    |             |
| deviceVersion                 | Int32                                                                     |             |
| displayName                   | String                                                                    |             |
| isCompliant                   | Boolean                                                                   |             |
| isManaged                     | Boolean                                                                   |             |
| mdmAppId                      | String                                                                    |             |
| onPremisesLastSyncDateTime    | DateTimeOffset                                                            |             |
| onPremisesSyncEnabled         | Boolean                                                                   |             |
| operatingSystem               | String                                                                    |             |
| operatingSystemVersion        | String                                                                    |             |
| physicalIds                   | String collection                                                         |             |
| profileType                   | String                                                                    |             |
| systemLabels                  | String collection                                                         |             |
| trustType                     | String                                                                    |             |

## Response

If successful, this method returns a `201 Created` response code and a device object in the response body.

## Examples

### Request

<!-- {
  "blockType": "request",
  "name": "create_device"
}
-->

```http
POST https://graph.microsoft.com/v1.0/devices/{id}

Content-Type: application/json
Content-Length: 916

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
  "deviceId": "String",
  "deviceMetadata": "String",
  "deviceVersion": "Int32",
  "displayName": "String",
  "isCompliant": "Boolean",
  "isManaged": "Boolean",
  "mdmAppId": "String",
  "onPremisesLastSyncDateTime": "DateTimeOffset",
  "onPremisesSyncEnabled": "Boolean",
  "operatingSystem": "String",
  "operatingSystemVersion": "String",
  "physicalIds": [
    "String"
  ],
  "profileType": "String",
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
HTTP 1.1 201 Created

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
  "deviceId": "String",
  "deviceMetadata": "String",
  "deviceVersion": "Int32",
  "displayName": "String",
  "id": "String(identifier)",
  "isCompliant": "Boolean",
  "isManaged": "Boolean",
  "mdmAppId": "String",
  "onPremisesLastSyncDateTime": "DateTimeOffset",
  "onPremisesSyncEnabled": "Boolean",
  "operatingSystem": "String",
  "operatingSystemVersion": "String",
  "physicalIds": [
    "String"
  ],
  "profileType": "String",
  "systemLabels": [
    "String"
  ],
  "trustType": "String"
}
}

```

---
title: "Get device"
description: "Read the properties and relationships of a device object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get device
Namespace: microsoft.graph



Read the properties and relationships of a [device](../resources/device.md) object.

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
GET /devices/{devicesId}
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

If successful, this method returns a `200 OK` response code and a [device](../resources/device.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_device"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/devices/{devicesId}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Microsoft.DirectoryServices.device"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#Microsoft.DirectoryServices.device",
    "id": "7830a71a-a71a-7830-1aa7-30781aa73078",
    "deletedDateTime": "String (timestamp)",
    "accountEnabled": "Boolean",
    "alternativeSecurityIds": [
      {
        "@odata.type": "microsoft.graph.alternativeSecurityId"
      }
    ],
    "approximateLastSignInDateTime": "String (timestamp)",
    "complianceExpirationDateTime": "String (timestamp)",
    "deviceCategory": "String",
    "deviceId": "String",
    "deviceMetadata": "String",
    "deviceOwnership": "String",
    "deviceVersion": "Integer",
    "displayName": "String",
    "domainName": "String",
    "enrollmentProfileName": "String",
    "enrollmentType": "String",
    "isCompliant": "Boolean",
    "isManaged": "Boolean",
    "isRooted": "Boolean",
    "managementType": "String",
    "mdmAppId": "String",
    "onPremisesLastSyncDateTime": "String (timestamp)",
    "onPremisesSyncEnabled": "Boolean",
    "operatingSystem": "String",
    "operatingSystemVersion": "String",
    "physicalIds": [
      "String"
    ],
    "profileType": "String",
    "registrationDateTime": "String (timestamp)",
    "systemLabels": [
      "String"
    ],
    "trustType": "String"
  }
}
```


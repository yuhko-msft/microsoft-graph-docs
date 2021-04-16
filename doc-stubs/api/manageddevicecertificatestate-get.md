---
title: "Get managedDeviceCertificateState"
description: "Read the properties and relationships of a managedDeviceCertificateState object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get managedDeviceCertificateState
Namespace: microsoft.graph



Read the properties and relationships of a [managedDeviceCertificateState](../resources/manageddevicecertificatestate.md) object.

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
GET /managedDeviceCertificateState
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

If successful, this method returns a `200 OK` response code and a [managedDeviceCertificateState](../resources/manageddevicecertificatestate.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_manageddevicecertificatestate"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/managedDeviceCertificateState
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.managedDeviceCertificateState"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.managedDeviceCertificateState",
    "id": "3777a9e9-a9e9-3777-e9a9-7737e9a97737",
    "certificateEnhancedKeyUsage": "String",
    "certificateErrorCode": "Integer",
    "certificateExpirationDateTime": "String (timestamp)",
    "certificateIssuanceDateTime": "String (timestamp)",
    "certificateIssuanceState": "String",
    "certificateIssuer": "String",
    "certificateKeyLength": "Integer",
    "certificateKeyStorageProvider": "String",
    "certificateKeyUsage": "String",
    "certificateLastIssuanceStateChangedDateTime": "String (timestamp)",
    "certificateProfileDisplayName": "String",
    "certificateRevokeStatus": "String",
    "certificateSerialNumber": "String",
    "certificateSubjectAlternativeNameFormat": "String",
    "certificateSubjectAlternativeNameFormatString": "String",
    "certificateSubjectNameFormat": "String",
    "certificateSubjectNameFormatString": "String",
    "certificateThumbprint": "String",
    "certificateValidityPeriod": "Integer",
    "certificateValidityPeriodUnits": "String",
    "deviceDisplayName": "String",
    "devicePlatform": "String",
    "lastCertificateStateChangeDateTime": "String (timestamp)",
    "userDisplayName": "String"
  }
}
```


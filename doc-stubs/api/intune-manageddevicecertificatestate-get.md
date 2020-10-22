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

Read the properties and relationships of a [managedDeviceCertificateState](../resources/intune-manageddevicecertificatestate.md) object.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from most to least privileged)|
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

If successful, this method returns a `200 OK` response code and a [managedDeviceCertificateState](../resources/intune-manageddevicecertificatestate.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_manageddevicecertificatestate"
}
-->
``` http
GET https://graph.microsoft.com/beta/managedDeviceCertificateState
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
    "id": "f9ac4030-4030-f9ac-3040-acf93040acf9",
    "devicePlatform": "String",
    "certificateKeyUsage": "String",
    "certificateValidityPeriodUnits": "String",
    "certificateIssuanceState": "String",
    "certificateKeyStorageProvider": "String",
    "certificateSubjectNameFormat": "String",
    "certificateSubjectAlternativeNameFormat": "String",
    "certificateRevokeStatus": "String",
    "certificateProfileDisplayName": "String",
    "deviceDisplayName": "String",
    "userDisplayName": "String",
    "certificateExpirationDateTime": "String (timestamp)",
    "certificateLastIssuanceStateChangedDateTime": "String (timestamp)",
    "lastCertificateStateChangeDateTime": "String (timestamp)",
    "certificateIssuer": "String",
    "certificateThumbprint": "String",
    "certificateSerialNumber": "String",
    "certificateKeyLength": "Integer",
    "certificateEnhancedKeyUsage": "String",
    "certificateValidityPeriod": "Integer",
    "certificateSubjectNameFormatString": "String",
    "certificateSubjectAlternativeNameFormatString": "String",
    "certificateIssuanceDateTime": "String (timestamp)",
    "certificateErrorCode": "Integer"
  }
}
```


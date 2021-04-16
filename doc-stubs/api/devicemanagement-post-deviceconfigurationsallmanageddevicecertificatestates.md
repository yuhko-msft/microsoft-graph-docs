---
title: "Create managedAllDeviceCertificateState"
description: "Create a new managedAllDeviceCertificateState object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create managedAllDeviceCertificateState
Namespace: microsoft.graph



Create a new managedAllDeviceCertificateState object.

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
POST /deviceManagement/deviceConfigurationsAllManagedDeviceCertificateStates
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [managedAllDeviceCertificateState](../resources/managedalldevicecertificatestate.md) object.

The following table shows the properties that are required when you create the [managedAllDeviceCertificateState](../resources/managedalldevicecertificatestate.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|certificateExpirationDateTime|DateTimeOffset|Certificate expiry date|
|certificateExtendedKeyUsages|String|Enhanced Key Usage|
|certificateIssuanceDateTime|DateTimeOffset|Issuance date|
|certificateIssuerName|String|Issuer|
|certificateKeyUsages|Int32|Key Usage|
|certificateRevokeStatus|certificateRevocationStatus|Revoke status. Possible values are: `none`, `pending`, `issued`, `failed`, `revoked`.|
|certificateRevokeStatusLastChangeDateTime|DateTimeOffset|The time the revoke status was last changed|
|certificateSerialNumber|String|Serial number|
|certificateSubjectName|String|Certificate subject name|
|certificateThumbprint|String|Thumbprint|
|managedDeviceDisplayName|String|Device display name|
|userPrincipalName|String|User principal name|



## Response

If successful, this method returns a `201 Created` response code and a [managedAllDeviceCertificateState](../resources/managedalldevicecertificatestate.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_managedalldevicecertificatestate_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/deviceManagement/deviceConfigurationsAllManagedDeviceCertificateStates
Content-Type: application/json
Content-length: 611

{
  "@odata.type": "#microsoft.graph.managedAllDeviceCertificateState",
  "certificateExpirationDateTime": "String (timestamp)",
  "certificateExtendedKeyUsages": "String",
  "certificateIssuanceDateTime": "String (timestamp)",
  "certificateIssuerName": "String",
  "certificateKeyUsages": "Integer",
  "certificateRevokeStatus": "String",
  "certificateRevokeStatusLastChangeDateTime": "String (timestamp)",
  "certificateSerialNumber": "String",
  "certificateSubjectName": "String",
  "certificateThumbprint": "String",
  "managedDeviceDisplayName": "String",
  "userPrincipalName": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.managedAllDeviceCertificateState"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.managedAllDeviceCertificateState",
  "id": "a4238f9c-8f9c-a423-9c8f-23a49c8f23a4",
  "certificateExpirationDateTime": "String (timestamp)",
  "certificateExtendedKeyUsages": "String",
  "certificateIssuanceDateTime": "String (timestamp)",
  "certificateIssuerName": "String",
  "certificateKeyUsages": "Integer",
  "certificateRevokeStatus": "String",
  "certificateRevokeStatusLastChangeDateTime": "String (timestamp)",
  "certificateSerialNumber": "String",
  "certificateSubjectName": "String",
  "certificateThumbprint": "String",
  "managedDeviceDisplayName": "String",
  "userPrincipalName": "String"
}
```


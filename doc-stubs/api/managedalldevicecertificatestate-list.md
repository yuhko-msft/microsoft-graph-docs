---
title: "List managedAllDeviceCertificateStates"
description: "Get a list of the managedAllDeviceCertificateState objects and their properties."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List managedAllDeviceCertificateStates
Namespace: microsoft.graph



Get a list of the [managedAllDeviceCertificateState](../resources/managedalldevicecertificatestate.md) objects and their properties.

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
GET /deviceManagement/deviceConfigurationsAllManagedDeviceCertificateStates
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

If successful, this method returns a `200 OK` response code and a collection of [managedAllDeviceCertificateState](../resources/managedalldevicecertificatestate.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "list_managedalldevicecertificatestate"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/deviceManagement/deviceConfigurationsAllManagedDeviceCertificateStates
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.managedAllDeviceCertificateState)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
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
  ]
}
```


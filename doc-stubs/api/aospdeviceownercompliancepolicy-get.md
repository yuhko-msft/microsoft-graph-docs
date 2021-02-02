---
title: "Get aospDeviceOwnerCompliancePolicy"
description: "Read the properties and relationships of an aospDeviceOwnerCompliancePolicy object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get aospDeviceOwnerCompliancePolicy
Namespace: microsoft.graph

Read the properties and relationships of an [aospDeviceOwnerCompliancePolicy](../resources/aospdeviceownercompliancepolicy.md) object.

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
GET ** Entity URI for microsoft.graph.aospDeviceOwnerCompliancePolicy not found
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

If successful, this method returns a `200 OK` response code and an [aospDeviceOwnerCompliancePolicy](../resources/aospdeviceownercompliancepolicy.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_aospdeviceownercompliancepolicy"
}
-->
``` http
GET https://graph.microsoft.com/beta** Entity URI for microsoft.graph.aospDeviceOwnerCompliancePolicy not found
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.aospDeviceOwnerCompliancePolicy"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.aospDeviceOwnerCompliancePolicy",
    "id": "e5c44bd7-4bd7-e5c4-d74b-c4e5d74bc4e5",
    "roleScopeTagIds": [
      "String"
    ],
    "createdDateTime": "String (timestamp)",
    "description": "String",
    "lastModifiedDateTime": "String (timestamp)",
    "displayName": "String",
    "version": "Integer",
    "osMinimumVersion": "String",
    "osMaximumVersion": "String",
    "minAndroidSecurityPatchLevel": "String",
    "passwordRequired": "Boolean",
    "passwordRequiredType": "String",
    "passwordMinutesOfInactivityBeforeLock": "Integer",
    "passwordMinimumLength": "Integer",
    "storageRequireEncryption": "Boolean"
  }
}
```


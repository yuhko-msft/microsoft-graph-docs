---
title: "Update aospDeviceOwnerCompliancePolicy"
description: "Update the properties of an aospDeviceOwnerCompliancePolicy object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update aospDeviceOwnerCompliancePolicy
Namespace: microsoft.graph

Update the properties of an [aospDeviceOwnerCompliancePolicy](../resources/aospdeviceownercompliancepolicy.md) object.

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
PATCH ** Entity URI for microsoft.graph.aospDeviceOwnerCompliancePolicy not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [aospDeviceOwnerCompliancePolicy](../resources/aospdeviceownercompliancepolicy.md) object.

The following table shows the properties that are required when you update the [aospDeviceOwnerCompliancePolicy](../resources/aospdeviceownercompliancepolicy.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|roleScopeTagIds|String collection|**TODO: Add Description** Inherited from [deviceCompliancePolicy](../resources/intune-devicecompliancepolicy.md)|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [deviceCompliancePolicy](../resources/intune-devicecompliancepolicy.md)|
|description|String|**TODO: Add Description** Inherited from [deviceCompliancePolicy](../resources/intune-devicecompliancepolicy.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [deviceCompliancePolicy](../resources/intune-devicecompliancepolicy.md)|
|displayName|String|**TODO: Add Description** Inherited from [deviceCompliancePolicy](../resources/intune-devicecompliancepolicy.md)|
|version|Int32|**TODO: Add Description** Inherited from [deviceCompliancePolicy](../resources/intune-devicecompliancepolicy.md)|
|osMinimumVersion|String|**TODO: Add Description**|
|osMaximumVersion|String|**TODO: Add Description**|
|minAndroidSecurityPatchLevel|String|**TODO: Add Description**|
|passwordRequired|Boolean|**TODO: Add Description**|
|passwordRequiredType|androidDeviceOwnerRequiredPasswordType|**TODO: Add Description**. Possible values are: `deviceDefault`, `required`, `numeric`, `numericComplex`, `alphabetic`, `alphanumeric`, `alphanumericWithSymbols`, `lowSecurityBiometric`, `customPassword`.|
|passwordMinutesOfInactivityBeforeLock|Int32|**TODO: Add Description**|
|passwordMinimumLength|Int32|**TODO: Add Description**|
|storageRequireEncryption|Boolean|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [aospDeviceOwnerCompliancePolicy](../resources/aospdeviceownercompliancepolicy.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_aospdeviceownercompliancepolicy"
}
-->
``` http
PATCH https://graph.microsoft.com/beta** Entity URI for microsoft.graph.aospDeviceOwnerCompliancePolicy not found
Content-Type: application/json
Content-length: 516

{
  "@odata.type": "#microsoft.graph.aospDeviceOwnerCompliancePolicy",
  "roleScopeTagIds": [
    "String"
  ],
  "description": "String",
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
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
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
```


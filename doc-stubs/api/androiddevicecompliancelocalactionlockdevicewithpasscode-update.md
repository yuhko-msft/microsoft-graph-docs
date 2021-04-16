---
title: "Update androidDeviceComplianceLocalActionLockDeviceWithPasscode"
description: "Update the properties of an androidDeviceComplianceLocalActionLockDeviceWithPasscode object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update androidDeviceComplianceLocalActionLockDeviceWithPasscode
Namespace: microsoft.graph



Update the properties of an [androidDeviceComplianceLocalActionLockDeviceWithPasscode](../resources/androiddevicecompliancelocalactionlockdevicewithpasscode.md) object.

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
PATCH /androidDeviceComplianceLocalActionLockDeviceWithPasscode
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [androidDeviceComplianceLocalActionLockDeviceWithPasscode](../resources/androiddevicecompliancelocalactionlockdevicewithpasscode.md) object.

The following table shows the properties that are required when you update the [androidDeviceComplianceLocalActionLockDeviceWithPasscode](../resources/androiddevicecompliancelocalactionlockdevicewithpasscode.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|gracePeriodInMinutes|Int32|Number of minutes to wait till a local action is enforced. Valid values 0 to 2147483647 Inherited from [androidDeviceComplianceLocalActionBase](../resources/androiddevicecompliancelocalactionbase.md)|
|passcode|String|Passcode to reset to Android device. This property is read-only.|
|passcodeSignInFailureCountBeforeWipe|Int32|Number of sign in failures before wiping device, the value can be 4-11. Valid values 4 to 11|



## Response

If successful, this method returns a `200 OK` response code and an updated [androidDeviceComplianceLocalActionLockDeviceWithPasscode](../resources/androiddevicecompliancelocalactionlockdevicewithpasscode.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_androiddevicecompliancelocalactionlockdevicewithpasscode"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/androidDeviceComplianceLocalActionLockDeviceWithPasscode
Content-Type: application/json
Content-length: 215

{
  "@odata.type": "#microsoft.graph.androidDeviceComplianceLocalActionLockDeviceWithPasscode",
  "gracePeriodInMinutes": "Integer",
  "passcode": "String",
  "passcodeSignInFailureCountBeforeWipe": "Integer"
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
  "@odata.type": "#microsoft.graph.androidDeviceComplianceLocalActionLockDeviceWithPasscode",
  "id": "3da67ba6-7ba6-3da6-a67b-a63da67ba63d",
  "gracePeriodInMinutes": "Integer",
  "passcode": "String",
  "passcodeSignInFailureCountBeforeWipe": "Integer"
}
```


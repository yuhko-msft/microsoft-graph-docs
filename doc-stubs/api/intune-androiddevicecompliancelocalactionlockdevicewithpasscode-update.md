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

Update the properties of an [androidDeviceComplianceLocalActionLockDeviceWithPasscode](../resources/intune-androiddevicecompliancelocalactionlockdevicewithpasscode.md) object.

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
PATCH /androidDeviceComplianceLocalActionLockDeviceWithPasscode
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [androidDeviceComplianceLocalActionLockDeviceWithPasscode](../resources/intune-androiddevicecompliancelocalactionlockdevicewithpasscode.md) object.

The following table shows the properties that are required when you create the [androidDeviceComplianceLocalActionLockDeviceWithPasscode](../resources/intune-androiddevicecompliancelocalactionlockdevicewithpasscode.md).

|Property|Type|Description|
|:---|:---|:---|
|gracePeriodInMinutes|Int32|**TODO: Add Description** Inherited from [androidDeviceComplianceLocalActionBase](../resources/intune-androiddevicecompliancelocalactionbase.md)|
|passcode|String|**TODO: Add Description**|
|passcodeSignInFailureCountBeforeWipe|Int32|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [androidDeviceComplianceLocalActionLockDeviceWithPasscode](../resources/intune-androiddevicecompliancelocalactionlockdevicewithpasscode.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_androiddevicecompliancelocalactionlockdevicewithpasscode"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/androidDeviceComplianceLocalActionLockDeviceWithPasscode
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
  "gracePeriodInMinutes": "Integer",
  "passcode": "String",
  "passcodeSignInFailureCountBeforeWipe": "Integer"
}
```


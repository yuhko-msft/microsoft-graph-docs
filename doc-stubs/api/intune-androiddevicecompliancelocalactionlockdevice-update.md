---
title: "Update androidDeviceComplianceLocalActionLockDevice"
description: "Update the properties of an androidDeviceComplianceLocalActionLockDevice object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update androidDeviceComplianceLocalActionLockDevice
Namespace: microsoft.graph

Update the properties of an [androidDeviceComplianceLocalActionLockDevice](../resources/intune-androiddevicecompliancelocalactionlockdevice.md) object.

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
PATCH /androidDeviceComplianceLocalActionLockDevice
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [androidDeviceComplianceLocalActionLockDevice](../resources/intune-androiddevicecompliancelocalactionlockdevice.md) object.

The following table shows the properties that are required when you create the [androidDeviceComplianceLocalActionLockDevice](../resources/intune-androiddevicecompliancelocalactionlockdevice.md).

|Property|Type|Description|
|:---|:---|:---|
|gracePeriodInMinutes|Int32|**TODO: Add Description** Inherited from [androidDeviceComplianceLocalActionBase](../resources/intune-androiddevicecompliancelocalactionbase.md)|



## Response

If successful, this method returns a `200 OK` response code and an updated [androidDeviceComplianceLocalActionLockDevice](../resources/intune-androiddevicecompliancelocalactionlockdevice.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_androiddevicecompliancelocalactionlockdevice"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/androidDeviceComplianceLocalActionLockDevice
Content-Type: application/json
Content-length: 124

{
  "@odata.type": "#microsoft.graph.androidDeviceComplianceLocalActionLockDevice",
  "gracePeriodInMinutes": "Integer"
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
  "@odata.type": "#microsoft.graph.androidDeviceComplianceLocalActionLockDevice",
  "gracePeriodInMinutes": "Integer"
}
```


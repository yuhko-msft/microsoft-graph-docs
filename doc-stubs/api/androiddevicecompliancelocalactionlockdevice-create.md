---
title: "Create androidDeviceComplianceLocalActionLockDevice"
description: "Create a new androidDeviceComplianceLocalActionLockDevice object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create androidDeviceComplianceLocalActionLockDevice
Namespace: microsoft.graph



Create a new [androidDeviceComplianceLocalActionLockDevice](../resources/androiddevicecompliancelocalactionlockdevice.md) object.

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
POST ** Collection URI for microsoft.graph.androidDeviceComplianceLocalActionLockDevice not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [androidDeviceComplianceLocalActionLockDevice](../resources/androiddevicecompliancelocalactionlockdevice.md) object.

The following table shows the properties that are required when you create the [androidDeviceComplianceLocalActionLockDevice](../resources/androiddevicecompliancelocalactionlockdevice.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|gracePeriodInMinutes|Int32|Number of minutes to wait till a local action is enforced. Valid values 0 to 2147483647 Inherited from [androidDeviceComplianceLocalActionBase](../resources/androiddevicecompliancelocalactionbase.md)|



## Response

If successful, this method returns a `201 Created` response code and an [androidDeviceComplianceLocalActionLockDevice](../resources/androiddevicecompliancelocalactionlockdevice.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_androiddevicecompliancelocalactionlockdevice_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0** Collection URI for microsoft.graph.androidDeviceComplianceLocalActionLockDevice not found
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
  "truncated": true,
  "@odata.type": "microsoft.graph.androidDeviceComplianceLocalActionLockDevice"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.androidDeviceComplianceLocalActionLockDevice",
  "id": "90b22158-2158-90b2-5821-b2905821b290",
  "gracePeriodInMinutes": "Integer"
}
```


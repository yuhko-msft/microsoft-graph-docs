---
title: "Update windowsInformationProtectionWipeAction"
description: "Update the properties of a windowsInformationProtectionWipeAction object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update windowsInformationProtectionWipeAction
Namespace: microsoft.graph



Update the properties of a [windowsInformationProtectionWipeAction](../resources/windowsinformationprotectionwipeaction.md) object.

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
PATCH /deviceAppManagement/windowsInformationProtectionWipeActions/{windowsInformationProtectionWipeActionId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [windowsInformationProtectionWipeAction](../resources/windowsinformationprotectionwipeaction.md) object.

The following table shows the properties that are required when you update the [windowsInformationProtectionWipeAction](../resources/windowsinformationprotectionwipeaction.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastCheckInDateTime|DateTimeOffset|Last checkin time of the device that was targeted by this wipe action.|
|status|actionState|Wipe action status. Possible values are: `none`, `pending`, `canceled`, `active`, `done`, `failed`, `notSupported`.|
|targetedDeviceMacAddress|String|Targeted device Mac address.|
|targetedDeviceName|String|Targeted device name.|
|targetedDeviceRegistrationId|String|The DeviceRegistrationId being targeted by this wipe action.|
|targetedUserId|String|The UserId being targeted by this wipe action.|



## Response

If successful, this method returns a `200 OK` response code and an updated [windowsInformationProtectionWipeAction](../resources/windowsinformationprotectionwipeaction.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_windowsinformationprotectionwipeaction"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/deviceAppManagement/windowsInformationProtectionWipeActions/{windowsInformationProtectionWipeActionId}
Content-Type: application/json
Content-length: 303

{
  "@odata.type": "#microsoft.graph.windowsInformationProtectionWipeAction",
  "lastCheckInDateTime": "String (timestamp)",
  "status": "String",
  "targetedDeviceMacAddress": "String",
  "targetedDeviceName": "String",
  "targetedDeviceRegistrationId": "String",
  "targetedUserId": "String"
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
  "@odata.type": "#microsoft.graph.windowsInformationProtectionWipeAction",
  "id": "ca204e7c-4e7c-ca20-7c4e-20ca7c4e20ca",
  "lastCheckInDateTime": "String (timestamp)",
  "status": "String",
  "targetedDeviceMacAddress": "String",
  "targetedDeviceName": "String",
  "targetedDeviceRegistrationId": "String",
  "targetedUserId": "String"
}
```


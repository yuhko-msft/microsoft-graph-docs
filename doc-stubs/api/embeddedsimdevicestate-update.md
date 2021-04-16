---
title: "Update embeddedSIMDeviceState"
description: "Update the properties of an embeddedSIMDeviceState object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update embeddedSIMDeviceState
Namespace: microsoft.graph



Update the properties of an [embeddedSIMDeviceState](../resources/embeddedsimdevicestate.md) object.

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
PATCH /deviceManagement/embeddedSIMActivationCodePools/{embeddedSIMActivationCodePoolId}/deviceStates/{embeddedSIMDeviceStateId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [embeddedSIMDeviceState](../resources/embeddedsimdevicestate.md) object.

The following table shows the properties that are required when you update the [embeddedSIMDeviceState](../resources/embeddedsimdevicestate.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|createdDateTime|DateTimeOffset|The time the embedded SIM device status was created. Generated service side.|
|deviceName|String|Device name to which the subscription was provisioned e.g. DESKTOP-JOE|
|lastSyncDateTime|DateTimeOffset|The time the embedded SIM device last checked in. Updated service side.|
|modifiedDateTime|DateTimeOffset|The time the embedded SIM device status was last modified. Updated service side.|
|state|embeddedSIMDeviceStateValue|The state of the profile operation applied to the device. Possible values are: `notEvaluated`, `failed`, `installing`, `installed`, `deleting`, `error`, `deleted`, `removedByUser`.|
|stateDetails|String|String description of the provisioning state.|
|universalIntegratedCircuitCardIdentifier|String|The Universal Integrated Circuit Card Identifier (UICCID) identifying the hardware onto which a profile is to be deployed.|
|userName|String|Username which the subscription was provisioned to e.g. joe@contoso.com|



## Response

If successful, this method returns a `200 OK` response code and an updated [embeddedSIMDeviceState](../resources/embeddedsimdevicestate.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_embeddedsimdevicestate"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/deviceManagement/embeddedSIMActivationCodePools/{embeddedSIMActivationCodePoolId}/deviceStates/{embeddedSIMDeviceStateId}
Content-Type: application/json
Content-length: 269

{
  "@odata.type": "#microsoft.graph.embeddedSIMDeviceState",
  "deviceName": "String",
  "lastSyncDateTime": "String (timestamp)",
  "state": "String",
  "stateDetails": "String",
  "universalIntegratedCircuitCardIdentifier": "String",
  "userName": "String"
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
  "@odata.type": "#microsoft.graph.embeddedSIMDeviceState",
  "id": "754a1ff4-1ff4-754a-f41f-4a75f41f4a75",
  "createdDateTime": "String (timestamp)",
  "deviceName": "String",
  "lastSyncDateTime": "String (timestamp)",
  "modifiedDateTime": "String (timestamp)",
  "state": "String",
  "stateDetails": "String",
  "universalIntegratedCircuitCardIdentifier": "String",
  "userName": "String"
}
```


---
title: "Create deviceManagementIntentDeviceState"
description: "Create a new deviceManagementIntentDeviceState object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create deviceManagementIntentDeviceState
Namespace: microsoft.graph



Create a new [deviceManagementIntentDeviceState](../resources/devicemanagementintentdevicestate.md) object.

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
POST /deviceManagement/intents/{deviceManagementIntentId}/deviceStates
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [deviceManagementIntentDeviceState](../resources/devicemanagementintentdevicestate.md) object.

The following table shows the properties that are required when you create the [deviceManagementIntentDeviceState](../resources/devicemanagementintentdevicestate.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|deviceDisplayName|String|Device name that is being reported|
|deviceId|String|Device id that is being reported|
|lastReportedDateTime|DateTimeOffset|Last modified date time of an intent report|
|state|complianceStatus|Device state for an intent. Possible values are: `unknown`, `notApplicable`, `compliant`, `remediated`, `nonCompliant`, `error`, `conflict`, `notAssigned`.|
|userName|String|The user name that is being reported on a device|
|userPrincipalName|String|The user principal name that is being reported on a device|



## Response

If successful, this method returns a `201 Created` response code and a [deviceManagementIntentDeviceState](../resources/devicemanagementintentdevicestate.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_devicemanagementintentdevicestate_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/deviceManagement/intents/{deviceManagementIntentId}/deviceStates
Content-Type: application/json
Content-length: 264

{
  "@odata.type": "#microsoft.graph.deviceManagementIntentDeviceState",
  "deviceDisplayName": "String",
  "deviceId": "String",
  "lastReportedDateTime": "String (timestamp)",
  "state": "String",
  "userName": "String",
  "userPrincipalName": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.deviceManagementIntentDeviceState"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.deviceManagementIntentDeviceState",
  "id": "f829294b-294b-f829-4b29-29f84b2929f8",
  "deviceDisplayName": "String",
  "deviceId": "String",
  "lastReportedDateTime": "String (timestamp)",
  "state": "String",
  "userName": "String",
  "userPrincipalName": "String"
}
```


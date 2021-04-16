---
title: "Update deviceComplianceSettingState"
description: "Update the properties of a deviceComplianceSettingState object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update deviceComplianceSettingState
Namespace: microsoft.graph



Update the properties of a [deviceComplianceSettingState](../resources/devicecompliancesettingstate.md) object.

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
PATCH /deviceManagement/deviceCompliancePolicySettingStateSummaries/{deviceCompliancePolicySettingStateSummaryId}/deviceComplianceSettingStates/{deviceComplianceSettingStateId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [deviceComplianceSettingState](../resources/devicecompliancesettingstate.md) object.

The following table shows the properties that are required when you update the [deviceComplianceSettingState](../resources/devicecompliancesettingstate.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|complianceGracePeriodExpirationDateTime|DateTimeOffset|The DateTime when device compliance grace period expires|
|deviceId|String|The Device Id that is being reported|
|deviceModel|String|The device model that is being reported|
|deviceName|String|The Device Name that is being reported|
|platformType|deviceType|Device platform type. Possible values are: `desktop`, `windowsRT`, `winMO6`, `nokia`, `windowsPhone`, `mac`, `winCE`, `winEmbedded`, `iPhone`, `iPad`, `iPod`, `android`, `iSocConsumer`, `unix`, `macMDM`, `holoLens`, `surfaceHub`, `androidForWork`, `androidEnterprise`, `windows10x`, `androidnGMS`, `chromeOS`, `linux`, `blackberry`, `palm`, `unknown`, `cloudPC`.|
|setting|String|The setting class name and property name.|
|settingName|String|The Setting Name that is being reported|
|state|complianceStatus|The compliance state of the setting. Possible values are: `unknown`, `notApplicable`, `compliant`, `remediated`, `nonCompliant`, `error`, `conflict`, `notAssigned`.|
|userEmail|String|The User email address that is being reported|
|userId|String|The user Id that is being reported|
|userName|String|The User Name that is being reported|
|userPrincipalName|String|The User PrincipalName that is being reported|



## Response

If successful, this method returns a `200 OK` response code and an updated [deviceComplianceSettingState](../resources/devicecompliancesettingstate.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_devicecompliancesettingstate"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/deviceManagement/deviceCompliancePolicySettingStateSummaries/{deviceCompliancePolicySettingStateSummaryId}/deviceComplianceSettingStates/{deviceComplianceSettingStateId}
Content-Type: application/json
Content-length: 429

{
  "@odata.type": "#microsoft.graph.deviceComplianceSettingState",
  "complianceGracePeriodExpirationDateTime": "String (timestamp)",
  "deviceId": "String",
  "deviceModel": "String",
  "deviceName": "String",
  "platformType": "String",
  "setting": "String",
  "settingName": "String",
  "state": "String",
  "userEmail": "String",
  "userId": "String",
  "userName": "String",
  "userPrincipalName": "String"
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
  "@odata.type": "#microsoft.graph.deviceComplianceSettingState",
  "id": "eaa2109f-109f-eaa2-9f10-a2ea9f10a2ea",
  "complianceGracePeriodExpirationDateTime": "String (timestamp)",
  "deviceId": "String",
  "deviceModel": "String",
  "deviceName": "String",
  "platformType": "String",
  "setting": "String",
  "settingName": "String",
  "state": "String",
  "userEmail": "String",
  "userId": "String",
  "userName": "String",
  "userPrincipalName": "String"
}
```


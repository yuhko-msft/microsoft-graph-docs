---
title: "Create managedDeviceMobileAppConfigurationState"
description: "Create a new managedDeviceMobileAppConfigurationState object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create managedDeviceMobileAppConfigurationState
Namespace: microsoft.graph



Create a new [managedDeviceMobileAppConfigurationState](../resources/manageddevicemobileappconfigurationstate.md) object.

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
POST /me/managedDevices/{managedDeviceId}/managedDeviceMobileAppConfigurationStates
POST /users/{usersId}/managedDevices/{managedDeviceId}/managedDeviceMobileAppConfigurationStates
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [managedDeviceMobileAppConfigurationState](../resources/manageddevicemobileappconfigurationstate.md) object.

The following table shows the properties that are required when you create the [managedDeviceMobileAppConfigurationState](../resources/manageddevicemobileappconfigurationstate.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|displayName|String|The name of the policy for this policyBase|
|platformType|policyPlatformType|Platform type that the policy applies to. Possible values are: `android`, `androidForWork`, `iOS`, `macOS`, `windowsPhone81`, `windows81AndLater`, `windows10AndLater`, `androidWorkProfile`, `windows10XProfile`, `all`.|
|settingCount|Int32|Count of how many setting a policy holds|
|settingStates|[managedDeviceMobileAppConfigurationSettingState](../resources/manageddevicemobileappconfigurationsettingstate.md) collection|**TODO: Add Description**|
|state|complianceStatus|The compliance state of the policy. Possible values are: `unknown`, `notApplicable`, `compliant`, `remediated`, `nonCompliant`, `error`, `conflict`, `notAssigned`.|
|userId|String|User unique identifier, must be Guid|
|userPrincipalName|String|User Principal Name|
|version|Int32|The version of the policy|



## Response

If successful, this method returns a `201 Created` response code and a [managedDeviceMobileAppConfigurationState](../resources/manageddevicemobileappconfigurationstate.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_manageddevicemobileappconfigurationstate_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/me/managedDevices/{managedDeviceId}/managedDeviceMobileAppConfigurationStates
Content-Type: application/json
Content-length: 403

{
  "@odata.type": "#microsoft.graph.managedDeviceMobileAppConfigurationState",
  "displayName": "String",
  "platformType": "String",
  "settingCount": "Integer",
  "settingStates": [
    {
      "@odata.type": "microsoft.graph.managedDeviceMobileAppConfigurationSettingState"
    }
  ],
  "state": "String",
  "userId": "String",
  "userPrincipalName": "String",
  "version": "Integer"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.managedDeviceMobileAppConfigurationState"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.managedDeviceMobileAppConfigurationState",
  "id": "616d32ba-32ba-616d-ba32-6d61ba326d61",
  "displayName": "String",
  "platformType": "String",
  "settingCount": "Integer",
  "settingStates": [
    {
      "@odata.type": "microsoft.graph.managedDeviceMobileAppConfigurationSettingState"
    }
  ],
  "state": "String",
  "userId": "String",
  "userPrincipalName": "String",
  "version": "Integer"
}
```


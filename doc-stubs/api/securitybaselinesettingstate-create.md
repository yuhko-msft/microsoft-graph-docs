---
title: "Create securityBaselineSettingState"
description: "Create a new securityBaselineSettingState object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create securityBaselineSettingState
Namespace: microsoft.graph



Create a new [securityBaselineSettingState](../resources/securitybaselinesettingstate.md) object.

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
POST /me/managedDevices/{managedDeviceId}/securityBaselineStates/{securityBaselineStateId}/settingStates
POST /users/{usersId}/managedDevices/{managedDeviceId}/securityBaselineStates/{securityBaselineStateId}/settingStates
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [securityBaselineSettingState](../resources/securitybaselinesettingstate.md) object.

The following table shows the properties that are required when you create the [securityBaselineSettingState](../resources/securitybaselinesettingstate.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|contributingPolicies|[securityBaselineContributingPolicy](../resources/securitybaselinecontributingpolicy.md) collection|The policies that contribute to this setting instance|
|errorCode|String|The error code if the setting is in error state|
|settingCategoryId|String|The setting category id which this setting belongs to|
|settingCategoryName|String|The setting category name which this setting belongs to|
|settingId|String|The setting id guid|
|settingName|String|The setting name that is being reported|
|sourcePolicies|[settingSource](../resources/settingsource.md) collection|The policies that contribute to this setting instance|
|state|securityBaselineComplianceState|The compliance state of the security baseline setting. Possible values are: `unknown`, `secure`, `notApplicable`, `notSecure`, `error`, `conflict`.|



## Response

If successful, this method returns a `201 Created` response code and a [securityBaselineSettingState](../resources/securitybaselinesettingstate.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_securitybaselinesettingstate_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/me/managedDevices/{managedDeviceId}/securityBaselineStates/{securityBaselineStateId}/settingStates
Content-Type: application/json
Content-length: 463

{
  "@odata.type": "#microsoft.graph.securityBaselineSettingState",
  "contributingPolicies": [
    {
      "@odata.type": "microsoft.graph.securityBaselineContributingPolicy"
    }
  ],
  "errorCode": "String",
  "settingCategoryId": "String",
  "settingCategoryName": "String",
  "settingId": "String",
  "settingName": "String",
  "sourcePolicies": [
    {
      "@odata.type": "microsoft.graph.settingSource"
    }
  ],
  "state": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.securityBaselineSettingState"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.securityBaselineSettingState",
  "id": "46b39876-9876-46b3-7698-b3467698b346",
  "contributingPolicies": [
    {
      "@odata.type": "microsoft.graph.securityBaselineContributingPolicy"
    }
  ],
  "errorCode": "String",
  "settingCategoryId": "String",
  "settingCategoryName": "String",
  "settingId": "String",
  "settingName": "String",
  "sourcePolicies": [
    {
      "@odata.type": "microsoft.graph.settingSource"
    }
  ],
  "state": "String"
}
```


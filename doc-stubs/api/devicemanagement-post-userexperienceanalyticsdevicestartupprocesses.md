---
title: "Create userExperienceAnalyticsDeviceStartupProcess"
description: "Create a new userExperienceAnalyticsDeviceStartupProcess object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create userExperienceAnalyticsDeviceStartupProcess
Namespace: microsoft.graph



Create a new userExperienceAnalyticsDeviceStartupProcess object.

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
POST /deviceManagement/userExperienceAnalyticsDeviceStartupProcesses
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [userExperienceAnalyticsDeviceStartupProcess](../resources/userexperienceanalyticsdevicestartupprocess.md) object.

The following table shows the properties that are required when you create the [userExperienceAnalyticsDeviceStartupProcess](../resources/userexperienceanalyticsdevicestartupprocess.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|managedDeviceId|String|The user experience analytics device id.|
|processName|String|User experience analytics device startup process name.|
|productName|String|The user experience analytics device startup process product name.|
|publisher|String|The User experience analytics device startup process publisher.|
|startupImpactInMs|Int32|User experience analytics device startup process impact in milliseconds.|



## Response

If successful, this method returns a `201 Created` response code and a [userExperienceAnalyticsDeviceStartupProcess](../resources/userexperienceanalyticsdevicestartupprocess.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_userexperienceanalyticsdevicestartupprocess_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/deviceManagement/userExperienceAnalyticsDeviceStartupProcesses
Content-Type: application/json
Content-length: 234

{
  "@odata.type": "#microsoft.graph.userExperienceAnalyticsDeviceStartupProcess",
  "managedDeviceId": "String",
  "processName": "String",
  "productName": "String",
  "publisher": "String",
  "startupImpactInMs": "Integer"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.userExperienceAnalyticsDeviceStartupProcess"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.userExperienceAnalyticsDeviceStartupProcess",
  "id": "f8f7bfeb-bfeb-f8f7-ebbf-f7f8ebbff7f8",
  "managedDeviceId": "String",
  "processName": "String",
  "productName": "String",
  "publisher": "String",
  "startupImpactInMs": "Integer"
}
```


---
title: "Create userExperienceAnalyticsDeviceStartupProcessPerformance"
description: "Create a new userExperienceAnalyticsDeviceStartupProcessPerformance object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create userExperienceAnalyticsDeviceStartupProcessPerformance
Namespace: microsoft.graph



Create a new [userExperienceAnalyticsDeviceStartupProcessPerformance](../resources/userexperienceanalyticsdevicestartupprocessperformance.md) object.

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
POST /deviceManagement/userExperienceAnalyticsDeviceStartupProcessPerformance
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [userExperienceAnalyticsDeviceStartupProcessPerformance](../resources/userexperienceanalyticsdevicestartupprocessperformance.md) object.

The following table shows the properties that are required when you create the [userExperienceAnalyticsDeviceStartupProcessPerformance](../resources/userexperienceanalyticsdevicestartupprocessperformance.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|deviceCount|Int64|User experience analytics device startup process summarized count.|
|medianImpactInMs|Int32|User experience analytics device startup process median impact in milliseconds.|
|processName|String|User experience analytics device startup process name.|
|productName|String|The user experience analytics device startup process product name.|
|publisher|String|The User experience analytics device startup process publisher.|
|totalImpactInMs|Int32|User experience analytics device startup process total impact in milliseconds.|



## Response

If successful, this method returns a `201 Created` response code and a [userExperienceAnalyticsDeviceStartupProcessPerformance](../resources/userexperienceanalyticsdevicestartupprocessperformance.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_userexperienceanalyticsdevicestartupprocessperformance_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/deviceManagement/userExperienceAnalyticsDeviceStartupProcessPerformance
Content-Type: application/json
Content-length: 274

{
  "@odata.type": "#microsoft.graph.userExperienceAnalyticsDeviceStartupProcessPerformance",
  "deviceCount": "Integer",
  "medianImpactInMs": "Integer",
  "processName": "String",
  "productName": "String",
  "publisher": "String",
  "totalImpactInMs": "Integer"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.userExperienceAnalyticsDeviceStartupProcessPerformance"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.userExperienceAnalyticsDeviceStartupProcessPerformance",
  "id": "c0b6824c-824c-c0b6-4c82-b6c04c82b6c0",
  "deviceCount": "Integer",
  "medianImpactInMs": "Integer",
  "processName": "String",
  "productName": "String",
  "publisher": "String",
  "totalImpactInMs": "Integer"
}
```


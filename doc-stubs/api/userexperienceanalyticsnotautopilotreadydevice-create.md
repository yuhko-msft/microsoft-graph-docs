---
title: "Create userExperienceAnalyticsNotAutopilotReadyDevice"
description: "Create a new userExperienceAnalyticsNotAutopilotReadyDevice object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create userExperienceAnalyticsNotAutopilotReadyDevice
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new [userExperienceAnalyticsNotAutopilotReadyDevice](../resources/userexperienceanalyticsnotautopilotreadydevice.md) object.

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
POST /deviceManagement/userExperienceAnalyticsNotAutopilotReadyDevice
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [userExperienceAnalyticsNotAutopilotReadyDevice](../resources/userexperienceanalyticsnotautopilotreadydevice.md) object.

The following table shows the properties that are required when you create the [userExperienceAnalyticsNotAutopilotReadyDevice](../resources/userexperienceanalyticsnotautopilotreadydevice.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|autoPilotProfileAssigned|Boolean|The intune device's autopilotProfileAssigned.|
|autoPilotRegistered|Boolean|The intune device's autopilotRegistered.|
|azureAdJoinType|String|The intune device's azure Ad joinType.|
|azureAdRegistered|azureAdRegisteredState|The intune device's azureAdRegistered. Possible values are: `no`, `yes`, `unknown`.|
|deviceName|String|The intune device's name.|
|managedBy|String|The intune device's managed by.|
|manufacturer|String|The intune device's manufacturer.|
|model|String|The intune device's model.|
|serialNumber|String|The intune device's serial number.|



## Response

If successful, this method returns a `201 Created` response code and a [userExperienceAnalyticsNotAutopilotReadyDevice](../resources/userexperienceanalyticsnotautopilotreadydevice.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_userexperienceanalyticsnotautopilotreadydevice_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/deviceManagement/userExperienceAnalyticsNotAutopilotReadyDevice
Content-Type: application/json
Content-length: 366

{
  "@odata.type": "#microsoft.graph.userExperienceAnalyticsNotAutopilotReadyDevice",
  "autoPilotProfileAssigned": "Boolean",
  "autoPilotRegistered": "Boolean",
  "azureAdJoinType": "String",
  "azureAdRegistered": "String",
  "deviceName": "String",
  "managedBy": "String",
  "manufacturer": "String",
  "model": "String",
  "serialNumber": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.userExperienceAnalyticsNotAutopilotReadyDevice"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.userExperienceAnalyticsNotAutopilotReadyDevice",
  "id": "d466037f-037f-d466-7f03-66d47f0366d4",
  "autoPilotProfileAssigned": "Boolean",
  "autoPilotRegistered": "Boolean",
  "azureAdJoinType": "String",
  "azureAdRegistered": "String",
  "deviceName": "String",
  "managedBy": "String",
  "manufacturer": "String",
  "model": "String",
  "serialNumber": "String"
}
```


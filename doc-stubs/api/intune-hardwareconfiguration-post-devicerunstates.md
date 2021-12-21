---
title: "Create hardwareConfigurationDeviceState"
description: "Create a new hardwareConfigurationDeviceState object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create hardwareConfigurationDeviceState
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new hardwareConfigurationDeviceState object.

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
POST /deviceManagement/hardwareConfigurations/{hardwareConfigurationId}/deviceRunStates
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [hardwareConfigurationDeviceState](../resources/intune-hardwareconfigurationdevicestate.md) object.

You can specify the following properties when creating a **hardwareConfigurationDeviceState**.

|Property|Type|Description|
|:---|:---|:---|
|deviceName|String|**TODO: Add Description** Optional.|
|osVersion|String|**TODO: Add Description** Optional.|
|upn|String|**TODO: Add Description** Optional.|
|internalVersion|Int32|**TODO: Add Description** Required.|
|lastStateUpdateDateTime|DateTimeOffset|**TODO: Add Description** Required.|
|configurationState|runState|**TODO: Add Description**. The possible values are: `unknown`, `success`, `fail`, `scriptError`, `pending`, `notApplicable`. Required.|
|configurationOutput|String|**TODO: Add Description** Optional.|
|configurationError|String|**TODO: Add Description** Optional.|



## Response

If successful, this method returns a `201 Created` response code and a [hardwareConfigurationDeviceState](../resources/intune-hardwareconfigurationdevicestate.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_hardwareconfigurationdevicestate_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/deviceManagement/hardwareConfigurations/{hardwareConfigurationId}/deviceRunStates
Content-Type: application/json
Content-length: 338

{
  "@odata.type": "#microsoft.graph.hardwareConfigurationDeviceState",
  "deviceName": "String",
  "osVersion": "String",
  "upn": "String",
  "internalVersion": "Integer",
  "lastStateUpdateDateTime": "String (timestamp)",
  "configurationState": "String",
  "configurationOutput": "String",
  "configurationError": "String"
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.hardwareConfigurationDeviceState"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.hardwareConfigurationDeviceState",
  "id": "c518dda2-dda2-c518-a2dd-18c5a2dd18c5",
  "deviceName": "String",
  "osVersion": "String",
  "upn": "String",
  "internalVersion": "Integer",
  "lastStateUpdateDateTime": "String (timestamp)",
  "configurationState": "String",
  "configurationOutput": "String",
  "configurationError": "String"
}
```


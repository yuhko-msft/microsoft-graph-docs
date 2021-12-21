---
title: "Update hardwareConfigurationDeviceState"
description: "Update the properties of a hardwareConfigurationDeviceState object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update hardwareConfigurationDeviceState
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of a [hardwareConfigurationDeviceState](../resources/intune-hardwareconfigurationdevicestate.md) object.

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
PATCH /deviceManagement/hardwareConfigurations/{hardwareConfigurationId}/deviceRunStates/{hardwareConfigurationDeviceStateId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
[!INCLUDE [table-intro](../../includes/update-property-table-intro.md)]


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

If successful, this method returns a `200 OK` response code and an updated [hardwareConfigurationDeviceState](../resources/intune-hardwareconfigurationdevicestate.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_hardwareconfigurationdevicestate"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/deviceManagement/hardwareConfigurations/{hardwareConfigurationId}/deviceRunStates/{hardwareConfigurationDeviceStateId}
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
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK
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


---
title: "Update windowsManagementAppHealthState"
description: "Update the properties of a windowsManagementAppHealthState object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update windowsManagementAppHealthState
Namespace: microsoft.graph



Update the properties of a [windowsManagementAppHealthState](../resources/windowsmanagementapphealthstate.md) object.

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
PATCH /deviceAppManagement/windowsManagementApp/healthStates/{windowsManagementAppHealthStateId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [windowsManagementAppHealthState](../resources/windowsmanagementapphealthstate.md) object.

The following table shows the properties that are required when you update the [windowsManagementAppHealthState](../resources/windowsmanagementapphealthstate.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|deviceName|String|Name of the device on which Windows management app is installed.|
|deviceOSVersion|String|Windows 10 OS version of the device on which Windows management app is installed.|
|healthState|healthState|Windows management app health state. Possible values are: `unknown`, `healthy`, `unhealthy`.|
|installedVersion|String|Windows management app installed version.|
|lastCheckInDateTime|DateTimeOffset|Windows management app last check-in time.|



## Response

If successful, this method returns a `200 OK` response code and an updated [windowsManagementAppHealthState](../resources/windowsmanagementapphealthstate.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_windowsmanagementapphealthstate"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/deviceAppManagement/windowsManagementApp/healthStates/{windowsManagementAppHealthStateId}
Content-Type: application/json
Content-length: 241

{
  "@odata.type": "#microsoft.graph.windowsManagementAppHealthState",
  "deviceName": "String",
  "deviceOSVersion": "String",
  "healthState": "String",
  "installedVersion": "String",
  "lastCheckInDateTime": "String (timestamp)"
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
  "@odata.type": "#microsoft.graph.windowsManagementAppHealthState",
  "id": "60f09fef-9fef-60f0-ef9f-f060ef9ff060",
  "deviceName": "String",
  "deviceOSVersion": "String",
  "healthState": "String",
  "installedVersion": "String",
  "lastCheckInDateTime": "String (timestamp)"
}
```


---
title: "Create hardwareConfigurationUserState"
description: "Create a new hardwareConfigurationUserState object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create hardwareConfigurationUserState
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new [hardwareConfigurationUserState](../resources/intune-hardwareconfigurationuserstate.md) object.

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
POST /deviceManagement/hardwareConfigurations/{hardwareConfigurationId}/userRunStates
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [hardwareConfigurationUserState](../resources/intune-hardwareconfigurationuserstate.md) object.

You can specify the following properties when creating a **hardwareConfigurationUserState**.

|Property|Type|Description|
|:---|:---|:---|
|upn|String|**TODO: Add Description** Optional.|
|userEmail|String|**TODO: Add Description** Optional.|
|userName|String|**TODO: Add Description** Optional.|
|lastStateUpdateDateTime|DateTimeOffset|**TODO: Add Description** Required.|
|successfulDeviceCount|Int32|**TODO: Add Description** Required.|
|failedDeviceCount|Int32|**TODO: Add Description** Required.|
|pendingDeviceCount|Int32|**TODO: Add Description** Required.|
|errorDeviceCount|Int32|**TODO: Add Description** Required.|
|notApplicableDeviceCount|Int32|**TODO: Add Description** Required.|
|unknownDeviceCount|Int32|**TODO: Add Description** Required.|



## Response

If successful, this method returns a `201 Created` response code and a [hardwareConfigurationUserState](../resources/intune-hardwareconfigurationuserstate.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_hardwareconfigurationuserstate_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/deviceManagement/hardwareConfigurations/{hardwareConfigurationId}/userRunStates
Content-Type: application/json
Content-length: 417

{
  "@odata.type": "#microsoft.graph.hardwareConfigurationUserState",
  "upn": "String",
  "userEmail": "String",
  "userName": "String",
  "lastStateUpdateDateTime": "String (timestamp)",
  "successfulDeviceCount": "Integer",
  "failedDeviceCount": "Integer",
  "pendingDeviceCount": "Integer",
  "errorDeviceCount": "Integer",
  "notApplicableDeviceCount": "Integer",
  "unknownDeviceCount": "Integer"
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.hardwareConfigurationUserState"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.hardwareConfigurationUserState",
  "id": "ea870d5e-0d5e-ea87-5e0d-87ea5e0d87ea",
  "upn": "String",
  "userEmail": "String",
  "userName": "String",
  "lastStateUpdateDateTime": "String (timestamp)",
  "successfulDeviceCount": "Integer",
  "failedDeviceCount": "Integer",
  "pendingDeviceCount": "Integer",
  "errorDeviceCount": "Integer",
  "notApplicableDeviceCount": "Integer",
  "unknownDeviceCount": "Integer"
}
```


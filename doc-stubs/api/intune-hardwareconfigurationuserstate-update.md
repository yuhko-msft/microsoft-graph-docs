---
title: "Update hardwareConfigurationUserState"
description: "Update the properties of a hardwareConfigurationUserState object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update hardwareConfigurationUserState
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of a [hardwareConfigurationUserState](../resources/intune-hardwareconfigurationuserstate.md) object.

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
PATCH /deviceManagement/hardwareConfigurations/{hardwareConfigurationId}/userRunStates/{hardwareConfigurationUserStateId}
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

If successful, this method returns a `200 OK` response code and an updated [hardwareConfigurationUserState](../resources/intune-hardwareconfigurationuserstate.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_hardwareconfigurationuserstate"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/deviceManagement/hardwareConfigurations/{hardwareConfigurationId}/userRunStates/{hardwareConfigurationUserStateId}
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
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK
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


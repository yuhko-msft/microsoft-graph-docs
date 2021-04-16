---
title: "Update deviceManagementIntentUserState"
description: "Update the properties of a deviceManagementIntentUserState object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update deviceManagementIntentUserState
Namespace: microsoft.graph



Update the properties of a [deviceManagementIntentUserState](../resources/devicemanagementintentuserstate.md) object.

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
PATCH /deviceManagement/intents/{deviceManagementIntentId}/userStates/{deviceManagementIntentUserStateId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [deviceManagementIntentUserState](../resources/devicemanagementintentuserstate.md) object.

The following table shows the properties that are required when you update the [deviceManagementIntentUserState](../resources/devicemanagementintentuserstate.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|deviceCount|Int32|Count of Devices that belongs to a user for an intent|
|lastReportedDateTime|DateTimeOffset|Last modified date time of an intent report|
|state|complianceStatus|User state for an intent. Possible values are: `unknown`, `notApplicable`, `compliant`, `remediated`, `nonCompliant`, `error`, `conflict`, `notAssigned`.|
|userName|String|The user name that is being reported on a device|
|userPrincipalName|String|The user principal name that is being reported on a device|



## Response

If successful, this method returns a `200 OK` response code and an updated [deviceManagementIntentUserState](../resources/devicemanagementintentuserstate.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_devicemanagementintentuserstate"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/deviceManagement/intents/{deviceManagementIntentId}/userStates/{deviceManagementIntentUserStateId}
Content-Type: application/json
Content-length: 232

{
  "@odata.type": "#microsoft.graph.deviceManagementIntentUserState",
  "deviceCount": "Integer",
  "lastReportedDateTime": "String (timestamp)",
  "state": "String",
  "userName": "String",
  "userPrincipalName": "String"
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
  "@odata.type": "#microsoft.graph.deviceManagementIntentUserState",
  "id": "2385efcd-efcd-2385-cdef-8523cdef8523",
  "deviceCount": "Integer",
  "lastReportedDateTime": "String (timestamp)",
  "state": "String",
  "userName": "String",
  "userPrincipalName": "String"
}
```


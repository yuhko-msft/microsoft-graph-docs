---
title: "Create securityBaselineDeviceState"
description: "Create a new securityBaselineDeviceState object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create securityBaselineDeviceState
Namespace: microsoft.graph



Create a new securityBaselineDeviceState object.

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
POST ** Collection URI for microsoft.graph.securityBaselineDeviceState not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [securityBaselineDeviceState](../resources/securitybaselinedevicestate.md) object.

The following table shows the properties that are required when you create the [securityBaselineDeviceState](../resources/securitybaselinedevicestate.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|deviceDisplayName|String|Display name of the device|
|lastReportedDateTime|DateTimeOffset|Last modified date time of the policy report|
|managedDeviceId|String|Intune device id|
|state|securityBaselineComplianceState|Security baseline compliance state. Possible values are: `unknown`, `secure`, `notApplicable`, `notSecure`, `error`, `conflict`.|
|userPrincipalName|String|User Principal Name|



## Response

If successful, this method returns a `201 Created` response code and a [securityBaselineDeviceState](../resources/securitybaselinedevicestate.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_securitybaselinedevicestate_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0** Collection URI for microsoft.graph.securityBaselineDeviceState not found
Content-Type: application/json
Content-length: 240

{
  "@odata.type": "#microsoft.graph.securityBaselineDeviceState",
  "deviceDisplayName": "String",
  "lastReportedDateTime": "String (timestamp)",
  "managedDeviceId": "String",
  "state": "String",
  "userPrincipalName": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.securityBaselineDeviceState"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.securityBaselineDeviceState",
  "id": "f6e0a182-a182-f6e0-82a1-e0f682a1e0f6",
  "deviceDisplayName": "String",
  "lastReportedDateTime": "String (timestamp)",
  "managedDeviceId": "String",
  "state": "String",
  "userPrincipalName": "String"
}
```


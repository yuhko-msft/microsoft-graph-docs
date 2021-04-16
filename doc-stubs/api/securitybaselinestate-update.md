---
title: "Update securityBaselineState"
description: "Update the properties of a securityBaselineState object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update securityBaselineState
Namespace: microsoft.graph



Update the properties of a [securityBaselineState](../resources/securitybaselinestate.md) object.

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
PATCH /me/managedDevices/{managedDeviceId}/securityBaselineStates/{securityBaselineStateId}
PATCH /users/{usersId}/managedDevices/{managedDeviceId}/securityBaselineStates/{securityBaselineStateId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [securityBaselineState](../resources/securitybaselinestate.md) object.

The following table shows the properties that are required when you update the [securityBaselineState](../resources/securitybaselinestate.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|displayName|String|The display name of the security baseline|
|securityBaselineTemplateId|String|The security baseline template id|
|state|securityBaselineComplianceState|Security baseline compliance state. Possible values are: `unknown`, `secure`, `notApplicable`, `notSecure`, `error`, `conflict`.|
|userPrincipalName|String|User Principal Name|



## Response

If successful, this method returns a `200 OK` response code and an updated [securityBaselineState](../resources/securitybaselinestate.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_securitybaselinestate"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/me/managedDevices/{managedDeviceId}/securityBaselineStates/{securityBaselineStateId}
Content-Type: application/json
Content-length: 190

{
  "@odata.type": "#microsoft.graph.securityBaselineState",
  "displayName": "String",
  "securityBaselineTemplateId": "String",
  "state": "String",
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
  "@odata.type": "#microsoft.graph.securityBaselineState",
  "id": "c88a1cef-1cef-c88a-ef1c-8ac8ef1c8ac8",
  "displayName": "String",
  "securityBaselineTemplateId": "String",
  "state": "String",
  "userPrincipalName": "String"
}
```


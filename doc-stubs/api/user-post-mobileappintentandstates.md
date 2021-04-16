---
title: "Create mobileAppIntentAndState"
description: "Create a new mobileAppIntentAndState object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create mobileAppIntentAndState
Namespace: microsoft.graph



Create a new mobileAppIntentAndState object.

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
POST /me/mobileAppIntentAndStates
POST /users/{usersId}/mobileAppIntentAndStates
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [mobileAppIntentAndState](../resources/mobileappintentandstate.md) object.

The following table shows the properties that are required when you create the [mobileAppIntentAndState](../resources/mobileappintentandstate.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|managedDeviceIdentifier|String|Device identifier created or collected by Intune.|
|mobileAppList|[mobileAppIntentAndStateDetail](../resources/mobileappintentandstatedetail.md) collection|The list of payload intents and states for the tenant.|
|userId|String|Identifier for the user that tried to enroll the device.|



## Response

If successful, this method returns a `201 Created` response code and a [mobileAppIntentAndState](../resources/mobileappintentandstate.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_mobileappintentandstate_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/me/mobileAppIntentAndStates
Content-Type: application/json
Content-length: 240

{
  "@odata.type": "#microsoft.graph.mobileAppIntentAndState",
  "managedDeviceIdentifier": "String",
  "mobileAppList": [
    {
      "@odata.type": "microsoft.graph.mobileAppIntentAndStateDetail"
    }
  ],
  "userId": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.mobileAppIntentAndState"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.mobileAppIntentAndState",
  "id": "e6e22a3d-2a3d-e6e2-3d2a-e2e63d2ae2e6",
  "managedDeviceIdentifier": "String",
  "mobileAppList": [
    {
      "@odata.type": "microsoft.graph.mobileAppIntentAndStateDetail"
    }
  ],
  "userId": "String"
}
```


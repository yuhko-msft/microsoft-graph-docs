---
title: "List deviceManagementIntentDeviceStates"
description: "Get a list of the deviceManagementIntentDeviceState objects and their properties."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List deviceManagementIntentDeviceStates
Namespace: microsoft.graph



Get a list of the [deviceManagementIntentDeviceState](../resources/devicemanagementintentdevicestate.md) objects and their properties.

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
GET /deviceManagement/intents/{deviceManagementIntentId}/deviceStates
```

## Optional query parameters
This method supports some of the OData query parameters to help customize the response. For general information, see [OData query parameters](/graph/query-parameters).

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|

## Request body
Do not supply a request body for this method.

## Response

If successful, this method returns a `200 OK` response code and a collection of [deviceManagementIntentDeviceState](../resources/devicemanagementintentdevicestate.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "list_devicemanagementintentdevicestate"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/deviceManagement/intents/{deviceManagementIntentId}/deviceStates
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.deviceManagementIntentDeviceState)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
    {
      "@odata.type": "#microsoft.graph.deviceManagementIntentDeviceState",
      "id": "f829294b-294b-f829-4b29-29f84b2929f8",
      "deviceDisplayName": "String",
      "deviceId": "String",
      "lastReportedDateTime": "String (timestamp)",
      "state": "String",
      "userName": "String",
      "userPrincipalName": "String"
    }
  ]
}
```


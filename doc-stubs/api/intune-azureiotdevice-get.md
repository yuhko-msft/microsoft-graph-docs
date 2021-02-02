---
title: "Get azureIOTDevice"
description: "Read the properties and relationships of an azureIOTDevice object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get azureIOTDevice
Namespace: microsoft.graph

Read the properties and relationships of an [azureIOTDevice](../resources/intune-azureiotdevice.md) object.

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
GET /deviceManagement/azureIOTDevices/{azureIOTDeviceId}
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

If successful, this method returns a `200 OK` response code and an [azureIOTDevice](../resources/intune-azureiotdevice.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_azureiotdevice"
}
-->
``` http
GET https://graph.microsoft.com/beta/deviceManagement/azureIOTDevices/{azureIOTDeviceId}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.azureIOTDevice"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.azureIOTDevice",
    "id": "2699c61b-c61b-2699-1bc6-99261bc69926",
    "deviceId": "String",
    "desiredProperties": [
      {
        "@odata.type": "microsoft.graph.azureIOTProperty"
      }
    ],
    "reportedProperties": [
      {
        "@odata.type": "microsoft.graph.azureIOTProperty"
      }
    ],
    "tags": [
      {
        "@odata.type": "microsoft.graph.azureIOTProperty"
      }
    ]
  }
}
```


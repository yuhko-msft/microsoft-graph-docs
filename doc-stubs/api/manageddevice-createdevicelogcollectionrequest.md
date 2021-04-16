---
title: "managedDevice: createDeviceLogCollectionRequest"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# managedDevice: createDeviceLogCollectionRequest
Namespace: microsoft.graph



**TODO: Add Description**

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
POST /me/managedDevices/{managedDeviceId}/createDeviceLogCollectionRequest
POST /deviceManagement/managedDevices/{managedDeviceId}/createDeviceLogCollectionRequest
POST /deviceManagement/comanagedDevices/{managedDeviceId}/createDeviceLogCollectionRequest
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply JSON representation of the parameters.

The following table shows the parameters that can be used with this action.

|Parameter|Type|Description|
|:---|:---|:---|
|templateType|[deviceLogCollectionRequest](../resources/devicelogcollectionrequest.md)|**TODO: Add Description**|



## Response

If successful, this action returns a `200 OK` response code and a [deviceLogCollectionResponse](../resources/devicelogcollectionresponse.md) in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "manageddevice_createdevicelogcollectionrequest"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/me/managedDevices/{managedDeviceId}/createDeviceLogCollectionRequest

Content-Type: application/json
Content-length: 95

{
  "templateType": {
    "@odata.type": "microsoft.graph.deviceLogCollectionRequest"
  }
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.deviceLogCollectionResponse"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.deviceLogCollectionResponse",
    "id": "String (identifier)",
    "errorCode": "Integer",
    "expirationDateTimeUTC": "String (timestamp)",
    "initiatedByUserPrincipalName": "String",
    "managedDeviceId": "Guid",
    "receivedDateTimeUTC": "String (timestamp)",
    "requestedDateTimeUTC": "String (timestamp)",
    "size": "Double",
    "status": "String"
  }
}
```


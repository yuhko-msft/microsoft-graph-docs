---
title: "windowsManagedDevice: createDeviceLogCollectionRequest"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# windowsManagedDevice: createDeviceLogCollectionRequest
Namespace: microsoft.graph

**TODO: Add Description**

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from most to least privileged)|
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
POST ** Entity URI for microsoft.graph.windowsManagedDevice not found/createDeviceLogCollectionRequest
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
|templateType|[deviceLogCollectionRequest](../resources/intune-devicelogcollectionrequest.md)|**TODO: Add Description**|



## Response

If successful, this action returns a `200 OK` response code and a [deviceLogCollectionResponse](../resources/intune-devicelogcollectionresponse.md) in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "windowsmanageddevice_createdevicelogcollectionrequest"
}
-->
``` http
POST https://graph.microsoft.com/beta** Entity URI for microsoft.graph.windowsManagedDevice not found/createDeviceLogCollectionRequest

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
    "status": "String",
    "managedDeviceId": "Guid",
    "errorCode": "Integer",
    "requestedDateTimeUTC": "String (timestamp)",
    "receivedDateTimeUTC": "String (timestamp)",
    "initiatedByUserPrincipalName": "String",
    "expirationDateTimeUTC": "String (timestamp)",
    "size": "Double"
  }
}
```


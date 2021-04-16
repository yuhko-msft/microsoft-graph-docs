---
title: "Create deviceLogCollectionResponse"
description: "Create a new deviceLogCollectionResponse object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create deviceLogCollectionResponse
Namespace: microsoft.graph



Create a new deviceLogCollectionResponse object.

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
POST /users/{usersId}/managedDevices/{managedDeviceId}/logCollectionRequests
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [deviceLogCollectionResponse](../resources/devicelogcollectionresponse.md) object.

The following table shows the properties that are required when you create the [deviceLogCollectionResponse](../resources/devicelogcollectionresponse.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|errorCode|Int64|The error code, if any. Valid values -9.22337203685478E+18 to 9.22337203685478E+18|
|expirationDateTimeUTC|DateTimeOffset|The DateTime of the expiration of the logs|
|initiatedByUserPrincipalName|String|The UPN for who initiated the request|
|managedDeviceId|Guid|The device Id|
|receivedDateTimeUTC|DateTimeOffset|The DateTime the request was received|
|requestedDateTimeUTC|DateTimeOffset|The DateTime of the request|
|size|Double|The size of the logs. Valid values -1.79769313486232E+308 to 1.79769313486232E+308|
|status|String|The status of the log collection request|



## Response

If successful, this method returns a `201 Created` response code and a [deviceLogCollectionResponse](../resources/devicelogcollectionresponse.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_devicelogcollectionresponse_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/users/{usersId}/managedDevices/{managedDeviceId}/logCollectionRequests
Content-Type: application/json
Content-length: 362

{
  "@odata.type": "#microsoft.graph.deviceLogCollectionResponse",
  "errorCode": "Integer",
  "expirationDateTimeUTC": "String (timestamp)",
  "initiatedByUserPrincipalName": "String",
  "managedDeviceId": "Guid",
  "receivedDateTimeUTC": "String (timestamp)",
  "requestedDateTimeUTC": "String (timestamp)",
  "size": "Double",
  "status": "String"
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
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.deviceLogCollectionResponse",
  "id": "2c86b1a0-b1a0-2c86-a0b1-862ca0b1862c",
  "errorCode": "Integer",
  "expirationDateTimeUTC": "String (timestamp)",
  "initiatedByUserPrincipalName": "String",
  "managedDeviceId": "Guid",
  "receivedDateTimeUTC": "String (timestamp)",
  "requestedDateTimeUTC": "String (timestamp)",
  "size": "Double",
  "status": "String"
}
```


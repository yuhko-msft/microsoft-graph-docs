---
title: "Update logCollectionRequests"
description: "Update the properties of a logCollectionRequests object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update logCollectionRequests
Namespace: microsoft.graph

Update the properties of a logCollectionRequests object.

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
PATCH /users/{usersId}/managedDevices/{managedDeviceId}/logCollectionRequests
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [deviceLogCollectionResponse](../resources/intune-devicelogcollectionresponse.md) object.

The following table shows the properties that are required when you create the [deviceLogCollectionResponse](../resources/intune-devicelogcollectionresponse.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|status|String|**TODO: Add Description**|
|managedDeviceId|Guid|**TODO: Add Description**|
|errorCode|Int64|**TODO: Add Description**|
|requestedDateTimeUTC|DateTimeOffset|**TODO: Add Description**|
|receivedDateTimeUTC|DateTimeOffset|**TODO: Add Description**|
|initiatedByUserPrincipalName|String|**TODO: Add Description**|
|expirationDateTimeUTC|DateTimeOffset|**TODO: Add Description**|
|size|Double|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [deviceLogCollectionResponse](../resources/intune-devicelogcollectionresponse.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_logcollectionrequests"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/users/{usersId}/managedDevices/{managedDeviceId}/logCollectionRequests
Content-Type: application/json
Content-length: 362

{
  "@odata.type": "#microsoft.graph.deviceLogCollectionResponse",
  "status": "String",
  "managedDeviceId": "Guid",
  "errorCode": "Integer",
  "requestedDateTimeUTC": "String (timestamp)",
  "receivedDateTimeUTC": "String (timestamp)",
  "initiatedByUserPrincipalName": "String",
  "expirationDateTimeUTC": "String (timestamp)",
  "size": "Double"
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
  "@odata.type": "#microsoft.graph.deviceLogCollectionResponse",
  "id": "f43ce627-e627-f43c-27e6-3cf427e63cf4",
  "status": "String",
  "managedDeviceId": "Guid",
  "errorCode": "Integer",
  "requestedDateTimeUTC": "String (timestamp)",
  "receivedDateTimeUTC": "String (timestamp)",
  "initiatedByUserPrincipalName": "String",
  "expirationDateTimeUTC": "String (timestamp)",
  "size": "Double"
}
```


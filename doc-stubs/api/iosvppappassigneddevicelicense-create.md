---
title: "Create iosVppAppAssignedDeviceLicense"
description: "Create a new iosVppAppAssignedDeviceLicense object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create iosVppAppAssignedDeviceLicense
Namespace: microsoft.graph



Create a new [iosVppAppAssignedDeviceLicense](../resources/iosvppappassigneddevicelicense.md) object.

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
POST ** Collection URI for microsoft.graph.iosVppAppAssignedDeviceLicense not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [iosVppAppAssignedDeviceLicense](../resources/iosvppappassigneddevicelicense.md) object.

The following table shows the properties that are required when you create the [iosVppAppAssignedDeviceLicense](../resources/iosvppappassigneddevicelicense.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|userEmailAddress|String|The user email address. Inherited from [iosVppAppAssignedLicense](../resources/iosvppappassignedlicense.md)|
|userId|String|The user ID. Inherited from [iosVppAppAssignedLicense](../resources/iosvppappassignedlicense.md)|
|userName|String|The user name. Inherited from [iosVppAppAssignedLicense](../resources/iosvppappassignedlicense.md)|
|userPrincipalName|String|The user principal name. Inherited from [iosVppAppAssignedLicense](../resources/iosvppappassignedlicense.md)|
|deviceName|String|The device name.|
|managedDeviceId|String|The managed device ID.|



## Response

If successful, this method returns a `201 Created` response code and an [iosVppAppAssignedDeviceLicense](../resources/iosvppappassigneddevicelicense.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_iosvppappassigneddevicelicense_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0** Collection URI for microsoft.graph.iosVppAppAssignedDeviceLicense not found
Content-Type: application/json
Content-length: 246

{
  "@odata.type": "#microsoft.graph.iosVppAppAssignedDeviceLicense",
  "userEmailAddress": "String",
  "userId": "String",
  "userName": "String",
  "userPrincipalName": "String",
  "deviceName": "String",
  "managedDeviceId": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.iosVppAppAssignedDeviceLicense"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.iosVppAppAssignedDeviceLicense",
  "id": "2dc79539-9539-2dc7-3995-c72d3995c72d",
  "userEmailAddress": "String",
  "userId": "String",
  "userName": "String",
  "userPrincipalName": "String",
  "deviceName": "String",
  "managedDeviceId": "String"
}
```


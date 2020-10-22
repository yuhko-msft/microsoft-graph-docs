---
title: "Update iosVppAppAssignedDeviceLicense"
description: "Update the properties of an iosVppAppAssignedDeviceLicense object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update iosVppAppAssignedDeviceLicense
Namespace: microsoft.graph

Update the properties of an [iosVppAppAssignedDeviceLicense](../resources/iosvppappassigneddevicelicense.md) object.

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
PATCH /iosVppAppAssignedDeviceLicense
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
|userEmailAddress|String|**TODO: Add Description** Inherited from [iosVppAppAssignedLicense](../resources/intune-iosvppappassignedlicense.md)|
|userId|String|**TODO: Add Description** Inherited from [iosVppAppAssignedLicense](../resources/intune-iosvppappassignedlicense.md)|
|userName|String|**TODO: Add Description** Inherited from [iosVppAppAssignedLicense](../resources/intune-iosvppappassignedlicense.md)|
|userPrincipalName|String|**TODO: Add Description** Inherited from [iosVppAppAssignedLicense](../resources/intune-iosvppappassignedlicense.md)|
|managedDeviceId|String|**TODO: Add Description**|
|deviceName|String|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [iosVppAppAssignedDeviceLicense](../resources/iosvppappassigneddevicelicense.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_iosvppappassigneddevicelicense"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/iosVppAppAssignedDeviceLicense
Content-Type: application/json
Content-length: 246

{
  "@odata.type": "#microsoft.graph.iosVppAppAssignedDeviceLicense",
  "userEmailAddress": "String",
  "userId": "String",
  "userName": "String",
  "userPrincipalName": "String",
  "managedDeviceId": "String",
  "deviceName": "String"
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
  "@odata.type": "#microsoft.graph.iosVppAppAssignedDeviceLicense",
  "id": "20c21414-1414-20c2-1414-c2201414c220",
  "userEmailAddress": "String",
  "userId": "String",
  "userName": "String",
  "userPrincipalName": "String",
  "managedDeviceId": "String",
  "deviceName": "String"
}
```


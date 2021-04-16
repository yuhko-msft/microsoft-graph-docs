---
title: "Create androidForWorkMobileAppConfiguration"
description: "Create a new androidForWorkMobileAppConfiguration object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create androidForWorkMobileAppConfiguration
Namespace: microsoft.graph



Create a new [androidForWorkMobileAppConfiguration](../resources/androidforworkmobileappconfiguration.md) object.

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
POST ** Collection URI for microsoft.graph.androidForWorkMobileAppConfiguration not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [androidForWorkMobileAppConfiguration](../resources/androidforworkmobileappconfiguration.md) object.

The following table shows the properties that are required when you create the [androidForWorkMobileAppConfiguration](../resources/androidforworkmobileappconfiguration.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|createdDateTime|DateTimeOffset|DateTime the object was created. Inherited from [managedDeviceMobileAppConfiguration](../resources/manageddevicemobileappconfiguration.md)|
|description|String|Admin provided description of the Device Configuration. Inherited from [managedDeviceMobileAppConfiguration](../resources/manageddevicemobileappconfiguration.md)|
|displayName|String|Admin provided name of the device configuration. Inherited from [managedDeviceMobileAppConfiguration](../resources/manageddevicemobileappconfiguration.md)|
|lastModifiedDateTime|DateTimeOffset|DateTime the object was last modified. Inherited from [managedDeviceMobileAppConfiguration](../resources/manageddevicemobileappconfiguration.md)|
|roleScopeTagIds|String collection|List of Scope Tags for this App configuration entity. Inherited from [managedDeviceMobileAppConfiguration](../resources/manageddevicemobileappconfiguration.md)|
|targetedMobileApps|String collection|the associated app. Inherited from [managedDeviceMobileAppConfiguration](../resources/manageddevicemobileappconfiguration.md)|
|version|Int32|Version of the device configuration. Inherited from [managedDeviceMobileAppConfiguration](../resources/manageddevicemobileappconfiguration.md)|
|packageId|String|Android For Work app configuration package id.|
|payloadJson|String|Android For Work app configuration JSON payload.|
|permissionActions|[androidPermissionAction](../resources/androidpermissionaction.md) collection|List of Android app permissions and corresponding permission actions.|
|profileApplicability|androidProfileApplicability|Android Enterprise profile applicability (AndroidWorkProfile, DeviceOwner, or default (applies to both)). Possible values are: `default`, `androidWorkProfile`, `androidDeviceOwner`.|



## Response

If successful, this method returns a `201 Created` response code and an [androidForWorkMobileAppConfiguration](../resources/androidforworkmobileappconfiguration.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_androidforworkmobileappconfiguration_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0** Collection URI for microsoft.graph.androidForWorkMobileAppConfiguration not found
Content-Type: application/json
Content-length: 451

{
  "@odata.type": "#microsoft.graph.androidForWorkMobileAppConfiguration",
  "description": "String",
  "displayName": "String",
  "roleScopeTagIds": [
    "String"
  ],
  "targetedMobileApps": [
    "String"
  ],
  "version": "Integer",
  "packageId": "String",
  "payloadJson": "String",
  "permissionActions": [
    {
      "@odata.type": "microsoft.graph.androidPermissionAction"
    }
  ],
  "profileApplicability": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.androidForWorkMobileAppConfiguration"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.androidForWorkMobileAppConfiguration",
  "id": "c9f663ba-63ba-c9f6-ba63-f6c9ba63f6c9",
  "createdDateTime": "String (timestamp)",
  "description": "String",
  "displayName": "String",
  "lastModifiedDateTime": "String (timestamp)",
  "roleScopeTagIds": [
    "String"
  ],
  "targetedMobileApps": [
    "String"
  ],
  "version": "Integer",
  "packageId": "String",
  "payloadJson": "String",
  "permissionActions": [
    {
      "@odata.type": "microsoft.graph.androidPermissionAction"
    }
  ],
  "profileApplicability": "String"
}
```


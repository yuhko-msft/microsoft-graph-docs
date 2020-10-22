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

Create a new [androidForWorkMobileAppConfiguration](../resources/intune-androidforworkmobileappconfiguration.md) object.

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
POST ** Collection URI for microsoft.graph.androidForWorkMobileAppConfiguration not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [androidForWorkMobileAppConfiguration](../resources/intune-androidforworkmobileappconfiguration.md) object.

The following table shows the properties that are required when you create the [androidForWorkMobileAppConfiguration](../resources/intune-androidforworkmobileappconfiguration.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|targetedMobileApps|String collection|**TODO: Add Description** Inherited from [managedDeviceMobileAppConfiguration](../resources/intune-manageddevicemobileappconfiguration.md)|
|roleScopeTagIds|String collection|**TODO: Add Description** Inherited from [managedDeviceMobileAppConfiguration](../resources/intune-manageddevicemobileappconfiguration.md)|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [managedDeviceMobileAppConfiguration](../resources/intune-manageddevicemobileappconfiguration.md)|
|description|String|**TODO: Add Description** Inherited from [managedDeviceMobileAppConfiguration](../resources/intune-manageddevicemobileappconfiguration.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [managedDeviceMobileAppConfiguration](../resources/intune-manageddevicemobileappconfiguration.md)|
|displayName|String|**TODO: Add Description** Inherited from [managedDeviceMobileAppConfiguration](../resources/intune-manageddevicemobileappconfiguration.md)|
|version|Int32|**TODO: Add Description** Inherited from [managedDeviceMobileAppConfiguration](../resources/intune-manageddevicemobileappconfiguration.md)|
|packageId|String|**TODO: Add Description**|
|payloadJson|String|**TODO: Add Description**|
|permissionActions|[androidPermissionAction](../resources/intune-androidpermissionaction.md) collection|**TODO: Add Description**|
|profileApplicability|androidProfileApplicability|**TODO: Add Description**. Possible values are: `default`, `androidWorkProfile`, `androidDeviceOwner`.|



## Response

If successful, this method returns a `201 Created` response code and an [androidForWorkMobileAppConfiguration](../resources/intune-androidforworkmobileappconfiguration.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_androidforworkmobileappconfiguration_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta** Collection URI for microsoft.graph.androidForWorkMobileAppConfiguration not found
Content-Type: application/json
Content-length: 451

{
  "@odata.type": "#microsoft.graph.androidForWorkMobileAppConfiguration",
  "targetedMobileApps": [
    "String"
  ],
  "roleScopeTagIds": [
    "String"
  ],
  "description": "String",
  "displayName": "String",
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
  "id": "c19fa595-a595-c19f-95a5-9fc195a59fc1",
  "targetedMobileApps": [
    "String"
  ],
  "roleScopeTagIds": [
    "String"
  ],
  "createdDateTime": "String (timestamp)",
  "description": "String",
  "lastModifiedDateTime": "String (timestamp)",
  "displayName": "String",
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


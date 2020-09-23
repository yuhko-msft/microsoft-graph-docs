---
title: "Create iosMobileAppConfiguration"
description: "Create a new iosMobileAppConfiguration object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create iosMobileAppConfiguration
Namespace: microsoft.graph

Create a new [iosMobileAppConfiguration](../resources/iosmobileappconfiguration.md) object.

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
POST ** Collection URI for microsoft.management.services.api.iosMobileAppConfiguration not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [iosMobileAppConfiguration](../resources/iosmobileappconfiguration.md) object.

The following table shows the properties that are required when you create the [iosMobileAppConfiguration](../resources/iosmobileappconfiguration.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|Key of the entity. Inherited from [managedDeviceMobileAppConfiguration](../resources/manageddevicemobileappconfiguration.md)|
|targetedMobileApps|String collection|the associated app. Inherited from [managedDeviceMobileAppConfiguration](../resources/manageddevicemobileappconfiguration.md)|
|roleScopeTagIds|String collection|List of Scope Tags for this App configuration entity. Inherited from [managedDeviceMobileAppConfiguration](../resources/manageddevicemobileappconfiguration.md)|
|createdDateTime|DateTimeOffset|DateTime the object was created. Inherited from [managedDeviceMobileAppConfiguration](../resources/manageddevicemobileappconfiguration.md)|
|description|String|Admin provided description of the Device Configuration. Inherited from [managedDeviceMobileAppConfiguration](../resources/manageddevicemobileappconfiguration.md)|
|lastModifiedDateTime|DateTimeOffset|DateTime the object was last modified. Inherited from [managedDeviceMobileAppConfiguration](../resources/manageddevicemobileappconfiguration.md)|
|displayName|String|Admin provided name of the device configuration. Inherited from [managedDeviceMobileAppConfiguration](../resources/manageddevicemobileappconfiguration.md)|
|version|Int32|Version of the device configuration. Inherited from [managedDeviceMobileAppConfiguration](../resources/manageddevicemobileappconfiguration.md)|
|encodedSettingXml|Binary|mdm app configuration Base64 binary.|
|settings|[appConfigurationSettingItem](../resources/appconfigurationsettingitem.md) collection|app configuration setting items.|



## Response

If successful, this method returns a `201 Created` response code and an [iosMobileAppConfiguration](../resources/iosmobileappconfiguration.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_iosmobileappconfiguration_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta** Collection URI for microsoft.management.services.api.iosMobileAppConfiguration not found
Content-Type: application/json
Content-length: 396

{
  "@odata.type": "#microsoft.management.services.api.iosMobileAppConfiguration",
  "targetedMobileApps": [
    "String"
  ],
  "roleScopeTagIds": [
    "String"
  ],
  "description": "String",
  "displayName": "String",
  "version": "Integer",
  "encodedSettingXml": "Binary",
  "settings": [
    {
      "@odata.type": "microsoft.graph.appConfigurationSettingItem"
    }
  ]
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.management.services.api.iosMobileAppConfiguration"
}
-->
``` http
HTTP/1.1 201 Created

Content-Type: application/json
{
  "@odata.type": "#microsoft.management.services.api.iosMobileAppConfiguration",
  "id": "78783980-3980-7878-8039-787880397878",
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
  "encodedSettingXml": "Binary",
  "settings": [
    {
      "@odata.type": "microsoft.graph.appConfigurationSettingItem"
    }
  ]
}
```


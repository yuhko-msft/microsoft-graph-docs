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

Create a new [iosMobileAppConfiguration](../resources/intune-iosmobileappconfiguration.md) object.

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
POST ** Collection URI for microsoft.graph.iosMobileAppConfiguration not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [iosMobileAppConfiguration](../resources/intune-iosmobileappconfiguration.md) object.

The following table shows the properties that are required when you create the [iosMobileAppConfiguration](../resources/intune-iosmobileappconfiguration.md).

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
|encodedSettingXml|Binary|**TODO: Add Description**|
|settings|[appConfigurationSettingItem](../resources/intune-appconfigurationsettingitem.md) collection|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and an [iosMobileAppConfiguration](../resources/intune-iosmobileappconfiguration.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_iosmobileappconfiguration_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta** Collection URI for microsoft.graph.iosMobileAppConfiguration not found
Content-Type: application/json
Content-length: 378

{
  "@odata.type": "#microsoft.graph.iosMobileAppConfiguration",
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
  "@odata.type": "microsoft.graph.iosMobileAppConfiguration"
}
-->
``` http
HTTP/1.1 201 Created

Content-Type: application/json
{
  "@odata.type": "#microsoft.graph.iosMobileAppConfiguration",
  "id": "57dd2787-2787-57dd-8727-dd578727dd57",
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


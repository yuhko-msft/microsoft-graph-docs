---
title: "Create windows10DeviceFirmwareConfigurationInterface"
description: "Create a new windows10DeviceFirmwareConfigurationInterface object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create windows10DeviceFirmwareConfigurationInterface
Namespace: microsoft.graph



Create a new [windows10DeviceFirmwareConfigurationInterface](../resources/windows10devicefirmwareconfigurationinterface.md) object.

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
POST ** Collection URI for microsoft.graph.windows10DeviceFirmwareConfigurationInterface not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [windows10DeviceFirmwareConfigurationInterface](../resources/windows10devicefirmwareconfigurationinterface.md) object.

The following table shows the properties that are required when you create the [windows10DeviceFirmwareConfigurationInterface](../resources/windows10devicefirmwareconfigurationinterface.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|createdDateTime|DateTimeOffset|DateTime the object was created. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|description|String|Admin provided description of the Device Configuration. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceManagementApplicabilityRuleDeviceMode|[deviceManagementApplicabilityRuleDeviceMode](../resources/devicemanagementapplicabilityruledevicemode.md)|The device mode applicability rule for this Policy. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceManagementApplicabilityRuleOsEdition|[deviceManagementApplicabilityRuleOsEdition](../resources/devicemanagementapplicabilityruleosedition.md)|The OS edition applicability for this Policy. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceManagementApplicabilityRuleOsVersion|[deviceManagementApplicabilityRuleOsVersion](../resources/devicemanagementapplicabilityruleosversion.md)|The OS version applicability rule for this Policy. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|displayName|String|Admin provided name of the device configuration. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|lastModifiedDateTime|DateTimeOffset|DateTime the object was last modified. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|roleScopeTagIds|String collection|List of Scope Tags for this Entity instance. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|supportsScopeTags|Boolean|Indicates whether or not the underlying Device Configuration supports the assignment of scope tags. Assigning to the ScopeTags property is not allowed when this value is false and entities will not be visible to scoped users. This occurs for Legacy policies created in Silverlight and can be resolved by deleting and recreating the policy in the Azure Portal. This property is read-only. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|version|Int32|Version of the device configuration. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|bootFromBuiltInNetworkAdapters|enablement|Defines whether a user is allowed to boot from built-in network adapters. Possible values are: `notConfigured`, `enabled`, `disabled`.|
|bootFromExternalMedia|enablement|Defines whether a user is allowed to boot from external media. Possible values are: `notConfigured`, `enabled`, `disabled`.|
|cameras|enablement|Defines whether built-in cameras are enabled. Possible values are: `notConfigured`, `enabled`, `disabled`.|
|changeUefiSettingsPermission|changeUefiSettingsPermission|Defines the permission level granted to users to change UEFI settings. Possible values are: `notConfiguredOnly`, `none`.|
|microphonesAndSpeakers|enablement|Defines whether built-in microphones or speakers are enabled. Possible values are: `notConfigured`, `enabled`, `disabled`.|
|radios|enablement|Defines whether built-in radios e.g. WIFI, NFC, Bluetooth, are enabled. Possible values are: `notConfigured`, `enabled`, `disabled`.|
|virtualizationOfCpuAndIO|enablement|Defines whether CPU and IO virtualization is enabled. Possible values are: `notConfigured`, `enabled`, `disabled`.|



## Response

If successful, this method returns a `201 Created` response code and a [windows10DeviceFirmwareConfigurationInterface](../resources/windows10devicefirmwareconfigurationinterface.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_windows10devicefirmwareconfigurationinterface_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0** Collection URI for microsoft.graph.windows10DeviceFirmwareConfigurationInterface not found
Content-Type: application/json
Content-length: 920

{
  "@odata.type": "#microsoft.graph.windows10DeviceFirmwareConfigurationInterface",
  "description": "String",
  "deviceManagementApplicabilityRuleDeviceMode": {
    "@odata.type": "microsoft.graph.deviceManagementApplicabilityRuleDeviceMode"
  },
  "deviceManagementApplicabilityRuleOsEdition": {
    "@odata.type": "microsoft.graph.deviceManagementApplicabilityRuleOsEdition"
  },
  "deviceManagementApplicabilityRuleOsVersion": {
    "@odata.type": "microsoft.graph.deviceManagementApplicabilityRuleOsVersion"
  },
  "displayName": "String",
  "roleScopeTagIds": [
    "String"
  ],
  "supportsScopeTags": "Boolean",
  "version": "Integer",
  "bootFromBuiltInNetworkAdapters": "String",
  "bootFromExternalMedia": "String",
  "cameras": "String",
  "changeUefiSettingsPermission": "String",
  "microphonesAndSpeakers": "String",
  "radios": "String",
  "virtualizationOfCpuAndIO": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.windows10DeviceFirmwareConfigurationInterface"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.windows10DeviceFirmwareConfigurationInterface",
  "id": "8ca390c1-90c1-8ca3-c190-a38cc190a38c",
  "createdDateTime": "String (timestamp)",
  "description": "String",
  "deviceManagementApplicabilityRuleDeviceMode": {
    "@odata.type": "microsoft.graph.deviceManagementApplicabilityRuleDeviceMode"
  },
  "deviceManagementApplicabilityRuleOsEdition": {
    "@odata.type": "microsoft.graph.deviceManagementApplicabilityRuleOsEdition"
  },
  "deviceManagementApplicabilityRuleOsVersion": {
    "@odata.type": "microsoft.graph.deviceManagementApplicabilityRuleOsVersion"
  },
  "displayName": "String",
  "lastModifiedDateTime": "String (timestamp)",
  "roleScopeTagIds": [
    "String"
  ],
  "supportsScopeTags": "Boolean",
  "version": "Integer",
  "bootFromBuiltInNetworkAdapters": "String",
  "bootFromExternalMedia": "String",
  "cameras": "String",
  "changeUefiSettingsPermission": "String",
  "microphonesAndSpeakers": "String",
  "radios": "String",
  "virtualizationOfCpuAndIO": "String"
}
```


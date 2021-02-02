---
title: "Update windowsDefenderAdvancedThreatProtectionConfiguration"
description: "Update the properties of a windowsDefenderAdvancedThreatProtectionConfiguration object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update windowsDefenderAdvancedThreatProtectionConfiguration
Namespace: microsoft.graph

Update the properties of a [windowsDefenderAdvancedThreatProtectionConfiguration](../resources/windowsdefenderadvancedthreatprotectionconfiguration.md) object.

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
PATCH ** Entity URI for microsoft.graph.windowsDefenderAdvancedThreatProtectionConfiguration not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [windowsDefenderAdvancedThreatProtectionConfiguration](../resources/windowsdefenderadvancedthreatprotectionconfiguration.md) object.

The following table shows the properties that are required when you update the [windowsDefenderAdvancedThreatProtectionConfiguration](../resources/windowsdefenderadvancedthreatprotectionconfiguration.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|roleScopeTagIds|String collection|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|supportsScopeTags|Boolean|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|deviceManagementApplicabilityRuleOsEdition|[deviceManagementApplicabilityRuleOsEdition](../resources/intune-devicemanagementapplicabilityruleosedition.md)|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|deviceManagementApplicabilityRuleOsVersion|[deviceManagementApplicabilityRuleOsVersion](../resources/intune-devicemanagementapplicabilityruleosversion.md)|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|deviceManagementApplicabilityRuleDeviceMode|[deviceManagementApplicabilityRuleDeviceMode](../resources/intune-devicemanagementapplicabilityruledevicemode.md)|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|scenarioType|scenarioType|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md). Possible values are: `general`, `resourceAccess`.|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|description|String|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|displayName|String|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|version|Int32|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|advancedThreatProtectionBlobType|advancedThreatProtectionBlobType|**TODO: Add Description**. Possible values are: `notConfigured`, `onboardingBlob`, `offboardingBlob`.|
|advancedThreatProtectionOnboardingBlob|String|**TODO: Add Description**|
|advancedThreatProtectionOnboardingFilename|String|**TODO: Add Description**|
|advancedThreatProtectionAutoPopulateOnboardingBlob|Boolean|**TODO: Add Description**|
|allowSampleSharing|Boolean|**TODO: Add Description**|
|enableExpeditedTelemetryReporting|Boolean|**TODO: Add Description**|
|advancedThreatProtectionOffboardingBlob|String|**TODO: Add Description**|
|advancedThreatProtectionOffboardingFilename|String|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [windowsDefenderAdvancedThreatProtectionConfiguration](../resources/windowsdefenderadvancedthreatprotectionconfiguration.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_windowsdefenderadvancedthreatprotectionconfiguration"
}
-->
``` http
PATCH https://graph.microsoft.com/beta** Entity URI for microsoft.graph.windowsDefenderAdvancedThreatProtectionConfiguration not found
Content-Type: application/json
Content-length: 1133

{
  "@odata.type": "#microsoft.graph.windowsDefenderAdvancedThreatProtectionConfiguration",
  "roleScopeTagIds": [
    "String"
  ],
  "supportsScopeTags": "Boolean",
  "deviceManagementApplicabilityRuleOsEdition": {
    "@odata.type": "microsoft.graph.deviceManagementApplicabilityRuleOsEdition"
  },
  "deviceManagementApplicabilityRuleOsVersion": {
    "@odata.type": "microsoft.graph.deviceManagementApplicabilityRuleOsVersion"
  },
  "deviceManagementApplicabilityRuleDeviceMode": {
    "@odata.type": "microsoft.graph.deviceManagementApplicabilityRuleDeviceMode"
  },
  "scenarioType": "String",
  "description": "String",
  "displayName": "String",
  "version": "Integer",
  "advancedThreatProtectionBlobType": "String",
  "advancedThreatProtectionOnboardingBlob": "String",
  "advancedThreatProtectionOnboardingFilename": "String",
  "advancedThreatProtectionAutoPopulateOnboardingBlob": "Boolean",
  "allowSampleSharing": "Boolean",
  "enableExpeditedTelemetryReporting": "Boolean",
  "advancedThreatProtectionOffboardingBlob": "String",
  "advancedThreatProtectionOffboardingFilename": "String"
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
  "@odata.type": "#microsoft.graph.windowsDefenderAdvancedThreatProtectionConfiguration",
  "id": "97babf0b-bf0b-97ba-0bbf-ba970bbfba97",
  "lastModifiedDateTime": "String (timestamp)",
  "roleScopeTagIds": [
    "String"
  ],
  "supportsScopeTags": "Boolean",
  "deviceManagementApplicabilityRuleOsEdition": {
    "@odata.type": "microsoft.graph.deviceManagementApplicabilityRuleOsEdition"
  },
  "deviceManagementApplicabilityRuleOsVersion": {
    "@odata.type": "microsoft.graph.deviceManagementApplicabilityRuleOsVersion"
  },
  "deviceManagementApplicabilityRuleDeviceMode": {
    "@odata.type": "microsoft.graph.deviceManagementApplicabilityRuleDeviceMode"
  },
  "scenarioType": "String",
  "createdDateTime": "String (timestamp)",
  "description": "String",
  "displayName": "String",
  "version": "Integer",
  "advancedThreatProtectionBlobType": "String",
  "advancedThreatProtectionOnboardingBlob": "String",
  "advancedThreatProtectionOnboardingFilename": "String",
  "advancedThreatProtectionAutoPopulateOnboardingBlob": "Boolean",
  "allowSampleSharing": "Boolean",
  "enableExpeditedTelemetryReporting": "Boolean",
  "advancedThreatProtectionOffboardingBlob": "String",
  "advancedThreatProtectionOffboardingFilename": "String"
}
```


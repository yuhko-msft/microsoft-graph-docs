---
title: "Update windowsIdentityProtectionConfiguration"
description: "Update the properties of a windowsIdentityProtectionConfiguration object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update windowsIdentityProtectionConfiguration
Namespace: microsoft.graph

Update the properties of a [windowsIdentityProtectionConfiguration](../resources/windowsidentityprotectionconfiguration.md) object.

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
PATCH ** Entity URI for microsoft.graph.windowsIdentityProtectionConfiguration not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [windowsIdentityProtectionConfiguration](../resources/windowsidentityprotectionconfiguration.md) object.

The following table shows the properties that are required when you create the [windowsIdentityProtectionConfiguration](../resources/windowsidentityprotectionconfiguration.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|roleScopeTagIds|String collection|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|supportsScopeTags|Boolean|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|deviceManagementApplicabilityRuleOsEdition|[deviceManagementApplicabilityRuleOsEdition](../resources/intune-devicemanagementapplicabilityruleosedition.md)|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|deviceManagementApplicabilityRuleOsVersion|[deviceManagementApplicabilityRuleOsVersion](../resources/intune-devicemanagementapplicabilityruleosversion.md)|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|deviceManagementApplicabilityRuleDeviceMode|[deviceManagementApplicabilityRuleDeviceMode](../resources/intune-devicemanagementapplicabilityruledevicemode.md)|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|description|String|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|displayName|String|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|version|Int32|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|useSecurityKeyForSignin|Boolean|**TODO: Add Description**|
|enhancedAntiSpoofingForFacialFeaturesEnabled|Boolean|**TODO: Add Description**|
|pinMinimumLength|Int32|**TODO: Add Description**|
|pinMaximumLength|Int32|**TODO: Add Description**|
|pinUppercaseCharactersUsage|configurationUsage|**TODO: Add Description**. Possible values are: `blocked`, `required`, `allowed`, `notConfigured`.|
|pinLowercaseCharactersUsage|configurationUsage|**TODO: Add Description**. Possible values are: `blocked`, `required`, `allowed`, `notConfigured`.|
|pinSpecialCharactersUsage|configurationUsage|**TODO: Add Description**. Possible values are: `blocked`, `required`, `allowed`, `notConfigured`.|
|pinExpirationInDays|Int32|**TODO: Add Description**|
|pinPreviousBlockCount|Int32|**TODO: Add Description**|
|pinRecoveryEnabled|Boolean|**TODO: Add Description**|
|securityDeviceRequired|Boolean|**TODO: Add Description**|
|unlockWithBiometricsEnabled|Boolean|**TODO: Add Description**|
|useCertificatesForOnPremisesAuthEnabled|Boolean|**TODO: Add Description**|
|windowsHelloForBusinessBlocked|Boolean|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [windowsIdentityProtectionConfiguration](../resources/windowsidentityprotectionconfiguration.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_windowsidentityprotectionconfiguration"
}
-->
``` http
PATCH https://graph.microsoft.com/beta** Entity URI for microsoft.graph.windowsIdentityProtectionConfiguration not found
Content-Type: application/json
Content-length: 1259

{
  "@odata.type": "#microsoft.graph.windowsIdentityProtectionConfiguration",
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
  "description": "String",
  "displayName": "String",
  "version": "Integer",
  "useSecurityKeyForSignin": "Boolean",
  "enhancedAntiSpoofingForFacialFeaturesEnabled": "Boolean",
  "pinMinimumLength": "Integer",
  "pinMaximumLength": "Integer",
  "pinUppercaseCharactersUsage": "String",
  "pinLowercaseCharactersUsage": "String",
  "pinSpecialCharactersUsage": "String",
  "pinExpirationInDays": "Integer",
  "pinPreviousBlockCount": "Integer",
  "pinRecoveryEnabled": "Boolean",
  "securityDeviceRequired": "Boolean",
  "unlockWithBiometricsEnabled": "Boolean",
  "useCertificatesForOnPremisesAuthEnabled": "Boolean",
  "windowsHelloForBusinessBlocked": "Boolean"
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
  "@odata.type": "#microsoft.graph.windowsIdentityProtectionConfiguration",
  "id": "c386ae83-ae83-c386-83ae-86c383ae86c3",
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
  "createdDateTime": "String (timestamp)",
  "description": "String",
  "displayName": "String",
  "version": "Integer",
  "useSecurityKeyForSignin": "Boolean",
  "enhancedAntiSpoofingForFacialFeaturesEnabled": "Boolean",
  "pinMinimumLength": "Integer",
  "pinMaximumLength": "Integer",
  "pinUppercaseCharactersUsage": "String",
  "pinLowercaseCharactersUsage": "String",
  "pinSpecialCharactersUsage": "String",
  "pinExpirationInDays": "Integer",
  "pinPreviousBlockCount": "Integer",
  "pinRecoveryEnabled": "Boolean",
  "securityDeviceRequired": "Boolean",
  "unlockWithBiometricsEnabled": "Boolean",
  "useCertificatesForOnPremisesAuthEnabled": "Boolean",
  "windowsHelloForBusinessBlocked": "Boolean"
}
```


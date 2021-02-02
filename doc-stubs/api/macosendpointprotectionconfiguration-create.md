---
title: "Create macOSEndpointProtectionConfiguration"
description: "Create a new macOSEndpointProtectionConfiguration object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create macOSEndpointProtectionConfiguration
Namespace: microsoft.graph

Create a new [macOSEndpointProtectionConfiguration](../resources/macosendpointprotectionconfiguration.md) object.

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
POST ** Collection URI for microsoft.graph.macOSEndpointProtectionConfiguration not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [macOSEndpointProtectionConfiguration](../resources/macosendpointprotectionconfiguration.md) object.

The following table shows the properties that are required when you create the [macOSEndpointProtectionConfiguration](../resources/macosendpointprotectionconfiguration.md).

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
|gatekeeperAllowedAppSource|macOSGatekeeperAppSources|**TODO: Add Description**. Possible values are: `notConfigured`, `macAppStore`, `macAppStoreAndIdentifiedDevelopers`, `anywhere`.|
|gatekeeperBlockOverride|Boolean|**TODO: Add Description**|
|firewallEnabled|Boolean|**TODO: Add Description**|
|firewallBlockAllIncoming|Boolean|**TODO: Add Description**|
|firewallEnableStealthMode|Boolean|**TODO: Add Description**|
|firewallApplications|[macOSFirewallApplication](../resources/intune-macosfirewallapplication.md) collection|**TODO: Add Description**|
|fileVaultEnabled|Boolean|**TODO: Add Description**|
|fileVaultSelectedRecoveryKeyTypes|macOSFileVaultRecoveryKeyTypes|**TODO: Add Description**. Possible values are: `notConfigured`, `institutionalRecoveryKey`, `personalRecoveryKey`.|
|fileVaultInstitutionalRecoveryKeyCertificate|Binary|**TODO: Add Description**|
|fileVaultInstitutionalRecoveryKeyCertificateFileName|String|**TODO: Add Description**|
|fileVaultPersonalRecoveryKeyHelpMessage|String|**TODO: Add Description**|
|fileVaultAllowDeferralUntilSignOut|Boolean|**TODO: Add Description**|
|fileVaultNumberOfTimesUserCanIgnore|Int32|**TODO: Add Description**|
|fileVaultDisablePromptAtSignOut|Boolean|**TODO: Add Description**|
|fileVaultPersonalRecoveryKeyRotationInMonths|Int32|**TODO: Add Description**|
|fileVaultHidePersonalRecoveryKey|Boolean|**TODO: Add Description**|
|fileVaultForceReEncryption|Boolean|**TODO: Add Description**|
|advancedThreatProtectionRealTime|enablement|**TODO: Add Description**. Possible values are: `notConfigured`, `enabled`, `disabled`.|
|advancedThreatProtectionCloudDelivered|enablement|**TODO: Add Description**. Possible values are: `notConfigured`, `enabled`, `disabled`.|
|advancedThreatProtectionAutomaticSampleSubmission|enablement|**TODO: Add Description**. Possible values are: `notConfigured`, `enabled`, `disabled`.|
|advancedThreatProtectionDiagnosticDataCollection|enablement|**TODO: Add Description**. Possible values are: `notConfigured`, `enabled`, `disabled`.|
|advancedThreatProtectionExcludedFolders|String collection|**TODO: Add Description**|
|advancedThreatProtectionExcludedFiles|String collection|**TODO: Add Description**|
|advancedThreatProtectionExcludedExtensions|String collection|**TODO: Add Description**|
|advancedThreatProtectionExcludedProcesses|String collection|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and a [macOSEndpointProtectionConfiguration](../resources/macosendpointprotectionconfiguration.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_macosendpointprotectionconfiguration_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta** Collection URI for microsoft.graph.macOSEndpointProtectionConfiguration not found
Content-Type: application/json
Content-length: 2089

{
  "@odata.type": "#microsoft.graph.macOSEndpointProtectionConfiguration",
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
  "gatekeeperAllowedAppSource": "String",
  "gatekeeperBlockOverride": "Boolean",
  "firewallEnabled": "Boolean",
  "firewallBlockAllIncoming": "Boolean",
  "firewallEnableStealthMode": "Boolean",
  "firewallApplications": [
    {
      "@odata.type": "microsoft.graph.macOSFirewallApplication"
    }
  ],
  "fileVaultEnabled": "Boolean",
  "fileVaultSelectedRecoveryKeyTypes": "String",
  "fileVaultInstitutionalRecoveryKeyCertificate": "Binary",
  "fileVaultInstitutionalRecoveryKeyCertificateFileName": "String",
  "fileVaultPersonalRecoveryKeyHelpMessage": "String",
  "fileVaultAllowDeferralUntilSignOut": "Boolean",
  "fileVaultNumberOfTimesUserCanIgnore": "Integer",
  "fileVaultDisablePromptAtSignOut": "Boolean",
  "fileVaultPersonalRecoveryKeyRotationInMonths": "Integer",
  "fileVaultHidePersonalRecoveryKey": "Boolean",
  "fileVaultForceReEncryption": "Boolean",
  "advancedThreatProtectionRealTime": "String",
  "advancedThreatProtectionCloudDelivered": "String",
  "advancedThreatProtectionAutomaticSampleSubmission": "String",
  "advancedThreatProtectionDiagnosticDataCollection": "String",
  "advancedThreatProtectionExcludedFolders": [
    "String"
  ],
  "advancedThreatProtectionExcludedFiles": [
    "String"
  ],
  "advancedThreatProtectionExcludedExtensions": [
    "String"
  ],
  "advancedThreatProtectionExcludedProcesses": [
    "String"
  ]
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.macOSEndpointProtectionConfiguration"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.macOSEndpointProtectionConfiguration",
  "id": "68c3eb68-eb68-68c3-68eb-c36868ebc368",
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
  "gatekeeperAllowedAppSource": "String",
  "gatekeeperBlockOverride": "Boolean",
  "firewallEnabled": "Boolean",
  "firewallBlockAllIncoming": "Boolean",
  "firewallEnableStealthMode": "Boolean",
  "firewallApplications": [
    {
      "@odata.type": "microsoft.graph.macOSFirewallApplication"
    }
  ],
  "fileVaultEnabled": "Boolean",
  "fileVaultSelectedRecoveryKeyTypes": "String",
  "fileVaultInstitutionalRecoveryKeyCertificate": "Binary",
  "fileVaultInstitutionalRecoveryKeyCertificateFileName": "String",
  "fileVaultPersonalRecoveryKeyHelpMessage": "String",
  "fileVaultAllowDeferralUntilSignOut": "Boolean",
  "fileVaultNumberOfTimesUserCanIgnore": "Integer",
  "fileVaultDisablePromptAtSignOut": "Boolean",
  "fileVaultPersonalRecoveryKeyRotationInMonths": "Integer",
  "fileVaultHidePersonalRecoveryKey": "Boolean",
  "fileVaultForceReEncryption": "Boolean",
  "advancedThreatProtectionRealTime": "String",
  "advancedThreatProtectionCloudDelivered": "String",
  "advancedThreatProtectionAutomaticSampleSubmission": "String",
  "advancedThreatProtectionDiagnosticDataCollection": "String",
  "advancedThreatProtectionExcludedFolders": [
    "String"
  ],
  "advancedThreatProtectionExcludedFiles": [
    "String"
  ],
  "advancedThreatProtectionExcludedExtensions": [
    "String"
  ],
  "advancedThreatProtectionExcludedProcesses": [
    "String"
  ]
}
```


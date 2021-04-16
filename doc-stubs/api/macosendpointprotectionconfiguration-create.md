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
|advancedThreatProtectionAutomaticSampleSubmission|enablement|Determines whether or not to enable automatic file sample submission for Microsoft Defender Advanced Threat Protection on macOS. Possible values are: `notConfigured`, `enabled`, `disabled`.|
|advancedThreatProtectionCloudDelivered|enablement|Determines whether or not to enable cloud-delivered protection for Microsoft Defender Advanced Threat Protection on macOS. Possible values are: `notConfigured`, `enabled`, `disabled`.|
|advancedThreatProtectionDiagnosticDataCollection|enablement|Determines whether or not to enable diagnostic and usage data collection for Microsoft Defender Advanced Threat Protection on macOS. Possible values are: `notConfigured`, `enabled`, `disabled`.|
|advancedThreatProtectionExcludedExtensions|String collection|A list of file extensions to exclude from antivirus scanning for Microsoft Defender Advanced Threat Protection on macOS.|
|advancedThreatProtectionExcludedFiles|String collection|A list of paths to files to exclude from antivirus scanning for Microsoft Defender Advanced Threat Protection on macOS.|
|advancedThreatProtectionExcludedFolders|String collection|A list of paths to folders to exclude from antivirus scanning for Microsoft Defender Advanced Threat Protection on macOS.|
|advancedThreatProtectionExcludedProcesses|String collection|A list of process names to exclude from antivirus scanning for Microsoft Defender Advanced Threat Protection on macOS.|
|advancedThreatProtectionRealTime|enablement|Determines whether or not to enable real-time protection for Microsoft Defender Advanced Threat Protection on macOS. Possible values are: `notConfigured`, `enabled`, `disabled`.|
|fileVaultAllowDeferralUntilSignOut|Boolean|Optional. If set to true, the user can defer the enabling of FileVault until they sign out.|
|fileVaultDisablePromptAtSignOut|Boolean|Optional. When using the Defer option, if set to true, the user is not prompted to enable FileVault at sign-out.|
|fileVaultEnabled|Boolean|Whether FileVault should be enabled or not.|
|fileVaultHidePersonalRecoveryKey|Boolean|Optional. A hidden personal recovery key does not appear on the user's screen during FileVault encryption, reducing the risk of it ending up in the wrong hands.|
|fileVaultInstitutionalRecoveryKeyCertificate|Binary|Required if selected recovery key type(s) include InstitutionalRecoveryKey. The DER Encoded certificate file used to set an institutional recovery key.|
|fileVaultInstitutionalRecoveryKeyCertificateFileName|String|File name of the institutional recovery key certificate to display in UI. (*.der).|
|fileVaultNumberOfTimesUserCanIgnore|Int32|Optional. When using the Defer option, this is the maximum number of times the user can ignore prompts to enable FileVault before FileVault will be required for the user to sign in. If set to -1, it will always prompt to enable FileVault until FileVault is enabled, though it will allow the user to bypass enabling FileVault. Setting this to 0 will disable the feature.|
|fileVaultPersonalRecoveryKeyHelpMessage|String|Required if selected recovery key type(s) include PersonalRecoveryKey. A short message displayed to the user that explains how they can retrieve their personal recovery key.|
|fileVaultPersonalRecoveryKeyRotationInMonths|Int32|Optional. If selected recovery key type(s) include PersonalRecoveryKey, the frequency to rotate that key, in months.|
|fileVaultSelectedRecoveryKeyTypes|macOSFileVaultRecoveryKeyTypes|Required if FileVault is enabled, determines the type(s) of recovery key to use. . Possible values are: `notConfigured`, `institutionalRecoveryKey`, `personalRecoveryKey`.|
|firewallApplications|[macOSFirewallApplication](../resources/macosfirewallapplication.md) collection|List of applications with firewall settings. Firewall settings for applications not on this list are determined by the user. This collection can contain a maximum of 500 elements.|
|firewallBlockAllIncoming|Boolean|Corresponds to the “Block all incoming connections” option.|
|firewallEnabled|Boolean|Whether the firewall should be enabled or not.|
|firewallEnableStealthMode|Boolean|Corresponds to “Enable stealth mode.”|
|gatekeeperAllowedAppSource|macOSGatekeeperAppSources|System and Privacy setting that determines which download locations apps can be run from on a macOS device. Possible values are: `notConfigured`, `macAppStore`, `macAppStoreAndIdentifiedDevelopers`, `anywhere`.|
|gatekeeperBlockOverride|Boolean|If set to true, the user override for Gatekeeper will be disabled.|



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
POST https://graph.microsoft.com/v1.0** Collection URI for microsoft.graph.macOSEndpointProtectionConfiguration not found
Content-Type: application/json
Content-length: 2016

{
  "@odata.type": "#microsoft.graph.macOSEndpointProtectionConfiguration",
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
  "advancedThreatProtectionAutomaticSampleSubmission": "String",
  "advancedThreatProtectionCloudDelivered": "String",
  "advancedThreatProtectionDiagnosticDataCollection": "String",
  "advancedThreatProtectionExcludedExtensions": [
    "String"
  ],
  "advancedThreatProtectionExcludedFiles": [
    "String"
  ],
  "advancedThreatProtectionExcludedFolders": [
    "String"
  ],
  "advancedThreatProtectionExcludedProcesses": [
    "String"
  ],
  "advancedThreatProtectionRealTime": "String",
  "fileVaultAllowDeferralUntilSignOut": "Boolean",
  "fileVaultDisablePromptAtSignOut": "Boolean",
  "fileVaultEnabled": "Boolean",
  "fileVaultHidePersonalRecoveryKey": "Boolean",
  "fileVaultInstitutionalRecoveryKeyCertificate": "Binary",
  "fileVaultInstitutionalRecoveryKeyCertificateFileName": "String",
  "fileVaultNumberOfTimesUserCanIgnore": "Integer",
  "fileVaultPersonalRecoveryKeyHelpMessage": "String",
  "fileVaultPersonalRecoveryKeyRotationInMonths": "Integer",
  "fileVaultSelectedRecoveryKeyTypes": "String",
  "firewallApplications": [
    {
      "@odata.type": "microsoft.graph.macOSFirewallApplication"
    }
  ],
  "firewallBlockAllIncoming": "Boolean",
  "firewallEnabled": "Boolean",
  "firewallEnableStealthMode": "Boolean",
  "gatekeeperAllowedAppSource": "String",
  "gatekeeperBlockOverride": "Boolean"
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
  "id": "92a18367-8367-92a1-6783-a1926783a192",
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
  "advancedThreatProtectionAutomaticSampleSubmission": "String",
  "advancedThreatProtectionCloudDelivered": "String",
  "advancedThreatProtectionDiagnosticDataCollection": "String",
  "advancedThreatProtectionExcludedExtensions": [
    "String"
  ],
  "advancedThreatProtectionExcludedFiles": [
    "String"
  ],
  "advancedThreatProtectionExcludedFolders": [
    "String"
  ],
  "advancedThreatProtectionExcludedProcesses": [
    "String"
  ],
  "advancedThreatProtectionRealTime": "String",
  "fileVaultAllowDeferralUntilSignOut": "Boolean",
  "fileVaultDisablePromptAtSignOut": "Boolean",
  "fileVaultEnabled": "Boolean",
  "fileVaultHidePersonalRecoveryKey": "Boolean",
  "fileVaultInstitutionalRecoveryKeyCertificate": "Binary",
  "fileVaultInstitutionalRecoveryKeyCertificateFileName": "String",
  "fileVaultNumberOfTimesUserCanIgnore": "Integer",
  "fileVaultPersonalRecoveryKeyHelpMessage": "String",
  "fileVaultPersonalRecoveryKeyRotationInMonths": "Integer",
  "fileVaultSelectedRecoveryKeyTypes": "String",
  "firewallApplications": [
    {
      "@odata.type": "microsoft.graph.macOSFirewallApplication"
    }
  ],
  "firewallBlockAllIncoming": "Boolean",
  "firewallEnabled": "Boolean",
  "firewallEnableStealthMode": "Boolean",
  "gatekeeperAllowedAppSource": "String",
  "gatekeeperBlockOverride": "Boolean"
}
```


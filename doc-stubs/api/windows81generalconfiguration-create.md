---
title: "Create windows81GeneralConfiguration"
description: "Create a new windows81GeneralConfiguration object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create windows81GeneralConfiguration
Namespace: microsoft.graph



Create a new [windows81GeneralConfiguration](../resources/windows81generalconfiguration.md) object.

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
POST ** Collection URI for microsoft.graph.windows81GeneralConfiguration not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [windows81GeneralConfiguration](../resources/windows81generalconfiguration.md) object.

The following table shows the properties that are required when you create the [windows81GeneralConfiguration](../resources/windows81generalconfiguration.md).

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
|accountsBlockAddingNonMicrosoftAccountEmail|Boolean|Indicates whether or not to Block the user from adding email accounts to the device that are not associated with a Microsoft account.|
|applyOnlyToWindows81|Boolean|Value indicating whether this policy only applies to Windows 8.1. This property is read-only.|
|browserBlockAutofill|Boolean|Indicates whether or not to block auto fill.|
|browserBlockAutomaticDetectionOfIntranetSites|Boolean|Indicates whether or not to block automatic detection of Intranet sites.|
|browserBlockEnterpriseModeAccess|Boolean|Indicates whether or not to block enterprise mode access.|
|browserBlockJavaScript|Boolean|Indicates whether or not to Block the user from using JavaScript.|
|browserBlockPlugins|Boolean|Indicates whether or not to block plug-ins.|
|browserBlockPopups|Boolean|Indicates whether or not to block popups.|
|browserBlockSendingDoNotTrackHeader|Boolean|Indicates whether or not to Block the user from sending the do not track header.|
|browserBlockSingleWordEntryOnIntranetSites|Boolean|Indicates whether or not to block a single word entry on Intranet sites.|
|browserEnterpriseModeSiteListLocation|String|The enterprise mode site list location. Could be a local file, local network or http location.|
|browserInternetSecurityLevel|internetSiteSecurityLevel|The internet security level. Possible values are: `userDefined`, `medium`, `mediumHigh`, `high`.|
|browserIntranetSecurityLevel|siteSecurityLevel|The Intranet security level. Possible values are: `userDefined`, `low`, `mediumLow`, `medium`, `mediumHigh`, `high`.|
|browserLoggingReportLocation|String|The logging report location.|
|browserRequireFirewall|Boolean|Indicates whether or not to require a firewall.|
|browserRequireFraudWarning|Boolean|Indicates whether or not to require fraud warning.|
|browserRequireHighSecurityForRestrictedSites|Boolean|Indicates whether or not to require high security for restricted sites.|
|browserRequireSmartScreen|Boolean|Indicates whether or not to require the user to use the smart screen filter.|
|browserTrustedSitesSecurityLevel|siteSecurityLevel|The trusted sites security level. Possible values are: `userDefined`, `low`, `mediumLow`, `medium`, `mediumHigh`, `high`.|
|cellularBlockDataRoaming|Boolean|Indicates whether or not to block data roaming.|
|diagnosticsBlockDataSubmission|Boolean|Indicates whether or not to block diagnostic data submission.|
|minimumAutoInstallClassification|updateClassification|The minimum update classification to install automatically. Possible values are: `userDefined`, `recommendedAndImportant`, `important`, `none`.|
|passwordBlockPicturePasswordAndPin|Boolean|Indicates whether or not to Block the user from using a pictures password and pin.|
|passwordExpirationDays|Int32|Password expiration in days.|
|passwordMinimumCharacterSetCount|Int32|The number of character sets required in the password.|
|passwordMinimumLength|Int32|The minimum password length.|
|passwordMinutesOfInactivityBeforeScreenTimeout|Int32|The minutes of inactivity before the screen times out.|
|passwordPreviousPasswordBlockCount|Int32|The number of previous passwords to prevent re-use of. Valid values 0 to 24|
|passwordRequiredType|requiredPasswordType|The required password type. Possible values are: `deviceDefault`, `alphanumeric`, `numeric`.|
|passwordSignInFailureCountBeforeFactoryReset|Int32|The number of sign in failures before factory reset.|
|storageRequireDeviceEncryption|Boolean|Indicates whether or not to require encryption on a mobile device.|
|updatesMinimumAutoInstallClassification|updateClassification|The minimum update classification to install automatically. Possible values are: `userDefined`, `recommendedAndImportant`, `important`, `none`.|
|updatesRequireAutomaticUpdates|Boolean|Indicates whether or not to require automatic updates.|
|userAccountControlSettings|windowsUserAccountControlSettings|The user account control settings. Possible values are: `userDefined`, `alwaysNotify`, `notifyOnAppChanges`, `notifyOnAppChangesWithoutDimming`, `neverNotify`.|
|workFoldersUrl|String|The work folders url.|



## Response

If successful, this method returns a `201 Created` response code and a [windows81GeneralConfiguration](../resources/windows81generalconfiguration.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_windows81generalconfiguration_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0** Collection URI for microsoft.graph.windows81GeneralConfiguration not found
Content-Type: application/json
Content-length: 2311

{
  "@odata.type": "#microsoft.graph.windows81GeneralConfiguration",
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
  "accountsBlockAddingNonMicrosoftAccountEmail": "Boolean",
  "applyOnlyToWindows81": "Boolean",
  "browserBlockAutofill": "Boolean",
  "browserBlockAutomaticDetectionOfIntranetSites": "Boolean",
  "browserBlockEnterpriseModeAccess": "Boolean",
  "browserBlockJavaScript": "Boolean",
  "browserBlockPlugins": "Boolean",
  "browserBlockPopups": "Boolean",
  "browserBlockSendingDoNotTrackHeader": "Boolean",
  "browserBlockSingleWordEntryOnIntranetSites": "Boolean",
  "browserEnterpriseModeSiteListLocation": "String",
  "browserInternetSecurityLevel": "String",
  "browserIntranetSecurityLevel": "String",
  "browserLoggingReportLocation": "String",
  "browserRequireFirewall": "Boolean",
  "browserRequireFraudWarning": "Boolean",
  "browserRequireHighSecurityForRestrictedSites": "Boolean",
  "browserRequireSmartScreen": "Boolean",
  "browserTrustedSitesSecurityLevel": "String",
  "cellularBlockDataRoaming": "Boolean",
  "diagnosticsBlockDataSubmission": "Boolean",
  "minimumAutoInstallClassification": "String",
  "passwordBlockPicturePasswordAndPin": "Boolean",
  "passwordExpirationDays": "Integer",
  "passwordMinimumCharacterSetCount": "Integer",
  "passwordMinimumLength": "Integer",
  "passwordMinutesOfInactivityBeforeScreenTimeout": "Integer",
  "passwordPreviousPasswordBlockCount": "Integer",
  "passwordRequiredType": "String",
  "passwordSignInFailureCountBeforeFactoryReset": "Integer",
  "storageRequireDeviceEncryption": "Boolean",
  "updatesMinimumAutoInstallClassification": "String",
  "updatesRequireAutomaticUpdates": "Boolean",
  "userAccountControlSettings": "String",
  "workFoldersUrl": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.windows81GeneralConfiguration"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.windows81GeneralConfiguration",
  "id": "92d71a9f-1a9f-92d7-9f1a-d7929f1ad792",
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
  "accountsBlockAddingNonMicrosoftAccountEmail": "Boolean",
  "applyOnlyToWindows81": "Boolean",
  "browserBlockAutofill": "Boolean",
  "browserBlockAutomaticDetectionOfIntranetSites": "Boolean",
  "browserBlockEnterpriseModeAccess": "Boolean",
  "browserBlockJavaScript": "Boolean",
  "browserBlockPlugins": "Boolean",
  "browserBlockPopups": "Boolean",
  "browserBlockSendingDoNotTrackHeader": "Boolean",
  "browserBlockSingleWordEntryOnIntranetSites": "Boolean",
  "browserEnterpriseModeSiteListLocation": "String",
  "browserInternetSecurityLevel": "String",
  "browserIntranetSecurityLevel": "String",
  "browserLoggingReportLocation": "String",
  "browserRequireFirewall": "Boolean",
  "browserRequireFraudWarning": "Boolean",
  "browserRequireHighSecurityForRestrictedSites": "Boolean",
  "browserRequireSmartScreen": "Boolean",
  "browserTrustedSitesSecurityLevel": "String",
  "cellularBlockDataRoaming": "Boolean",
  "diagnosticsBlockDataSubmission": "Boolean",
  "minimumAutoInstallClassification": "String",
  "passwordBlockPicturePasswordAndPin": "Boolean",
  "passwordExpirationDays": "Integer",
  "passwordMinimumCharacterSetCount": "Integer",
  "passwordMinimumLength": "Integer",
  "passwordMinutesOfInactivityBeforeScreenTimeout": "Integer",
  "passwordPreviousPasswordBlockCount": "Integer",
  "passwordRequiredType": "String",
  "passwordSignInFailureCountBeforeFactoryReset": "Integer",
  "storageRequireDeviceEncryption": "Boolean",
  "updatesMinimumAutoInstallClassification": "String",
  "updatesRequireAutomaticUpdates": "Boolean",
  "userAccountControlSettings": "String",
  "workFoldersUrl": "String"
}
```


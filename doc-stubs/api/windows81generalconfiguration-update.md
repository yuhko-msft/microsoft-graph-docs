---
title: "Update windows81GeneralConfiguration"
description: "Update the properties of a windows81GeneralConfiguration object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update windows81GeneralConfiguration
Namespace: microsoft.graph

Update the properties of a [windows81GeneralConfiguration](../resources/windows81generalconfiguration.md) object.

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
PATCH ** Entity URI for microsoft.graph.windows81GeneralConfiguration not found
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
|accountsBlockAddingNonMicrosoftAccountEmail|Boolean|**TODO: Add Description**|
|applyOnlyToWindows81|Boolean|**TODO: Add Description**|
|browserBlockAutofill|Boolean|**TODO: Add Description**|
|browserBlockAutomaticDetectionOfIntranetSites|Boolean|**TODO: Add Description**|
|browserBlockEnterpriseModeAccess|Boolean|**TODO: Add Description**|
|browserBlockJavaScript|Boolean|**TODO: Add Description**|
|browserBlockPlugins|Boolean|**TODO: Add Description**|
|browserBlockPopups|Boolean|**TODO: Add Description**|
|browserBlockSendingDoNotTrackHeader|Boolean|**TODO: Add Description**|
|browserBlockSingleWordEntryOnIntranetSites|Boolean|**TODO: Add Description**|
|browserRequireSmartScreen|Boolean|**TODO: Add Description**|
|browserEnterpriseModeSiteListLocation|String|**TODO: Add Description**|
|browserInternetSecurityLevel|internetSiteSecurityLevel|**TODO: Add Description**. Possible values are: `userDefined`, `medium`, `mediumHigh`, `high`.|
|browserIntranetSecurityLevel|siteSecurityLevel|**TODO: Add Description**. Possible values are: `userDefined`, `low`, `mediumLow`, `medium`, `mediumHigh`, `high`.|
|browserLoggingReportLocation|String|**TODO: Add Description**|
|browserRequireHighSecurityForRestrictedSites|Boolean|**TODO: Add Description**|
|browserRequireFirewall|Boolean|**TODO: Add Description**|
|browserRequireFraudWarning|Boolean|**TODO: Add Description**|
|browserTrustedSitesSecurityLevel|siteSecurityLevel|**TODO: Add Description**. Possible values are: `userDefined`, `low`, `mediumLow`, `medium`, `mediumHigh`, `high`.|
|cellularBlockDataRoaming|Boolean|**TODO: Add Description**|
|diagnosticsBlockDataSubmission|Boolean|**TODO: Add Description**|
|passwordBlockPicturePasswordAndPin|Boolean|**TODO: Add Description**|
|passwordExpirationDays|Int32|**TODO: Add Description**|
|passwordMinimumLength|Int32|**TODO: Add Description**|
|passwordMinutesOfInactivityBeforeScreenTimeout|Int32|**TODO: Add Description**|
|passwordMinimumCharacterSetCount|Int32|**TODO: Add Description**|
|passwordPreviousPasswordBlockCount|Int32|**TODO: Add Description**|
|passwordRequiredType|requiredPasswordType|**TODO: Add Description**. Possible values are: `deviceDefault`, `alphanumeric`, `numeric`.|
|passwordSignInFailureCountBeforeFactoryReset|Int32|**TODO: Add Description**|
|storageRequireDeviceEncryption|Boolean|**TODO: Add Description**|
|minimumAutoInstallClassification|updateClassification|**TODO: Add Description**. Possible values are: `userDefined`, `recommendedAndImportant`, `important`, `none`.|
|updatesMinimumAutoInstallClassification|updateClassification|**TODO: Add Description**. Possible values are: `userDefined`, `recommendedAndImportant`, `important`, `none`.|
|updatesRequireAutomaticUpdates|Boolean|**TODO: Add Description**|
|userAccountControlSettings|windowsUserAccountControlSettings|**TODO: Add Description**. Possible values are: `userDefined`, `alwaysNotify`, `notifyOnAppChanges`, `notifyOnAppChangesWithoutDimming`, `neverNotify`.|
|workFoldersUrl|String|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [windows81GeneralConfiguration](../resources/windows81generalconfiguration.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_windows81generalconfiguration"
}
-->
``` http
PATCH https://graph.microsoft.com/beta** Entity URI for microsoft.graph.windows81GeneralConfiguration not found
Content-Type: application/json
Content-length: 2311

{
  "@odata.type": "#microsoft.graph.windows81GeneralConfiguration",
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
  "browserRequireSmartScreen": "Boolean",
  "browserEnterpriseModeSiteListLocation": "String",
  "browserInternetSecurityLevel": "String",
  "browserIntranetSecurityLevel": "String",
  "browserLoggingReportLocation": "String",
  "browserRequireHighSecurityForRestrictedSites": "Boolean",
  "browserRequireFirewall": "Boolean",
  "browserRequireFraudWarning": "Boolean",
  "browserTrustedSitesSecurityLevel": "String",
  "cellularBlockDataRoaming": "Boolean",
  "diagnosticsBlockDataSubmission": "Boolean",
  "passwordBlockPicturePasswordAndPin": "Boolean",
  "passwordExpirationDays": "Integer",
  "passwordMinimumLength": "Integer",
  "passwordMinutesOfInactivityBeforeScreenTimeout": "Integer",
  "passwordMinimumCharacterSetCount": "Integer",
  "passwordPreviousPasswordBlockCount": "Integer",
  "passwordRequiredType": "String",
  "passwordSignInFailureCountBeforeFactoryReset": "Integer",
  "storageRequireDeviceEncryption": "Boolean",
  "minimumAutoInstallClassification": "String",
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
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK

Content-Type: application/json
{
  "@odata.type": "#microsoft.graph.windows81GeneralConfiguration",
  "id": "a1d9a731-a731-a1d9-31a7-d9a131a7d9a1",
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
  "browserRequireSmartScreen": "Boolean",
  "browserEnterpriseModeSiteListLocation": "String",
  "browserInternetSecurityLevel": "String",
  "browserIntranetSecurityLevel": "String",
  "browserLoggingReportLocation": "String",
  "browserRequireHighSecurityForRestrictedSites": "Boolean",
  "browserRequireFirewall": "Boolean",
  "browserRequireFraudWarning": "Boolean",
  "browserTrustedSitesSecurityLevel": "String",
  "cellularBlockDataRoaming": "Boolean",
  "diagnosticsBlockDataSubmission": "Boolean",
  "passwordBlockPicturePasswordAndPin": "Boolean",
  "passwordExpirationDays": "Integer",
  "passwordMinimumLength": "Integer",
  "passwordMinutesOfInactivityBeforeScreenTimeout": "Integer",
  "passwordMinimumCharacterSetCount": "Integer",
  "passwordPreviousPasswordBlockCount": "Integer",
  "passwordRequiredType": "String",
  "passwordSignInFailureCountBeforeFactoryReset": "Integer",
  "storageRequireDeviceEncryption": "Boolean",
  "minimumAutoInstallClassification": "String",
  "updatesMinimumAutoInstallClassification": "String",
  "updatesRequireAutomaticUpdates": "Boolean",
  "userAccountControlSettings": "String",
  "workFoldersUrl": "String"
}
```


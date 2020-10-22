---
title: "Update iosEasEmailProfileConfiguration"
description: "Update the properties of an iosEasEmailProfileConfiguration object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update iosEasEmailProfileConfiguration
Namespace: microsoft.graph

Update the properties of an [iosEasEmailProfileConfiguration](../resources/ioseasemailprofileconfiguration.md) object.

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
PATCH ** Entity URI for microsoft.graph.iosEasEmailProfileConfiguration not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [iosEasEmailProfileConfiguration](../resources/ioseasemailprofileconfiguration.md) object.

The following table shows the properties that are required when you create the [iosEasEmailProfileConfiguration](../resources/ioseasemailprofileconfiguration.md).

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
|usernameSource|userEmailSource|**TODO: Add Description** Inherited from [easEmailProfileConfigurationBase](../resources/easemailprofileconfigurationbase.md). Possible values are: `userPrincipalName`, `primarySmtpAddress`.|
|usernameAADSource|usernameSource|**TODO: Add Description** Inherited from [easEmailProfileConfigurationBase](../resources/easemailprofileconfigurationbase.md). Possible values are: `userPrincipalName`, `primarySmtpAddress`, `samAccountName`.|
|userDomainNameSource|domainNameSource|**TODO: Add Description** Inherited from [easEmailProfileConfigurationBase](../resources/easemailprofileconfigurationbase.md). Possible values are: `fullDomainName`, `netBiosDomainName`.|
|customDomainName|String|**TODO: Add Description** Inherited from [easEmailProfileConfigurationBase](../resources/easemailprofileconfigurationbase.md)|
|accountName|String|**TODO: Add Description**|
|authenticationMethod|easAuthenticationMethod|**TODO: Add Description**. Possible values are: `usernameAndPassword`, `certificate`, `derivedCredential`.|
|blockMovingMessagesToOtherEmailAccounts|Boolean|**TODO: Add Description**|
|blockSendingEmailFromThirdPartyApps|Boolean|**TODO: Add Description**|
|blockSyncingRecentlyUsedEmailAddresses|Boolean|**TODO: Add Description**|
|durationOfEmailToSync|emailSyncDuration|**TODO: Add Description**. Possible values are: `userDefined`, `oneDay`, `threeDays`, `oneWeek`, `twoWeeks`, `oneMonth`, `unlimited`.|
|emailAddressSource|userEmailSource|**TODO: Add Description**. Possible values are: `userPrincipalName`, `primarySmtpAddress`.|
|easServices|easServices|**TODO: Add Description**. Possible values are: `none`, `calendars`, `contacts`, `email`, `notes`, `reminders`.|
|easServicesUserOverrideEnabled|Boolean|**TODO: Add Description**|
|hostName|String|**TODO: Add Description**|
|requireSmime|Boolean|**TODO: Add Description**|
|smimeEnablePerMessageSwitch|Boolean|**TODO: Add Description**|
|smimeEncryptByDefaultEnabled|Boolean|**TODO: Add Description**|
|smimeSigningEnabled|Boolean|**TODO: Add Description**|
|smimeSigningUserOverrideEnabled|Boolean|**TODO: Add Description**|
|smimeEncryptByDefaultUserOverrideEnabled|Boolean|**TODO: Add Description**|
|smimeSigningCertificateUserOverrideEnabled|Boolean|**TODO: Add Description**|
|smimeEncryptionCertificateUserOverrideEnabled|Boolean|**TODO: Add Description**|
|requireSsl|Boolean|**TODO: Add Description**|
|useOAuth|Boolean|**TODO: Add Description**|
|signingCertificateType|emailCertificateType|**TODO: Add Description**. Possible values are: `none`, `certificate`, `derivedCredential`.|
|encryptionCertificateType|emailCertificateType|**TODO: Add Description**. Possible values are: `none`, `certificate`, `derivedCredential`.|
|perAppVPNProfileId|String|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [iosEasEmailProfileConfiguration](../resources/ioseasemailprofileconfiguration.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_ioseasemailprofileconfiguration"
}
-->
``` http
PATCH https://graph.microsoft.com/beta** Entity URI for microsoft.graph.iosEasEmailProfileConfiguration not found
Content-Type: application/json
Content-length: 1747

{
  "@odata.type": "#microsoft.graph.iosEasEmailProfileConfiguration",
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
  "usernameSource": "String",
  "usernameAADSource": "String",
  "userDomainNameSource": "String",
  "customDomainName": "String",
  "accountName": "String",
  "authenticationMethod": "String",
  "blockMovingMessagesToOtherEmailAccounts": "Boolean",
  "blockSendingEmailFromThirdPartyApps": "Boolean",
  "blockSyncingRecentlyUsedEmailAddresses": "Boolean",
  "durationOfEmailToSync": "String",
  "emailAddressSource": "String",
  "easServices": "String",
  "easServicesUserOverrideEnabled": "Boolean",
  "hostName": "String",
  "requireSmime": "Boolean",
  "smimeEnablePerMessageSwitch": "Boolean",
  "smimeEncryptByDefaultEnabled": "Boolean",
  "smimeSigningEnabled": "Boolean",
  "smimeSigningUserOverrideEnabled": "Boolean",
  "smimeEncryptByDefaultUserOverrideEnabled": "Boolean",
  "smimeSigningCertificateUserOverrideEnabled": "Boolean",
  "smimeEncryptionCertificateUserOverrideEnabled": "Boolean",
  "requireSsl": "Boolean",
  "useOAuth": "Boolean",
  "signingCertificateType": "String",
  "encryptionCertificateType": "String",
  "perAppVPNProfileId": "String"
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
  "@odata.type": "#microsoft.graph.iosEasEmailProfileConfiguration",
  "id": "e84f42c4-42c4-e84f-c442-4fe8c4424fe8",
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
  "usernameSource": "String",
  "usernameAADSource": "String",
  "userDomainNameSource": "String",
  "customDomainName": "String",
  "accountName": "String",
  "authenticationMethod": "String",
  "blockMovingMessagesToOtherEmailAccounts": "Boolean",
  "blockSendingEmailFromThirdPartyApps": "Boolean",
  "blockSyncingRecentlyUsedEmailAddresses": "Boolean",
  "durationOfEmailToSync": "String",
  "emailAddressSource": "String",
  "easServices": "String",
  "easServicesUserOverrideEnabled": "Boolean",
  "hostName": "String",
  "requireSmime": "Boolean",
  "smimeEnablePerMessageSwitch": "Boolean",
  "smimeEncryptByDefaultEnabled": "Boolean",
  "smimeSigningEnabled": "Boolean",
  "smimeSigningUserOverrideEnabled": "Boolean",
  "smimeEncryptByDefaultUserOverrideEnabled": "Boolean",
  "smimeSigningCertificateUserOverrideEnabled": "Boolean",
  "smimeEncryptionCertificateUserOverrideEnabled": "Boolean",
  "requireSsl": "Boolean",
  "useOAuth": "Boolean",
  "signingCertificateType": "String",
  "encryptionCertificateType": "String",
  "perAppVPNProfileId": "String"
}
```


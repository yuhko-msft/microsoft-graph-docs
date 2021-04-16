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
PATCH ** Entity URI for microsoft.graph.iosEasEmailProfileConfiguration not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [iosEasEmailProfileConfiguration](../resources/ioseasemailprofileconfiguration.md) object.

The following table shows the properties that are required when you update the [iosEasEmailProfileConfiguration](../resources/ioseasemailprofileconfiguration.md).

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
|customDomainName|String|Custom domain name value used while generating an email profile before installing on the device. Inherited from [easEmailProfileConfigurationBase](../resources/easemailprofileconfigurationbase.md)|
|userDomainNameSource|domainNameSource|UserDomainname attribute that is picked from AAD and injected into this profile before installing on the device. Inherited from [easEmailProfileConfigurationBase](../resources/easemailprofileconfigurationbase.md). Possible values are: `fullDomainName`, `netBiosDomainName`.|
|usernameAADSource|usernameSource|Name of the AAD field, that will be used to retrieve UserName for email profile. Inherited from [easEmailProfileConfigurationBase](../resources/easemailprofileconfigurationbase.md). Possible values are: `userPrincipalName`, `primarySmtpAddress`, `samAccountName`.|
|usernameSource|userEmailSource|Username attribute that is picked from AAD and injected into this profile before installing on the device. Inherited from [easEmailProfileConfigurationBase](../resources/easemailprofileconfigurationbase.md). Possible values are: `userPrincipalName`, `primarySmtpAddress`.|
|accountName|String|Account name.|
|authenticationMethod|easAuthenticationMethod|Authentication method for this Email profile. Possible values are: `usernameAndPassword`, `certificate`, `derivedCredential`.|
|blockMovingMessagesToOtherEmailAccounts|Boolean|Indicates whether or not to block moving messages to other email accounts.|
|blockSendingEmailFromThirdPartyApps|Boolean|Indicates whether or not to block sending email from third party apps.|
|blockSyncingRecentlyUsedEmailAddresses|Boolean|Indicates whether or not to block syncing recently used email addresses, for instance - when composing new email.|
|durationOfEmailToSync|emailSyncDuration|Duration of time email should be synced back to. . Possible values are: `userDefined`, `oneDay`, `threeDays`, `oneWeek`, `twoWeeks`, `oneMonth`, `unlimited`.|
|easServices|easServices|Exchange data to sync. Possible values are: `none`, `calendars`, `contacts`, `email`, `notes`, `reminders`.|
|easServicesUserOverrideEnabled|Boolean|Allow users to change sync settings.|
|emailAddressSource|userEmailSource|Email attribute that is picked from AAD and injected into this profile before installing on the device. Possible values are: `userPrincipalName`, `primarySmtpAddress`.|
|encryptionCertificateType|emailCertificateType|Encryption Certificate type for this Email profile. Possible values are: `none`, `certificate`, `derivedCredential`.|
|hostName|String|Exchange location that (URL) that the native mail app connects to.|
|perAppVPNProfileId|String|Profile ID of the Per-App VPN policy to be used to access emails from the native Mail client|
|requireSmime|Boolean|Indicates whether or not to use S/MIME certificate.|
|requireSsl|Boolean|Indicates whether or not to use SSL.|
|signingCertificateType|emailCertificateType|Signing Certificate type for this Email profile. Possible values are: `none`, `certificate`, `derivedCredential`.|
|smimeEnablePerMessageSwitch|Boolean|Indicates whether or not to allow unencrypted emails.|
|smimeEncryptByDefaultEnabled|Boolean|If set to true S/MIME encryption is enabled by default.|
|smimeEncryptByDefaultUserOverrideEnabled|Boolean|If set to true, the user can toggle the encryption by default setting.|
|smimeEncryptionCertificateUserOverrideEnabled|Boolean|If set to true the user can select the S/MIME encryption identity. |
|smimeSigningCertificateUserOverrideEnabled|Boolean|If set to true, the user can select the signing identity.|
|smimeSigningEnabled|Boolean|If set to true S/MIME signing is enabled for this account|
|smimeSigningUserOverrideEnabled|Boolean|If set to true, the user can toggle S/MIME signing on or off.|
|useOAuth|Boolean|Specifies whether the connection should use OAuth for authentication.|



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
PATCH https://graph.microsoft.com/v1.0** Entity URI for microsoft.graph.iosEasEmailProfileConfiguration not found
Content-Type: application/json
Content-length: 1747

{
  "@odata.type": "#microsoft.graph.iosEasEmailProfileConfiguration",
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
  "customDomainName": "String",
  "userDomainNameSource": "String",
  "usernameAADSource": "String",
  "usernameSource": "String",
  "accountName": "String",
  "authenticationMethod": "String",
  "blockMovingMessagesToOtherEmailAccounts": "Boolean",
  "blockSendingEmailFromThirdPartyApps": "Boolean",
  "blockSyncingRecentlyUsedEmailAddresses": "Boolean",
  "durationOfEmailToSync": "String",
  "easServices": "String",
  "easServicesUserOverrideEnabled": "Boolean",
  "emailAddressSource": "String",
  "encryptionCertificateType": "String",
  "hostName": "String",
  "perAppVPNProfileId": "String",
  "requireSmime": "Boolean",
  "requireSsl": "Boolean",
  "signingCertificateType": "String",
  "smimeEnablePerMessageSwitch": "Boolean",
  "smimeEncryptByDefaultEnabled": "Boolean",
  "smimeEncryptByDefaultUserOverrideEnabled": "Boolean",
  "smimeEncryptionCertificateUserOverrideEnabled": "Boolean",
  "smimeSigningCertificateUserOverrideEnabled": "Boolean",
  "smimeSigningEnabled": "Boolean",
  "smimeSigningUserOverrideEnabled": "Boolean",
  "useOAuth": "Boolean"
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
  "id": "35f6a01c-a01c-35f6-1ca0-f6351ca0f635",
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
  "customDomainName": "String",
  "userDomainNameSource": "String",
  "usernameAADSource": "String",
  "usernameSource": "String",
  "accountName": "String",
  "authenticationMethod": "String",
  "blockMovingMessagesToOtherEmailAccounts": "Boolean",
  "blockSendingEmailFromThirdPartyApps": "Boolean",
  "blockSyncingRecentlyUsedEmailAddresses": "Boolean",
  "durationOfEmailToSync": "String",
  "easServices": "String",
  "easServicesUserOverrideEnabled": "Boolean",
  "emailAddressSource": "String",
  "encryptionCertificateType": "String",
  "hostName": "String",
  "perAppVPNProfileId": "String",
  "requireSmime": "Boolean",
  "requireSsl": "Boolean",
  "signingCertificateType": "String",
  "smimeEnablePerMessageSwitch": "Boolean",
  "smimeEncryptByDefaultEnabled": "Boolean",
  "smimeEncryptByDefaultUserOverrideEnabled": "Boolean",
  "smimeEncryptionCertificateUserOverrideEnabled": "Boolean",
  "smimeSigningCertificateUserOverrideEnabled": "Boolean",
  "smimeSigningEnabled": "Boolean",
  "smimeSigningUserOverrideEnabled": "Boolean",
  "useOAuth": "Boolean"
}
```


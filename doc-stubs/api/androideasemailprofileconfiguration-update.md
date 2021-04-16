---
title: "Update androidEasEmailProfileConfiguration"
description: "Update the properties of an androidEasEmailProfileConfiguration object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update androidEasEmailProfileConfiguration
Namespace: microsoft.graph



Update the properties of an [androidEasEmailProfileConfiguration](../resources/androideasemailprofileconfiguration.md) object.

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
PATCH ** Entity URI for microsoft.graph.androidEasEmailProfileConfiguration not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [androidEasEmailProfileConfiguration](../resources/androideasemailprofileconfiguration.md) object.

The following table shows the properties that are required when you update the [androidEasEmailProfileConfiguration](../resources/androideasemailprofileconfiguration.md).

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
|accountName|String|Exchange ActiveSync account name, displayed to users as name of EAS (this) profile.|
|authenticationMethod|easAuthenticationMethod|Authentication method for Exchange ActiveSync. Possible values are: `usernameAndPassword`, `certificate`, `derivedCredential`.|
|customDomainName|String|Custom domain name value used while generating an email profile before installing on the device.|
|durationOfEmailToSync|emailSyncDuration|Duration of time email should be synced to. Possible values are: `userDefined`, `oneDay`, `threeDays`, `oneWeek`, `twoWeeks`, `oneMonth`, `unlimited`.|
|emailAddressSource|userEmailSource|Email attribute that is picked from AAD and injected into this profile before installing on the device. Possible values are: `userPrincipalName`, `primarySmtpAddress`.|
|emailSyncSchedule|emailSyncSchedule|Email sync schedule. Possible values are: `userDefined`, `asMessagesArrive`, `manual`, `fifteenMinutes`, `thirtyMinutes`, `sixtyMinutes`, `basedOnMyUsage`.|
|hostName|String|Exchange location (URL) that the native mail app connects to.|
|requireSmime|Boolean|Indicates whether or not to use S/MIME certificate.|
|requireSsl|Boolean|Indicates whether or not to use SSL.|
|syncCalendar|Boolean|Toggles syncing the calendar. If set to false calendar is turned off on the device.|
|syncContacts|Boolean|Toggles syncing contacts. If set to false contacts are turned off on the device.|
|syncNotes|Boolean|Toggles syncing notes. If set to false notes are turned off on the device.|
|syncTasks|Boolean|Toggles syncing tasks. If set to false tasks are turned off on the device.|
|userDomainNameSource|domainNameSource|UserDomainname attribute that is picked from AAD and injected into this profile before installing on the device. Possible values are: `fullDomainName`, `netBiosDomainName`.|
|usernameSource|androidUsernameSource|Username attribute that is picked from AAD and injected into this profile before installing on the device. Possible values are: `username`, `userPrincipalName`, `samAccountName`, `primarySmtpAddress`.|



## Response

If successful, this method returns a `200 OK` response code and an updated [androidEasEmailProfileConfiguration](../resources/androideasemailprofileconfiguration.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_androideasemailprofileconfiguration"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0** Entity URI for microsoft.graph.androidEasEmailProfileConfiguration not found
Content-Type: application/json
Content-length: 1123

{
  "@odata.type": "#microsoft.graph.androidEasEmailProfileConfiguration",
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
  "accountName": "String",
  "authenticationMethod": "String",
  "customDomainName": "String",
  "durationOfEmailToSync": "String",
  "emailAddressSource": "String",
  "emailSyncSchedule": "String",
  "hostName": "String",
  "requireSmime": "Boolean",
  "requireSsl": "Boolean",
  "syncCalendar": "Boolean",
  "syncContacts": "Boolean",
  "syncNotes": "Boolean",
  "syncTasks": "Boolean",
  "userDomainNameSource": "String",
  "usernameSource": "String"
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
  "@odata.type": "#microsoft.graph.androidEasEmailProfileConfiguration",
  "id": "3af3dbd4-dbd4-3af3-d4db-f33ad4dbf33a",
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
  "accountName": "String",
  "authenticationMethod": "String",
  "customDomainName": "String",
  "durationOfEmailToSync": "String",
  "emailAddressSource": "String",
  "emailSyncSchedule": "String",
  "hostName": "String",
  "requireSmime": "Boolean",
  "requireSsl": "Boolean",
  "syncCalendar": "Boolean",
  "syncContacts": "Boolean",
  "syncNotes": "Boolean",
  "syncTasks": "Boolean",
  "userDomainNameSource": "String",
  "usernameSource": "String"
}
```


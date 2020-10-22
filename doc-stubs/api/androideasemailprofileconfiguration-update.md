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
PATCH ** Entity URI for microsoft.graph.androidEasEmailProfileConfiguration not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [androidEasEmailProfileConfiguration](../resources/androideasemailprofileconfiguration.md) object.

The following table shows the properties that are required when you create the [androidEasEmailProfileConfiguration](../resources/androideasemailprofileconfiguration.md).

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
|accountName|String|**TODO: Add Description**|
|authenticationMethod|easAuthenticationMethod|**TODO: Add Description**. Possible values are: `usernameAndPassword`, `certificate`, `derivedCredential`.|
|syncCalendar|Boolean|**TODO: Add Description**|
|syncContacts|Boolean|**TODO: Add Description**|
|syncTasks|Boolean|**TODO: Add Description**|
|syncNotes|Boolean|**TODO: Add Description**|
|durationOfEmailToSync|emailSyncDuration|**TODO: Add Description**. Possible values are: `userDefined`, `oneDay`, `threeDays`, `oneWeek`, `twoWeeks`, `oneMonth`, `unlimited`.|
|emailAddressSource|userEmailSource|**TODO: Add Description**. Possible values are: `userPrincipalName`, `primarySmtpAddress`.|
|emailSyncSchedule|emailSyncSchedule|**TODO: Add Description**. Possible values are: `userDefined`, `asMessagesArrive`, `manual`, `fifteenMinutes`, `thirtyMinutes`, `sixtyMinutes`, `basedOnMyUsage`.|
|hostName|String|**TODO: Add Description**|
|requireSmime|Boolean|**TODO: Add Description**|
|requireSsl|Boolean|**TODO: Add Description**|
|usernameSource|androidUsernameSource|**TODO: Add Description**. Possible values are: `username`, `userPrincipalName`, `samAccountName`, `primarySmtpAddress`.|
|userDomainNameSource|domainNameSource|**TODO: Add Description**. Possible values are: `fullDomainName`, `netBiosDomainName`.|
|customDomainName|String|**TODO: Add Description**|



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
PATCH https://graph.microsoft.com/beta** Entity URI for microsoft.graph.androidEasEmailProfileConfiguration not found
Content-Type: application/json
Content-length: 1123

{
  "@odata.type": "#microsoft.graph.androidEasEmailProfileConfiguration",
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
  "accountName": "String",
  "authenticationMethod": "String",
  "syncCalendar": "Boolean",
  "syncContacts": "Boolean",
  "syncTasks": "Boolean",
  "syncNotes": "Boolean",
  "durationOfEmailToSync": "String",
  "emailAddressSource": "String",
  "emailSyncSchedule": "String",
  "hostName": "String",
  "requireSmime": "Boolean",
  "requireSsl": "Boolean",
  "usernameSource": "String",
  "userDomainNameSource": "String",
  "customDomainName": "String"
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
  "id": "092c0434-0434-092c-3404-2c0934042c09",
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
  "accountName": "String",
  "authenticationMethod": "String",
  "syncCalendar": "Boolean",
  "syncContacts": "Boolean",
  "syncTasks": "Boolean",
  "syncNotes": "Boolean",
  "durationOfEmailToSync": "String",
  "emailAddressSource": "String",
  "emailSyncSchedule": "String",
  "hostName": "String",
  "requireSmime": "Boolean",
  "requireSsl": "Boolean",
  "usernameSource": "String",
  "userDomainNameSource": "String",
  "customDomainName": "String"
}
```


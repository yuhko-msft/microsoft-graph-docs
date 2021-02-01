---
title: "managedAppProtection resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# managedAppProtection resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [managedAppPolicy](../resources/managedapppolicy.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List managedAppProtections](../api/managedappprotection-list.md)|[managedAppProtection](../resources/managedappprotection.md) collection|Get a list of the [managedAppProtection](../resources/managedappprotection.md) objects and their properties.|
|[Create managedAppProtection](../api/managedappprotection-create.md)|[managedAppProtection](../resources/managedappprotection.md)|Create a new [managedAppProtection](../resources/managedappprotection.md) object.|
|[Get managedAppProtection](../api/managedappprotection-get.md)|[managedAppProtection](../resources/managedappprotection.md)|Read the properties and relationships of a [managedAppProtection](../resources/managedappprotection.md) object.|
|[Update managedAppProtection](../api/managedappprotection-update.md)|[managedAppProtection](../resources/managedappprotection.md)|Update the properties of a [managedAppProtection](../resources/managedappprotection.md) object.|
|[Delete managedAppProtection](../api/managedappprotection-delete.md)|None|Deletes a [managedAppProtection](../resources/managedappprotection.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|allowedDataIngestionLocations|managedAppDataIngestionLocation collection|**TODO: Add Description**|
|allowedDataStorageLocations|managedAppDataStorageLocation collection|**TODO: Add Description**|
|allowedInboundDataTransferSources|managedAppDataTransferLevel|**TODO: Add Description**. Possible values are: `allApps`, `managedApps`, `none`.|
|allowedOutboundClipboardSharingExceptionLength|Int32|**TODO: Add Description**|
|allowedOutboundClipboardSharingLevel|managedAppClipboardSharingLevel|**TODO: Add Description**. Possible values are: `allApps`, `managedAppsWithPasteIn`, `managedApps`, `blocked`.|
|allowedOutboundDataTransferDestinations|managedAppDataTransferLevel|**TODO: Add Description**. Possible values are: `allApps`, `managedApps`, `none`.|
|appActionIfDeviceComplianceRequired|managedAppRemediationAction|**TODO: Add Description**. Possible values are: `block`, `wipe`, `warn`.|
|appActionIfMaximumPinRetriesExceeded|managedAppRemediationAction|**TODO: Add Description**. Possible values are: `block`, `wipe`, `warn`.|
|appActionIfUnableToAuthenticateUser|managedAppRemediationAction|**TODO: Add Description**. Possible values are: `block`, `wipe`, `warn`.|
|blockDataIngestionIntoOrganizationDocuments|Boolean|**TODO: Add Description**|
|contactSyncBlocked|Boolean|**TODO: Add Description**|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [managedAppPolicy](../resources/intune-managedapppolicy.md)|
|dataBackupBlocked|Boolean|**TODO: Add Description**|
|description|String|**TODO: Add Description** Inherited from [managedAppPolicy](../resources/intune-managedapppolicy.md)|
|deviceComplianceRequired|Boolean|**TODO: Add Description**|
|dialerRestrictionLevel|managedAppPhoneNumberRedirectLevel|**TODO: Add Description**. Possible values are: `allApps`, `managedApps`, `customApp`, `blocked`.|
|disableAppPinIfDevicePinIsSet|Boolean|**TODO: Add Description**|
|displayName|String|**TODO: Add Description** Inherited from [managedAppPolicy](../resources/intune-managedapppolicy.md)|
|fingerprintBlocked|Boolean|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [managedAppPolicy](../resources/intune-managedapppolicy.md)|
|managedBrowser|managedBrowserType|**TODO: Add Description**. Possible values are: `notConfigured`, `microsoftEdge`.|
|managedBrowserToOpenLinksRequired|Boolean|**TODO: Add Description**|
|maximumAllowedDeviceThreatLevel|managedAppDeviceThreatLevel|**TODO: Add Description**. Possible values are: `notConfigured`, `secured`, `low`, `medium`, `high`.|
|maximumPinRetries|Int32|**TODO: Add Description**|
|maximumRequiredOsVersion|String|**TODO: Add Description**|
|maximumWarningOsVersion|String|**TODO: Add Description**|
|maximumWipeOsVersion|String|**TODO: Add Description**|
|minimumPinLength|Int32|**TODO: Add Description**|
|minimumRequiredAppVersion|String|**TODO: Add Description**|
|minimumRequiredOsVersion|String|**TODO: Add Description**|
|minimumWarningAppVersion|String|**TODO: Add Description**|
|minimumWarningOsVersion|String|**TODO: Add Description**|
|minimumWipeAppVersion|String|**TODO: Add Description**|
|minimumWipeOsVersion|String|**TODO: Add Description**|
|mobileThreatDefenseRemediationAction|managedAppRemediationAction|**TODO: Add Description**. Possible values are: `block`, `wipe`, `warn`.|
|notificationRestriction|managedAppNotificationRestriction|**TODO: Add Description**. Possible values are: `allow`, `blockOrganizationalData`, `block`.|
|organizationalCredentialsRequired|Boolean|**TODO: Add Description**|
|periodBeforePinReset|Duration|**TODO: Add Description**|
|periodOfflineBeforeAccessCheck|Duration|**TODO: Add Description**|
|periodOfflineBeforeWipeIsEnforced|Duration|**TODO: Add Description**|
|periodOnlineBeforeAccessCheck|Duration|**TODO: Add Description**|
|pinCharacterSet|managedAppPinCharacterSet|**TODO: Add Description**. Possible values are: `numeric`, `alphanumericAndSymbol`.|
|pinRequired|Boolean|**TODO: Add Description**|
|pinRequiredInsteadOfBiometricTimeout|Duration|**TODO: Add Description**|
|previousPinBlockCount|Int32|**TODO: Add Description**|
|printBlocked|Boolean|**TODO: Add Description**|
|roleScopeTagIds|String collection|**TODO: Add Description** Inherited from [managedAppPolicy](../resources/intune-managedapppolicy.md)|
|saveAsBlocked|Boolean|**TODO: Add Description**|
|simplePinBlocked|Boolean|**TODO: Add Description**|
|version|String|**TODO: Add Description** Inherited from [managedAppPolicy](../resources/intune-managedapppolicy.md)|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.managedAppProtection",
  "baseType": "microsoft.graph.managedAppPolicy",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.managedAppProtection",
  "id": "String (identifier)",
  "displayName": "String",
  "description": "String",
  "createdDateTime": "String (timestamp)",
  "lastModifiedDateTime": "String (timestamp)",
  "roleScopeTagIds": [
    "String"
  ],
  "version": "String",
  "periodOfflineBeforeAccessCheck": "String (duration)",
  "periodOnlineBeforeAccessCheck": "String (duration)",
  "allowedInboundDataTransferSources": "String",
  "allowedOutboundDataTransferDestinations": "String",
  "organizationalCredentialsRequired": "Boolean",
  "allowedOutboundClipboardSharingLevel": "String",
  "dataBackupBlocked": "Boolean",
  "deviceComplianceRequired": "Boolean",
  "managedBrowserToOpenLinksRequired": "Boolean",
  "saveAsBlocked": "Boolean",
  "periodOfflineBeforeWipeIsEnforced": "String (duration)",
  "pinRequired": "Boolean",
  "maximumPinRetries": "Integer",
  "simplePinBlocked": "Boolean",
  "minimumPinLength": "Integer",
  "pinCharacterSet": "String",
  "periodBeforePinReset": "String (duration)",
  "allowedDataStorageLocations": [
    "String"
  ],
  "contactSyncBlocked": "Boolean",
  "printBlocked": "Boolean",
  "fingerprintBlocked": "Boolean",
  "disableAppPinIfDevicePinIsSet": "Boolean",
  "maximumRequiredOsVersion": "String",
  "maximumWarningOsVersion": "String",
  "maximumWipeOsVersion": "String",
  "minimumRequiredOsVersion": "String",
  "minimumWarningOsVersion": "String",
  "minimumRequiredAppVersion": "String",
  "minimumWarningAppVersion": "String",
  "minimumWipeOsVersion": "String",
  "minimumWipeAppVersion": "String",
  "appActionIfDeviceComplianceRequired": "String",
  "appActionIfMaximumPinRetriesExceeded": "String",
  "pinRequiredInsteadOfBiometricTimeout": "String (duration)",
  "allowedOutboundClipboardSharingExceptionLength": "Integer",
  "notificationRestriction": "String",
  "previousPinBlockCount": "Integer",
  "managedBrowser": "String",
  "maximumAllowedDeviceThreatLevel": "String",
  "mobileThreatDefenseRemediationAction": "String",
  "blockDataIngestionIntoOrganizationDocuments": "Boolean",
  "allowedDataIngestionLocations": [
    "String"
  ],
  "appActionIfUnableToAuthenticateUser": "String",
  "dialerRestrictionLevel": "String"
}
```


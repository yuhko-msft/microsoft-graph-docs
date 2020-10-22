---
title: "targetedManagedAppProtection resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# targetedManagedAppProtection resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [managedAppProtection](../resources/managedappprotection.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List targetedManagedAppProtections](../api/targetedmanagedappprotection-list.md)|[targetedManagedAppProtection](../resources/targetedmanagedappprotection.md) collection|Get a list of the [targetedManagedAppProtection](../resources/targetedmanagedappprotection.md) objects and their properties.|
|[Create targetedManagedAppProtection](../api/targetedmanagedappprotection-create.md)|[targetedManagedAppProtection](../resources/targetedmanagedappprotection.md)|Create a new [targetedManagedAppProtection](../resources/targetedmanagedappprotection.md) object.|
|[Get targetedManagedAppProtection](../api/targetedmanagedappprotection-get.md)|[targetedManagedAppProtection](../resources/targetedmanagedappprotection.md)|Read the properties and relationships of a [targetedManagedAppProtection](../resources/targetedmanagedappprotection.md) object.|
|[Update targetedManagedAppProtection](../api/targetedmanagedappprotection-update.md)|[targetedManagedAppProtection](../resources/targetedmanagedappprotection.md)|Update the properties of a [targetedManagedAppProtection](../resources/targetedmanagedappprotection.md) object.|
|[Delete targetedManagedAppProtection](../api/targetedmanagedappprotection-delete.md)|None|Deletes a [targetedManagedAppProtection](../resources/targetedmanagedappprotection.md) object.|
|[assign](../api/targetedmanagedappprotection-assign.md)|None|**TODO: Add Description**|
|[targetApps](../api/targetedmanagedappprotection-targetapps.md)|None|**TODO: Add Description**|
|[List assignments](../api/targetedmanagedappprotection-list-assignments.md)|[targetedManagedAppPolicyAssignment](../resources/intune-targetedmanagedapppolicyassignment.md) collection|Get the targetedManagedAppPolicyAssignment resources from the assignments navigation property.|
|[Create assignments](../api/targetedmanagedappprotection-post-assignments.md)|[targetedManagedAppPolicyAssignment](../resources/intune-targetedmanagedapppolicyassignment.md)|Create a new targetedManagedAppPolicyAssignment object.|
|[Get assignments](../api/targetedmanagedappprotection-get-targetedmanagedapppolicyassignment.md)|[targetedManagedAppPolicyAssignment](../resources/intune-targetedmanagedapppolicyassignment.md)|Read the properties and relationships of a [targetedManagedAppPolicyAssignment](../resources/intune-targetedmanagedapppolicyassignment.md) object.|
|[Update assignments](../api/targetedmanagedappprotection-update-assignments.md)|[targetedManagedAppPolicyAssignment](../resources/intune-targetedmanagedapppolicyassignment.md)|Update the properties of an assignments object.|
|[Delete assignments](../api/targetedmanagedappprotection-delete-assignments.md)|None|Delete a [targetedManagedAppPolicyAssignment](../resources/intune-targetedmanagedapppolicyassignment.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|allowedDataIngestionLocations|managedAppDataIngestionLocation collection|**TODO: Add Description** Inherited from [managedAppProtection](../resources/managedappprotection.md)|
|allowedDataStorageLocations|managedAppDataStorageLocation collection|**TODO: Add Description** Inherited from [managedAppProtection](../resources/managedappprotection.md)|
|allowedInboundDataTransferSources|managedAppDataTransferLevel|**TODO: Add Description** Inherited from [managedAppProtection](../resources/managedappprotection.md). Possible values are: `allApps`, `managedApps`, `none`.|
|allowedOutboundClipboardSharingExceptionLength|Int32|**TODO: Add Description** Inherited from [managedAppProtection](../resources/managedappprotection.md)|
|allowedOutboundClipboardSharingLevel|managedAppClipboardSharingLevel|**TODO: Add Description** Inherited from [managedAppProtection](../resources/managedappprotection.md). Possible values are: `allApps`, `managedAppsWithPasteIn`, `managedApps`, `blocked`.|
|allowedOutboundDataTransferDestinations|managedAppDataTransferLevel|**TODO: Add Description** Inherited from [managedAppProtection](../resources/managedappprotection.md). Possible values are: `allApps`, `managedApps`, `none`.|
|appActionIfDeviceComplianceRequired|managedAppRemediationAction|**TODO: Add Description** Inherited from [managedAppProtection](../resources/managedappprotection.md). Possible values are: `block`, `wipe`, `warn`.|
|appActionIfMaximumPinRetriesExceeded|managedAppRemediationAction|**TODO: Add Description** Inherited from [managedAppProtection](../resources/managedappprotection.md). Possible values are: `block`, `wipe`, `warn`.|
|appActionIfUnableToAuthenticateUser|managedAppRemediationAction|**TODO: Add Description** Inherited from [managedAppProtection](../resources/managedappprotection.md). Possible values are: `block`, `wipe`, `warn`.|
|blockDataIngestionIntoOrganizationDocuments|Boolean|**TODO: Add Description** Inherited from [managedAppProtection](../resources/managedappprotection.md)|
|contactSyncBlocked|Boolean|**TODO: Add Description** Inherited from [managedAppProtection](../resources/managedappprotection.md)|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [managedAppPolicy](../resources/intune-managedapppolicy.md)|
|dataBackupBlocked|Boolean|**TODO: Add Description** Inherited from [managedAppProtection](../resources/managedappprotection.md)|
|description|String|**TODO: Add Description** Inherited from [managedAppPolicy](../resources/intune-managedapppolicy.md)|
|deviceComplianceRequired|Boolean|**TODO: Add Description** Inherited from [managedAppProtection](../resources/managedappprotection.md)|
|dialerRestrictionLevel|managedAppPhoneNumberRedirectLevel|**TODO: Add Description** Inherited from [managedAppProtection](../resources/managedappprotection.md). Possible values are: `allApps`, `managedApps`, `customApp`, `blocked`.|
|disableAppPinIfDevicePinIsSet|Boolean|**TODO: Add Description** Inherited from [managedAppProtection](../resources/managedappprotection.md)|
|displayName|String|**TODO: Add Description** Inherited from [managedAppPolicy](../resources/intune-managedapppolicy.md)|
|fingerprintBlocked|Boolean|**TODO: Add Description** Inherited from [managedAppProtection](../resources/managedappprotection.md)|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|isAssigned|Boolean|**TODO: Add Description**|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [managedAppPolicy](../resources/intune-managedapppolicy.md)|
|managedBrowser|managedBrowserType|**TODO: Add Description** Inherited from [managedAppProtection](../resources/managedappprotection.md). Possible values are: `notConfigured`, `microsoftEdge`.|
|managedBrowserToOpenLinksRequired|Boolean|**TODO: Add Description** Inherited from [managedAppProtection](../resources/managedappprotection.md)|
|maximumAllowedDeviceThreatLevel|managedAppDeviceThreatLevel|**TODO: Add Description** Inherited from [managedAppProtection](../resources/managedappprotection.md). Possible values are: `notConfigured`, `secured`, `low`, `medium`, `high`.|
|maximumPinRetries|Int32|**TODO: Add Description** Inherited from [managedAppProtection](../resources/managedappprotection.md)|
|minimumPinLength|Int32|**TODO: Add Description** Inherited from [managedAppProtection](../resources/managedappprotection.md)|
|minimumRequiredAppVersion|String|**TODO: Add Description** Inherited from [managedAppProtection](../resources/managedappprotection.md)|
|minimumRequiredOsVersion|String|**TODO: Add Description** Inherited from [managedAppProtection](../resources/managedappprotection.md)|
|minimumWarningAppVersion|String|**TODO: Add Description** Inherited from [managedAppProtection](../resources/managedappprotection.md)|
|minimumWarningOsVersion|String|**TODO: Add Description** Inherited from [managedAppProtection](../resources/managedappprotection.md)|
|minimumWipeAppVersion|String|**TODO: Add Description** Inherited from [managedAppProtection](../resources/managedappprotection.md)|
|minimumWipeOsVersion|String|**TODO: Add Description** Inherited from [managedAppProtection](../resources/managedappprotection.md)|
|mobileThreatDefenseRemediationAction|managedAppRemediationAction|**TODO: Add Description** Inherited from [managedAppProtection](../resources/managedappprotection.md). Possible values are: `block`, `wipe`, `warn`.|
|notificationRestriction|managedAppNotificationRestriction|**TODO: Add Description** Inherited from [managedAppProtection](../resources/managedappprotection.md). Possible values are: `allow`, `blockOrganizationalData`, `block`.|
|organizationalCredentialsRequired|Boolean|**TODO: Add Description** Inherited from [managedAppProtection](../resources/managedappprotection.md)|
|periodBeforePinReset|Duration|**TODO: Add Description** Inherited from [managedAppProtection](../resources/managedappprotection.md)|
|periodOfflineBeforeAccessCheck|Duration|**TODO: Add Description** Inherited from [managedAppProtection](../resources/managedappprotection.md)|
|periodOfflineBeforeWipeIsEnforced|Duration|**TODO: Add Description** Inherited from [managedAppProtection](../resources/managedappprotection.md)|
|periodOnlineBeforeAccessCheck|Duration|**TODO: Add Description** Inherited from [managedAppProtection](../resources/managedappprotection.md)|
|pinCharacterSet|managedAppPinCharacterSet|**TODO: Add Description** Inherited from [managedAppProtection](../resources/managedappprotection.md). Possible values are: `numeric`, `alphanumericAndSymbol`.|
|pinRequired|Boolean|**TODO: Add Description** Inherited from [managedAppProtection](../resources/managedappprotection.md)|
|pinRequiredInsteadOfBiometricTimeout|Duration|**TODO: Add Description** Inherited from [managedAppProtection](../resources/managedappprotection.md)|
|previousPinBlockCount|Int32|**TODO: Add Description** Inherited from [managedAppProtection](../resources/managedappprotection.md)|
|printBlocked|Boolean|**TODO: Add Description** Inherited from [managedAppProtection](../resources/managedappprotection.md)|
|roleScopeTagIds|String collection|**TODO: Add Description** Inherited from [managedAppPolicy](../resources/intune-managedapppolicy.md)|
|saveAsBlocked|Boolean|**TODO: Add Description** Inherited from [managedAppProtection](../resources/managedappprotection.md)|
|simplePinBlocked|Boolean|**TODO: Add Description** Inherited from [managedAppProtection](../resources/managedappprotection.md)|
|targetedAppManagementLevels|appManagementLevel|**TODO: Add Description**. Possible values are: `unspecified`, `unmanaged`, `mdm`, `androidEnterprise`.|
|version|String|**TODO: Add Description** Inherited from [managedAppPolicy](../resources/intune-managedapppolicy.md)|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|assignments|[targetedManagedAppPolicyAssignment](../resources/intune-targetedmanagedapppolicyassignment.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.targetedManagedAppProtection",
  "baseType": "microsoft.graph.managedAppProtection",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.targetedManagedAppProtection",
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
  "dialerRestrictionLevel": "String",
  "isAssigned": "Boolean",
  "targetedAppManagementLevels": "String"
}
```


---
title: "macManagedAppProtection resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# macManagedAppProtection resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [managedAppPolicy](../resources/managedapppolicy.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List macManagedAppProtections](../api/macmanagedappprotection-list.md)|[macManagedAppProtection](../resources/macmanagedappprotection.md) collection|Get a list of the [macManagedAppProtection](../resources/macmanagedappprotection.md) objects and their properties.|
|[Create macManagedAppProtection](../api/macmanagedappprotection-create.md)|[macManagedAppProtection](../resources/macmanagedappprotection.md)|Create a new [macManagedAppProtection](../resources/macmanagedappprotection.md) object.|
|[Get macManagedAppProtection](../api/macmanagedappprotection-get.md)|[macManagedAppProtection](../resources/macmanagedappprotection.md)|Read the properties and relationships of a [macManagedAppProtection](../resources/macmanagedappprotection.md) object.|
|[Update macManagedAppProtection](../api/macmanagedappprotection-update.md)|[macManagedAppProtection](../resources/macmanagedappprotection.md)|Update the properties of a [macManagedAppProtection](../resources/macmanagedappprotection.md) object.|
|[Delete macManagedAppProtection](../api/macmanagedappprotection-delete.md)|None|Deletes a [macManagedAppProtection](../resources/macmanagedappprotection.md) object.|
|[hasPayloadLinks](../api/macmanagedappprotection-haspayloadlinks.md)|[hasPayloadLinkResultItem](../resources/intune-haspayloadlinkresultitem.md) collection|**TODO: Add Description**|
|[targetApps](../api/macmanagedappprotection-targetapps.md)|None|**TODO: Add Description**|
|[targetApps](../api/macmanagedappprotection-targetapps.md)|None|**TODO: Add Description**|
|[assign](../api/macmanagedappprotection-assign.md)|None|**TODO: Add Description**|
|[List apps](../api/macmanagedappprotection-list-apps.md)|[managedMobileApp](../resources/intune-managedmobileapp.md) collection|Get the managedMobileApp resources from the apps navigation property.|
|[Create managedMobileApp](../api/macmanagedappprotection-post-apps.md)|[managedMobileApp](../resources/intune-managedmobileapp.md)|Create a new managedMobileApp object.|
|[List assignments](../api/macmanagedappprotection-list-assignments.md)|[targetedManagedAppPolicyAssignment](../resources/intune-targetedmanagedapppolicyassignment.md) collection|Get the targetedManagedAppPolicyAssignment resources from the assignments navigation property.|
|[Create targetedManagedAppPolicyAssignment](../api/macmanagedappprotection-post-assignments.md)|[targetedManagedAppPolicyAssignment](../resources/intune-targetedmanagedapppolicyassignment.md)|Create a new targetedManagedAppPolicyAssignment object.|
|[List managedAppPolicyDeploymentSummary](../api/macmanagedappprotection-list-deploymentsummary.md)|[managedAppPolicyDeploymentSummary](../resources/intune-managedapppolicydeploymentsummary.md) collection|Get the managedAppPolicyDeploymentSummary resources from the deploymentSummary navigation property.|
|[Create managedAppPolicyDeploymentSummary](../api/macmanagedappprotection-post-deploymentsummary.md)|[managedAppPolicyDeploymentSummary](../resources/intune-managedapppolicydeploymentsummary.md)|Create a new managedAppPolicyDeploymentSummary object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|allowedDataStorageLocations|managedAppDataStorageLocation collection|**TODO: Add Description**|
|allowedInboundDataTransferSources|managedAppDataTransferLevel|**TODO: Add Description**. Possible values are: `allApps`, `managedApps`, `none`.|
|allowedMacDeviceModels|String|**TODO: Add Description**|
|allowedOutboundClipboardSharingLevel|managedAppClipboardSharingLevel|**TODO: Add Description**. Possible values are: `allApps`, `managedAppsWithPasteIn`, `managedApps`, `blocked`.|
|allowedOutboundDataTransferDestinations|managedAppDataTransferLevel|**TODO: Add Description**. Possible values are: `allApps`, `managedApps`, `none`.|
|appActionIfMacDeviceModelNotAllowed|managedAppRemediationAction|**TODO: Add Description**. Possible values are: `block`, `wipe`, `warn`.|
|appActionIfMaximumPinRetriesExceeded|managedAppRemediationAction|**TODO: Add Description**. Possible values are: `block`, `wipe`, `warn`.|
|contactSyncBlocked|Boolean|**TODO: Add Description**|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [managedAppPolicy](../resources/intune-managedapppolicy.md)|
|dataBackupBlocked|Boolean|**TODO: Add Description**|
|deployedAppCount|Int32|**TODO: Add Description**|
|description|String|**TODO: Add Description** Inherited from [managedAppPolicy](../resources/intune-managedapppolicy.md)|
|disableAppEncryptionIfDeviceEncryptionIsEnabled|Boolean|**TODO: Add Description**|
|displayName|String|**TODO: Add Description** Inherited from [managedAppPolicy](../resources/intune-managedapppolicy.md)|
|encryptAppData|Boolean|**TODO: Add Description**|
|exemptedAppProtocols|[keyValuePair](../resources/synchronization-keyvaluepair.md) collection|**TODO: Add Description**|
|filterOpenInToOnlyManagedApps|Boolean|**TODO: Add Description**|
|fingerprintBlocked|Boolean|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|isAssigned|Boolean|**TODO: Add Description**|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [managedAppPolicy](../resources/intune-managedapppolicy.md)|
|managedBrowserToOpenLinksRequired|Boolean|**TODO: Add Description**|
|maximumPinRetries|Int32|**TODO: Add Description**|
|maximumRequiredOsVersion|String|**TODO: Add Description**|
|maximumWarningOsVersion|String|**TODO: Add Description**|
|maximumWipeOsVersion|String|**TODO: Add Description**|
|minimumPinLength|Int32|**TODO: Add Description**|
|minimumRequiredAppVersion|String|**TODO: Add Description**|
|minimumRequiredOsVersion|String|**TODO: Add Description**|
|minimumRequiredSdkVersion|String|**TODO: Add Description**|
|minimumWarningAppVersion|String|**TODO: Add Description**|
|minimumWarningOsVersion|String|**TODO: Add Description**|
|minimumWipeAppVersion|String|**TODO: Add Description**|
|minimumWipeOsVersion|String|**TODO: Add Description**|
|minimumWipeSdkVersion|String|**TODO: Add Description**|
|organizationalCredentialsRequired|Boolean|**TODO: Add Description**|
|periodBeforePinReset|Duration|**TODO: Add Description**|
|periodOfflineBeforeAccessCheck|Duration|**TODO: Add Description**|
|periodOfflineBeforeWipeIsEnforced|Duration|**TODO: Add Description**|
|periodOnlineBeforeAccessCheck|Duration|**TODO: Add Description**|
|pinCharacterSet|managedAppPinCharacterSet|**TODO: Add Description**. Possible values are: `numeric`, `alphanumericAndSymbol`.|
|pinRequired|Boolean|**TODO: Add Description**|
|pinRequiredInsteadOfBiometricTimeout|Duration|**TODO: Add Description**|
|printBlocked|Boolean|**TODO: Add Description**|
|roleScopeTagIds|String collection|**TODO: Add Description** Inherited from [managedAppPolicy](../resources/intune-managedapppolicy.md)|
|saveAsBlocked|Boolean|**TODO: Add Description**|
|simplePinBlocked|Boolean|**TODO: Add Description**|
|version|String|**TODO: Add Description** Inherited from [managedAppPolicy](../resources/intune-managedapppolicy.md)|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|apps|[managedMobileApp](../resources/intune-managedmobileapp.md) collection|**TODO: Add Description**|
|assignments|[targetedManagedAppPolicyAssignment](../resources/intune-targetedmanagedapppolicyassignment.md) collection|**TODO: Add Description**|
|deploymentSummary|[managedAppPolicyDeploymentSummary](../resources/intune-managedapppolicydeploymentsummary.md)|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.macManagedAppProtection",
  "baseType": "microsoft.graph.managedAppPolicy",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.macManagedAppProtection",
  "id": "String (identifier)",
  "displayName": "String",
  "description": "String",
  "createdDateTime": "String (timestamp)",
  "lastModifiedDateTime": "String (timestamp)",
  "roleScopeTagIds": [
    "String"
  ],
  "version": "String",
  "allowedDataStorageLocations": [
    "String"
  ],
  "allowedInboundDataTransferSources": "String",
  "allowedMacDeviceModels": "String",
  "allowedOutboundClipboardSharingLevel": "String",
  "allowedOutboundDataTransferDestinations": "String",
  "appActionIfMacDeviceModelNotAllowed": "String",
  "appActionIfMaximumPinRetriesExceeded": "String",
  "contactSyncBlocked": "Boolean",
  "dataBackupBlocked": "Boolean",
  "deployedAppCount": "Integer",
  "disableAppEncryptionIfDeviceEncryptionIsEnabled": "Boolean",
  "encryptAppData": "Boolean",
  "exemptedAppProtocols": [
    {
      "@odata.type": "microsoft.graph.keyValuePair"
    }
  ],
  "filterOpenInToOnlyManagedApps": "Boolean",
  "fingerprintBlocked": "Boolean",
  "isAssigned": "Boolean",
  "managedBrowserToOpenLinksRequired": "Boolean",
  "maximumPinRetries": "Integer",
  "minimumPinLength": "Integer",
  "minimumRequiredAppVersion": "String",
  "maximumRequiredOsVersion": "String",
  "maximumWarningOsVersion": "String",
  "maximumWipeOsVersion": "String",
  "minimumRequiredOsVersion": "String",
  "minimumRequiredSdkVersion": "String",
  "minimumWarningAppVersion": "String",
  "minimumWarningOsVersion": "String",
  "minimumWipeAppVersion": "String",
  "minimumWipeOsVersion": "String",
  "minimumWipeSdkVersion": "String",
  "organizationalCredentialsRequired": "Boolean",
  "periodBeforePinReset": "String (duration)",
  "periodOfflineBeforeAccessCheck": "String (duration)",
  "periodOfflineBeforeWipeIsEnforced": "String (duration)",
  "periodOnlineBeforeAccessCheck": "String (duration)",
  "pinCharacterSet": "String",
  "pinRequired": "Boolean",
  "pinRequiredInsteadOfBiometricTimeout": "String (duration)",
  "printBlocked": "Boolean",
  "saveAsBlocked": "Boolean",
  "simplePinBlocked": "Boolean"
}
```


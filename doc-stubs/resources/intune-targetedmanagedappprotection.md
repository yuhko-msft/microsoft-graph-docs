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
This is an abstract type.


Inherits from [managedAppProtection](../resources/intune-managedappprotection.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List targetedManagedAppProtections](../api/intune-targetedmanagedappprotection-list.md)|[targetedManagedAppProtection](../resources/intune-targetedmanagedappprotection.md) collection|Get a list of the [targetedManagedAppProtection](../resources/intune-targetedmanagedappprotection.md) objects and their properties.|
|[Create targetedManagedAppProtection](../api/intune-targetedmanagedappprotection-create.md)|[targetedManagedAppProtection](../resources/intune-targetedmanagedappprotection.md)|Create a new [targetedManagedAppProtection](../resources/intune-targetedmanagedappprotection.md) object.|
|[Get targetedManagedAppProtection](../api/intune-targetedmanagedappprotection-get.md)|[targetedManagedAppProtection](../resources/intune-targetedmanagedappprotection.md)|Read the properties and relationships of a [targetedManagedAppProtection](../resources/intune-targetedmanagedappprotection.md) object.|
|[Update targetedManagedAppProtection](../api/intune-targetedmanagedappprotection-update.md)|[targetedManagedAppProtection](../resources/intune-targetedmanagedappprotection.md)|Update the properties of a [targetedManagedAppProtection](../resources/intune-targetedmanagedappprotection.md) object.|
|[Delete targetedManagedAppProtection](../api/intune-targetedmanagedappprotection-delete.md)|None|Deletes a [targetedManagedAppProtection](../resources/intune-targetedmanagedappprotection.md) object.|
|[targetApps](../api/intune-targetedmanagedappprotection-targetapps.md)|None|**TODO: Add Description**|
|[targetApps](../api/intune-targetedmanagedappprotection-targetapps.md)|None|**TODO: Add Description**|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|allowedDataStorageLocations|managedAppDataStorageLocation collection|**TODO: Add Description** Inherited from [managedAppProtection](../resources/intune-managedappprotection.md).|
|allowedInboundDataTransferSources|managedAppDataTransferLevel|**TODO: Add Description** Inherited from [managedAppProtection](../resources/intune-managedappprotection.md). Possible values are: `allApps`, `managedApps`, `none`.|
|allowedOutboundClipboardSharingLevel|managedAppClipboardSharingLevel|**TODO: Add Description** Inherited from [managedAppProtection](../resources/intune-managedappprotection.md). Possible values are: `allApps`, `managedAppsWithPasteIn`, `managedApps`, `blocked`.|
|allowedOutboundDataTransferDestinations|managedAppDataTransferLevel|**TODO: Add Description** Inherited from [managedAppProtection](../resources/intune-managedappprotection.md). Possible values are: `allApps`, `managedApps`, `none`.|
|contactSyncBlocked|Boolean|**TODO: Add Description** Inherited from [managedAppProtection](../resources/intune-managedappprotection.md).|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [managedAppPolicy](../resources/intune-managedapppolicy.md).|
|dataBackupBlocked|Boolean|**TODO: Add Description** Inherited from [managedAppProtection](../resources/intune-managedappprotection.md).|
|description|String|**TODO: Add Description** Inherited from [managedAppPolicy](../resources/intune-managedapppolicy.md).|
|deviceComplianceRequired|Boolean|**TODO: Add Description** Inherited from [managedAppProtection](../resources/intune-managedappprotection.md).|
|disableAppPinIfDevicePinIsSet|Boolean|**TODO: Add Description** Inherited from [managedAppProtection](../resources/intune-managedappprotection.md).|
|displayName|String|**TODO: Add Description** Inherited from [managedAppPolicy](../resources/intune-managedapppolicy.md).|
|fingerprintBlocked|Boolean|**TODO: Add Description** Inherited from [managedAppProtection](../resources/intune-managedappprotection.md).|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|isAssigned|Boolean|**TODO: Add Description**|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [managedAppPolicy](../resources/intune-managedapppolicy.md).|
|managedBrowser|managedBrowserType|**TODO: Add Description** Inherited from [managedAppProtection](../resources/intune-managedappprotection.md). Possible values are: `notConfigured`, `microsoftEdge`.|
|managedBrowserToOpenLinksRequired|Boolean|**TODO: Add Description** Inherited from [managedAppProtection](../resources/intune-managedappprotection.md).|
|maximumPinRetries|Int32|**TODO: Add Description** Inherited from [managedAppProtection](../resources/intune-managedappprotection.md).|
|minimumPinLength|Int32|**TODO: Add Description** Inherited from [managedAppProtection](../resources/intune-managedappprotection.md).|
|minimumRequiredAppVersion|String|**TODO: Add Description** Inherited from [managedAppProtection](../resources/intune-managedappprotection.md).|
|minimumRequiredOsVersion|String|**TODO: Add Description** Inherited from [managedAppProtection](../resources/intune-managedappprotection.md).|
|minimumWarningAppVersion|String|**TODO: Add Description** Inherited from [managedAppProtection](../resources/intune-managedappprotection.md).|
|minimumWarningOsVersion|String|**TODO: Add Description** Inherited from [managedAppProtection](../resources/intune-managedappprotection.md).|
|organizationalCredentialsRequired|Boolean|**TODO: Add Description** Inherited from [managedAppProtection](../resources/intune-managedappprotection.md).|
|periodBeforePinReset|Duration|**TODO: Add Description** Inherited from [managedAppProtection](../resources/intune-managedappprotection.md).|
|periodOfflineBeforeAccessCheck|Duration|**TODO: Add Description** Inherited from [managedAppProtection](../resources/intune-managedappprotection.md).|
|periodOfflineBeforeWipeIsEnforced|Duration|**TODO: Add Description** Inherited from [managedAppProtection](../resources/intune-managedappprotection.md).|
|periodOnlineBeforeAccessCheck|Duration|**TODO: Add Description** Inherited from [managedAppProtection](../resources/intune-managedappprotection.md).|
|pinCharacterSet|managedAppPinCharacterSet|**TODO: Add Description** Inherited from [managedAppProtection](../resources/intune-managedappprotection.md). Possible values are: `numeric`, `alphanumericAndSymbol`.|
|pinRequired|Boolean|**TODO: Add Description** Inherited from [managedAppProtection](../resources/intune-managedappprotection.md).|
|printBlocked|Boolean|**TODO: Add Description** Inherited from [managedAppProtection](../resources/intune-managedappprotection.md).|
|saveAsBlocked|Boolean|**TODO: Add Description** Inherited from [managedAppProtection](../resources/intune-managedappprotection.md).|
|simplePinBlocked|Boolean|**TODO: Add Description** Inherited from [managedAppProtection](../resources/intune-managedappprotection.md).|
|version|String|**TODO: Add Description** Inherited from [managedAppPolicy](../resources/intune-managedapppolicy.md).|

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
  "managedBrowser": "String",
  "isAssigned": "Boolean"
}
```


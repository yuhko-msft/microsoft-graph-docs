---
title: "macManagedAppRegistration resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# macManagedAppRegistration resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [managedAppRegistration](../resources/managedappregistration.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List macManagedAppRegistrations](../api/macmanagedappregistration-list.md)|[macManagedAppRegistration](../resources/macmanagedappregistration.md) collection|Get a list of the [macManagedAppRegistration](../resources/macmanagedappregistration.md) objects and their properties.|
|[Create macManagedAppRegistration](../api/macmanagedappregistration-create.md)|[macManagedAppRegistration](../resources/macmanagedappregistration.md)|Create a new [macManagedAppRegistration](../resources/macmanagedappregistration.md) object.|
|[Get macManagedAppRegistration](../api/macmanagedappregistration-get.md)|[macManagedAppRegistration](../resources/macmanagedappregistration.md)|Read the properties and relationships of a [macManagedAppRegistration](../resources/macmanagedappregistration.md) object.|
|[Update macManagedAppRegistration](../api/macmanagedappregistration-update.md)|[macManagedAppRegistration](../resources/macmanagedappregistration.md)|Update the properties of a [macManagedAppRegistration](../resources/macmanagedappregistration.md) object.|
|[Delete macManagedAppRegistration](../api/macmanagedappregistration-delete.md)|None|Deletes a [macManagedAppRegistration](../resources/macmanagedappregistration.md) object.|
|[List appliedPolicies](../api/macmanagedappregistration-list-appliedpolicies.md)|[managedAppPolicy](../resources/intune-managedapppolicy.md) collection|Get the managedAppPolicy resources from the appliedPolicies navigation property.|
|[Create managedAppPolicy](../api/macmanagedappregistration-post-appliedpolicies.md)|[managedAppPolicy](../resources/intune-managedapppolicy.md)|Create a new managedAppPolicy object.|
|[List intendedPolicies](../api/macmanagedappregistration-list-intendedpolicies.md)|[managedAppPolicy](../resources/intune-managedapppolicy.md) collection|Get the managedAppPolicy resources from the intendedPolicies navigation property.|
|[Create managedAppPolicy](../api/macmanagedappregistration-post-intendedpolicies.md)|[managedAppPolicy](../resources/intune-managedapppolicy.md)|Create a new managedAppPolicy object.|
|[List operations](../api/macmanagedappregistration-list-operations.md)|[managedAppOperation](../resources/intune-managedappoperation.md) collection|Get the managedAppOperation resources from the operations navigation property.|
|[Create managedAppOperation](../api/macmanagedappregistration-post-operations.md)|[managedAppOperation](../resources/intune-managedappoperation.md)|Create a new managedAppOperation object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|appIdentifier|[mobileAppIdentifier](../resources/intune-mobileappidentifier.md)|**TODO: Add Description** Inherited from [managedAppRegistration](../resources/intune-managedappregistration.md)|
|applicationVersion|String|**TODO: Add Description** Inherited from [managedAppRegistration](../resources/intune-managedappregistration.md)|
|azureADDeviceId|String|**TODO: Add Description** Inherited from [managedAppRegistration](../resources/intune-managedappregistration.md)|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [managedAppRegistration](../resources/intune-managedappregistration.md)|
|deviceManufacturer|String|**TODO: Add Description** Inherited from [managedAppRegistration](../resources/intune-managedappregistration.md)|
|deviceModel|String|**TODO: Add Description** Inherited from [managedAppRegistration](../resources/intune-managedappregistration.md)|
|deviceName|String|**TODO: Add Description** Inherited from [managedAppRegistration](../resources/intune-managedappregistration.md)|
|deviceTag|String|**TODO: Add Description** Inherited from [managedAppRegistration](../resources/intune-managedappregistration.md)|
|deviceType|String|**TODO: Add Description** Inherited from [managedAppRegistration](../resources/intune-managedappregistration.md)|
|flaggedReasons|managedAppFlaggedReason collection|**TODO: Add Description** Inherited from [managedAppRegistration](../resources/intune-managedappregistration.md)|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastSyncDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [managedAppRegistration](../resources/intune-managedappregistration.md)|
|managedDeviceId|String|**TODO: Add Description** Inherited from [managedAppRegistration](../resources/intune-managedappregistration.md)|
|managementSdkVersion|String|**TODO: Add Description** Inherited from [managedAppRegistration](../resources/intune-managedappregistration.md)|
|platformVersion|String|**TODO: Add Description** Inherited from [managedAppRegistration](../resources/intune-managedappregistration.md)|
|userId|String|**TODO: Add Description** Inherited from [managedAppRegistration](../resources/intune-managedappregistration.md)|
|version|String|**TODO: Add Description** Inherited from [managedAppRegistration](../resources/intune-managedappregistration.md)|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|appliedPolicies|[managedAppPolicy](../resources/intune-managedapppolicy.md) collection|**TODO: Add Description** Inherited from [managedAppRegistration](../resources/managedappregistration.md)|
|intendedPolicies|[managedAppPolicy](../resources/intune-managedapppolicy.md) collection|**TODO: Add Description** Inherited from [managedAppRegistration](../resources/managedappregistration.md)|
|operations|[managedAppOperation](../resources/intune-managedappoperation.md) collection|**TODO: Add Description** Inherited from [managedAppRegistration](../resources/managedappregistration.md)|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.macManagedAppRegistration",
  "baseType": "microsoft.graph.managedAppRegistration",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.macManagedAppRegistration",
  "id": "String (identifier)",
  "createdDateTime": "String (timestamp)",
  "lastSyncDateTime": "String (timestamp)",
  "applicationVersion": "String",
  "managementSdkVersion": "String",
  "platformVersion": "String",
  "deviceType": "String",
  "deviceTag": "String",
  "deviceName": "String",
  "managedDeviceId": "String",
  "azureADDeviceId": "String",
  "deviceModel": "String",
  "deviceManufacturer": "String",
  "flaggedReasons": [
    "String"
  ],
  "userId": "String",
  "appIdentifier": {
    "@odata.type": "microsoft.graph.mobileAppIdentifier"
  },
  "version": "String"
}
```


---
title: "iosManagedAppRegistration resource type"
description: "Represents the synchronization details of an ios app, with management capabilities, for a specific user.
The ManagedAppRegistration resource represents the details of an app, with management capability, used by a member of the organization."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# iosManagedAppRegistration resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Represents the synchronization details of an ios app, with management capabilities, for a specific user.
The ManagedAppRegistration resource represents the details of an app, with management capability, used by a member of the organization.


Inherits from [managedAppRegistration](../resources/managedappregistration.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List iosManagedAppRegistrations](../api/iosmanagedappregistration-list.md)|[iosManagedAppRegistration](../resources/iosmanagedappregistration.md) collection|Get a list of the [iosManagedAppRegistration](../resources/iosmanagedappregistration.md) objects and their properties.|
|[Create iosManagedAppRegistration](../api/iosmanagedappregistration-create.md)|[iosManagedAppRegistration](../resources/iosmanagedappregistration.md)|Create a new [iosManagedAppRegistration](../resources/iosmanagedappregistration.md) object.|
|[Get iosManagedAppRegistration](../api/iosmanagedappregistration-get.md)|[iosManagedAppRegistration](../resources/iosmanagedappregistration.md)|Read the properties and relationships of an [iosManagedAppRegistration](../resources/iosmanagedappregistration.md) object.|
|[Update iosManagedAppRegistration](../api/iosmanagedappregistration-update.md)|[iosManagedAppRegistration](../resources/iosmanagedappregistration.md)|Update the properties of an [iosManagedAppRegistration](../resources/iosmanagedappregistration.md) object.|
|[Delete iosManagedAppRegistration](../api/iosmanagedappregistration-delete.md)|None|Deletes an [iosManagedAppRegistration](../resources/iosmanagedappregistration.md) object.|
|[List appliedPolicies](../api/iosmanagedappregistration-list-appliedpolicies.md)|[managedAppPolicy](../resources/managedapppolicy.md) collection|Get the managedAppPolicy resources from the appliedPolicies navigation property.|
|[Create managedAppPolicy](../api/iosmanagedappregistration-post-appliedpolicies.md)|[managedAppPolicy](../resources/managedapppolicy.md)|Create a new managedAppPolicy object.|
|[List intendedPolicies](../api/iosmanagedappregistration-list-intendedpolicies.md)|[managedAppPolicy](../resources/managedapppolicy.md) collection|Get the managedAppPolicy resources from the intendedPolicies navigation property.|
|[Create managedAppPolicy](../api/iosmanagedappregistration-post-intendedpolicies.md)|[managedAppPolicy](../resources/managedapppolicy.md)|Create a new managedAppPolicy object.|
|[List operations](../api/iosmanagedappregistration-list-operations.md)|[managedAppOperation](../resources/managedappoperation.md) collection|Get the managedAppOperation resources from the operations navigation property.|
|[Create managedAppOperation](../api/iosmanagedappregistration-post-operations.md)|[managedAppOperation](../resources/managedappoperation.md)|Create a new managedAppOperation object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|appIdentifier|[mobileAppIdentifier](../resources/mobileappidentifier.md)|The app package Identifier Inherited from [managedAppRegistration](../resources/managedappregistration.md).|
|applicationVersion|String|App version Inherited from [managedAppRegistration](../resources/managedappregistration.md).|
|azureADDeviceId|String|The Azure Active Directory Device identifier of the host device. Value could be empty even when the host device is Azure Active Directory registered. Inherited from [managedAppRegistration](../resources/managedappregistration.md).|
|createdDateTime|DateTimeOffset|Date and time of creation Inherited from [managedAppRegistration](../resources/managedappregistration.md).|
|deviceManufacturer|String|The device manufacturer for the current app registration  Inherited from [managedAppRegistration](../resources/managedappregistration.md).|
|deviceModel|String|The device model for the current app registration  Inherited from [managedAppRegistration](../resources/managedappregistration.md).|
|deviceName|String|Host device name Inherited from [managedAppRegistration](../resources/managedappregistration.md).|
|deviceTag|String|App management SDK generated tag, which helps relate apps hosted on the same device. Not guaranteed to relate apps in all conditions. Inherited from [managedAppRegistration](../resources/managedappregistration.md).|
|deviceType|String|Host device type Inherited from [managedAppRegistration](../resources/managedappregistration.md).|
|flaggedReasons|managedAppFlaggedReason collection|Zero or more reasons an app registration is flagged. E.g. app running on rooted device Inherited from [managedAppRegistration](../resources/managedappregistration.md).|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|lastSyncDateTime|DateTimeOffset|Date and time of last the app synced with management service. Inherited from [managedAppRegistration](../resources/managedappregistration.md).|
|managedDeviceId|String|The Managed Device identifier of the host device. Value could be empty even when the host device is managed. Inherited from [managedAppRegistration](../resources/managedappregistration.md).|
|managementSdkVersion|String|App management SDK version Inherited from [managedAppRegistration](../resources/managedappregistration.md).|
|platformVersion|String|Operating System version Inherited from [managedAppRegistration](../resources/managedappregistration.md).|
|userId|String|The user Id to who this app registration belongs. Inherited from [managedAppRegistration](../resources/managedappregistration.md).|
|version|String|Version of the entity. Inherited from [managedAppRegistration](../resources/managedappregistration.md).|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|appliedPolicies|[managedAppPolicy](../resources/managedapppolicy.md) collection|Zero or more policys already applied on the registered app when it last synchronized with managment service. Inherited from [managedAppRegistration](../resources/managedappregistration.md)|
|intendedPolicies|[managedAppPolicy](../resources/managedapppolicy.md) collection|Zero or more policies admin intended for the app as of now. Inherited from [managedAppRegistration](../resources/managedappregistration.md)|
|operations|[managedAppOperation](../resources/managedappoperation.md) collection|Zero or more long running operations triggered on the app registration. Inherited from [managedAppRegistration](../resources/managedappregistration.md)|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.iosManagedAppRegistration",
  "baseType": "microsoft.graph.managedAppRegistration",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.iosManagedAppRegistration",
  "id": "String (identifier)",
  "appIdentifier": {
    "@odata.type": "microsoft.graph.mobileAppIdentifier"
  },
  "applicationVersion": "String",
  "azureADDeviceId": "String",
  "createdDateTime": "String (timestamp)",
  "deviceManufacturer": "String",
  "deviceModel": "String",
  "deviceName": "String",
  "deviceTag": "String",
  "deviceType": "String",
  "flaggedReasons": [
    "String"
  ],
  "lastSyncDateTime": "String (timestamp)",
  "managedDeviceId": "String",
  "managementSdkVersion": "String",
  "platformVersion": "String",
  "userId": "String",
  "version": "String"
}
```


---
title: "androidManagedAppRegistration resource type"
description: "Represents the synchronization details of an android app, with management capabilities, for a specific user.
The ManagedAppRegistration resource represents the details of an app, with management capability, used by a member of the organization."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# androidManagedAppRegistration resource type

Namespace: microsoft.graph



Represents the synchronization details of an android app, with management capabilities, for a specific user.
The ManagedAppRegistration resource represents the details of an app, with management capability, used by a member of the organization.


Inherits from [managedAppRegistration](../resources/managedappregistration.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List androidManagedAppRegistrations](../api/androidmanagedappregistration-list.md)|[androidManagedAppRegistration](../resources/androidmanagedappregistration.md) collection|Get a list of the [androidManagedAppRegistration](../resources/androidmanagedappregistration.md) objects and their properties.|
|[Create androidManagedAppRegistration](../api/androidmanagedappregistration-create.md)|[androidManagedAppRegistration](../resources/androidmanagedappregistration.md)|Create a new [androidManagedAppRegistration](../resources/androidmanagedappregistration.md) object.|
|[Get androidManagedAppRegistration](../api/androidmanagedappregistration-get.md)|[androidManagedAppRegistration](../resources/androidmanagedappregistration.md)|Read the properties and relationships of an [androidManagedAppRegistration](../resources/androidmanagedappregistration.md) object.|
|[Update androidManagedAppRegistration](../api/androidmanagedappregistration-update.md)|[androidManagedAppRegistration](../resources/androidmanagedappregistration.md)|Update the properties of an [androidManagedAppRegistration](../resources/androidmanagedappregistration.md) object.|
|[Delete androidManagedAppRegistration](../api/androidmanagedappregistration-delete.md)|None|Deletes an [androidManagedAppRegistration](../resources/androidmanagedappregistration.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|appIdentifier|[mobileAppIdentifier](../resources/mobileappidentifier.md)|The app package Identifier Inherited from [managedAppRegistration](../resources/managedappregistration.md)|
|applicationVersion|String|App version Inherited from [managedAppRegistration](../resources/managedappregistration.md)|
|azureADDeviceId|String|The Azure Active Directory Device identifier of the host device. Value could be empty even when the host device is Azure Active Directory registered. Inherited from [managedAppRegistration](../resources/managedappregistration.md)|
|createdDateTime|DateTimeOffset|Date and time of creation Inherited from [managedAppRegistration](../resources/managedappregistration.md)|
|deviceManufacturer|String|The device manufacturer for the current app registration  Inherited from [managedAppRegistration](../resources/managedappregistration.md)|
|deviceModel|String|The device model for the current app registration  Inherited from [managedAppRegistration](../resources/managedappregistration.md)|
|deviceName|String|Host device name Inherited from [managedAppRegistration](../resources/managedappregistration.md)|
|deviceTag|String|App management SDK generated tag, which helps relate apps hosted on the same device. Not guaranteed to relate apps in all conditions. Inherited from [managedAppRegistration](../resources/managedappregistration.md)|
|deviceType|String|Host device type Inherited from [managedAppRegistration](../resources/managedappregistration.md)|
|flaggedReasons|managedAppFlaggedReason collection|Zero or more reasons an app registration is flagged. E.g. app running on rooted device Inherited from [managedAppRegistration](../resources/managedappregistration.md)|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastSyncDateTime|DateTimeOffset|Date and time of last the app synced with management service. Inherited from [managedAppRegistration](../resources/managedappregistration.md)|
|managedDeviceId|String|The Managed Device identifier of the host device. Value could be empty even when the host device is managed. Inherited from [managedAppRegistration](../resources/managedappregistration.md)|
|managementSdkVersion|String|App management SDK version Inherited from [managedAppRegistration](../resources/managedappregistration.md)|
|patchVersion|String|The patch version for the current android app registration|
|platformVersion|String|Operating System version Inherited from [managedAppRegistration](../resources/managedappregistration.md)|
|userId|String|The user Id to who this app registration belongs. Inherited from [managedAppRegistration](../resources/managedappregistration.md)|
|version|String|Version of the entity. Inherited from [managedAppRegistration](../resources/managedappregistration.md)|

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
  "@odata.type": "microsoft.graph.androidManagedAppRegistration",
  "baseType": "microsoft.graph.managedAppRegistration",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.androidManagedAppRegistration",
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
  "version": "String",
  "patchVersion": "String"
}
```


---
title: "managedAppRegistration resource type"
description: "The ManagedAppEntity is the base entity type for all other entity types under app management workflow.
The ManagedAppRegistration resource represents the details of an app, with management capability, used by a member of the organization."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# managedAppRegistration resource type

Namespace: microsoft.graph



The ManagedAppEntity is the base entity type for all other entity types under app management workflow.
The ManagedAppRegistration resource represents the details of an app, with management capability, used by a member of the organization.


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List managedAppRegistrations](../api/managedappregistration-list.md)|[managedAppRegistration](../resources/managedappregistration.md) collection|Get a list of the [managedAppRegistration](../resources/managedappregistration.md) objects and their properties.|
|[Create managedAppRegistration](../api/managedappregistration-create.md)|[managedAppRegistration](../resources/managedappregistration.md)|Create a new [managedAppRegistration](../resources/managedappregistration.md) object.|
|[Get managedAppRegistration](../api/managedappregistration-get.md)|[managedAppRegistration](../resources/managedappregistration.md)|Read the properties and relationships of a [managedAppRegistration](../resources/managedappregistration.md) object.|
|[Update managedAppRegistration](../api/managedappregistration-update.md)|[managedAppRegistration](../resources/managedappregistration.md)|Update the properties of a [managedAppRegistration](../resources/managedappregistration.md) object.|
|[Delete managedAppRegistration](../api/managedappregistration-delete.md)|None|Deletes a [managedAppRegistration](../resources/managedappregistration.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|appIdentifier|[mobileAppIdentifier](../resources/mobileappidentifier.md)|The app package Identifier|
|applicationVersion|String|App version|
|azureADDeviceId|String|The Azure Active Directory Device identifier of the host device. Value could be empty even when the host device is Azure Active Directory registered.|
|createdDateTime|DateTimeOffset|Date and time of creation|
|deviceManufacturer|String|The device manufacturer for the current app registration |
|deviceModel|String|The device model for the current app registration |
|deviceName|String|Host device name|
|deviceTag|String|App management SDK generated tag, which helps relate apps hosted on the same device. Not guaranteed to relate apps in all conditions.|
|deviceType|String|Host device type|
|flaggedReasons|managedAppFlaggedReason collection|Zero or more reasons an app registration is flagged. E.g. app running on rooted device|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastSyncDateTime|DateTimeOffset|Date and time of last the app synced with management service.|
|managedDeviceId|String|The Managed Device identifier of the host device. Value could be empty even when the host device is managed.|
|managementSdkVersion|String|App management SDK version|
|platformVersion|String|Operating System version|
|userId|String|The user Id to who this app registration belongs.|
|version|String|Version of the entity.|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|appliedPolicies|[managedAppPolicy](../resources/managedapppolicy.md) collection|Zero or more policys already applied on the registered app when it last synchronized with managment service.|
|intendedPolicies|[managedAppPolicy](../resources/managedapppolicy.md) collection|Zero or more policies admin intended for the app as of now.|
|operations|[managedAppOperation](../resources/managedappoperation.md) collection|Zero or more long running operations triggered on the app registration.|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.managedAppRegistration",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.managedAppRegistration",
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


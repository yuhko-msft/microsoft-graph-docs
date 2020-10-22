---
title: "deviceEnrollmentWindowsHelloForBusinessConfiguration resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceEnrollmentWindowsHelloForBusinessConfiguration resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [deviceEnrollmentConfiguration](../resources/deviceenrollmentconfiguration.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List deviceEnrollmentWindowsHelloForBusinessConfigurations](../api/intune-deviceenrollmentwindowshelloforbusinessconfiguration-list.md)|[deviceEnrollmentWindowsHelloForBusinessConfiguration](../resources/intune-deviceenrollmentwindowshelloforbusinessconfiguration.md) collection|Get a list of the [deviceEnrollmentWindowsHelloForBusinessConfiguration](../resources/deviceenrollmentwindowshelloforbusinessconfiguration.md) objects and their properties.|
|[Create deviceEnrollmentWindowsHelloForBusinessConfiguration](../api/intune-deviceenrollmentwindowshelloforbusinessconfiguration-create.md)|[deviceEnrollmentWindowsHelloForBusinessConfiguration](../resources/intune-deviceenrollmentwindowshelloforbusinessconfiguration.md)|Create a new [deviceEnrollmentWindowsHelloForBusinessConfiguration](../resources/intune-deviceenrollmentwindowshelloforbusinessconfiguration.md) object.|
|[Get deviceEnrollmentWindowsHelloForBusinessConfiguration](../api/intune-deviceenrollmentwindowshelloforbusinessconfiguration-get.md)|[deviceEnrollmentWindowsHelloForBusinessConfiguration](../resources/intune-deviceenrollmentwindowshelloforbusinessconfiguration.md)|Read the properties and relationships of a [deviceEnrollmentWindowsHelloForBusinessConfiguration](../resources/intune-deviceenrollmentwindowshelloforbusinessconfiguration.md) object.|
|[Update deviceEnrollmentWindowsHelloForBusinessConfiguration](../api/intune-deviceenrollmentwindowshelloforbusinessconfiguration-update.md)|[deviceEnrollmentWindowsHelloForBusinessConfiguration](../resources/intune-deviceenrollmentwindowshelloforbusinessconfiguration.md)|Update the properties of a [deviceEnrollmentWindowsHelloForBusinessConfiguration](../resources/intune-deviceenrollmentwindowshelloforbusinessconfiguration.md) object.|
|[Delete deviceEnrollmentWindowsHelloForBusinessConfiguration](../api/intune-deviceenrollmentwindowshelloforbusinessconfiguration-delete.md)|None|Deletes a [deviceEnrollmentWindowsHelloForBusinessConfiguration](../resources/intune-deviceenrollmentwindowshelloforbusinessconfiguration.md) object.|
|[setPriority](../api/intune-deviceenrollmentwindowshelloforbusinessconfiguration-setpriority.md)|None|**TODO: Add Description**|
|[assign](../api/intune-deviceenrollmentwindowshelloforbusinessconfiguration-assign.md)|None|**TODO: Add Description**|
|[List assignments](../api/intune-deviceenrollmentwindowshelloforbusinessconfiguration-list-assignments.md)|[enrollmentConfigurationAssignment](../resources/intune-enrollmentconfigurationassignment.md) collection|Get the enrollmentConfigurationAssignment resources from the assignments navigation property.|
|[Create assignments](../api/intune-deviceenrollmentwindowshelloforbusinessconfiguration-post-assignments.md)|[enrollmentConfigurationAssignment](../resources/intune-enrollmentconfigurationassignment.md)|Create a new enrollmentConfigurationAssignment object.|
|[Get assignments](../api/intune-deviceenrollmentwindowshelloforbusinessconfiguration-get-enrollmentconfigurationassignment.md)|[enrollmentConfigurationAssignment](../resources/intune-enrollmentconfigurationassignment.md)|Read the properties and relationships of an [enrollmentConfigurationAssignment](../resources/intune-enrollmentconfigurationassignment.md) object.|
|[Update assignments](../api/intune-deviceenrollmentwindowshelloforbusinessconfiguration-update-assignments.md)|[enrollmentConfigurationAssignment](../resources/intune-enrollmentconfigurationassignment.md)|Update the properties of an assignments object.|
|[Delete assignments](../api/intune-deviceenrollmentwindowshelloforbusinessconfiguration-delete-assignments.md)|None|Delete an [enrollmentConfigurationAssignment](../resources/intune-enrollmentconfigurationassignment.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [deviceEnrollmentConfiguration](../resources/intune-deviceenrollmentconfiguration.md)|
|description|String|**TODO: Add Description** Inherited from [deviceEnrollmentConfiguration](../resources/intune-deviceenrollmentconfiguration.md)|
|displayName|String|**TODO: Add Description** Inherited from [deviceEnrollmentConfiguration](../resources/intune-deviceenrollmentconfiguration.md)|
|enhancedBiometricsState|enablement|**TODO: Add Description**. Possible values are: `notConfigured`, `enabled`, `disabled`.|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [deviceEnrollmentConfiguration](../resources/intune-deviceenrollmentconfiguration.md)|
|pinExpirationInDays|Int32|**TODO: Add Description**|
|pinLowercaseCharactersUsage|windowsHelloForBusinessPinUsage|**TODO: Add Description**. Possible values are: `allowed`, `required`, `disallowed`.|
|pinMaximumLength|Int32|**TODO: Add Description**|
|pinMinimumLength|Int32|**TODO: Add Description**|
|pinPreviousBlockCount|Int32|**TODO: Add Description**|
|pinSpecialCharactersUsage|windowsHelloForBusinessPinUsage|**TODO: Add Description**. Possible values are: `allowed`, `required`, `disallowed`.|
|pinUppercaseCharactersUsage|windowsHelloForBusinessPinUsage|**TODO: Add Description**. Possible values are: `allowed`, `required`, `disallowed`.|
|priority|Int32|**TODO: Add Description** Inherited from [deviceEnrollmentConfiguration](../resources/intune-deviceenrollmentconfiguration.md)|
|remotePassportEnabled|Boolean|**TODO: Add Description**|
|roleScopeTagIds|String collection|**TODO: Add Description** Inherited from [deviceEnrollmentConfiguration](../resources/intune-deviceenrollmentconfiguration.md)|
|securityDeviceRequired|Boolean|**TODO: Add Description**|
|securityKeyForSignIn|enablement|**TODO: Add Description**. Possible values are: `notConfigured`, `enabled`, `disabled`.|
|state|enablement|**TODO: Add Description**. Possible values are: `notConfigured`, `enabled`, `disabled`.|
|unlockWithBiometricsEnabled|Boolean|**TODO: Add Description**|
|version|Int32|**TODO: Add Description** Inherited from [deviceEnrollmentConfiguration](../resources/intune-deviceenrollmentconfiguration.md)|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|assignments|[enrollmentConfigurationAssignment](../resources/intune-enrollmentconfigurationassignment.md) collection|**TODO: Add Description** Inherited from [deviceEnrollmentConfiguration](../resources/deviceenrollmentconfiguration.md)|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.deviceEnrollmentWindowsHelloForBusinessConfiguration",
  "baseType": "microsoft.graph.deviceEnrollmentConfiguration",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceEnrollmentWindowsHelloForBusinessConfiguration",
  "id": "String (identifier)",
  "displayName": "String",
  "description": "String",
  "priority": "Integer",
  "createdDateTime": "String (timestamp)",
  "lastModifiedDateTime": "String (timestamp)",
  "version": "Integer",
  "roleScopeTagIds": [
    "String"
  ],
  "pinMinimumLength": "Integer",
  "pinMaximumLength": "Integer",
  "pinUppercaseCharactersUsage": "String",
  "pinLowercaseCharactersUsage": "String",
  "pinSpecialCharactersUsage": "String",
  "state": "String",
  "securityDeviceRequired": "Boolean",
  "unlockWithBiometricsEnabled": "Boolean",
  "remotePassportEnabled": "Boolean",
  "pinPreviousBlockCount": "Integer",
  "pinExpirationInDays": "Integer",
  "enhancedBiometricsState": "String",
  "securityKeyForSignIn": "String"
}
```


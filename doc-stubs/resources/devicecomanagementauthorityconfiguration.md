---
title: "deviceComanagementAuthorityConfiguration resource type"
description: "Windows 10 Co-Management Authority Page Configuration"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceComanagementAuthorityConfiguration resource type

Namespace: microsoft.graph



Windows 10 Co-Management Authority Page Configuration


Inherits from [deviceEnrollmentConfiguration](../resources/deviceenrollmentconfiguration.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List deviceComanagementAuthorityConfigurations](../api/devicecomanagementauthorityconfiguration-list.md)|[deviceComanagementAuthorityConfiguration](../resources/devicecomanagementauthorityconfiguration.md) collection|Get a list of the [deviceComanagementAuthorityConfiguration](../resources/devicecomanagementauthorityconfiguration.md) objects and their properties.|
|[Create deviceComanagementAuthorityConfiguration](../api/devicecomanagementauthorityconfiguration-create.md)|[deviceComanagementAuthorityConfiguration](../resources/devicecomanagementauthorityconfiguration.md)|Create a new [deviceComanagementAuthorityConfiguration](../resources/devicecomanagementauthorityconfiguration.md) object.|
|[Get deviceComanagementAuthorityConfiguration](../api/devicecomanagementauthorityconfiguration-get.md)|[deviceComanagementAuthorityConfiguration](../resources/devicecomanagementauthorityconfiguration.md)|Read the properties and relationships of a [deviceComanagementAuthorityConfiguration](../resources/devicecomanagementauthorityconfiguration.md) object.|
|[Update deviceComanagementAuthorityConfiguration](../api/devicecomanagementauthorityconfiguration-update.md)|[deviceComanagementAuthorityConfiguration](../resources/devicecomanagementauthorityconfiguration.md)|Update the properties of a [deviceComanagementAuthorityConfiguration](../resources/devicecomanagementauthorityconfiguration.md) object.|
|[Delete deviceComanagementAuthorityConfiguration](../api/devicecomanagementauthorityconfiguration-delete.md)|None|Deletes a [deviceComanagementAuthorityConfiguration](../resources/devicecomanagementauthorityconfiguration.md) object.|
|[assign](../api/devicecomanagementauthorityconfiguration-assign.md)|None|**TODO: Add Description**|
|[setPriority](../api/devicecomanagementauthorityconfiguration-setpriority.md)|None|**TODO: Add Description**|
|[List assignments](../api/devicecomanagementauthorityconfiguration-list-assignments.md)|[enrollmentConfigurationAssignment](../resources/enrollmentconfigurationassignment.md) collection|Get the enrollmentConfigurationAssignment resources from the assignments navigation property.|
|[Create enrollmentConfigurationAssignment](../api/devicecomanagementauthorityconfiguration-post-assignments.md)|[enrollmentConfigurationAssignment](../resources/enrollmentconfigurationassignment.md)|Create a new enrollmentConfigurationAssignment object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|configurationManagerAgentCommandLineArgument|String|CoManagement Authority configuration ConfigurationManagerAgentCommandLineArgument|
|createdDateTime|DateTimeOffset|Created date time in UTC of the device enrollment configuration Inherited from [deviceEnrollmentConfiguration](../resources/deviceenrollmentconfiguration.md)|
|description|String|The description of the device enrollment configuration Inherited from [deviceEnrollmentConfiguration](../resources/deviceenrollmentconfiguration.md)|
|displayName|String|The display name of the device enrollment configuration Inherited from [deviceEnrollmentConfiguration](../resources/deviceenrollmentconfiguration.md)|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|installConfigurationManagerAgent|Boolean|CoManagement Authority configuration InstallConfigurationManagerAgent|
|lastModifiedDateTime|DateTimeOffset|Last modified date time in UTC of the device enrollment configuration Inherited from [deviceEnrollmentConfiguration](../resources/deviceenrollmentconfiguration.md)|
|managedDeviceAuthority|Int32|CoManagement Authority configuration ManagedDeviceAuthority|
|priority|Int32|Priority is used when a user exists in multiple groups that are assigned enrollment configuration. Users are subject only to the configuration with the lowest priority value. Inherited from [deviceEnrollmentConfiguration](../resources/deviceenrollmentconfiguration.md)|
|roleScopeTagIds|String collection|Optional role scope tags for the enrollment restrictions. Inherited from [deviceEnrollmentConfiguration](../resources/deviceenrollmentconfiguration.md)|
|version|Int32|The version of the device enrollment configuration Inherited from [deviceEnrollmentConfiguration](../resources/deviceenrollmentconfiguration.md)|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|assignments|[enrollmentConfigurationAssignment](../resources/enrollmentconfigurationassignment.md) collection|The list of group assignments for the device configuration profile Inherited from [deviceEnrollmentConfiguration](../resources/deviceenrollmentconfiguration.md)|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.deviceComanagementAuthorityConfiguration",
  "baseType": "microsoft.graph.deviceEnrollmentConfiguration",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceComanagementAuthorityConfiguration",
  "id": "String (identifier)",
  "createdDateTime": "String (timestamp)",
  "description": "String",
  "displayName": "String",
  "lastModifiedDateTime": "String (timestamp)",
  "priority": "Integer",
  "roleScopeTagIds": [
    "String"
  ],
  "version": "Integer",
  "configurationManagerAgentCommandLineArgument": "String",
  "installConfigurationManagerAgent": "Boolean",
  "managedDeviceAuthority": "Integer"
}
```


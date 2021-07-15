---
title: "deviceEnrollmentLimitConfiguration resource type"
description: "Device Enrollment Configuration that restricts the number of devices a user can enroll"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceEnrollmentLimitConfiguration resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Device Enrollment Configuration that restricts the number of devices a user can enroll


Inherits from [deviceEnrollmentConfiguration](../resources/deviceenrollmentconfiguration.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List deviceEnrollmentLimitConfigurations](../api/deviceenrollmentlimitconfiguration-list.md)|[deviceEnrollmentLimitConfiguration](../resources/deviceenrollmentlimitconfiguration.md) collection|Get a list of the [deviceEnrollmentLimitConfiguration](../resources/deviceenrollmentlimitconfiguration.md) objects and their properties.|
|[Create deviceEnrollmentLimitConfiguration](../api/deviceenrollmentlimitconfiguration-create.md)|[deviceEnrollmentLimitConfiguration](../resources/deviceenrollmentlimitconfiguration.md)|Create a new [deviceEnrollmentLimitConfiguration](../resources/deviceenrollmentlimitconfiguration.md) object.|
|[Get deviceEnrollmentLimitConfiguration](../api/deviceenrollmentlimitconfiguration-get.md)|[deviceEnrollmentLimitConfiguration](../resources/deviceenrollmentlimitconfiguration.md)|Read the properties and relationships of a [deviceEnrollmentLimitConfiguration](../resources/deviceenrollmentlimitconfiguration.md) object.|
|[Update deviceEnrollmentLimitConfiguration](../api/deviceenrollmentlimitconfiguration-update.md)|[deviceEnrollmentLimitConfiguration](../resources/deviceenrollmentlimitconfiguration.md)|Update the properties of a [deviceEnrollmentLimitConfiguration](../resources/deviceenrollmentlimitconfiguration.md) object.|
|[Delete deviceEnrollmentLimitConfiguration](../api/deviceenrollmentlimitconfiguration-delete.md)|None|Deletes a [deviceEnrollmentLimitConfiguration](../resources/deviceenrollmentlimitconfiguration.md) object.|
|[assign](../api/deviceenrollmentlimitconfiguration-assign.md)|None|**TODO: Add Description**|
|[setPriority](../api/deviceenrollmentlimitconfiguration-setpriority.md)|None|**TODO: Add Description**|
|[List assignments](../api/deviceenrollmentlimitconfiguration-list-assignments.md)|[enrollmentConfigurationAssignment](../resources/enrollmentconfigurationassignment.md) collection|Get the enrollmentConfigurationAssignment resources from the assignments navigation property.|
|[Create enrollmentConfigurationAssignment](../api/deviceenrollmentlimitconfiguration-post-assignments.md)|[enrollmentConfigurationAssignment](../resources/enrollmentconfigurationassignment.md)|Create a new enrollmentConfigurationAssignment object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|createdDateTime|DateTimeOffset|Created date time in UTC of the device enrollment configuration Inherited from [deviceEnrollmentConfiguration](../resources/deviceenrollmentconfiguration.md).|
|description|String|The description of the device enrollment configuration Inherited from [deviceEnrollmentConfiguration](../resources/deviceenrollmentconfiguration.md).|
|displayName|String|The display name of the device enrollment configuration Inherited from [deviceEnrollmentConfiguration](../resources/deviceenrollmentconfiguration.md).|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|lastModifiedDateTime|DateTimeOffset|Last modified date time in UTC of the device enrollment configuration Inherited from [deviceEnrollmentConfiguration](../resources/deviceenrollmentconfiguration.md).|
|limit|Int32|The maximum number of devices that a user can enroll|
|priority|Int32|Priority is used when a user exists in multiple groups that are assigned enrollment configuration. Users are subject only to the configuration with the lowest priority value. Inherited from [deviceEnrollmentConfiguration](../resources/deviceenrollmentconfiguration.md).|
|roleScopeTagIds|String collection|Optional role scope tags for the enrollment restrictions. Inherited from [deviceEnrollmentConfiguration](../resources/deviceenrollmentconfiguration.md).|
|version|Int32|The version of the device enrollment configuration Inherited from [deviceEnrollmentConfiguration](../resources/deviceenrollmentconfiguration.md).|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|assignments|[enrollmentConfigurationAssignment](../resources/enrollmentconfigurationassignment.md) collection|The list of group assignments for the device configuration profile Inherited from [deviceEnrollmentConfiguration](../resources/deviceenrollmentconfiguration.md)|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.deviceEnrollmentLimitConfiguration",
  "baseType": "microsoft.graph.deviceEnrollmentConfiguration",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceEnrollmentLimitConfiguration",
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
  "limit": "Integer"
}
```


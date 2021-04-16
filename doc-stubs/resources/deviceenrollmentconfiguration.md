---
title: "deviceEnrollmentConfiguration resource type"
description: "The Base Class of Device Enrollment Configuration"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceEnrollmentConfiguration resource type

Namespace: microsoft.graph



The Base Class of Device Enrollment Configuration


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List deviceEnrollmentConfigurations](../api/deviceenrollmentconfiguration-list.md)|[deviceEnrollmentConfiguration](../resources/deviceenrollmentconfiguration.md) collection|Get a list of the [deviceEnrollmentConfiguration](../resources/deviceenrollmentconfiguration.md) objects and their properties.|
|[Create deviceEnrollmentConfiguration](../api/deviceenrollmentconfiguration-create.md)|[deviceEnrollmentConfiguration](../resources/deviceenrollmentconfiguration.md)|Create a new [deviceEnrollmentConfiguration](../resources/deviceenrollmentconfiguration.md) object.|
|[Get deviceEnrollmentConfiguration](../api/deviceenrollmentconfiguration-get.md)|[deviceEnrollmentConfiguration](../resources/deviceenrollmentconfiguration.md)|Read the properties and relationships of a [deviceEnrollmentConfiguration](../resources/deviceenrollmentconfiguration.md) object.|
|[Update deviceEnrollmentConfiguration](../api/deviceenrollmentconfiguration-update.md)|[deviceEnrollmentConfiguration](../resources/deviceenrollmentconfiguration.md)|Update the properties of a [deviceEnrollmentConfiguration](../resources/deviceenrollmentconfiguration.md) object.|
|[Delete deviceEnrollmentConfiguration](../api/deviceenrollmentconfiguration-delete.md)|None|Deletes a [deviceEnrollmentConfiguration](../resources/deviceenrollmentconfiguration.md) object.|
|[hasPayloadLinks](../api/deviceenrollmentconfiguration-haspayloadlinks.md)|[hasPayloadLinkResultItem](../resources/haspayloadlinkresultitem.md) collection|**TODO: Add Description**|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|createdDateTime|DateTimeOffset|Created date time in UTC of the device enrollment configuration|
|description|String|The description of the device enrollment configuration|
|displayName|String|The display name of the device enrollment configuration|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastModifiedDateTime|DateTimeOffset|Last modified date time in UTC of the device enrollment configuration|
|priority|Int32|Priority is used when a user exists in multiple groups that are assigned enrollment configuration. Users are subject only to the configuration with the lowest priority value.|
|roleScopeTagIds|String collection|Optional role scope tags for the enrollment restrictions.|
|version|Int32|The version of the device enrollment configuration|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|assignments|[enrollmentConfigurationAssignment](../resources/enrollmentconfigurationassignment.md) collection|The list of group assignments for the device configuration profile|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.deviceEnrollmentConfiguration",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceEnrollmentConfiguration",
  "id": "String (identifier)",
  "createdDateTime": "String (timestamp)",
  "description": "String",
  "displayName": "String",
  "lastModifiedDateTime": "String (timestamp)",
  "priority": "Integer",
  "roleScopeTagIds": [
    "String"
  ],
  "version": "Integer"
}
```


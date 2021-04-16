---
title: "deviceManagementResourceAccessProfileBase resource type"
description: "Base Profile Type for Resource Access"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceManagementResourceAccessProfileBase resource type

Namespace: microsoft.graph



Base Profile Type for Resource Access


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List deviceManagementResourceAccessProfileBases](../api/devicemanagementresourceaccessprofilebase-list.md)|[deviceManagementResourceAccessProfileBase](../resources/devicemanagementresourceaccessprofilebase.md) collection|Get a list of the [deviceManagementResourceAccessProfileBase](../resources/devicemanagementresourceaccessprofilebase.md) objects and their properties.|
|[Create deviceManagementResourceAccessProfileBase](../api/devicemanagementresourceaccessprofilebase-create.md)|[deviceManagementResourceAccessProfileBase](../resources/devicemanagementresourceaccessprofilebase.md)|Create a new [deviceManagementResourceAccessProfileBase](../resources/devicemanagementresourceaccessprofilebase.md) object.|
|[Get deviceManagementResourceAccessProfileBase](../api/devicemanagementresourceaccessprofilebase-get.md)|[deviceManagementResourceAccessProfileBase](../resources/devicemanagementresourceaccessprofilebase.md)|Read the properties and relationships of a [deviceManagementResourceAccessProfileBase](../resources/devicemanagementresourceaccessprofilebase.md) object.|
|[Update deviceManagementResourceAccessProfileBase](../api/devicemanagementresourceaccessprofilebase-update.md)|[deviceManagementResourceAccessProfileBase](../resources/devicemanagementresourceaccessprofilebase.md)|Update the properties of a [deviceManagementResourceAccessProfileBase](../resources/devicemanagementresourceaccessprofilebase.md) object.|
|[Delete deviceManagementResourceAccessProfileBase](../api/devicemanagementresourceaccessprofilebase-delete.md)|None|Deletes a [deviceManagementResourceAccessProfileBase](../resources/devicemanagementresourceaccessprofilebase.md) object.|
|[assign](../api/devicemanagementresourceaccessprofilebase-assign.md)|[deviceManagementResourceAccessProfileAssignment](../resources/devicemanagementresourceaccessprofileassignment.md) collection|**TODO: Add Description**|
|[List assignments](../api/devicemanagementresourceaccessprofilebase-list-assignments.md)|[deviceManagementResourceAccessProfileAssignment](../resources/devicemanagementresourceaccessprofileassignment.md) collection|Get the deviceManagementResourceAccessProfileAssignment resources from the assignments navigation property.|
|[Create deviceManagementResourceAccessProfileAssignment](../api/devicemanagementresourceaccessprofilebase-post-assignments.md)|[deviceManagementResourceAccessProfileAssignment](../resources/devicemanagementresourceaccessprofileassignment.md)|Create a new deviceManagementResourceAccessProfileAssignment object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|creationDateTime|DateTimeOffset|DateTime profile was created|
|description|String|Profile description|
|displayName|String|Profile display name|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastModifiedDateTime|DateTimeOffset|DateTime profile was last modified|
|roleScopeTagIds|String collection|Scope Tags|
|version|Int32|Version of the profile|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|assignments|[deviceManagementResourceAccessProfileAssignment](../resources/devicemanagementresourceaccessprofileassignment.md) collection|The list of assignments for the device configuration profile.|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.deviceManagementResourceAccessProfileBase",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceManagementResourceAccessProfileBase",
  "id": "String (identifier)",
  "creationDateTime": "String (timestamp)",
  "description": "String",
  "displayName": "String",
  "lastModifiedDateTime": "String (timestamp)",
  "roleScopeTagIds": [
    "String"
  ],
  "version": "Integer"
}
```


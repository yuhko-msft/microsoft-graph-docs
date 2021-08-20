---
title: "deviceManagementResourceAccessProfileBase resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceManagementResourceAccessProfileBase resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**
This is an abstract type.


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List deviceManagementResourceAccessProfileBases](../api/intune-devicemanagementresourceaccessprofilebase-list.md)|[deviceManagementResourceAccessProfileBase](../resources/intune-devicemanagementresourceaccessprofilebase.md) collection|Get a list of the [deviceManagementResourceAccessProfileBase](../resources/intune-devicemanagementresourceaccessprofilebase.md) objects and their properties.|
|[Create deviceManagementResourceAccessProfileBase](../api/intune-devicemanagementresourceaccessprofilebase-create.md)|[deviceManagementResourceAccessProfileBase](../resources/intune-devicemanagementresourceaccessprofilebase.md)|Create a new [deviceManagementResourceAccessProfileBase](../resources/intune-devicemanagementresourceaccessprofilebase.md) object.|
|[Get deviceManagementResourceAccessProfileBase](../api/intune-devicemanagementresourceaccessprofilebase-get.md)|[deviceManagementResourceAccessProfileBase](../resources/intune-devicemanagementresourceaccessprofilebase.md)|Read the properties and relationships of a [deviceManagementResourceAccessProfileBase](../resources/intune-devicemanagementresourceaccessprofilebase.md) object.|
|[Update deviceManagementResourceAccessProfileBase](../api/intune-devicemanagementresourceaccessprofilebase-update.md)|[deviceManagementResourceAccessProfileBase](../resources/intune-devicemanagementresourceaccessprofilebase.md)|Update the properties of a [deviceManagementResourceAccessProfileBase](../resources/intune-devicemanagementresourceaccessprofilebase.md) object.|
|[Delete deviceManagementResourceAccessProfileBase](../api/intune-devicemanagementresourceaccessprofilebase-delete.md)|None|Deletes a [deviceManagementResourceAccessProfileBase](../resources/intune-devicemanagementresourceaccessprofilebase.md) object.|
|[queryByPlatformType](../api/intune-devicemanagementresourceaccessprofilebase-querybyplatformtype.md)|[deviceManagementResourceAccessProfileBase](../resources/intune-devicemanagementresourceaccessprofilebase.md) collection|**TODO: Add Description**|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|creationDateTime|DateTimeOffset|**TODO: Add Description**|
|description|String|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description**|
|roleScopeTagIds|String collection|**TODO: Add Description**|
|version|Int32|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|assignments|[deviceManagementResourceAccessProfileAssignment](../resources/intune-devicemanagementresourceaccessprofileassignment.md) collection|**TODO: Add Description**|

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
  "version": "Integer",
  "displayName": "String",
  "description": "String",
  "creationDateTime": "String (timestamp)",
  "lastModifiedDateTime": "String (timestamp)",
  "roleScopeTagIds": [
    "String"
  ]
}
```


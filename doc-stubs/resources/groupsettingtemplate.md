---
title: "groupSettingTemplate resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# groupSettingTemplate resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [directoryObject](../resources/directoryobject.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List groupSettingTemplates](../api/groupsettingtemplate-list.md)|[groupSettingTemplate](../resources/groupsettingtemplate.md) collection|Get a list of the [groupSettingTemplate](../resources/groupsettingtemplate.md) objects and their properties.|
|[Create groupSettingTemplate](../api/groupsettingtemplate-post-groupsettingtemplates.md)|[groupSettingTemplate](../resources/groupsettingtemplate.md)|Create a new [groupSettingTemplate](../resources/groupsettingtemplate.md) object.|
|[Get groupSettingTemplate](../api/groupsettingtemplate-get.md)|[groupSettingTemplate](../resources/groupsettingtemplate.md)|Read the properties and relationships of a [groupSettingTemplate](../resources/groupsettingtemplate.md) object.|
|[Update groupSettingTemplate](../api/groupsettingtemplate-update.md)|[groupSettingTemplate](../resources/groupsettingtemplate.md)|Update the properties of a [groupSettingTemplate](../resources/groupsettingtemplate.md) object.|
|[Delete groupSettingTemplate](../api/groupsettingtemplate-delete.md)|None|Deletes a [groupSettingTemplate](../resources/groupsettingtemplate.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|deletedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [directoryObject](../resources/directoryobject.md).|
|description|String|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [directoryObject](../resources/directoryobject.md).|
|values|[settingTemplateValue](../resources/settingtemplatevalue.md) collection|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.groupSettingTemplate",
  "baseType": "Microsoft.DirectoryServices.directoryObject",
  "openType": true
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.groupSettingTemplate",
  "id": "String (identifier)",
  "deletedDateTime": "String (timestamp)",
  "displayName": "String",
  "description": "String",
  "values": [
    {
      "@odata.type": "microsoft.graph.settingTemplateValue"
    }
  ]
}
```


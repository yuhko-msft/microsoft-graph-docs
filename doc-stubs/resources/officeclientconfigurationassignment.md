---
title: "officeClientConfigurationAssignment resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# officeClientConfigurationAssignment resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List officeClientConfigurationAssignments](../api/officeclientconfigurationassignment-list.md)|[officeClientConfigurationAssignment](../resources/officeclientconfigurationassignment.md) collection|Get a list of the [officeClientConfigurationAssignment](../resources/officeclientconfigurationassignment.md) objects and their properties.|
|[Create officeClientConfigurationAssignment](../api/officeclientconfigurationassignment-create.md)|[officeClientConfigurationAssignment](../resources/officeclientconfigurationassignment.md)|Create a new [officeClientConfigurationAssignment](../resources/officeclientconfigurationassignment.md) object.|
|[Get officeClientConfigurationAssignment](../api/officeclientconfigurationassignment-get.md)|[officeClientConfigurationAssignment](../resources/officeclientconfigurationassignment.md)|Read the properties and relationships of an [officeClientConfigurationAssignment](../resources/officeclientconfigurationassignment.md) object.|
|[Update officeClientConfigurationAssignment](../api/officeclientconfigurationassignment-update.md)|[officeClientConfigurationAssignment](../resources/officeclientconfigurationassignment.md)|Update the properties of an [officeClientConfigurationAssignment](../resources/officeclientconfigurationassignment.md) object.|
|[Delete officeClientConfigurationAssignment](../api/officeclientconfigurationassignment-delete.md)|None|Deletes an [officeClientConfigurationAssignment](../resources/officeclientconfigurationassignment.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|target|[officeConfigurationAssignmentTarget](../resources/officeconfigurationassignmenttarget.md)|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.officeClientConfigurationAssignment",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.officeClientConfigurationAssignment",
  "id": "String (identifier)",
  "target": {
    "@odata.type": "microsoft.graph.officeConfigurationAssignmentTarget"
  }
}
```


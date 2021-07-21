---
title: "cloudPcUserSettingAssignment resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# cloudPcUserSettingAssignment resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List cloudPcUserSettingAssignments](../api/cloudpcusersettingassignment-list.md)|[cloudPcUserSettingAssignment](../resources/cloudpcusersettingassignment.md) collection|Get a list of the [cloudPcUserSettingAssignment](../resources/cloudpcusersettingassignment.md) objects and their properties.|
|[Create cloudPcUserSettingAssignment](../api/cloudpcusersettingassignment-create.md)|[cloudPcUserSettingAssignment](../resources/cloudpcusersettingassignment.md)|Create a new [cloudPcUserSettingAssignment](../resources/cloudpcusersettingassignment.md) object.|
|[Get cloudPcUserSettingAssignment](../api/cloudpcusersettingassignment-get.md)|[cloudPcUserSettingAssignment](../resources/cloudpcusersettingassignment.md)|Read the properties and relationships of a [cloudPcUserSettingAssignment](../resources/cloudpcusersettingassignment.md) object.|
|[Update cloudPcUserSettingAssignment](../api/cloudpcusersettingassignment-update.md)|[cloudPcUserSettingAssignment](../resources/cloudpcusersettingassignment.md)|Update the properties of a [cloudPcUserSettingAssignment](../resources/cloudpcusersettingassignment.md) object.|
|[Delete cloudPcUserSettingAssignment](../api/cloudpcusersettingassignment-delete.md)|None|Deletes a [cloudPcUserSettingAssignment](../resources/cloudpcusersettingassignment.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|createdDateTime|DateTimeOffset|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|target|[cloudPcManagementAssignmentTarget](../resources/cloudpcmanagementassignmenttarget.md)|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.cloudPcUserSettingAssignment",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.cloudPcUserSettingAssignment",
  "id": "String (identifier)",
  "createdDateTime": "String (timestamp)",
  "target": {
    "@odata.type": "microsoft.graph.cloudPcManagementAssignmentTarget"
  }
}
```


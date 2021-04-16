---
title: "deviceConfigurationUserStateSummary resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceConfigurationUserStateSummary resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List deviceConfigurationUserStateSummaries](../api/deviceconfigurationuserstatesummary-list.md)|[deviceConfigurationUserStateSummary](../resources/deviceconfigurationuserstatesummary.md) collection|Get a list of the [deviceConfigurationUserStateSummary](../resources/deviceconfigurationuserstatesummary.md) objects and their properties.|
|[Create deviceConfigurationUserStateSummary](../api/deviceconfigurationuserstatesummary-create.md)|[deviceConfigurationUserStateSummary](../resources/deviceconfigurationuserstatesummary.md)|Create a new [deviceConfigurationUserStateSummary](../resources/deviceconfigurationuserstatesummary.md) object.|
|[Get deviceConfigurationUserStateSummary](../api/deviceconfigurationuserstatesummary-get.md)|[deviceConfigurationUserStateSummary](../resources/deviceconfigurationuserstatesummary.md)|Read the properties and relationships of a [deviceConfigurationUserStateSummary](../resources/deviceconfigurationuserstatesummary.md) object.|
|[Update deviceConfigurationUserStateSummary](../api/deviceconfigurationuserstatesummary-update.md)|[deviceConfigurationUserStateSummary](../resources/deviceconfigurationuserstatesummary.md)|Update the properties of a [deviceConfigurationUserStateSummary](../resources/deviceconfigurationuserstatesummary.md) object.|
|[Delete deviceConfigurationUserStateSummary](../api/deviceconfigurationuserstatesummary-delete.md)|None|Deletes a [deviceConfigurationUserStateSummary](../resources/deviceconfigurationuserstatesummary.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|compliantUserCount|Int32|Number of compliant users|
|conflictUserCount|Int32|Number of conflict users|
|errorUserCount|Int32|Number of error users|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|nonCompliantUserCount|Int32|Number of NonCompliant users|
|notApplicableUserCount|Int32|Number of not applicable users|
|remediatedUserCount|Int32|Number of remediated users|
|unknownUserCount|Int32|Number of unknown users|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.deviceConfigurationUserStateSummary",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceConfigurationUserStateSummary",
  "id": "String (identifier)",
  "compliantUserCount": "Integer",
  "conflictUserCount": "Integer",
  "errorUserCount": "Integer",
  "nonCompliantUserCount": "Integer",
  "notApplicableUserCount": "Integer",
  "remediatedUserCount": "Integer",
  "unknownUserCount": "Integer"
}
```


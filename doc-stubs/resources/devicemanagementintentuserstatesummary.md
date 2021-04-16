---
title: "deviceManagementIntentUserStateSummary resource type"
description: "Entity that represents user state summary for an intent"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceManagementIntentUserStateSummary resource type

Namespace: microsoft.graph



Entity that represents user state summary for an intent


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List deviceManagementIntentUserStateSummaries](../api/devicemanagementintentuserstatesummary-list.md)|[deviceManagementIntentUserStateSummary](../resources/devicemanagementintentuserstatesummary.md) collection|Get a list of the [deviceManagementIntentUserStateSummary](../resources/devicemanagementintentuserstatesummary.md) objects and their properties.|
|[Create deviceManagementIntentUserStateSummary](../api/devicemanagementintentuserstatesummary-create.md)|[deviceManagementIntentUserStateSummary](../resources/devicemanagementintentuserstatesummary.md)|Create a new [deviceManagementIntentUserStateSummary](../resources/devicemanagementintentuserstatesummary.md) object.|
|[Get deviceManagementIntentUserStateSummary](../api/devicemanagementintentuserstatesummary-get.md)|[deviceManagementIntentUserStateSummary](../resources/devicemanagementintentuserstatesummary.md)|Read the properties and relationships of a [deviceManagementIntentUserStateSummary](../resources/devicemanagementintentuserstatesummary.md) object.|
|[Update deviceManagementIntentUserStateSummary](../api/devicemanagementintentuserstatesummary-update.md)|[deviceManagementIntentUserStateSummary](../resources/devicemanagementintentuserstatesummary.md)|Update the properties of a [deviceManagementIntentUserStateSummary](../resources/devicemanagementintentuserstatesummary.md) object.|
|[Delete deviceManagementIntentUserStateSummary](../api/devicemanagementintentuserstatesummary-delete.md)|None|Deletes a [deviceManagementIntentUserStateSummary](../resources/devicemanagementintentuserstatesummary.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|conflictCount|Int32|Number of users in conflict|
|errorCount|Int32|Number of error users|
|failedCount|Int32|Number of failed users|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|notApplicableCount|Int32|Number of not applicable users|
|successCount|Int32|Number of succeeded users|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.deviceManagementIntentUserStateSummary",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceManagementIntentUserStateSummary",
  "id": "String (identifier)",
  "conflictCount": "Integer",
  "errorCount": "Integer",
  "failedCount": "Integer",
  "notApplicableCount": "Integer",
  "successCount": "Integer"
}
```


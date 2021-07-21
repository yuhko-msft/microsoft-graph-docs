---
title: "deviceComplianceScheduledActionForRule resource type"
description: "Scheduled Action for Rule"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceComplianceScheduledActionForRule resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Scheduled Action for Rule


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List deviceComplianceScheduledActionForRules](../api/devicecompliancescheduledactionforrule-list.md)|[deviceComplianceScheduledActionForRule](../resources/devicecompliancescheduledactionforrule.md) collection|Get a list of the [deviceComplianceScheduledActionForRule](../resources/devicecompliancescheduledactionforrule.md) objects and their properties.|
|[Create deviceComplianceScheduledActionForRule](../api/devicecompliancescheduledactionforrule-create.md)|[deviceComplianceScheduledActionForRule](../resources/devicecompliancescheduledactionforrule.md)|Create a new [deviceComplianceScheduledActionForRule](../resources/devicecompliancescheduledactionforrule.md) object.|
|[Get deviceComplianceScheduledActionForRule](../api/devicecompliancescheduledactionforrule-get.md)|[deviceComplianceScheduledActionForRule](../resources/devicecompliancescheduledactionforrule.md)|Read the properties and relationships of a [deviceComplianceScheduledActionForRule](../resources/devicecompliancescheduledactionforrule.md) object.|
|[Update deviceComplianceScheduledActionForRule](../api/devicecompliancescheduledactionforrule-update.md)|[deviceComplianceScheduledActionForRule](../resources/devicecompliancescheduledactionforrule.md)|Update the properties of a [deviceComplianceScheduledActionForRule](../resources/devicecompliancescheduledactionforrule.md) object.|
|[Delete deviceComplianceScheduledActionForRule](../api/devicecompliancescheduledactionforrule-delete.md)|None|Deletes a [deviceComplianceScheduledActionForRule](../resources/devicecompliancescheduledactionforrule.md) object.|
|[List scheduledActionConfigurations](../api/devicecompliancescheduledactionforrule-list-scheduledactionconfigurations.md)|[deviceComplianceActionItem](../resources/devicecomplianceactionitem.md) collection|Get the deviceComplianceActionItem resources from the scheduledActionConfigurations navigation property.|
|[Create deviceComplianceActionItem](../api/devicecompliancescheduledactionforrule-post-scheduledactionconfigurations.md)|[deviceComplianceActionItem](../resources/devicecomplianceactionitem.md)|Create a new deviceComplianceActionItem object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|ruleName|String|Name of the rule which this scheduled action applies to.|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|scheduledActionConfigurations|[deviceComplianceActionItem](../resources/devicecomplianceactionitem.md) collection|The list of scheduled action configurations for this compliance policy.|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.deviceComplianceScheduledActionForRule",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceComplianceScheduledActionForRule",
  "id": "String (identifier)",
  "ruleName": "String"
}
```


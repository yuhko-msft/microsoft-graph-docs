---
title: "onPremisesAgent resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# onPremisesAgent resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List onPremisesAgents](../api/onpremisesagent-list.md)|[onPremisesAgent](../resources/onpremisesagent.md) collection|Get a list of the [onPremisesAgent](../resources/onpremisesagent.md) objects and their properties.|
|[Create onPremisesAgent](../api/onpremisesagent-create.md)|[onPremisesAgent](../resources/onpremisesagent.md)|Create a new [onPremisesAgent](../resources/onpremisesagent.md) object.|
|[Get onPremisesAgent](../api/onpremisesagent-get.md)|[onPremisesAgent](../resources/onpremisesagent.md)|Read the properties and relationships of an [onPremisesAgent](../resources/onpremisesagent.md) object.|
|[Update onPremisesAgent](../api/onpremisesagent-update.md)|[onPremisesAgent](../resources/onpremisesagent.md)|Update the properties of an [onPremisesAgent](../resources/onpremisesagent.md) object.|
|[Delete onPremisesAgent](../api/onpremisesagent-delete.md)|None|Deletes an [onPremisesAgent](../resources/onpremisesagent.md) object.|
|[List agentGroups](../api/onpremisesagent-list-agentgroups.md)|[onPremisesAgentGroup](../resources/onpremisesagentgroup.md) collection|Get the onPremisesAgentGroup resources from the agentGroups navigation property.|
|[Add onPremisesAgentGroup](../api/onpremisesagent-post-agentgroups.md)|[onPremisesAgentGroup](../resources/onpremisesagentgroup.md)|Add agentGroups by posting to the agentGroups collection.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|externalIp|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|machineName|String|**TODO: Add Description**|
|status|agentStatus|**TODO: Add Description**. Possible values are: `active`, `inactive`.|
|supportedPublishingTypes|onPremisesPublishingType collection|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|agentGroups|[onPremisesAgentGroup](../resources/onpremisesagentgroup.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.onPremisesAgent",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.onPremisesAgent",
  "id": "String (identifier)",
  "externalIp": "String",
  "machineName": "String",
  "status": "String",
  "supportedPublishingTypes": [
    "String"
  ]
}
```


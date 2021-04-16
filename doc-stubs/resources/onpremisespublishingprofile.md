---
title: "onPremisesPublishingProfile resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# onPremisesPublishingProfile resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List onPremisesPublishingProfiles](../api/onpremisespublishingprofile-list.md)|[onPremisesPublishingProfile](../resources/onpremisespublishingprofile.md) collection|Get a list of the [onPremisesPublishingProfile](../resources/onpremisespublishingprofile.md) objects and their properties.|
|[Create onPremisesPublishingProfile](../api/onpremisespublishingprofile-post-onpremisespublishingprofiles.md)|[onPremisesPublishingProfile](../resources/onpremisespublishingprofile.md)|Create a new [onPremisesPublishingProfile](../resources/onpremisespublishingprofile.md) object.|
|[Get onPremisesPublishingProfile](../api/onpremisespublishingprofile-get.md)|[onPremisesPublishingProfile](../resources/onpremisespublishingprofile.md)|Read the properties and relationships of an [onPremisesPublishingProfile](../resources/onpremisespublishingprofile.md) object.|
|[Update onPremisesPublishingProfile](../api/onpremisespublishingprofile-update.md)|[onPremisesPublishingProfile](../resources/onpremisespublishingprofile.md)|Update the properties of an [onPremisesPublishingProfile](../resources/onpremisespublishingprofile.md) object.|
|[Delete onPremisesPublishingProfile](../api/onpremisespublishingprofile-delete.md)|None|Deletes an [onPremisesPublishingProfile](../resources/onpremisespublishingprofile.md) object.|
|[List agentGroups](../api/onpremisespublishingprofile-list-agentgroups.md)|[onPremisesAgentGroup](../resources/onpremisesagentgroup.md) collection|Get the onPremisesAgentGroup resources from the agentGroups navigation property.|
|[Create onPremisesAgentGroup](../api/onpremisespublishingprofile-post-agentgroups.md)|[onPremisesAgentGroup](../resources/onpremisesagentgroup.md)|Create a new onPremisesAgentGroup object.|
|[List agents](../api/onpremisespublishingprofile-list-agents.md)|[onPremisesAgent](../resources/onpremisesagent.md) collection|Get the onPremisesAgent resources from the agents navigation property.|
|[Create onPremisesAgent](../api/onpremisespublishingprofile-post-agents.md)|[onPremisesAgent](../resources/onpremisesagent.md)|Create a new onPremisesAgent object.|
|[List connectorGroups](../api/onpremisespublishingprofile-list-connectorgroups.md)|[connectorGroup](../resources/connectorgroup.md) collection|Get the connectorGroup resources from the connectorGroups navigation property.|
|[Create connectorGroup](../api/onpremisespublishingprofile-post-connectorgroups.md)|[connectorGroup](../resources/connectorgroup.md)|Create a new connectorGroup object.|
|[List connectors](../api/onpremisespublishingprofile-list-connectors.md)|[connector](../resources/connector.md) collection|Get the connector resources from the connectors navigation property.|
|[Create connector](../api/onpremisespublishingprofile-post-connectors.md)|[connector](../resources/connector.md)|Create a new connector object.|
|[List publishedResources](../api/onpremisespublishingprofile-list-publishedresources.md)|[publishedResource](../resources/publishedresource.md) collection|Get the publishedResource resources from the publishedResources navigation property.|
|[Create publishedResource](../api/onpremisespublishingprofile-post-publishedresources.md)|[publishedResource](../resources/publishedresource.md)|Create a new publishedResource object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|hybridAgentUpdaterConfiguration|[hybridAgentUpdaterConfiguration](../resources/hybridagentupdaterconfiguration.md)|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|isEnabled|Boolean|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|agentGroups|[onPremisesAgentGroup](../resources/onpremisesagentgroup.md) collection|**TODO: Add Description**|
|agents|[onPremisesAgent](../resources/onpremisesagent.md) collection|**TODO: Add Description**|
|connectorGroups|[connectorGroup](../resources/connectorgroup.md) collection|**TODO: Add Description**|
|connectors|[connector](../resources/connector.md) collection|**TODO: Add Description**|
|publishedResources|[publishedResource](../resources/publishedresource.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.onPremisesPublishingProfile",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.onPremisesPublishingProfile",
  "id": "String (identifier)",
  "hybridAgentUpdaterConfiguration": {
    "@odata.type": "microsoft.graph.hybridAgentUpdaterConfiguration"
  },
  "isEnabled": "Boolean"
}
```


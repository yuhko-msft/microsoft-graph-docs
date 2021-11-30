---
title: "industryDataHub resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# industryDataHub resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [mutableEntity](../resources/mutableentity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[Get industryDataHub](../api/industrydatahub-get.md)|[industryDataHub](../resources/industrydatahub.md)|Read the properties and relationships of an [industryDataHub](../resources/industrydatahub.md) object.|
|[Update industryDataHub](../api/industrydatahub-update.md)|[industryDataHub](../resources/industrydatahub.md)|Update the properties of an [industryDataHub](../resources/industrydatahub.md) object.|
|[List dataConnectors](../api/industrydatahub-list-dataconnectors.md)|[dataConnector](../resources/dataconnector.md) collection|Get the dataConnector resources from the dataConnectors navigation property.|
|[Create dataConnector](../api/industrydatahub-post-dataconnectors.md)|[dataConnector](../resources/dataconnector.md)|Create a new dataConnector object.|
|[List incomingFlows](../api/industrydatahub-list-incomingflows.md)|[incomingFlow](../resources/incomingflow.md) collection|Get the incomingFlow resources from the incomingFlows navigation property.|
|[Create incomingFlow](../api/industrydatahub-post-incomingflows.md)|[incomingFlow](../resources/incomingflow.md)|Create a new incomingFlow object.|
|[List insightsOutgoingFlow](../api/industrydatahub-list-insightsoutgoingflow.md)|[insightsOutgoingFlow](../resources/insightsoutgoingflow.md) collection|Get the insightsOutgoingFlow resources from the insightsOutgoingFlow navigation property.|
|[Create insightsOutgoingFlow](../api/industrydatahub-post-insightsoutgoingflow.md)|[insightsOutgoingFlow](../resources/insightsoutgoingflow.md)|Create a new insightsOutgoingFlow object.|
|[List operations](../api/industrydatahub-list-operations.md)|[longRunningOperation](../resources/longrunningoperation.md) collection|Get the longRunningOperation resources from the operations navigation property.|
|[Create longRunningOperation](../api/industrydatahub-post-operations.md)|[longRunningOperation](../resources/longrunningoperation.md)|Create a new longRunningOperation object.|
|[List referenceDefinitions](../api/industrydatahub-list-referencedefinitions.md)|[referenceDefinition](../resources/referencedefinition.md) collection|Get the referenceDefinition resources from the referenceDefinitions navigation property.|
|[Create referenceDefinition](../api/industrydatahub-post-referencedefinitions.md)|[referenceDefinition](../resources/referencedefinition.md)|Create a new referenceDefinition object.|
|[List roleGroups](../api/industrydatahub-list-rolegroups.md)|[roleGroup](../resources/rolegroup.md) collection|Get the roleGroup resources from the roleGroups navigation property.|
|[Create roleGroup](../api/industrydatahub-post-rolegroups.md)|[roleGroup](../resources/rolegroup.md)|Create a new roleGroup object.|
|[List runGroups](../api/industrydatahub-list-rungroups.md)|[runGroup](../resources/rungroup.md) collection|Get the runGroup resources from the runGroups navigation property.|
|[Create runGroup](../api/industrydatahub-post-rungroups.md)|[runGroup](../resources/rungroup.md)|Create a new runGroup object.|
|[List sourceSystems](../api/industrydatahub-list-sourcesystems.md)|[sourceSystemDefinition](../resources/sourcesystemdefinition.md) collection|Get the sourceSystemDefinition resources from the sourceSystems navigation property.|
|[Create sourceSystemDefinition](../api/industrydatahub-post-sourcesystems.md)|[sourceSystemDefinition](../resources/sourcesystemdefinition.md)|Create a new sourceSystemDefinition object.|
|[List years](../api/industrydatahub-list-years.md)|[yearTimePeriodDefinition](../resources/yeartimeperioddefinition.md) collection|Get the yearTimePeriodDefinition resources from the years navigation property.|
|[Create yearTimePeriodDefinition](../api/industrydatahub-post-years.md)|[yearTimePeriodDefinition](../resources/yeartimeperioddefinition.md)|Create a new yearTimePeriodDefinition object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|eTag|String|**TODO: Add Description** Inherited from [mutableEntity](../resources/mutableentity.md).|
|statistics|[industryDataHubStatistics](../resources/industrydatahubstatistics.md)|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|dataConnectors|[dataConnector](../resources/dataconnector.md) collection|**TODO: Add Description**|
|incomingFlows|[incomingFlow](../resources/incomingflow.md) collection|**TODO: Add Description**|
|insightsOutgoingFlow|[insightsOutgoingFlow](../resources/insightsoutgoingflow.md)|**TODO: Add Description**|
|operations|[longRunningOperation](../resources/longrunningoperation.md) collection|**TODO: Add Description**|
|referenceDefinitions|[referenceDefinition](../resources/referencedefinition.md) collection|**TODO: Add Description**|
|roleGroups|[roleGroup](../resources/rolegroup.md) collection|**TODO: Add Description**|
|runGroups|[runGroup](../resources/rungroup.md) collection|**TODO: Add Description**|
|sourceSystems|[sourceSystemDefinition](../resources/sourcesystemdefinition.md) collection|**TODO: Add Description**|
|years|[yearTimePeriodDefinition](../resources/yeartimeperioddefinition.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.industryDataHub",
  "baseType": "microsoft.industryData.mutableEntity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.industryDataHub",
  "eTag": "String",
  "statistics": {
    "@odata.type": "microsoft.graph.industryDataHubStatistics"
  }
}
```


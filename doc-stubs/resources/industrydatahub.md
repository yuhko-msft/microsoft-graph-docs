---
title: "industryDataHub resource type"
description: "The root singleton for the industryData API."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# industryDataHub resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

The root singleton for the industryData API.


Inherits from [mutableEntity](../resources/mutableentity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[Get industryDataHub](../api/industrydatahub-get.md)|[industryDataHub](../resources/industrydatahub.md)|Read the properties and relationships of an [industryDataHub](../resources/industrydatahub.md) object.|
|[Update industryDataHub](../api/industrydatahub-update.md)|[industryDataHub](../resources/industrydatahub.md)|Update the properties of an [industryDataHub](../resources/industrydatahub.md) object.|
|[resetDataModelToDefaults](../api/industrydatahub-resetdatamodeltodefaults.md)|None|TODO:Description|
|[List dataConnectors](../api/industrydatahub-list-dataconnectors.md)|[dataConnector](../resources/dataconnector.md) collection|Get the dataConnector resources from the dataConnectors navigation property.|
|[Create dataConnector](../api/industrydatahub-post-dataconnectors.md)|[dataConnector](../resources/dataconnector.md)|Create a new dataConnector object.|
|[List dataShareOutgoingFlows](../api/industrydatahub-list-datashareoutgoingflows.md)|[dataShareOutgoingFlow](../resources/datashareoutgoingflow.md) collection|Get the dataShareOutgoingFlow resources from the dataShareOutgoingFlows navigation property.|
|[Create dataShareOutgoingFlow](../api/industrydatahub-post-datashareoutgoingflows.md)|[dataShareOutgoingFlow](../resources/datashareoutgoingflow.md)|Create a new dataShareOutgoingFlow object.|
|[List directoryMatchingProcess](../api/industrydatahub-list-directorymatchingprocess.md)|[directoryMatchingProcess](../resources/directorymatchingprocess.md) collection|Get the directoryMatchingProcess resources from the directoryMatchingProcess navigation property.|
|[Create directoryMatchingProcess](../api/industrydatahub-post-directorymatchingprocess.md)|[directoryMatchingProcess](../resources/directorymatchingprocess.md)|Create a new directoryMatchingProcess object.|
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
|eTag|String|Individual eTag for an entity to provide standard web concurrency control. Inherited from [mutableEntity](../resources/mutableentity.md).|
|id|String|Unique identifier for the entity. Read-only. Inherited from [entity](../resources/entity.md).|
|identityMatchingSettings|[identityMatchingSettings](../resources/identitymatchingsettings.md)|Global settings for matching identities with external systems.|
|statistics|[industryDataHubStatistics](../resources/industrydatahubstatistics.md)|The statistics associated with a tenant, such active users, organizations, sections, enrollments etc.|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|dataConnectors|[dataConnector](../resources/dataconnector.md) collection|Set of connectors for importing data from source systems.|
|dataShareOutgoingFlows|[dataShareOutgoingFlow](../resources/datashareoutgoingflow.md) collection|Set of outgoing flows to send data from the canonical store to an external Azure Data Lake.|
|directoryMatchingProcess|[directoryMatchingProcess](../resources/directorymatchingprocess.md)|Process representing the task of matching consolidated incoming data with Azure Active Directory.|
|incomingFlows|[incomingFlow](../resources/incomingflow.md) collection|Set of data import flow processes to bring data into the canonical store via a connector.|
|insightsOutgoingFlow|[insightsOutgoingFlow](../resources/insightsoutgoingflow.md)|Flow process to enable and send data to the Insights feature.|
|operations|[longRunningOperation](../resources/longrunningoperation.md) collection|Read-only set of ephemeral operations the system is currently executing.|
|referenceDefinitions|[referenceDefinition](../resources/referencedefinition.md) collection|Set of user modifiable system picker types.|
|roleGroups|[roleGroup](../resources/rolegroup.md) collection|Set of groups of individual roles used to make role-based admin simpler.|
|runGroups|[runGroup](../resources/rungroup.md) collection|Read-only set of groups of run information presenting the point-in-time diagnostic state of processes run by the system.|
|sourceSystems|[sourceSystemDefinition](../resources/sourcesystemdefinition.md) collection|The set of systems representing real work external systems.|
|years|[yearTimePeriodDefinition](../resources/yeartimeperioddefinition.md) collection|Set of years represented int the system.|

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
  "id": "String (identifier)",
  "eTag": "String",
  "identityMatchingSettings": {
    "@odata.type": "microsoft.graph.identityMatchingSettings"
  },
  "statistics": {
    "@odata.type": "microsoft.graph.industryDataHubStatistics"
  }
}
```


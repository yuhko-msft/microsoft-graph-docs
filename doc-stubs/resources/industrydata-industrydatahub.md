---
title: "industryDataHub resource type"
description: "The root singleton for the industryData API."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# industryDataHub resource type

Namespace: microsoft.graph.industryData

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

The root singleton for the industryData API.


Inherits from [mutableEntity](../resources/industrydata-mutableentity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[Get industryDataHub](../api/industrydata-industrydatahub-get.md)|[microsoft.graph.industryData.industryDataHub](../resources/industrydata-industrydatahub.md)|Read the properties and relationships of an [industryDataHub](../resources/industrydata-industrydatahub.md) object.|
|[Update industryDataHub](../api/industrydata-industrydatahub-update.md)|[microsoft.graph.industryData.industryDataHub](../resources/industrydata-industrydatahub.md)|Update the properties of an [industryDataHub](../resources/industrydata-industrydatahub.md) object.|
|[resetDataModelToDefaults](../api/industrydata-industrydatahub-resetdatamodeltodefaults.md)|None|**TODO: Add Description**|
|[List dataConnectors](../api/industrydata-industrydatahub-list-dataconnectors.md)|[microsoft.graph.industryData.dataConnector](../resources/industrydata-dataconnector.md) collection|Get the dataConnector resources from the dataConnectors navigation property.|
|[Create dataConnector](../api/industrydata-industrydatahub-post-dataconnectors.md)|[microsoft.graph.industryData.dataConnector](../resources/industrydata-dataconnector.md)|Create a new dataConnector object.|
|[List dataShareOutgoingFlows](../api/industrydata-industrydatahub-list-datashareoutgoingflows.md)|[microsoft.graph.industryData.dataShareOutgoingFlow](../resources/industrydata-datashareoutgoingflow.md) collection|Get the dataShareOutgoingFlow resources from the dataShareOutgoingFlows navigation property.|
|[Create dataShareOutgoingFlow](../api/industrydata-industrydatahub-post-datashareoutgoingflows.md)|[microsoft.graph.industryData.dataShareOutgoingFlow](../resources/industrydata-datashareoutgoingflow.md)|Create a new dataShareOutgoingFlow object.|
|[List directoryMatchingProcess](../api/industrydata-industrydatahub-list-directorymatchingprocess.md)|[microsoft.graph.industryData.directoryMatchingProcess](../resources/industrydata-directorymatchingprocess.md) collection|Get the directoryMatchingProcess resources from the directoryMatchingProcess navigation property.|
|[Create directoryMatchingProcess](../api/industrydata-industrydatahub-post-directorymatchingprocess.md)|[microsoft.graph.industryData.directoryMatchingProcess](../resources/industrydata-directorymatchingprocess.md)|Create a new directoryMatchingProcess object.|
|[List incomingFlows](../api/industrydata-industrydatahub-list-incomingflows.md)|[microsoft.graph.industryData.incomingFlow](../resources/industrydata-incomingflow.md) collection|Get the incomingFlow resources from the incomingFlows navigation property.|
|[Create incomingFlow](../api/industrydata-industrydatahub-post-incomingflows.md)|[microsoft.graph.industryData.incomingFlow](../resources/industrydata-incomingflow.md)|Create a new incomingFlow object.|
|[List insightsOutgoingFlow](../api/industrydata-industrydatahub-list-insightsoutgoingflow.md)|[microsoft.graph.industryData.insightsOutgoingFlow](../resources/industrydata-insightsoutgoingflow.md) collection|Get the insightsOutgoingFlow resources from the insightsOutgoingFlow navigation property.|
|[Create insightsOutgoingFlow](../api/industrydata-industrydatahub-post-insightsoutgoingflow.md)|[microsoft.graph.industryData.insightsOutgoingFlow](../resources/industrydata-insightsoutgoingflow.md)|Create a new insightsOutgoingFlow object.|
|[List operations](../api/industrydata-industrydatahub-list-operations.md)|[microsoft.graph.longRunningOperation](../resources/industrydata-longrunningoperation.md) collection|Get the longRunningOperation resources from the operations navigation property.|
|[Create longRunningOperation](../api/industrydata-industrydatahub-post-operations.md)|[microsoft.graph.longRunningOperation](../resources/industrydata-longrunningoperation.md)|Create a new longRunningOperation object.|
|[List referenceDefinitions](../api/industrydata-industrydatahub-list-referencedefinitions.md)|[microsoft.graph.industryData.referenceDefinition](../resources/industrydata-referencedefinition.md) collection|Get the referenceDefinition resources from the referenceDefinitions navigation property.|
|[Create referenceDefinition](../api/industrydata-industrydatahub-post-referencedefinitions.md)|[microsoft.graph.industryData.referenceDefinition](../resources/industrydata-referencedefinition.md)|Create a new referenceDefinition object.|
|[List roleGroups](../api/industrydata-industrydatahub-list-rolegroups.md)|[microsoft.graph.industryData.roleGroup](../resources/industrydata-rolegroup.md) collection|Get the roleGroup resources from the roleGroups navigation property.|
|[Create roleGroup](../api/industrydata-industrydatahub-post-rolegroups.md)|[microsoft.graph.industryData.roleGroup](../resources/industrydata-rolegroup.md)|Create a new roleGroup object.|
|[List runGroups](../api/industrydata-industrydatahub-list-rungroups.md)|[microsoft.graph.industryData.runGroup](../resources/industrydata-rungroup.md) collection|Get the runGroup resources from the runGroups navigation property.|
|[Create runGroup](../api/industrydata-industrydatahub-post-rungroups.md)|[microsoft.graph.industryData.runGroup](../resources/industrydata-rungroup.md)|Create a new runGroup object.|
|[List sourceSystems](../api/industrydata-industrydatahub-list-sourcesystems.md)|[microsoft.graph.industryData.sourceSystemDefinition](../resources/industrydata-sourcesystemdefinition.md) collection|Get the sourceSystemDefinition resources from the sourceSystems navigation property.|
|[Create sourceSystemDefinition](../api/industrydata-industrydatahub-post-sourcesystems.md)|[microsoft.graph.industryData.sourceSystemDefinition](../resources/industrydata-sourcesystemdefinition.md)|Create a new sourceSystemDefinition object.|
|[List years](../api/industrydata-industrydatahub-list-years.md)|[microsoft.graph.industryData.yearTimePeriodDefinition](../resources/industrydata-yeartimeperioddefinition.md) collection|Get the yearTimePeriodDefinition resources from the years navigation property.|
|[Create yearTimePeriodDefinition](../api/industrydata-industrydatahub-post-years.md)|[microsoft.graph.industryData.yearTimePeriodDefinition](../resources/industrydata-yeartimeperioddefinition.md)|Create a new yearTimePeriodDefinition object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|eTag|String|Individual eTag for an entity to provide standard web concurrency control. Inherited from [mutableEntity](../resources/industrydata-mutableentity.md).|
|identityMatchingSettings|[microsoft.graph.industryData.identityMatchingSettings](../resources/industrydata-identitymatchingsettings.md)|Global settings for matching identities with external systems.|
|statistics|[microsoft.graph.industryData.industryDataHubStatistics](../resources/industrydata-industrydatahubstatistics.md)|The statistics associated with a tenant, such active users, organizations, sections, enrollments etc.|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|dataConnectors|[microsoft.graph.industryData.dataConnector](../resources/industrydata-dataconnector.md) collection|Set of connectors for importing data from source systems.|
|dataShareOutgoingFlows|[microsoft.graph.industryData.dataShareOutgoingFlow](../resources/industrydata-datashareoutgoingflow.md) collection|Set of outgoing flows to send data from the canonical store to an external Azure Data Lake.|
|directoryMatchingProcess|[directoryMatchingProcess](../resources/industrydata-directorymatchingprocess.md)|Process representing the task of matching consolidated incoming data with Azure Active Directory.|
|incomingFlows|[microsoft.graph.industryData.incomingFlow](../resources/industrydata-incomingflow.md) collection|Set of data import flow processes to bring data into the canonical store via a connector.|
|insightsOutgoingFlow|[insightsOutgoingFlow](../resources/industrydata-insightsoutgoingflow.md)|Flow process to enable and send data to the Insights feature.|
|operations|[microsoft.graph.longRunningOperation](../resources/industrydata-longrunningoperation.md) collection|Read-only set of ephemeral operations the system is currently executing.|
|referenceDefinitions|[microsoft.graph.industryData.referenceDefinition](../resources/industrydata-referencedefinition.md) collection|Set of user modifiable system picker types.|
|roleGroups|[microsoft.graph.industryData.roleGroup](../resources/industrydata-rolegroup.md) collection|Set of groups of individual roles used to make role-based admin simpler.|
|runGroups|[microsoft.graph.industryData.runGroup](../resources/industrydata-rungroup.md) collection|Read-only set of groups of run information presenting the point-in-time diagnostic state of processes run by the system.|
|sourceSystems|[microsoft.graph.industryData.sourceSystemDefinition](../resources/industrydata-sourcesystemdefinition.md) collection|The set of systems representing real work external systems.|
|years|[microsoft.graph.industryData.yearTimePeriodDefinition](../resources/industrydata-yeartimeperioddefinition.md) collection|Set of years represented int the system.|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.industryData.industryDataHub",
  "baseType": "microsoft.graph.industryData.mutableEntity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.industryData.industryDataHub",
  "eTag": "String",
  "identityMatchingSettings": {
    "@odata.type": "microsoft.graph.industryData.identityMatchingSettings"
  },
  "statistics": {
    "@odata.type": "microsoft.graph.industryData.industryDataHubStatistics"
  }
}
```


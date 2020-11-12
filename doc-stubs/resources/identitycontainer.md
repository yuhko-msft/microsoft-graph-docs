---
title: "identityContainer resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# identityContainer resource type

Namespace: microsoft.graph

**TODO: Add Description**

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List identityContainers](../api/identitycontainer-list.md)|[identityContainer](../resources/identitycontainer.md) collection|Get a list of the [identityContainer](../resources/identitycontainer.md) objects and their properties.|
|[Create identityContainer](../api/identitycontainer-create.md)|[identityContainer](../resources/identitycontainer.md)|Create a new [identityContainer](../resources/identitycontainer.md) object.|
|[Get identityContainer](../api/identitycontainer-get.md)|[identityContainer](../resources/identitycontainer.md)|Read the properties and relationships of an [identityContainer](../resources/identitycontainer.md) object.|
|[Update identityContainer](../api/identitycontainer-update.md)|[identityContainer](../resources/identitycontainer.md)|Update the properties of an [identityContainer](../resources/identitycontainer.md) object.|
|[Delete identityContainer](../api/identitycontainer-delete.md)|None|Deletes an [identityContainer](../resources/identitycontainer.md) object.|
|[List apiConnectors](../api/identitycontainer-list-apiconnectors.md)|[identityApiConnector](../resources/identityapiconnector.md) collection|Get the identityApiConnector resources from the apiConnectors navigation property.|
|[Create apiConnectors](../api/identitycontainer-post-apiconnectors.md)|[identityApiConnector](../resources/identityapiconnector.md)|Create a new identityApiConnector object.|
|[Get apiConnectors](../api/identitycontainer-get-identityapiconnector.md)|[identityApiConnector](../resources/identityapiconnector.md)|Read the properties and relationships of an [identityApiConnector](../resources/identityapiconnector.md) object.|
|[Update apiConnectors](../api/identitycontainer-update-apiconnectors.md)|[identityApiConnector](../resources/identityapiconnector.md)|Update the properties of an apiConnectors object.|
|[Delete apiConnectors](../api/identitycontainer-delete-apiconnectors.md)|None|Delete an [identityApiConnector](../resources/identityapiconnector.md) object.|
|[List events](../api/identitycontainer-list-events.md)|[authenticationEventsPolicy](../resources/authenticationeventspolicy.md) collection|Get the authenticationEventsPolicy resources from the events navigation property.|
|[Create events](../api/identitycontainer-post-events.md)|[authenticationEventsPolicy](../resources/authenticationeventspolicy.md)|Create a new authenticationEventsPolicy object.|
|[Get events](../api/identitycontainer-get-authenticationeventspolicy.md)|[authenticationEventsPolicy](../resources/authenticationeventspolicy.md)|Read the properties and relationships of an [authenticationEventsPolicy](../resources/authenticationeventspolicy.md) object.|
|[Update events](../api/identitycontainer-update-events.md)|[authenticationEventsPolicy](../resources/authenticationeventspolicy.md)|Update the properties of an events object.|
|[Delete events](../api/identitycontainer-delete-events.md)|None|Delete an [authenticationEventsPolicy](../resources/authenticationeventspolicy.md) object.|
|[List featureConfigurations](../api/identitycontainer-list-featureconfigurations.md)|[featureConfiguration](../resources/featureconfiguration.md) collection|Get the featureConfiguration resources from the featureConfigurations navigation property.|
|[Create featureConfigurations](../api/identitycontainer-post-featureconfigurations.md)|[featureConfiguration](../resources/featureconfiguration.md)|Create a new featureConfiguration object.|
|[Get featureConfigurations](../api/identitycontainer-get-featureconfiguration.md)|[featureConfiguration](../resources/featureconfiguration.md)|Read the properties and relationships of a [featureConfiguration](../resources/featureconfiguration.md) object.|
|[Update featureConfigurations](../api/identitycontainer-update-featureconfigurations.md)|[featureConfiguration](../resources/featureconfiguration.md)|Update the properties of a featureConfigurations object.|
|[Delete featureConfigurations](../api/identitycontainer-delete-featureconfigurations.md)|None|Delete a [featureConfiguration](../resources/featureconfiguration.md) object.|
|[List userFlowAttributes](../api/identitycontainer-list-userflowattributes.md)|[identityUserFlowAttribute](../resources/identityuserflowattribute.md) collection|Get the identityUserFlowAttribute resources from the userFlowAttributes navigation property.|
|[Create userFlowAttributes](../api/identitycontainer-post-userflowattributes.md)|[identityUserFlowAttribute](../resources/identityuserflowattribute.md)|Create a new identityUserFlowAttribute object.|
|[Get userFlowAttributes](../api/identitycontainer-get-identityuserflowattribute.md)|[identityUserFlowAttribute](../resources/identityuserflowattribute.md)|Read the properties and relationships of an [identityUserFlowAttribute](../resources/identityuserflowattribute.md) object.|
|[Update userFlowAttributes](../api/identitycontainer-update-userflowattributes.md)|[identityUserFlowAttribute](../resources/identityuserflowattribute.md)|Update the properties of a userFlowAttributes object.|
|[Delete userFlowAttributes](../api/identitycontainer-delete-userflowattributes.md)|None|Delete an [identityUserFlowAttribute](../resources/identityuserflowattribute.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|apiConnectors|[identityApiConnector](../resources/identityapiconnector.md) collection|**TODO: Add Description**|
|b2cUserFlows|[b2cIdentityUserFlow](../resources/b2cidentityuserflow.md) collection|**TODO: Add Description**|
|b2xUserFlows|[b2xIdentityUserFlow](../resources/b2xidentityuserflow.md) collection|**TODO: Add Description**|
|events|[authenticationEventsPolicy](../resources/authenticationeventspolicy.md)|**TODO: Add Description**|
|featureConfigurations|[featureConfiguration](../resources/featureconfiguration.md) collection|**TODO: Add Description**|
|userFlowAttributes|[identityUserFlowAttribute](../resources/identityuserflowattribute.md) collection|**TODO: Add Description**|
|userFlows|[identityUserFlow](../resources/identityuserflow.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.identityContainer",
  "baseType": "",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.identityContainer",
  "id": "String (identifier)"
}
```


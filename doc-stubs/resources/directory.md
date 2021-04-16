---
title: "directory resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# directory resource type

Namespace: microsoft.graph



**TODO: Add Description**

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[Get directory](../api/directory-get.md)|[directory](../resources/directory.md)|Read the properties and relationships of a [directory](../resources/directory.md) object.|
|[Update directory](../api/directory-update.md)|[directory](../resources/directory.md)|Update the properties of a [directory](../resources/directory.md) object.|
|[List featureRolloutPolicies](../api/directory-list-featurerolloutpolicies.md)|[featureRolloutPolicy](../resources/featurerolloutpolicy.md) collection|Get the featureRolloutPolicy resources from the featureRolloutPolicies navigation property.|
|[Create featureRolloutPolicy](../api/directory-post-featurerolloutpolicies.md)|[featureRolloutPolicy](../resources/featurerolloutpolicy.md)|Create a new featureRolloutPolicy object.|
|[List sharedEmailDomains](../api/directory-list-sharedemaildomains.md)|[sharedEmailDomain](../resources/sharedemaildomain.md) collection|Get the sharedEmailDomain resources from the sharedEmailDomains navigation property.|
|[Create sharedEmailDomain](../api/directory-post-sharedemaildomains.md)|[sharedEmailDomain](../resources/sharedemaildomain.md)|Create a new sharedEmailDomain object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|administrativeUnits|[administrativeUnit](../resources/administrativeunit.md) collection|**TODO: Add Description**|
|customSecurityAttributeDefinitions|[customSecurityAttributeDefinition](../resources/customsecurityattributedefinition.md) collection|**TODO: Add Description**|
|deletedItems|[directoryObject](../resources/directoryobject.md) collection|**TODO: Add Description**|
|featureRolloutPolicies|[featureRolloutPolicy](../resources/featurerolloutpolicy.md) collection|**TODO: Add Description**|
|groupProxies|[groupProxy](../resources/groupproxy.md) collection|**TODO: Add Description**|
|sharedEmailDomains|[sharedEmailDomain](../resources/sharedemaildomain.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.directory",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.directory"
}
```


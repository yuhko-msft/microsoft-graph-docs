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

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[Get directory](../api/directory-get.md)|[directory](../resources/directory.md)|Read the properties and relationships of a [directory](../resources/directory.md) object.|
|[Update directory](../api/directory-update.md)|[directory](../resources/directory.md)|Update the properties of a [directory](../resources/directory.md) object.|
|[List administrativeUnits](../api/directory-list-administrativeunits.md)|[administrativeUnit](../resources/administrativeunit.md) collection|Get the administrativeUnit resources from the administrativeUnits navigation property.|
|[Create administrativeUnit](../api/directory-post-administrativeunits.md)|[administrativeUnit](../resources/administrativeunit.md)|Create a new administrativeUnit object.|
|[List deletedItems](../api/directory-list-deleteditems.md)|[directoryObject](../resources/directoryobject.md) collection|Get the directoryObject resources from the deletedItems navigation property.|
|[Create deletedItems](../api/directory-post-deleteditems.md)|[directoryObject](../resources/directoryobject.md)|Create a new directoryObject object.|
|[List featureRolloutPolicies](../api/directory-list-featurerolloutpolicies.md)|[featureRolloutPolicy](../resources/featurerolloutpolicy.md) collection|Get the featureRolloutPolicy resources from the featureRolloutPolicies navigation property.|
|[Create featureRolloutPolicy](../api/directory-post-featurerolloutpolicies.md)|[featureRolloutPolicy](../resources/featurerolloutpolicy.md)|Create a new featureRolloutPolicy object.|
|[List sharedEmailDomains](../api/directory-list-sharedemaildomains.md)|[sharedEmailDomain](../resources/sharedemaildomain.md) collection|Get the sharedEmailDomain resources from the sharedEmailDomains navigation property.|
|[Create sharedEmailDomain](../api/directory-post-sharedemaildomains.md)|[sharedEmailDomain](../resources/sharedemaildomain.md)|Create a new sharedEmailDomain object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|administrativeUnits|[administrativeUnit](../resources/administrativeunit.md) collection|**TODO: Add Description**|
|deletedItems|[directoryObject](../resources/directoryobject.md) collection|**TODO: Add Description**|
|featureRolloutPolicies|[featureRolloutPolicy](../resources/featurerolloutpolicy.md) collection|**TODO: Add Description**|
|sharedEmailDomains|[sharedEmailDomain](../resources/sharedemaildomain.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.directory",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.directory",
  "id": "String (identifier)"
}
```


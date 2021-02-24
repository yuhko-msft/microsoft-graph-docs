---
title: "featureRolloutPolicy resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# featureRolloutPolicy resource type

Namespace: microsoft.graph



**TODO: Add Description**

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List featureRolloutPolicies](../api/featurerolloutpolicy-list.md)|[featureRolloutPolicy](../resources/featurerolloutpolicy.md) collection|Get a list of the [featureRolloutPolicy](../resources/featurerolloutpolicy.md) objects and their properties.|
|[Create featureRolloutPolicy](../api/featurerolloutpolicy-create.md)|[featureRolloutPolicy](../resources/featurerolloutpolicy.md)|Create a new [featureRolloutPolicy](../resources/featurerolloutpolicy.md) object.|
|[Get featureRolloutPolicy](../api/featurerolloutpolicy-get.md)|[featureRolloutPolicy](../resources/featurerolloutpolicy.md)|Read the properties and relationships of a [featureRolloutPolicy](../resources/featurerolloutpolicy.md) object.|
|[Update featureRolloutPolicy](../api/featurerolloutpolicy-update.md)|[featureRolloutPolicy](../resources/featurerolloutpolicy.md)|Update the properties of a [featureRolloutPolicy](../resources/featurerolloutpolicy.md) object.|
|[Delete featureRolloutPolicy](../api/featurerolloutpolicy-delete.md)|None|Deletes a [featureRolloutPolicy](../resources/featurerolloutpolicy.md) object.|
|[List appliesTo](../api/featurerolloutpolicy-list-appliesto.md)|[directoryObject](../resources/directoryobject.md) collection|Get the directoryObject resources from the appliesTo navigation property.|
|[Create appliesTo](../api/featurerolloutpolicy-post-appliesto.md)|[directoryObject](../resources/directoryobject.md)|Create a new directoryObject object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|description|String|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|feature|stagedFeatureName|**TODO: Add Description**. Possible values are: `passthroughAuthentication`, `seamlessSso`, `passwordHashSync`, `emailAsAlternateId`, `unknownFutureValue`.|
|id|String|**TODO: Add Description**|
|isAppliedToOrganization|Boolean|**TODO: Add Description**|
|isEnabled|Boolean|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|appliesTo|[directoryObject](../resources/directoryobject.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.featureRolloutPolicy",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.featureRolloutPolicy",
  "id": "String (identifier)",
  "displayName": "String",
  "description": "String",
  "feature": "String",
  "isEnabled": "Boolean",
  "isAppliedToOrganization": "Boolean"
}
```


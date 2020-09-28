---
title: "privateLinkResource resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# privateLinkResource resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List privateLinkResourcePolicies](../api/policyroot-list-privatelinkresourcepolicies.md)|[privateLinkResource](../resources/privatelinkresource.md) collection|Get the privateLinkResource resources from the privateLinkResourcePolicies navigation property.|
|[Create privateLinkResourcePolicies](../api/policyroot-post-privatelinkresourcepolicies.md)|[privateLinkResource](../resources/privatelinkresource.md)|Create a new privateLinkResource object.|
|[Update privateLinkResourcePolicies](../api/policyroot-update-privatelinkresourcepolicies.md)|[privateLinkResource](../resources/privatelinkresource.md)|Update the properties of a privateLinkResourcePolicies object.|
|[Get privateLinkResourcePolicies](../api/policyroot-get-privatelinkresource.md)|[privateLinkResource](../resources/privatelinkresource.md)|Read the properties and relationships of a [privateLinkResource](../resources/privatelinkresource.md) object.|
|[Delete privateLinkResourcePolicies](../api/policyroot-delete-privatelinkresourcepolicies.md)|None|Delete a [privateLinkResource](../resources/privatelinkresource.md) object.|
|[List privateLinkResources](../api/privatelinkresource-list.md)|[privateLinkResource](../resources/privatelinkresource.md) collection|Get a list of the [privateLinkResource](../resources/privatelinkresource.md) objects and their properties.|
|[Create privateLinkResource](../api/privatelinkresource-create.md)|[privateLinkResource](../resources/privatelinkresource.md)|Create a new [privateLinkResource](../resources/privatelinkresource.md) object.|
|[Get privateLinkResource](../api/privatelinkresource-get.md)|[privateLinkResource](../resources/privatelinkresource.md)|Read the properties and relationships of a [privateLinkResource](../resources/privatelinkresource.md) object.|
|[Update privateLinkResource](../api/privatelinkresource-update.md)|[privateLinkResource](../resources/privatelinkresource.md)|Update the properties of a [privateLinkResource](../resources/privatelinkresource.md) object.|
|[Delete privateLinkResource](../api/privatelinkresource-delete.md)|None|Deletes a [privateLinkResource](../resources/privatelinkresource.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|allowedTenantIds|String collection|**TODO: Add Description**|
|armResourceId|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.privateLinkResource",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.privateLinkResource",
  "id": "String (identifier)",
  "armResourceId": "String",
  "allowedTenantIds": [
    "String"
  ]
}
```


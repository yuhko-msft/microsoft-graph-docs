---
title: "termsOfUseContainer resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# termsOfUseContainer resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List termsOfUseContainers](../api/termsofusecontainer-list.md)|[termsOfUseContainer](../resources/termsofusecontainer.md) collection|Get a list of the [termsOfUseContainer](../resources/termsofusecontainer.md) objects and their properties.|
|[Create termsOfUseContainer](../api/termsofusecontainer-create.md)|[termsOfUseContainer](../resources/termsofusecontainer.md)|Create a new [termsOfUseContainer](../resources/termsofusecontainer.md) object.|
|[Get termsOfUseContainer](../api/termsofusecontainer-get.md)|[termsOfUseContainer](../resources/termsofusecontainer.md)|Read the properties and relationships of a [termsOfUseContainer](../resources/termsofusecontainer.md) object.|
|[Update termsOfUseContainer](../api/termsofusecontainer-update.md)|[termsOfUseContainer](../resources/termsofusecontainer.md)|Update the properties of a [termsOfUseContainer](../resources/termsofusecontainer.md) object.|
|[Delete termsOfUseContainer](../api/termsofusecontainer-delete.md)|None|Deletes a [termsOfUseContainer](../resources/termsofusecontainer.md) object.|
|[List agreementAcceptances](../api/termsofusecontainer-list-agreementacceptances.md)|[agreementAcceptance](../resources/agreementacceptance.md) collection|Get the agreementAcceptance resources from the agreementAcceptances navigation property.|
|[Create agreementAcceptance](../api/termsofusecontainer-post-agreementacceptances.md)|[agreementAcceptance](../resources/agreementacceptance.md)|Create a new agreementAcceptance object.|
|[List agreements](../api/termsofusecontainer-list-agreements.md)|[agreement](../resources/agreement.md) collection|Get the agreement resources from the agreements navigation property.|
|[Create agreement](../api/termsofusecontainer-post-agreements.md)|[agreement](../resources/agreement.md)|Create a new agreement object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|agreementAcceptances|[agreementAcceptance](../resources/agreementacceptance.md) collection|**TODO: Add Description**|
|agreements|[agreement](../resources/agreement.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.termsOfUseContainer",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.termsOfUseContainer",
  "id": "String (identifier)"
}
```


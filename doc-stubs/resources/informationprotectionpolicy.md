---
title: "informationProtectionPolicy resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# informationProtectionPolicy resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List informationProtectionPolicies](../api/informationprotectionpolicy-list.md)|[informationProtectionPolicy](../resources/informationprotectionpolicy.md) collection|Get a list of the [informationProtectionPolicy](../resources/informationprotectionpolicy.md) objects and their properties.|
|[Create informationProtectionPolicy](../api/informationprotectionpolicy-create.md)|[informationProtectionPolicy](../resources/informationprotectionpolicy.md)|Create a new [informationProtectionPolicy](../resources/informationprotectionpolicy.md) object.|
|[Get informationProtectionPolicy](../api/informationprotectionpolicy-get.md)|[informationProtectionPolicy](../resources/informationprotectionpolicy.md)|Read the properties and relationships of an [informationProtectionPolicy](../resources/informationprotectionpolicy.md) object.|
|[Update informationProtectionPolicy](../api/informationprotectionpolicy-update.md)|[informationProtectionPolicy](../resources/informationprotectionpolicy.md)|Update the properties of an [informationProtectionPolicy](../resources/informationprotectionpolicy.md) object.|
|[Delete informationProtectionPolicy](../api/informationprotectionpolicy-delete.md)|None|Deletes an [informationProtectionPolicy](../resources/informationprotectionpolicy.md) object.|
|[List labels](../api/informationprotectionpolicy-list-labels.md)|[informationProtectionLabel](../resources/informationprotectionlabel.md) collection|Get the informationProtectionLabel resources from the labels navigation property.|
|[Create informationProtectionLabel](../api/informationprotectionpolicy-post-labels.md)|[informationProtectionLabel](../resources/informationprotectionlabel.md)|Create a new informationProtectionLabel object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|labels|[informationProtectionLabel](../resources/informationprotectionlabel.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.informationProtectionPolicy",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.informationProtectionPolicy",
  "id": "String (identifier)"
}
```


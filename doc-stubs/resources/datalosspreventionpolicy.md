---
title: "dataLossPreventionPolicy resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# dataLossPreventionPolicy resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List dataLossPreventionPolicies](../api/datalosspreventionpolicy-list.md)|[dataLossPreventionPolicy](../resources/datalosspreventionpolicy.md) collection|Get a list of the [dataLossPreventionPolicy](../resources/datalosspreventionpolicy.md) objects and their properties.|
|[Create dataLossPreventionPolicy](../api/datalosspreventionpolicy-create.md)|[dataLossPreventionPolicy](../resources/datalosspreventionpolicy.md)|Create a new [dataLossPreventionPolicy](../resources/datalosspreventionpolicy.md) object.|
|[Get dataLossPreventionPolicy](../api/datalosspreventionpolicy-get.md)|[dataLossPreventionPolicy](../resources/datalosspreventionpolicy.md)|Read the properties and relationships of a [dataLossPreventionPolicy](../resources/datalosspreventionpolicy.md) object.|
|[Update dataLossPreventionPolicy](../api/datalosspreventionpolicy-update.md)|[dataLossPreventionPolicy](../resources/datalosspreventionpolicy.md)|Update the properties of a [dataLossPreventionPolicy](../resources/datalosspreventionpolicy.md) object.|
|[Delete dataLossPreventionPolicy](../api/datalosspreventionpolicy-delete.md)|None|Deletes a [dataLossPreventionPolicy](../resources/datalosspreventionpolicy.md) object.|
|[evaluate](../api/datalosspreventionpolicy-evaluate.md)|[dlpEvaluatePoliciesJobResponse](../resources/dlpevaluatepoliciesjobresponse.md)|**TODO: Add Description**|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|name|String|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.dataLossPreventionPolicy",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.dataLossPreventionPolicy",
  "id": "String (identifier)",
  "name": "String"
}
```


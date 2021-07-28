---
title: "conditionalAccessRoot resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# conditionalAccessRoot resource type

Namespace: microsoft.graph



**TODO: Add Description**

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[Get conditionalAccessRoot](../api/conditionalaccessroot-get.md)|[conditionalAccessRoot](../resources/conditionalaccessroot.md)|Read the properties and relationships of a [conditionalAccessRoot](../resources/conditionalaccessroot.md) object.|
|[Update conditionalAccessRoot](../api/conditionalaccessroot-update.md)|[conditionalAccessRoot](../resources/conditionalaccessroot.md)|Update the properties of a [conditionalAccessRoot](../resources/conditionalaccessroot.md) object.|
|[List authenticationContextClassReferences](../api/conditionalaccessroot-list-authenticationcontextclassreferences.md)|[authenticationContextClassReference](../resources/authenticationcontextclassreference.md) collection|Get the authenticationContextClassReference resources from the authenticationContextClassReferences navigation property.|
|[Create authenticationContextClassReference](../api/conditionalaccessroot-post-authenticationcontextclassreferences.md)|[authenticationContextClassReference](../resources/authenticationcontextclassreference.md)|Create a new authenticationContextClassReference object.|
|[List namedLocations](../api/conditionalaccessroot-list-namedlocations.md)|[namedLocation](../resources/namedlocation.md) collection|Get the namedLocation resources from the namedLocations navigation property.|
|[Create namedLocation](../api/conditionalaccessroot-post-namedlocations.md)|[namedLocation](../resources/namedlocation.md)|Create a new namedLocation object.|
|[List policies](../api/conditionalaccessroot-list-policies.md)|[conditionalAccessPolicy](../resources/conditionalaccesspolicy.md) collection|Get the conditionalAccessPolicy resources from the policies navigation property.|
|[Create conditionalAccessPolicy](../api/conditionalaccessroot-post-policies.md)|[conditionalAccessPolicy](../resources/conditionalaccesspolicy.md)|Create a new conditionalAccessPolicy object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|authenticationContextClassReferences|[authenticationContextClassReference](../resources/authenticationcontextclassreference.md) collection|**TODO: Add Description**|
|namedLocations|[namedLocation](../resources/namedlocation.md) collection|**TODO: Add Description**|
|policies|[conditionalAccessPolicy](../resources/conditionalaccesspolicy.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.conditionalAccessRoot",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.conditionalAccessRoot"
}
```


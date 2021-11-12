---
title: "recommendationResource resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# recommendationResource resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List recommendationResources](../api/recommendationresource-list.md)|[recommendationResource](../resources/recommendationresource.md) collection|Get a list of the [recommendationResource](../resources/recommendationresource.md) objects and their properties.|
|[Create recommendationResource](../api/recommendation-post-impactedresources.md)|[recommendationResource](../resources/recommendationresource.md)|Create a new [recommendationResource](../resources/recommendationresource.md) object.|
|[Get recommendationResource](../api/recommendationresource-get.md)|[recommendationResource](../resources/recommendationresource.md)|Read the properties and relationships of a [recommendationResource](../resources/recommendationresource.md) object.|
|[Update recommendationResource](../api/recommendationresource-update.md)|[recommendationResource](../resources/recommendationresource.md)|Update the properties of a [recommendationResource](../resources/recommendationresource.md) object.|
|[Delete recommendationResource](../api/recommendationresource-delete.md)|None|Deletes a [recommendationResource](../resources/recommendationresource.md) object.|
|[postpone](../api/recommendationresource-postpone.md)|[recommendationResource](../resources/recommendationresource.md)|**TODO: Add Description**|
|[dismiss](../api/recommendationresource-dismiss.md)|[recommendationResource](../resources/recommendationresource.md)|**TODO: Add Description**|
|[complete](../api/recommendationresource-complete.md)|[recommendationResource](../resources/recommendationresource.md)|**TODO: Add Description**|
|[reactivate](../api/recommendationresource-reactivate.md)|[recommendationResource](../resources/recommendationresource.md)|**TODO: Add Description**|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|addedDateTime|DateTimeOffset|**TODO: Add Description**|
|additionalDetails|[keyValue](../resources/intune-keyvalue.md) collection|**TODO: Add Description**|
|apiUrl|String|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|owner|String|**TODO: Add Description**|
|portalUrl|String|**TODO: Add Description**|
|rank|Int32|**TODO: Add Description**|
|recommendationId|String|**TODO: Add Description**|
|resourceType|String|**TODO: Add Description**|
|status|recommendationStatus|**TODO: Add Description**.The possible values are: `active`, `completedBySystem`, `completedByUser`, `dismissed`, `postponed`, `unknownFutureValue`.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.recommendationResource",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.recommendationResource",
  "id": "String (identifier)",
  "recommendationId": "String",
  "addedDateTime": "String (timestamp)",
  "portalUrl": "String",
  "apiUrl": "String",
  "displayName": "String",
  "resourceType": "String",
  "owner": "String",
  "rank": "Integer",
  "status": "String",
  "additionalDetails": [
    {
      "@odata.type": "microsoft.graph.keyValue"
    }
  ]
}
```


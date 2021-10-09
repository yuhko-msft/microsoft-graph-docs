---
title: "cloudPcGalleryImage resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# cloudPcGalleryImage resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List cloudPcGalleryImages](../api/cloudpcgalleryimage-list.md)|[cloudPcGalleryImage](../resources/cloudpcgalleryimage.md) collection|Get a list of the [cloudPcGalleryImage](../resources/cloudpcgalleryimage.md) objects and their properties.|
|[Create cloudPcGalleryImage](../api/cloudpcgalleryimage-create.md)|[cloudPcGalleryImage](../resources/cloudpcgalleryimage.md)|Create a new [cloudPcGalleryImage](../resources/cloudpcgalleryimage.md) object.|
|[Get cloudPcGalleryImage](../api/cloudpcgalleryimage-get.md)|[cloudPcGalleryImage](../resources/cloudpcgalleryimage.md)|Read the properties and relationships of a [cloudPcGalleryImage](../resources/cloudpcgalleryimage.md) object.|
|[Update cloudPcGalleryImage](../api/cloudpcgalleryimage-update.md)|[cloudPcGalleryImage](../resources/cloudpcgalleryimage.md)|Update the properties of a [cloudPcGalleryImage](../resources/cloudpcgalleryimage.md) object.|
|[Delete cloudPcGalleryImage](../api/cloudpcgalleryimage-delete.md)|None|Deletes a [cloudPcGalleryImage](../resources/cloudpcgalleryimage.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|displayName|String|**TODO: Add Description**|
|endDate|Date|**TODO: Add Description**|
|expirationDate|Date|**TODO: Add Description**|
|id|String|**TODO: Add Description**|
|offer|String|**TODO: Add Description**|
|offerDisplayName|String|**TODO: Add Description**|
|publisher|String|**TODO: Add Description**|
|recommendedSku|String|**TODO: Add Description**|
|sizeInGB|Int32|**TODO: Add Description**|
|sku|String|**TODO: Add Description**|
|skuDisplayName|String|**TODO: Add Description**|
|startDate|Date|**TODO: Add Description**|
|status|cloudPcGalleryImageStatus|**TODO: Add Description**. The possible values are: `supported`, `supportedWithWarning`, `notSupported`, `unknownFutureValue`.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.cloudPcGalleryImage",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.cloudPcGalleryImage",
  "id": "String (identifier)",
  "displayName": "String",
  "offerDisplayName": "String",
  "skuDisplayName": "String",
  "publisher": "String",
  "offer": "String",
  "sku": "String",
  "recommendedSku": "String",
  "status": "String",
  "sizeInGB": "Integer",
  "startDate": "Date",
  "endDate": "Date",
  "expirationDate": "Date"
}
```


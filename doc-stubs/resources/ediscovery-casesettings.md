---
title: "caseSettings resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# caseSettings resource type

Namespace: microsoft.graph.ediscovery

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [entity](../resources/ediscovery-entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List caseSettings](../api/ediscovery-casesettings-list.md)|[microsoft.graph.ediscovery.caseSettings](../resources/ediscovery-casesettings.md) collection|Get a list of the [caseSettings](../resources/ediscovery-casesettings.md) objects and their properties.|
|[Create caseSettings](../api/ediscovery-casesettings-create.md)|[microsoft.graph.ediscovery.caseSettings](../resources/ediscovery-casesettings.md)|Create a new [caseSettings](../resources/ediscovery-casesettings.md) object.|
|[Get caseSettings](../api/ediscovery-casesettings-get.md)|[microsoft.graph.ediscovery.caseSettings](../resources/ediscovery-casesettings.md)|Read the properties and relationships of a [caseSettings](../resources/ediscovery-casesettings.md) object.|
|[Update caseSettings](../api/ediscovery-casesettings-update.md)|[microsoft.graph.ediscovery.caseSettings](../resources/ediscovery-casesettings.md)|Update the properties of a [caseSettings](../resources/ediscovery-casesettings.md) object.|
|[Delete caseSettings](../api/ediscovery-casesettings-delete.md)|None|Deletes a [caseSettings](../resources/ediscovery-casesettings.md) object.|
|[resetToDefault](../api/ediscovery-casesettings-resettodefault.md)|None|**TODO: Add Description**|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/ediscovery-entity.md).|
|ocr|[microsoft.graph.ediscovery.ocrSettings](../resources/ediscovery-ocrsettings.md)|**TODO: Add Description**|
|redundancyDetection|[microsoft.graph.ediscovery.redundancyDetectionSettings](../resources/ediscovery-redundancydetectionsettings.md)|**TODO: Add Description**|
|topicModeling|[microsoft.graph.ediscovery.topicModelingSettings](../resources/ediscovery-topicmodelingsettings.md)|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.ediscovery.caseSettings",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.ediscovery.caseSettings",
  "id": "String (identifier)",
  "redundancyDetection": {
    "@odata.type": "microsoft.graph.ediscovery.redundancyDetectionSettings"
  },
  "topicModeling": {
    "@odata.type": "microsoft.graph.ediscovery.topicModelingSettings"
  },
  "ocr": {
    "@odata.type": "microsoft.graph.ediscovery.ocrSettings"
  }
}
```


---
title: "secureScore resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# secureScore resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List secureScores](../api/securescore-list.md)|[secureScore](../resources/securescore.md) collection|Get a list of the [secureScore](../resources/securescore.md) objects and their properties.|
|[Create secureScore](../api/securescore-create.md)|[secureScore](../resources/securescore.md)|Create a new [secureScore](../resources/securescore.md) object.|
|[Get secureScore](../api/securescore-get.md)|[secureScore](../resources/securescore.md)|Read the properties and relationships of a [secureScore](../resources/securescore.md) object.|
|[Update secureScore](../api/securescore-update.md)|[secureScore](../resources/securescore.md)|Update the properties of a [secureScore](../resources/securescore.md) object.|
|[Delete secureScore](../api/securescore-delete.md)|None|Deletes a [secureScore](../resources/securescore.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|activeUserCount|Int32|**TODO: Add Description**|
|averageComparativeScores|[averageComparativeScore](../resources/averagecomparativescore.md) collection|**TODO: Add Description**|
|azureTenantId|String|**TODO: Add Description**|
|controlScores|[controlScore](../resources/controlscore.md) collection|**TODO: Add Description**|
|createdDateTime|DateTimeOffset|**TODO: Add Description**|
|currentScore|Double|**TODO: Add Description**|
|enabledServices|String collection|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|licensedUserCount|Int32|**TODO: Add Description**|
|maxScore|Double|**TODO: Add Description**|
|vendorInformation|[securityVendorInformation](../resources/securityvendorinformation.md)|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.secureScore",
  "baseType": "microsoft.graph.entity",
  "openType": true
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.secureScore",
  "id": "String (identifier)",
  "activeUserCount": "Integer",
  "averageComparativeScores": [
    {
      "@odata.type": "microsoft.graph.averageComparativeScore"
    }
  ],
  "azureTenantId": "String",
  "controlScores": [
    {
      "@odata.type": "microsoft.graph.controlScore"
    }
  ],
  "createdDateTime": "String (timestamp)",
  "currentScore": "Double",
  "enabledServices": [
    "String"
  ],
  "licensedUserCount": "Integer",
  "maxScore": "Double",
  "vendorInformation": {
    "@odata.type": "microsoft.graph.securityVendorInformation"
  }
}
```


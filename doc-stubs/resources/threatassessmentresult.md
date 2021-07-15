---
title: "threatAssessmentResult resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# threatAssessmentResult resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List threatAssessmentResults](../api/threatassessmentresult-list.md)|[threatAssessmentResult](../resources/threatassessmentresult.md) collection|Get a list of the [threatAssessmentResult](../resources/threatassessmentresult.md) objects and their properties.|
|[Create threatAssessmentResult](../api/threatassessmentresult-create.md)|[threatAssessmentResult](../resources/threatassessmentresult.md)|Create a new [threatAssessmentResult](../resources/threatassessmentresult.md) object.|
|[Get threatAssessmentResult](../api/threatassessmentresult-get.md)|[threatAssessmentResult](../resources/threatassessmentresult.md)|Read the properties and relationships of a [threatAssessmentResult](../resources/threatassessmentresult.md) object.|
|[Update threatAssessmentResult](../api/threatassessmentresult-update.md)|[threatAssessmentResult](../resources/threatassessmentresult.md)|Update the properties of a [threatAssessmentResult](../resources/threatassessmentresult.md) object.|
|[Delete threatAssessmentResult](../api/threatassessmentresult-delete.md)|None|Deletes a [threatAssessmentResult](../resources/threatassessmentresult.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|createdDateTime|DateTimeOffset|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|message|String|**TODO: Add Description**|
|resultType|threatAssessmentResultType|**TODO: Add Description**. Possible values are: `checkPolicy`, `rescan`, `unknownFutureValue`.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.threatAssessmentResult",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.threatAssessmentResult",
  "id": "String (identifier)",
  "createdDateTime": "String (timestamp)",
  "message": "String",
  "resultType": "String"
}
```


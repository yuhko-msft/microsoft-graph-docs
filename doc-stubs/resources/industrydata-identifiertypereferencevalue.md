---
title: "identifierTypeReferenceValue resource type"
description: "Holder base type for a pointer to an entry in the referenceDefinitions collection."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# identifierTypeReferenceValue resource type

Namespace: microsoft.graph.industryData

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Holder base type for a pointer to an entry in the referenceDefinitions collection.


Inherits from [referenceValue](../resources/industrydata-referencevalue.md).

## Properties
|Property|Type|Description|
|:---|:---|:---|
|code|String|The code of the referenceDefinition entry. Inherited from [referenceValue](../resources/industrydata-referencevalue.md).|
|displayName|String|The name of the referenceDefinition entry. Inherited from [referenceValue](../resources/industrydata-referencevalue.md).|
|namespace|String|The code of the referenceDefinition entry. Inherited from [referenceValue](../resources/industrydata-referencevalue.md).|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|value|[referenceDefinition](../resources/industrydata-referencedefinition.md)|Pointer to the referenceDefinition entry. Inherited from [referenceValue](../resources/referencevalue.md)|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.industryData.identifierTypeReferenceValue"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.industryData.identifierTypeReferenceValue",
  "code": "String",
  "namespace": "String",
  "displayName": "String"
}
```


---
title: "detectedSensitiveContent resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# detectedSensitiveContent resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [detectedSensitiveContentBase](../resources/detectedsensitivecontentbase.md).

## Properties
|Property|Type|Description|
|:---|:---|:---|
|classificationAttributes|[classificationAttribute](../resources/classificationattribute.md) collection|**TODO: Add Description**|
|classificationMethod|classificationMethod|**TODO: Add Description**. Possible values are: `patternMatch`, `exactDataMatch`, `fingerprint`, `machineLearning`.|
|confidence|Int32|**TODO: Add Description** Inherited from [detectedSensitiveContentBase](../resources/detectedsensitivecontentbase.md)|
|displayName|String|**TODO: Add Description** Inherited from [detectedSensitiveContentBase](../resources/detectedsensitivecontentbase.md)|
|id|Guid|**TODO: Add Description** Inherited from [detectedSensitiveContentBase](../resources/detectedsensitivecontentbase.md)|
|matches|[sensitiveContentLocation](../resources/sensitivecontentlocation.md) collection|**TODO: Add Description**|
|recommendedConfidence|Int32|**TODO: Add Description** Inherited from [detectedSensitiveContentBase](../resources/detectedsensitivecontentbase.md)|
|scope|sensitiveTypeScope|**TODO: Add Description**. Possible values are: `fullDocument`, `partialDocument`.|
|sensitiveTypeSource|sensitiveTypeSource|**TODO: Add Description**. Possible values are: `outOfBox`, `tenant`.|
|uniqueCount|Int32|**TODO: Add Description** Inherited from [detectedSensitiveContentBase](../resources/detectedsensitivecontentbase.md)|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.detectedSensitiveContent"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.detectedSensitiveContent",
  "confidence": "Integer",
  "displayName": "String",
  "id": "String (identifier)",
  "recommendedConfidence": "Integer",
  "uniqueCount": "Integer",
  "classificationAttributes": [
    {
      "@odata.type": "microsoft.graph.classificationAttribute"
    }
  ],
  "classificationMethod": "String",
  "matches": [
    {
      "@odata.type": "microsoft.graph.sensitiveContentLocation"
    }
  ],
  "scope": "String",
  "sensitiveTypeSource": "String"
}
```


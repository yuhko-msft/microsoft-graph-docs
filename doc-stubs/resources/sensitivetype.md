---
title: "sensitiveType resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# sensitiveType resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List sensitiveTypes](../api/sensitivetype-list.md)|[sensitiveType](../resources/sensitivetype.md) collection|Get a list of the [sensitiveType](../resources/sensitivetype.md) objects and their properties.|
|[Create sensitiveType](../api/sensitivetype-create.md)|[sensitiveType](../resources/sensitivetype.md)|Create a new [sensitiveType](../resources/sensitivetype.md) object.|
|[Get sensitiveType](../api/sensitivetype-get.md)|[sensitiveType](../resources/sensitivetype.md)|Read the properties and relationships of a [sensitiveType](../resources/sensitivetype.md) object.|
|[Update sensitiveType](../api/sensitivetype-update.md)|[sensitiveType](../resources/sensitivetype.md)|Update the properties of a [sensitiveType](../resources/sensitivetype.md) object.|
|[Delete sensitiveType](../api/sensitivetype-delete.md)|None|Deletes a [sensitiveType](../resources/sensitivetype.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|classificationMethod|classificationMethod|**TODO: Add Description**. Possible values are: `patternMatch`, `exactDataMatch`, `fingerprint`, `machineLearning`.|
|description|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|name|String|**TODO: Add Description**|
|publisherName|String|**TODO: Add Description**|
|rulePackageId|String|**TODO: Add Description**|
|rulePackageType|String|**TODO: Add Description**|
|scope|sensitiveTypeScope|**TODO: Add Description**. Possible values are: `fullDocument`, `partialDocument`.|
|sensitiveTypeSource|sensitiveTypeSource|**TODO: Add Description**. Possible values are: `outOfBox`, `tenant`.|
|state|String|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.sensitiveType",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.sensitiveType",
  "id": "String (identifier)",
  "classificationMethod": "String",
  "description": "String",
  "name": "String",
  "publisherName": "String",
  "rulePackageId": "String",
  "rulePackageType": "String",
  "scope": "String",
  "sensitiveTypeSource": "String",
  "state": "String"
}
```


---
title: "deviceLogCollectionRequest resource type"
description: "Windows Log Collection request entity."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceLogCollectionRequest resource type

Namespace: microsoft.graph



Windows Log Collection request entity.

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|The unique identifier|
|templateType|deviceLogCollectionTemplateType|The template type that is sent with the collection request. Possible values are: `predefined`.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.deviceLogCollectionRequest"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceLogCollectionRequest",
  "id": "String (identifier)",
  "templateType": "String"
}
```


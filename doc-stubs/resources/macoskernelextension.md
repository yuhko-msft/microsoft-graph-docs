---
title: "macOSKernelExtension resource type"
description: "Represents a specific macOS kernel extension. A macOS kernel extension can be described by its team identifier plus its bundle identifier."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# macOSKernelExtension resource type

Namespace: microsoft.graph



Represents a specific macOS kernel extension. A macOS kernel extension can be described by its team identifier plus its bundle identifier.

## Properties
|Property|Type|Description|
|:---|:---|:---|
|bundleId|String|Bundle ID of the kernel extension.|
|teamIdentifier|String|The team identifier that was used to sign the kernel extension.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.macOSKernelExtension"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.macOSKernelExtension",
  "bundleId": "String",
  "teamIdentifier": "String"
}
```


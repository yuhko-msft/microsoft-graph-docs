---
title: "macOSSystemExtension resource type"
description: "Represents a specific macOS system extension."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# macOSSystemExtension resource type

Namespace: microsoft.graph



Represents a specific macOS system extension.

## Properties
|Property|Type|Description|
|:---|:---|:---|
|bundleId|String|Gets or sets the bundle identifier of the system extension.|
|teamIdentifier|String|Gets or sets the team identifier that was used to sign the system extension.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.macOSSystemExtension"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.macOSSystemExtension",
  "bundleId": "String",
  "teamIdentifier": "String"
}
```


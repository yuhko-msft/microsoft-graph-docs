---
title: "macOSSystemExtensionTypeMapping resource type"
description: "Represents a mapping between team identifiers for macOS system extensions and system extension types."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# macOSSystemExtensionTypeMapping resource type

Namespace: microsoft.graph



Represents a mapping between team identifiers for macOS system extensions and system extension types.

## Properties
|Property|Type|Description|
|:---|:---|:---|
|allowedTypes|macOSSystemExtensionType|Gets or sets the allowed macOS system extension types. Possible values are: `driverExtensionsAllowed`, `networkExtensionsAllowed`, `endpointSecurityExtensionsAllowed`.|
|teamIdentifier|String|Gets or sets the team identifier used to sign the system extension.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.macOSSystemExtensionTypeMapping"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.macOSSystemExtensionTypeMapping",
  "allowedTypes": "String",
  "teamIdentifier": "String"
}
```


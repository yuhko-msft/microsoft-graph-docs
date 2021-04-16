---
title: "macAppIdentifier resource type"
description: "The identifier for a Mac app."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# macAppIdentifier resource type

Namespace: microsoft.graph



The identifier for a Mac app.


Inherits from [mobileAppIdentifier](../resources/mobileappidentifier.md).

## Properties
|Property|Type|Description|
|:---|:---|:---|
|bundleId|String|The identifier for an app, as specified in the app store.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.macAppIdentifier"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.macAppIdentifier",
  "bundleId": "String"
}
```


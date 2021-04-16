---
title: "macOSAppleEventReceiver resource type"
description: "Represents a process that can receive an Apple Event notification."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# macOSAppleEventReceiver resource type

Namespace: microsoft.graph



Represents a process that can receive an Apple Event notification.

## Properties
|Property|Type|Description|
|:---|:---|:---|
|allowed|Boolean|Allow or block this app from receiving Apple events.|
|codeRequirement|String|Code requirement for the app or binary that receives the Apple Event.|
|identifier|String|Bundle ID of the app or file path of the process or executable that receives the Apple Event.|
|identifierType|macOSProcessIdentifierType|Use bundle ID for an app or path for a process or executable that receives the Apple Event. Possible values are: `bundleID`, `path`.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.macOSAppleEventReceiver"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.macOSAppleEventReceiver",
  "allowed": "Boolean",
  "codeRequirement": "String",
  "identifier": "String",
  "identifierType": "String"
}
```


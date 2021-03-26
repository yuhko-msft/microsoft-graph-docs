---
title: "featureUpdateReference resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# featureUpdateReference resource type

Namespace: microsoft.graph.windowsUpdates

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

A reference to specific feature update content. In a deployment, the same softwareUpdateReference could result in devices receiving different update revisions, but the content is considered contextually equivalent for all devices in the deployment.

Inherits from [windowsUpdateReference](../resources/windowsupdates-windowsupdatereference.md).

## Properties
|Property|Type|Description|
|:---|:---|:---|
|version|String|Specifies a feature update by version.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.windowsUpdates.featureUpdateReference"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.windowsUpdates.featureUpdateReference",
  "version": "String"
}
```


---
title: "AppMetadata resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# AppMetadata resource type

Namespace: microsoft.graph

**TODO: Add Description**

## Properties
|Property|Type|Description|
|:---|:---|:---|
|data|[AppMetadataEntry](../resources/appmetadataentry.md)|**TODO: Add Description**|
|version|Int32|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.AppMetadata"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.AppMetadata",
  "version": "Integer",
  "data": {
    "@odata.type": "microsoft.graph.AppMetadataEntry"
  }
}
```


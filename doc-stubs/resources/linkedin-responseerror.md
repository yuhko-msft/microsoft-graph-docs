---
title: "ResponseError resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# ResponseError resource type

Namespace: microsoft.graph.linkedIn

**TODO: Add Description**

## Properties
|Property|Type|Description|
|:---|:---|:---|
|extensions|[ResponseErrorExtension](../resources/linkedin-responseerrorextension.md)|**TODO: Add Description**|
|locations|[QueryLocation](../resources/linkedin-querylocation.md) collection|**TODO: Add Description**|
|message|String|**TODO: Add Description**|
|path|String collection|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.linkedIn.ResponseError"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.linkedIn.ResponseError",
  "message": "String",
  "locations": [
    {
      "@odata.type": "microsoft.graph.linkedIn.QueryLocation"
    }
  ],
  "path": [
    "String"
  ],
  "extensions": {
    "@odata.type": "microsoft.graph.linkedIn.ResponseErrorExtension"
  }
}
```


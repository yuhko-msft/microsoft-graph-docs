---
title: "activity resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# activity resource type

Namespace: microsoft.graph.externalConnectors

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**

## Properties
|Property|Type|Description|
|:---|:---|:---|
|performedBy|[microsoft.graph.externalConnectors.identity](../resources/externalconnectors-intune-identity.md)|**TODO: Add Description**|
|startDateTime|DateTimeOffset|**TODO: Add Description**|
|type|activityType|**TODO: Add Description**. The possible values are: `viewed`, `modified`, `created`, `commented`, `unknownFutureValue`.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.externalConnectors.activity"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.externalConnectors.activity",
  "type": "String",
  "startDateTime": "String (timestamp)",
  "performedBy": {
    "@odata.type": "microsoft.graph.externalConnectors.identity"
  }
}
```


---
title: "teamworkLoginStatus resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# teamworkLoginStatus resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**

## Properties
|Property|Type|Description|
|:---|:---|:---|
|exchange|[teamworkConnection](../resources/teamworkconnection.md)|**TODO: Add Description**|
|skype|[teamworkConnection](../resources/teamworkconnection.md)|**TODO: Add Description**|
|teams|[teamworkConnection](../resources/teamworkconnection.md)|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.teamworkLoginStatus"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.teamworkLoginStatus",
  "exchange": {
    "@odata.type": "microsoft.graph.teamworkConnection"
  },
  "teams": {
    "@odata.type": "microsoft.graph.teamworkConnection"
  },
  "skype": {
    "@odata.type": "microsoft.graph.teamworkConnection"
  }
}
```


---
title: "plannerTaskContext resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# plannerTaskContext resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**

## Properties
|Property|Type|Description|
|:---|:---|:---|
|appIdentifier|String|**TODO: Add Description**|
|displayType|plannerTaskContextDisplayType|**TODO: Add Description**. The possible values are: `comment`, `meetingNotes`, `other`, `unknownFutureValue`.|
|externalId|String|**TODO: Add Description**|
|itemVersion|String|**TODO: Add Description**|
|ownerAppId|String|**TODO: Add Description**|
|scopeId|String|**TODO: Add Description**|
|url|String|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.plannerTaskContext"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.plannerTaskContext",
  "externalId": "String",
  "scopeId": "String",
  "appIdentifier": "String",
  "itemVersion": "String",
  "url": "String",
  "ownerAppId": "String",
  "displayType": "String"
}
```


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
|contextScenarioId|String|**TODO: Add Description**|
|displayLinkType|plannerTaskContextType|**TODO: Add Description**. The possible values are: `meetingNotes`, `other`, `unknownFutureValue`.|
|externalObjectId|String|**TODO: Add Description**|
|externalObjectVersion|String|**TODO: Add Description**|
|ownerAppId|String|**TODO: Add Description**|
|scope|String|**TODO: Add Description**|
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
  "externalObjectId": "String",
  "scope": "String",
  "contextScenarioId": "String",
  "externalObjectVersion": "String",
  "url": "String",
  "ownerAppId": "String",
  "displayLinkType": "String"
}
```


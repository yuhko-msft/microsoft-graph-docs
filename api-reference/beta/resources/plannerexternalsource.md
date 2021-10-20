---
title: "plannerExternalSource resource type"
description: "Represents the relationship of a plannerTask to a user experience outside of Microsoft Planner."
author: "SudharsanSukumar"
ms.localizationpriority: medium
ms.prod: "planner"
doc_type: resourcePageType
---

# plannerExternalSource resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Represents the relationship of a [plannerTask](plannertask.md) to a user experience outside of Microsoft Planner. 

**Tasks** in Microsoft Planner can be surfaced in or synced with other experiences to track work in the context of that experience. Data in the **plannerExternalSource** can be displayed in a user interface, used for sync information utilized by external services, or used to simply point to where a task was created in an external service.

## Properties
|Property|Type|Description|
|:---|:---|:---|
|contextScenarioId|String|Nullable. An identifier for the scenario associated with this external source. This will generally take the form of **com.contoso.myapp**.|
|displayLinkType|plannerExternalTaskSourceType|Specifies how an application should display the link to the associated **plannerExternalSource**. The possible values are: `none`, `meetingNotes`, `other`, `unknownFutureValue`.|
|externalObjectId|String|Nullable. The id of the entity that an external service associates with a task.|
|externalObjectVersion|String|Nullable. The external Item Version for the object specified by the **externalObjectId**.|
|ownerAppId|String|Read-only. The Id of the app where the task was created.|
|scope|String|Nullable. The id of the external entity's containing entity or context.|
|url|String|Nullable. URL of the user experience represented by the associated **plannerExternalSource**.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.plannerExternalSource"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.plannerExternalSource",
  "externalObjectId": "String",
  "externalContextId": "String",
  "contextScenarioId": "String",
  "externalObjectVersion": "String",
  "webUrl": "String",
  "ownerAppId": "String",
  "displayLinkType": "String"
}
```


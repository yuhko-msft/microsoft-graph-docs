---
title: "plannerTaskContext resource type"
description: "The planner TaskContext resource"
author: "SudharsanSukumar"
ms.localizationpriority: medium
ms.prod: "planner"
doc_type: resourcePageType
---

# plannerTaskContext resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

The **plannerTaskContext** resource represents the relationship of a plannerTask to a user experience outside of Planner. Tasks in Planner can be surfaced in or synced with other experiences to track work in the context of that experience. Data in the plannerTaskContext can be displayed in a user interface, used for sync information utilized by external services, or used to simply point to where a task was created in an external service.

## Properties
|Property|Type|Description|
|:---|:---|:---|
|contextScenarioId|String|Nullable. An identifier for the scenario associated with this context. This will generally take the form of **com.contoso.myapp**.|
|displayLinkType|plannerTaskContextType|Specifies how an application should display the link to the associated **plannerTaskContext**. The possible values are: `meetingNotes`, `other`, `unknownFutureValue`.|
|externalObjectId|String|Nullable. The id of the entity that an external service associates with a task.|
|externalObjectVersion|String|Nullable. The external Item Version for the object specified by the **externalObjectId**.|
|ownerAppId|String|Read-only. The Id of the app where the task was created.|
|scope|String|Nullable. The id of the external entity's containing entity.|
|url|String|Nullable. URL of the user experience represented by the associated **plannerTaskContext**.|

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


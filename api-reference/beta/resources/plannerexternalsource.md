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

You can surface Microsoft Planner **Tasks** in external experiences. Using **plannerExternalSource**, you can store data for displaying externally surfaced tasks in a user interface, external sync scenarios, or simply for pointing to where a task was created in an external service.

## Properties
|Property|Type|Description|
|:---|:---|:---|
|contextScenarioId|String|Required. An identifier for the scenario associated with this external source. This will generally take the form of **com.contoso.myapp**.|
|displayLinkType|plannerExternalTaskSourceType|Specifies how an application should display the link to the associated **plannerExternalSource**. The possible values are: `none`, `default`, `unknownFutureValue`.|
|displayNameSegments|String collection|The segments of the name of the external experience. Segments represent a hierarchical structure that allows other apps to display the relationship. This is required unless displayLinkType is `none` in which case it can be omitted.|
|externalContextId|String|Nullable. The id of the external entity's containing entity or context.|
|externalObjectId|String|Nullable. The id of the entity that an external service associates with a task.|
|externalObjectVersion|String|Nullable. The external Item Version for the object specified by the **externalObjectId**.|
|ownerAppId|String|Read-only. The Id of the app where the task was created.|
|webUrl|String|Nullable. URL of the user experience represented by the associated **plannerExternalSource**.|

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
  "displayLinkType": "String",
  "displayNameSegments": [
    "String"
  ]
}
```


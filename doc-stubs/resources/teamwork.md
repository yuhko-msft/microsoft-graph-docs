---
title: "teamwork resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# teamwork resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List teamworks](../api/teamwork-list.md)|[teamwork](../resources/teamwork.md) collection|Get a list of the [teamwork](../resources/teamwork.md) objects and their properties.|
|[Create teamwork](../api/teamwork-create.md)|[teamwork](../resources/teamwork.md)|Create a new [teamwork](../resources/teamwork.md) object.|
|[Get teamwork](../api/teamwork-get.md)|[teamwork](../resources/teamwork.md)|Read the properties and relationships of a [teamwork](../resources/teamwork.md) object.|
|[Update teamwork](../api/teamwork-update.md)|[teamwork](../resources/teamwork.md)|Update the properties of a [teamwork](../resources/teamwork.md) object.|
|[Delete teamwork](../api/teamwork-delete.md)|None|Deletes a [teamwork](../resources/teamwork.md) object.|
|[List workforceIntegrations](../api/teamwork-list-workforceintegrations.md)|[workforceIntegration](../resources/workforceintegration.md) collection|Get the workforceIntegration resources from the workforceIntegrations navigation property.|
|[Create workforceIntegration](../api/teamwork-post-workforceintegrations.md)|[workforceIntegration](../resources/workforceintegration.md)|Create a new workforceIntegration object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|workforceIntegrations|[workforceIntegration](../resources/workforceintegration.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.teamwork",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.teamwork"
}
```


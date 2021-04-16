---
title: "teamsAppIcon resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# teamsAppIcon resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List teamsAppIcons](../api/teamsappicon-list.md)|[teamsAppIcon](../resources/teamsappicon.md) collection|Get a list of the [teamsAppIcon](../resources/teamsappicon.md) objects and their properties.|
|[Create teamsAppIcon](../api/teamsappicon-create.md)|[teamsAppIcon](../resources/teamsappicon.md)|Create a new [teamsAppIcon](../resources/teamsappicon.md) object.|
|[Get teamsAppIcon](../api/teamsappicon-get.md)|[teamsAppIcon](../resources/teamsappicon.md)|Read the properties and relationships of a [teamsAppIcon](../resources/teamsappicon.md) object.|
|[Update teamsAppIcon](../api/teamsappicon-update.md)|[teamsAppIcon](../resources/teamsappicon.md)|Update the properties of a [teamsAppIcon](../resources/teamsappicon.md) object.|
|[Delete teamsAppIcon](../api/teamsappicon-delete.md)|None|Deletes a [teamsAppIcon](../resources/teamsappicon.md) object.|
|[List teamworkHostedContent](../api/teamsappicon-list-hostedcontent.md)|[teamworkHostedContent](../resources/teamworkhostedcontent.md) collection|Get the teamworkHostedContent resources from the hostedContent navigation property.|
|[Create teamworkHostedContent](../api/teamsappicon-post-hostedcontent.md)|[teamworkHostedContent](../resources/teamworkhostedcontent.md)|Create a new teamworkHostedContent object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|webUrl|String|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|hostedContent|[teamworkHostedContent](../resources/teamworkhostedcontent.md)|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.teamsAppIcon",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.teamsAppIcon",
  "id": "String (identifier)",
  "webUrl": "String"
}
```


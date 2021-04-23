---
title: "sharepoint resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# sharepoint resource type

Namespace: microsoft.graph.admin

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List sharepoints](../api/sharepoint-list.md)|[sharepoint](../resources/admin-sharepoint.md) collection|Get a list of the [sharepoint](../resources/sharepoint.md) objects and their properties.|
|[Create sharepoint](../api/admin-sharepoint-create.md)|[sharepoint](../resources/admin-sharepoint.md)|Create a new [sharepoint](../resources/admin-sharepoint.md) object.|
|[Get sharepoint](../api/admin-sharepoint-get.md)|[sharepoint](../resources/admin-sharepoint.md)|Read the properties and relationships of a [sharepoint](../resources/admin-sharepoint.md) object.|
|[Update sharepoint](../api/admin-sharepoint-update.md)|[sharepoint](../resources/admin-sharepoint.md)|Update the properties of a [sharepoint](../resources/admin-sharepoint.md) object.|
|[Delete sharepoint](../api/admin-sharepoint-delete.md)|None|Deletes a [sharepoint](../resources/admin-sharepoint.md) object.|
|[List settings](../api/admin-sharepoint-list-settings.md)|[settings](../resources/admin-settings.md) collection|Get the settings resources from the settings navigation property.|
|[Create settings](../api/admin-sharepoint-post-settings.md)|[settings](../resources/admin-settings.md)|Create a new settings object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|settings|[settings](../resources/admin-settings.md)|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.admin.sharepoint",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.admin.sharepoint"
}
```


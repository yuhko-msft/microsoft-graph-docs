---
title: "updates resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# updates resource type

Namespace: microsoft.graph.windowsUpdates

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List updates](../api/windowsupdates-updates-list.md)|[microsoft.graph.windowsUpdates.updates](../resources/windowsupdates-updates.md) collection|Get a list of the [updates](../resources/windowsupdates-updates.md) objects and their properties.|
|[Create updates](../api/windowsupdates-updates-create.md)|[microsoft.graph.windowsUpdates.updates](../resources/windowsupdates-updates.md)|Create a new [updates](../resources/windowsupdates-updates.md) object.|
|[Get updates](../api/windowsupdates-updates-get.md)|[microsoft.graph.windowsUpdates.updates](../resources/windowsupdates-updates.md)|Read the properties and relationships of an [updates](../resources/windowsupdates-updates.md) object.|
|[Update updates](../api/windowsupdates-updates-update.md)|[microsoft.graph.windowsUpdates.updates](../resources/windowsupdates-updates.md)|Update the properties of an [updates](../resources/windowsupdates-updates.md) object.|
|[Delete updates](../api/windowsupdates-updates-delete.md)|None|Deletes an [updates](../resources/windowsupdates-updates.md) object.|
|[List catalog](../api/windowsupdates-updates-list-catalog.md)|[microsoft.graph.windowsUpdates.catalog](../resources/windowsupdates-catalog.md) collection|Get the catalog resources from the catalog navigation property.|
|[Create catalog](../api/windowsupdates-updates-post-catalog.md)|[microsoft.graph.windowsUpdates.catalog](../resources/windowsupdates-catalog.md)|Create a new catalog object.|
|[List deployments](../api/windowsupdates-updates-list-deployments.md)|[microsoft.graph.windowsUpdates.deployment](../resources/windowsupdates-deployment.md) collection|Get the deployment resources from the deployments navigation property.|
|[Create deployment](../api/windowsupdates-updates-post-deployments.md)|[microsoft.graph.windowsUpdates.deployment](../resources/windowsupdates-deployment.md)|Create a new deployment object.|
|[List updatableAssets](../api/windowsupdates-updates-list-updatableassets.md)|[microsoft.graph.windowsUpdates.updatableAsset](../resources/windowsupdates-updatableasset.md) collection|Get the updatableAsset resources from the updatableAssets navigation property.|
|[Create updatableAsset](../api/windowsupdates-updates-post-updatableassets.md)|[microsoft.graph.windowsUpdates.updatableAsset](../resources/windowsupdates-updatableasset.md)|Create a new updatableAsset object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|catalog|[catalog](../resources/windowsupdates-catalog.md)|**TODO: Add Description**|
|deployments|[microsoft.graph.windowsUpdates.deployment](../resources/windowsupdates-deployment.md) collection|**TODO: Add Description**|
|updatableAssets|[microsoft.graph.windowsUpdates.updatableAsset](../resources/windowsupdates-updatableasset.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.windowsUpdates.updates",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.windowsUpdates.updates",
  "id": "String (identifier)"
}
```


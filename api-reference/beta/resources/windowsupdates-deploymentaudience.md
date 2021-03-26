---
title: "deploymentAudience resource type"
description: "**TODO: Add Description**"
author: "Alice-at-Microsoft"
localization_priority: Normal
ms.prod: "w10"
doc_type: resourcePageType
---

# deploymentAudience resource type

Namespace: microsoft.graph.windowsUpdates

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

The set of assets to which a deployment can apply.

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[Get deploymentAudience](../api/windowsupdates-deploymentaudience-get.md)|[deploymentAudience](../resources/windowsupdates-deploymentaudience.md)|Read the properties and relationships of a [deploymentAudience](../resources/windowsupdates-deploymentaudience.md) object.|
|[List exclusions](../api/windowsupdates-deploymentaudience-list-exclusions.md)|[updatableAsset](../resources/windowsupdates-updatableasset.md) collection|List exclusions of the [deploymentAudience](../resources/windowsupdates-deploymentaudience.md).|
|[List members](../api/windowsupdates-deploymentaudience-list-members.md)|[updatableAsset](../resources/windowsupdates-updatableasset.md) collection|List members of the [deploymentAudience](../resources/windowsupdates-deploymentaudience.md).|
|[Update members and exclusions](../api/windowsupdates-deploymentaudience-updateaudience.md)|None|Add or remove members and exclusions.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|The unique identifier for the deployment audience. Returned by default. Key. Not nullable. Read-only.|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|exclusions|[updatableAsset](../resources/windowsupdates-updatableasset.md) collection|Specifies the assets to exclude from the audience. Takes precedence over members.|
|members|[updatableAsset](../resources/windowsupdates-updatableasset.md) collection|Specifies the assets to include in the audience.|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.windowsUpdates.deploymentAudience",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.windowsUpdates.deploymentAudience",
  "id": "String (identifier)"
}
```


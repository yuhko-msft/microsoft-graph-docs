---
title: "updatableAsset resource type"
description: "Represents an asset that can receive updates."
author: "Alice-at-Microsoft"
localization_priority: Normal
ms.prod: "w10"
doc_type: resourcePageType
---

# updatableAsset resource type

Namespace: microsoft.graph.windowsUpdates

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Represents an asset that can receive updates.

<!-- ## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List updatableAssets](../api/windowsupdates-updatableasset-list.md)|[updatableAsset](../resources/windowsupdates-updatableasset.md) collection|Get a list of the [updatableAsset](../resources/updatableasset.md) objects and their properties.|
|[Create updatableAsset](../api/windowsupdates-updatableasset-create.md)|[updatableAsset](../resources/windowsupdates-updatableasset.md)|Create a new [updatableAsset](../resources/windowsupdates-updatableasset.md) object.|
|[Get updatableAsset](../api/windowsupdates-updatableasset-get.md)|[updatableAsset](../resources/windowsupdates-updatableasset.md)|Read the properties and relationships of an [updatableAsset](../resources/windowsupdates-updatableasset.md) object.|
|[Delete updatableAsset](../api/windowsupdates-updatableasset-delete.md)|None|Deletes an [updatableAsset](../resources/windowsupdates-updatableasset.md) object.|
|[Enroll asset in management](../api/windowsupdates-updatableasset-enrollassets.md)|None|Enroll the asset in update management by the deployment service.|
|[Unenroll asset from management](../api/windowsupdates-updatableasset-unenrollassets.md)|None|Enroll the asset from update management by the deployment service.| -->

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|An identifier for the asset. Key. Not nullable. Read-only. Returned by default.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.windowsUpdates.updatableAsset",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.windowsUpdates.updatableAsset",
  "id": "String (identifier)"
}
```


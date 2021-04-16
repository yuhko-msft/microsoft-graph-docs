---
title: "microsoftStoreForBusinessContainedApp resource type"
description: "A class that represents a contained app of a MicrosoftStoreForBusinessApp."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# microsoftStoreForBusinessContainedApp resource type

Namespace: microsoft.graph



A class that represents a contained app of a MicrosoftStoreForBusinessApp.


Inherits from [mobileContainedApp](../resources/mobilecontainedapp.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List microsoftStoreForBusinessContainedApps](../api/microsoftstoreforbusinesscontainedapp-list.md)|[microsoftStoreForBusinessContainedApp](../resources/microsoftstoreforbusinesscontainedapp.md) collection|Get a list of the [microsoftStoreForBusinessContainedApp](../resources/microsoftstoreforbusinesscontainedapp.md) objects and their properties.|
|[Create microsoftStoreForBusinessContainedApp](../api/microsoftstoreforbusinesscontainedapp-create.md)|[microsoftStoreForBusinessContainedApp](../resources/microsoftstoreforbusinesscontainedapp.md)|Create a new [microsoftStoreForBusinessContainedApp](../resources/microsoftstoreforbusinesscontainedapp.md) object.|
|[Get microsoftStoreForBusinessContainedApp](../api/microsoftstoreforbusinesscontainedapp-get.md)|[microsoftStoreForBusinessContainedApp](../resources/microsoftstoreforbusinesscontainedapp.md)|Read the properties and relationships of a [microsoftStoreForBusinessContainedApp](../resources/microsoftstoreforbusinesscontainedapp.md) object.|
|[Update microsoftStoreForBusinessContainedApp](../api/microsoftstoreforbusinesscontainedapp-update.md)|[microsoftStoreForBusinessContainedApp](../resources/microsoftstoreforbusinesscontainedapp.md)|Update the properties of a [microsoftStoreForBusinessContainedApp](../resources/microsoftstoreforbusinesscontainedapp.md) object.|
|[Delete microsoftStoreForBusinessContainedApp](../api/microsoftstoreforbusinesscontainedapp-delete.md)|None|Deletes a [microsoftStoreForBusinessContainedApp](../resources/microsoftstoreforbusinesscontainedapp.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|appUserModelId|String|The app user model ID of the contained app of a MicrosoftStoreForBusinessApp.|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.microsoftStoreForBusinessContainedApp",
  "baseType": "microsoft.graph.mobileContainedApp",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.microsoftStoreForBusinessContainedApp",
  "id": "String (identifier)",
  "appUserModelId": "String"
}
```


---
title: "microsoftStoreForBusinessChannelAndRelease resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# microsoftStoreForBusinessChannelAndRelease resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List microsoftStoreForBusinessChannelAndReleases](../api/intune-microsoftstoreforbusinesschannelandrelease-list.md)|[microsoftStoreForBusinessChannelAndRelease](../resources/intune-microsoftstoreforbusinesschannelandrelease.md) collection|Get a list of the [microsoftStoreForBusinessChannelAndRelease](../resources/microsoftstoreforbusinesschannelandrelease.md) objects and their properties.|
|[Create microsoftStoreForBusinessChannelAndRelease](../api/intune-microsoftstoreforbusinesschannelandrelease-create.md)|[microsoftStoreForBusinessChannelAndRelease](../resources/intune-microsoftstoreforbusinesschannelandrelease.md)|Create a new [microsoftStoreForBusinessChannelAndRelease](../resources/intune-microsoftstoreforbusinesschannelandrelease.md) object.|
|[Get microsoftStoreForBusinessChannelAndRelease](../api/intune-microsoftstoreforbusinesschannelandrelease-get.md)|[microsoftStoreForBusinessChannelAndRelease](../resources/intune-microsoftstoreforbusinesschannelandrelease.md)|Read the properties and relationships of a [microsoftStoreForBusinessChannelAndRelease](../resources/intune-microsoftstoreforbusinesschannelandrelease.md) object.|
|[Update microsoftStoreForBusinessChannelAndRelease](../api/intune-microsoftstoreforbusinesschannelandrelease-update.md)|[microsoftStoreForBusinessChannelAndRelease](../resources/intune-microsoftstoreforbusinesschannelandrelease.md)|Update the properties of a [microsoftStoreForBusinessChannelAndRelease](../resources/intune-microsoftstoreforbusinesschannelandrelease.md) object.|
|[Delete microsoftStoreForBusinessChannelAndRelease](../api/intune-microsoftstoreforbusinesschannelandrelease-delete.md)|None|Deletes a [microsoftStoreForBusinessChannelAndRelease](../resources/intune-microsoftstoreforbusinesschannelandrelease.md) object.|
|[List packages](../api/intune-microsoftstoreforbusinesschannelandrelease-list-packages.md)|[microsoftStoreForBusinessPackage](../resources/intune-microsoftstoreforbusinesspackage.md) collection|Get the microsoftStoreForBusinessPackage resources from the packages navigation property.|
|[Add microsoftStoreForBusinessPackage](../api/intune-microsoftstoreforbusinesschannelandrelease-post-packages.md)|[microsoftStoreForBusinessPackage](../resources/intune-microsoftstoreforbusinesspackage.md)|Add packages by posting to the packages collection.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|channel|String|**TODO: Add Description**|
|expiryDateTime|DateTimeOffset|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|release|String|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|packages|[microsoftStoreForBusinessPackage](../resources/intune-microsoftstoreforbusinesspackage.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.microsoftStoreForBusinessChannelAndRelease",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.microsoftStoreForBusinessChannelAndRelease",
  "id": "String (identifier)",
  "channel": "String",
  "release": "String",
  "expiryDateTime": "String (timestamp)"
}
```


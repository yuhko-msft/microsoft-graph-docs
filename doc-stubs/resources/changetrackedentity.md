---
title: "changeTrackedEntity resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# changeTrackedEntity resource type

Namespace: microsoft.graph



**TODO: Add Description**

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List changeTrackedEntities](../api/changetrackedentity-list.md)|[changeTrackedEntity](../resources/changetrackedentity.md) collection|Get a list of the [changeTrackedEntity](../resources/changetrackedentity.md) objects and their properties.|
|[Create changeTrackedEntity](../api/changetrackedentity-create.md)|[changeTrackedEntity](../resources/changetrackedentity.md)|Create a new [changeTrackedEntity](../resources/changetrackedentity.md) object.|
|[Get changeTrackedEntity](../api/changetrackedentity-get.md)|[changeTrackedEntity](../resources/changetrackedentity.md)|Read the properties and relationships of a [changeTrackedEntity](../resources/changetrackedentity.md) object.|
|[Update changeTrackedEntity](../api/changetrackedentity-update.md)|[changeTrackedEntity](../resources/changetrackedentity.md)|Update the properties of a [changeTrackedEntity](../resources/changetrackedentity.md) object.|
|[Delete changeTrackedEntity](../api/changetrackedentity-delete.md)|None|Deletes a [changeTrackedEntity](../resources/changetrackedentity.md) object.|
|[stageForDeletion](../api/changetrackedentity-stagefordeletion.md)|None|**TODO: Add Description**|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|createdBy|[identitySet](../resources/identityset.md)|**TODO: Add Description**|
|createdDateTime|DateTimeOffset|**TODO: Add Description**|
|id|String|**TODO: Add Description**|
|lastModifiedBy|[identitySet](../resources/identityset.md)|**TODO: Add Description**|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.changeTrackedEntity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.changeTrackedEntity",
  "id": "String (identifier)",
  "createdBy": {
    "@odata.type": "microsoft.graph.identitySet"
  },
  "createdDateTime": "String (timestamp)",
  "lastModifiedDateTime": "String (timestamp)",
  "lastModifiedBy": {
    "@odata.type": "microsoft.graph.identitySet"
  }
}
```


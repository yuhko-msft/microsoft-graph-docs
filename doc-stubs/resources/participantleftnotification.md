---
title: "participantLeftNotification resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# participantLeftNotification resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List participantLeftNotifications](../api/participantleftnotification-list.md)|[participantLeftNotification](../resources/participantleftnotification.md) collection|Get a list of the [participantLeftNotification](../resources/participantleftnotification.md) objects and their properties.|
|[Create participantLeftNotification](../api/participantleftnotification-create.md)|[participantLeftNotification](../resources/participantleftnotification.md)|Create a new [participantLeftNotification](../resources/participantleftnotification.md) object.|
|[Get participantLeftNotification](../api/participantleftnotification-get.md)|[participantLeftNotification](../resources/participantleftnotification.md)|Read the properties and relationships of a [participantLeftNotification](../resources/participantleftnotification.md) object.|
|[Update participantLeftNotification](../api/participantleftnotification-update.md)|[participantLeftNotification](../resources/participantleftnotification.md)|Update the properties of a [participantLeftNotification](../resources/participantleftnotification.md) object.|
|[Delete participantLeftNotification](../api/participantleftnotification-delete.md)|None|Deletes a [participantLeftNotification](../resources/participantleftnotification.md) object.|
|[List call](../api/participantleftnotification-list-call.md)|[call](../resources/call.md) collection|Get the call resources from the call navigation property.|
|[Create call](../api/participantleftnotification-post-call.md)|[call](../resources/call.md)|Create a new call object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|participantId|String|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|call|[call](../resources/call.md)|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.participantLeftNotification",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.participantLeftNotification",
  "id": "String (identifier)",
  "participantId": "String"
}
```


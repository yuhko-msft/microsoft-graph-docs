---
title: "participantJoiningNotification resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# participantJoiningNotification resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List participantJoiningNotifications](../api/participantjoiningnotification-list.md)|[participantJoiningNotification](../resources/participantjoiningnotification.md) collection|Get a list of the [participantJoiningNotification](../resources/participantjoiningnotification.md) objects and their properties.|
|[Create participantJoiningNotification](../api/participantjoiningnotification-create.md)|[participantJoiningNotification](../resources/participantjoiningnotification.md)|Create a new [participantJoiningNotification](../resources/participantjoiningnotification.md) object.|
|[Get participantJoiningNotification](../api/participantjoiningnotification-get.md)|[participantJoiningNotification](../resources/participantjoiningnotification.md)|Read the properties and relationships of a [participantJoiningNotification](../resources/participantjoiningnotification.md) object.|
|[Update participantJoiningNotification](../api/participantjoiningnotification-update.md)|[participantJoiningNotification](../resources/participantjoiningnotification.md)|Update the properties of a [participantJoiningNotification](../resources/participantjoiningnotification.md) object.|
|[Delete participantJoiningNotification](../api/participantjoiningnotification-delete.md)|None|Deletes a [participantJoiningNotification](../resources/participantjoiningnotification.md) object.|
|[List call](../api/participantjoiningnotification-list-call.md)|[call](../resources/call.md) collection|Get the call resources from the call navigation property.|
|[Create call](../api/participantjoiningnotification-post-call.md)|[call](../resources/call.md)|Create a new call object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|call|[call](../resources/call.md)|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.participantJoiningNotification",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.participantJoiningNotification",
  "id": "String (identifier)"
}
```


---
title: "activityHistoryItem resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# activityHistoryItem resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List activityHistoryItems](../api/activityhistoryitem-list.md)|[activityHistoryItem](../resources/activityhistoryitem.md) collection|Get a list of the [activityHistoryItem](../resources/activityhistoryitem.md) objects and their properties.|
|[Create activityHistoryItem](../api/activityhistoryitem-create.md)|[activityHistoryItem](../resources/activityhistoryitem.md)|Create a new [activityHistoryItem](../resources/activityhistoryitem.md) object.|
|[Get activityHistoryItem](../api/activityhistoryitem-get.md)|[activityHistoryItem](../resources/activityhistoryitem.md)|Read the properties and relationships of an [activityHistoryItem](../resources/activityhistoryitem.md) object.|
|[Update activityHistoryItem](../api/activityhistoryitem-update.md)|[activityHistoryItem](../resources/activityhistoryitem.md)|Update the properties of an [activityHistoryItem](../resources/activityhistoryitem.md) object.|
|[Delete activityHistoryItem](../api/activityhistoryitem-delete.md)|None|Deletes an [activityHistoryItem](../resources/activityhistoryitem.md) object.|
|[List userActivity](../api/activityhistoryitem-list-activity.md)|[userActivity](../resources/useractivity.md) collection|Get the userActivity resources from the activity navigation property.|
|[Add userActivity](../api/activityhistoryitem-post-activity.md)|[userActivity](../resources/useractivity.md)|Add activity by posting to the activity collection.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|activeDurationSeconds|Int32|**TODO: Add Description**|
|createdDateTime|DateTimeOffset|**TODO: Add Description**|
|expirationDateTime|DateTimeOffset|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|lastActiveDateTime|DateTimeOffset|**TODO: Add Description**|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description**|
|startedDateTime|DateTimeOffset|**TODO: Add Description**|
|status|status|**TODO: Add Description**. Possible values are: `active`, `updated`, `deleted`, `ignored`, `unknownFutureValue`.|
|userTimezone|String|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|activity|[userActivity](../resources/useractivity.md)|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.activityHistoryItem",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.activityHistoryItem",
  "id": "String (identifier)",
  "activeDurationSeconds": "Integer",
  "createdDateTime": "String (timestamp)",
  "expirationDateTime": "String (timestamp)",
  "lastActiveDateTime": "String (timestamp)",
  "lastModifiedDateTime": "String (timestamp)",
  "startedDateTime": "String (timestamp)",
  "status": "String",
  "userTimezone": "String"
}
```


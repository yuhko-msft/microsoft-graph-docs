---
title: "userActivity resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# userActivity resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List userActivities](../api/useractivity-list.md)|[userActivity](../resources/useractivity.md) collection|Get a list of the [userActivity](../resources/useractivity.md) objects and their properties.|
|[Create userActivity](../api/useractivity-create.md)|[userActivity](../resources/useractivity.md)|Create a new [userActivity](../resources/useractivity.md) object.|
|[Get userActivity](../api/useractivity-get.md)|[userActivity](../resources/useractivity.md)|Read the properties and relationships of a [userActivity](../resources/useractivity.md) object.|
|[Update userActivity](../api/useractivity-update.md)|[userActivity](../resources/useractivity.md)|Update the properties of a [userActivity](../resources/useractivity.md) object.|
|[Delete userActivity](../api/useractivity-delete.md)|None|Deletes a [userActivity](../resources/useractivity.md) object.|
|[recent](../api/useractivity-recent.md)|[userActivity](../resources/useractivity.md) collection|**TODO: Add Description**|
|[List historyItems](../api/useractivity-list-historyitems.md)|[activityHistoryItem](../resources/activityhistoryitem.md) collection|Get the activityHistoryItem resources from the historyItems navigation property.|
|[Create activityHistoryItem](../api/useractivity-post-historyitems.md)|[activityHistoryItem](../resources/activityhistoryitem.md)|Create a new activityHistoryItem object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|activationUrl|String|**TODO: Add Description**|
|activitySourceHost|String|**TODO: Add Description**|
|appActivityId|String|**TODO: Add Description**|
|appDisplayName|String|**TODO: Add Description**|
|contentInfo|[Json](../resources/json.md)|**TODO: Add Description**|
|contentUrl|String|**TODO: Add Description**|
|createdDateTime|DateTimeOffset|**TODO: Add Description**|
|expirationDateTime|DateTimeOffset|**TODO: Add Description**|
|fallbackUrl|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description**|
|status|status|**TODO: Add Description**. Possible values are: `active`, `updated`, `deleted`, `ignored`, `unknownFutureValue`.|
|userTimezone|String|**TODO: Add Description**|
|visualElements|[visualInfo](../resources/visualinfo.md)|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|historyItems|[activityHistoryItem](../resources/activityhistoryitem.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.userActivity",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.userActivity",
  "id": "String (identifier)",
  "activationUrl": "String",
  "activitySourceHost": "String",
  "appActivityId": "String",
  "appDisplayName": "String",
  "contentInfo": {
    "@odata.type": "microsoft.graph.Json"
  },
  "contentUrl": "String",
  "createdDateTime": "String (timestamp)",
  "expirationDateTime": "String (timestamp)",
  "fallbackUrl": "String",
  "lastModifiedDateTime": "String (timestamp)",
  "status": "String",
  "userTimezone": "String",
  "visualElements": {
    "@odata.type": "microsoft.graph.visualInfo"
  }
}
```


---
title: "timeCard resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# timeCard resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [changeTrackedEntity](../resources/changetrackedentity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List timeCards](../api/timecard-list.md)|[timeCard](../resources/timecard.md) collection|Get a list of the [timeCard](../resources/timecard.md) objects and their properties.|
|[Create timeCard](../api/timecard-create.md)|[timeCard](../resources/timecard.md)|Create a new [timeCard](../resources/timecard.md) object.|
|[Get timeCard](../api/timecard-get.md)|[timeCard](../resources/timecard.md)|Read the properties and relationships of a [timeCard](../resources/timecard.md) object.|
|[Update timeCard](../api/timecard-update.md)|[timeCard](../resources/timecard.md)|Update the properties of a [timeCard](../resources/timecard.md) object.|
|[Delete timeCard](../api/timecard-delete.md)|None|Deletes a [timeCard](../resources/timecard.md) object.|
|[clockIn](../api/timecard-clockin.md)|[timeCard](../resources/timecard.md)|**TODO: Add Description**|
|[clockOut](../api/timecard-clockout.md)|[timeCard](../resources/timecard.md)|**TODO: Add Description**|
|[confirm](../api/timecard-confirm.md)|[timeCard](../resources/timecard.md)|**TODO: Add Description**|
|[endBreak](../api/timecard-endbreak.md)|[timeCard](../resources/timecard.md)|**TODO: Add Description**|
|[stageForDeletion](../api/timecard-stagefordeletion.md)|None|**TODO: Add Description**|
|[startBreak](../api/timecard-startbreak.md)|[timeCard](../resources/timecard.md)|**TODO: Add Description**|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|breaks|[timeCardBreak](../resources/timecardbreak.md) collection|**TODO: Add Description**|
|clockInEvent|[timeCardEvent](../resources/timecardevent.md)|**TODO: Add Description**|
|clockOutEvent|[timeCardEvent](../resources/timecardevent.md)|**TODO: Add Description**|
|confirmedBy|confirmedBy|**TODO: Add Description**. Possible values are: `none`, `user`, `manager`, `unknownFutureValue`.|
|createdBy|[identitySet](../resources/identityset.md)|**TODO: Add Description** Inherited from [changeTrackedEntity](../resources/changetrackedentity.md)|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [changeTrackedEntity](../resources/changetrackedentity.md)|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastModifiedBy|[identitySet](../resources/identityset.md)|**TODO: Add Description** Inherited from [changeTrackedEntity](../resources/changetrackedentity.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [changeTrackedEntity](../resources/changetrackedentity.md)|
|notes|[itemBody](../resources/itembody.md)|**TODO: Add Description**|
|originalEntry|[timeCardEntry](../resources/timecardentry.md)|**TODO: Add Description**|
|state|timeCardState|**TODO: Add Description**. Possible values are: `clockedIn`, `onBreak`, `clockedOut`, `unknownFutureValue`.|
|userId|String|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.timeCard",
  "baseType": "microsoft.graph.changeTrackedEntity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.timeCard",
  "id": "String (identifier)",
  "createdBy": {
    "@odata.type": "microsoft.graph.identitySet"
  },
  "createdDateTime": "String (timestamp)",
  "lastModifiedBy": {
    "@odata.type": "microsoft.graph.identitySet"
  },
  "lastModifiedDateTime": "String (timestamp)",
  "breaks": [
    {
      "@odata.type": "microsoft.graph.timeCardBreak"
    }
  ],
  "clockInEvent": {
    "@odata.type": "microsoft.graph.timeCardEvent"
  },
  "clockOutEvent": {
    "@odata.type": "microsoft.graph.timeCardEvent"
  },
  "confirmedBy": "String",
  "notes": {
    "@odata.type": "microsoft.graph.itemBody"
  },
  "originalEntry": {
    "@odata.type": "microsoft.graph.timeCardEntry"
  },
  "state": "String",
  "userId": "String"
}
```


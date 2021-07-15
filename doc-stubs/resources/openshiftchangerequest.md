---
title: "openShiftChangeRequest resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# openShiftChangeRequest resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [scheduleChangeRequest](../resources/schedulechangerequest.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List openShiftChangeRequests](../api/openshiftchangerequest-list.md)|[openShiftChangeRequest](../resources/openshiftchangerequest.md) collection|Get a list of the [openShiftChangeRequest](../resources/openshiftchangerequest.md) objects and their properties.|
|[Create openShiftChangeRequest](../api/openshiftchangerequest-create.md)|[openShiftChangeRequest](../resources/openshiftchangerequest.md)|Create a new [openShiftChangeRequest](../resources/openshiftchangerequest.md) object.|
|[Get openShiftChangeRequest](../api/openshiftchangerequest-get.md)|[openShiftChangeRequest](../resources/openshiftchangerequest.md)|Read the properties and relationships of an [openShiftChangeRequest](../resources/openshiftchangerequest.md) object.|
|[Update openShiftChangeRequest](../api/openshiftchangerequest-update.md)|[openShiftChangeRequest](../resources/openshiftchangerequest.md)|Update the properties of an [openShiftChangeRequest](../resources/openshiftchangerequest.md) object.|
|[Delete openShiftChangeRequest](../api/openshiftchangerequest-delete.md)|None|Deletes an [openShiftChangeRequest](../resources/openshiftchangerequest.md) object.|
|[decline](../api/openshiftchangerequest-decline.md)|None|**TODO: Add Description**|
|[approve](../api/openshiftchangerequest-approve.md)|None|**TODO: Add Description**|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|assignedTo|scheduleChangeRequestActor|**TODO: Add Description** Inherited from [scheduleChangeRequest](../resources/schedulechangerequest.md). Possible values are: `sender`, `recipient`, `manager`, `system`, `unknownFutureValue`.|
|createdBy|[identitySet](../resources/identityset.md)|**TODO: Add Description** Inherited from [changeTrackedEntity](../resources/changetrackedentity.md).|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [changeTrackedEntity](../resources/changetrackedentity.md).|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|lastModifiedBy|[identitySet](../resources/identityset.md)|**TODO: Add Description** Inherited from [changeTrackedEntity](../resources/changetrackedentity.md).|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [changeTrackedEntity](../resources/changetrackedentity.md).|
|managerActionDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [scheduleChangeRequest](../resources/schedulechangerequest.md).|
|managerActionMessage|String|**TODO: Add Description** Inherited from [scheduleChangeRequest](../resources/schedulechangerequest.md).|
|managerUserId|String|**TODO: Add Description** Inherited from [scheduleChangeRequest](../resources/schedulechangerequest.md).|
|openShiftId|String|**TODO: Add Description**|
|senderDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [scheduleChangeRequest](../resources/schedulechangerequest.md).|
|senderMessage|String|**TODO: Add Description** Inherited from [scheduleChangeRequest](../resources/schedulechangerequest.md).|
|senderUserId|String|**TODO: Add Description** Inherited from [scheduleChangeRequest](../resources/schedulechangerequest.md).|
|state|scheduleChangeState|**TODO: Add Description** Inherited from [scheduleChangeRequest](../resources/schedulechangerequest.md). Possible values are: `pending`, `approved`, `declined`, `unknownFutureValue`.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.openShiftChangeRequest",
  "baseType": "microsoft.graph.scheduleChangeRequest",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.openShiftChangeRequest",
  "id": "String (identifier)",
  "createdBy": {
    "@odata.type": "microsoft.graph.identitySet"
  },
  "createdDateTime": "String (timestamp)",
  "lastModifiedBy": {
    "@odata.type": "microsoft.graph.identitySet"
  },
  "lastModifiedDateTime": "String (timestamp)",
  "assignedTo": "String",
  "managerActionDateTime": "String (timestamp)",
  "managerActionMessage": "String",
  "managerUserId": "String",
  "senderDateTime": "String (timestamp)",
  "senderMessage": "String",
  "senderUserId": "String",
  "state": "String",
  "openShiftId": "String"
}
```


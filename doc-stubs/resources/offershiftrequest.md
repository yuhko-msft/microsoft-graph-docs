---
title: "offerShiftRequest resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# offerShiftRequest resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [scheduleChangeRequest](../resources/schedulechangerequest.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List offerShiftRequests](../api/offershiftrequest-list.md)|[offerShiftRequest](../resources/offershiftrequest.md) collection|Get a list of the [offerShiftRequest](../resources/offershiftrequest.md) objects and their properties.|
|[Create offerShiftRequest](../api/offershiftrequest-create.md)|[offerShiftRequest](../resources/offershiftrequest.md)|Create a new [offerShiftRequest](../resources/offershiftrequest.md) object.|
|[Get offerShiftRequest](../api/offershiftrequest-get.md)|[offerShiftRequest](../resources/offershiftrequest.md)|Read the properties and relationships of an [offerShiftRequest](../resources/offershiftrequest.md) object.|
|[Update offerShiftRequest](../api/offershiftrequest-update.md)|[offerShiftRequest](../resources/offershiftrequest.md)|Update the properties of an [offerShiftRequest](../resources/offershiftrequest.md) object.|
|[Delete offerShiftRequest](../api/offershiftrequest-delete.md)|None|Deletes an [offerShiftRequest](../resources/offershiftrequest.md) object.|
|[decline](../api/offershiftrequest-decline.md)|None|**TODO: Add Description**|
|[approve](../api/offershiftrequest-approve.md)|None|**TODO: Add Description**|

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
|recipientActionDateTime|DateTimeOffset|**TODO: Add Description**|
|recipientActionMessage|String|**TODO: Add Description**|
|recipientUserId|String|**TODO: Add Description**|
|senderDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [scheduleChangeRequest](../resources/schedulechangerequest.md).|
|senderMessage|String|**TODO: Add Description** Inherited from [scheduleChangeRequest](../resources/schedulechangerequest.md).|
|senderShiftId|String|**TODO: Add Description**|
|senderUserId|String|**TODO: Add Description** Inherited from [scheduleChangeRequest](../resources/schedulechangerequest.md).|
|state|scheduleChangeState|**TODO: Add Description** Inherited from [scheduleChangeRequest](../resources/schedulechangerequest.md). Possible values are: `pending`, `approved`, `declined`, `unknownFutureValue`.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.offerShiftRequest",
  "baseType": "microsoft.graph.scheduleChangeRequest",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.offerShiftRequest",
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
  "recipientActionDateTime": "String (timestamp)",
  "recipientActionMessage": "String",
  "recipientUserId": "String",
  "senderShiftId": "String"
}
```


---
title: "inviteParticipantsOperation resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# inviteParticipantsOperation resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [commsOperation](../resources/commsoperation.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List inviteParticipantsOperations](../api/inviteparticipantsoperation-list.md)|[inviteParticipantsOperation](../resources/inviteparticipantsoperation.md) collection|Get a list of the [inviteParticipantsOperation](../resources/inviteparticipantsoperation.md) objects and their properties.|
|[Create inviteParticipantsOperation](../api/inviteparticipantsoperation-create.md)|[inviteParticipantsOperation](../resources/inviteparticipantsoperation.md)|Create a new [inviteParticipantsOperation](../resources/inviteparticipantsoperation.md) object.|
|[Get inviteParticipantsOperation](../api/inviteparticipantsoperation-get.md)|[inviteParticipantsOperation](../resources/inviteparticipantsoperation.md)|Read the properties and relationships of an [inviteParticipantsOperation](../resources/inviteparticipantsoperation.md) object.|
|[Update inviteParticipantsOperation](../api/inviteparticipantsoperation-update.md)|[inviteParticipantsOperation](../resources/inviteparticipantsoperation.md)|Update the properties of an [inviteParticipantsOperation](../resources/inviteparticipantsoperation.md) object.|
|[Delete inviteParticipantsOperation](../api/inviteparticipantsoperation-delete.md)|None|Deletes an [inviteParticipantsOperation](../resources/inviteparticipantsoperation.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|clientContext|String|**TODO: Add Description** Inherited from [commsOperation](../resources/commsoperation.md)|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|participants|[invitationParticipantInfo](../resources/invitationparticipantinfo.md) collection|**TODO: Add Description**|
|resultInfo|[ResultInfo](../resources/resultinfo.md)|**TODO: Add Description** Inherited from [commsOperation](../resources/commsoperation.md)|
|status|operationStatus|**TODO: Add Description** Inherited from [commsOperation](../resources/commsoperation.md). Possible values are: `NotStarted`, `Running`, `Completed`, `Failed`.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.inviteParticipantsOperation",
  "baseType": "microsoft.graph.commsOperation",
  "openType": true
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.inviteParticipantsOperation",
  "id": "String (identifier)",
  "status": "String",
  "clientContext": "String",
  "resultInfo": {
    "@odata.type": "microsoft.graph.ResultInfo"
  },
  "participants": [
    {
      "@odata.type": "microsoft.graph.invitationParticipantInfo"
    }
  ]
}
```


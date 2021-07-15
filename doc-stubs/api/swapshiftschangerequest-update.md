---
title: "Update swapShiftsChangeRequest"
description: "Update the properties of a swapShiftsChangeRequest object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update swapShiftsChangeRequest
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of a [swapShiftsChangeRequest](../resources/swapshiftschangerequest.md) object.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from least to most privileged)|
|:---|:---|
|Delegated (work or school account)|**TODO: Provide applicable permissions.**|
|Delegated (personal Microsoft account)|**TODO: Provide applicable permissions.**|
|Application|**TODO: Provide applicable permissions.**|

## HTTP request

<!-- {
  "blockType": "ignored"
}
-->
``` http
PATCH /teams/{teamsId}/schedule/swapShiftsChangeRequests/{swapShiftsChangeRequestId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [swapShiftsChangeRequest](../resources/swapshiftschangerequest.md) object.

The following table shows the properties that are required when you update the [swapShiftsChangeRequest](../resources/swapshiftschangerequest.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|createdBy|[identitySet](../resources/identityset.md)|**TODO: Add Description** Inherited from [changeTrackedEntity](../resources/changetrackedentity.md)|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [changeTrackedEntity](../resources/changetrackedentity.md)|
|lastModifiedBy|[identitySet](../resources/identityset.md)|**TODO: Add Description** Inherited from [changeTrackedEntity](../resources/changetrackedentity.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [changeTrackedEntity](../resources/changetrackedentity.md)|
|assignedTo|scheduleChangeRequestActor|**TODO: Add Description** Inherited from [scheduleChangeRequest](../resources/schedulechangerequest.md). Possible values are: `sender`, `recipient`, `manager`, `system`, `unknownFutureValue`.|
|managerActionDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [scheduleChangeRequest](../resources/schedulechangerequest.md)|
|managerActionMessage|String|**TODO: Add Description** Inherited from [scheduleChangeRequest](../resources/schedulechangerequest.md)|
|managerUserId|String|**TODO: Add Description** Inherited from [scheduleChangeRequest](../resources/schedulechangerequest.md)|
|senderDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [scheduleChangeRequest](../resources/schedulechangerequest.md)|
|senderMessage|String|**TODO: Add Description** Inherited from [scheduleChangeRequest](../resources/schedulechangerequest.md)|
|senderUserId|String|**TODO: Add Description** Inherited from [scheduleChangeRequest](../resources/schedulechangerequest.md)|
|state|scheduleChangeState|**TODO: Add Description** Inherited from [scheduleChangeRequest](../resources/schedulechangerequest.md). Possible values are: `pending`, `approved`, `declined`, `unknownFutureValue`.|
|recipientActionDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [offerShiftRequest](../resources/offershiftrequest.md)|
|recipientActionMessage|String|**TODO: Add Description** Inherited from [offerShiftRequest](../resources/offershiftrequest.md)|
|recipientUserId|String|**TODO: Add Description** Inherited from [offerShiftRequest](../resources/offershiftrequest.md)|
|senderShiftId|String|**TODO: Add Description** Inherited from [offerShiftRequest](../resources/offershiftrequest.md)|
|recipientShiftId|String|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [swapShiftsChangeRequest](../resources/swapshiftschangerequest.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_swapshiftschangerequest"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/teams/{teamsId}/schedule/swapShiftsChangeRequests/{swapShiftsChangeRequestId}
Content-Type: application/json
Content-length: 593

{
  "@odata.type": "#microsoft.graph.swapShiftsChangeRequest",
  "createdBy": {
    "@odata.type": "microsoft.graph.identitySet"
  },
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
  "senderShiftId": "String",
  "recipientShiftId": "String"
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.swapShiftsChangeRequest",
  "id": "b8f9b26f-b26f-b8f9-6fb2-f9b86fb2f9b8",
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
  "senderShiftId": "String",
  "recipientShiftId": "String"
}
```


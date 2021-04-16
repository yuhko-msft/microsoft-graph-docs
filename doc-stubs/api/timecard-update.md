---
title: "Update timeCard"
description: "Update the properties of a timeCard object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update timeCard
Namespace: microsoft.graph



Update the properties of a [timeCard](../resources/timecard.md) object.

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
PATCH /teams/{teamsId}/schedule/timeCards/{timeCardId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [timeCard](../resources/timecard.md) object.

The following table shows the properties that are required when you update the [timeCard](../resources/timecard.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|createdBy|[identitySet](../resources/identityset.md)|**TODO: Add Description** Inherited from [changeTrackedEntity](../resources/changetrackedentity.md)|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [changeTrackedEntity](../resources/changetrackedentity.md)|
|lastModifiedBy|[identitySet](../resources/identityset.md)|**TODO: Add Description** Inherited from [changeTrackedEntity](../resources/changetrackedentity.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [changeTrackedEntity](../resources/changetrackedentity.md)|
|breaks|[timeCardBreak](../resources/timecardbreak.md) collection|**TODO: Add Description**|
|clockInEvent|[timeCardEvent](../resources/timecardevent.md)|**TODO: Add Description**|
|clockOutEvent|[timeCardEvent](../resources/timecardevent.md)|**TODO: Add Description**|
|confirmedBy|confirmedBy|**TODO: Add Description**. Possible values are: `none`, `user`, `manager`, `unknownFutureValue`.|
|notes|[itemBody](../resources/itembody.md)|**TODO: Add Description**|
|originalEntry|[timeCardEntry](../resources/timecardentry.md)|**TODO: Add Description**|
|state|timeCardState|**TODO: Add Description**. Possible values are: `clockedIn`, `onBreak`, `clockedOut`, `unknownFutureValue`.|
|userId|String|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [timeCard](../resources/timecard.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_timecard"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/teams/{teamsId}/schedule/timeCards/{timeCardId}
Content-Type: application/json
Content-length: 592

{
  "@odata.type": "#microsoft.graph.timeCard",
  "createdBy": {
    "@odata.type": "microsoft.graph.identitySet"
  },
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


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.timeCard",
  "id": "ad9a2897-2897-ad9a-9728-9aad97289aad",
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


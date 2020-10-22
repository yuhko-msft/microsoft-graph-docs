---
title: "Update inviteParticipantsOperation"
description: "Update the properties of an inviteParticipantsOperation object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update inviteParticipantsOperation
Namespace: microsoft.graph

Update the properties of an [inviteParticipantsOperation](../resources/inviteparticipantsoperation.md) object.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from most to least privileged)|
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
PATCH /inviteParticipantsOperation
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [inviteParticipantsOperation](../resources/inviteparticipantsoperation.md) object.

The following table shows the properties that are required when you create the [inviteParticipantsOperation](../resources/inviteparticipantsoperation.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|status|operationStatus|**TODO: Add Description** Inherited from [commsOperation](../resources/commsoperation.md). Possible values are: `NotStarted`, `Running`, `Completed`, `Failed`.|
|clientContext|String|**TODO: Add Description** Inherited from [commsOperation](../resources/commsoperation.md)|
|resultInfo|[ResultInfo](../resources/resultinfo.md)|**TODO: Add Description** Inherited from [commsOperation](../resources/commsoperation.md)|
|participants|[invitationParticipantInfo](../resources/invitationparticipantinfo.md) collection|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [inviteParticipantsOperation](../resources/inviteparticipantsoperation.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_inviteparticipantsoperation"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/inviteParticipantsOperation
Content-Type: application/json
Content-length: 303

{
  "@odata.type": "#microsoft.graph.inviteParticipantsOperation",
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
  "@odata.type": "#microsoft.graph.inviteParticipantsOperation",
  "id": "848bf723-f723-848b-23f7-8b8423f78b84",
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


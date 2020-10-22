---
title: "Get inviteParticipantsOperation"
description: "Read the properties and relationships of an inviteParticipantsOperation object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get inviteParticipantsOperation
Namespace: microsoft.graph

Read the properties and relationships of an [inviteParticipantsOperation](../resources/inviteparticipantsoperation.md) object.

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
GET /inviteParticipantsOperation
```

## Optional query parameters
This method supports some of the OData query parameters to help customize the response. For general information, see [OData query parameters](/graph/query-parameters).

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|

## Request body
Do not supply a request body for this method.

## Response

If successful, this method returns a `200 OK` response code and an [inviteParticipantsOperation](../resources/inviteparticipantsoperation.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_inviteparticipantsoperation"
}
-->
``` http
GET https://graph.microsoft.com/beta/inviteParticipantsOperation
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.inviteParticipantsOperation"
}
-->
``` http
HTTP/1.1 200 OK

Content-Type: application/json
{
  "value": {
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
}
```


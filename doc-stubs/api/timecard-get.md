---
title: "Get timeCard"
description: "Read the properties and relationships of a timeCard object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get timeCard
Namespace: microsoft.graph



Read the properties and relationships of a [timeCard](../resources/timecard.md) object.

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
GET /teams/{teamsId}/schedule/timeCards/{timeCardId}
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

If successful, this method returns a `200 OK` response code and a [timeCard](../resources/timecard.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_timecard"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/teams/{teamsId}/schedule/timeCards/{timeCardId}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.timeCard"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
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
}
```


---
title: "List timeCards"
description: "Get the timeCard resources from the timeCards navigation property."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List timeCards
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Get the timeCard resources from the timeCards navigation property.

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
GET /team/schedule/timeCards
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

If successful, this method returns a `200 OK` response code and a collection of [timeCard](../resources/timecard.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "list_timecard"
}
-->
``` http
GET https://graph.microsoft.com/beta/team/schedule/timeCards
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(Microsoft.Teams.Shifts.timeCard)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
    {
      "@odata.type": "#Microsoft.Teams.Shifts.timeCard",
      "id": "2a9a252c-252c-2a9a-2c25-9a2a2c259a2a",
      "createdBy": {
        "@odata.type": "microsoft.graph.identitySet"
      },
      "createdDateTime": "String (timestamp)",
      "lastModifiedDateTime": "String (timestamp)",
      "lastModifiedBy": {
        "@odata.type": "microsoft.graph.identitySet"
      },
      "userId": "String",
      "state": "String",
      "clockInEvent": {
        "@odata.type": "microsoft.graph.timeCardEvent"
      },
      "clockOutEvent": {
        "@odata.type": "microsoft.graph.timeCardEvent"
      },
      "breaks": [
        {
          "@odata.type": "microsoft.graph.timeCardBreak"
        }
      ],
      "notes": {
        "@odata.type": "microsoft.graph.itemBody"
      },
      "originalEntry": {
        "@odata.type": "microsoft.graph.timeCardEntry"
      },
      "confirmedBy": "String"
    }
  ]
}
```


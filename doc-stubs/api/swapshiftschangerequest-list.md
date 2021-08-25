---
title: "List swapShiftsChangeRequests"
description: "Get a list of the swapShiftsChangeRequest objects and their properties."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List swapShiftsChangeRequests
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Get a list of the [swapShiftsChangeRequest](../resources/swapshiftschangerequest.md) objects and their properties.

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
GET /team/schedule/swapShiftsChangeRequests
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

If successful, this method returns a `200 OK` response code and a collection of [swapShiftsChangeRequest](../resources/swapshiftschangerequest.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "list_swapshiftschangerequest"
}
-->
``` http
GET https://graph.microsoft.com/beta/team/schedule/swapShiftsChangeRequests
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(Microsoft.Teams.Shifts.swapShiftsChangeRequest)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
    {
      "@odata.type": "#Microsoft.Teams.Shifts.swapShiftsChangeRequest",
      "id": "7d307d4a-7d4a-7d30-4a7d-307d4a7d307d",
      "createdBy": {
        "@odata.type": "microsoft.graph.identitySet"
      },
      "createdDateTime": "String (timestamp)",
      "lastModifiedDateTime": "String (timestamp)",
      "lastModifiedBy": {
        "@odata.type": "microsoft.graph.identitySet"
      },
      "assignedTo": "String",
      "state": "String",
      "senderMessage": "String",
      "senderDateTime": "String (timestamp)",
      "managerActionMessage": "String",
      "managerActionDateTime": "String (timestamp)",
      "senderUserId": "String",
      "managerUserId": "String",
      "recipientActionMessage": "String",
      "recipientActionDateTime": "String (timestamp)",
      "senderShiftId": "String",
      "recipientUserId": "String",
      "recipientShiftId": "String"
    }
  ]
}
```


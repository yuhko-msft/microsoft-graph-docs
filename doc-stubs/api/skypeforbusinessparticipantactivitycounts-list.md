---
title: "List skypeForBusinessParticipantActivityCounts"
description: "Get a list of the skypeForBusinessParticipantActivityCounts objects and their properties."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List skypeForBusinessParticipantActivityCounts
Namespace: microsoft.graph



Get a list of the [skypeForBusinessParticipantActivityCounts](../resources/skypeforbusinessparticipantactivitycounts.md) objects and their properties.

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
GET ** Collection URI for microsoft.graph.skypeForBusinessParticipantActivityCounts not found
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

If successful, this method returns a `200 OK` response code and a collection of [skypeForBusinessParticipantActivityCounts](../resources/skypeforbusinessparticipantactivitycounts.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "list_skypeforbusinessparticipantactivitycounts"
}
-->
``` http
GET https://graph.microsoft.com/v1.0** Collection URI for microsoft.graph.skypeForBusinessParticipantActivityCounts not found
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.skypeForBusinessParticipantActivityCounts)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
    {
      "@odata.type": "#microsoft.graph.skypeForBusinessParticipantActivityCounts",
      "id": "b3a93464-3464-b3a9-6434-a9b36434a9b3",
      "appSharing": "Integer",
      "audioVideo": "Integer",
      "dialInOut3rdParty": "Integer",
      "im": "Integer",
      "reportDate": "Date",
      "reportPeriod": "String",
      "reportRefreshDate": "Date",
      "web": "Integer"
    }
  ]
}
```


---
title: "Update skypeForBusinessParticipantActivityCounts"
description: "Update the properties of a skypeForBusinessParticipantActivityCounts object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update skypeForBusinessParticipantActivityCounts
Namespace: microsoft.graph



Update the properties of a [skypeForBusinessParticipantActivityCounts](../resources/skypeforbusinessparticipantactivitycounts.md) object.

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
PATCH /skypeForBusinessParticipantActivityCounts
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [skypeForBusinessParticipantActivityCounts](../resources/skypeforbusinessparticipantactivitycounts.md) object.

The following table shows the properties that are required when you update the [skypeForBusinessParticipantActivityCounts](../resources/skypeforbusinessparticipantactivitycounts.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|appSharing|Int64|**TODO: Add Description**|
|audioVideo|Int64|**TODO: Add Description**|
|dialInOut3rdParty|Int64|**TODO: Add Description**|
|im|Int64|**TODO: Add Description**|
|reportDate|Date|**TODO: Add Description**|
|reportPeriod|String|**TODO: Add Description**|
|reportRefreshDate|Date|**TODO: Add Description**|
|web|Int64|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [skypeForBusinessParticipantActivityCounts](../resources/skypeforbusinessparticipantactivitycounts.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_skypeforbusinessparticipantactivitycounts"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/skypeForBusinessParticipantActivityCounts
Content-Type: application/json
Content-length: 301

{
  "@odata.type": "#microsoft.graph.skypeForBusinessParticipantActivityCounts",
  "appSharing": "Integer",
  "audioVideo": "Integer",
  "dialInOut3rdParty": "Integer",
  "im": "Integer",
  "reportDate": "Date",
  "reportPeriod": "String",
  "reportRefreshDate": "Date",
  "web": "Integer"
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
```


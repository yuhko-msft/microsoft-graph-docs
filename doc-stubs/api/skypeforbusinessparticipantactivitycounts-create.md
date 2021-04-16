---
title: "Create skypeForBusinessParticipantActivityCounts"
description: "Create a new skypeForBusinessParticipantActivityCounts object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create skypeForBusinessParticipantActivityCounts
Namespace: microsoft.graph



Create a new [skypeForBusinessParticipantActivityCounts](../resources/skypeforbusinessparticipantactivitycounts.md) object.

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
POST ** Collection URI for microsoft.graph.skypeForBusinessParticipantActivityCounts not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [skypeForBusinessParticipantActivityCounts](../resources/skypeforbusinessparticipantactivitycounts.md) object.

The following table shows the properties that are required when you create the [skypeForBusinessParticipantActivityCounts](../resources/skypeforbusinessparticipantactivitycounts.md).

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

If successful, this method returns a `201 Created` response code and a [skypeForBusinessParticipantActivityCounts](../resources/skypeforbusinessparticipantactivitycounts.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_skypeforbusinessparticipantactivitycounts_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0** Collection URI for microsoft.graph.skypeForBusinessParticipantActivityCounts not found
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
  "truncated": true,
  "@odata.type": "microsoft.graph.skypeForBusinessParticipantActivityCounts"
}
-->
``` http
HTTP/1.1 201 Created
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


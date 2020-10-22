---
title: "Update skypeForBusinessOrganizerActivityCounts"
description: "Update the properties of a skypeForBusinessOrganizerActivityCounts object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update skypeForBusinessOrganizerActivityCounts
Namespace: microsoft.graph

Update the properties of a [skypeForBusinessOrganizerActivityCounts](../resources/skypeforbusinessorganizeractivitycounts.md) object.

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
PATCH /skypeForBusinessOrganizerActivityCounts
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [skypeForBusinessOrganizerActivityCounts](../resources/skypeforbusinessorganizeractivitycounts.md) object.

The following table shows the properties that are required when you create the [skypeForBusinessOrganizerActivityCounts](../resources/skypeforbusinessorganizeractivitycounts.md).

|Property|Type|Description|
|:---|:---|:---|
|im|Int64|**TODO: Add Description**|
|audioVideo|Int64|**TODO: Add Description**|
|appSharing|Int64|**TODO: Add Description**|
|web|Int64|**TODO: Add Description**|
|dialInOut3rdParty|Int64|**TODO: Add Description**|
|dialInOutMicrosoft|Int64|**TODO: Add Description**|
|reportRefreshDate|Date|**TODO: Add Description**|
|reportDate|Date|**TODO: Add Description**|
|reportPeriod|String|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [skypeForBusinessOrganizerActivityCounts](../resources/skypeforbusinessorganizeractivitycounts.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_skypeforbusinessorganizeractivitycounts"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/skypeForBusinessOrganizerActivityCounts
Content-Type: application/json
Content-length: 335

{
  "@odata.type": "#microsoft.graph.skypeForBusinessOrganizerActivityCounts",
  "im": "Integer",
  "audioVideo": "Integer",
  "appSharing": "Integer",
  "web": "Integer",
  "dialInOut3rdParty": "Integer",
  "dialInOutMicrosoft": "Integer",
  "reportRefreshDate": "Date",
  "reportDate": "Date",
  "reportPeriod": "String"
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
  "@odata.type": "#microsoft.graph.skypeForBusinessOrganizerActivityCounts",
  "im": "Integer",
  "audioVideo": "Integer",
  "appSharing": "Integer",
  "web": "Integer",
  "dialInOut3rdParty": "Integer",
  "dialInOutMicrosoft": "Integer",
  "reportRefreshDate": "Date",
  "reportDate": "Date",
  "reportPeriod": "String"
}
```


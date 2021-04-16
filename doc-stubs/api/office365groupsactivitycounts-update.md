---
title: "Update office365GroupsActivityCounts"
description: "Update the properties of an office365GroupsActivityCounts object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update office365GroupsActivityCounts
Namespace: microsoft.graph



Update the properties of an [office365GroupsActivityCounts](../resources/office365groupsactivitycounts.md) object.

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
PATCH /office365GroupsActivityCounts
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [office365GroupsActivityCounts](../resources/office365groupsactivitycounts.md) object.

The following table shows the properties that are required when you update the [office365GroupsActivityCounts](../resources/office365groupsactivitycounts.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|exchangeEmailsReceived|Int64|**TODO: Add Description**|
|reportDate|Date|**TODO: Add Description**|
|reportPeriod|String|**TODO: Add Description**|
|reportRefreshDate|Date|**TODO: Add Description**|
|yammerMessagesLiked|Int64|**TODO: Add Description**|
|yammerMessagesPosted|Int64|**TODO: Add Description**|
|yammerMessagesRead|Int64|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [office365GroupsActivityCounts](../resources/office365groupsactivitycounts.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_office365groupsactivitycounts"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/office365GroupsActivityCounts
Content-Type: application/json
Content-length: 308

{
  "@odata.type": "#microsoft.graph.office365GroupsActivityCounts",
  "exchangeEmailsReceived": "Integer",
  "reportDate": "Date",
  "reportPeriod": "String",
  "reportRefreshDate": "Date",
  "yammerMessagesLiked": "Integer",
  "yammerMessagesPosted": "Integer",
  "yammerMessagesRead": "Integer"
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
  "@odata.type": "#microsoft.graph.office365GroupsActivityCounts",
  "id": "72afc297-c297-72af-97c2-af7297c2af72",
  "exchangeEmailsReceived": "Integer",
  "reportDate": "Date",
  "reportPeriod": "String",
  "reportRefreshDate": "Date",
  "yammerMessagesLiked": "Integer",
  "yammerMessagesPosted": "Integer",
  "yammerMessagesRead": "Integer"
}
```


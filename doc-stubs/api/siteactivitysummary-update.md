---
title: "Update siteActivitySummary"
description: "Update the properties of a siteActivitySummary object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update siteActivitySummary
Namespace: microsoft.graph

Update the properties of a [siteActivitySummary](../resources/siteactivitysummary.md) object.

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
PATCH /siteActivitySummary
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [siteActivitySummary](../resources/siteactivitysummary.md) object.

The following table shows the properties that are required when you create the [siteActivitySummary](../resources/siteactivitysummary.md).

|Property|Type|Description|
|:---|:---|:---|
|reportRefreshDate|Date|**TODO: Add Description**|
|viewedOrEdited|Int64|**TODO: Add Description**|
|synced|Int64|**TODO: Add Description**|
|sharedInternally|Int64|**TODO: Add Description**|
|sharedExternally|Int64|**TODO: Add Description**|
|reportDate|Date|**TODO: Add Description**|
|reportPeriod|String|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [siteActivitySummary](../resources/siteactivitysummary.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_siteactivitysummary"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/siteActivitySummary
Content-Type: application/json
Content-length: 271

{
  "@odata.type": "#microsoft.graph.siteActivitySummary",
  "reportRefreshDate": "Date",
  "viewedOrEdited": "Integer",
  "synced": "Integer",
  "sharedInternally": "Integer",
  "sharedExternally": "Integer",
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
  "@odata.type": "#microsoft.graph.siteActivitySummary",
  "reportRefreshDate": "Date",
  "viewedOrEdited": "Integer",
  "synced": "Integer",
  "sharedInternally": "Integer",
  "sharedExternally": "Integer",
  "reportDate": "Date",
  "reportPeriod": "String"
}
```


---
title: "Create siteActivitySummary"
description: "Create a new siteActivitySummary object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create siteActivitySummary
Namespace: microsoft.graph



Create a new [siteActivitySummary](../resources/siteactivitysummary.md) object.

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
POST ** Collection URI for microsoft.graph.siteActivitySummary not found
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
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|reportDate|Date|**TODO: Add Description**|
|reportPeriod|String|**TODO: Add Description**|
|reportRefreshDate|Date|**TODO: Add Description**|
|sharedExternally|Int64|**TODO: Add Description**|
|sharedInternally|Int64|**TODO: Add Description**|
|synced|Int64|**TODO: Add Description**|
|viewedOrEdited|Int64|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and a [siteActivitySummary](../resources/siteactivitysummary.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_siteactivitysummary_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0** Collection URI for microsoft.graph.siteActivitySummary not found
Content-Type: application/json
Content-length: 271

{
  "@odata.type": "#microsoft.graph.siteActivitySummary",
  "reportDate": "Date",
  "reportPeriod": "String",
  "reportRefreshDate": "Date",
  "sharedExternally": "Integer",
  "sharedInternally": "Integer",
  "synced": "Integer",
  "viewedOrEdited": "Integer"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.siteActivitySummary"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.siteActivitySummary",
  "id": "98d0eacd-eacd-98d0-cdea-d098cdead098",
  "reportDate": "Date",
  "reportPeriod": "String",
  "reportRefreshDate": "Date",
  "sharedExternally": "Integer",
  "sharedInternally": "Integer",
  "synced": "Integer",
  "viewedOrEdited": "Integer"
}
```


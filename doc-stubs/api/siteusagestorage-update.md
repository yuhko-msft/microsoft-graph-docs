---
title: "Update siteUsageStorage"
description: "Update the properties of a siteUsageStorage object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update siteUsageStorage
Namespace: microsoft.graph

Update the properties of a [siteUsageStorage](../resources/siteusagestorage.md) object.

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
PATCH /siteUsageStorage
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [siteUsageStorage](../resources/siteusagestorage.md) object.

The following table shows the properties that are required when you create the [siteUsageStorage](../resources/siteusagestorage.md).

|Property|Type|Description|
|:---|:---|:---|
|reportRefreshDate|Date|**TODO: Add Description**|
|siteType|String|**TODO: Add Description**|
|storageUsedInBytes|Int64|**TODO: Add Description**|
|reportDate|Date|**TODO: Add Description**|
|reportPeriod|String|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [siteUsageStorage](../resources/siteusagestorage.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_siteusagestorage"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/siteUsageStorage
Content-Type: application/json
Content-length: 205

{
  "@odata.type": "#microsoft.graph.siteUsageStorage",
  "reportRefreshDate": "Date",
  "siteType": "String",
  "storageUsedInBytes": "Integer",
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
  "@odata.type": "#microsoft.graph.siteUsageStorage",
  "reportRefreshDate": "Date",
  "siteType": "String",
  "storageUsedInBytes": "Integer",
  "reportDate": "Date",
  "reportPeriod": "String"
}
```


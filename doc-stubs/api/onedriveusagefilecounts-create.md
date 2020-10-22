---
title: "Create oneDriveUsageFileCounts"
description: "Create a new oneDriveUsageFileCounts object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create oneDriveUsageFileCounts
Namespace: microsoft.graph

Create a new [oneDriveUsageFileCounts](../resources/onedriveusagefilecounts.md) object.

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
POST ** Collection URI for microsoft.graph.oneDriveUsageFileCounts not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [oneDriveUsageFileCounts](../resources/onedriveusagefilecounts.md) object.

The following table shows the properties that are required when you create the [oneDriveUsageFileCounts](../resources/onedriveusagefilecounts.md).

|Property|Type|Description|
|:---|:---|:---|
|reportRefreshDate|Date|**TODO: Add Description**|
|siteType|String|**TODO: Add Description**|
|total|Int64|**TODO: Add Description**|
|active|Int64|**TODO: Add Description**|
|reportDate|Date|**TODO: Add Description**|
|reportPeriod|String|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and an [oneDriveUsageFileCounts](../resources/onedriveusagefilecounts.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_onedriveusagefilecounts_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta** Collection URI for microsoft.graph.oneDriveUsageFileCounts not found
Content-Type: application/json
Content-length: 223

{
  "@odata.type": "#microsoft.graph.oneDriveUsageFileCounts",
  "reportRefreshDate": "Date",
  "siteType": "String",
  "total": "Integer",
  "active": "Integer",
  "reportDate": "Date",
  "reportPeriod": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.oneDriveUsageFileCounts"
}
-->
``` http
HTTP/1.1 201 Created

Content-Type: application/json
{
  "@odata.type": "#microsoft.graph.oneDriveUsageFileCounts",
  "reportRefreshDate": "Date",
  "siteType": "String",
  "total": "Integer",
  "active": "Integer",
  "reportDate": "Date",
  "reportPeriod": "String"
}
```


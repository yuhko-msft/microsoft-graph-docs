---
title: "Update oneDriveUsageFileCounts"
description: "Update the properties of an oneDriveUsageFileCounts object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update oneDriveUsageFileCounts
Namespace: microsoft.graph



Update the properties of an [oneDriveUsageFileCounts](../resources/onedriveusagefilecounts.md) object.

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
PATCH /oneDriveUsageFileCounts
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [oneDriveUsageFileCounts](../resources/onedriveusagefilecounts.md) object.

The following table shows the properties that are required when you update the [oneDriveUsageFileCounts](../resources/onedriveusagefilecounts.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|active|Int64|**TODO: Add Description**|
|reportDate|Date|**TODO: Add Description**|
|reportPeriod|String|**TODO: Add Description**|
|reportRefreshDate|Date|**TODO: Add Description**|
|siteType|String|**TODO: Add Description**|
|total|Int64|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [oneDriveUsageFileCounts](../resources/onedriveusagefilecounts.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_onedriveusagefilecounts"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/oneDriveUsageFileCounts
Content-Type: application/json
Content-length: 223

{
  "@odata.type": "#microsoft.graph.oneDriveUsageFileCounts",
  "active": "Integer",
  "reportDate": "Date",
  "reportPeriod": "String",
  "reportRefreshDate": "Date",
  "siteType": "String",
  "total": "Integer"
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
  "@odata.type": "#microsoft.graph.oneDriveUsageFileCounts",
  "id": "4ec1c247-c247-4ec1-47c2-c14e47c2c14e",
  "active": "Integer",
  "reportDate": "Date",
  "reportPeriod": "String",
  "reportRefreshDate": "Date",
  "siteType": "String",
  "total": "Integer"
}
```


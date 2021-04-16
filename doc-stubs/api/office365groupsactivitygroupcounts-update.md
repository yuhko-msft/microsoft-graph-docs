---
title: "Update office365GroupsActivityGroupCounts"
description: "Update the properties of an office365GroupsActivityGroupCounts object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update office365GroupsActivityGroupCounts
Namespace: microsoft.graph



Update the properties of an [office365GroupsActivityGroupCounts](../resources/office365groupsactivitygroupcounts.md) object.

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
PATCH /office365GroupsActivityGroupCounts
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [office365GroupsActivityGroupCounts](../resources/office365groupsactivitygroupcounts.md) object.

The following table shows the properties that are required when you update the [office365GroupsActivityGroupCounts](../resources/office365groupsactivitygroupcounts.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|active|Int64|**TODO: Add Description**|
|reportDate|Date|**TODO: Add Description**|
|reportPeriod|String|**TODO: Add Description**|
|reportRefreshDate|Date|**TODO: Add Description**|
|total|Int64|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [office365GroupsActivityGroupCounts](../resources/office365groupsactivitygroupcounts.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_office365groupsactivitygroupcounts"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/office365GroupsActivityGroupCounts
Content-Type: application/json
Content-length: 209

{
  "@odata.type": "#microsoft.graph.office365GroupsActivityGroupCounts",
  "active": "Integer",
  "reportDate": "Date",
  "reportPeriod": "String",
  "reportRefreshDate": "Date",
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
  "@odata.type": "#microsoft.graph.office365GroupsActivityGroupCounts",
  "id": "c36ae22f-e22f-c36a-2fe2-6ac32fe26ac3",
  "active": "Integer",
  "reportDate": "Date",
  "reportPeriod": "String",
  "reportRefreshDate": "Date",
  "total": "Integer"
}
```


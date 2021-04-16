---
title: "Create office365GroupsActivityFileCounts"
description: "Create a new office365GroupsActivityFileCounts object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create office365GroupsActivityFileCounts
Namespace: microsoft.graph



Create a new [office365GroupsActivityFileCounts](../resources/office365groupsactivityfilecounts.md) object.

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
POST ** Collection URI for microsoft.graph.office365GroupsActivityFileCounts not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [office365GroupsActivityFileCounts](../resources/office365groupsactivityfilecounts.md) object.

The following table shows the properties that are required when you create the [office365GroupsActivityFileCounts](../resources/office365groupsactivityfilecounts.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|active|Int64|**TODO: Add Description**|
|reportDate|Date|**TODO: Add Description**|
|reportPeriod|String|**TODO: Add Description**|
|reportRefreshDate|Date|**TODO: Add Description**|
|total|Int64|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and an [office365GroupsActivityFileCounts](../resources/office365groupsactivityfilecounts.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_office365groupsactivityfilecounts_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0** Collection URI for microsoft.graph.office365GroupsActivityFileCounts not found
Content-Type: application/json
Content-length: 208

{
  "@odata.type": "#microsoft.graph.office365GroupsActivityFileCounts",
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
  "truncated": true,
  "@odata.type": "microsoft.graph.office365GroupsActivityFileCounts"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.office365GroupsActivityFileCounts",
  "id": "adb63e47-3e47-adb6-473e-b6ad473eb6ad",
  "active": "Integer",
  "reportDate": "Date",
  "reportPeriod": "String",
  "reportRefreshDate": "Date",
  "total": "Integer"
}
```


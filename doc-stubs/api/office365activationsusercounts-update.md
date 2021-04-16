---
title: "Update office365ActivationsUserCounts"
description: "Update the properties of an office365ActivationsUserCounts object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update office365ActivationsUserCounts
Namespace: microsoft.graph



Update the properties of an [office365ActivationsUserCounts](../resources/office365activationsusercounts.md) object.

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
PATCH /office365ActivationsUserCounts
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [office365ActivationsUserCounts](../resources/office365activationsusercounts.md) object.

The following table shows the properties that are required when you update the [office365ActivationsUserCounts](../resources/office365activationsusercounts.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|activated|Int64|**TODO: Add Description**|
|assigned|Int64|**TODO: Add Description**|
|productType|String|**TODO: Add Description**|
|reportRefreshDate|Date|**TODO: Add Description**|
|sharedComputerActivation|Int64|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [office365ActivationsUserCounts](../resources/office365activationsusercounts.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_office365activationsusercounts"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/office365ActivationsUserCounts
Content-Type: application/json
Content-length: 227

{
  "@odata.type": "#microsoft.graph.office365ActivationsUserCounts",
  "activated": "Integer",
  "assigned": "Integer",
  "productType": "String",
  "reportRefreshDate": "Date",
  "sharedComputerActivation": "Integer"
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
  "@odata.type": "#microsoft.graph.office365ActivationsUserCounts",
  "id": "6d880c87-0c87-6d88-870c-886d870c886d",
  "activated": "Integer",
  "assigned": "Integer",
  "productType": "String",
  "reportRefreshDate": "Date",
  "sharedComputerActivation": "Integer"
}
```


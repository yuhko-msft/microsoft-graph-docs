---
title: "Update sharePointActivityUserDetail"
description: "Update the properties of a sharePointActivityUserDetail object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update sharePointActivityUserDetail
Namespace: microsoft.graph



Update the properties of a [sharePointActivityUserDetail](../resources/sharepointactivityuserdetail.md) object.

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
PATCH /sharePointActivityUserDetail
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [sharePointActivityUserDetail](../resources/sharepointactivityuserdetail.md) object.

The following table shows the properties that are required when you update the [sharePointActivityUserDetail](../resources/sharepointactivityuserdetail.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|assignedProducts|String collection|**TODO: Add Description**|
|deletedDate|Date|**TODO: Add Description**|
|isDeleted|Boolean|**TODO: Add Description**|
|lastActivityDate|Date|**TODO: Add Description**|
|reportPeriod|String|**TODO: Add Description**|
|reportRefreshDate|Date|**TODO: Add Description**|
|sharedExternallyFileCount|Int64|**TODO: Add Description**|
|sharedInternallyFileCount|Int64|**TODO: Add Description**|
|syncedFileCount|Int64|**TODO: Add Description**|
|userPrincipalName|String|**TODO: Add Description**|
|viewedOrEditedFileCount|Int64|**TODO: Add Description**|
|visitedPageCount|Int64|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [sharePointActivityUserDetail](../resources/sharepointactivityuserdetail.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_sharepointactivityuserdetail"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/sharePointActivityUserDetail
Content-Type: application/json
Content-length: 488

{
  "@odata.type": "#microsoft.graph.sharePointActivityUserDetail",
  "assignedProducts": [
    "String"
  ],
  "deletedDate": "Date",
  "isDeleted": "Boolean",
  "lastActivityDate": "Date",
  "reportPeriod": "String",
  "reportRefreshDate": "Date",
  "sharedExternallyFileCount": "Integer",
  "sharedInternallyFileCount": "Integer",
  "syncedFileCount": "Integer",
  "userPrincipalName": "String",
  "viewedOrEditedFileCount": "Integer",
  "visitedPageCount": "Integer"
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
  "@odata.type": "#microsoft.graph.sharePointActivityUserDetail",
  "id": "70c01ea9-1ea9-70c0-a91e-c070a91ec070",
  "assignedProducts": [
    "String"
  ],
  "deletedDate": "Date",
  "isDeleted": "Boolean",
  "lastActivityDate": "Date",
  "reportPeriod": "String",
  "reportRefreshDate": "Date",
  "sharedExternallyFileCount": "Integer",
  "sharedInternallyFileCount": "Integer",
  "syncedFileCount": "Integer",
  "userPrincipalName": "String",
  "viewedOrEditedFileCount": "Integer",
  "visitedPageCount": "Integer"
}
```


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
PATCH /sharePointActivityUserDetail
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [sharePointActivityUserDetail](../resources/sharepointactivityuserdetail.md) object.

The following table shows the properties that are required when you create the [sharePointActivityUserDetail](../resources/sharepointactivityuserdetail.md).

|Property|Type|Description|
|:---|:---|:---|
|reportRefreshDate|Date|**TODO: Add Description**|
|userPrincipalName|String|**TODO: Add Description**|
|isDeleted|Boolean|**TODO: Add Description**|
|deletedDate|Date|**TODO: Add Description**|
|lastActivityDate|Date|**TODO: Add Description**|
|viewedOrEditedFileCount|Int64|**TODO: Add Description**|
|syncedFileCount|Int64|**TODO: Add Description**|
|sharedInternallyFileCount|Int64|**TODO: Add Description**|
|sharedExternallyFileCount|Int64|**TODO: Add Description**|
|visitedPageCount|Int64|**TODO: Add Description**|
|assignedProducts|String collection|**TODO: Add Description**|
|reportPeriod|String|**TODO: Add Description**|



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
PATCH https://graph.microsoft.com/beta/sharePointActivityUserDetail
Content-Type: application/json
Content-length: 488

{
  "@odata.type": "#microsoft.graph.sharePointActivityUserDetail",
  "reportRefreshDate": "Date",
  "userPrincipalName": "String",
  "isDeleted": "Boolean",
  "deletedDate": "Date",
  "lastActivityDate": "Date",
  "viewedOrEditedFileCount": "Integer",
  "syncedFileCount": "Integer",
  "sharedInternallyFileCount": "Integer",
  "sharedExternallyFileCount": "Integer",
  "visitedPageCount": "Integer",
  "assignedProducts": [
    "String"
  ],
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
  "@odata.type": "#microsoft.graph.sharePointActivityUserDetail",
  "reportRefreshDate": "Date",
  "userPrincipalName": "String",
  "isDeleted": "Boolean",
  "deletedDate": "Date",
  "lastActivityDate": "Date",
  "viewedOrEditedFileCount": "Integer",
  "syncedFileCount": "Integer",
  "sharedInternallyFileCount": "Integer",
  "sharedExternallyFileCount": "Integer",
  "visitedPageCount": "Integer",
  "assignedProducts": [
    "String"
  ],
  "reportPeriod": "String"
}
```


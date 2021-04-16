---
title: "Create yammerGroupsActivityDetail"
description: "Create a new yammerGroupsActivityDetail object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create yammerGroupsActivityDetail
Namespace: microsoft.graph



Create a new [yammerGroupsActivityDetail](../resources/yammergroupsactivitydetail.md) object.

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
POST ** Collection URI for microsoft.graph.yammerGroupsActivityDetail not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [yammerGroupsActivityDetail](../resources/yammergroupsactivitydetail.md) object.

The following table shows the properties that are required when you create the [yammerGroupsActivityDetail](../resources/yammergroupsactivitydetail.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|groupDisplayName|String|**TODO: Add Description**|
|groupType|String|**TODO: Add Description**|
|isDeleted|Boolean|**TODO: Add Description**|
|lastActivityDate|Date|**TODO: Add Description**|
|likedCount|Int64|**TODO: Add Description**|
|memberCount|Int64|**TODO: Add Description**|
|networkDisplayName|String|**TODO: Add Description**|
|office365Connected|Boolean|**TODO: Add Description**|
|ownerPrincipalName|String|**TODO: Add Description**|
|postedCount|Int64|**TODO: Add Description**|
|readCount|Int64|**TODO: Add Description**|
|reportPeriod|String|**TODO: Add Description**|
|reportRefreshDate|Date|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and a [yammerGroupsActivityDetail](../resources/yammergroupsactivitydetail.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_yammergroupsactivitydetail_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0** Collection URI for microsoft.graph.yammerGroupsActivityDetail not found
Content-Type: application/json
Content-length: 465

{
  "@odata.type": "#microsoft.graph.yammerGroupsActivityDetail",
  "groupDisplayName": "String",
  "groupType": "String",
  "isDeleted": "Boolean",
  "lastActivityDate": "Date",
  "likedCount": "Integer",
  "memberCount": "Integer",
  "networkDisplayName": "String",
  "office365Connected": "Boolean",
  "ownerPrincipalName": "String",
  "postedCount": "Integer",
  "readCount": "Integer",
  "reportPeriod": "String",
  "reportRefreshDate": "Date"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.yammerGroupsActivityDetail"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.yammerGroupsActivityDetail",
  "id": "04e661a4-61a4-04e6-a461-e604a461e604",
  "groupDisplayName": "String",
  "groupType": "String",
  "isDeleted": "Boolean",
  "lastActivityDate": "Date",
  "likedCount": "Integer",
  "memberCount": "Integer",
  "networkDisplayName": "String",
  "office365Connected": "Boolean",
  "ownerPrincipalName": "String",
  "postedCount": "Integer",
  "readCount": "Integer",
  "reportPeriod": "String",
  "reportRefreshDate": "Date"
}
```


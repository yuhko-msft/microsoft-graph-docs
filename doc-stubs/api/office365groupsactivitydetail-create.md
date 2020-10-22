---
title: "Create office365GroupsActivityDetail"
description: "Create a new office365GroupsActivityDetail object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create office365GroupsActivityDetail
Namespace: microsoft.graph

Create a new [office365GroupsActivityDetail](../resources/office365groupsactivitydetail.md) object.

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
POST ** Collection URI for microsoft.graph.office365GroupsActivityDetail not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [office365GroupsActivityDetail](../resources/office365groupsactivitydetail.md) object.

The following table shows the properties that are required when you create the [office365GroupsActivityDetail](../resources/office365groupsactivitydetail.md).

|Property|Type|Description|
|:---|:---|:---|
|reportRefreshDate|Date|**TODO: Add Description**|
|groupId|String|**TODO: Add Description**|
|groupDisplayName|String|**TODO: Add Description**|
|isDeleted|Boolean|**TODO: Add Description**|
|ownerPrincipalName|String|**TODO: Add Description**|
|lastActivityDate|Date|**TODO: Add Description**|
|groupType|String|**TODO: Add Description**|
|memberCount|Int64|**TODO: Add Description**|
|externalMemberCount|Int64|**TODO: Add Description**|
|exchangeReceivedEmailCount|Int64|**TODO: Add Description**|
|sharePointActiveFileCount|Int64|**TODO: Add Description**|
|yammerPostedMessageCount|Int64|**TODO: Add Description**|
|yammerReadMessageCount|Int64|**TODO: Add Description**|
|yammerLikedMessageCount|Int64|**TODO: Add Description**|
|exchangeMailboxTotalItemCount|Int64|**TODO: Add Description**|
|exchangeMailboxStorageUsedInBytes|Int64|**TODO: Add Description**|
|sharePointTotalFileCount|Int64|**TODO: Add Description**|
|sharePointSiteStorageUsedInBytes|Int64|**TODO: Add Description**|
|reportPeriod|String|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and an [office365GroupsActivityDetail](../resources/office365groupsactivitydetail.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_office365groupsactivitydetail_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta** Collection URI for microsoft.graph.office365GroupsActivityDetail not found
Content-Type: application/json
Content-length: 774

{
  "@odata.type": "#microsoft.graph.office365GroupsActivityDetail",
  "reportRefreshDate": "Date",
  "groupId": "String",
  "groupDisplayName": "String",
  "isDeleted": "Boolean",
  "ownerPrincipalName": "String",
  "lastActivityDate": "Date",
  "groupType": "String",
  "memberCount": "Integer",
  "externalMemberCount": "Integer",
  "exchangeReceivedEmailCount": "Integer",
  "sharePointActiveFileCount": "Integer",
  "yammerPostedMessageCount": "Integer",
  "yammerReadMessageCount": "Integer",
  "yammerLikedMessageCount": "Integer",
  "exchangeMailboxTotalItemCount": "Integer",
  "exchangeMailboxStorageUsedInBytes": "Integer",
  "sharePointTotalFileCount": "Integer",
  "sharePointSiteStorageUsedInBytes": "Integer",
  "reportPeriod": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.office365GroupsActivityDetail"
}
-->
``` http
HTTP/1.1 201 Created

Content-Type: application/json
{
  "@odata.type": "#microsoft.graph.office365GroupsActivityDetail",
  "reportRefreshDate": "Date",
  "groupId": "String",
  "groupDisplayName": "String",
  "isDeleted": "Boolean",
  "ownerPrincipalName": "String",
  "lastActivityDate": "Date",
  "groupType": "String",
  "memberCount": "Integer",
  "externalMemberCount": "Integer",
  "exchangeReceivedEmailCount": "Integer",
  "sharePointActiveFileCount": "Integer",
  "yammerPostedMessageCount": "Integer",
  "yammerReadMessageCount": "Integer",
  "yammerLikedMessageCount": "Integer",
  "exchangeMailboxTotalItemCount": "Integer",
  "exchangeMailboxStorageUsedInBytes": "Integer",
  "sharePointTotalFileCount": "Integer",
  "sharePointSiteStorageUsedInBytes": "Integer",
  "reportPeriod": "String"
}
```


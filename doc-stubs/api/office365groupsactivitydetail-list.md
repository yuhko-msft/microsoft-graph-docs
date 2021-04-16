---
title: "List office365GroupsActivityDetail"
description: "Get a list of the office365GroupsActivityDetail objects and their properties."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List office365GroupsActivityDetail
Namespace: microsoft.graph



Get a list of the [office365GroupsActivityDetail](../resources/office365groupsactivitydetail.md) objects and their properties.

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
GET ** Collection URI for microsoft.graph.office365GroupsActivityDetail not found
```

## Optional query parameters
This method supports some of the OData query parameters to help customize the response. For general information, see [OData query parameters](/graph/query-parameters).

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|

## Request body
Do not supply a request body for this method.

## Response

If successful, this method returns a `200 OK` response code and a collection of [office365GroupsActivityDetail](../resources/office365groupsactivitydetail.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "list_office365groupsactivitydetail"
}
-->
``` http
GET https://graph.microsoft.com/v1.0** Collection URI for microsoft.graph.office365GroupsActivityDetail not found
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.office365GroupsActivityDetail)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
    {
      "@odata.type": "#microsoft.graph.office365GroupsActivityDetail",
      "id": "dd7026e1-26e1-dd70-e126-70dde12670dd",
      "exchangeMailboxStorageUsedInBytes": "Integer",
      "exchangeMailboxTotalItemCount": "Integer",
      "exchangeReceivedEmailCount": "Integer",
      "externalMemberCount": "Integer",
      "groupDisplayName": "String",
      "groupId": "String",
      "groupType": "String",
      "isDeleted": "Boolean",
      "lastActivityDate": "Date",
      "memberCount": "Integer",
      "ownerPrincipalName": "String",
      "reportPeriod": "String",
      "reportRefreshDate": "Date",
      "sharePointActiveFileCount": "Integer",
      "sharePointSiteStorageUsedInBytes": "Integer",
      "sharePointTotalFileCount": "Integer",
      "yammerLikedMessageCount": "Integer",
      "yammerPostedMessageCount": "Integer",
      "yammerReadMessageCount": "Integer"
    }
  ]
}
```


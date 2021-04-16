---
title: "Update office365GroupsActivityStorage"
description: "Update the properties of an office365GroupsActivityStorage object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update office365GroupsActivityStorage
Namespace: microsoft.graph



Update the properties of an [office365GroupsActivityStorage](../resources/office365groupsactivitystorage.md) object.

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
PATCH /office365GroupsActivityStorage
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [office365GroupsActivityStorage](../resources/office365groupsactivitystorage.md) object.

The following table shows the properties that are required when you update the [office365GroupsActivityStorage](../resources/office365groupsactivitystorage.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|mailboxStorageUsedInBytes|Int64|**TODO: Add Description**|
|reportDate|Date|**TODO: Add Description**|
|reportPeriod|String|**TODO: Add Description**|
|reportRefreshDate|Date|**TODO: Add Description**|
|siteStorageUsedInBytes|Int64|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [office365GroupsActivityStorage](../resources/office365groupsactivitystorage.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_office365groupsactivitystorage"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/office365GroupsActivityStorage
Content-Type: application/json
Content-length: 241

{
  "@odata.type": "#microsoft.graph.office365GroupsActivityStorage",
  "mailboxStorageUsedInBytes": "Integer",
  "reportDate": "Date",
  "reportPeriod": "String",
  "reportRefreshDate": "Date",
  "siteStorageUsedInBytes": "Integer"
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
  "@odata.type": "#microsoft.graph.office365GroupsActivityStorage",
  "id": "5d30e75c-e75c-5d30-5ce7-305d5ce7305d",
  "mailboxStorageUsedInBytes": "Integer",
  "reportDate": "Date",
  "reportPeriod": "String",
  "reportRefreshDate": "Date",
  "siteStorageUsedInBytes": "Integer"
}
```


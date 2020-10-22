---
title: "Update oneDriveUsageAccountDetail"
description: "Update the properties of an oneDriveUsageAccountDetail object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update oneDriveUsageAccountDetail
Namespace: microsoft.graph

Update the properties of an [oneDriveUsageAccountDetail](../resources/onedriveusageaccountdetail.md) object.

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
PATCH /oneDriveUsageAccountDetail
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [oneDriveUsageAccountDetail](../resources/onedriveusageaccountdetail.md) object.

The following table shows the properties that are required when you create the [oneDriveUsageAccountDetail](../resources/onedriveusageaccountdetail.md).

|Property|Type|Description|
|:---|:---|:---|
|reportRefreshDate|Date|**TODO: Add Description**|
|siteUrl|String|**TODO: Add Description**|
|ownerDisplayName|String|**TODO: Add Description**|
|ownerPrincipalName|String|**TODO: Add Description**|
|isDeleted|Boolean|**TODO: Add Description**|
|lastActivityDate|Date|**TODO: Add Description**|
|fileCount|Int64|**TODO: Add Description**|
|activeFileCount|Int64|**TODO: Add Description**|
|storageUsedInBytes|Int64|**TODO: Add Description**|
|storageAllocatedInBytes|Int64|**TODO: Add Description**|
|reportPeriod|String|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [oneDriveUsageAccountDetail](../resources/onedriveusageaccountdetail.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_onedriveusageaccountdetail"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/oneDriveUsageAccountDetail
Content-Type: application/json
Content-length: 416

{
  "@odata.type": "#microsoft.graph.oneDriveUsageAccountDetail",
  "reportRefreshDate": "Date",
  "siteUrl": "String",
  "ownerDisplayName": "String",
  "ownerPrincipalName": "String",
  "isDeleted": "Boolean",
  "lastActivityDate": "Date",
  "fileCount": "Integer",
  "activeFileCount": "Integer",
  "storageUsedInBytes": "Integer",
  "storageAllocatedInBytes": "Integer",
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
  "@odata.type": "#microsoft.graph.oneDriveUsageAccountDetail",
  "reportRefreshDate": "Date",
  "siteUrl": "String",
  "ownerDisplayName": "String",
  "ownerPrincipalName": "String",
  "isDeleted": "Boolean",
  "lastActivityDate": "Date",
  "fileCount": "Integer",
  "activeFileCount": "Integer",
  "storageUsedInBytes": "Integer",
  "storageAllocatedInBytes": "Integer",
  "reportPeriod": "String"
}
```


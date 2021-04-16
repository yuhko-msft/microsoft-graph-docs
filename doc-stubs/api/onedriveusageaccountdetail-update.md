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
PATCH /oneDriveUsageAccountDetail
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [oneDriveUsageAccountDetail](../resources/onedriveusageaccountdetail.md) object.

The following table shows the properties that are required when you update the [oneDriveUsageAccountDetail](../resources/onedriveusageaccountdetail.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|activeFileCount|Int64|**TODO: Add Description**|
|fileCount|Int64|**TODO: Add Description**|
|isDeleted|Boolean|**TODO: Add Description**|
|lastActivityDate|Date|**TODO: Add Description**|
|ownerDisplayName|String|**TODO: Add Description**|
|ownerPrincipalName|String|**TODO: Add Description**|
|reportPeriod|String|**TODO: Add Description**|
|reportRefreshDate|Date|**TODO: Add Description**|
|siteUrl|String|**TODO: Add Description**|
|storageAllocatedInBytes|Int64|**TODO: Add Description**|
|storageUsedInBytes|Int64|**TODO: Add Description**|



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
PATCH https://graph.microsoft.com/v1.0/oneDriveUsageAccountDetail
Content-Type: application/json
Content-length: 416

{
  "@odata.type": "#microsoft.graph.oneDriveUsageAccountDetail",
  "activeFileCount": "Integer",
  "fileCount": "Integer",
  "isDeleted": "Boolean",
  "lastActivityDate": "Date",
  "ownerDisplayName": "String",
  "ownerPrincipalName": "String",
  "reportPeriod": "String",
  "reportRefreshDate": "Date",
  "siteUrl": "String",
  "storageAllocatedInBytes": "Integer",
  "storageUsedInBytes": "Integer"
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
  "id": "dd11addf-addf-dd11-dfad-11dddfad11dd",
  "activeFileCount": "Integer",
  "fileCount": "Integer",
  "isDeleted": "Boolean",
  "lastActivityDate": "Date",
  "ownerDisplayName": "String",
  "ownerPrincipalName": "String",
  "reportPeriod": "String",
  "reportRefreshDate": "Date",
  "siteUrl": "String",
  "storageAllocatedInBytes": "Integer",
  "storageUsedInBytes": "Integer"
}
```


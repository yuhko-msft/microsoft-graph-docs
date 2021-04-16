---
title: "Update mailboxUsageDetail"
description: "Update the properties of a mailboxUsageDetail object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update mailboxUsageDetail
Namespace: microsoft.graph



Update the properties of a [mailboxUsageDetail](../resources/mailboxusagedetail.md) object.

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
PATCH /mailboxUsageDetail
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [mailboxUsageDetail](../resources/mailboxusagedetail.md) object.

The following table shows the properties that are required when you update the [mailboxUsageDetail](../resources/mailboxusagedetail.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|createdDate|Date|**TODO: Add Description**|
|deletedDate|Date|**TODO: Add Description**|
|deletedItemCount|Int64|**TODO: Add Description**|
|deletedItemSizeInBytes|Int64|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|isDeleted|Boolean|**TODO: Add Description**|
|issueWarningQuotaInBytes|Int64|**TODO: Add Description**|
|itemCount|Int64|**TODO: Add Description**|
|lastActivityDate|Date|**TODO: Add Description**|
|prohibitSendQuotaInBytes|Int64|**TODO: Add Description**|
|prohibitSendReceiveQuotaInBytes|Int64|**TODO: Add Description**|
|reportPeriod|String|**TODO: Add Description**|
|reportRefreshDate|Date|**TODO: Add Description**|
|storageUsedInBytes|Int64|**TODO: Add Description**|
|userPrincipalName|String|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [mailboxUsageDetail](../resources/mailboxusagedetail.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_mailboxusagedetail"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/mailboxUsageDetail
Content-Type: application/json
Content-length: 563

{
  "@odata.type": "#microsoft.graph.mailboxUsageDetail",
  "createdDate": "Date",
  "deletedDate": "Date",
  "deletedItemCount": "Integer",
  "deletedItemSizeInBytes": "Integer",
  "displayName": "String",
  "isDeleted": "Boolean",
  "issueWarningQuotaInBytes": "Integer",
  "itemCount": "Integer",
  "lastActivityDate": "Date",
  "prohibitSendQuotaInBytes": "Integer",
  "prohibitSendReceiveQuotaInBytes": "Integer",
  "reportPeriod": "String",
  "reportRefreshDate": "Date",
  "storageUsedInBytes": "Integer",
  "userPrincipalName": "String"
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
  "@odata.type": "#microsoft.graph.mailboxUsageDetail",
  "id": "398cf667-f667-398c-67f6-8c3967f68c39",
  "createdDate": "Date",
  "deletedDate": "Date",
  "deletedItemCount": "Integer",
  "deletedItemSizeInBytes": "Integer",
  "displayName": "String",
  "isDeleted": "Boolean",
  "issueWarningQuotaInBytes": "Integer",
  "itemCount": "Integer",
  "lastActivityDate": "Date",
  "prohibitSendQuotaInBytes": "Integer",
  "prohibitSendReceiveQuotaInBytes": "Integer",
  "reportPeriod": "String",
  "reportRefreshDate": "Date",
  "storageUsedInBytes": "Integer",
  "userPrincipalName": "String"
}
```


---
title: "Update mailboxUsageStorage"
description: "Update the properties of a mailboxUsageStorage object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update mailboxUsageStorage
Namespace: microsoft.graph



Update the properties of a [mailboxUsageStorage](../resources/mailboxusagestorage.md) object.

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
PATCH /mailboxUsageStorage
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [mailboxUsageStorage](../resources/mailboxusagestorage.md) object.

The following table shows the properties that are required when you update the [mailboxUsageStorage](../resources/mailboxusagestorage.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|reportDate|Date|**TODO: Add Description**|
|reportPeriod|String|**TODO: Add Description**|
|reportRefreshDate|Date|**TODO: Add Description**|
|storageUsedInBytes|Int64|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [mailboxUsageStorage](../resources/mailboxusagestorage.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_mailboxusagestorage"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/mailboxUsageStorage
Content-Type: application/json
Content-length: 183

{
  "@odata.type": "#microsoft.graph.mailboxUsageStorage",
  "reportDate": "Date",
  "reportPeriod": "String",
  "reportRefreshDate": "Date",
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
  "@odata.type": "#microsoft.graph.mailboxUsageStorage",
  "id": "7b6e2698-2698-7b6e-9826-6e7b98266e7b",
  "reportDate": "Date",
  "reportPeriod": "String",
  "reportRefreshDate": "Date",
  "storageUsedInBytes": "Integer"
}
```


---
title: "Create mailboxUsageStorage"
description: "Create a new mailboxUsageStorage object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create mailboxUsageStorage
Namespace: microsoft.graph



Create a new [mailboxUsageStorage](../resources/mailboxusagestorage.md) object.

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
POST ** Collection URI for microsoft.graph.mailboxUsageStorage not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [mailboxUsageStorage](../resources/mailboxusagestorage.md) object.

The following table shows the properties that are required when you create the [mailboxUsageStorage](../resources/mailboxusagestorage.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|reportDate|Date|**TODO: Add Description**|
|reportPeriod|String|**TODO: Add Description**|
|reportRefreshDate|Date|**TODO: Add Description**|
|storageUsedInBytes|Int64|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and a [mailboxUsageStorage](../resources/mailboxusagestorage.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_mailboxusagestorage_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0** Collection URI for microsoft.graph.mailboxUsageStorage not found
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
  "truncated": true,
  "@odata.type": "microsoft.graph.mailboxUsageStorage"
}
-->
``` http
HTTP/1.1 201 Created
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


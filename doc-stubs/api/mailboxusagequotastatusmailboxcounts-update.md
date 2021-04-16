---
title: "Update mailboxUsageQuotaStatusMailboxCounts"
description: "Update the properties of a mailboxUsageQuotaStatusMailboxCounts object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update mailboxUsageQuotaStatusMailboxCounts
Namespace: microsoft.graph



Update the properties of a [mailboxUsageQuotaStatusMailboxCounts](../resources/mailboxusagequotastatusmailboxcounts.md) object.

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
PATCH /mailboxUsageQuotaStatusMailboxCounts
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [mailboxUsageQuotaStatusMailboxCounts](../resources/mailboxusagequotastatusmailboxcounts.md) object.

The following table shows the properties that are required when you update the [mailboxUsageQuotaStatusMailboxCounts](../resources/mailboxusagequotastatusmailboxcounts.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|indeterminate|Int64|**TODO: Add Description**|
|reportDate|Date|**TODO: Add Description**|
|reportPeriod|String|**TODO: Add Description**|
|reportRefreshDate|Date|**TODO: Add Description**|
|sendProhibited|Int64|**TODO: Add Description**|
|sendReceiveProhibited|Int64|**TODO: Add Description**|
|underLimit|Int64|**TODO: Add Description**|
|warningIssued|Int64|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [mailboxUsageQuotaStatusMailboxCounts](../resources/mailboxusagequotastatusmailboxcounts.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_mailboxusagequotastatusmailboxcounts"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/mailboxUsageQuotaStatusMailboxCounts
Content-Type: application/json
Content-length: 325

{
  "@odata.type": "#microsoft.graph.mailboxUsageQuotaStatusMailboxCounts",
  "indeterminate": "Integer",
  "reportDate": "Date",
  "reportPeriod": "String",
  "reportRefreshDate": "Date",
  "sendProhibited": "Integer",
  "sendReceiveProhibited": "Integer",
  "underLimit": "Integer",
  "warningIssued": "Integer"
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
  "@odata.type": "#microsoft.graph.mailboxUsageQuotaStatusMailboxCounts",
  "id": "47e5565e-565e-47e5-5e56-e5475e56e547",
  "indeterminate": "Integer",
  "reportDate": "Date",
  "reportPeriod": "String",
  "reportRefreshDate": "Date",
  "sendProhibited": "Integer",
  "sendReceiveProhibited": "Integer",
  "underLimit": "Integer",
  "warningIssued": "Integer"
}
```


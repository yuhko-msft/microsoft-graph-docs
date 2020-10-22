---
title: "Create mailboxUsageQuotaStatusMailboxCounts"
description: "Create a new mailboxUsageQuotaStatusMailboxCounts object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create mailboxUsageQuotaStatusMailboxCounts
Namespace: microsoft.graph

Create a new [mailboxUsageQuotaStatusMailboxCounts](../resources/mailboxusagequotastatusmailboxcounts.md) object.

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
POST ** Collection URI for microsoft.graph.mailboxUsageQuotaStatusMailboxCounts not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [mailboxUsageQuotaStatusMailboxCounts](../resources/mailboxusagequotastatusmailboxcounts.md) object.

The following table shows the properties that are required when you create the [mailboxUsageQuotaStatusMailboxCounts](../resources/mailboxusagequotastatusmailboxcounts.md).

|Property|Type|Description|
|:---|:---|:---|
|reportRefreshDate|Date|**TODO: Add Description**|
|underLimit|Int64|**TODO: Add Description**|
|warningIssued|Int64|**TODO: Add Description**|
|sendProhibited|Int64|**TODO: Add Description**|
|sendReceiveProhibited|Int64|**TODO: Add Description**|
|indeterminate|Int64|**TODO: Add Description**|
|reportDate|Date|**TODO: Add Description**|
|reportPeriod|String|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and a [mailboxUsageQuotaStatusMailboxCounts](../resources/mailboxusagequotastatusmailboxcounts.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_mailboxusagequotastatusmailboxcounts_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta** Collection URI for microsoft.graph.mailboxUsageQuotaStatusMailboxCounts not found
Content-Type: application/json
Content-length: 325

{
  "@odata.type": "#microsoft.graph.mailboxUsageQuotaStatusMailboxCounts",
  "reportRefreshDate": "Date",
  "underLimit": "Integer",
  "warningIssued": "Integer",
  "sendProhibited": "Integer",
  "sendReceiveProhibited": "Integer",
  "indeterminate": "Integer",
  "reportDate": "Date",
  "reportPeriod": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.mailboxUsageQuotaStatusMailboxCounts"
}
-->
``` http
HTTP/1.1 201 Created

Content-Type: application/json
{
  "@odata.type": "#microsoft.graph.mailboxUsageQuotaStatusMailboxCounts",
  "reportRefreshDate": "Date",
  "underLimit": "Integer",
  "warningIssued": "Integer",
  "sendProhibited": "Integer",
  "sendReceiveProhibited": "Integer",
  "indeterminate": "Integer",
  "reportDate": "Date",
  "reportPeriod": "String"
}
```


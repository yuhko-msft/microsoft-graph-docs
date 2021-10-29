---
title: "Update legalHold"
description: "Update the properties of a legalHold object."
ms.localizationpriority: medium
author: "mahage-msft"
ms.prod: "ediscovery"
doc_type: apiPageType
---

# Update legalHold

Namespace: microsoft.graph.ediscovery

Update the properties of a [legalHold](../resources/ediscovery-legalhold.md) object.

## Permissions

One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from least to most privileged)|
|:---|:---|
|Delegated (work or school account)|eDiscovery.Read.All, eDiscovery.ReadWrite.All|
|Delegated (personal Microsoft account)|Not supported.|
|Application|Not supported.|

## HTTP request

<!-- {
  "blockType": "ignored"
}
-->

``` http
PATCH /compliance/ediscovery/cases/{caseId}/legalHolds/{legalholdId}
```

## Request headers

|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body

In the request body, supply the values for relevant fields that should be updated. Existing properties that aren't included in the request body will maintain their previous values or be recalculated based on changes to other property values. For best performance, don't include existing values that haven't changed.

|Property|Type|Description|
|:---|:---|:---|
|contentQuery|String|KQL query that specifies content to be held in the specified locations. For more information about KQL in eDiscovery, see [Keyword queries and search conditions for Content Search and eDiscovery](/microsoft-365/compliance/keyword-queries-and-search-conditions). To hold all content in the specified locations, leave **contentQuery** blank. |
|description|String| The legal hold description. |
|displayName|String| The display name of the legal hold. |
|isEnabled|Boolean|Indicates whether the hold is enabled and actively holding content. |

## Response

If successful, this action returns a `204 No Content` response code.

## Examples

### Request

<!-- {
  "blockType": "request",
  "name": "update_legalhold"
}
-->

``` http
PATCH https://graph.microsoft.com/v1.0/compliance/ediscovery/cases/d558aac1-c40f-4bc7-ac06-2b64e601123a/legalHolds/a1eed6af-1762-4af2-8dca-63633c3deba2
Content-Type: application/json
Content-length: 295

{
  "description": "This is a description for a legalHold"
}
```

### Response

<!-- {
  "blockType": "response"
}
-->

``` http
HTTP/1.1 204 No Content
```

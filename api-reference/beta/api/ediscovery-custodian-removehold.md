---
title: "custodian: removeHold"
description: "Removes all holds from the specified custodians"
author: "mahage-msft"
ms.localizationpriority: medium
ms.prod: "ediscovery"
doc_type: apiPageType
---

# custodian: removeHold

Namespace: microsoft.graph.ediscovery

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Removes all holds from the specified custodians

## Permissions

One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from least to most privileged)|
|:---|:---|
|Delegated (work or school account)|eDiscovery.ReadWrite.All|
|Delegated (personal Microsoft account)|Not supported.|
|Application|Not supported.|

## HTTP request

<!-- {
  "blockType": "ignored"
}
-->

``` http
POST /compliance/ediscovery/cases/{caseId}/custodians/{custodianId}/removeHold
POST /compliance/ediscovery/cases/{caseId}/custodians/removeHold
```

## Request headers

|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body

In the request body, supply JSON representation of the parameters.

The following table shows the parameters that can be used with this action.

|Parameter|Type|Description|
|:---|:---|:---|
|ids|String collection|List of custodian Ids for whom to remove holds from.|

## Response

If successful, this action returns a `204 No Content` response code.

## Examples

### Request

<!-- {
  "blockType": "request",
  "name": "custodianthis.removehold"
}
-->

``` http
POST https://graph.microsoft.com/beta/compliance/ediscovery/cases/03ffe31b-73bb-44b5-9b7d-f27f33c6a303/custodians/removeHold
Content-Type: application/json
Content-length: 35

{
  "ids": [
    "2192ca408ea2410eba3bec8ae873be6b",
    "ab9ec130f90248949f09a1a7032f5352"
  ]
}
```

### Response

>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true
}
-->

``` http
HTTP/1.1 204 No Content
```

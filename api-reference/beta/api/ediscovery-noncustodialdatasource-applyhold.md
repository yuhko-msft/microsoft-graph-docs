---
title: "noncustodialDataSource: applyHold"
description: "Apply a legal hold to a list of noncustodialDataSources."
author: "mahage-msft"
ms.localizationpriority: medium
ms.prod: "ediscovery"
doc_type: apiPageType
---

# noncustodialDataSource: applyHold

Namespace: microsoft.graph.ediscovery

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Apply a legal hold to a list of [noncustodialDataSource](../resources/ediscovery-noncustodialdatasource.md)s.

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
POST /compliance/ediscovery/cases/{caseId}/noncustodialDataSources/{noncustodialDataSourceId}/applyHold
POST /compliance/ediscovery/cases/{caseId}/noncustodialDataSources/applyHold
```

## Request headers

|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body

In the request body, supply a JSON representation of the parameters.

The following table shows the parameters that can be used with this action.

|Parameter|Type|Description|
|:---|:---|:---|
|ids|String collection|List of non-custodial data source IDs for whom to apply holds to.|

## Response

If successful, this action returns a `204 No Content` response code.

## Examples

### Request

The following is an example of a request.

<!-- {
  "blockType": "request",
  "name": "noncustodialdatasourcethis.applyhold"
}
-->

``` http
POST https://graph.microsoft.com/beta/compliance/ediscovery/cases/03ffe31b-73bb-44b5-9b7d-f27f33c6a303/noncustodialDataSources/applyHold
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

The following is an example of the response.

<!-- {
  "blockType": "response",
  "truncated": true
}
-->

``` http
HTTP/1.1 204 No Content
```

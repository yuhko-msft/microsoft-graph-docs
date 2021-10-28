---
title: "List additionalSources"
description: "Get a list of additional dataSource objects associated with a source collection."
author: "mahage-msft"
ms.localizationpriority: medium
ms.prod: "ediscovery"
doc_type: apiPageType
---

# List additionalSources

Namespace: microsoft.graph.ediscovery

Get a list of additional [dataSource](../resources/ediscovery-datasource.md) objects associated with a source collection.

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
GET /compliance/ediscovery/cases/{caseId}/sourceCollections/{sourceCollectionId}/additionalSources
```

## Optional query parameters

This method supports some of the OData query parameters to help customize the response. For general information, see [OData query parameters](/graph/query-parameters).

## Request headers

|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|

## Request body

Do not supply a request body for this method.

## Response

If successful, this method returns a `200 OK` response code and a collection of [microsoft.graph.ediscovery.dataSource](../resources/ediscovery-datasource.md) objects in the response body.

## Examples

### Request

<!-- {
  "blockType": "request",
  "name": "list_datasource_1"
}
-->

``` http
GET https://graph.microsoft.com/v1.0/compliance/ediscovery/cases/197e208f-cc2d-4b73-8f99-18b27be4c282/sourceCollections/1af92e75-bd60-4330-9d1e-e4ee8f3ea17f/additionalSources
```

---

### Response

> **Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "isCollection": true,
  "@odata.type": "microsoft.graph.ediscovery.dataSource"
}
-->

``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
    {
      "@odata.type": "#microsoft.graph.ediscovery.dataSource",
      "id": "1af92e75-bd60-4330-9d1e-e4ee8f3ea17f",
      "displayName": "Quarterly Financials search",
      "createdDateTime": "2021-01-12T18:09:03.417009Z",
      "createdBy": {
          "user": {
              "id": "c1db6f13-332a-4d84-b111-914383ff9fc9",
              "displayName": "EDisco Admin",
              "userPrincipalname": "admin@contoso.com"
          }
      }
    }
  ]
}
```

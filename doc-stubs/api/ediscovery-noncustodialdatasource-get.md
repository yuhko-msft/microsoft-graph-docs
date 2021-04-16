---
title: "Get noncustodialDataSource"
description: "Read the properties and relationships of a noncustodialDataSource object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get noncustodialDataSource
Namespace: microsoft.graph.ediscovery



Read the properties and relationships of a [noncustodialDataSource](../resources/ediscovery-noncustodialdatasource.md) object.

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
GET /compliance/ediscovery/cases/{caseId}/noncustodialDataSources/{noncustodialDataSourceId}
GET /compliance/ediscovery/cases/{caseId}/sourceCollections/{sourceCollectionId}/noncustodialSources/{noncustodialDataSourceId}
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

If successful, this method returns a `200 OK` response code and a [noncustodialDataSource](../resources/ediscovery-noncustodialdatasource.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_noncustodialdatasource"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/compliance/ediscovery/cases/{caseId}/noncustodialDataSources/{noncustodialDataSourceId}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.ediscovery.noncustodialDataSource"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.ediscovery.noncustodialDataSource",
    "id": "fed23a5e-3a5e-fed2-5e3a-d2fe5e3ad2fe",
    "createdDateTime": "String (timestamp)",
    "displayName": "String",
    "lastModifiedDateTime": "String (timestamp)",
    "releasedDateTime": "String (timestamp)",
    "status": "String",
    "applyHoldToSource": "Boolean"
  }
}
```


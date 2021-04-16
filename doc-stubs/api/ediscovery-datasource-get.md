---
title: "Get dataSource"
description: "Read the properties and relationships of a dataSource object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get dataSource
Namespace: microsoft.graph.ediscovery



Read the properties and relationships of a [dataSource](../resources/ediscovery-datasource.md) object.

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
GET /compliance/ediscovery/cases/{caseId}/noncustodialDataSources/{noncustodialDataSourceId}/dataSource
GET /compliance/ediscovery/cases/{caseId}/sourceCollections/{sourceCollectionId}/custodianSources/{dataSourceId}
GET /compliance/ediscovery/cases/{caseId}/sourceCollections/{sourceCollectionId}/additionalSources/{dataSourceId}
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

If successful, this method returns a `200 OK` response code and a [dataSource](../resources/ediscovery-datasource.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_datasource"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/compliance/ediscovery/cases/{caseId}/noncustodialDataSources/{noncustodialDataSourceId}/dataSource
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.ediscovery.dataSource"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.ediscovery.dataSource",
    "id": "3a2bab19-ab19-3a2b-19ab-2b3a19ab2b3a",
    "createdBy": {
      "@odata.type": "microsoft.graph.identitySet"
    },
    "createdDateTime": "String (timestamp)",
    "displayName": "String"
  }
}
```


---
title: "Create exactMatchDataStore"
description: "Create a new exactMatchDataStore object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create exactMatchDataStore
Namespace: microsoft.graph



Create a new exactMatchDataStore object.

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
POST /dataClassification/exactMatchDataStores
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [exactMatchDataStore](../resources/exactmatchdatastore.md) object.

The following table shows the properties that are required when you create the [exactMatchDataStore](../resources/exactmatchdatastore.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|columns|[exactDataMatchStoreColumn](../resources/exactdatamatchstorecolumn.md) collection|**TODO: Add Description** Inherited from [exactMatchDataStoreBase](../resources/exactmatchdatastorebase.md)|
|dataLastUpdatedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [exactMatchDataStoreBase](../resources/exactmatchdatastorebase.md)|
|description|String|**TODO: Add Description** Inherited from [exactMatchDataStoreBase](../resources/exactmatchdatastorebase.md)|
|displayName|String|**TODO: Add Description** Inherited from [exactMatchDataStoreBase](../resources/exactmatchdatastorebase.md)|



## Response

If successful, this method returns a `201 Created` response code and an [exactMatchDataStore](../resources/exactmatchdatastore.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_exactmatchdatastore_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/dataClassification/exactMatchDataStores
Content-Type: application/json
Content-length: 271

{
  "@odata.type": "#microsoft.graph.exactMatchDataStore",
  "columns": [
    {
      "@odata.type": "microsoft.graph.exactDataMatchStoreColumn"
    }
  ],
  "dataLastUpdatedDateTime": "String (timestamp)",
  "description": "String",
  "displayName": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.exactMatchDataStore"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.exactMatchDataStore",
  "id": "4614109f-109f-4614-9f10-14469f101446",
  "columns": [
    {
      "@odata.type": "microsoft.graph.exactDataMatchStoreColumn"
    }
  ],
  "dataLastUpdatedDateTime": "String (timestamp)",
  "description": "String",
  "displayName": "String"
}
```


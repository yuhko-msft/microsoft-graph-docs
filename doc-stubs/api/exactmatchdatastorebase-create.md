---
title: "Create exactMatchDataStoreBase"
description: "Create a new exactMatchDataStoreBase object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create exactMatchDataStoreBase
Namespace: microsoft.graph



Create a new [exactMatchDataStoreBase](../resources/exactmatchdatastorebase.md) object.

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
POST ** Collection URI for microsoft.graph.exactMatchDataStoreBase not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [exactMatchDataStoreBase](../resources/exactmatchdatastorebase.md) object.

The following table shows the properties that are required when you create the [exactMatchDataStoreBase](../resources/exactmatchdatastorebase.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|columns|[exactDataMatchStoreColumn](../resources/exactdatamatchstorecolumn.md) collection|**TODO: Add Description**|
|dataLastUpdatedDateTime|DateTimeOffset|**TODO: Add Description**|
|description|String|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and an [exactMatchDataStoreBase](../resources/exactmatchdatastorebase.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_exactmatchdatastorebase_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0** Collection URI for microsoft.graph.exactMatchDataStoreBase not found
Content-Type: application/json
Content-length: 275

{
  "@odata.type": "#microsoft.graph.exactMatchDataStoreBase",
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
  "@odata.type": "microsoft.graph.exactMatchDataStoreBase"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.exactMatchDataStoreBase",
  "id": "3a55b409-b409-3a55-09b4-553a09b4553a",
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


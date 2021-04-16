---
title: "Update exactMatchDataStoreBase"
description: "Update the properties of an exactMatchDataStoreBase object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update exactMatchDataStoreBase
Namespace: microsoft.graph



Update the properties of an [exactMatchDataStoreBase](../resources/exactmatchdatastorebase.md) object.

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
PATCH /exactMatchDataStoreBase
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [exactMatchDataStoreBase](../resources/exactmatchdatastorebase.md) object.

The following table shows the properties that are required when you update the [exactMatchDataStoreBase](../resources/exactmatchdatastorebase.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|columns|[exactDataMatchStoreColumn](../resources/exactdatamatchstorecolumn.md) collection|**TODO: Add Description**|
|dataLastUpdatedDateTime|DateTimeOffset|**TODO: Add Description**|
|description|String|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [exactMatchDataStoreBase](../resources/exactmatchdatastorebase.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_exactmatchdatastorebase"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/exactMatchDataStoreBase
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
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK
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


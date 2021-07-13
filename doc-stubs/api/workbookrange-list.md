---
title: "List workbookRanges"
description: "Get a list of the workbookRange objects and their properties."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List workbookRanges
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Get a list of the [workbookRange](../resources/workbookrange.md) objects and their properties.

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
GET ** Collection URI for microsoft.graph.workbookRange not found
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

If successful, this method returns a `200 OK` response code and a collection of [workbookRange](../resources/workbookrange.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "list_workbookrange"
}
-->
``` http
GET https://graph.microsoft.com/beta** Collection URI for microsoft.graph.workbookRange not found
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.workbookRange)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
    {
      "@odata.type": "#microsoft.graph.workbookRange",
      "id": "1974cf11-cf11-1974-11cf-741911cf7419",
      "address": "String",
      "addressLocal": "String",
      "cellCount": "Integer",
      "columnCount": "Integer",
      "columnHidden": "Boolean",
      "columnIndex": "Integer",
      "formulas": {
        "@odata.type": "microsoft.graph.Json"
      },
      "formulasLocal": {
        "@odata.type": "microsoft.graph.Json"
      },
      "formulasR1C1": {
        "@odata.type": "microsoft.graph.Json"
      },
      "hidden": "Boolean",
      "numberFormat": {
        "@odata.type": "microsoft.graph.Json"
      },
      "rowCount": "Integer",
      "rowHidden": "Boolean",
      "rowIndex": "Integer",
      "text": {
        "@odata.type": "microsoft.graph.Json"
      },
      "values": {
        "@odata.type": "microsoft.graph.Json"
      },
      "valueTypes": {
        "@odata.type": "microsoft.graph.Json"
      }
    }
  ]
}
```


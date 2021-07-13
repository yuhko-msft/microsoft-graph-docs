---
title: "Create workbookRange"
description: "Create a new workbookRange object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create workbookRange
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new [workbookRange](../resources/workbookrange.md) object.

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
POST ** Collection URI for microsoft.graph.workbookRange not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [workbookRange](../resources/workbookrange.md) object.

The following table shows the properties that are required when you create the [workbookRange](../resources/workbookrange.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|address|String|**TODO: Add Description**|
|addressLocal|String|**TODO: Add Description**|
|cellCount|Int32|**TODO: Add Description**|
|columnCount|Int32|**TODO: Add Description**|
|columnHidden|Boolean|**TODO: Add Description**|
|columnIndex|Int32|**TODO: Add Description**|
|formulas|[Json](../resources/json.md)|**TODO: Add Description**|
|formulasLocal|[Json](../resources/json.md)|**TODO: Add Description**|
|formulasR1C1|[Json](../resources/json.md)|**TODO: Add Description**|
|hidden|Boolean|**TODO: Add Description**|
|numberFormat|[Json](../resources/json.md)|**TODO: Add Description**|
|rowCount|Int32|**TODO: Add Description**|
|rowHidden|Boolean|**TODO: Add Description**|
|rowIndex|Int32|**TODO: Add Description**|
|text|[Json](../resources/json.md)|**TODO: Add Description**|
|values|[Json](../resources/json.md)|**TODO: Add Description**|
|valueTypes|[Json](../resources/json.md)|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and a [workbookRange](../resources/workbookrange.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_workbookrange_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta** Collection URI for microsoft.graph.workbookRange not found
Content-Type: application/json
Content-length: 797

{
  "@odata.type": "#microsoft.graph.workbookRange",
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
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.workbookRange"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

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
```


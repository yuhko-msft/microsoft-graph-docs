---
title: "Update workbookRange"
description: "Update the properties of a workbookRange object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update workbookRange
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of a [workbookRange](../resources/workbookrange.md) object.

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
PATCH /workbookRange
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [workbookRange](../resources/workbookrange.md) object.

The following table shows the properties that are required when you update the [workbookRange](../resources/workbookrange.md).

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

If successful, this method returns a `200 OK` response code and an updated [workbookRange](../resources/workbookrange.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_workbookrange"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/workbookRange
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
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.workbookRange",
  "id": "5c4ca6fb-a6fb-5c4c-fba6-4c5cfba64c5c",
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


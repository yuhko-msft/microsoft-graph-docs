---
title: "Update workbookRangeView"
description: "Update the properties of a workbookRangeView object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update workbookRangeView
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of a [workbookRangeView](../resources/workbookrangeview.md) object.

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
PATCH /workbookRangeView
PATCH /workbookRangeView/rows/{workbookRangeViewId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [workbookRangeView](../resources/workbookrangeview.md) object.

The following table shows the properties that are required when you update the [workbookRangeView](../resources/workbookrangeview.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|cellAddresses|[Json](../resources/json.md)|**TODO: Add Description**|
|columnCount|Int32|**TODO: Add Description**|
|formulas|[Json](../resources/json.md)|**TODO: Add Description**|
|formulasLocal|[Json](../resources/json.md)|**TODO: Add Description**|
|formulasR1C1|[Json](../resources/json.md)|**TODO: Add Description**|
|index|Int32|**TODO: Add Description**|
|numberFormat|[Json](../resources/json.md)|**TODO: Add Description**|
|rowCount|Int32|**TODO: Add Description**|
|text|[Json](../resources/json.md)|**TODO: Add Description**|
|values|[Json](../resources/json.md)|**TODO: Add Description**|
|valueTypes|[Json](../resources/json.md)|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [workbookRangeView](../resources/workbookrangeview.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_workbookrangeview"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/workbookRangeView
Content-Type: application/json
Content-length: 679

{
  "@odata.type": "#microsoft.graph.workbookRangeView",
  "cellAddresses": {
    "@odata.type": "microsoft.graph.Json"
  },
  "columnCount": "Integer",
  "formulas": {
    "@odata.type": "microsoft.graph.Json"
  },
  "formulasLocal": {
    "@odata.type": "microsoft.graph.Json"
  },
  "formulasR1C1": {
    "@odata.type": "microsoft.graph.Json"
  },
  "index": "Integer",
  "numberFormat": {
    "@odata.type": "microsoft.graph.Json"
  },
  "rowCount": "Integer",
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
  "@odata.type": "#microsoft.graph.workbookRangeView",
  "id": "9b77af7b-af7b-9b77-7baf-779b7baf779b",
  "cellAddresses": {
    "@odata.type": "microsoft.graph.Json"
  },
  "columnCount": "Integer",
  "formulas": {
    "@odata.type": "microsoft.graph.Json"
  },
  "formulasLocal": {
    "@odata.type": "microsoft.graph.Json"
  },
  "formulasR1C1": {
    "@odata.type": "microsoft.graph.Json"
  },
  "index": "Integer",
  "numberFormat": {
    "@odata.type": "microsoft.graph.Json"
  },
  "rowCount": "Integer",
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


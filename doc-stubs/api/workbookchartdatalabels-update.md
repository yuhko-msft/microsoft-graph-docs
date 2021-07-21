---
title: "Update workbookChartDataLabels"
description: "Update the properties of a workbookChartDataLabels object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update workbookChartDataLabels
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of a [workbookChartDataLabels](../resources/workbookchartdatalabels.md) object.

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
PATCH /workbooks/{workbooksId}/workbook/names/{workbookNamedItemId}/worksheet/charts/{workbookChartId}/dataLabels
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [workbookChartDataLabels](../resources/workbookchartdatalabels.md) object.

The following table shows the properties that are required when you update the [workbookChartDataLabels](../resources/workbookchartdatalabels.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|position|String|**TODO: Add Description**|
|separator|String|**TODO: Add Description**|
|showBubbleSize|Boolean|**TODO: Add Description**|
|showCategoryName|Boolean|**TODO: Add Description**|
|showLegendKey|Boolean|**TODO: Add Description**|
|showPercentage|Boolean|**TODO: Add Description**|
|showSeriesName|Boolean|**TODO: Add Description**|
|showValue|Boolean|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [workbookChartDataLabels](../resources/workbookchartdatalabels.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_workbookchartdatalabels"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/workbooks/{workbooksId}/workbook/names/{workbookNamedItemId}/worksheet/charts/{workbookChartId}/dataLabels
Content-Type: application/json
Content-length: 304

{
  "@odata.type": "#microsoft.graph.workbookChartDataLabels",
  "position": "String",
  "separator": "String",
  "showBubbleSize": "Boolean",
  "showCategoryName": "Boolean",
  "showLegendKey": "Boolean",
  "showPercentage": "Boolean",
  "showSeriesName": "Boolean",
  "showValue": "Boolean"
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
  "@odata.type": "#microsoft.graph.workbookChartDataLabels",
  "id": "2ebd4ba2-4ba2-2ebd-a24b-bd2ea24bbd2e",
  "position": "String",
  "separator": "String",
  "showBubbleSize": "Boolean",
  "showCategoryName": "Boolean",
  "showLegendKey": "Boolean",
  "showPercentage": "Boolean",
  "showSeriesName": "Boolean",
  "showValue": "Boolean"
}
```


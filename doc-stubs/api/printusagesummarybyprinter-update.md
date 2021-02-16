---
title: "Update PrintUsageSummaryByPrinter"
description: "Update the properties of a PrintUsageSummaryByPrinter object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update PrintUsageSummaryByPrinter
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of a [PrintUsageSummaryByPrinter](../resources/printusagesummarybyprinter.md) object.

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
PATCH /reports/dailyPrintUsageSummariesByPrinter/{PrintUsageSummaryByPrinterId}
PATCH /reports/monthlyPrintUsageSummariesByPrinter/{PrintUsageSummaryByPrinterId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [PrintUsageSummaryByPrinter](../resources/printusagesummarybyprinter.md) object.

The following table shows the properties that are required when you update the [PrintUsageSummaryByPrinter](../resources/printusagesummarybyprinter.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|printerId|String|**TODO: Add Description**|
|usageDate|Date|**TODO: Add Description**|
|completedBlackAndWhiteJobCount|Int64|**TODO: Add Description**|
|completedColorJobCount|Int64|**TODO: Add Description**|
|incompleteJobCount|Int64|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [PrintUsageSummaryByPrinter](../resources/printusagesummarybyprinter.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_printusagesummarybyprinter"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/reports/dailyPrintUsageSummariesByPrinter/{PrintUsageSummaryByPrinterId}
Content-Type: application/json
Content-length: 242

{
  "@odata.type": "#microsoft.graph.PrintUsageSummaryByPrinter",
  "printerId": "String",
  "usageDate": "Date",
  "completedBlackAndWhiteJobCount": "Integer",
  "completedColorJobCount": "Integer",
  "incompleteJobCount": "Integer"
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
  "@odata.type": "#microsoft.graph.PrintUsageSummaryByPrinter",
  "id": "23573108-3108-2357-0831-572308315723",
  "printerId": "String",
  "usageDate": "Date",
  "completedBlackAndWhiteJobCount": "Integer",
  "completedColorJobCount": "Integer",
  "incompleteJobCount": "Integer"
}
```


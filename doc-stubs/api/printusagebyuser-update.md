---
title: "Update printUsageByUser"
description: "Update the properties of a printUsageByUser object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update printUsageByUser
Namespace: microsoft.graph



Update the properties of a [printUsageByUser](../resources/printusagebyuser.md) object.

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
PATCH /print/reports/dailyPrintUsageByUser/{printUsageByUserId}
PATCH /print/reports/monthlyPrintUsageByUser/{printUsageByUserId}
PATCH /print/reports/dailyPrintUsageSummariesByUser/{printUsageByUserId}
PATCH /print/reports/monthlyPrintUsageSummariesByUser/{printUsageByUserId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [printUsageByUser](../resources/printusagebyuser.md) object.

The following table shows the properties that are required when you update the [printUsageByUser](../resources/printusagebyuser.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|completedBlackAndWhiteJobCount|Int64|**TODO: Add Description** Inherited from [printUsage](../resources/printusage.md)|
|completedColorJobCount|Int64|**TODO: Add Description** Inherited from [printUsage](../resources/printusage.md)|
|incompleteJobCount|Int64|**TODO: Add Description** Inherited from [printUsage](../resources/printusage.md)|
|usageDate|Date|**TODO: Add Description** Inherited from [printUsage](../resources/printusage.md)|
|userPrincipalName|String|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [printUsageByUser](../resources/printusagebyuser.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_printusagebyuser"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/print/reports/dailyPrintUsageByUser/{printUsageByUserId}
Content-Type: application/json
Content-length: 240

{
  "@odata.type": "#microsoft.graph.printUsageByUser",
  "completedBlackAndWhiteJobCount": "Integer",
  "completedColorJobCount": "Integer",
  "incompleteJobCount": "Integer",
  "usageDate": "Date",
  "userPrincipalName": "String"
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
  "@odata.type": "#microsoft.graph.printUsageByUser",
  "id": "0201f188-f188-0201-88f1-010288f10102",
  "completedBlackAndWhiteJobCount": "Integer",
  "completedColorJobCount": "Integer",
  "incompleteJobCount": "Integer",
  "usageDate": "Date",
  "userPrincipalName": "String"
}
```


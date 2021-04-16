---
title: "reportRoot: getOffice365ServicesUserCounts"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# reportRoot: getOffice365ServicesUserCounts
Namespace: microsoft.graph



**TODO: Add Description**

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
GET /reports/getOffice365ServicesUserCounts
GET /print/reports/getOffice365ServicesUserCounts
```

## Function parameters
In the request URL, provide the following query parameters with values.
The following table shows the parameters that can be used with this function.

|Parameter|Type|Description|
|:---|:---|:---|
|period|String|**TODO: Add Description**|


## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|

## Request body
Do not supply a request body for this method.

## Response

If successful, this function returns a `200 OK` response code and a [office365ServicesUserCounts](../resources/office365servicesusercounts.md) collection in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "reportroot_getoffice365servicesusercounts"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/reports/getOffice365ServicesUserCounts(period='parameterValue')
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.office365ServicesUserCounts)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
    {
      "@odata.type": "#microsoft.graph.office365ServicesUserCounts",
      "id": "String (identifier)",
      "exchangeActive": "Integer",
      "exchangeInactive": "Integer",
      "office365Active": "Integer",
      "office365Inactive": "Integer",
      "oneDriveActive": "Integer",
      "oneDriveInactive": "Integer",
      "reportPeriod": "String",
      "reportRefreshDate": "Date",
      "sharePointActive": "Integer",
      "sharePointInactive": "Integer",
      "skypeForBusinessActive": "Integer",
      "skypeForBusinessInactive": "Integer",
      "teamsActive": "Integer",
      "teamsInactive": "Integer",
      "yammerActive": "Integer",
      "yammerInactive": "Integer"
    }
  ]
}
```


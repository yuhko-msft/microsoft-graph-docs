---
title: "Get office365ServicesUserCounts"
description: "Read the properties and relationships of an office365ServicesUserCounts object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get office365ServicesUserCounts
Namespace: microsoft.graph



Read the properties and relationships of an [office365ServicesUserCounts](../resources/office365servicesusercounts.md) object.

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
GET /office365ServicesUserCounts
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

If successful, this method returns a `200 OK` response code and an [office365ServicesUserCounts](../resources/office365servicesusercounts.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_office365servicesusercounts"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/office365ServicesUserCounts
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.office365ServicesUserCounts"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.office365ServicesUserCounts",
    "id": "df5d22c4-22c4-df5d-c422-5ddfc4225ddf",
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
}
```


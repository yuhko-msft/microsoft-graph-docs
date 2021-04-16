---
title: "Update office365ServicesUserCounts"
description: "Update the properties of an office365ServicesUserCounts object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update office365ServicesUserCounts
Namespace: microsoft.graph



Update the properties of an [office365ServicesUserCounts](../resources/office365servicesusercounts.md) object.

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
PATCH /office365ServicesUserCounts
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [office365ServicesUserCounts](../resources/office365servicesusercounts.md) object.

The following table shows the properties that are required when you update the [office365ServicesUserCounts](../resources/office365servicesusercounts.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|exchangeActive|Int64|**TODO: Add Description**|
|exchangeInactive|Int64|**TODO: Add Description**|
|office365Active|Int64|**TODO: Add Description**|
|office365Inactive|Int64|**TODO: Add Description**|
|oneDriveActive|Int64|**TODO: Add Description**|
|oneDriveInactive|Int64|**TODO: Add Description**|
|reportPeriod|String|**TODO: Add Description**|
|reportRefreshDate|Date|**TODO: Add Description**|
|sharePointActive|Int64|**TODO: Add Description**|
|sharePointInactive|Int64|**TODO: Add Description**|
|skypeForBusinessActive|Int64|**TODO: Add Description**|
|skypeForBusinessInactive|Int64|**TODO: Add Description**|
|teamsActive|Int64|**TODO: Add Description**|
|teamsInactive|Int64|**TODO: Add Description**|
|yammerActive|Int64|**TODO: Add Description**|
|yammerInactive|Int64|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [office365ServicesUserCounts](../resources/office365servicesusercounts.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_office365servicesusercounts"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/office365ServicesUserCounts
Content-Type: application/json
Content-length: 604

{
  "@odata.type": "#microsoft.graph.office365ServicesUserCounts",
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
```


---
title: "Update emailAppUsageVersionsUserCounts"
description: "Update the properties of an emailAppUsageVersionsUserCounts object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update emailAppUsageVersionsUserCounts
Namespace: microsoft.graph



Update the properties of an [emailAppUsageVersionsUserCounts](../resources/emailappusageversionsusercounts.md) object.

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
PATCH /emailAppUsageVersionsUserCounts
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [emailAppUsageVersionsUserCounts](../resources/emailappusageversionsusercounts.md) object.

The following table shows the properties that are required when you update the [emailAppUsageVersionsUserCounts](../resources/emailappusageversionsusercounts.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|outlook2007|Int64|**TODO: Add Description**|
|outlook2010|Int64|**TODO: Add Description**|
|outlook2013|Int64|**TODO: Add Description**|
|outlook2016|Int64|**TODO: Add Description**|
|outlook2019|Int64|**TODO: Add Description**|
|outlookM365|Int64|**TODO: Add Description**|
|reportPeriod|String|**TODO: Add Description**|
|reportRefreshDate|Date|**TODO: Add Description**|
|undetermined|Int64|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [emailAppUsageVersionsUserCounts](../resources/emailappusageversionsusercounts.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_emailappusageversionsusercounts"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/emailAppUsageVersionsUserCounts
Content-Type: application/json
Content-length: 338

{
  "@odata.type": "#microsoft.graph.emailAppUsageVersionsUserCounts",
  "outlook2007": "Integer",
  "outlook2010": "Integer",
  "outlook2013": "Integer",
  "outlook2016": "Integer",
  "outlook2019": "Integer",
  "outlookM365": "Integer",
  "reportPeriod": "String",
  "reportRefreshDate": "Date",
  "undetermined": "Integer"
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
  "@odata.type": "#microsoft.graph.emailAppUsageVersionsUserCounts",
  "id": "90eed350-d350-90ee-50d3-ee9050d3ee90",
  "outlook2007": "Integer",
  "outlook2010": "Integer",
  "outlook2013": "Integer",
  "outlook2016": "Integer",
  "outlook2019": "Integer",
  "outlookM365": "Integer",
  "reportPeriod": "String",
  "reportRefreshDate": "Date",
  "undetermined": "Integer"
}
```


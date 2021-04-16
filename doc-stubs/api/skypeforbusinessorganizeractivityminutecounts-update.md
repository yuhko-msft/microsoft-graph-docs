---
title: "Update skypeForBusinessOrganizerActivityMinuteCounts"
description: "Update the properties of a skypeForBusinessOrganizerActivityMinuteCounts object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update skypeForBusinessOrganizerActivityMinuteCounts
Namespace: microsoft.graph



Update the properties of a [skypeForBusinessOrganizerActivityMinuteCounts](../resources/skypeforbusinessorganizeractivityminutecounts.md) object.

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
PATCH /skypeForBusinessOrganizerActivityMinuteCounts
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [skypeForBusinessOrganizerActivityMinuteCounts](../resources/skypeforbusinessorganizeractivityminutecounts.md) object.

The following table shows the properties that are required when you update the [skypeForBusinessOrganizerActivityMinuteCounts](../resources/skypeforbusinessorganizeractivityminutecounts.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|audioVideo|Int64|**TODO: Add Description**|
|dialInMicrosoft|Int64|**TODO: Add Description**|
|dialOutMicrosoft|Int64|**TODO: Add Description**|
|reportDate|Date|**TODO: Add Description**|
|reportPeriod|String|**TODO: Add Description**|
|reportRefreshDate|Date|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [skypeForBusinessOrganizerActivityMinuteCounts](../resources/skypeforbusinessorganizeractivityminutecounts.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_skypeforbusinessorganizeractivityminutecounts"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/skypeForBusinessOrganizerActivityMinuteCounts
Content-Type: application/json
Content-length: 268

{
  "@odata.type": "#microsoft.graph.skypeForBusinessOrganizerActivityMinuteCounts",
  "audioVideo": "Integer",
  "dialInMicrosoft": "Integer",
  "dialOutMicrosoft": "Integer",
  "reportDate": "Date",
  "reportPeriod": "String",
  "reportRefreshDate": "Date"
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
  "@odata.type": "#microsoft.graph.skypeForBusinessOrganizerActivityMinuteCounts",
  "id": "b9e2283d-283d-b9e2-3d28-e2b93d28e2b9",
  "audioVideo": "Integer",
  "dialInMicrosoft": "Integer",
  "dialOutMicrosoft": "Integer",
  "reportDate": "Date",
  "reportPeriod": "String",
  "reportRefreshDate": "Date"
}
```


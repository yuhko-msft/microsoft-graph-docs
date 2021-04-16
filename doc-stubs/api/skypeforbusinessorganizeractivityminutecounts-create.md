---
title: "Create skypeForBusinessOrganizerActivityMinuteCounts"
description: "Create a new skypeForBusinessOrganizerActivityMinuteCounts object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create skypeForBusinessOrganizerActivityMinuteCounts
Namespace: microsoft.graph



Create a new [skypeForBusinessOrganizerActivityMinuteCounts](../resources/skypeforbusinessorganizeractivityminutecounts.md) object.

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
POST ** Collection URI for microsoft.graph.skypeForBusinessOrganizerActivityMinuteCounts not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [skypeForBusinessOrganizerActivityMinuteCounts](../resources/skypeforbusinessorganizeractivityminutecounts.md) object.

The following table shows the properties that are required when you create the [skypeForBusinessOrganizerActivityMinuteCounts](../resources/skypeforbusinessorganizeractivityminutecounts.md).

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

If successful, this method returns a `201 Created` response code and a [skypeForBusinessOrganizerActivityMinuteCounts](../resources/skypeforbusinessorganizeractivityminutecounts.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_skypeforbusinessorganizeractivityminutecounts_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0** Collection URI for microsoft.graph.skypeForBusinessOrganizerActivityMinuteCounts not found
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
  "truncated": true,
  "@odata.type": "microsoft.graph.skypeForBusinessOrganizerActivityMinuteCounts"
}
-->
``` http
HTTP/1.1 201 Created
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


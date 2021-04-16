---
title: "Update skypeForBusinessOrganizerActivityUserCounts"
description: "Update the properties of a skypeForBusinessOrganizerActivityUserCounts object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update skypeForBusinessOrganizerActivityUserCounts
Namespace: microsoft.graph



Update the properties of a [skypeForBusinessOrganizerActivityUserCounts](../resources/skypeforbusinessorganizeractivityusercounts.md) object.

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
PATCH /skypeForBusinessOrganizerActivityUserCounts
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [skypeForBusinessOrganizerActivityUserCounts](../resources/skypeforbusinessorganizeractivityusercounts.md) object.

The following table shows the properties that are required when you update the [skypeForBusinessOrganizerActivityUserCounts](../resources/skypeforbusinessorganizeractivityusercounts.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|appSharing|Int64|**TODO: Add Description**|
|audioVideo|Int64|**TODO: Add Description**|
|dialInOut3rdParty|Int64|**TODO: Add Description**|
|dialInOutMicrosoft|Int64|**TODO: Add Description**|
|im|Int64|**TODO: Add Description**|
|reportDate|Date|**TODO: Add Description**|
|reportPeriod|String|**TODO: Add Description**|
|reportRefreshDate|Date|**TODO: Add Description**|
|web|Int64|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [skypeForBusinessOrganizerActivityUserCounts](../resources/skypeforbusinessorganizeractivityusercounts.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_skypeforbusinessorganizeractivityusercounts"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/skypeForBusinessOrganizerActivityUserCounts
Content-Type: application/json
Content-length: 339

{
  "@odata.type": "#microsoft.graph.skypeForBusinessOrganizerActivityUserCounts",
  "appSharing": "Integer",
  "audioVideo": "Integer",
  "dialInOut3rdParty": "Integer",
  "dialInOutMicrosoft": "Integer",
  "im": "Integer",
  "reportDate": "Date",
  "reportPeriod": "String",
  "reportRefreshDate": "Date",
  "web": "Integer"
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
  "@odata.type": "#microsoft.graph.skypeForBusinessOrganizerActivityUserCounts",
  "id": "3090357e-357e-3090-7e35-90307e359030",
  "appSharing": "Integer",
  "audioVideo": "Integer",
  "dialInOut3rdParty": "Integer",
  "dialInOutMicrosoft": "Integer",
  "im": "Integer",
  "reportDate": "Date",
  "reportPeriod": "String",
  "reportRefreshDate": "Date",
  "web": "Integer"
}
```


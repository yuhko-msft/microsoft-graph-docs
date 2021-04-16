---
title: "Update skypeForBusinessPeerToPeerActivityMinuteCounts"
description: "Update the properties of a skypeForBusinessPeerToPeerActivityMinuteCounts object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update skypeForBusinessPeerToPeerActivityMinuteCounts
Namespace: microsoft.graph



Update the properties of a [skypeForBusinessPeerToPeerActivityMinuteCounts](../resources/skypeforbusinesspeertopeeractivityminutecounts.md) object.

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
PATCH /skypeForBusinessPeerToPeerActivityMinuteCounts
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [skypeForBusinessPeerToPeerActivityMinuteCounts](../resources/skypeforbusinesspeertopeeractivityminutecounts.md) object.

The following table shows the properties that are required when you update the [skypeForBusinessPeerToPeerActivityMinuteCounts](../resources/skypeforbusinesspeertopeeractivityminutecounts.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|audio|Int64|**TODO: Add Description**|
|reportDate|Date|**TODO: Add Description**|
|reportPeriod|String|**TODO: Add Description**|
|reportRefreshDate|Date|**TODO: Add Description**|
|video|Int64|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [skypeForBusinessPeerToPeerActivityMinuteCounts](../resources/skypeforbusinesspeertopeeractivityminutecounts.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_skypeforbusinesspeertopeeractivityminutecounts"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/skypeForBusinessPeerToPeerActivityMinuteCounts
Content-Type: application/json
Content-length: 220

{
  "@odata.type": "#microsoft.graph.skypeForBusinessPeerToPeerActivityMinuteCounts",
  "audio": "Integer",
  "reportDate": "Date",
  "reportPeriod": "String",
  "reportRefreshDate": "Date",
  "video": "Integer"
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
  "@odata.type": "#microsoft.graph.skypeForBusinessPeerToPeerActivityMinuteCounts",
  "id": "393bd9cb-d9cb-393b-cbd9-3b39cbd93b39",
  "audio": "Integer",
  "reportDate": "Date",
  "reportPeriod": "String",
  "reportRefreshDate": "Date",
  "video": "Integer"
}
```


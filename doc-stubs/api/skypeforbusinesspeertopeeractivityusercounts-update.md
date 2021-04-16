---
title: "Update skypeForBusinessPeerToPeerActivityUserCounts"
description: "Update the properties of a skypeForBusinessPeerToPeerActivityUserCounts object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update skypeForBusinessPeerToPeerActivityUserCounts
Namespace: microsoft.graph



Update the properties of a [skypeForBusinessPeerToPeerActivityUserCounts](../resources/skypeforbusinesspeertopeeractivityusercounts.md) object.

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
PATCH /skypeForBusinessPeerToPeerActivityUserCounts
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [skypeForBusinessPeerToPeerActivityUserCounts](../resources/skypeforbusinesspeertopeeractivityusercounts.md) object.

The following table shows the properties that are required when you update the [skypeForBusinessPeerToPeerActivityUserCounts](../resources/skypeforbusinesspeertopeeractivityusercounts.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|appSharing|Int64|**TODO: Add Description**|
|audio|Int64|**TODO: Add Description**|
|fileTransfer|Int64|**TODO: Add Description**|
|im|Int64|**TODO: Add Description**|
|reportDate|Date|**TODO: Add Description**|
|reportPeriod|String|**TODO: Add Description**|
|reportRefreshDate|Date|**TODO: Add Description**|
|video|Int64|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [skypeForBusinessPeerToPeerActivityUserCounts](../resources/skypeforbusinesspeertopeeractivityusercounts.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_skypeforbusinesspeertopeeractivityusercounts"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/skypeForBusinessPeerToPeerActivityUserCounts
Content-Type: application/json
Content-length: 296

{
  "@odata.type": "#microsoft.graph.skypeForBusinessPeerToPeerActivityUserCounts",
  "appSharing": "Integer",
  "audio": "Integer",
  "fileTransfer": "Integer",
  "im": "Integer",
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
  "@odata.type": "#microsoft.graph.skypeForBusinessPeerToPeerActivityUserCounts",
  "id": "7269da67-da67-7269-67da-697267da6972",
  "appSharing": "Integer",
  "audio": "Integer",
  "fileTransfer": "Integer",
  "im": "Integer",
  "reportDate": "Date",
  "reportPeriod": "String",
  "reportRefreshDate": "Date",
  "video": "Integer"
}
```


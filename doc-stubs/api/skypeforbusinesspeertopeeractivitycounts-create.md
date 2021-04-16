---
title: "Create skypeForBusinessPeerToPeerActivityCounts"
description: "Create a new skypeForBusinessPeerToPeerActivityCounts object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create skypeForBusinessPeerToPeerActivityCounts
Namespace: microsoft.graph



Create a new [skypeForBusinessPeerToPeerActivityCounts](../resources/skypeforbusinesspeertopeeractivitycounts.md) object.

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
POST ** Collection URI for microsoft.graph.skypeForBusinessPeerToPeerActivityCounts not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [skypeForBusinessPeerToPeerActivityCounts](../resources/skypeforbusinesspeertopeeractivitycounts.md) object.

The following table shows the properties that are required when you create the [skypeForBusinessPeerToPeerActivityCounts](../resources/skypeforbusinesspeertopeeractivitycounts.md).

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

If successful, this method returns a `201 Created` response code and a [skypeForBusinessPeerToPeerActivityCounts](../resources/skypeforbusinesspeertopeeractivitycounts.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_skypeforbusinesspeertopeeractivitycounts_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0** Collection URI for microsoft.graph.skypeForBusinessPeerToPeerActivityCounts not found
Content-Type: application/json
Content-length: 292

{
  "@odata.type": "#microsoft.graph.skypeForBusinessPeerToPeerActivityCounts",
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
  "truncated": true,
  "@odata.type": "microsoft.graph.skypeForBusinessPeerToPeerActivityCounts"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.skypeForBusinessPeerToPeerActivityCounts",
  "id": "1640e8c9-e8c9-1640-c9e8-4016c9e84016",
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


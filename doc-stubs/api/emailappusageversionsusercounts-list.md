---
title: "List emailAppUsageVersionsUserCounts"
description: "Get a list of the emailAppUsageVersionsUserCounts objects and their properties."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List emailAppUsageVersionsUserCounts
Namespace: microsoft.graph

Get a list of the [emailAppUsageVersionsUserCounts](../resources/emailappusageversionsusercounts.md) objects and their properties.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from most to least privileged)|
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
GET ** Collection URI for microsoft.graph.emailAppUsageVersionsUserCounts not found
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

If successful, this method returns a `200 OK` response code and a collection of [emailAppUsageVersionsUserCounts](../resources/emailappusageversionsusercounts.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_emailappusageversionsusercounts"
}
-->
``` http
GET https://graph.microsoft.com/beta** Collection URI for microsoft.graph.emailAppUsageVersionsUserCounts not found
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.emailAppUsageVersionsUserCounts)"
}
-->
``` http
HTTP/1.1 200 OK

Content-Type: application/json
{
  "value": [
    {
      "@odata.type": "#microsoft.graph.emailAppUsageVersionsUserCounts",
      "reportRefreshDate": "Date",
      "outlook2016": "Integer",
      "outlook2013": "Integer",
      "outlook2010": "Integer",
      "outlook2007": "Integer",
      "undetermined": "Integer",
      "reportPeriod": "String",
      "outlookM365": "Integer",
      "outlook2019": "Integer"
    }
  ]
}
```


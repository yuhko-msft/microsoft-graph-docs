---
title: "List incomingFileFlows"
description: "Get a list of the incomingFileFlow objects and their properties."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List incomingFileFlows
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Get a list of the [incomingFileFlow](../resources/incomingfileflow.md) objects and their properties.

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
GET ** Collection URI for microsoft.industryData.incomingFileFlow not found
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

If successful, this method returns a `200 OK` response code and a collection of [incomingFileFlow](../resources/incomingfileflow.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "list_incomingfileflow"
}
-->
``` http
GET https://graph.microsoft.com/beta** Collection URI for microsoft.industryData.incomingFileFlow not found
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.industryData.incomingFileFlow)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
    {
      "@odata.type": "#microsoft.industryData.incomingFileFlow",
      "id": "0d0ce033-e033-0d0c-33e0-0c0d33e00c0d",
      "eTag": "String",
      "displayName": "String",
      "readinessStatus": "String",
      "dataDomain": "String",
      "recurrenceEffectiveDateTime": "String (timestamp)",
      "recurrenceExpirationDateTime": "String (timestamp)"
    }
  ]
}
```


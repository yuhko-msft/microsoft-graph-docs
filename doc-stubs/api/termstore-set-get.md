---
title: "Get set"
description: "Read the properties and relationships of a set object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get set
Namespace: microsoft.graph.termStore



Read the properties and relationships of a [set](../resources/termstore-set.md) object.

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
GET /sites/{sitesId}/termStore/sets/{setId}
GET /sites/{sitesId}/termStore/groups/{groupId}/sets/{setId}
GET /sites/{sitesId}/termStore/groups/{groupId}/sets/{setId}/children/{termId}/set
GET /sites/{sitesId}/termStore/groups/{groupId}/sets/{setId}/children/{termId}/relations/{relationId}/set
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

If successful, this method returns a `200 OK` response code and a [set](../resources/termstore-set.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_set"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/sites/{sitesId}/termStore/sets/{setId}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.termStore.set"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.termStore.set",
    "id": "0a4f383b-383b-0a4f-3b38-4f0a3b384f0a",
    "createdDateTime": "String (timestamp)",
    "description": "String",
    "localizedNames": [
      {
        "@odata.type": "microsoft.graph.termStore.localizedName"
      }
    ],
    "properties": [
      {
        "@odata.type": "microsoft.graph.keyValue"
      }
    ]
  }
}
```


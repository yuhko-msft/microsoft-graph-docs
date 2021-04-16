---
title: "List term"
description: "Get the term resources from the toTerm navigation property."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List term
Namespace: microsoft.graph.termStore



Get the term resources from the toTerm navigation property.

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
GET /sites/{sitesId}/termStore/groups/{groupId}/sets/{setId}/children/{termId}/relations/{relationId}/toTerm
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

If successful, this method returns a `200 OK` response code and a collection of [term](../resources/term.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "list_term"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/sites/{sitesId}/termStore/groups/{groupId}/sets/{setId}/children/{termId}/relations/{relationId}/toTerm
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.termStore.term)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
    {
      "@odata.type": "#microsoft.graph.termStore.term",
      "id": "1aa7003a-003a-1aa7-3a00-a71a3a00a71a",
      "createdDateTime": "String (timestamp)",
      "descriptions": [
        {
          "@odata.type": "microsoft.graph.termStore.localizedDescription"
        }
      ],
      "labels": [
        {
          "@odata.type": "microsoft.graph.termStore.localizedLabel"
        }
      ],
      "lastModifiedDateTime": "String (timestamp)",
      "properties": [
        {
          "@odata.type": "microsoft.graph.keyValue"
        }
      ]
    }
  ]
}
```


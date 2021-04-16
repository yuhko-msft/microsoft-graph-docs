---
title: "List interests"
description: "Get the personInterest resources from the interests navigation property."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List interests
Namespace: microsoft.graph



Get the personInterest resources from the interests navigation property.

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
GET /users/{usersId}/profile/interests
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

If successful, this method returns a `200 OK` response code and a collection of [personInterest](../resources/personinterest.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "list_personinterest"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/users/{usersId}/profile/interests
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.personInterest)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
    {
      "@odata.type": "#microsoft.graph.personInterest",
      "id": "bd23d43d-d43d-bd23-3dd4-23bd3dd423bd",
      "allowedAudiences": "String",
      "createdBy": {
        "@odata.type": "microsoft.graph.identitySet"
      },
      "createdDateTime": "String (timestamp)",
      "inference": {
        "@odata.type": "microsoft.graph.inferenceData"
      },
      "isSearchable": "Boolean",
      "lastModifiedBy": {
        "@odata.type": "microsoft.graph.identitySet"
      },
      "lastModifiedDateTime": "String (timestamp)",
      "source": {
        "@odata.type": "microsoft.graph.personDataSources"
      },
      "categories": [
        "String"
      ],
      "collaborationTags": [
        "String"
      ],
      "description": "String",
      "displayName": "String",
      "thumbnailUrl": "String",
      "webUrl": "String"
    }
  ]
}
```


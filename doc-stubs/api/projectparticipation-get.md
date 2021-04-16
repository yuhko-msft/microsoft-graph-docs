---
title: "Get projectParticipation"
description: "Read the properties and relationships of a projectParticipation object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get projectParticipation
Namespace: microsoft.graph



Read the properties and relationships of a [projectParticipation](../resources/projectparticipation.md) object.

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
GET /me/profile/projects/{projectParticipationId}
GET /users/{usersId}/profile/projects/{projectParticipationId}
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

If successful, this method returns a `200 OK` response code and a [projectParticipation](../resources/projectparticipation.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_projectparticipation"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/me/profile/projects/{projectParticipationId}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.projectParticipation"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.projectParticipation",
    "id": "8cb8e3d7-e3d7-8cb8-d7e3-b88cd7e3b88c",
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
    "client": {
      "@odata.type": "microsoft.graph.companyDetail"
    },
    "collaborationTags": [
      "String"
    ],
    "colleagues": [
      {
        "@odata.type": "microsoft.graph.relatedPerson"
      }
    ],
    "detail": {
      "@odata.type": "microsoft.graph.positionDetail"
    },
    "displayName": "String",
    "sponsors": [
      {
        "@odata.type": "microsoft.graph.relatedPerson"
      }
    ],
    "thumbnailUrl": "String"
  }
}
```


---
title: "Get personCertification"
description: "Read the properties and relationships of a personCertification object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get personCertification
Namespace: microsoft.graph



Read the properties and relationships of a [personCertification](../resources/personcertification.md) object.

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
GET /me/profile/certifications/{personCertificationId}
GET /users/{usersId}/profile/certifications/{personCertificationId}
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

If successful, this method returns a `200 OK` response code and a [personCertification](../resources/personcertification.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_personcertification"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/me/profile/certifications/{personCertificationId}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.personCertification"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.personCertification",
    "id": "193d218f-218f-193d-8f21-3d198f213d19",
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
    "certificationId": "String",
    "description": "String",
    "displayName": "String",
    "endDate": "Date",
    "issuedDate": "Date",
    "issuingAuthority": "String",
    "issuingCompany": "String",
    "startDate": "Date",
    "thumbnailUrl": "String",
    "webUrl": "String"
  }
}
```


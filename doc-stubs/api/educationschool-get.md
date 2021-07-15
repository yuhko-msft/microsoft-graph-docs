---
title: "Get educationSchool"
description: "Read the properties and relationships of an educationSchool object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get educationSchool
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Read the properties and relationships of an [educationSchool](../resources/educationschool.md) object.

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
GET /education/schools/{educationSchoolId}
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

If successful, this method returns a `200 OK` response code and an [educationSchool](../resources/educationschool.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_educationschool"
}
-->
``` http
GET https://graph.microsoft.com/beta/education/schools/{educationSchoolId}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.educationSchool"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.educationSchool",
    "id": "1879cfd4-cfd4-1879-d4cf-7918d4cf7918",
    "description": "String",
    "displayName": "String",
    "externalSource": "String",
    "externalSourceDetail": "String",
    "address": {
      "@odata.type": "microsoft.graph.physicalAddress"
    },
    "createdBy": {
      "@odata.type": "microsoft.graph.identitySet"
    },
    "externalId": "String",
    "externalPrincipalId": "String",
    "fax": "String",
    "highestGrade": "String",
    "lowestGrade": "String",
    "phone": "String",
    "principalEmail": "String",
    "principalName": "String",
    "schoolNumber": "String"
  }
}
```


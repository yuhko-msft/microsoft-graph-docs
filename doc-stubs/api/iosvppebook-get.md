---
title: "Get iosVppEBook"
description: "Read the properties and relationships of an iosVppEBook object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get iosVppEBook
Namespace: microsoft.graph



Read the properties and relationships of an [iosVppEBook](../resources/iosvppebook.md) object.

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
GET ** Entity URI for microsoft.graph.iosVppEBook not found
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

If successful, this method returns a `200 OK` response code and an [iosVppEBook](../resources/iosvppebook.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_iosvppebook"
}
-->
``` http
GET https://graph.microsoft.com/v1.0** Entity URI for microsoft.graph.iosVppEBook not found
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.iosVppEBook"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.iosVppEBook",
    "id": "360fc3ab-c3ab-360f-abc3-0f36abc30f36",
    "createdDateTime": "String (timestamp)",
    "description": "String",
    "displayName": "String",
    "informationUrl": "String",
    "largeCover": {
      "@odata.type": "microsoft.graph.mimeContent"
    },
    "lastModifiedDateTime": "String (timestamp)",
    "privacyInformationUrl": "String",
    "publishedDateTime": "String (timestamp)",
    "publisher": "String",
    "appleId": "String",
    "genres": [
      "String"
    ],
    "language": "String",
    "roleScopeTagIds": [
      "String"
    ],
    "seller": "String",
    "totalLicenseCount": "Integer",
    "usedLicenseCount": "Integer",
    "vppOrganizationName": "String",
    "vppTokenId": "Guid"
  }
}
```


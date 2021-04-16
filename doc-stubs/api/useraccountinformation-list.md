---
title: "List userAccountInformations"
description: "Get a list of the userAccountInformation objects and their properties."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List userAccountInformations
Namespace: microsoft.graph



Get a list of the [userAccountInformation](../resources/useraccountinformation.md) objects and their properties.

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
GET /me/profile/account
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

If successful, this method returns a `200 OK` response code and a collection of [userAccountInformation](../resources/useraccountinformation.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "list_useraccountinformation"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/me/profile/account
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.userAccountInformation)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
    {
      "@odata.type": "#microsoft.graph.userAccountInformation",
      "id": "93c9c8ff-c8ff-93c9-ffc8-c993ffc8c993",
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
      "ageGroup": "String",
      "countryCode": "String",
      "preferredLanguageTag": {
        "@odata.type": "microsoft.graph.localeInfo"
      },
      "userPrincipalName": "String"
    }
  ]
}
```


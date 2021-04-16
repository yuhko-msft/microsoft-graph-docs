---
title: "List synchronizationProfiles"
description: "Get the educationSynchronizationProfile resources from the synchronizationProfiles navigation property."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List synchronizationProfiles
Namespace: microsoft.graph



Get the educationSynchronizationProfile resources from the synchronizationProfiles navigation property.

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
GET /education/synchronizationProfiles
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

If successful, this method returns a `200 OK` response code and a collection of [educationSynchronizationProfile](../resources/educationsynchronizationprofile.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "list_educationsynchronizationprofile"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/education/synchronizationProfiles
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.educationSynchronizationProfile)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
    {
      "@odata.type": "#microsoft.graph.educationSynchronizationProfile",
      "id": "85997b33-7b33-8599-337b-9985337b9985",
      "dataProvider": {
        "@odata.type": "microsoft.graph.educationSynchronizationDataProvider"
      },
      "displayName": "String",
      "expirationDate": "Date",
      "handleSpecialCharacterConstraint": "Boolean",
      "identitySynchronizationConfiguration": {
        "@odata.type": "microsoft.graph.educationIdentitySynchronizationConfiguration"
      },
      "licensesToAssign": [
        {
          "@odata.type": "microsoft.graph.educationSynchronizationLicenseAssignment"
        }
      ],
      "state": "String"
    }
  ]
}
```


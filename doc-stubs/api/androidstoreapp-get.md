---
title: "Get androidStoreApp"
description: "Read the properties and relationships of an androidStoreApp object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get androidStoreApp
Namespace: microsoft.graph

Read the properties and relationships of an [androidStoreApp](../resources/androidstoreapp.md) object.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from most to least privileged)|
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
GET ** Entity URI for microsoft.management.services.api.androidStoreApp not found
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

If successful, this method returns a `200 OK` response code and an [androidStoreApp](../resources/androidstoreapp.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_androidstoreapp"
}
-->
``` http
GET https://graph.microsoft.com/beta** Entity URI for microsoft.management.services.api.androidStoreApp not found
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.management.services.api.androidStoreApp"
}
-->
``` http
HTTP/1.1 200 OK

Content-Type: application/json
{
  "value": {
    "@odata.type": "#microsoft.management.services.api.androidStoreApp",
    "id": "b967ecca-ecca-b967-caec-67b9caec67b9",
    "displayName": "String",
    "description": "String",
    "publisher": "String",
    "largeIcon": {
      "@odata.type": "microsoft.graph.mimeContent"
    },
    "createdDateTime": "String (timestamp)",
    "lastModifiedDateTime": "String (timestamp)",
    "isFeatured": "Boolean",
    "privacyInformationUrl": "String",
    "informationUrl": "String",
    "owner": "String",
    "developer": "String",
    "notes": "String",
    "uploadState": "Integer",
    "publishingState": "String",
    "isAssigned": "Boolean",
    "roleScopeTagIds": [
      "String"
    ],
    "dependentAppCount": "Integer",
    "supersedingAppCount": "Integer",
    "supersededAppCount": "Integer",
    "packageId": "String",
    "appIdentifier": "String",
    "appStoreUrl": "String",
    "minimumSupportedOperatingSystem": {
      "@odata.type": "microsoft.graph.androidMinimumOperatingSystem"
    }
  }
}
```


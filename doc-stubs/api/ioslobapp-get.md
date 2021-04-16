---
title: "Get iosLobApp"
description: "Read the properties and relationships of an iosLobApp object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get iosLobApp
Namespace: microsoft.graph



Read the properties and relationships of an [iosLobApp](../resources/ioslobapp.md) object.

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
GET ** Entity URI for microsoft.graph.iosLobApp not found
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

If successful, this method returns a `200 OK` response code and an [iosLobApp](../resources/ioslobapp.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_ioslobapp"
}
-->
``` http
GET https://graph.microsoft.com/v1.0** Entity URI for microsoft.graph.iosLobApp not found
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.iosLobApp"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.iosLobApp",
    "id": "d3b2d573-d573-d3b2-73d5-b2d373d5b2d3",
    "createdDateTime": "String (timestamp)",
    "dependentAppCount": "Integer",
    "description": "String",
    "developer": "String",
    "displayName": "String",
    "informationUrl": "String",
    "isAssigned": "Boolean",
    "isFeatured": "Boolean",
    "largeIcon": {
      "@odata.type": "microsoft.graph.mimeContent"
    },
    "lastModifiedDateTime": "String (timestamp)",
    "notes": "String",
    "owner": "String",
    "privacyInformationUrl": "String",
    "publisher": "String",
    "publishingState": "String",
    "roleScopeTagIds": [
      "String"
    ],
    "supersededAppCount": "Integer",
    "supersedingAppCount": "Integer",
    "uploadState": "Integer",
    "committedContentVersion": "String",
    "fileName": "String",
    "size": "Integer",
    "applicableDeviceType": {
      "@odata.type": "microsoft.graph.iosDeviceType"
    },
    "buildNumber": "String",
    "bundleId": "String",
    "expirationDateTime": "String (timestamp)",
    "identityVersion": "String",
    "minimumSupportedOperatingSystem": {
      "@odata.type": "microsoft.graph.iosMinimumOperatingSystem"
    },
    "versionNumber": "String"
  }
}
```


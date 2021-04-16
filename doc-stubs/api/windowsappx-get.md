---
title: "Get windowsAppX"
description: "Read the properties and relationships of a windowsAppX object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get windowsAppX
Namespace: microsoft.graph



Read the properties and relationships of a [windowsAppX](../resources/windowsappx.md) object.

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
GET ** Entity URI for microsoft.graph.windowsAppX not found
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

If successful, this method returns a `200 OK` response code and a [windowsAppX](../resources/windowsappx.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_windowsappx"
}
-->
``` http
GET https://graph.microsoft.com/v1.0** Entity URI for microsoft.graph.windowsAppX not found
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.windowsAppX"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.windowsAppX",
    "id": "b0e4c120-c120-b0e4-20c1-e4b020c1e4b0",
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
    "applicableArchitectures": "String",
    "identityName": "String",
    "identityPublisherHash": "String",
    "identityResourceIdentifier": "String",
    "identityVersion": "String",
    "isBundle": "Boolean",
    "minimumSupportedOperatingSystem": {
      "@odata.type": "microsoft.graph.windowsMinimumOperatingSystem"
    }
  }
}
```


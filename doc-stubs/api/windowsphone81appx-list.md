---
title: "List windowsPhone81AppX"
description: "Get a list of the windowsPhone81AppX objects and their properties."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List windowsPhone81AppX
Namespace: microsoft.graph

Get a list of the [windowsPhone81AppX](../resources/windowsphone81appx.md) objects and their properties.

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
GET ** Collection URI for microsoft.management.services.api.windowsPhone81AppX not found
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

If successful, this method returns a `200 OK` response code and a collection of [windowsPhone81AppX](../resources/windowsphone81appx.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_windowsphone81appx"
}
-->
``` http
GET https://graph.microsoft.com/beta** Collection URI for microsoft.management.services.api.windowsPhone81AppX not found
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.management.services.api.windowsPhone81AppX)"
}
-->
``` http
HTTP/1.1 200 OK

Content-Type: application/json
{
  "value": [
    {
      "@odata.type": "#microsoft.management.services.api.windowsPhone81AppX",
      "id": "4bd9883a-883a-4bd9-3a88-d94b3a88d94b",
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
      "committedContentVersion": "String",
      "fileName": "String",
      "size": "Integer",
      "applicableArchitectures": "String",
      "identityName": "String",
      "identityPublisherHash": "String",
      "identityResourceIdentifier": "String",
      "minimumSupportedOperatingSystem": {
        "@odata.type": "microsoft.graph.windowsMinimumOperatingSystem"
      },
      "phoneProductIdentifier": "String",
      "phonePublisherId": "String",
      "identityVersion": "String"
    }
  ]
}
```


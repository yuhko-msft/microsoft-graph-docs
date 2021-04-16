---
title: "List windowsMobileMSIs"
description: "Get a list of the windowsMobileMSI objects and their properties."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List windowsMobileMSIs
Namespace: microsoft.graph



Get a list of the [windowsMobileMSI](../resources/windowsmobilemsi.md) objects and their properties.

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
GET ** Collection URI for microsoft.graph.windowsMobileMSI not found
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

If successful, this method returns a `200 OK` response code and a collection of [windowsMobileMSI](../resources/windowsmobilemsi.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "list_windowsmobilemsi"
}
-->
``` http
GET https://graph.microsoft.com/v1.0** Collection URI for microsoft.graph.windowsMobileMSI not found
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.windowsMobileMSI)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
    {
      "@odata.type": "#microsoft.graph.windowsMobileMSI",
      "id": "c5a2a3e1-a3e1-c5a2-e1a3-a2c5e1a3a2c5",
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
      "commandLine": "String",
      "identityVersion": "String",
      "ignoreVersionDetection": "Boolean",
      "productCode": "String",
      "productVersion": "String",
      "useDeviceContext": "Boolean"
    }
  ]
}
```


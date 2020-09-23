---
title: "Get webApp"
description: "Read the properties and relationships of a webApp object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get webApp
Namespace: microsoft.graph

Read the properties and relationships of a [webApp](../resources/webapp.md) object.

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
GET ** Entity URI for microsoft.management.services.api.webApp not found
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

If successful, this method returns a `200 OK` response code and a [webApp](../resources/webapp.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_webapp"
}
-->
``` http
GET https://graph.microsoft.com/beta** Entity URI for microsoft.management.services.api.webApp not found
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.management.services.api.webApp"
}
-->
``` http
HTTP/1.1 200 OK

Content-Type: application/json
{
  "value": {
    "@odata.type": "#microsoft.management.services.api.webApp",
    "id": "cf4efd74-fd74-cf4e-74fd-4ecf74fd4ecf",
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
    "appUrl": "String",
    "useManagedBrowser": "Boolean"
  }
}
```


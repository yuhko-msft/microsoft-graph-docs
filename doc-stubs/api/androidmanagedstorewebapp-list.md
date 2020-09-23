---
title: "List androidManagedStoreWebApps"
description: "Get a list of the androidManagedStoreWebApp objects and their properties."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List androidManagedStoreWebApps
Namespace: microsoft.graph

Get a list of the [androidManagedStoreWebApp](../resources/androidmanagedstorewebapp.md) objects and their properties.

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
GET ** Collection URI for microsoft.management.services.api.androidManagedStoreWebApp not found
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

If successful, this method returns a `200 OK` response code and a collection of [androidManagedStoreWebApp](../resources/androidmanagedstorewebapp.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_androidmanagedstorewebapp"
}
-->
``` http
GET https://graph.microsoft.com/beta** Collection URI for microsoft.management.services.api.androidManagedStoreWebApp not found
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.management.services.api.androidManagedStoreWebApp)"
}
-->
``` http
HTTP/1.1 200 OK

Content-Type: application/json
{
  "value": [
    {
      "@odata.type": "#microsoft.management.services.api.androidManagedStoreWebApp",
      "id": "6178e2bf-e2bf-6178-bfe2-7861bfe27861",
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
      "usedLicenseCount": "Integer",
      "totalLicenseCount": "Integer",
      "appStoreUrl": "String",
      "isPrivate": "Boolean",
      "isSystemApp": "Boolean",
      "appTracks": [
        {
          "@odata.type": "microsoft.graph.androidManagedStoreAppTrack"
        }
      ],
      "supportsOemConfig": "Boolean"
    }
  ]
}
```


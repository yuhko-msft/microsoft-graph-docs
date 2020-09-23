---
title: "List macOsVppApps"
description: "Get a list of the macOsVppApp objects and their properties."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List macOsVppApps
Namespace: microsoft.graph

Get a list of the [macOsVppApp](../resources/macosvppapp.md) objects and their properties.

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
GET ** Collection URI for microsoft.management.services.api.macOsVppApp not found
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

If successful, this method returns a `200 OK` response code and a collection of [macOsVppApp](../resources/macosvppapp.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_macosvppapp"
}
-->
``` http
GET https://graph.microsoft.com/beta** Collection URI for microsoft.management.services.api.macOsVppApp not found
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.management.services.api.macOsVppApp)"
}
-->
``` http
HTTP/1.1 200 OK

Content-Type: application/json
{
  "value": [
    {
      "@odata.type": "#microsoft.management.services.api.macOsVppApp",
      "id": "d485accd-accd-d485-cdac-85d4cdac85d4",
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
      "usedLicenseCount": "Integer",
      "totalLicenseCount": "Integer",
      "releaseDateTime": "String (timestamp)",
      "appStoreUrl": "String",
      "licensingType": {
        "@odata.type": "microsoft.graph.vppLicensingType"
      },
      "vppTokenOrganizationName": "String",
      "vppTokenAccountType": "String",
      "vppTokenAppleId": "String",
      "bundleId": "String",
      "vppTokenId": "String",
      "revokeLicenseActionResults": [
        {
          "@odata.type": "microsoft.graph.macOsVppAppRevokeLicensesActionResult"
        }
      ]
    }
  ]
}
```


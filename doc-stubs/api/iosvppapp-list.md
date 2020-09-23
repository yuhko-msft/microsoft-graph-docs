---
title: "List iosVppApps"
description: "Get a list of the iosVppApp objects and their properties."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List iosVppApps
Namespace: microsoft.graph

Get a list of the [iosVppApp](../resources/iosvppapp.md) objects and their properties.

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
GET ** Collection URI for microsoft.management.services.api.iosVppApp not found
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

If successful, this method returns a `200 OK` response code and a collection of [iosVppApp](../resources/iosvppapp.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_iosvppapp"
}
-->
``` http
GET https://graph.microsoft.com/beta** Collection URI for microsoft.management.services.api.iosVppApp not found
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.management.services.api.iosVppApp)"
}
-->
``` http
HTTP/1.1 200 OK

Content-Type: application/json
{
  "value": [
    {
      "@odata.type": "#microsoft.management.services.api.iosVppApp",
      "id": "d9c9f1b4-f1b4-d9c9-b4f1-c9d9b4f1c9d9",
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
      "applicableDeviceType": {
        "@odata.type": "microsoft.graph.iosDeviceType"
      },
      "vppTokenOrganizationName": "String",
      "vppTokenAccountType": "String",
      "vppTokenAppleId": "String",
      "bundleId": "String",
      "vppTokenId": "String",
      "revokeLicenseActionResults": [
        {
          "@odata.type": "microsoft.graph.iosVppAppRevokeLicensesActionResult"
        }
      ]
    }
  ]
}
```


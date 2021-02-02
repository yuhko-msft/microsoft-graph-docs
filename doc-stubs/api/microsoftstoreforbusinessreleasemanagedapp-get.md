---
title: "Get microsoftStoreForBusinessReleaseManagedApp"
description: "Read the properties and relationships of a microsoftStoreForBusinessReleaseManagedApp object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get microsoftStoreForBusinessReleaseManagedApp
Namespace: microsoft.graph

Read the properties and relationships of a [microsoftStoreForBusinessReleaseManagedApp](../resources/microsoftstoreforbusinessreleasemanagedapp.md) object.

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
GET ** Entity URI for microsoft.graph.microsoftStoreForBusinessReleaseManagedApp not found
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

If successful, this method returns a `200 OK` response code and a [microsoftStoreForBusinessReleaseManagedApp](../resources/microsoftstoreforbusinessreleasemanagedapp.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_microsoftstoreforbusinessreleasemanagedapp"
}
-->
``` http
GET https://graph.microsoft.com/beta** Entity URI for microsoft.graph.microsoftStoreForBusinessReleaseManagedApp not found
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.microsoftStoreForBusinessReleaseManagedApp"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.microsoftStoreForBusinessReleaseManagedApp",
    "id": "a605bb29-bb29-a605-29bb-05a629bb05a6",
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
    "productKey": "String",
    "licenseType": "String",
    "packageIdentityName": "String",
    "licensingType": {
      "@odata.type": "microsoft.graph.vppLicensingType"
    },
    "selectedChannelAndReleaseId": "String",
    "selectedPackageIds": [
      "String"
    ],
    "selectedChannelAndReleaseExpirationDateTime": "String (timestamp)"
  }
}
```


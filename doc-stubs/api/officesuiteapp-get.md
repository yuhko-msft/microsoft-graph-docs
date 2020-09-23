---
title: "Get officeSuiteApp"
description: "Read the properties and relationships of an officeSuiteApp object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get officeSuiteApp
Namespace: microsoft.graph

Read the properties and relationships of an [officeSuiteApp](../resources/officesuiteapp.md) object.

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
GET ** Entity URI for microsoft.management.services.api.officeSuiteApp not found
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

If successful, this method returns a `200 OK` response code and an [officeSuiteApp](../resources/officesuiteapp.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_officesuiteapp"
}
-->
``` http
GET https://graph.microsoft.com/beta** Entity URI for microsoft.management.services.api.officeSuiteApp not found
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.management.services.api.officeSuiteApp"
}
-->
``` http
HTTP/1.1 200 OK

Content-Type: application/json
{
  "value": {
    "@odata.type": "#microsoft.management.services.api.officeSuiteApp",
    "id": "d1840b5d-0b5d-d184-5d0b-84d15d0b84d1",
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
    "autoAcceptEula": "Boolean",
    "productIds": [
      "String"
    ],
    "excludedApps": {
      "@odata.type": "microsoft.graph.excludedApps"
    },
    "useSharedComputerActivation": "Boolean",
    "updateChannel": "String",
    "officePlatformArchitecture": "String",
    "localesToInstall": [
      "String"
    ],
    "installProgressDisplayLevel": "String",
    "shouldUninstallOlderVersionsOfOffice": "Boolean",
    "targetVersion": "String",
    "updateVersion": "String",
    "officeConfigurationXml": "Binary"
  }
}
```


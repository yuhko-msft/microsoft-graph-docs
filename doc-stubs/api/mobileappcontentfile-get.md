---
title: "Get mobileAppContentFile"
description: "Read the properties and relationships of a mobileAppContentFile object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get mobileAppContentFile
Namespace: microsoft.graph



Read the properties and relationships of a [mobileAppContentFile](../resources/mobileappcontentfile.md) object.

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
GET /deviceAppManagement/mobileApps/{mobileAppId}/contentVersions/{mobileAppContentId}/files/{mobileAppContentFileId}
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

If successful, this method returns a `200 OK` response code and a [mobileAppContentFile](../resources/mobileappcontentfile.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_mobileappcontentfile"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/deviceAppManagement/mobileApps/{mobileAppId}/contentVersions/{mobileAppContentId}/files/{mobileAppContentFileId}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.mobileAppContentFile"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.mobileAppContentFile",
    "id": "38487412-7412-3848-1274-483812744838",
    "azureStorageUri": "String",
    "azureStorageUriExpirationDateTime": "String (timestamp)",
    "createdDateTime": "String (timestamp)",
    "isCommitted": "Boolean",
    "isDependency": "Boolean",
    "isFrameworkFile": "Boolean",
    "manifest": "Binary",
    "name": "String",
    "size": "Integer",
    "sizeEncrypted": "Integer",
    "uploadState": "String"
  }
}
```


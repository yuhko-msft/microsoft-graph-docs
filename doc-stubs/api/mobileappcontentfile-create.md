---
title: "Create mobileAppContentFile"
description: "Create a new mobileAppContentFile object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create mobileAppContentFile
Namespace: microsoft.graph



Create a new [mobileAppContentFile](../resources/mobileappcontentfile.md) object.

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
POST /deviceAppManagement/mobileApps/{mobileAppId}/contentVersions/{mobileAppContentId}/files
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [mobileAppContentFile](../resources/mobileappcontentfile.md) object.

The following table shows the properties that are required when you create the [mobileAppContentFile](../resources/mobileappcontentfile.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|azureStorageUri|String|The Azure Storage URI.|
|azureStorageUriExpirationDateTime|DateTimeOffset|The time the Azure storage Uri expires.|
|createdDateTime|DateTimeOffset|The time the file was created.|
|isCommitted|Boolean|A value indicating whether the file is committed.|
|isDependency|Boolean|Whether the content file is a dependency for the main content file.|
|isFrameworkFile|Boolean|A value indicating whether the file is a framework file.|
|manifest|Binary|The manifest information.|
|name|String|the file name.|
|size|Int64|The size of the file prior to encryption.|
|sizeEncrypted|Int64|The size of the file after encryption.|
|uploadState|mobileAppContentFileUploadState|The state of the current upload request. Possible values are: `success`, `transientError`, `error`, `unknown`, `azureStorageUriRequestSuccess`, `azureStorageUriRequestPending`, `azureStorageUriRequestFailed`, `azureStorageUriRequestTimedOut`, `azureStorageUriRenewalSuccess`, `azureStorageUriRenewalPending`, `azureStorageUriRenewalFailed`, `azureStorageUriRenewalTimedOut`, `commitFileSuccess`, `commitFilePending`, `commitFileFailed`, `commitFileTimedOut`.|



## Response

If successful, this method returns a `201 Created` response code and a [mobileAppContentFile](../resources/mobileappcontentfile.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_mobileappcontentfile_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/deviceAppManagement/mobileApps/{mobileAppId}/contentVersions/{mobileAppContentId}/files
Content-Type: application/json
Content-length: 375

{
  "@odata.type": "#microsoft.graph.mobileAppContentFile",
  "azureStorageUri": "String",
  "azureStorageUriExpirationDateTime": "String (timestamp)",
  "isCommitted": "Boolean",
  "isDependency": "Boolean",
  "isFrameworkFile": "Boolean",
  "manifest": "Binary",
  "name": "String",
  "size": "Integer",
  "sizeEncrypted": "Integer",
  "uploadState": "String"
}
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
HTTP/1.1 201 Created
Content-Type: application/json

{
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
```


---
title: "Update files"
description: "Update the properties of a files object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update files
Namespace: microsoft.graph

Update the properties of a files object.

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
PATCH /deviceAppManagement/mobileApps/{mobileAppId}/contentVersions/{mobileAppContentId}/files
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
|azureStorageUri|String|The Azure Storage URI.|
|isCommitted|Boolean|A value indicating whether the file is committed.|
|id|String|The File Id.|
|createdDateTime|DateTimeOffset|The time the file was created.|
|name|String|the file name.|
|size|Int64|The size of the file prior to encryption.|
|sizeEncrypted|Int64|The size of the file after encryption.|
|azureStorageUriExpirationDateTime|DateTimeOffset|The time the Azure storage Uri expires.|
|manifest|Binary|The manifest information.|
|uploadState|mobileAppContentFileUploadState|The state of the current upload request. Possible values are: `success`, `transientError`, `error`, `unknown`, `azureStorageUriRequestSuccess`, `azureStorageUriRequestPending`, `azureStorageUriRequestFailed`, `azureStorageUriRequestTimedOut`, `azureStorageUriRenewalSuccess`, `azureStorageUriRenewalPending`, `azureStorageUriRenewalFailed`, `azureStorageUriRenewalTimedOut`, `commitFileSuccess`, `commitFilePending`, `commitFileFailed`, `commitFileTimedOut`.|
|isFrameworkFile|Boolean|A value indicating whether the file is a framework file.|
|isDependency|Boolean|Whether the content file is a dependency for the main content file.|



## Response

If successful, this method returns a `200 OK` response code and an updated [mobileAppContentFile](../resources/mobileappcontentfile.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_files"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/deviceAppManagement/mobileApps/{mobileAppId}/contentVersions/{mobileAppContentId}/files
Content-Type: application/json
Content-length: 375

{
  "@odata.type": "#microsoft.graph.mobileAppContentFile",
  "azureStorageUri": "String",
  "isCommitted": "Boolean",
  "name": "String",
  "size": "Integer",
  "sizeEncrypted": "Integer",
  "azureStorageUriExpirationDateTime": "String (timestamp)",
  "manifest": "Binary",
  "uploadState": "String",
  "isFrameworkFile": "Boolean",
  "isDependency": "Boolean"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK

Content-Type: application/json
{
  "@odata.type": "#microsoft.graph.mobileAppContentFile",
  "azureStorageUri": "String",
  "isCommitted": "Boolean",
  "id": "c44f396e-396e-c44f-6e39-4fc46e394fc4",
  "createdDateTime": "String (timestamp)",
  "name": "String",
  "size": "Integer",
  "sizeEncrypted": "Integer",
  "azureStorageUriExpirationDateTime": "String (timestamp)",
  "manifest": "Binary",
  "uploadState": "String",
  "isFrameworkFile": "Boolean",
  "isDependency": "Boolean"
}
```


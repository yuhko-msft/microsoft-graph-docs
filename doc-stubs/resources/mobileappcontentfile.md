---
title: "mobileAppContentFile resource type"
description: "Contains properties for a single installer file that is associated with a given mobileAppContent version."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# mobileAppContentFile resource type

Namespace: microsoft.graph



Contains properties for a single installer file that is associated with a given mobileAppContent version.


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List mobileAppContentFiles](../api/mobileappcontentfile-list.md)|[mobileAppContentFile](../resources/mobileappcontentfile.md) collection|Get a list of the [mobileAppContentFile](../resources/mobileappcontentfile.md) objects and their properties.|
|[Create mobileAppContentFile](../api/mobileappcontentfile-create.md)|[mobileAppContentFile](../resources/mobileappcontentfile.md)|Create a new [mobileAppContentFile](../resources/mobileappcontentfile.md) object.|
|[Get mobileAppContentFile](../api/mobileappcontentfile-get.md)|[mobileAppContentFile](../resources/mobileappcontentfile.md)|Read the properties and relationships of a [mobileAppContentFile](../resources/mobileappcontentfile.md) object.|
|[Update mobileAppContentFile](../api/mobileappcontentfile-update.md)|[mobileAppContentFile](../resources/mobileappcontentfile.md)|Update the properties of a [mobileAppContentFile](../resources/mobileappcontentfile.md) object.|
|[Delete mobileAppContentFile](../api/mobileappcontentfile-delete.md)|None|Deletes a [mobileAppContentFile](../resources/mobileappcontentfile.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|azureStorageUri|String|The Azure Storage URI.|
|azureStorageUriExpirationDateTime|DateTimeOffset|The time the Azure storage Uri expires.|
|createdDateTime|DateTimeOffset|The time the file was created.|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|isCommitted|Boolean|A value indicating whether the file is committed.|
|isDependency|Boolean|Whether the content file is a dependency for the main content file.|
|isFrameworkFile|Boolean|A value indicating whether the file is a framework file.|
|manifest|Binary|The manifest information.|
|name|String|the file name.|
|size|Int64|The size of the file prior to encryption.|
|sizeEncrypted|Int64|The size of the file after encryption.|
|uploadState|mobileAppContentFileUploadState|The state of the current upload request. Possible values are: `success`, `transientError`, `error`, `unknown`, `azureStorageUriRequestSuccess`, `azureStorageUriRequestPending`, `azureStorageUriRequestFailed`, `azureStorageUriRequestTimedOut`, `azureStorageUriRenewalSuccess`, `azureStorageUriRenewalPending`, `azureStorageUriRenewalFailed`, `azureStorageUriRenewalTimedOut`, `commitFileSuccess`, `commitFilePending`, `commitFileFailed`, `commitFileTimedOut`.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.mobileAppContentFile",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.mobileAppContentFile",
  "id": "String (identifier)",
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


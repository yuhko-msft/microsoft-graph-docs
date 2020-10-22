---
title: "mobileAppContentFile resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# mobileAppContentFile resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List files](../api/intune-mobileappcontent-list-files.md)|[mobileAppContentFile](../resources/intune-mobileappcontentfile.md) collection|Get the mobileAppContentFile resources from the files navigation property.|
|[Create files](../api/intune-mobileappcontent-post-files.md)|[mobileAppContentFile](../resources/intune-mobileappcontentfile.md)|Create a new mobileAppContentFile object.|
|[Update files](../api/intune-mobileappcontent-update-files.md)|[mobileAppContentFile](../resources/intune-mobileappcontentfile.md)|Update the properties of a files object.|
|[Get files](../api/intune-mobileappcontent-get-mobileappcontentfile.md)|[mobileAppContentFile](../resources/intune-mobileappcontentfile.md)|Read the properties and relationships of a [mobileAppContentFile](../resources/intune-mobileappcontentfile.md) object.|
|[Delete files](../api/intune-mobileappcontent-delete-files.md)|None|Delete a [mobileAppContentFile](../resources/intune-mobileappcontentfile.md) object.|
|[List mobileAppContentFiles](../api/intune-mobileappcontentfile-list.md)|[mobileAppContentFile](../resources/intune-mobileappcontentfile.md) collection|Get a list of the [mobileAppContentFile](../resources/mobileappcontentfile.md) objects and their properties.|
|[Create mobileAppContentFile](../api/intune-mobileappcontentfile-create.md)|[mobileAppContentFile](../resources/intune-mobileappcontentfile.md)|Create a new [mobileAppContentFile](../resources/intune-mobileappcontentfile.md) object.|
|[Get mobileAppContentFile](../api/intune-mobileappcontentfile-get.md)|[mobileAppContentFile](../resources/intune-mobileappcontentfile.md)|Read the properties and relationships of a [mobileAppContentFile](../resources/intune-mobileappcontentfile.md) object.|
|[Update mobileAppContentFile](../api/intune-mobileappcontentfile-update.md)|[mobileAppContentFile](../resources/intune-mobileappcontentfile.md)|Update the properties of a [mobileAppContentFile](../resources/intune-mobileappcontentfile.md) object.|
|[Delete mobileAppContentFile](../api/intune-mobileappcontentfile-delete.md)|None|Deletes a [mobileAppContentFile](../resources/intune-mobileappcontentfile.md) object.|
|[commit](../api/intune-mobileappcontentfile-commit.md)|None|**TODO: Add Description**|
|[renewUpload](../api/intune-mobileappcontentfile-renewupload.md)|None|**TODO: Add Description**|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|azureStorageUri|String|**TODO: Add Description**|
|azureStorageUriExpirationDateTime|DateTimeOffset|**TODO: Add Description**|
|createdDateTime|DateTimeOffset|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|isCommitted|Boolean|**TODO: Add Description**|
|isDependency|Boolean|**TODO: Add Description**|
|isFrameworkFile|Boolean|**TODO: Add Description**|
|manifest|Binary|**TODO: Add Description**|
|name|String|**TODO: Add Description**|
|size|Int64|**TODO: Add Description**|
|sizeEncrypted|Int64|**TODO: Add Description**|
|uploadState|mobileAppContentFileUploadState|**TODO: Add Description**. Possible values are: `success`, `transientError`, `error`, `unknown`, `azureStorageUriRequestSuccess`, `azureStorageUriRequestPending`, `azureStorageUriRequestFailed`, `azureStorageUriRequestTimedOut`, `azureStorageUriRenewalSuccess`, `azureStorageUriRenewalPending`, `azureStorageUriRenewalFailed`, `azureStorageUriRenewalTimedOut`, `commitFileSuccess`, `commitFilePending`, `commitFileFailed`, `commitFileTimedOut`.|

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
  "isCommitted": "Boolean",
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


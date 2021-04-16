---
title: "appLogCollectionRequest resource type"
description: "AppLogCollectionRequest Entity."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# appLogCollectionRequest resource type

Namespace: microsoft.graph



AppLogCollectionRequest Entity.


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List appLogCollectionRequests](../api/applogcollectionrequest-list.md)|[appLogCollectionRequest](../resources/applogcollectionrequest.md) collection|Get a list of the [appLogCollectionRequest](../resources/applogcollectionrequest.md) objects and their properties.|
|[Create appLogCollectionRequest](../api/applogcollectionrequest-create.md)|[appLogCollectionRequest](../resources/applogcollectionrequest.md)|Create a new [appLogCollectionRequest](../resources/applogcollectionrequest.md) object.|
|[Get appLogCollectionRequest](../api/applogcollectionrequest-get.md)|[appLogCollectionRequest](../resources/applogcollectionrequest.md)|Read the properties and relationships of an [appLogCollectionRequest](../resources/applogcollectionrequest.md) object.|
|[Update appLogCollectionRequest](../api/applogcollectionrequest-update.md)|[appLogCollectionRequest](../resources/applogcollectionrequest.md)|Update the properties of an [appLogCollectionRequest](../resources/applogcollectionrequest.md) object.|
|[Delete appLogCollectionRequest](../api/applogcollectionrequest-delete.md)|None|Deletes an [appLogCollectionRequest](../resources/applogcollectionrequest.md) object.|
|[createDownloadUrl](../api/applogcollectionrequest-createdownloadurl.md)|[appLogCollectionDownloadDetails](../resources/applogcollectiondownloaddetails.md)|**TODO: Add Description**|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|completedDateTime|DateTimeOffset|Time at which the upload log request reached a terminal state|
|customLogFolders|String collection|List of log folders. |
|errorMessage|String|Error message if any during the upload process|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|status|appLogUploadState|Log upload status. Possible values are: `pending`, `completed`, `failed`.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.appLogCollectionRequest",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.appLogCollectionRequest",
  "id": "String (identifier)",
  "completedDateTime": "String (timestamp)",
  "customLogFolders": [
    "String"
  ],
  "errorMessage": "String",
  "status": "String"
}
```


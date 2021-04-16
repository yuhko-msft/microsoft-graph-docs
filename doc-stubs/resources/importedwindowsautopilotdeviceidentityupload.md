---
title: "importedWindowsAutopilotDeviceIdentityUpload resource type"
description: "Import windows autopilot devices using upload."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# importedWindowsAutopilotDeviceIdentityUpload resource type

Namespace: microsoft.graph



Import windows autopilot devices using upload.


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List importedWindowsAutopilotDeviceIdentityUploads](../api/importedwindowsautopilotdeviceidentityupload-list.md)|[importedWindowsAutopilotDeviceIdentityUpload](../resources/importedwindowsautopilotdeviceidentityupload.md) collection|Get a list of the [importedWindowsAutopilotDeviceIdentityUpload](../resources/importedwindowsautopilotdeviceidentityupload.md) objects and their properties.|
|[Create importedWindowsAutopilotDeviceIdentityUpload](../api/importedwindowsautopilotdeviceidentityupload-create.md)|[importedWindowsAutopilotDeviceIdentityUpload](../resources/importedwindowsautopilotdeviceidentityupload.md)|Create a new [importedWindowsAutopilotDeviceIdentityUpload](../resources/importedwindowsautopilotdeviceidentityupload.md) object.|
|[Get importedWindowsAutopilotDeviceIdentityUpload](../api/importedwindowsautopilotdeviceidentityupload-get.md)|[importedWindowsAutopilotDeviceIdentityUpload](../resources/importedwindowsautopilotdeviceidentityupload.md)|Read the properties and relationships of an [importedWindowsAutopilotDeviceIdentityUpload](../resources/importedwindowsautopilotdeviceidentityupload.md) object.|
|[Update importedWindowsAutopilotDeviceIdentityUpload](../api/importedwindowsautopilotdeviceidentityupload-update.md)|[importedWindowsAutopilotDeviceIdentityUpload](../resources/importedwindowsautopilotdeviceidentityupload.md)|Update the properties of an [importedWindowsAutopilotDeviceIdentityUpload](../resources/importedwindowsautopilotdeviceidentityupload.md) object.|
|[Delete importedWindowsAutopilotDeviceIdentityUpload](../api/importedwindowsautopilotdeviceidentityupload-delete.md)|None|Deletes an [importedWindowsAutopilotDeviceIdentityUpload](../resources/importedwindowsautopilotdeviceidentityupload.md) object.|
|[List deviceIdentities](../api/importedwindowsautopilotdeviceidentityupload-list-deviceidentities.md)|[importedWindowsAutopilotDeviceIdentity](../resources/importedwindowsautopilotdeviceidentity.md) collection|Get the importedWindowsAutopilotDeviceIdentity resources from the deviceIdentities navigation property.|
|[Create importedWindowsAutopilotDeviceIdentity](../api/importedwindowsautopilotdeviceidentityupload-post-deviceidentities.md)|[importedWindowsAutopilotDeviceIdentity](../resources/importedwindowsautopilotdeviceidentity.md)|Create a new importedWindowsAutopilotDeviceIdentity object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|createdDateTimeUtc|DateTimeOffset|DateTime when the entity is created.|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|status|importedWindowsAutopilotDeviceIdentityUploadStatus|Upload status. Possible values are: `noUpload`, `pending`, `complete`, `error`.|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|deviceIdentities|[importedWindowsAutopilotDeviceIdentity](../resources/importedwindowsautopilotdeviceidentity.md) collection|Collection of all Autopilot devices as a part of this upload.|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.importedWindowsAutopilotDeviceIdentityUpload",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.importedWindowsAutopilotDeviceIdentityUpload",
  "id": "String (identifier)",
  "createdDateTimeUtc": "String (timestamp)",
  "status": "String"
}
```


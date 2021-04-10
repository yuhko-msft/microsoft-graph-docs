---
title: "importedWindowsAutopilotDeviceIdentityUpload resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# importedWindowsAutopilotDeviceIdentityUpload resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List importedWindowsAutopilotDeviceIdentityUploads](../api/intune-importedwindowsautopilotdeviceidentityupload-list.md)|[importedWindowsAutopilotDeviceIdentityUpload](../resources/intune-importedwindowsautopilotdeviceidentityupload.md) collection|Get a list of the [importedWindowsAutopilotDeviceIdentityUpload](../resources/importedwindowsautopilotdeviceidentityupload.md) objects and their properties.|
|[Create importedWindowsAutopilotDeviceIdentityUpload](../api/intune-importedwindowsautopilotdeviceidentityupload-create.md)|[importedWindowsAutopilotDeviceIdentityUpload](../resources/intune-importedwindowsautopilotdeviceidentityupload.md)|Create a new [importedWindowsAutopilotDeviceIdentityUpload](../resources/intune-importedwindowsautopilotdeviceidentityupload.md) object.|
|[Get importedWindowsAutopilotDeviceIdentityUpload](../api/intune-importedwindowsautopilotdeviceidentityupload-get.md)|[importedWindowsAutopilotDeviceIdentityUpload](../resources/intune-importedwindowsautopilotdeviceidentityupload.md)|Read the properties and relationships of an [importedWindowsAutopilotDeviceIdentityUpload](../resources/intune-importedwindowsautopilotdeviceidentityupload.md) object.|
|[Update importedWindowsAutopilotDeviceIdentityUpload](../api/intune-importedwindowsautopilotdeviceidentityupload-update.md)|[importedWindowsAutopilotDeviceIdentityUpload](../resources/intune-importedwindowsautopilotdeviceidentityupload.md)|Update the properties of an [importedWindowsAutopilotDeviceIdentityUpload](../resources/intune-importedwindowsautopilotdeviceidentityupload.md) object.|
|[Delete importedWindowsAutopilotDeviceIdentityUpload](../api/intune-importedwindowsautopilotdeviceidentityupload-delete.md)|None|Deletes an [importedWindowsAutopilotDeviceIdentityUpload](../resources/intune-importedwindowsautopilotdeviceidentityupload.md) object.|
|[List deviceIdentities](../api/intune-importedwindowsautopilotdeviceidentityupload-list-deviceidentities.md)|[importedWindowsAutopilotDeviceIdentity](../resources/intune-importedwindowsautopilotdeviceidentity.md) collection|Get the importedWindowsAutopilotDeviceIdentity resources from the deviceIdentities navigation property.|
|[Create importedWindowsAutopilotDeviceIdentity](../api/intune-importedwindowsautopilotdeviceidentityupload-post-deviceidentities.md)|[importedWindowsAutopilotDeviceIdentity](../resources/intune-importedwindowsautopilotdeviceidentity.md)|Create a new importedWindowsAutopilotDeviceIdentity object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|createdDateTimeUtc|DateTimeOffset|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|status|importedWindowsAutopilotDeviceIdentityUploadStatus|**TODO: Add Description**. Possible values are: `noUpload`, `pending`, `complete`, `error`.|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|deviceIdentities|[importedWindowsAutopilotDeviceIdentity](../resources/intune-importedwindowsautopilotdeviceidentity.md) collection|**TODO: Add Description**|

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


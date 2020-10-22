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

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List importedWindowsAutopilotDeviceIdentityUploads](../api/intune-importedwindowsautopilotdeviceidentityupload-list.md)|[importedWindowsAutopilotDeviceIdentityUpload](../resources/intune-importedwindowsautopilotdeviceidentityupload.md) collection|Get a list of the [importedWindowsAutopilotDeviceIdentityUpload](../resources/importedwindowsautopilotdeviceidentityupload.md) objects and their properties.|
|[Create importedWindowsAutopilotDeviceIdentityUpload](../api/intune-importedwindowsautopilotdeviceidentityupload-create.md)|[importedWindowsAutopilotDeviceIdentityUpload](../resources/intune-importedwindowsautopilotdeviceidentityupload.md)|Create a new [importedWindowsAutopilotDeviceIdentityUpload](../resources/intune-importedwindowsautopilotdeviceidentityupload.md) object.|
|[Get importedWindowsAutopilotDeviceIdentityUpload](../api/intune-importedwindowsautopilotdeviceidentityupload-get.md)|[importedWindowsAutopilotDeviceIdentityUpload](../resources/intune-importedwindowsautopilotdeviceidentityupload.md)|Read the properties and relationships of an [importedWindowsAutopilotDeviceIdentityUpload](../resources/intune-importedwindowsautopilotdeviceidentityupload.md) object.|
|[Update importedWindowsAutopilotDeviceIdentityUpload](../api/intune-importedwindowsautopilotdeviceidentityupload-update.md)|[importedWindowsAutopilotDeviceIdentityUpload](../resources/intune-importedwindowsautopilotdeviceidentityupload.md)|Update the properties of an [importedWindowsAutopilotDeviceIdentityUpload](../resources/intune-importedwindowsautopilotdeviceidentityupload.md) object.|
|[Delete importedWindowsAutopilotDeviceIdentityUpload](../api/intune-importedwindowsautopilotdeviceidentityupload-delete.md)|None|Deletes an [importedWindowsAutopilotDeviceIdentityUpload](../resources/intune-importedwindowsautopilotdeviceidentityupload.md) object.|
|[List deviceIdentities](../api/intune-importedwindowsautopilotdeviceidentityupload-list-deviceidentities.md)|[importedWindowsAutopilotDeviceIdentity](../resources/intune-importedwindowsautopilotdeviceidentity.md) collection|Get the importedWindowsAutopilotDeviceIdentity resources from the deviceIdentities navigation property.|
|[Create deviceIdentities](../api/intune-importedwindowsautopilotdeviceidentityupload-post-deviceidentities.md)|[importedWindowsAutopilotDeviceIdentity](../resources/intune-importedwindowsautopilotdeviceidentity.md)|Create a new importedWindowsAutopilotDeviceIdentity object.|
|[Get deviceIdentities](../api/intune-importedwindowsautopilotdeviceidentityupload-get-importedwindowsautopilotdeviceidentity.md)|[importedWindowsAutopilotDeviceIdentity](../resources/intune-importedwindowsautopilotdeviceidentity.md)|Read the properties and relationships of an [importedWindowsAutopilotDeviceIdentity](../resources/intune-importedwindowsautopilotdeviceidentity.md) object.|
|[Update deviceIdentities](../api/intune-importedwindowsautopilotdeviceidentityupload-update-deviceidentities.md)|[importedWindowsAutopilotDeviceIdentity](../resources/intune-importedwindowsautopilotdeviceidentity.md)|Update the properties of a deviceIdentities object.|
|[Delete deviceIdentities](../api/intune-importedwindowsautopilotdeviceidentityupload-delete-deviceidentities.md)|None|Delete an [importedWindowsAutopilotDeviceIdentity](../resources/intune-importedwindowsautopilotdeviceidentity.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|createdDateTimeUtc|DateTimeOffset|**TODO: Add Description**|
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
  "baseType": "",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.importedWindowsAutopilotDeviceIdentityUpload",
  "createdDateTimeUtc": "String (timestamp)",
  "status": "String"
}
```


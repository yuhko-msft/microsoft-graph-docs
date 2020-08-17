---
title: "vulnerableManagedDevice resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# vulnerableManagedDevice resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List managedDevices](../api/securityconfigurationtask-list-manageddevices.md)|[vulnerableManagedDevice](../resources/intune-vulnerablemanageddevice.md) collection|Get the vulnerableManagedDevices from the managedDevices navigation property.|
|[Add managedDevices](../api/securityconfigurationtask-post-manageddevices.md)|[vulnerableManagedDevice](../resources/intune-vulnerablemanageddevice.md)|Add managedDevices by posting to the managedDevices collection.|
|[Remove managedDevices](../api/securityconfigurationtask-delete-manageddevices.md)|None|Remove a [vulnerableManagedDevice](../resources/intune-vulnerablemanageddevice.md) object.|
|[List vulnerableManagedDevices](../api/intune-vulnerablemanageddevice-list.md)|[vulnerableManagedDevice](../resources/intune-vulnerablemanageddevice.md) collection|Get a list of the [vulnerableManagedDevice](../resources/vulnerablemanageddevice.md) objects and their properties.|
|[Create vulnerableManagedDevice](../api/intune-vulnerablemanageddevice-create.md)|[vulnerableManagedDevice](../resources/intune-vulnerablemanageddevice.md)|Create a new [vulnerableManagedDevice](../resources/intune-vulnerablemanageddevice.md) object.|
|[Get vulnerableManagedDevice](../api/intune-vulnerablemanageddevice-get.md)|[vulnerableManagedDevice](../resources/intune-vulnerablemanageddevice.md)|Read the properties and relationships of a [vulnerableManagedDevice](../resources/intune-vulnerablemanageddevice.md) object.|
|[Update vulnerableManagedDevice](../api/intune-vulnerablemanageddevice-update.md)|[vulnerableManagedDevice](../resources/intune-vulnerablemanageddevice.md)|Update the properties of a [vulnerableManagedDevice](../resources/intune-vulnerablemanageddevice.md) object.|
|[Delete vulnerableManagedDevice](../api/intune-vulnerablemanageddevice-delete.md)|None|Deletes a [vulnerableManagedDevice](../resources/intune-vulnerablemanageddevice.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|displayName|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastSyncDateTime|DateTimeOffset|**TODO: Add Description**|
|managedDeviceId|String|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.vulnerableManagedDevice",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.vulnerableManagedDevice",
  "id": "String (identifier)",
  "managedDeviceId": "String",
  "displayName": "String",
  "lastSyncDateTime": "String (timestamp)"
}
```


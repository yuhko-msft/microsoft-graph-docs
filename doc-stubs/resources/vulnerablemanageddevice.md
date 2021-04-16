---
title: "vulnerableManagedDevice resource type"
description: "This entity represents a device associated with a task."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# vulnerableManagedDevice resource type

Namespace: microsoft.graph



This entity represents a device associated with a task.


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List vulnerableManagedDevices](../api/vulnerablemanageddevice-list.md)|[vulnerableManagedDevice](../resources/vulnerablemanageddevice.md) collection|Get a list of the [vulnerableManagedDevice](../resources/vulnerablemanageddevice.md) objects and their properties.|
|[Create vulnerableManagedDevice](../api/vulnerablemanageddevice-create.md)|[vulnerableManagedDevice](../resources/vulnerablemanageddevice.md)|Create a new [vulnerableManagedDevice](../resources/vulnerablemanageddevice.md) object.|
|[Get vulnerableManagedDevice](../api/vulnerablemanageddevice-get.md)|[vulnerableManagedDevice](../resources/vulnerablemanageddevice.md)|Read the properties and relationships of a [vulnerableManagedDevice](../resources/vulnerablemanageddevice.md) object.|
|[Update vulnerableManagedDevice](../api/vulnerablemanageddevice-update.md)|[vulnerableManagedDevice](../resources/vulnerablemanageddevice.md)|Update the properties of a [vulnerableManagedDevice](../resources/vulnerablemanageddevice.md) object.|
|[Delete vulnerableManagedDevice](../api/vulnerablemanageddevice-delete.md)|None|Deletes a [vulnerableManagedDevice](../resources/vulnerablemanageddevice.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|displayName|String|The device name.|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastSyncDateTime|DateTimeOffset|The last sync date.|
|managedDeviceId|String|The Intune managed device ID.|

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
  "displayName": "String",
  "lastSyncDateTime": "String (timestamp)",
  "managedDeviceId": "String"
}
```


---
title: "unmanagedDeviceDiscoveryTask resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# unmanagedDeviceDiscoveryTask resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [deviceAppManagementTask](../resources/deviceappmanagementtask.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List unmanagedDeviceDiscoveryTasks](../api/unmanageddevicediscoverytask-list.md)|[unmanagedDeviceDiscoveryTask](../resources/unmanageddevicediscoverytask.md) collection|Get a list of the [unmanagedDeviceDiscoveryTask](../resources/unmanageddevicediscoverytask.md) objects and their properties.|
|[Create unmanagedDeviceDiscoveryTask](../api/unmanageddevicediscoverytask-create.md)|[unmanagedDeviceDiscoveryTask](../resources/unmanageddevicediscoverytask.md)|Create a new [unmanagedDeviceDiscoveryTask](../resources/unmanageddevicediscoverytask.md) object.|
|[Get unmanagedDeviceDiscoveryTask](../api/unmanageddevicediscoverytask-get.md)|[unmanagedDeviceDiscoveryTask](../resources/unmanageddevicediscoverytask.md)|Read the properties and relationships of an [unmanagedDeviceDiscoveryTask](../resources/unmanageddevicediscoverytask.md) object.|
|[Update unmanagedDeviceDiscoveryTask](../api/unmanageddevicediscoverytask-update.md)|[unmanagedDeviceDiscoveryTask](../resources/unmanageddevicediscoverytask.md)|Update the properties of an [unmanagedDeviceDiscoveryTask](../resources/unmanageddevicediscoverytask.md) object.|
|[Delete unmanagedDeviceDiscoveryTask](../api/unmanageddevicediscoverytask-delete.md)|None|Deletes an [unmanagedDeviceDiscoveryTask](../resources/unmanageddevicediscoverytask.md) object.|
|[updateStatus](../api/unmanageddevicediscoverytask-updatestatus.md)|None|**TODO: Add Description**|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|assignedTo|String|**TODO: Add Description** Inherited from [deviceAppManagementTask](../resources/intune-deviceappmanagementtask.md)|
|category|deviceAppManagementTaskCategory|**TODO: Add Description** Inherited from [deviceAppManagementTask](../resources/intune-deviceappmanagementtask.md). Possible values are: `unknown`, `advancedThreatProtection`.|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [deviceAppManagementTask](../resources/intune-deviceappmanagementtask.md)|
|creator|String|**TODO: Add Description** Inherited from [deviceAppManagementTask](../resources/intune-deviceappmanagementtask.md)|
|creatorNotes|String|**TODO: Add Description** Inherited from [deviceAppManagementTask](../resources/intune-deviceappmanagementtask.md)|
|description|String|**TODO: Add Description** Inherited from [deviceAppManagementTask](../resources/intune-deviceappmanagementtask.md)|
|displayName|String|**TODO: Add Description** Inherited from [deviceAppManagementTask](../resources/intune-deviceappmanagementtask.md)|
|dueDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [deviceAppManagementTask](../resources/intune-deviceappmanagementtask.md)|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|priority|deviceAppManagementTaskPriority|**TODO: Add Description** Inherited from [deviceAppManagementTask](../resources/intune-deviceappmanagementtask.md). Possible values are: `none`, `high`, `low`.|
|status|deviceAppManagementTaskStatus|**TODO: Add Description** Inherited from [deviceAppManagementTask](../resources/intune-deviceappmanagementtask.md). Possible values are: `unknown`, `pending`, `active`, `completed`, `rejected`.|
|unmanagedDevices|[unmanagedDevice](../resources/intune-unmanageddevice.md) collection|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.unmanagedDeviceDiscoveryTask",
  "baseType": "microsoft.graph.deviceAppManagementTask",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.unmanagedDeviceDiscoveryTask",
  "id": "String (identifier)",
  "displayName": "String",
  "description": "String",
  "createdDateTime": "String (timestamp)",
  "dueDateTime": "String (timestamp)",
  "category": "String",
  "priority": "String",
  "creator": "String",
  "creatorNotes": "String",
  "assignedTo": "String",
  "status": "String",
  "unmanagedDevices": [
    {
      "@odata.type": "microsoft.graph.unmanagedDevice"
    }
  ]
}
```


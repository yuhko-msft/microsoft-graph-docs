---
title: "unmanagedDeviceDiscoveryTask resource type"
description: "This task derived type represents a list of unmanaged devices discovered in the network."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# unmanagedDeviceDiscoveryTask resource type

Namespace: microsoft.graph



This task derived type represents a list of unmanaged devices discovered in the network.


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
|assignedTo|String|The name or email of the admin this task is assigned to. Inherited from [deviceAppManagementTask](../resources/deviceappmanagementtask.md)|
|category|deviceAppManagementTaskCategory|The category. Inherited from [deviceAppManagementTask](../resources/deviceappmanagementtask.md). Possible values are: `unknown`, `advancedThreatProtection`.|
|createdDateTime|DateTimeOffset|The created date. Inherited from [deviceAppManagementTask](../resources/deviceappmanagementtask.md)|
|creator|String|The email address of the creator. Inherited from [deviceAppManagementTask](../resources/deviceappmanagementtask.md)|
|creatorNotes|String|Notes from the creator. Inherited from [deviceAppManagementTask](../resources/deviceappmanagementtask.md)|
|description|String|The description. Inherited from [deviceAppManagementTask](../resources/deviceappmanagementtask.md)|
|displayName|String|The name. Inherited from [deviceAppManagementTask](../resources/deviceappmanagementtask.md)|
|dueDateTime|DateTimeOffset|The due date. Inherited from [deviceAppManagementTask](../resources/deviceappmanagementtask.md)|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|priority|deviceAppManagementTaskPriority|The priority. Inherited from [deviceAppManagementTask](../resources/deviceappmanagementtask.md). Possible values are: `none`, `high`, `low`.|
|status|deviceAppManagementTaskStatus|The status. Inherited from [deviceAppManagementTask](../resources/deviceappmanagementtask.md). Possible values are: `unknown`, `pending`, `active`, `completed`, `rejected`.|
|unmanagedDevices|[unmanagedDevice](../resources/unmanageddevice.md) collection|Unmanaged devices discovered in the network.|

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
  "assignedTo": "String",
  "category": "String",
  "createdDateTime": "String (timestamp)",
  "creator": "String",
  "creatorNotes": "String",
  "description": "String",
  "displayName": "String",
  "dueDateTime": "String (timestamp)",
  "priority": "String",
  "status": "String",
  "unmanagedDevices": [
    {
      "@odata.type": "microsoft.graph.unmanagedDevice"
    }
  ]
}
```


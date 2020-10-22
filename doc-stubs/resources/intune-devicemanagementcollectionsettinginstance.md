---
title: "deviceManagementCollectionSettingInstance resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceManagementCollectionSettingInstance resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [deviceManagementSettingInstance](../resources/devicemanagementsettinginstance.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List deviceManagementCollectionSettingInstances](../api/intune-devicemanagementcollectionsettinginstance-list.md)|[deviceManagementCollectionSettingInstance](../resources/intune-devicemanagementcollectionsettinginstance.md) collection|Get a list of the [deviceManagementCollectionSettingInstance](../resources/devicemanagementcollectionsettinginstance.md) objects and their properties.|
|[Create deviceManagementCollectionSettingInstance](../api/intune-devicemanagementcollectionsettinginstance-create.md)|[deviceManagementCollectionSettingInstance](../resources/intune-devicemanagementcollectionsettinginstance.md)|Create a new [deviceManagementCollectionSettingInstance](../resources/intune-devicemanagementcollectionsettinginstance.md) object.|
|[Get deviceManagementCollectionSettingInstance](../api/intune-devicemanagementcollectionsettinginstance-get.md)|[deviceManagementCollectionSettingInstance](../resources/intune-devicemanagementcollectionsettinginstance.md)|Read the properties and relationships of a [deviceManagementCollectionSettingInstance](../resources/intune-devicemanagementcollectionsettinginstance.md) object.|
|[Update deviceManagementCollectionSettingInstance](../api/intune-devicemanagementcollectionsettinginstance-update.md)|[deviceManagementCollectionSettingInstance](../resources/intune-devicemanagementcollectionsettinginstance.md)|Update the properties of a [deviceManagementCollectionSettingInstance](../resources/intune-devicemanagementcollectionsettinginstance.md) object.|
|[Delete deviceManagementCollectionSettingInstance](../api/intune-devicemanagementcollectionsettinginstance-delete.md)|None|Deletes a [deviceManagementCollectionSettingInstance](../resources/intune-devicemanagementcollectionsettinginstance.md) object.|
|[List value](../api/intune-devicemanagementcollectionsettinginstance-list-value.md)|[deviceManagementSettingInstance](../resources/intune-devicemanagementsettinginstance.md) collection|Get the deviceManagementSettingInstance resources from the value navigation property.|
|[Add value](../api/intune-devicemanagementcollectionsettinginstance-post-value.md)|[deviceManagementSettingInstance](../resources/intune-devicemanagementsettinginstance.md)|Add value by posting to the value collection.|
|[Remove value](../api/intune-devicemanagementcollectionsettinginstance-delete-value.md)|None|Remove a [deviceManagementSettingInstance](../resources/intune-devicemanagementsettinginstance.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|definitionId|String|**TODO: Add Description** Inherited from [deviceManagementSettingInstance](../resources/intune-devicemanagementsettinginstance.md)|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|valueJson|String|**TODO: Add Description** Inherited from [deviceManagementSettingInstance](../resources/intune-devicemanagementsettinginstance.md)|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|value|[deviceManagementSettingInstance](../resources/intune-devicemanagementsettinginstance.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.deviceManagementCollectionSettingInstance",
  "baseType": "microsoft.graph.deviceManagementSettingInstance",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceManagementCollectionSettingInstance",
  "id": "String (identifier)",
  "definitionId": "String",
  "valueJson": "String"
}
```


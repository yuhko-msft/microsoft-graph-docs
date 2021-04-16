---
title: "embeddedSIMActivationCodePool resource type"
description: "A pool represents a group of embedded SIM activation codes."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# embeddedSIMActivationCodePool resource type

Namespace: microsoft.graph



A pool represents a group of embedded SIM activation codes.


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List embeddedSIMActivationCodePools](../api/embeddedsimactivationcodepool-list.md)|[embeddedSIMActivationCodePool](../resources/embeddedsimactivationcodepool.md) collection|Get a list of the [embeddedSIMActivationCodePool](../resources/embeddedsimactivationcodepool.md) objects and their properties.|
|[Create embeddedSIMActivationCodePool](../api/embeddedsimactivationcodepool-create.md)|[embeddedSIMActivationCodePool](../resources/embeddedsimactivationcodepool.md)|Create a new [embeddedSIMActivationCodePool](../resources/embeddedsimactivationcodepool.md) object.|
|[Get embeddedSIMActivationCodePool](../api/embeddedsimactivationcodepool-get.md)|[embeddedSIMActivationCodePool](../resources/embeddedsimactivationcodepool.md)|Read the properties and relationships of an [embeddedSIMActivationCodePool](../resources/embeddedsimactivationcodepool.md) object.|
|[Update embeddedSIMActivationCodePool](../api/embeddedsimactivationcodepool-update.md)|[embeddedSIMActivationCodePool](../resources/embeddedsimactivationcodepool.md)|Update the properties of an [embeddedSIMActivationCodePool](../resources/embeddedsimactivationcodepool.md) object.|
|[Delete embeddedSIMActivationCodePool](../api/embeddedsimactivationcodepool-delete.md)|None|Deletes an [embeddedSIMActivationCodePool](../resources/embeddedsimactivationcodepool.md) object.|
|[assign](../api/embeddedsimactivationcodepool-assign.md)|[embeddedSIMActivationCodePoolAssignment](../resources/embeddedsimactivationcodepoolassignment.md) collection|**TODO: Add Description**|
|[List assignments](../api/embeddedsimactivationcodepool-list-assignments.md)|[embeddedSIMActivationCodePoolAssignment](../resources/embeddedsimactivationcodepoolassignment.md) collection|Get the embeddedSIMActivationCodePoolAssignment resources from the assignments navigation property.|
|[Create embeddedSIMActivationCodePoolAssignment](../api/embeddedsimactivationcodepool-post-assignments.md)|[embeddedSIMActivationCodePoolAssignment](../resources/embeddedsimactivationcodepoolassignment.md)|Create a new embeddedSIMActivationCodePoolAssignment object.|
|[List deviceStates](../api/embeddedsimactivationcodepool-list-devicestates.md)|[embeddedSIMDeviceState](../resources/embeddedsimdevicestate.md) collection|Get the embeddedSIMDeviceState resources from the deviceStates navigation property.|
|[Create embeddedSIMDeviceState](../api/embeddedsimactivationcodepool-post-devicestates.md)|[embeddedSIMDeviceState](../resources/embeddedsimdevicestate.md)|Create a new embeddedSIMDeviceState object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|activationCodeCount|Int32|The total count of activation codes which belong to this pool.|
|activationCodes|[embeddedSIMActivationCode](../resources/embeddedsimactivationcode.md) collection|The activation codes which belong to this pool. This navigation property is used to post activation codes to Intune but cannot be used to read activation codes from Intune.|
|createdDateTime|DateTimeOffset|The time the embedded SIM activation code pool was created. Generated service side.|
|displayName|String|The admin defined name of the embedded SIM activation code pool.|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|modifiedDateTime|DateTimeOffset|The time the embedded SIM activation code pool was last modified. Updated service side.|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|assignments|[embeddedSIMActivationCodePoolAssignment](../resources/embeddedsimactivationcodepoolassignment.md) collection|Navigational property to a list of targets to which this pool is assigned.|
|deviceStates|[embeddedSIMDeviceState](../resources/embeddedsimdevicestate.md) collection|Navigational property to a list of device states for this pool.|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.embeddedSIMActivationCodePool",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.embeddedSIMActivationCodePool",
  "id": "String (identifier)",
  "activationCodeCount": "Integer",
  "activationCodes": [
    {
      "@odata.type": "microsoft.graph.embeddedSIMActivationCode"
    }
  ],
  "createdDateTime": "String (timestamp)",
  "displayName": "String",
  "modifiedDateTime": "String (timestamp)"
}
```


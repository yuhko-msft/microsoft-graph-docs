---
title: "securityBaselineDeviceState resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# securityBaselineDeviceState resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List deviceStates](../api/intune-securitybaselinetemplate-list-devicestates.md)|[securityBaselineDeviceState](../resources/intune-securitybaselinedevicestate.md) collection|Get the securityBaselineDeviceState resources from the deviceStates navigation property.|
|[Create deviceStates](../api/intune-securitybaselinetemplate-post-devicestates.md)|[securityBaselineDeviceState](../resources/intune-securitybaselinedevicestate.md)|Create a new securityBaselineDeviceState object.|
|[Update deviceStates](../api/intune-securitybaselinetemplate-update-devicestates.md)|[securityBaselineDeviceState](../resources/intune-securitybaselinedevicestate.md)|Update the properties of a deviceStates object.|
|[Get deviceStates](../api/intune-securitybaselinetemplate-get-securitybaselinedevicestate.md)|[securityBaselineDeviceState](../resources/intune-securitybaselinedevicestate.md)|Read the properties and relationships of a [securityBaselineDeviceState](../resources/intune-securitybaselinedevicestate.md) object.|
|[Delete deviceStates](../api/intune-securitybaselinetemplate-delete-devicestates.md)|None|Delete a [securityBaselineDeviceState](../resources/intune-securitybaselinedevicestate.md) object.|
|[List securityBaselineDeviceStates](../api/intune-securitybaselinedevicestate-list.md)|[securityBaselineDeviceState](../resources/intune-securitybaselinedevicestate.md) collection|Get a list of the [securityBaselineDeviceState](../resources/securitybaselinedevicestate.md) objects and their properties.|
|[Create securityBaselineDeviceState](../api/intune-securitybaselinedevicestate-create.md)|[securityBaselineDeviceState](../resources/intune-securitybaselinedevicestate.md)|Create a new [securityBaselineDeviceState](../resources/intune-securitybaselinedevicestate.md) object.|
|[Get securityBaselineDeviceState](../api/intune-securitybaselinedevicestate-get.md)|[securityBaselineDeviceState](../resources/intune-securitybaselinedevicestate.md)|Read the properties and relationships of a [securityBaselineDeviceState](../resources/intune-securitybaselinedevicestate.md) object.|
|[Update securityBaselineDeviceState](../api/intune-securitybaselinedevicestate-update.md)|[securityBaselineDeviceState](../resources/intune-securitybaselinedevicestate.md)|Update the properties of a [securityBaselineDeviceState](../resources/intune-securitybaselinedevicestate.md) object.|
|[Delete securityBaselineDeviceState](../api/intune-securitybaselinedevicestate-delete.md)|None|Deletes a [securityBaselineDeviceState](../resources/intune-securitybaselinedevicestate.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|deviceDisplayName|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastReportedDateTime|DateTimeOffset|**TODO: Add Description**|
|managedDeviceId|String|**TODO: Add Description**|
|state|securityBaselineComplianceState|**TODO: Add Description**. Possible values are: `unknown`, `secure`, `notApplicable`, `notSecure`, `error`, `conflict`.|
|userPrincipalName|String|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.securityBaselineDeviceState",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.securityBaselineDeviceState",
  "id": "String (identifier)",
  "managedDeviceId": "String",
  "deviceDisplayName": "String",
  "userPrincipalName": "String",
  "state": "String",
  "lastReportedDateTime": "String (timestamp)"
}
```


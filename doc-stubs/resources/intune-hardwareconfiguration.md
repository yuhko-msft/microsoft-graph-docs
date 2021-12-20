---
title: "hardwareConfiguration resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# hardwareConfiguration resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List hardwareConfigurations](../api/intune-hardwareconfiguration-list.md)|[hardwareConfiguration](../resources/intune-hardwareconfiguration.md) collection|Get a list of the [hardwareConfiguration](../resources/intune-hardwareconfiguration.md) objects and their properties.|
|[Create hardwareConfiguration](../api/devicemanagement-post-hardwareconfigurations.md)|[hardwareConfiguration](../resources/intune-hardwareconfiguration.md)|Create a new [hardwareConfiguration](../resources/intune-hardwareconfiguration.md) object.|
|[Get hardwareConfiguration](../api/intune-hardwareconfiguration-get.md)|[hardwareConfiguration](../resources/intune-hardwareconfiguration.md)|Read the properties and relationships of a [hardwareConfiguration](../resources/intune-hardwareconfiguration.md) object.|
|[Update hardwareConfiguration](../api/intune-hardwareconfiguration-update.md)|[hardwareConfiguration](../resources/intune-hardwareconfiguration.md)|Update the properties of a [hardwareConfiguration](../resources/intune-hardwareconfiguration.md) object.|
|[Delete hardwareConfiguration](../api/intune-hardwareconfiguration-delete.md)|None|Deletes a [hardwareConfiguration](../resources/intune-hardwareconfiguration.md) object.|
|[assign](../api/intune-hardwareconfiguration-assign.md)|[hardwareConfigurationAssignment](../resources/intune-hardwareconfigurationassignment.md) collection|**TODO: Add Description**|
|[List assignments](../api/intune-hardwareconfiguration-list-assignments.md)|[hardwareConfigurationAssignment](../resources/intune-hardwareconfigurationassignment.md) collection|Get the hardwareConfigurationAssignment resources from the assignments navigation property.|
|[Create hardwareConfigurationAssignment](../api/intune-hardwareconfiguration-post-assignments.md)|[hardwareConfigurationAssignment](../resources/intune-hardwareconfigurationassignment.md)|Create a new hardwareConfigurationAssignment object.|
|[List deviceRunStates](../api/intune-hardwareconfiguration-list-devicerunstates.md)|[hardwareConfigurationDeviceState](../resources/intune-hardwareconfigurationdevicestate.md) collection|Get the hardwareConfigurationDeviceState resources from the deviceRunStates navigation property.|
|[Create hardwareConfigurationDeviceState](../api/intune-hardwareconfiguration-post-devicerunstates.md)|[hardwareConfigurationDeviceState](../resources/intune-hardwareconfigurationdevicestate.md)|Create a new hardwareConfigurationDeviceState object.|
|[List hardwareConfigurationRunSummary](../api/intune-hardwareconfiguration-list-runsummary.md)|[hardwareConfigurationRunSummary](../resources/intune-hardwareconfigurationrunsummary.md) collection|Get the hardwareConfigurationRunSummary resources from the runSummary navigation property.|
|[Create hardwareConfigurationRunSummary](../api/intune-hardwareconfiguration-post-runsummary.md)|[hardwareConfigurationRunSummary](../resources/intune-hardwareconfigurationrunsummary.md)|Create a new hardwareConfigurationRunSummary object.|
|[List userRunStates](../api/intune-hardwareconfiguration-list-userrunstates.md)|[hardwareConfigurationUserState](../resources/intune-hardwareconfigurationuserstate.md) collection|Get the hardwareConfigurationUserState resources from the userRunStates navigation property.|
|[Create hardwareConfigurationUserState](../api/intune-hardwareconfiguration-post-userrunstates.md)|[hardwareConfigurationUserState](../resources/intune-hardwareconfigurationuserstate.md)|Create a new hardwareConfigurationUserState object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|configurationFileContent|Binary|**TODO: Add Description**|
|createdDateTime|DateTimeOffset|**TODO: Add Description**|
|description|String|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|fileName|String|**TODO: Add Description**|
|hardwareConfigurationFormat|hardwareConfigurationFormat|**TODO: Add Description**. The possible values are: `dell`, `surface`, `surfaceDock`.|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description**|
|perDevicePasswordDisabled|Boolean|**TODO: Add Description**|
|roleScopeTagIds|String collection|**TODO: Add Description**|
|version|Int32|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|assignments|[hardwareConfigurationAssignment](../resources/intune-hardwareconfigurationassignment.md) collection|**TODO: Add Description**|
|deviceRunStates|[hardwareConfigurationDeviceState](../resources/intune-hardwareconfigurationdevicestate.md) collection|**TODO: Add Description**|
|runSummary|[hardwareConfigurationRunSummary](../resources/intune-hardwareconfigurationrunsummary.md)|**TODO: Add Description**|
|userRunStates|[hardwareConfigurationUserState](../resources/intune-hardwareconfigurationuserstate.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.hardwareConfiguration",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.hardwareConfiguration",
  "id": "String (identifier)",
  "version": "Integer",
  "displayName": "String",
  "description": "String",
  "createdDateTime": "String (timestamp)",
  "lastModifiedDateTime": "String (timestamp)",
  "fileName": "String",
  "configurationFileContent": "Binary",
  "hardwareConfigurationFormat": "String",
  "roleScopeTagIds": [
    "String"
  ],
  "perDevicePasswordDisabled": "Boolean"
}
```


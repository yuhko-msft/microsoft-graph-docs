---
title: "deviceManagementIntent resource type"
description: "Entity that represents an intent to apply settings to a device"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceManagementIntent resource type

Namespace: microsoft.graph



Entity that represents an intent to apply settings to a device


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List deviceManagementIntents](../api/devicemanagementintent-list.md)|[deviceManagementIntent](../resources/devicemanagementintent.md) collection|Get a list of the [deviceManagementIntent](../resources/devicemanagementintent.md) objects and their properties.|
|[Create deviceManagementIntent](../api/devicemanagementintent-create.md)|[deviceManagementIntent](../resources/devicemanagementintent.md)|Create a new [deviceManagementIntent](../resources/devicemanagementintent.md) object.|
|[Get deviceManagementIntent](../api/devicemanagementintent-get.md)|[deviceManagementIntent](../resources/devicemanagementintent.md)|Read the properties and relationships of a [deviceManagementIntent](../resources/devicemanagementintent.md) object.|
|[Update deviceManagementIntent](../api/devicemanagementintent-update.md)|[deviceManagementIntent](../resources/devicemanagementintent.md)|Update the properties of a [deviceManagementIntent](../resources/devicemanagementintent.md) object.|
|[Delete deviceManagementIntent](../api/devicemanagementintent-delete.md)|None|Deletes a [deviceManagementIntent](../resources/devicemanagementintent.md) object.|
|[assign](../api/devicemanagementintent-assign.md)|None|**TODO: Add Description**|
|[createCopy](../api/devicemanagementintent-createcopy.md)|[deviceManagementIntent](../resources/devicemanagementintent.md)|**TODO: Add Description**|
|[migrateToTemplate](../api/devicemanagementintent-migratetotemplate.md)|None|**TODO: Add Description**|
|[updateSettings](../api/devicemanagementintent-updatesettings.md)|None|**TODO: Add Description**|
|[compare](../api/devicemanagementintent-compare.md)|[deviceManagementSettingComparison](../resources/devicemanagementsettingcomparison.md) collection|**TODO: Add Description**|
|[List assignments](../api/devicemanagementintent-list-assignments.md)|[deviceManagementIntentAssignment](../resources/devicemanagementintentassignment.md) collection|Get the deviceManagementIntentAssignment resources from the assignments navigation property.|
|[Create deviceManagementIntentAssignment](../api/devicemanagementintent-post-assignments.md)|[deviceManagementIntentAssignment](../resources/devicemanagementintentassignment.md)|Create a new deviceManagementIntentAssignment object.|
|[List categories](../api/devicemanagementintent-list-categories.md)|[deviceManagementIntentSettingCategory](../resources/devicemanagementintentsettingcategory.md) collection|Get the deviceManagementIntentSettingCategory resources from the categories navigation property.|
|[Create deviceManagementIntentSettingCategory](../api/devicemanagementintent-post-categories.md)|[deviceManagementIntentSettingCategory](../resources/devicemanagementintentsettingcategory.md)|Create a new deviceManagementIntentSettingCategory object.|
|[List deviceSettingStateSummaries](../api/devicemanagementintent-list-devicesettingstatesummaries.md)|[deviceManagementIntentDeviceSettingStateSummary](../resources/devicemanagementintentdevicesettingstatesummary.md) collection|Get the deviceManagementIntentDeviceSettingStateSummary resources from the deviceSettingStateSummaries navigation property.|
|[Create deviceManagementIntentDeviceSettingStateSummary](../api/devicemanagementintent-post-devicesettingstatesummaries.md)|[deviceManagementIntentDeviceSettingStateSummary](../resources/devicemanagementintentdevicesettingstatesummary.md)|Create a new deviceManagementIntentDeviceSettingStateSummary object.|
|[List deviceStates](../api/devicemanagementintent-list-devicestates.md)|[deviceManagementIntentDeviceState](../resources/devicemanagementintentdevicestate.md) collection|Get the deviceManagementIntentDeviceState resources from the deviceStates navigation property.|
|[Create deviceManagementIntentDeviceState](../api/devicemanagementintent-post-devicestates.md)|[deviceManagementIntentDeviceState](../resources/devicemanagementintentdevicestate.md)|Create a new deviceManagementIntentDeviceState object.|
|[List deviceManagementIntentDeviceStateSummary](../api/devicemanagementintent-list-devicestatesummary.md)|[deviceManagementIntentDeviceStateSummary](../resources/devicemanagementintentdevicestatesummary.md) collection|Get the deviceManagementIntentDeviceStateSummary resources from the deviceStateSummary navigation property.|
|[Create deviceManagementIntentDeviceStateSummary](../api/devicemanagementintent-post-devicestatesummary.md)|[deviceManagementIntentDeviceStateSummary](../resources/devicemanagementintentdevicestatesummary.md)|Create a new deviceManagementIntentDeviceStateSummary object.|
|[List settings](../api/devicemanagementintent-list-settings.md)|[deviceManagementSettingInstance](../resources/devicemanagementsettinginstance.md) collection|Get the deviceManagementSettingInstance resources from the settings navigation property.|
|[Create deviceManagementSettingInstance](../api/devicemanagementintent-post-settings.md)|[deviceManagementSettingInstance](../resources/devicemanagementsettinginstance.md)|Create a new deviceManagementSettingInstance object.|
|[List userStates](../api/devicemanagementintent-list-userstates.md)|[deviceManagementIntentUserState](../resources/devicemanagementintentuserstate.md) collection|Get the deviceManagementIntentUserState resources from the userStates navigation property.|
|[Create deviceManagementIntentUserState](../api/devicemanagementintent-post-userstates.md)|[deviceManagementIntentUserState](../resources/devicemanagementintentuserstate.md)|Create a new deviceManagementIntentUserState object.|
|[List deviceManagementIntentUserStateSummary](../api/devicemanagementintent-list-userstatesummary.md)|[deviceManagementIntentUserStateSummary](../resources/devicemanagementintentuserstatesummary.md) collection|Get the deviceManagementIntentUserStateSummary resources from the userStateSummary navigation property.|
|[Create deviceManagementIntentUserStateSummary](../api/devicemanagementintent-post-userstatesummary.md)|[deviceManagementIntentUserStateSummary](../resources/devicemanagementintentuserstatesummary.md)|Create a new deviceManagementIntentUserStateSummary object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|description|String|The user given description|
|displayName|String|The user given display name|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|isAssigned|Boolean|Signifies whether or not the intent is assigned to users|
|lastModifiedDateTime|DateTimeOffset|When the intent was last modified|
|roleScopeTagIds|String collection|List of Scope Tags for this Entity instance.|
|templateId|String|The ID of the template this intent was created from (if any)|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|assignments|[deviceManagementIntentAssignment](../resources/devicemanagementintentassignment.md) collection|Collection of assignments|
|categories|[deviceManagementIntentSettingCategory](../resources/devicemanagementintentsettingcategory.md) collection|Collection of setting categories within the intent|
|deviceSettingStateSummaries|[deviceManagementIntentDeviceSettingStateSummary](../resources/devicemanagementintentdevicesettingstatesummary.md) collection|Collection of settings and their states and counts of devices that belong to corresponding state for all settings within the intent|
|deviceStates|[deviceManagementIntentDeviceState](../resources/devicemanagementintentdevicestate.md) collection|Collection of states of all devices that the intent is applied to|
|deviceStateSummary|[deviceManagementIntentDeviceStateSummary](../resources/devicemanagementintentdevicestatesummary.md)|A summary of device states and counts of devices that belong to corresponding state for all devices that the intent is applied to|
|settings|[deviceManagementSettingInstance](../resources/devicemanagementsettinginstance.md) collection|Collection of all settings to be applied|
|userStates|[deviceManagementIntentUserState](../resources/devicemanagementintentuserstate.md) collection|Collection of states of all users that the intent is applied to|
|userStateSummary|[deviceManagementIntentUserStateSummary](../resources/devicemanagementintentuserstatesummary.md)|A summary of user states and counts of users that belong to corresponding state for all users that the intent is applied to|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.deviceManagementIntent",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceManagementIntent",
  "id": "String (identifier)",
  "description": "String",
  "displayName": "String",
  "isAssigned": "Boolean",
  "lastModifiedDateTime": "String (timestamp)",
  "roleScopeTagIds": [
    "String"
  ],
  "templateId": "String"
}
```


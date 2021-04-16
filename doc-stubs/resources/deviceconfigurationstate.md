---
title: "deviceConfigurationState resource type"
description: "Device Configuration State for a given device."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceConfigurationState resource type

Namespace: microsoft.graph



Device Configuration State for a given device.


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List deviceConfigurationStates](../api/deviceconfigurationstate-list.md)|[deviceConfigurationState](../resources/deviceconfigurationstate.md) collection|Get a list of the [deviceConfigurationState](../resources/deviceconfigurationstate.md) objects and their properties.|
|[Create deviceConfigurationState](../api/deviceconfigurationstate-create.md)|[deviceConfigurationState](../resources/deviceconfigurationstate.md)|Create a new [deviceConfigurationState](../resources/deviceconfigurationstate.md) object.|
|[Get deviceConfigurationState](../api/deviceconfigurationstate-get.md)|[deviceConfigurationState](../resources/deviceconfigurationstate.md)|Read the properties and relationships of a [deviceConfigurationState](../resources/deviceconfigurationstate.md) object.|
|[Update deviceConfigurationState](../api/deviceconfigurationstate-update.md)|[deviceConfigurationState](../resources/deviceconfigurationstate.md)|Update the properties of a [deviceConfigurationState](../resources/deviceconfigurationstate.md) object.|
|[Delete deviceConfigurationState](../api/deviceconfigurationstate-delete.md)|None|Deletes a [deviceConfigurationState](../resources/deviceconfigurationstate.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|displayName|String|The name of the policy for this policyBase|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|platformType|policyPlatformType|Platform type that the policy applies to. Possible values are: `android`, `androidForWork`, `iOS`, `macOS`, `windowsPhone81`, `windows81AndLater`, `windows10AndLater`, `androidWorkProfile`, `windows10XProfile`, `all`.|
|settingCount|Int32|Count of how many setting a policy holds|
|settingStates|[deviceConfigurationSettingState](../resources/deviceconfigurationsettingstate.md) collection|**TODO: Add Description**|
|state|complianceStatus|The compliance state of the policy. Possible values are: `unknown`, `notApplicable`, `compliant`, `remediated`, `nonCompliant`, `error`, `conflict`, `notAssigned`.|
|userId|String|User unique identifier, must be Guid|
|userPrincipalName|String|User Principal Name|
|version|Int32|The version of the policy|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.deviceConfigurationState",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceConfigurationState",
  "id": "String (identifier)",
  "displayName": "String",
  "platformType": "String",
  "settingCount": "Integer",
  "settingStates": [
    {
      "@odata.type": "microsoft.graph.deviceConfigurationSettingState"
    }
  ],
  "state": "String",
  "userId": "String",
  "userPrincipalName": "String",
  "version": "Integer"
}
```


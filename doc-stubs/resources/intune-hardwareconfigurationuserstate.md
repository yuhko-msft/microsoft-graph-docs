---
title: "hardwareConfigurationUserState resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# hardwareConfigurationUserState resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List hardwareConfigurationUserStates](../api/intune-hardwareconfigurationuserstate-list.md)|[hardwareConfigurationUserState](../resources/intune-hardwareconfigurationuserstate.md) collection|Get a list of the [hardwareConfigurationUserState](../resources/intune-hardwareconfigurationuserstate.md) objects and their properties.|
|[Create hardwareConfigurationUserState](../api/hardwareconfiguration-post-userrunstates.md)|[hardwareConfigurationUserState](../resources/intune-hardwareconfigurationuserstate.md)|Create a new [hardwareConfigurationUserState](../resources/intune-hardwareconfigurationuserstate.md) object.|
|[Get hardwareConfigurationUserState](../api/intune-hardwareconfigurationuserstate-get.md)|[hardwareConfigurationUserState](../resources/intune-hardwareconfigurationuserstate.md)|Read the properties and relationships of a [hardwareConfigurationUserState](../resources/intune-hardwareconfigurationuserstate.md) object.|
|[Update hardwareConfigurationUserState](../api/intune-hardwareconfigurationuserstate-update.md)|[hardwareConfigurationUserState](../resources/intune-hardwareconfigurationuserstate.md)|Update the properties of a [hardwareConfigurationUserState](../resources/intune-hardwareconfigurationuserstate.md) object.|
|[Delete hardwareConfigurationUserState](../api/intune-hardwareconfigurationuserstate-delete.md)|None|Deletes a [hardwareConfigurationUserState](../resources/intune-hardwareconfigurationuserstate.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|errorDeviceCount|Int32|**TODO: Add Description**|
|failedDeviceCount|Int32|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|lastStateUpdateDateTime|DateTimeOffset|**TODO: Add Description**|
|notApplicableDeviceCount|Int32|**TODO: Add Description**|
|pendingDeviceCount|Int32|**TODO: Add Description**|
|successfulDeviceCount|Int32|**TODO: Add Description**|
|unknownDeviceCount|Int32|**TODO: Add Description**|
|upn|String|**TODO: Add Description**|
|userEmail|String|**TODO: Add Description**|
|userName|String|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.hardwareConfigurationUserState",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.hardwareConfigurationUserState",
  "id": "String (identifier)",
  "upn": "String",
  "userEmail": "String",
  "userName": "String",
  "lastStateUpdateDateTime": "String (timestamp)",
  "successfulDeviceCount": "Integer",
  "failedDeviceCount": "Integer",
  "pendingDeviceCount": "Integer",
  "errorDeviceCount": "Integer",
  "notApplicableDeviceCount": "Integer",
  "unknownDeviceCount": "Integer"
}
```


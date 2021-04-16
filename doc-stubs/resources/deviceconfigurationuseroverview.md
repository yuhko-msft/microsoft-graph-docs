---
title: "deviceConfigurationUserOverview resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceConfigurationUserOverview resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List deviceConfigurationUserOverviews](../api/deviceconfigurationuseroverview-list.md)|[deviceConfigurationUserOverview](../resources/deviceconfigurationuseroverview.md) collection|Get a list of the [deviceConfigurationUserOverview](../resources/deviceconfigurationuseroverview.md) objects and their properties.|
|[Create deviceConfigurationUserOverview](../api/deviceconfigurationuseroverview-create.md)|[deviceConfigurationUserOverview](../resources/deviceconfigurationuseroverview.md)|Create a new [deviceConfigurationUserOverview](../resources/deviceconfigurationuseroverview.md) object.|
|[Get deviceConfigurationUserOverview](../api/deviceconfigurationuseroverview-get.md)|[deviceConfigurationUserOverview](../resources/deviceconfigurationuseroverview.md)|Read the properties and relationships of a [deviceConfigurationUserOverview](../resources/deviceconfigurationuseroverview.md) object.|
|[Update deviceConfigurationUserOverview](../api/deviceconfigurationuseroverview-update.md)|[deviceConfigurationUserOverview](../resources/deviceconfigurationuseroverview.md)|Update the properties of a [deviceConfigurationUserOverview](../resources/deviceconfigurationuseroverview.md) object.|
|[Delete deviceConfigurationUserOverview](../api/deviceconfigurationuseroverview-delete.md)|None|Deletes a [deviceConfigurationUserOverview](../resources/deviceconfigurationuseroverview.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|configurationVersion|Int32|Version of the policy for that overview|
|conflictCount|Int32|Number of users in conflict|
|errorCount|Int32|Number of error Users|
|failedCount|Int32|Number of failed Users|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastUpdateDateTime|DateTimeOffset|Last update time|
|notApplicableCount|Int32|Number of not applicable users|
|pendingCount|Int32|Number of pending Users|
|successCount|Int32|Number of succeeded Users|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.deviceConfigurationUserOverview",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceConfigurationUserOverview",
  "id": "String (identifier)",
  "configurationVersion": "Integer",
  "conflictCount": "Integer",
  "errorCount": "Integer",
  "failedCount": "Integer",
  "lastUpdateDateTime": "String (timestamp)",
  "notApplicableCount": "Integer",
  "pendingCount": "Integer",
  "successCount": "Integer"
}
```


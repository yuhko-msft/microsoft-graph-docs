---
title: "deviceComplianceUserOverview resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceComplianceUserOverview resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List deviceComplianceUserOverviews](../api/devicecomplianceuseroverview-list.md)|[deviceComplianceUserOverview](../resources/devicecomplianceuseroverview.md) collection|Get a list of the [deviceComplianceUserOverview](../resources/devicecomplianceuseroverview.md) objects and their properties.|
|[Create deviceComplianceUserOverview](../api/devicecomplianceuseroverview-create.md)|[deviceComplianceUserOverview](../resources/devicecomplianceuseroverview.md)|Create a new [deviceComplianceUserOverview](../resources/devicecomplianceuseroverview.md) object.|
|[Get deviceComplianceUserOverview](../api/devicecomplianceuseroverview-get.md)|[deviceComplianceUserOverview](../resources/devicecomplianceuseroverview.md)|Read the properties and relationships of a [deviceComplianceUserOverview](../resources/devicecomplianceuseroverview.md) object.|
|[Update deviceComplianceUserOverview](../api/devicecomplianceuseroverview-update.md)|[deviceComplianceUserOverview](../resources/devicecomplianceuseroverview.md)|Update the properties of a [deviceComplianceUserOverview](../resources/devicecomplianceuseroverview.md) object.|
|[Delete deviceComplianceUserOverview](../api/devicecomplianceuseroverview-delete.md)|None|Deletes a [deviceComplianceUserOverview](../resources/devicecomplianceuseroverview.md) object.|

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
  "@odata.type": "microsoft.graph.deviceComplianceUserOverview",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceComplianceUserOverview",
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


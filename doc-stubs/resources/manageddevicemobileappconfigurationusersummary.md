---
title: "managedDeviceMobileAppConfigurationUserSummary resource type"
description: "Contains properties, inherited properties and actions for an MDM mobile app configuration user status summary."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# managedDeviceMobileAppConfigurationUserSummary resource type

Namespace: microsoft.graph



Contains properties, inherited properties and actions for an MDM mobile app configuration user status summary.


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List managedDeviceMobileAppConfigurationUserSummaries](../api/manageddevicemobileappconfigurationusersummary-list.md)|[managedDeviceMobileAppConfigurationUserSummary](../resources/manageddevicemobileappconfigurationusersummary.md) collection|Get a list of the [managedDeviceMobileAppConfigurationUserSummary](../resources/manageddevicemobileappconfigurationusersummary.md) objects and their properties.|
|[Create managedDeviceMobileAppConfigurationUserSummary](../api/manageddevicemobileappconfigurationusersummary-create.md)|[managedDeviceMobileAppConfigurationUserSummary](../resources/manageddevicemobileappconfigurationusersummary.md)|Create a new [managedDeviceMobileAppConfigurationUserSummary](../resources/manageddevicemobileappconfigurationusersummary.md) object.|
|[Get managedDeviceMobileAppConfigurationUserSummary](../api/manageddevicemobileappconfigurationusersummary-get.md)|[managedDeviceMobileAppConfigurationUserSummary](../resources/manageddevicemobileappconfigurationusersummary.md)|Read the properties and relationships of a [managedDeviceMobileAppConfigurationUserSummary](../resources/manageddevicemobileappconfigurationusersummary.md) object.|
|[Update managedDeviceMobileAppConfigurationUserSummary](../api/manageddevicemobileappconfigurationusersummary-update.md)|[managedDeviceMobileAppConfigurationUserSummary](../resources/manageddevicemobileappconfigurationusersummary.md)|Update the properties of a [managedDeviceMobileAppConfigurationUserSummary](../resources/manageddevicemobileappconfigurationusersummary.md) object.|
|[Delete managedDeviceMobileAppConfigurationUserSummary](../api/manageddevicemobileappconfigurationusersummary-delete.md)|None|Deletes a [managedDeviceMobileAppConfigurationUserSummary](../resources/manageddevicemobileappconfigurationusersummary.md) object.|

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
  "@odata.type": "microsoft.graph.managedDeviceMobileAppConfigurationUserSummary",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.managedDeviceMobileAppConfigurationUserSummary",
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


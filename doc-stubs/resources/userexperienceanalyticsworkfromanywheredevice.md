---
title: "userExperienceAnalyticsWorkFromAnywhereDevice resource type"
description: "The user experience analytics Device for work from anywhere report"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# userExperienceAnalyticsWorkFromAnywhereDevice resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

The user experience analytics Device for work from anywhere report


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List userExperienceAnalyticsWorkFromAnywhereDevices](../api/userexperienceanalyticsworkfromanywheredevice-list.md)|[userExperienceAnalyticsWorkFromAnywhereDevice](../resources/userexperienceanalyticsworkfromanywheredevice.md) collection|Get a list of the [userExperienceAnalyticsWorkFromAnywhereDevice](../resources/userexperienceanalyticsworkfromanywheredevice.md) objects and their properties.|
|[Create userExperienceAnalyticsWorkFromAnywhereDevice](../api/userexperienceanalyticsworkfromanywheredevice-create.md)|[userExperienceAnalyticsWorkFromAnywhereDevice](../resources/userexperienceanalyticsworkfromanywheredevice.md)|Create a new [userExperienceAnalyticsWorkFromAnywhereDevice](../resources/userexperienceanalyticsworkfromanywheredevice.md) object.|
|[Get userExperienceAnalyticsWorkFromAnywhereDevice](../api/userexperienceanalyticsworkfromanywheredevice-get.md)|[userExperienceAnalyticsWorkFromAnywhereDevice](../resources/userexperienceanalyticsworkfromanywheredevice.md)|Read the properties and relationships of a [userExperienceAnalyticsWorkFromAnywhereDevice](../resources/userexperienceanalyticsworkfromanywheredevice.md) object.|
|[Update userExperienceAnalyticsWorkFromAnywhereDevice](../api/userexperienceanalyticsworkfromanywheredevice-update.md)|[userExperienceAnalyticsWorkFromAnywhereDevice](../resources/userexperienceanalyticsworkfromanywheredevice.md)|Update the properties of a [userExperienceAnalyticsWorkFromAnywhereDevice](../resources/userexperienceanalyticsworkfromanywheredevice.md) object.|
|[Delete userExperienceAnalyticsWorkFromAnywhereDevice](../api/userexperienceanalyticsworkfromanywheredevice-delete.md)|None|Deletes a [userExperienceAnalyticsWorkFromAnywhereDevice](../resources/userexperienceanalyticsworkfromanywheredevice.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|autoPilotProfileAssigned|Boolean|The user experience analytics work from anywhere intune device's autopilotProfileAssigned.|
|autoPilotRegistered|Boolean|The user experience work from anywhere intune device's autopilotRegistered.|
|azureAdDeviceId|String|The user experience work from anywhere azure Ad device Id.|
|azureAdJoinType|String|The user experience work from anywhere device's azure Ad joinType.|
|azureAdRegistered|Boolean|The user experience work from anywhere device's azureAdRegistered.|
|deviceName|String|The work from anywhere device's name.|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|managedBy|String|The user experience work from anywhere management agent of the device.|
|manufacturer|String|The user experience work from anywhere device's manufacturer.|
|model|String|The user experience work from anywhere device's model.|
|osDescription|String|The user experience work from anywhere device's OS Description.|
|osVersion|String|The user experience work from anywhere device's OS Version.|
|ownership|String|The user experience work from anywhere device's ownership.|
|serialNumber|String|The user experience work from anywhere device's serial number.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.userExperienceAnalyticsWorkFromAnywhereDevice",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.userExperienceAnalyticsWorkFromAnywhereDevice",
  "id": "String (identifier)",
  "autoPilotProfileAssigned": "Boolean",
  "autoPilotRegistered": "Boolean",
  "azureAdDeviceId": "String",
  "azureAdJoinType": "String",
  "azureAdRegistered": "Boolean",
  "deviceName": "String",
  "managedBy": "String",
  "manufacturer": "String",
  "model": "String",
  "osDescription": "String",
  "osVersion": "String",
  "ownership": "String",
  "serialNumber": "String"
}
```


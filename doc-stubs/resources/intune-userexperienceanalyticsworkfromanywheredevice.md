---
title: "userExperienceAnalyticsWorkFromAnywhereDevice resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# userExperienceAnalyticsWorkFromAnywhereDevice resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List userExperienceAnalyticsWorkFromAnywhereDevices](../api/intune-userexperienceanalyticsworkfromanywheredevice-list.md)|[userExperienceAnalyticsWorkFromAnywhereDevice](../resources/intune-userexperienceanalyticsworkfromanywheredevice.md) collection|Get a list of the [userExperienceAnalyticsWorkFromAnywhereDevice](../resources/userexperienceanalyticsworkfromanywheredevice.md) objects and their properties.|
|[Create userExperienceAnalyticsWorkFromAnywhereDevice](../api/intune-userexperienceanalyticsworkfromanywheredevice-create.md)|[userExperienceAnalyticsWorkFromAnywhereDevice](../resources/intune-userexperienceanalyticsworkfromanywheredevice.md)|Create a new [userExperienceAnalyticsWorkFromAnywhereDevice](../resources/intune-userexperienceanalyticsworkfromanywheredevice.md) object.|
|[Get userExperienceAnalyticsWorkFromAnywhereDevice](../api/intune-userexperienceanalyticsworkfromanywheredevice-get.md)|[userExperienceAnalyticsWorkFromAnywhereDevice](../resources/intune-userexperienceanalyticsworkfromanywheredevice.md)|Read the properties and relationships of a [userExperienceAnalyticsWorkFromAnywhereDevice](../resources/intune-userexperienceanalyticsworkfromanywheredevice.md) object.|
|[Update userExperienceAnalyticsWorkFromAnywhereDevice](../api/intune-userexperienceanalyticsworkfromanywheredevice-update.md)|[userExperienceAnalyticsWorkFromAnywhereDevice](../resources/intune-userexperienceanalyticsworkfromanywheredevice.md)|Update the properties of a [userExperienceAnalyticsWorkFromAnywhereDevice](../resources/intune-userexperienceanalyticsworkfromanywheredevice.md) object.|
|[Delete userExperienceAnalyticsWorkFromAnywhereDevice](../api/intune-userexperienceanalyticsworkfromanywheredevice-delete.md)|None|Deletes a [userExperienceAnalyticsWorkFromAnywhereDevice](../resources/intune-userexperienceanalyticsworkfromanywheredevice.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|autoPilotProfileAssigned|Boolean|**TODO: Add Description**|
|autoPilotRegistered|Boolean|**TODO: Add Description**|
|azureAdDeviceId|String|**TODO: Add Description**|
|azureAdJoinType|String|**TODO: Add Description**|
|azureAdRegistered|Boolean|**TODO: Add Description**|
|deviceName|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|managedBy|String|**TODO: Add Description**|
|manufacturer|String|**TODO: Add Description**|
|model|String|**TODO: Add Description**|
|ownership|String|**TODO: Add Description**|
|serialNumber|String|**TODO: Add Description**|

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
  "deviceName": "String",
  "serialNumber": "String",
  "manufacturer": "String",
  "model": "String",
  "ownership": "String",
  "managedBy": "String",
  "autoPilotRegistered": "Boolean",
  "autoPilotProfileAssigned": "Boolean",
  "azureAdRegistered": "Boolean",
  "azureAdDeviceId": "String",
  "azureAdJoinType": "String"
}
```


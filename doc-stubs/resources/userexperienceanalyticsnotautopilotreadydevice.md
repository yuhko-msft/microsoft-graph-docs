---
title: "userExperienceAnalyticsNotAutopilotReadyDevice resource type"
description: "The user experience analytics Device not windows autopilot ready."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# userExperienceAnalyticsNotAutopilotReadyDevice resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

The user experience analytics Device not windows autopilot ready.

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List userExperienceAnalyticsNotAutopilotReadyDevices](../api/userexperienceanalyticsnotautopilotreadydevice-list.md)|[userExperienceAnalyticsNotAutopilotReadyDevice](../resources/userexperienceanalyticsnotautopilotreadydevice.md) collection|Get a list of the [userExperienceAnalyticsNotAutopilotReadyDevice](../resources/userexperienceanalyticsnotautopilotreadydevice.md) objects and their properties.|
|[Create userExperienceAnalyticsNotAutopilotReadyDevice](../api/userexperienceanalyticsnotautopilotreadydevice-create.md)|[userExperienceAnalyticsNotAutopilotReadyDevice](../resources/userexperienceanalyticsnotautopilotreadydevice.md)|Create a new [userExperienceAnalyticsNotAutopilotReadyDevice](../resources/userexperienceanalyticsnotautopilotreadydevice.md) object.|
|[Get userExperienceAnalyticsNotAutopilotReadyDevice](../api/userexperienceanalyticsnotautopilotreadydevice-get.md)|[userExperienceAnalyticsNotAutopilotReadyDevice](../resources/userexperienceanalyticsnotautopilotreadydevice.md)|Read the properties and relationships of a [userExperienceAnalyticsNotAutopilotReadyDevice](../resources/userexperienceanalyticsnotautopilotreadydevice.md) object.|
|[Update userExperienceAnalyticsNotAutopilotReadyDevice](../api/userexperienceanalyticsnotautopilotreadydevice-update.md)|[userExperienceAnalyticsNotAutopilotReadyDevice](../resources/userexperienceanalyticsnotautopilotreadydevice.md)|Update the properties of a [userExperienceAnalyticsNotAutopilotReadyDevice](../resources/userexperienceanalyticsnotautopilotreadydevice.md) object.|
|[Delete userExperienceAnalyticsNotAutopilotReadyDevice](../api/userexperienceanalyticsnotautopilotreadydevice-delete.md)|None|Deletes a [userExperienceAnalyticsNotAutopilotReadyDevice](../resources/userexperienceanalyticsnotautopilotreadydevice.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|autoPilotProfileAssigned|Boolean|The intune device's autopilotProfileAssigned.|
|autoPilotRegistered|Boolean|The intune device's autopilotRegistered.|
|azureAdJoinType|String|The intune device's azure Ad joinType.|
|azureAdRegistered|Boolean|The intune device's azureAdRegistered.|
|deviceName|String|The intune device's name.|
|id|String|The unique identifier of the user experience analytics intune device.|
|managedBy|String|The intune device's managed by.|
|manufacturer|String|The intune device's manufacturer.|
|model|String|The intune device's model.|
|serialNumber|String|The intune device's serial number.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.userExperienceAnalyticsNotAutopilotReadyDevice",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.userExperienceAnalyticsNotAutopilotReadyDevice",
  "id": "String (identifier)",
  "deviceName": "String",
  "serialNumber": "String",
  "manufacturer": "String",
  "model": "String",
  "managedBy": "String",
  "autoPilotRegistered": "Boolean",
  "autoPilotProfileAssigned": "Boolean",
  "azureAdRegistered": "Boolean",
  "azureAdJoinType": "String"
}
```


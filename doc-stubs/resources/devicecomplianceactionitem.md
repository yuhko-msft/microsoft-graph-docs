---
title: "deviceComplianceActionItem resource type"
description: "Scheduled Action Configuration"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceComplianceActionItem resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Scheduled Action Configuration


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List deviceComplianceActionItems](../api/devicecomplianceactionitem-list.md)|[deviceComplianceActionItem](../resources/devicecomplianceactionitem.md) collection|Get a list of the [deviceComplianceActionItem](../resources/devicecomplianceactionitem.md) objects and their properties.|
|[Create deviceComplianceActionItem](../api/devicecomplianceactionitem-create.md)|[deviceComplianceActionItem](../resources/devicecomplianceactionitem.md)|Create a new [deviceComplianceActionItem](../resources/devicecomplianceactionitem.md) object.|
|[Get deviceComplianceActionItem](../api/devicecomplianceactionitem-get.md)|[deviceComplianceActionItem](../resources/devicecomplianceactionitem.md)|Read the properties and relationships of a [deviceComplianceActionItem](../resources/devicecomplianceactionitem.md) object.|
|[Update deviceComplianceActionItem](../api/devicecomplianceactionitem-update.md)|[deviceComplianceActionItem](../resources/devicecomplianceactionitem.md)|Update the properties of a [deviceComplianceActionItem](../resources/devicecomplianceactionitem.md) object.|
|[Delete deviceComplianceActionItem](../api/devicecomplianceactionitem-delete.md)|None|Deletes a [deviceComplianceActionItem](../resources/devicecomplianceactionitem.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|actionType|deviceComplianceActionType|What action to take. Possible values are: `noAction`, `notification`, `block`, `retire`, `wipe`, `removeResourceAccessProfiles`, `pushNotification`, `remoteLock`.|
|gracePeriodHours|Int32|Number of hours to wait till the action will be enforced. Valid values 0 to 8760|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|notificationMessageCCList|String collection|A list of group IDs to speicify who to CC this notification message to.|
|notificationTemplateId|String|What notification Message template to use|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.deviceComplianceActionItem",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceComplianceActionItem",
  "id": "String (identifier)",
  "actionType": "String",
  "gracePeriodHours": "Integer",
  "notificationMessageCCList": [
    "String"
  ],
  "notificationTemplateId": "String"
}
```


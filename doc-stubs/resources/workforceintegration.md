---
title: "workforceIntegration resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# workforceIntegration resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [changeTrackedEntity](../resources/changetrackedentity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List workforceIntegrations](../api/workforceintegration-list.md)|[workforceIntegration](../resources/workforceintegration.md) collection|Get a list of the [workforceIntegration](../resources/workforceintegration.md) objects and their properties.|
|[Create workforceIntegration](../api/workforceintegration-create.md)|[workforceIntegration](../resources/workforceintegration.md)|Create a new [workforceIntegration](../resources/workforceintegration.md) object.|
|[Get workforceIntegration](../api/workforceintegration-get.md)|[workforceIntegration](../resources/workforceintegration.md)|Read the properties and relationships of a [workforceIntegration](../resources/workforceintegration.md) object.|
|[Update workforceIntegration](../api/workforceintegration-update.md)|[workforceIntegration](../resources/workforceintegration.md)|Update the properties of a [workforceIntegration](../resources/workforceintegration.md) object.|
|[Delete workforceIntegration](../api/workforceintegration-delete.md)|None|Deletes a [workforceIntegration](../resources/workforceintegration.md) object.|
|[stageForDeletion](../api/workforceintegration-stagefordeletion.md)|None|**TODO: Add Description**|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|apiVersion|Int32|**TODO: Add Description**|
|createdBy|[identitySet](../resources/identityset.md)|**TODO: Add Description** Inherited from [changeTrackedEntity](../resources/changetrackedentity.md).|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [changeTrackedEntity](../resources/changetrackedentity.md).|
|displayName|String|**TODO: Add Description**|
|eligibilityFilteringEnabledEntities|eligibilityFilteringEnabledEntities|**TODO: Add Description**. The possible values are: `none`, `swapRequest`, `offerShiftRequest`, `unknownFutureValue`.|
|encryption|[workforceIntegrationEncryption](../resources/workforceintegrationencryption.md)|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [changeTrackedEntity](../resources/changetrackedentity.md).|
|isActive|Boolean|**TODO: Add Description**|
|lastModifiedBy|[identitySet](../resources/identityset.md)|**TODO: Add Description** Inherited from [changeTrackedEntity](../resources/changetrackedentity.md).|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [changeTrackedEntity](../resources/changetrackedentity.md).|
|supportedEntities|workforceIntegrationSupportedEntities|**TODO: Add Description**. The possible values are: `none`, `shift`, `swapRequest`, `userShiftPreferences`, `openShift`, `openShiftRequest`, `offerShiftRequest`, `unknownFutureValue`, `timeCard`, `timeOffReason`, `timeOff`, `timeOffRequest`. Note that you must use the `Prefer: include - unknown -enum-members` request header to get the following value(s) in this [evolvable enum](/graph/best-practices-concept#handling-future-members-in-evolvable-enumerations): `timeCard` , `timeOffReason` , `timeOff` , `timeOffRequest`.|
|supports|workforceIntegrationSupportedEntities|**TODO: Add Description**. The possible values are: `none`, `shift`, `swapRequest`, `userShiftPreferences`, `openShift`, `openShiftRequest`, `offerShiftRequest`, `unknownFutureValue`, `timeCard`, `timeOffReason`, `timeOff`, `timeOffRequest`. Note that you must use the `Prefer: include - unknown -enum-members` request header to get the following value(s) in this [evolvable enum](/graph/best-practices-concept#handling-future-members-in-evolvable-enumerations): `timeCard` , `timeOffReason` , `timeOff` , `timeOffRequest`.|
|url|String|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.workforceIntegration",
  "baseType": "Microsoft.Teams.Shifts.changeTrackedEntity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.workforceIntegration",
  "id": "String (identifier)",
  "createdBy": {
    "@odata.type": "microsoft.graph.identitySet"
  },
  "createdDateTime": "String (timestamp)",
  "lastModifiedDateTime": "String (timestamp)",
  "lastModifiedBy": {
    "@odata.type": "microsoft.graph.identitySet"
  },
  "displayName": "String",
  "apiVersion": "Integer",
  "encryption": {
    "@odata.type": "microsoft.graph.workforceIntegrationEncryption"
  },
  "isActive": "Boolean",
  "url": "String",
  "supports": "String",
  "supportedEntities": "String",
  "eligibilityFilteringEnabledEntities": "String"
}
```


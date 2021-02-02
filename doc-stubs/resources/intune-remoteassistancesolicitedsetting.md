---
title: "remoteAssistanceSolicitedSetting resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# remoteAssistanceSolicitedSetting resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [remoteAssistanceSolicitedSettingBase](../resources/remoteassistancesolicitedsettingbase.md).

## Properties
|Property|Type|Description|
|:---|:---|:---|
|emailInvitationMethod|remoteAssistanceSolicitedEmailInvitationMethod|**TODO: Add Description**. Possible values are: `simpleMAPI`, `mailTo`.|
|maximumTicketTimeUnit|timeUnit|**TODO: Add Description**. Possible values are: `minutes`, `hours`, `days`.|
|maximumTicketTimeValue|Int32|**TODO: Add Description**|
|permission|remoteAssistanceSolicitedPermission|**TODO: Add Description**. Possible values are: `view`, `remoteControl`.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.remoteAssistanceSolicitedSetting"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.remoteAssistanceSolicitedSetting",
  "permission": "String",
  "maximumTicketTimeValue": "Integer",
  "maximumTicketTimeUnit": "String",
  "emailInvitationMethod": "String"
}
```


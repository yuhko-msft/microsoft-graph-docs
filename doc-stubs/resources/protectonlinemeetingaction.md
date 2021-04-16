---
title: "protectOnlineMeetingAction resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# protectOnlineMeetingAction resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [labelActionBase](../resources/labelactionbase.md).

## Properties
|Property|Type|Description|
|:---|:---|:---|
|allowedForwarders|onlineMeetingForwarders|**TODO: Add Description**. Possible values are: `everyone`, `organizer`, `unknownFutureValue`.|
|allowedPresenters|onlineMeetingPresenters|**TODO: Add Description**. Possible values are: `everyone`, `organization`, `roleIsPresenter`, `organizer`, `unknownFutureValue`.|
|isCopyToClipboardEnabled|Boolean|**TODO: Add Description**|
|isLobbyEnabled|Boolean|**TODO: Add Description**|
|lobbyBypassSettings|[lobbyBypassSettings](../resources/lobbybypasssettings.md)|**TODO: Add Description**|
|name|String|**TODO: Add Description** Inherited from [labelActionBase](../resources/labelactionbase.md)|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.protectOnlineMeetingAction"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.protectOnlineMeetingAction",
  "name": "String",
  "allowedForwarders": "String",
  "allowedPresenters": "String",
  "isCopyToClipboardEnabled": "Boolean",
  "isLobbyEnabled": "Boolean",
  "lobbyBypassSettings": {
    "@odata.type": "microsoft.graph.lobbyBypassSettings"
  }
}
```


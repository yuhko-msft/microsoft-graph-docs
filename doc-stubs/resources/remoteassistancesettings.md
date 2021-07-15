---
title: "remoteAssistanceSettings resource type"
description: "Remote assistance settings for the account"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# remoteAssistanceSettings resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Remote assistance settings for the account


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List remoteAssistanceSettings](../api/remoteassistancesettings-list.md)|[remoteAssistanceSettings](../resources/remoteassistancesettings.md) collection|Get a list of the [remoteAssistanceSettings](../resources/remoteassistancesettings.md) objects and their properties.|
|[Create remoteAssistanceSettings](../api/remoteassistancesettings-create.md)|[remoteAssistanceSettings](../resources/remoteassistancesettings.md)|Create a new [remoteAssistanceSettings](../resources/remoteassistancesettings.md) object.|
|[Get remoteAssistanceSettings](../api/remoteassistancesettings-get.md)|[remoteAssistanceSettings](../resources/remoteassistancesettings.md)|Read the properties and relationships of a [remoteAssistanceSettings](../resources/remoteassistancesettings.md) object.|
|[Update remoteAssistanceSettings](../api/remoteassistancesettings-update.md)|[remoteAssistanceSettings](../resources/remoteassistancesettings.md)|Update the properties of a [remoteAssistanceSettings](../resources/remoteassistancesettings.md) object.|
|[Delete remoteAssistanceSettings](../api/remoteassistancesettings-delete.md)|None|Deletes a [remoteAssistanceSettings](../resources/remoteassistancesettings.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|allowSessionsToUnenrolledDevices|Boolean| Indicates if sessions to unenrolled devices are allowed for the account. This setting is configurable by the admin. Default value is false.|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|remoteAssistanceState|remoteAssistanceState|The current state of remote assistance for the account. Possible values are: notConfigured, disabled, enabled. This setting is configurable by the admin. Remote assistance settings that have not yet been configured by the admin have a notConfigured state. Returned by default. Possible values are: `notConfigured`, `disabled`, `enabled`.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.remoteAssistanceSettings",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.remoteAssistanceSettings",
  "id": "String (identifier)",
  "allowSessionsToUnenrolledDevices": "Boolean",
  "remoteAssistanceState": "String"
}
```


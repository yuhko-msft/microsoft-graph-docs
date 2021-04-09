---
title: "microsoftTunnelSite resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# microsoftTunnelSite resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List microsoftTunnelSites](../api/microsofttunnelsite-list.md)|[microsoftTunnelSite](../resources/microsofttunnelsite.md) collection|Get a list of the [microsoftTunnelSite](../resources/microsofttunnelsite.md) objects and their properties.|
|[Create microsoftTunnelSite](../api/microsofttunnelsite-create.md)|[microsoftTunnelSite](../resources/microsofttunnelsite.md)|Create a new [microsoftTunnelSite](../resources/microsofttunnelsite.md) object.|
|[Get microsoftTunnelSite](../api/microsofttunnelsite-get.md)|[microsoftTunnelSite](../resources/microsofttunnelsite.md)|Read the properties and relationships of a [microsoftTunnelSite](../resources/microsofttunnelsite.md) object.|
|[Update microsoftTunnelSite](../api/microsofttunnelsite-update.md)|[microsoftTunnelSite](../resources/microsofttunnelsite.md)|Update the properties of a [microsoftTunnelSite](../resources/microsofttunnelsite.md) object.|
|[Delete microsoftTunnelSite](../api/microsofttunnelsite-delete.md)|None|Deletes a [microsoftTunnelSite](../resources/microsofttunnelsite.md) object.|
|[requestUpgrade](../api/microsofttunnelsite-requestupgrade.md)|None|**TODO: Add Description**|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|description|String|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|publicAddress|String|**TODO: Add Description**|
|roleScopeTagIds|String collection|**TODO: Add Description**|
|upgradeAutomatically|Boolean|**TODO: Add Description**|
|upgradeAvailable|Boolean|**TODO: Add Description**|
|upgradeWindowEndTime|TimeOfDay|**TODO: Add Description**|
|upgradeWindowStartTime|TimeOfDay|**TODO: Add Description**|
|upgradeWindowUtcOffsetInMinutes|Int32|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|microsoftTunnelConfiguration|[microsoftTunnelConfiguration](../resources/microsofttunnelconfiguration.md)|**TODO: Add Description**|
|microsoftTunnelServers|[microsoftTunnelServer](../resources/microsofttunnelserver.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.microsoftTunnelSite",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.microsoftTunnelSite",
  "id": "String (identifier)",
  "displayName": "String",
  "description": "String",
  "publicAddress": "String",
  "upgradeWindowUtcOffsetInMinutes": "Integer",
  "upgradeWindowStartTime": "String (time of day)",
  "upgradeWindowEndTime": "String (time of day)",
  "upgradeAutomatically": "Boolean",
  "upgradeAvailable": "Boolean",
  "roleScopeTagIds": [
    "String"
  ]
}
```


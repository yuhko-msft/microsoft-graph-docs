---
title: "microsoftTunnelSite resource type"
description: "Entity that represents a Microsoft Tunnel site"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# microsoftTunnelSite resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Entity that represents a Microsoft Tunnel site

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List microsoftTunnelSites](../api/intune-microsofttunnelsite-list.md)|[microsoftTunnelSite](../resources/intune-microsofttunnelsite.md) collection|Get a list of the [microsoftTunnelSite](../resources/intune-microsofttunnelsite.md) objects and their properties.|
|[Create microsoftTunnelSite](../api/intune-microsofttunnelsite-create.md)|[microsoftTunnelSite](../resources/intune-microsofttunnelsite.md)|Create a new [microsoftTunnelSite](../resources/intune-microsofttunnelsite.md) object.|
|[Get microsoftTunnelSite](../api/intune-microsofttunnelsite-get.md)|[microsoftTunnelSite](../resources/intune-microsofttunnelsite.md)|Read the properties and relationships of a [microsoftTunnelSite](../resources/intune-microsofttunnelsite.md) object.|
|[Update microsoftTunnelSite](../api/intune-microsofttunnelsite-update.md)|[microsoftTunnelSite](../resources/intune-microsofttunnelsite.md)|Update the properties of a [microsoftTunnelSite](../resources/intune-microsofttunnelsite.md) object.|
|[Delete microsoftTunnelSite](../api/intune-microsofttunnelsite-delete.md)|None|Deletes a [microsoftTunnelSite](../resources/intune-microsofttunnelsite.md) object.|
|[List microsoftTunnelServers](../api/intune-microsofttunnelsite-list-microsofttunnelservers.md)|[microsoftTunnelServer](../resources/intune-microsofttunnelserver.md) collection|Get the microsoftTunnelServer resources from the microsoftTunnelServers navigation property.|
|[Create microsoftTunnelServer](../api/intune-microsofttunnelsite-post-microsofttunnelservers.md)|[microsoftTunnelServer](../resources/intune-microsofttunnelserver.md)|Create a new microsoftTunnelServer object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|description|String|The MicrosoftTunnelSite's description|
|displayName|String|The MicrosoftTunnelSite's display name|
|id|String|The MicrosoftTunnelSite's Id|
|internalNetworkProbeUrl|String|The MicrosoftTunnelSite's Internal Network Access Probe URL|
|publicAddress|String|The MicrosoftTunnelSite's public domain name or IP address|
|roleScopeTagIds|String collection|List of Scope Tags for this Entity instance.|
|upgradeAutomatically|Boolean|The site's automatic upgrade setting. True for automatic upgrades, false for manual control|
|upgradeAvailable|Boolean|True if an upgrade is available|
|upgradeWindowEndTime|TimeOfDay|The site's upgrade window end time of day|
|upgradeWindowStartTime|TimeOfDay|The site's upgrade window start time of day|
|upgradeWindowUtcOffsetInMinutes|Int32|The site's timezone represented as a minute offset from UTC|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|microsoftTunnelConfiguration|[microsoftTunnelConfiguration](../resources/intune-microsofttunnelconfiguration.md)|The MicrosoftTunnelConfiguration that has been applied to this MicrosoftTunnelSite|
|microsoftTunnelServers|[microsoftTunnelServer](../resources/intune-microsofttunnelserver.md) collection|A list of MicrosoftTunnelServers that are registered to this MicrosoftTunnelSite|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.microsoftTunnelSite",
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
  "internalNetworkProbeUrl": "String",
  "roleScopeTagIds": [
    "String"
  ]
}
```


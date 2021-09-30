---
title: "microsoftTunnelConfiguration resource type"
description: "Entity that represents a collection of Microsoft Tunnel settings"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# microsoftTunnelConfiguration resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Entity that represents a collection of Microsoft Tunnel settings

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List microsoftTunnelConfigurations](../api/intune-microsofttunnelconfiguration-list.md)|[microsoftTunnelConfiguration](../resources/intune-microsofttunnelconfiguration.md) collection|Get a list of the [microsoftTunnelConfiguration](../resources/intune-microsofttunnelconfiguration.md) objects and their properties.|
|[Create microsoftTunnelConfiguration](../api/intune-microsofttunnelconfiguration-create.md)|[microsoftTunnelConfiguration](../resources/intune-microsofttunnelconfiguration.md)|Create a new [microsoftTunnelConfiguration](../resources/intune-microsofttunnelconfiguration.md) object.|
|[Get microsoftTunnelConfiguration](../api/intune-microsofttunnelconfiguration-get.md)|[microsoftTunnelConfiguration](../resources/intune-microsofttunnelconfiguration.md)|Read the properties and relationships of a [microsoftTunnelConfiguration](../resources/intune-microsofttunnelconfiguration.md) object.|
|[Update microsoftTunnelConfiguration](../api/intune-microsofttunnelconfiguration-update.md)|[microsoftTunnelConfiguration](../resources/intune-microsofttunnelconfiguration.md)|Update the properties of a [microsoftTunnelConfiguration](../resources/intune-microsofttunnelconfiguration.md) object.|
|[Delete microsoftTunnelConfiguration](../api/intune-microsofttunnelconfiguration-delete.md)|None|Deletes a [microsoftTunnelConfiguration](../resources/intune-microsofttunnelconfiguration.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|advancedSettings|[keyValuePair](../resources/intune-keyvaluepair.md) collection|Additional settings that may be applied to the server|
|defaultDomainSuffix|String|The Default Domain appendix that will be used by the clients|
|description|String|The MicrosoftTunnelConfiguration's description|
|displayName|String|The MicrosoftTunnelConfiguration's display name|
|dnsServers|String collection|The DNS servers that will be used by the clients|
|id|String|The MicrosoftTunnelConfiguration's Id|
|lastUpdateDateTime|DateTimeOffset|When the MicrosoftTunnelConfiguration was last updated|
|listenPort|Int32|The port that both TCP and UPD will listen over on the server|
|network|String|The subnet that will be used to allocate virtual address for the clients|
|roleScopeTagIds|String collection|List of Scope Tags for this Entity instance.|
|routesExclude|String collection|Subsets of the routes that will not be routed by the server|
|routesInclude|String collection|The routs that will be routed by the server|
|splitDNS|String collection|The domains that will be resolved using the provided dns servers|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.microsoftTunnelConfiguration",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.microsoftTunnelConfiguration",
  "id": "String (identifier)",
  "displayName": "String",
  "description": "String",
  "network": "String",
  "dnsServers": [
    "String"
  ],
  "defaultDomainSuffix": "String",
  "routesInclude": [
    "String"
  ],
  "routesExclude": [
    "String"
  ],
  "splitDNS": [
    "String"
  ],
  "listenPort": "Integer",
  "advancedSettings": [
    {
      "@odata.type": "microsoft.graph.keyValuePair"
    }
  ],
  "lastUpdateDateTime": "String (timestamp)",
  "roleScopeTagIds": [
    "String"
  ]
}
```


---
title: "microsoftTunnelConfiguration resource type"
description: "Entity that represents a collection of Microsoft Tunnel settings"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# microsoftTunnelConfiguration resource type

Namespace: microsoft.graph



Entity that represents a collection of Microsoft Tunnel settings


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List microsoftTunnelConfigurations](../api/microsofttunnelconfiguration-list.md)|[microsoftTunnelConfiguration](../resources/microsofttunnelconfiguration.md) collection|Get a list of the [microsoftTunnelConfiguration](../resources/microsofttunnelconfiguration.md) objects and their properties.|
|[Create microsoftTunnelConfiguration](../api/microsofttunnelconfiguration-create.md)|[microsoftTunnelConfiguration](../resources/microsofttunnelconfiguration.md)|Create a new [microsoftTunnelConfiguration](../resources/microsofttunnelconfiguration.md) object.|
|[Get microsoftTunnelConfiguration](../api/microsofttunnelconfiguration-get.md)|[microsoftTunnelConfiguration](../resources/microsofttunnelconfiguration.md)|Read the properties and relationships of a [microsoftTunnelConfiguration](../resources/microsofttunnelconfiguration.md) object.|
|[Update microsoftTunnelConfiguration](../api/microsofttunnelconfiguration-update.md)|[microsoftTunnelConfiguration](../resources/microsofttunnelconfiguration.md)|Update the properties of a [microsoftTunnelConfiguration](../resources/microsofttunnelconfiguration.md) object.|
|[Delete microsoftTunnelConfiguration](../api/microsofttunnelconfiguration-delete.md)|None|Deletes a [microsoftTunnelConfiguration](../resources/microsofttunnelconfiguration.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|advancedSettings|[keyValuePair](../resources/keyvaluepair.md) collection|Additional settings that may be applied to the server|
|defaultDomainSuffix|String|The Default Domain appendix that will be used by the clients|
|description|String|The MicrosoftTunnelConfiguration's description|
|displayName|String|The MicrosoftTunnelConfiguration's display name|
|dnsServers|String collection|The DNS servers that will be used by the clients|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
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
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.microsoftTunnelConfiguration",
  "id": "String (identifier)",
  "advancedSettings": [
    {
      "@odata.type": "microsoft.graph.keyValuePair"
    }
  ],
  "defaultDomainSuffix": "String",
  "description": "String",
  "displayName": "String",
  "dnsServers": [
    "String"
  ],
  "lastUpdateDateTime": "String (timestamp)",
  "listenPort": "Integer",
  "network": "String",
  "roleScopeTagIds": [
    "String"
  ],
  "routesExclude": [
    "String"
  ],
  "routesInclude": [
    "String"
  ],
  "splitDNS": [
    "String"
  ]
}
```


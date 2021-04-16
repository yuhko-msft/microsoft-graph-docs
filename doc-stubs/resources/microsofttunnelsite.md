---
title: "microsoftTunnelSite resource type"
description: "Entity that represents a Microsoft Tunnel site"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# microsoftTunnelSite resource type

Namespace: microsoft.graph



Entity that represents a Microsoft Tunnel site


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List microsoftTunnelSites](../api/microsofttunnelsite-list.md)|[microsoftTunnelSite](../resources/microsofttunnelsite.md) collection|Get a list of the [microsoftTunnelSite](../resources/microsofttunnelsite.md) objects and their properties.|
|[Create microsoftTunnelSite](../api/microsofttunnelsite-create.md)|[microsoftTunnelSite](../resources/microsofttunnelsite.md)|Create a new [microsoftTunnelSite](../resources/microsofttunnelsite.md) object.|
|[Get microsoftTunnelSite](../api/microsofttunnelsite-get.md)|[microsoftTunnelSite](../resources/microsofttunnelsite.md)|Read the properties and relationships of a [microsoftTunnelSite](../resources/microsofttunnelsite.md) object.|
|[Update microsoftTunnelSite](../api/microsofttunnelsite-update.md)|[microsoftTunnelSite](../resources/microsofttunnelsite.md)|Update the properties of a [microsoftTunnelSite](../resources/microsofttunnelsite.md) object.|
|[Delete microsoftTunnelSite](../api/microsofttunnelsite-delete.md)|None|Deletes a [microsoftTunnelSite](../resources/microsofttunnelsite.md) object.|
|[List microsoftTunnelConfiguration](../api/microsofttunnelsite-list-microsofttunnelconfiguration.md)|[microsoftTunnelConfiguration](../resources/microsofttunnelconfiguration.md) collection|Get the microsoftTunnelConfiguration resources from the microsoftTunnelConfiguration navigation property.|
|[Create microsoftTunnelConfiguration](../api/microsofttunnelsite-post-microsofttunnelconfiguration.md)|[microsoftTunnelConfiguration](../resources/microsofttunnelconfiguration.md)|Create a new microsoftTunnelConfiguration object.|
|[List microsoftTunnelServers](../api/microsofttunnelsite-list-microsofttunnelservers.md)|[microsoftTunnelServer](../resources/microsofttunnelserver.md) collection|Get the microsoftTunnelServer resources from the microsoftTunnelServers navigation property.|
|[Create microsoftTunnelServer](../api/microsofttunnelsite-post-microsofttunnelservers.md)|[microsoftTunnelServer](../resources/microsofttunnelserver.md)|Create a new microsoftTunnelServer object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|description|String|The MicrosoftTunnelSite's description|
|displayName|String|The MicrosoftTunnelSite's display name|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|publicAddress|String|The MicrosoftTunnelSite's public domain name or IP address|
|roleScopeTagIds|String collection|List of Scope Tags for this Entity instance.|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|microsoftTunnelConfiguration|[microsoftTunnelConfiguration](../resources/microsofttunnelconfiguration.md)|The MicrosoftTunnelConfiguration that has been applied to this MicrosoftTunnelSite|
|microsoftTunnelServers|[microsoftTunnelServer](../resources/microsofttunnelserver.md) collection|A list of MicrosoftTunnelServers that are registered to this MicrosoftTunnelSite|

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
  "description": "String",
  "displayName": "String",
  "publicAddress": "String",
  "roleScopeTagIds": [
    "String"
  ]
}
```


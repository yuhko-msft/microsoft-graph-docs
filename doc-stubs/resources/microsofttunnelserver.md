---
title: "microsoftTunnelServer resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# microsoftTunnelServer resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List microsoftTunnelServers](../api/microsofttunnelserver-list.md)|[microsoftTunnelServer](../resources/microsofttunnelserver.md) collection|Get a list of the [microsoftTunnelServer](../resources/microsofttunnelserver.md) objects and their properties.|
|[Create microsoftTunnelServer](../api/microsofttunnelserver-create.md)|[microsoftTunnelServer](../resources/microsofttunnelserver.md)|Create a new [microsoftTunnelServer](../resources/microsofttunnelserver.md) object.|
|[Get microsoftTunnelServer](../api/microsofttunnelserver-get.md)|[microsoftTunnelServer](../resources/microsofttunnelserver.md)|Read the properties and relationships of a [microsoftTunnelServer](../resources/microsofttunnelserver.md) object.|
|[Update microsoftTunnelServer](../api/microsofttunnelserver-update.md)|[microsoftTunnelServer](../resources/microsofttunnelserver.md)|Update the properties of a [microsoftTunnelServer](../resources/microsofttunnelserver.md) object.|
|[Delete microsoftTunnelServer](../api/microsofttunnelserver-delete.md)|None|Deletes a [microsoftTunnelServer](../resources/microsofttunnelserver.md) object.|
|[getHealthMetrics](../api/microsofttunnelserver-gethealthmetrics.md)|[keyLongValuePair](../resources/keylongvaluepair.md) collection|**TODO: Add Description**|
|[getHealthMetricTimeSeries](../api/microsofttunnelserver-gethealthmetrictimeseries.md)|[keyValuePair](../resources/synchronization-keyvaluepair.md) collection|**TODO: Add Description**|
|[createServerLogCollectionRequest](../api/microsofttunnelserver-createserverlogcollectionrequest.md)|[microsoftTunnelServerLogCollectionResponse](../resources/microsofttunnelserverlogcollectionresponse.md)|**TODO: Add Description**|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|displayName|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastCheckinDateTime|DateTimeOffset|**TODO: Add Description**|
|tunnelServerHealthStatus|microsoftTunnelServerHealthStatus|**TODO: Add Description**. Possible values are: `unknown`, `healthy`, `unhealthy`, `warning`, `offline`, `upgradeInProgress`, `upgradeFailed`.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.microsoftTunnelServer",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.microsoftTunnelServer",
  "id": "String (identifier)",
  "displayName": "String",
  "tunnelServerHealthStatus": "String",
  "lastCheckinDateTime": "String (timestamp)"
}
```


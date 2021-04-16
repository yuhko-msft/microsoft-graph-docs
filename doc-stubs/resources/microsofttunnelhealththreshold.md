---
title: "microsoftTunnelHealthThreshold resource type"
description: "Entity that represents the health thresholds of a health metric."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# microsoftTunnelHealthThreshold resource type

Namespace: microsoft.graph



Entity that represents the health thresholds of a health metric.


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List microsoftTunnelHealthThresholds](../api/microsofttunnelhealththreshold-list.md)|[microsoftTunnelHealthThreshold](../resources/microsofttunnelhealththreshold.md) collection|Get a list of the [microsoftTunnelHealthThreshold](../resources/microsofttunnelhealththreshold.md) objects and their properties.|
|[Create microsoftTunnelHealthThreshold](../api/microsofttunnelhealththreshold-create.md)|[microsoftTunnelHealthThreshold](../resources/microsofttunnelhealththreshold.md)|Create a new [microsoftTunnelHealthThreshold](../resources/microsofttunnelhealththreshold.md) object.|
|[Get microsoftTunnelHealthThreshold](../api/microsofttunnelhealththreshold-get.md)|[microsoftTunnelHealthThreshold](../resources/microsofttunnelhealththreshold.md)|Read the properties and relationships of a [microsoftTunnelHealthThreshold](../resources/microsofttunnelhealththreshold.md) object.|
|[Update microsoftTunnelHealthThreshold](../api/microsofttunnelhealththreshold-update.md)|[microsoftTunnelHealthThreshold](../resources/microsofttunnelhealththreshold.md)|Update the properties of a [microsoftTunnelHealthThreshold](../resources/microsofttunnelhealththreshold.md) object.|
|[Delete microsoftTunnelHealthThreshold](../api/microsofttunnelhealththreshold-delete.md)|None|Deletes a [microsoftTunnelHealthThreshold](../resources/microsofttunnelhealththreshold.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|defaultHealthyThreshold|Int64|The default threshold for being healthy|
|defaultUnhealthyThreshold|Int64|The default threshold for being unhealthy|
|healthyThreshold|Int64|The threshold for being healthy|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|unhealthyThreshold|Int64|The threshold for being unhealthy|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.microsoftTunnelHealthThreshold",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.microsoftTunnelHealthThreshold",
  "id": "String (identifier)",
  "defaultHealthyThreshold": "Integer",
  "defaultUnhealthyThreshold": "Integer",
  "healthyThreshold": "Integer",
  "unhealthyThreshold": "Integer"
}
```


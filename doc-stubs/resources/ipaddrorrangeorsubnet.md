---
title: "ipAddrOrRangeOrSubnet resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# ipAddrOrRangeOrSubnet resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [filteringRuleSingleDestination](../resources/filteringrulesingledestination.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List ipAddrOrRangeOrSubnets](../api/ipaddrorrangeorsubnet-list.md)|[ipAddrOrRangeOrSubnet](../resources/ipaddrorrangeorsubnet.md) collection|Get a list of the [ipAddrOrRangeOrSubnet](../resources/ipaddrorrangeorsubnet.md) objects and their properties.|
|[Get ipAddrOrRangeOrSubnet](../api/ipaddrorrangeorsubnet-get.md)|[ipAddrOrRangeOrSubnet](../resources/ipaddrorrangeorsubnet.md)|Read the properties and relationships of an [ipAddrOrRangeOrSubnet](../resources/ipaddrorrangeorsubnet.md) object.|
|[Update ipAddrOrRangeOrSubnet](../api/ipaddrorrangeorsubnet-update.md)|[ipAddrOrRangeOrSubnet](../resources/ipaddrorrangeorsubnet.md)|Update the properties of an [ipAddrOrRangeOrSubnet](../resources/ipaddrorrangeorsubnet.md) object.|
|[Delete ipAddrOrRangeOrSubnet](../api/ipaddrorrangeorsubnet-delete.md)|None|Deletes an [ipAddrOrRangeOrSubnet](../resources/ipaddrorrangeorsubnet.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|description|String|**TODO: Add Description** Inherited from [configurationBase](../resources/configurationbase.md).|
|id|Guid|**TODO: Add Description** Inherited from [configurationBase](../resources/configurationbase.md).|
|name|String|**TODO: Add Description** Inherited from [configurationBase](../resources/configurationbase.md).|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.ipAddrOrRangeOrSubnet",
  "baseType": "microsoft.graph.filteringRuleSingleDestination",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.ipAddrOrRangeOrSubnet",
  "id": "String (identifier)",
  "name": "String",
  "description": "String"
}
```


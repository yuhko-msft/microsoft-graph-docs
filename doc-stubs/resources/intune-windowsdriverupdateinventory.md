---
title: "windowsDriverUpdateInventory resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# windowsDriverUpdateInventory resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List windowsDriverUpdateInventories](../api/intune-windowsdriverupdateinventory-list.md)|[windowsDriverUpdateInventory](../resources/intune-windowsdriverupdateinventory.md) collection|Get a list of the [windowsDriverUpdateInventory](../resources/intune-windowsdriverupdateinventory.md) objects and their properties.|
|[Create windowsDriverUpdateInventory](../api/intune-windowsdriverupdateinventory-create.md)|[windowsDriverUpdateInventory](../resources/intune-windowsdriverupdateinventory.md)|Create a new [windowsDriverUpdateInventory](../resources/intune-windowsdriverupdateinventory.md) object.|
|[Get windowsDriverUpdateInventory](../api/intune-windowsdriverupdateinventory-get.md)|[windowsDriverUpdateInventory](../resources/intune-windowsdriverupdateinventory.md)|Read the properties and relationships of a [windowsDriverUpdateInventory](../resources/intune-windowsdriverupdateinventory.md) object.|
|[Update windowsDriverUpdateInventory](../api/intune-windowsdriverupdateinventory-update.md)|[windowsDriverUpdateInventory](../resources/intune-windowsdriverupdateinventory.md)|Update the properties of a [windowsDriverUpdateInventory](../resources/intune-windowsdriverupdateinventory.md) object.|
|[Delete windowsDriverUpdateInventory](../api/intune-windowsdriverupdateinventory-delete.md)|None|Deletes a [windowsDriverUpdateInventory](../resources/intune-windowsdriverupdateinventory.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|applicableDeviceCount|Int32|**TODO: Add Description**|
|approvalStatus|driverApprovalStatus|**TODO: Add Description**. Possible values are: `needsReview`, `declined`, `approved`, `suspended`.|
|category|driverCategory|**TODO: Add Description**. Possible values are: `recommended`, `previouslyApproved`, `other`.|
|deployDateTime|DateTimeOffset|**TODO: Add Description**|
|driverClass|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|manufacturer|String|**TODO: Add Description**|
|name|String|**TODO: Add Description**|
|releaseDateTime|DateTimeOffset|**TODO: Add Description**|
|version|String|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.windowsDriverUpdateInventory",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.windowsDriverUpdateInventory",
  "id": "String (identifier)",
  "name": "String",
  "version": "String",
  "manufacturer": "String",
  "releaseDateTime": "String (timestamp)",
  "driverClass": "String",
  "applicableDeviceCount": "Integer",
  "approvalStatus": "String",
  "category": "String",
  "deployDateTime": "String (timestamp)"
}
```


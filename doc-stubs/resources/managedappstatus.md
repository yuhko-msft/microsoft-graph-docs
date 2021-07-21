---
title: "managedAppStatus resource type"
description: "Represents app protection and configuration status for the organization."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# managedAppStatus resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Represents app protection and configuration status for the organization.
This is an abstract type.


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List managedAppStatus](../api/managedappstatus-list.md)|[managedAppStatus](../resources/managedappstatus.md) collection|Get a list of the [managedAppStatus](../resources/managedappstatus.md) objects and their properties.|
|[Create managedAppStatus](../api/managedappstatus-create.md)|[managedAppStatus](../resources/managedappstatus.md)|Create a new [managedAppStatus](../resources/managedappstatus.md) object.|
|[Get managedAppStatus](../api/managedappstatus-get.md)|[managedAppStatus](../resources/managedappstatus.md)|Read the properties and relationships of a [managedAppStatus](../resources/managedappstatus.md) object.|
|[Update managedAppStatus](../api/managedappstatus-update.md)|[managedAppStatus](../resources/managedappstatus.md)|Update the properties of a [managedAppStatus](../resources/managedappstatus.md) object.|
|[Delete managedAppStatus](../api/managedappstatus-delete.md)|None|Deletes a [managedAppStatus](../resources/managedappstatus.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|displayName|String|Friendly name of the status report.|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|version|String|Version of the entity.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.managedAppStatus",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.managedAppStatus",
  "id": "String (identifier)",
  "displayName": "String",
  "version": "String"
}
```


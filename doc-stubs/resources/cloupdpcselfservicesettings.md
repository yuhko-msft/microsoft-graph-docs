---
title: "cloupdPcSelfServiceSettings resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# cloupdPcSelfServiceSettings resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List cloupdPcSelfServiceSettings](../api/cloupdpcselfservicesettings-list.md)|[cloupdPcSelfServiceSettings](../resources/cloupdpcselfservicesettings.md) collection|Get a list of the [cloupdPcSelfServiceSettings](../resources/cloupdpcselfservicesettings.md) objects and their properties.|
|[Create cloupdPcSelfServiceSettings](../api/cloupdpcselfservicesettings-post-selfservicesettings.md)|[cloupdPcSelfServiceSettings](../resources/cloupdpcselfservicesettings.md)|Create a new [cloupdPcSelfServiceSettings](../resources/cloupdpcselfservicesettings.md) object.|
|[Get cloupdPcSelfServiceSettings](../api/cloupdpcselfservicesettings-get.md)|[cloupdPcSelfServiceSettings](../resources/cloupdpcselfservicesettings.md)|Read the properties and relationships of a [cloupdPcSelfServiceSettings](../resources/cloupdpcselfservicesettings.md) object.|
|[Update cloupdPcSelfServiceSettings](../api/cloupdpcselfservicesettings-update.md)|[cloupdPcSelfServiceSettings](../resources/cloupdpcselfservicesettings.md)|Update the properties of a [cloupdPcSelfServiceSettings](../resources/cloupdpcselfservicesettings.md) object.|
|[Delete cloupdPcSelfServiceSettings](../api/cloupdpcselfservicesettings-delete.md)|None|Deletes a [cloupdPcSelfServiceSettings](../resources/cloupdpcselfservicesettings.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|assignments|[cloudPcManagementAssignmentTarget](../resources/cloudpcmanagementassignmenttarget.md) collection|**TODO: Add Description**|
|enabled|Boolean|**TODO: Add Description**|
|groups|String collection|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.cloupdPcSelfServiceSettings",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.cloupdPcSelfServiceSettings",
  "id": "String (identifier)",
  "enabled": "Boolean",
  "groups": [
    "String"
  ],
  "assignments": [
    {
      "@odata.type": "microsoft.graph.cloudPcManagementGroupAssignmentTarget"
    }
  ]
}
```


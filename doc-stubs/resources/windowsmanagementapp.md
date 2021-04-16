---
title: "windowsManagementApp resource type"
description: "Windows management app entity."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# windowsManagementApp resource type

Namespace: microsoft.graph



Windows management app entity.


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List windowsManagementApps](../api/windowsmanagementapp-list.md)|[windowsManagementApp](../resources/windowsmanagementapp.md) collection|Get a list of the [windowsManagementApp](../resources/windowsmanagementapp.md) objects and their properties.|
|[Create windowsManagementApp](../api/windowsmanagementapp-create.md)|[windowsManagementApp](../resources/windowsmanagementapp.md)|Create a new [windowsManagementApp](../resources/windowsmanagementapp.md) object.|
|[Get windowsManagementApp](../api/windowsmanagementapp-get.md)|[windowsManagementApp](../resources/windowsmanagementapp.md)|Read the properties and relationships of a [windowsManagementApp](../resources/windowsmanagementapp.md) object.|
|[Update windowsManagementApp](../api/windowsmanagementapp-update.md)|[windowsManagementApp](../resources/windowsmanagementapp.md)|Update the properties of a [windowsManagementApp](../resources/windowsmanagementapp.md) object.|
|[Delete windowsManagementApp](../api/windowsmanagementapp-delete.md)|None|Deletes a [windowsManagementApp](../resources/windowsmanagementapp.md) object.|
|[List healthStates](../api/windowsmanagementapp-list-healthstates.md)|[windowsManagementAppHealthState](../resources/windowsmanagementapphealthstate.md) collection|Get the windowsManagementAppHealthState resources from the healthStates navigation property.|
|[Create windowsManagementAppHealthState](../api/windowsmanagementapp-post-healthstates.md)|[windowsManagementAppHealthState](../resources/windowsmanagementapphealthstate.md)|Create a new windowsManagementAppHealthState object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|availableVersion|String|Windows management app available version.|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|healthStates|[windowsManagementAppHealthState](../resources/windowsmanagementapphealthstate.md) collection|The list of health states for installed Windows management app.|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.windowsManagementApp",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.windowsManagementApp",
  "id": "String (identifier)",
  "availableVersion": "String"
}
```


---
title: "windowsManagementApp resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# windowsManagementApp resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List windowsManagementApps](../api/intune-windowsmanagementapp-list.md)|[windowsManagementApp](../resources/intune-windowsmanagementapp.md) collection|Get a list of the [windowsManagementApp](../resources/windowsmanagementapp.md) objects and their properties.|
|[Create windowsManagementApp](../api/intune-windowsmanagementapp-create.md)|[windowsManagementApp](../resources/intune-windowsmanagementapp.md)|Create a new [windowsManagementApp](../resources/intune-windowsmanagementapp.md) object.|
|[Get windowsManagementApp](../api/intune-windowsmanagementapp-get.md)|[windowsManagementApp](../resources/intune-windowsmanagementapp.md)|Read the properties and relationships of a [windowsManagementApp](../resources/intune-windowsmanagementapp.md) object.|
|[Update windowsManagementApp](../api/intune-windowsmanagementapp-update.md)|[windowsManagementApp](../resources/intune-windowsmanagementapp.md)|Update the properties of a [windowsManagementApp](../resources/intune-windowsmanagementapp.md) object.|
|[Delete windowsManagementApp](../api/intune-windowsmanagementapp-delete.md)|None|Deletes a [windowsManagementApp](../resources/intune-windowsmanagementapp.md) object.|
|[setAsManagedInstaller](../api/intune-windowsmanagementapp-setasmanagedinstaller.md)|None|**TODO: Add Description**|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|availableVersion|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|managedInstaller|managedInstallerStatus|**TODO: Add Description**. Possible values are: `disabled`, `enabled`.|
|managedInstallerConfiguredDateTime|String|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|healthStates|[windowsManagementAppHealthState](../resources/intune-windowsmanagementapphealthstate.md) collection|**TODO: Add Description**|

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
  "availableVersion": "String",
  "managedInstaller": "String",
  "managedInstallerConfiguredDateTime": "String"
}
```


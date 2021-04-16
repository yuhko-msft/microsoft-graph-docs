---
title: "windowsManagementAppHealthSummary resource type"
description: "Contains properties for the health summary of the Windows management app."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# windowsManagementAppHealthSummary resource type

Namespace: microsoft.graph



Contains properties for the health summary of the Windows management app.


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List windowsManagementAppHealthSummaries](../api/windowsmanagementapphealthsummary-list.md)|[windowsManagementAppHealthSummary](../resources/windowsmanagementapphealthsummary.md) collection|Get a list of the [windowsManagementAppHealthSummary](../resources/windowsmanagementapphealthsummary.md) objects and their properties.|
|[Create windowsManagementAppHealthSummary](../api/windowsmanagementapphealthsummary-create.md)|[windowsManagementAppHealthSummary](../resources/windowsmanagementapphealthsummary.md)|Create a new [windowsManagementAppHealthSummary](../resources/windowsmanagementapphealthsummary.md) object.|
|[Get windowsManagementAppHealthSummary](../api/windowsmanagementapphealthsummary-get.md)|[windowsManagementAppHealthSummary](../resources/windowsmanagementapphealthsummary.md)|Read the properties and relationships of a [windowsManagementAppHealthSummary](../resources/windowsmanagementapphealthsummary.md) object.|
|[Update windowsManagementAppHealthSummary](../api/windowsmanagementapphealthsummary-update.md)|[windowsManagementAppHealthSummary](../resources/windowsmanagementapphealthsummary.md)|Update the properties of a [windowsManagementAppHealthSummary](../resources/windowsmanagementapphealthsummary.md) object.|
|[Delete windowsManagementAppHealthSummary](../api/windowsmanagementapphealthsummary-delete.md)|None|Deletes a [windowsManagementAppHealthSummary](../resources/windowsmanagementapphealthsummary.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|healthyDeviceCount|Int32|Healthy device count.|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|unhealthyDeviceCount|Int32|Unhealthy device count.|
|unknownDeviceCount|Int32|Unknown device count.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.windowsManagementAppHealthSummary",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.windowsManagementAppHealthSummary",
  "id": "String (identifier)",
  "healthyDeviceCount": "Integer",
  "unhealthyDeviceCount": "Integer",
  "unknownDeviceCount": "Integer"
}
```


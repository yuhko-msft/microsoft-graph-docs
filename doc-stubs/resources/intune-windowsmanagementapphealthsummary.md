---
title: "windowsManagementAppHealthSummary resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# windowsManagementAppHealthSummary resource type

Namespace: microsoft.graph

**TODO: Add Description**

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List windowsManagementAppHealthSummaries](../api/intune-windowsmanagementapphealthsummary-list.md)|[windowsManagementAppHealthSummary](../resources/intune-windowsmanagementapphealthsummary.md) collection|Get a list of the [windowsManagementAppHealthSummary](../resources/windowsmanagementapphealthsummary.md) objects and their properties.|
|[Create windowsManagementAppHealthSummary](../api/intune-windowsmanagementapphealthsummary-create.md)|[windowsManagementAppHealthSummary](../resources/intune-windowsmanagementapphealthsummary.md)|Create a new [windowsManagementAppHealthSummary](../resources/intune-windowsmanagementapphealthsummary.md) object.|
|[Get windowsManagementAppHealthSummary](../api/intune-windowsmanagementapphealthsummary-get.md)|[windowsManagementAppHealthSummary](../resources/intune-windowsmanagementapphealthsummary.md)|Read the properties and relationships of a [windowsManagementAppHealthSummary](../resources/intune-windowsmanagementapphealthsummary.md) object.|
|[Update windowsManagementAppHealthSummary](../api/intune-windowsmanagementapphealthsummary-update.md)|[windowsManagementAppHealthSummary](../resources/intune-windowsmanagementapphealthsummary.md)|Update the properties of a [windowsManagementAppHealthSummary](../resources/intune-windowsmanagementapphealthsummary.md) object.|
|[Delete windowsManagementAppHealthSummary](../api/intune-windowsmanagementapphealthsummary-delete.md)|None|Deletes a [windowsManagementAppHealthSummary](../resources/intune-windowsmanagementapphealthsummary.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|healthyDeviceCount|Int32|**TODO: Add Description**|
|unhealthyDeviceCount|Int32|**TODO: Add Description**|
|unknownDeviceCount|Int32|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.windowsManagementAppHealthSummary",
  "baseType": "",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.windowsManagementAppHealthSummary",
  "healthyDeviceCount": "Integer",
  "unhealthyDeviceCount": "Integer",
  "unknownDeviceCount": "Integer"
}
```


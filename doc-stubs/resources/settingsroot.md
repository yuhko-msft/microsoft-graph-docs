---
title: "settingsRoot resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# settingsRoot resource type

Namespace: microsoft.graph



**TODO: Add Description**

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List settingsRoots](../api/settingsroot-list.md)|[settingsRoot](../resources/settingsroot.md) collection|Get a list of the [settingsRoot](../resources/settingsroot.md) objects and their properties.|
|[Create settingsRoot](../api/settingsroot-create.md)|[settingsRoot](../resources/settingsroot.md)|Create a new [settingsRoot](../resources/settingsroot.md) object.|
|[Get settingsRoot](../api/settingsroot-get.md)|[settingsRoot](../resources/settingsroot.md)|Read the properties and relationships of a [settingsRoot](../resources/settingsroot.md) object.|
|[Update settingsRoot](../api/settingsroot-update.md)|[settingsRoot](../resources/settingsroot.md)|Update the properties of a [settingsRoot](../resources/settingsroot.md) object.|
|[Delete settingsRoot](../api/settingsroot-delete.md)|None|Deletes a [settingsRoot](../resources/settingsroot.md) object.|
|[List advancedRiskReportingSettings](../api/settingsroot-list-advancedriskreporting.md)|[advancedRiskReportingSettings](../resources/advancedriskreportingsettings.md) collection|Get the advancedRiskReportingSettings resources from the advancedRiskReporting navigation property.|
|[Create advancedRiskReportingSettings](../api/settingsroot-post-advancedriskreporting.md)|[advancedRiskReportingSettings](../resources/advancedriskreportingsettings.md)|Create a new advancedRiskReportingSettings object.|
|[List notificationSettings](../api/settingsroot-list-notifications.md)|[notificationSettings](../resources/notificationsettings.md) collection|Get the notificationSettings resources from the notifications navigation property.|
|[Create notificationSettings](../api/settingsroot-post-notifications.md)|[notificationSettings](../resources/notificationsettings.md)|Create a new notificationSettings object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|advancedRiskReporting|[advancedRiskReportingSettings](../resources/advancedriskreportingsettings.md)|**TODO: Add Description**|
|notifications|[notificationSettings](../resources/notificationsettings.md)|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.settingsRoot",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.settingsRoot"
}
```


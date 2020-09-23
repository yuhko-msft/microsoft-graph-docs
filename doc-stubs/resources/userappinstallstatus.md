---
title: "userAppInstallStatus resource type"
description: "Contains properties for the installation status for a user."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# userAppInstallStatus resource type

Namespace: microsoft.graph

Contains properties for the installation status for a user.

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List userStatuses](../api/mobileapp-list-userstatuses.md)|[userAppInstallStatus](../resources/userappinstallstatus.md) collection|Get the userAppInstallStatus resources from the userStatuses navigation property.|
|[Create userStatuses](../api/mobileapp-post-userstatuses.md)|[userAppInstallStatus](../resources/userappinstallstatus.md)|Create a new userAppInstallStatus object.|
|[Update userStatuses](../api/mobileapp-update-userstatuses.md)|[userAppInstallStatus](../resources/userappinstallstatus.md)|Update the properties of a userStatuses object.|
|[Get userStatuses](../api/mobileapp-get-userappinstallstatus.md)|[userAppInstallStatus](../resources/userappinstallstatus.md)|Read the properties and relationships of a [userAppInstallStatus](../resources/userappinstallstatus.md) object.|
|[Delete userStatuses](../api/mobileapp-delete-userstatuses.md)|None|Delete a [userAppInstallStatus](../resources/userappinstallstatus.md) object.|
|[List userAppInstallStatus](../api/userappinstallstatus-list.md)|[userAppInstallStatus](../resources/userappinstallstatus.md) collection|Get a list of the [userAppInstallStatus](../resources/userappinstallstatus.md) objects and their properties.|
|[Create userAppInstallStatus](../api/userappinstallstatus-create.md)|[userAppInstallStatus](../resources/userappinstallstatus.md)|Create a new [userAppInstallStatus](../resources/userappinstallstatus.md) object.|
|[Get userAppInstallStatus](../api/userappinstallstatus-get.md)|[userAppInstallStatus](../resources/userappinstallstatus.md)|Read the properties and relationships of a [userAppInstallStatus](../resources/userappinstallstatus.md) object.|
|[Update userAppInstallStatus](../api/userappinstallstatus-update.md)|[userAppInstallStatus](../resources/userappinstallstatus.md)|Update the properties of a [userAppInstallStatus](../resources/userappinstallstatus.md) object.|
|[Delete userAppInstallStatus](../api/userappinstallstatus-delete.md)|None|Deletes a [userAppInstallStatus](../resources/userappinstallstatus.md) object.|
|[List app](../api/userappinstallstatus-list-app.md)|[mobileApp](../resources/mobileapp.md) collection|Get the mobileApp resources from the app navigation property.|
|[Add app](../api/userappinstallstatus-post-app.md)|[mobileApp](../resources/mobileapp.md)|Add app by posting to the app collection.|
|[Remove app](../api/userappinstallstatus-delete-app.md)|None|Remove a [mobileApp](../resources/mobileapp.md) object.|
|[List deviceStatuses](../api/userappinstallstatus-list-devicestatuses.md)|[mobileAppInstallStatus](../resources/mobileappinstallstatus.md) collection|Get the mobileAppInstallStatus resources from the deviceStatuses navigation property.|
|[Create deviceStatuses](../api/userappinstallstatus-post-devicestatuses.md)|[mobileAppInstallStatus](../resources/mobileappinstallstatus.md)|Create a new mobileAppInstallStatus object.|
|[Get deviceStatuses](../api/userappinstallstatus-get-mobileappinstallstatus.md)|[mobileAppInstallStatus](../resources/mobileappinstallstatus.md)|Read the properties and relationships of a [mobileAppInstallStatus](../resources/mobileappinstallstatus.md) object.|
|[Update deviceStatuses](../api/userappinstallstatus-update-devicestatuses.md)|[mobileAppInstallStatus](../resources/mobileappinstallstatus.md)|Update the properties of a deviceStatuses object.|
|[Delete deviceStatuses](../api/userappinstallstatus-delete-devicestatuses.md)|None|Delete a [mobileAppInstallStatus](../resources/mobileappinstallstatus.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|failedDeviceCount|Int32|Failed Device Count.|
|id|String|Key of the entity.|
|installedDeviceCount|Int32|Installed Device Count.|
|notInstalledDeviceCount|Int32|Not installed device count.|
|userName|String|User name.|
|userPrincipalName|String|User Principal Name.|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|app|[mobileApp](../resources/mobileapp.md)|**TODO: Add Description**|
|deviceStatuses|[mobileAppInstallStatus](../resources/mobileappinstallstatus.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.userAppInstallStatus",
  "baseType": "",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.userAppInstallStatus",
  "id": "String (identifier)",
  "userName": "String",
  "userPrincipalName": "String",
  "installedDeviceCount": "Integer",
  "failedDeviceCount": "Integer",
  "notInstalledDeviceCount": "Integer"
}
```


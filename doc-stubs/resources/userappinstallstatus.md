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


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List userAppInstallStatus](../api/userappinstallstatus-list.md)|[userAppInstallStatus](../resources/userappinstallstatus.md) collection|Get a list of the [userAppInstallStatus](../resources/userappinstallstatus.md) objects and their properties.|
|[Create userAppInstallStatus](../api/userappinstallstatus-create.md)|[userAppInstallStatus](../resources/userappinstallstatus.md)|Create a new [userAppInstallStatus](../resources/userappinstallstatus.md) object.|
|[Get userAppInstallStatus](../api/userappinstallstatus-get.md)|[userAppInstallStatus](../resources/userappinstallstatus.md)|Read the properties and relationships of a [userAppInstallStatus](../resources/userappinstallstatus.md) object.|
|[Update userAppInstallStatus](../api/userappinstallstatus-update.md)|[userAppInstallStatus](../resources/userappinstallstatus.md)|Update the properties of a [userAppInstallStatus](../resources/userappinstallstatus.md) object.|
|[Delete userAppInstallStatus](../api/userappinstallstatus-delete.md)|None|Deletes a [userAppInstallStatus](../resources/userappinstallstatus.md) object.|
|[List mobileApp](../api/userappinstallstatus-list-app.md)|[mobileApp](../resources/mobileapp.md) collection|Get the mobileApp resources from the app navigation property.|
|[Add mobileApp](../api/userappinstallstatus-post-app.md)|[mobileApp](../resources/mobileapp.md)|Add app by posting to the app collection.|
|[List deviceStatuses](../api/userappinstallstatus-list-devicestatuses.md)|[mobileAppInstallStatus](../resources/mobileappinstallstatus.md) collection|Get the mobileAppInstallStatus resources from the deviceStatuses navigation property.|
|[Create mobileAppInstallStatus](../api/userappinstallstatus-post-devicestatuses.md)|[mobileAppInstallStatus](../resources/mobileappinstallstatus.md)|Create a new mobileAppInstallStatus object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|failedDeviceCount|Int32|Failed Device Count.|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|installedDeviceCount|Int32|Installed Device Count.|
|notInstalledDeviceCount|Int32|Not installed device count.|
|userName|String|User name.|
|userPrincipalName|String|User Principal Name.|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|app|[mobileApp](../resources/mobileapp.md)|The navigation link to the mobile app.|
|deviceStatuses|[mobileAppInstallStatus](../resources/mobileappinstallstatus.md) collection|The install state of the app on devices.|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.userAppInstallStatus",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.userAppInstallStatus",
  "id": "String (identifier)",
  "failedDeviceCount": "Integer",
  "installedDeviceCount": "Integer",
  "notInstalledDeviceCount": "Integer",
  "userName": "String",
  "userPrincipalName": "String"
}
```


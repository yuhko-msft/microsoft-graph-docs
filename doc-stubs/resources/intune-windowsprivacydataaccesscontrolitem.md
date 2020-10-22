---
title: "windowsPrivacyDataAccessControlItem resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# windowsPrivacyDataAccessControlItem resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List privacyAccessControls](../api/windows10generalconfiguration-list-privacyaccesscontrols.md)|[windowsPrivacyDataAccessControlItem](../resources/intune-windowsprivacydataaccesscontrolitem.md) collection|Get the windowsPrivacyDataAccessControlItem resources from the privacyAccessControls navigation property.|
|[Create privacyAccessControls](../api/windows10generalconfiguration-post-privacyaccesscontrols.md)|[windowsPrivacyDataAccessControlItem](../resources/intune-windowsprivacydataaccesscontrolitem.md)|Create a new windowsPrivacyDataAccessControlItem object.|
|[Update privacyAccessControls](../api/windows10generalconfiguration-update-privacyaccesscontrols.md)|[windowsPrivacyDataAccessControlItem](../resources/intune-windowsprivacydataaccesscontrolitem.md)|Update the properties of a privacyAccessControls object.|
|[Get privacyAccessControls](../api/windows10generalconfiguration-get-windowsprivacydataaccesscontrolitem.md)|[windowsPrivacyDataAccessControlItem](../resources/intune-windowsprivacydataaccesscontrolitem.md)|Read the properties and relationships of a [windowsPrivacyDataAccessControlItem](../resources/intune-windowsprivacydataaccesscontrolitem.md) object.|
|[Delete privacyAccessControls](../api/windows10generalconfiguration-delete-privacyaccesscontrols.md)|None|Delete a [windowsPrivacyDataAccessControlItem](../resources/intune-windowsprivacydataaccesscontrolitem.md) object.|
|[List windowsPrivacyDataAccessControlItems](../api/intune-windowsprivacydataaccesscontrolitem-list.md)|[windowsPrivacyDataAccessControlItem](../resources/intune-windowsprivacydataaccesscontrolitem.md) collection|Get a list of the [windowsPrivacyDataAccessControlItem](../resources/windowsprivacydataaccesscontrolitem.md) objects and their properties.|
|[Create windowsPrivacyDataAccessControlItem](../api/intune-windowsprivacydataaccesscontrolitem-create.md)|[windowsPrivacyDataAccessControlItem](../resources/intune-windowsprivacydataaccesscontrolitem.md)|Create a new [windowsPrivacyDataAccessControlItem](../resources/intune-windowsprivacydataaccesscontrolitem.md) object.|
|[Get windowsPrivacyDataAccessControlItem](../api/intune-windowsprivacydataaccesscontrolitem-get.md)|[windowsPrivacyDataAccessControlItem](../resources/intune-windowsprivacydataaccesscontrolitem.md)|Read the properties and relationships of a [windowsPrivacyDataAccessControlItem](../resources/intune-windowsprivacydataaccesscontrolitem.md) object.|
|[Update windowsPrivacyDataAccessControlItem](../api/intune-windowsprivacydataaccesscontrolitem-update.md)|[windowsPrivacyDataAccessControlItem](../resources/intune-windowsprivacydataaccesscontrolitem.md)|Update the properties of a [windowsPrivacyDataAccessControlItem](../resources/intune-windowsprivacydataaccesscontrolitem.md) object.|
|[Delete windowsPrivacyDataAccessControlItem](../api/intune-windowsprivacydataaccesscontrolitem-delete.md)|None|Deletes a [windowsPrivacyDataAccessControlItem](../resources/intune-windowsprivacydataaccesscontrolitem.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|accessLevel|windowsPrivacyDataAccessLevel|**TODO: Add Description**. Possible values are: `notConfigured`, `forceAllow`, `forceDeny`, `userInControl`.|
|appDisplayName|String|**TODO: Add Description**|
|appPackageFamilyName|String|**TODO: Add Description**|
|dataCategory|windowsPrivacyDataCategory|**TODO: Add Description**. Possible values are: `notConfigured`, `accountInfo`, `appsRunInBackground`, `calendar`, `callHistory`, `camera`, `contacts`, `diagnosticsInfo`, `email`, `location`, `messaging`, `microphone`, `motion`, `notifications`, `phone`, `radios`, `tasks`, `syncWithDevices`, `trustedDevices`.|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.windowsPrivacyDataAccessControlItem",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.windowsPrivacyDataAccessControlItem",
  "id": "String (identifier)",
  "accessLevel": "String",
  "dataCategory": "String",
  "appPackageFamilyName": "String",
  "appDisplayName": "String"
}
```


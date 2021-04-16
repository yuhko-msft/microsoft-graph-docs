---
title: "windowsPrivacyDataAccessControlItem resource type"
description: "Specify access control level per privacy data category"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# windowsPrivacyDataAccessControlItem resource type

Namespace: microsoft.graph



Specify access control level per privacy data category


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List windowsPrivacyDataAccessControlItems](../api/windowsprivacydataaccesscontrolitem-list.md)|[windowsPrivacyDataAccessControlItem](../resources/windowsprivacydataaccesscontrolitem.md) collection|Get a list of the [windowsPrivacyDataAccessControlItem](../resources/windowsprivacydataaccesscontrolitem.md) objects and their properties.|
|[Create windowsPrivacyDataAccessControlItem](../api/windowsprivacydataaccesscontrolitem-create.md)|[windowsPrivacyDataAccessControlItem](../resources/windowsprivacydataaccesscontrolitem.md)|Create a new [windowsPrivacyDataAccessControlItem](../resources/windowsprivacydataaccesscontrolitem.md) object.|
|[Get windowsPrivacyDataAccessControlItem](../api/windowsprivacydataaccesscontrolitem-get.md)|[windowsPrivacyDataAccessControlItem](../resources/windowsprivacydataaccesscontrolitem.md)|Read the properties and relationships of a [windowsPrivacyDataAccessControlItem](../resources/windowsprivacydataaccesscontrolitem.md) object.|
|[Update windowsPrivacyDataAccessControlItem](../api/windowsprivacydataaccesscontrolitem-update.md)|[windowsPrivacyDataAccessControlItem](../resources/windowsprivacydataaccesscontrolitem.md)|Update the properties of a [windowsPrivacyDataAccessControlItem](../resources/windowsprivacydataaccesscontrolitem.md) object.|
|[Delete windowsPrivacyDataAccessControlItem](../api/windowsprivacydataaccesscontrolitem-delete.md)|None|Deletes a [windowsPrivacyDataAccessControlItem](../resources/windowsprivacydataaccesscontrolitem.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|accessLevel|windowsPrivacyDataAccessLevel|This indicates an access level for the privacy data category to which the specified application will be given to. Possible values are: `notConfigured`, `forceAllow`, `forceDeny`, `userInControl`.|
|appDisplayName|String|The Package Family Name of a Windows app. When set, the access level applies to the specified application.|
|appPackageFamilyName|String|The Package Family Name of a Windows app. When set, the access level applies to the specified application.|
|dataCategory|windowsPrivacyDataCategory|This indicates a privacy data category to which the specific access control will apply. Possible values are: `notConfigured`, `accountInfo`, `appsRunInBackground`, `calendar`, `callHistory`, `camera`, `contacts`, `diagnosticsInfo`, `email`, `location`, `messaging`, `microphone`, `motion`, `notifications`, `phone`, `radios`, `tasks`, `syncWithDevices`, `trustedDevices`.|
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
  "appDisplayName": "String",
  "appPackageFamilyName": "String",
  "dataCategory": "String"
}
```


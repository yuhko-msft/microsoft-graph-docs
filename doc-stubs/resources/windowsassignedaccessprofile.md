---
title: "windowsAssignedAccessProfile resource type"
description: "Assigned Access profile for Windows."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# windowsAssignedAccessProfile resource type

Namespace: microsoft.graph



Assigned Access profile for Windows.


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List windowsAssignedAccessProfiles](../api/windowsassignedaccessprofile-list.md)|[windowsAssignedAccessProfile](../resources/windowsassignedaccessprofile.md) collection|Get a list of the [windowsAssignedAccessProfile](../resources/windowsassignedaccessprofile.md) objects and their properties.|
|[Create windowsAssignedAccessProfile](../api/windowsassignedaccessprofile-create.md)|[windowsAssignedAccessProfile](../resources/windowsassignedaccessprofile.md)|Create a new [windowsAssignedAccessProfile](../resources/windowsassignedaccessprofile.md) object.|
|[Get windowsAssignedAccessProfile](../api/windowsassignedaccessprofile-get.md)|[windowsAssignedAccessProfile](../resources/windowsassignedaccessprofile.md)|Read the properties and relationships of a [windowsAssignedAccessProfile](../resources/windowsassignedaccessprofile.md) object.|
|[Update windowsAssignedAccessProfile](../api/windowsassignedaccessprofile-update.md)|[windowsAssignedAccessProfile](../resources/windowsassignedaccessprofile.md)|Update the properties of a [windowsAssignedAccessProfile](../resources/windowsassignedaccessprofile.md) object.|
|[Delete windowsAssignedAccessProfile](../api/windowsassignedaccessprofile-delete.md)|None|Deletes a [windowsAssignedAccessProfile](../resources/windowsassignedaccessprofile.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|appUserModelIds|String collection|These are the only Windows Store Apps that will be available to launch from the Start menu.|
|desktopAppPaths|String collection|These are the paths of the Desktop Apps that will be available on the Start menu and the only apps the user will be able to launch.|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|profileName|String|This is a friendly name used to identify a group of applications, the layout of these apps on the start menu and the users to whom this kiosk configuration is assigned.|
|showTaskBar|Boolean|This setting allows the admin to specify whether the Task Bar is shown or not.|
|startMenuLayoutXml|Binary|Allows admins to override the default Start layout and prevents the user from changing it. The layout is modified by specifying an XML file based on a layout modification schema. XML needs to be in Binary format.|
|userAccounts|String collection|The user accounts that will be locked to this kiosk configuration.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.windowsAssignedAccessProfile",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.windowsAssignedAccessProfile",
  "id": "String (identifier)",
  "appUserModelIds": [
    "String"
  ],
  "desktopAppPaths": [
    "String"
  ],
  "profileName": "String",
  "showTaskBar": "Boolean",
  "startMenuLayoutXml": "Binary",
  "userAccounts": [
    "String"
  ]
}
```


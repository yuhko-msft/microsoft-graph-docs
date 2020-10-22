---
title: "windowsAssignedAccessProfile resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# windowsAssignedAccessProfile resource type

Namespace: microsoft.graph

**TODO: Add Description**

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List windowsAssignedAccessProfiles](../api/intune-windowsassignedaccessprofile-list.md)|[windowsAssignedAccessProfile](../resources/intune-windowsassignedaccessprofile.md) collection|Get a list of the [windowsAssignedAccessProfile](../resources/windowsassignedaccessprofile.md) objects and their properties.|
|[Create windowsAssignedAccessProfile](../api/intune-windowsassignedaccessprofile-create.md)|[windowsAssignedAccessProfile](../resources/intune-windowsassignedaccessprofile.md)|Create a new [windowsAssignedAccessProfile](../resources/intune-windowsassignedaccessprofile.md) object.|
|[Get windowsAssignedAccessProfile](../api/intune-windowsassignedaccessprofile-get.md)|[windowsAssignedAccessProfile](../resources/intune-windowsassignedaccessprofile.md)|Read the properties and relationships of a [windowsAssignedAccessProfile](../resources/intune-windowsassignedaccessprofile.md) object.|
|[Update windowsAssignedAccessProfile](../api/intune-windowsassignedaccessprofile-update.md)|[windowsAssignedAccessProfile](../resources/intune-windowsassignedaccessprofile.md)|Update the properties of a [windowsAssignedAccessProfile](../resources/intune-windowsassignedaccessprofile.md) object.|
|[Delete windowsAssignedAccessProfile](../api/intune-windowsassignedaccessprofile-delete.md)|None|Deletes a [windowsAssignedAccessProfile](../resources/intune-windowsassignedaccessprofile.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|appUserModelIds|String collection|**TODO: Add Description**|
|desktopAppPaths|String collection|**TODO: Add Description**|
|profileName|String|**TODO: Add Description**|
|showTaskBar|Boolean|**TODO: Add Description**|
|startMenuLayoutXml|Binary|**TODO: Add Description**|
|userAccounts|String collection|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.windowsAssignedAccessProfile",
  "baseType": "",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.windowsAssignedAccessProfile",
  "profileName": "String",
  "showTaskBar": "Boolean",
  "appUserModelIds": [
    "String"
  ],
  "desktopAppPaths": [
    "String"
  ],
  "userAccounts": [
    "String"
  ],
  "startMenuLayoutXml": "Binary"
}
```


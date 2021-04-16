---
title: "windowsQualityUpdateProfile resource type"
description: "Windows Quality Update Profile"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# windowsQualityUpdateProfile resource type

Namespace: microsoft.graph



Windows Quality Update Profile


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List windowsQualityUpdateProfiles](../api/windowsqualityupdateprofile-list.md)|[windowsQualityUpdateProfile](../resources/windowsqualityupdateprofile.md) collection|Get a list of the [windowsQualityUpdateProfile](../resources/windowsqualityupdateprofile.md) objects and their properties.|
|[Create windowsQualityUpdateProfile](../api/windowsqualityupdateprofile-create.md)|[windowsQualityUpdateProfile](../resources/windowsqualityupdateprofile.md)|Create a new [windowsQualityUpdateProfile](../resources/windowsqualityupdateprofile.md) object.|
|[Get windowsQualityUpdateProfile](../api/windowsqualityupdateprofile-get.md)|[windowsQualityUpdateProfile](../resources/windowsqualityupdateprofile.md)|Read the properties and relationships of a [windowsQualityUpdateProfile](../resources/windowsqualityupdateprofile.md) object.|
|[Update windowsQualityUpdateProfile](../api/windowsqualityupdateprofile-update.md)|[windowsQualityUpdateProfile](../resources/windowsqualityupdateprofile.md)|Update the properties of a [windowsQualityUpdateProfile](../resources/windowsqualityupdateprofile.md) object.|
|[Delete windowsQualityUpdateProfile](../api/windowsqualityupdateprofile-delete.md)|None|Deletes a [windowsQualityUpdateProfile](../resources/windowsqualityupdateprofile.md) object.|
|[assign](../api/windowsqualityupdateprofile-assign.md)|None|**TODO: Add Description**|
|[List assignments](../api/windowsqualityupdateprofile-list-assignments.md)|[windowsQualityUpdateProfileAssignment](../resources/windowsqualityupdateprofileassignment.md) collection|Get the windowsQualityUpdateProfileAssignment resources from the assignments navigation property.|
|[Create windowsQualityUpdateProfileAssignment](../api/windowsqualityupdateprofile-post-assignments.md)|[windowsQualityUpdateProfileAssignment](../resources/windowsqualityupdateprofileassignment.md)|Create a new windowsQualityUpdateProfileAssignment object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|createdDateTime|DateTimeOffset|The date time that the profile was created.|
|deployableContentDisplayName|String|Friendly display name of the quality update profile deployable content|
|description|String|The description of the profile which is specified by the user.|
|displayName|String|The display name for the profile.|
|expeditedUpdateSettings|[expeditedWindowsQualityUpdateSettings](../resources/expeditedwindowsqualityupdatesettings.md)|Expedited update settings.|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastModifiedDateTime|DateTimeOffset|The date time that the profile was last modified.|
|releaseDateDisplayName|String|Friendly release date to display for a Quality Update release|
|roleScopeTagIds|String collection|List of Scope Tags for this Quality Update entity.|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|assignments|[windowsQualityUpdateProfileAssignment](../resources/windowsqualityupdateprofileassignment.md) collection|The list of group assignments of the profile.|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.windowsQualityUpdateProfile",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.windowsQualityUpdateProfile",
  "id": "String (identifier)",
  "createdDateTime": "String (timestamp)",
  "deployableContentDisplayName": "String",
  "description": "String",
  "displayName": "String",
  "expeditedUpdateSettings": {
    "@odata.type": "microsoft.graph.expeditedWindowsQualityUpdateSettings"
  },
  "lastModifiedDateTime": "String (timestamp)",
  "releaseDateDisplayName": "String",
  "roleScopeTagIds": [
    "String"
  ]
}
```


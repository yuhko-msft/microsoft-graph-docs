---
title: "windowsFeatureUpdateProfile resource type"
description: "Windows Feature Update Profile"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# windowsFeatureUpdateProfile resource type

Namespace: microsoft.graph



Windows Feature Update Profile


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List windowsFeatureUpdateProfiles](../api/windowsfeatureupdateprofile-list.md)|[windowsFeatureUpdateProfile](../resources/windowsfeatureupdateprofile.md) collection|Get a list of the [windowsFeatureUpdateProfile](../resources/windowsfeatureupdateprofile.md) objects and their properties.|
|[Create windowsFeatureUpdateProfile](../api/windowsfeatureupdateprofile-create.md)|[windowsFeatureUpdateProfile](../resources/windowsfeatureupdateprofile.md)|Create a new [windowsFeatureUpdateProfile](../resources/windowsfeatureupdateprofile.md) object.|
|[Get windowsFeatureUpdateProfile](../api/windowsfeatureupdateprofile-get.md)|[windowsFeatureUpdateProfile](../resources/windowsfeatureupdateprofile.md)|Read the properties and relationships of a [windowsFeatureUpdateProfile](../resources/windowsfeatureupdateprofile.md) object.|
|[Update windowsFeatureUpdateProfile](../api/windowsfeatureupdateprofile-update.md)|[windowsFeatureUpdateProfile](../resources/windowsfeatureupdateprofile.md)|Update the properties of a [windowsFeatureUpdateProfile](../resources/windowsfeatureupdateprofile.md) object.|
|[Delete windowsFeatureUpdateProfile](../api/windowsfeatureupdateprofile-delete.md)|None|Deletes a [windowsFeatureUpdateProfile](../resources/windowsfeatureupdateprofile.md) object.|
|[assign](../api/windowsfeatureupdateprofile-assign.md)|None|**TODO: Add Description**|
|[List assignments](../api/windowsfeatureupdateprofile-list-assignments.md)|[windowsFeatureUpdateProfileAssignment](../resources/windowsfeatureupdateprofileassignment.md) collection|Get the windowsFeatureUpdateProfileAssignment resources from the assignments navigation property.|
|[Create windowsFeatureUpdateProfileAssignment](../api/windowsfeatureupdateprofile-post-assignments.md)|[windowsFeatureUpdateProfileAssignment](../resources/windowsfeatureupdateprofileassignment.md)|Create a new windowsFeatureUpdateProfileAssignment object.|
|[List deviceUpdateStates](../api/windowsfeatureupdateprofile-list-deviceupdatestates.md)|[windowsUpdateState](../resources/windowsupdatestate.md) collection|Get the windowsUpdateState resources from the deviceUpdateStates navigation property.|
|[Create windowsUpdateState](../api/windowsfeatureupdateprofile-post-deviceupdatestates.md)|[windowsUpdateState](../resources/windowsupdatestate.md)|Create a new windowsUpdateState object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|createdDateTime|DateTimeOffset|The date time that the profile was created.|
|deployableContentDisplayName|String|Friendly display name of the quality update profile deployable content|
|description|String|The description of the profile which is specified by the user.|
|displayName|String|The display name of the profile.|
|featureUpdateVersion|String|The feature update version that will be deployed to the devices targeted by this profile. The version could be any supported version for example 1709, 1803 or 1809 and so on.|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastModifiedDateTime|DateTimeOffset|The date time that the profile was last modified.|
|roleScopeTagIds|String collection|List of Scope Tags for this Feature Update entity.|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|assignments|[windowsFeatureUpdateProfileAssignment](../resources/windowsfeatureupdateprofileassignment.md) collection|The list of group assignments of the profile.|
|deviceUpdateStates|[windowsUpdateState](../resources/windowsupdatestate.md) collection|The list of device states this profile targeted to|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.windowsFeatureUpdateProfile",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.windowsFeatureUpdateProfile",
  "id": "String (identifier)",
  "createdDateTime": "String (timestamp)",
  "deployableContentDisplayName": "String",
  "description": "String",
  "displayName": "String",
  "featureUpdateVersion": "String",
  "lastModifiedDateTime": "String (timestamp)",
  "roleScopeTagIds": [
    "String"
  ]
}
```


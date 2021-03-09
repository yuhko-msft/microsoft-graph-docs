---
title: "windowsQualityUpdateProfile resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# windowsQualityUpdateProfile resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List windowsQualityUpdateProfiles](../api/intune-windowsqualityupdateprofile-list.md)|[windowsQualityUpdateProfile](../resources/intune-windowsqualityupdateprofile.md) collection|Get a list of the [windowsQualityUpdateProfile](../resources/windowsqualityupdateprofile.md) objects and their properties.|
|[Create windowsQualityUpdateProfile](../api/intune-windowsqualityupdateprofile-create.md)|[windowsQualityUpdateProfile](../resources/intune-windowsqualityupdateprofile.md)|Create a new [windowsQualityUpdateProfile](../resources/intune-windowsqualityupdateprofile.md) object.|
|[Get windowsQualityUpdateProfile](../api/intune-windowsqualityupdateprofile-get.md)|[windowsQualityUpdateProfile](../resources/intune-windowsqualityupdateprofile.md)|Read the properties and relationships of a [windowsQualityUpdateProfile](../resources/intune-windowsqualityupdateprofile.md) object.|
|[Update windowsQualityUpdateProfile](../api/intune-windowsqualityupdateprofile-update.md)|[windowsQualityUpdateProfile](../resources/intune-windowsqualityupdateprofile.md)|Update the properties of a [windowsQualityUpdateProfile](../resources/intune-windowsqualityupdateprofile.md) object.|
|[Delete windowsQualityUpdateProfile](../api/intune-windowsqualityupdateprofile-delete.md)|None|Deletes a [windowsQualityUpdateProfile](../resources/intune-windowsqualityupdateprofile.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|createdDateTime|DateTimeOffset|**TODO: Add Description**|
|deployableContentDisplayName|String|**TODO: Add Description**|
|description|String|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|expeditedUpdateSettings|[expeditedWindowsQualityUpdateSettings](../resources/intune-expeditedwindowsqualityupdatesettings.md)|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description**|
|releaseDateDisplayName|String|**TODO: Add Description**|
|roleScopeTagIds|String collection|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|assignments|[windowsQualityUpdateProfileAssignment](../resources/intune-windowsqualityupdateprofileassignment.md) collection|**TODO: Add Description**|

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
  "displayName": "String",
  "description": "String",
  "expeditedUpdateSettings": {
    "@odata.type": "microsoft.graph.expeditedWindowsQualityUpdateSettings"
  },
  "createdDateTime": "String (timestamp)",
  "lastModifiedDateTime": "String (timestamp)",
  "roleScopeTagIds": [
    "String"
  ],
  "releaseDateDisplayName": "String",
  "deployableContentDisplayName": "String"
}
```


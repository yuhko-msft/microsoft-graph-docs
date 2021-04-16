---
title: "educationRoot resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# educationRoot resource type

Namespace: microsoft.graph



**TODO: Add Description**

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[Get educationRoot](../api/educationroot-get.md)|[educationRoot](../resources/educationroot.md)|Read the properties and relationships of an [educationRoot](../resources/educationroot.md) object.|
|[Update educationRoot](../api/educationroot-update.md)|[educationRoot](../resources/educationroot.md)|Update the properties of an [educationRoot](../resources/educationroot.md) object.|
|[List synchronizationProfiles](../api/educationroot-list-synchronizationprofiles.md)|[educationSynchronizationProfile](../resources/educationsynchronizationprofile.md) collection|Get the educationSynchronizationProfile resources from the synchronizationProfiles navigation property.|
|[Create educationSynchronizationProfile](../api/educationroot-post-synchronizationprofiles.md)|[educationSynchronizationProfile](../resources/educationsynchronizationprofile.md)|Create a new educationSynchronizationProfile object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|classes|[educationClass](../resources/educationclass.md) collection|**TODO: Add Description**|
|me|[educationUser](../resources/educationuser.md)|**TODO: Add Description**|
|schools|[educationSchool](../resources/educationschool.md) collection|**TODO: Add Description**|
|synchronizationProfiles|[educationSynchronizationProfile](../resources/educationsynchronizationprofile.md) collection|**TODO: Add Description**|
|users|[educationUser](../resources/educationuser.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.educationRoot",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.educationRoot"
}
```


---
title: "settings resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# settings resource type

Namespace: microsoft.graph.admin

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List settings](../api/settings-list.md)|[settings](../resources/admin-settings.md) collection|Get a list of the [settings](../resources/settings.md) objects and their properties.|
|[Create settings](../api/admin-settings-create.md)|[settings](../resources/admin-settings.md)|Create a new [settings](../resources/admin-settings.md) object.|
|[Get settings](../api/admin-settings-get.md)|[settings](../resources/admin-settings.md)|Read the properties and relationships of a [settings](../resources/admin-settings.md) object.|
|[Update settings](../api/admin-settings-update.md)|[settings](../resources/admin-settings.md)|Update the properties of a [settings](../resources/admin-settings.md) object.|
|[Delete settings](../api/admin-settings-delete.md)|None|Deletes a [settings](../resources/admin-settings.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|isCommentsOnSitePagesEnabled|Boolean|**TODO: Add Description**|
|isFluidEnabled|Boolean|**TODO: Add Description**|
|isSharePointNewsfeedEnabled|Boolean|**TODO: Add Description**|
|isSitePagesEnabled|Boolean|**TODO: Add Description**|
|sharingCapability|sharingCapabilities|**TODO: Add Description**. Possible values are: `disabled`, `externalUserSharingOnly`, `externalUserAndGuestSharing`, `existingExternalUserSharingOnly`.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.admin.settings",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.admin.settings",
  "isSitePagesEnabled": "Boolean",
  "isFluidEnabled": "Boolean",
  "isCommentsOnSitePagesEnabled": "Boolean",
  "isSharePointNewsfeedEnabled": "Boolean",
  "sharingCapability": "String"
}
```


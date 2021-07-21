---
title: "userScopeTeamsAppInstallation resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# userScopeTeamsAppInstallation resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [teamsAppInstallation](../resources/teamsappinstallation.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List userScopeTeamsAppInstallations](../api/userscopeteamsappinstallation-list.md)|[userScopeTeamsAppInstallation](../resources/userscopeteamsappinstallation.md) collection|Get a list of the [userScopeTeamsAppInstallation](../resources/userscopeteamsappinstallation.md) objects and their properties.|
|[Create userScopeTeamsAppInstallation](../api/userscopeteamsappinstallation-create.md)|[userScopeTeamsAppInstallation](../resources/userscopeteamsappinstallation.md)|Create a new [userScopeTeamsAppInstallation](../resources/userscopeteamsappinstallation.md) object.|
|[Get userScopeTeamsAppInstallation](../api/userscopeteamsappinstallation-get.md)|[userScopeTeamsAppInstallation](../resources/userscopeteamsappinstallation.md)|Read the properties and relationships of a [userScopeTeamsAppInstallation](../resources/userscopeteamsappinstallation.md) object.|
|[Update userScopeTeamsAppInstallation](../api/userscopeteamsappinstallation-update.md)|[userScopeTeamsAppInstallation](../resources/userscopeteamsappinstallation.md)|Update the properties of a [userScopeTeamsAppInstallation](../resources/userscopeteamsappinstallation.md) object.|
|[Delete userScopeTeamsAppInstallation](../api/userscopeteamsappinstallation-delete.md)|None|Deletes a [userScopeTeamsAppInstallation](../resources/userscopeteamsappinstallation.md) object.|
|[upgrade](../api/userscopeteamsappinstallation-upgrade.md)|None|**TODO: Add Description**|
|[List chat](../api/userscopeteamsappinstallation-list-chat.md)|[chat](../resources/chat.md) collection|Get the chat resources from the chat navigation property.|
|[Add chat](../api/userscopeteamsappinstallation-post-chat.md)|[chat](../resources/chat.md)|Add chat by posting to the chat collection.|
|[List teamsApp](../api/userscopeteamsappinstallation-list-teamsapp.md)|[teamsApp](../resources/teamsapp.md) collection|Get the teamsApp resources from the teamsApp navigation property.|
|[Add teamsApp](../api/userscopeteamsappinstallation-post-teamsapp.md)|[teamsApp](../resources/teamsapp.md)|Add teamsApp by posting to the teamsApp collection.|
|[List teamsAppDefinition](../api/userscopeteamsappinstallation-list-teamsappdefinition.md)|[teamsAppDefinition](../resources/teamsappdefinition.md) collection|Get the teamsAppDefinition resources from the teamsAppDefinition navigation property.|
|[Add teamsAppDefinition](../api/userscopeteamsappinstallation-post-teamsappdefinition.md)|[teamsAppDefinition](../resources/teamsappdefinition.md)|Add teamsAppDefinition by posting to the teamsAppDefinition collection.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|chat|[chat](../resources/chat.md)|**TODO: Add Description**|
|teamsApp|[teamsApp](../resources/teamsapp.md)|**TODO: Add Description** Inherited from [teamsAppInstallation](../resources/teamsappinstallation.md)|
|teamsAppDefinition|[teamsAppDefinition](../resources/teamsappdefinition.md)|**TODO: Add Description** Inherited from [teamsAppInstallation](../resources/teamsappinstallation.md)|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.userScopeTeamsAppInstallation",
  "baseType": "microsoft.graph.teamsAppInstallation",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.userScopeTeamsAppInstallation",
  "id": "String (identifier)"
}
```


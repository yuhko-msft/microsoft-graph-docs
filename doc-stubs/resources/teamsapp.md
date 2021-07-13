---
title: "teamsApp resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# teamsApp resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List teamsApps](../api/teamsapp-list.md)|[teamsApp](../resources/teamsapp.md) collection|Get a list of the [teamsApp](../resources/teamsapp.md) objects and their properties.|
|[Create teamsApp](../api/teamsapp-create.md)|[teamsApp](../resources/teamsapp.md)|Create a new [teamsApp](../resources/teamsapp.md) object.|
|[Get teamsApp](../api/teamsapp-get.md)|[teamsApp](../resources/teamsapp.md)|Read the properties and relationships of a [teamsApp](../resources/teamsapp.md) object.|
|[Update teamsApp](../api/teamsapp-update.md)|[teamsApp](../resources/teamsapp.md)|Update the properties of a [teamsApp](../resources/teamsapp.md) object.|
|[Delete teamsApp](../api/teamsapp-delete.md)|None|Deletes a [teamsApp](../resources/teamsapp.md) object.|
|[List appDefinitions](../api/teamsapp-list-appdefinitions.md)|[teamsAppDefinition](../resources/teamsappdefinition.md) collection|Get the teamsAppDefinition resources from the appDefinitions navigation property.|
|[Create teamsAppDefinition](../api/teamsapp-post-appdefinitions.md)|[teamsAppDefinition](../resources/teamsappdefinition.md)|Create a new teamsAppDefinition object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|displayName|String|**TODO: Add Description**|
|distributionMethod|teamsAppDistributionMethod|**TODO: Add Description**. Possible values are: `store`, `organization`, `sideloaded`, `unknownFutureValue`.|
|externalId|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|appDefinitions|[teamsAppDefinition](../resources/teamsappdefinition.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.teamsApp",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.teamsApp",
  "id": "String (identifier)",
  "displayName": "String",
  "distributionMethod": "String",
  "externalId": "String"
}
```


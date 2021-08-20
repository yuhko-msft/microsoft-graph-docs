---
title: "organizationSettings resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# organizationSettings resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List organizationSettings](../api/organizationsettings-list.md)|[organizationSettings](../resources/organizationsettings.md) collection|Get a list of the [organizationSettings](../resources/organizationsettings.md) objects and their properties.|
|[Create organizationSettings](../api/organizationsettings-create.md)|[organizationSettings](../resources/organizationsettings.md)|Create a new [organizationSettings](../resources/organizationsettings.md) object.|
|[Get organizationSettings](../api/organizationsettings-get.md)|[organizationSettings](../resources/organizationsettings.md)|Read the properties and relationships of an [organizationSettings](../resources/organizationsettings.md) object.|
|[Update organizationSettings](../api/organizationsettings-update.md)|[organizationSettings](../resources/organizationsettings.md)|Update the properties of an [organizationSettings](../resources/organizationsettings.md) object.|
|[Delete organizationSettings](../api/organizationsettings-delete.md)|None|Deletes an [organizationSettings](../resources/organizationsettings.md) object.|
|[List insightsSettings](../api/organizationsettings-list-iteminsights.md)|[insightsSettings](../resources/insightssettings.md) collection|Get the insightsSettings resources from the itemInsights navigation property.|
|[Create insightsSettings](../api/organizationsettings-post-iteminsights.md)|[insightsSettings](../resources/insightssettings.md)|Create a new insightsSettings object.|
|[List insightsSettings](../api/organizationsettings-list-peopleinsights.md)|[insightsSettings](../resources/insightssettings.md) collection|Get the insightsSettings resources from the peopleInsights navigation property.|
|[Create insightsSettings](../api/organizationsettings-post-peopleinsights.md)|[insightsSettings](../resources/insightssettings.md)|Create a new insightsSettings object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|itemInsights|[insightsSettings](../resources/insightssettings.md)|**TODO: Add Description**|
|peopleInsights|[insightsSettings](../resources/insightssettings.md)|**TODO: Add Description**|
|profileCardProperties|[profileCardProperty](../resources/profilecardproperty.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.organizationSettings",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.organizationSettings",
  "id": "String (identifier)"
}
```


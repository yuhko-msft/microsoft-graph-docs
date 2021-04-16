---
title: "userAnalytics resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# userAnalytics resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List userAnalytics](../api/useranalytics-list.md)|[userAnalytics](../resources/useranalytics.md) collection|Get a list of the [userAnalytics](../resources/useranalytics.md) objects and their properties.|
|[Create userAnalytics](../api/useranalytics-create.md)|[userAnalytics](../resources/useranalytics.md)|Create a new [userAnalytics](../resources/useranalytics.md) object.|
|[Get userAnalytics](../api/useranalytics-get.md)|[userAnalytics](../resources/useranalytics.md)|Read the properties and relationships of a [userAnalytics](../resources/useranalytics.md) object.|
|[Update userAnalytics](../api/useranalytics-update.md)|[userAnalytics](../resources/useranalytics.md)|Update the properties of a [userAnalytics](../resources/useranalytics.md) object.|
|[Delete userAnalytics](../api/useranalytics-delete.md)|None|Deletes a [userAnalytics](../resources/useranalytics.md) object.|
|[List activityStatistics](../api/useranalytics-list-activitystatistics.md)|[activityStatistics](../resources/activitystatistics.md) collection|Get the activityStatistics resources from the activityStatistics navigation property.|
|[Create activityStatistics](../api/useranalytics-post-activitystatistics.md)|[activityStatistics](../resources/activitystatistics.md)|Create a new activityStatistics object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|settings|[settings](../resources/settings.md)|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|activityStatistics|[activityStatistics](../resources/activitystatistics.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.userAnalytics",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.userAnalytics",
  "id": "String (identifier)",
  "settings": {
    "@odata.type": "microsoft.graph.settings"
  }
}
```


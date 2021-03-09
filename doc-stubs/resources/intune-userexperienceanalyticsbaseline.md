---
title: "userExperienceAnalyticsBaseline resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# userExperienceAnalyticsBaseline resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List userExperienceAnalyticsBaselines](../api/intune-userexperienceanalyticsbaseline-list.md)|[userExperienceAnalyticsBaseline](../resources/intune-userexperienceanalyticsbaseline.md) collection|Get a list of the [userExperienceAnalyticsBaseline](../resources/userexperienceanalyticsbaseline.md) objects and their properties.|
|[Create userExperienceAnalyticsBaseline](../api/intune-userexperienceanalyticsbaseline-create.md)|[userExperienceAnalyticsBaseline](../resources/intune-userexperienceanalyticsbaseline.md)|Create a new [userExperienceAnalyticsBaseline](../resources/intune-userexperienceanalyticsbaseline.md) object.|
|[Get userExperienceAnalyticsBaseline](../api/intune-userexperienceanalyticsbaseline-get.md)|[userExperienceAnalyticsBaseline](../resources/intune-userexperienceanalyticsbaseline.md)|Read the properties and relationships of a [userExperienceAnalyticsBaseline](../resources/intune-userexperienceanalyticsbaseline.md) object.|
|[Update userExperienceAnalyticsBaseline](../api/intune-userexperienceanalyticsbaseline-update.md)|[userExperienceAnalyticsBaseline](../resources/intune-userexperienceanalyticsbaseline.md)|Update the properties of a [userExperienceAnalyticsBaseline](../resources/intune-userexperienceanalyticsbaseline.md) object.|
|[Delete userExperienceAnalyticsBaseline](../api/intune-userexperienceanalyticsbaseline-delete.md)|None|Deletes a [userExperienceAnalyticsBaseline](../resources/intune-userexperienceanalyticsbaseline.md) object.|
|[List userExperienceAnalyticsCategory](../api/intune-userexperienceanalyticsbaseline-list-workfromanywheremetrics.md)|[userExperienceAnalyticsCategory](../resources/intune-userexperienceanalyticscategory.md) collection|Get the userExperienceAnalyticsCategory resources from the workFromAnywhereMetrics navigation property.|
|[Add userExperienceAnalyticsCategory](../api/intune-userexperienceanalyticsbaseline-post-workfromanywheremetrics.md)|[userExperienceAnalyticsCategory](../resources/intune-userexperienceanalyticscategory.md)|Add workFromAnywhereMetrics by posting to the workFromAnywhereMetrics collection.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|createdDateTime|DateTimeOffset|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|isBuiltIn|Boolean|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|appHealthMetrics|[userExperienceAnalyticsCategory](../resources/intune-userexperienceanalyticscategory.md)|**TODO: Add Description**|
|bestPracticesMetrics|[userExperienceAnalyticsCategory](../resources/intune-userexperienceanalyticscategory.md)|**TODO: Add Description**|
|deviceBootPerformanceMetrics|[userExperienceAnalyticsCategory](../resources/intune-userexperienceanalyticscategory.md)|**TODO: Add Description**|
|rebootAnalyticsMetrics|[userExperienceAnalyticsCategory](../resources/intune-userexperienceanalyticscategory.md)|**TODO: Add Description**|
|resourcePerformanceMetrics|[userExperienceAnalyticsCategory](../resources/intune-userexperienceanalyticscategory.md)|**TODO: Add Description**|
|workFromAnywhereMetrics|[userExperienceAnalyticsCategory](../resources/intune-userexperienceanalyticscategory.md)|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.userExperienceAnalyticsBaseline",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.userExperienceAnalyticsBaseline",
  "id": "String (identifier)",
  "displayName": "String",
  "isBuiltIn": "Boolean",
  "createdDateTime": "String (timestamp)"
}
```


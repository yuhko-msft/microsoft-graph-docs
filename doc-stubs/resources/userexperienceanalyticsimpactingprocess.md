---
title: "userExperienceAnalyticsImpactingProcess resource type"
description: "The user experience analytics top impacting process entity."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# userExperienceAnalyticsImpactingProcess resource type

Namespace: microsoft.graph



The user experience analytics top impacting process entity.


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List userExperienceAnalyticsImpactingProcesses](../api/userexperienceanalyticsimpactingprocess-list.md)|[userExperienceAnalyticsImpactingProcess](../resources/userexperienceanalyticsimpactingprocess.md) collection|Get a list of the [userExperienceAnalyticsImpactingProcess](../resources/userexperienceanalyticsimpactingprocess.md) objects and their properties.|
|[Create userExperienceAnalyticsImpactingProcess](../api/userexperienceanalyticsimpactingprocess-create.md)|[userExperienceAnalyticsImpactingProcess](../resources/userexperienceanalyticsimpactingprocess.md)|Create a new [userExperienceAnalyticsImpactingProcess](../resources/userexperienceanalyticsimpactingprocess.md) object.|
|[Get userExperienceAnalyticsImpactingProcess](../api/userexperienceanalyticsimpactingprocess-get.md)|[userExperienceAnalyticsImpactingProcess](../resources/userexperienceanalyticsimpactingprocess.md)|Read the properties and relationships of a [userExperienceAnalyticsImpactingProcess](../resources/userexperienceanalyticsimpactingprocess.md) object.|
|[Update userExperienceAnalyticsImpactingProcess](../api/userexperienceanalyticsimpactingprocess-update.md)|[userExperienceAnalyticsImpactingProcess](../resources/userexperienceanalyticsimpactingprocess.md)|Update the properties of a [userExperienceAnalyticsImpactingProcess](../resources/userexperienceanalyticsimpactingprocess.md) object.|
|[Delete userExperienceAnalyticsImpactingProcess](../api/userexperienceanalyticsimpactingprocess-delete.md)|None|Deletes a [userExperienceAnalyticsImpactingProcess](../resources/userexperienceanalyticsimpactingprocess.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|category|String|The category of impacting process.|
|description|String|The description of process.|
|deviceId|String|The unique identifier of the impacted device.|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|impactValue|Double|The impact value of the process. Valid values 0 to 1.79769313486232E+308|
|processName|String|The process name.|
|publisher|String|The publisher of the process.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.userExperienceAnalyticsImpactingProcess",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.userExperienceAnalyticsImpactingProcess",
  "id": "String (identifier)",
  "category": "String",
  "description": "String",
  "deviceId": "String",
  "impactValue": "Double",
  "processName": "String",
  "publisher": "String"
}
```


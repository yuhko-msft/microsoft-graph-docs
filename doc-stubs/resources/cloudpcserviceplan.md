---
title: "cloudPcServicePlan resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# cloudPcServicePlan resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List cloudPcServicePlans](../api/cloudpcserviceplan-list.md)|[cloudPcServicePlan](../resources/cloudpcserviceplan.md) collection|Get a list of the [cloudPcServicePlan](../resources/cloudpcserviceplan.md) objects and their properties.|
|[Create cloudPcServicePlan](../api/virtualendpoint-post-serviceplans.md)|[cloudPcServicePlan](../resources/cloudpcserviceplan.md)|Create a new [cloudPcServicePlan](../resources/cloudpcserviceplan.md) object.|
|[Get cloudPcServicePlan](../api/cloudpcserviceplan-get.md)|[cloudPcServicePlan](../resources/cloudpcserviceplan.md)|Read the properties and relationships of a [cloudPcServicePlan](../resources/cloudpcserviceplan.md) object.|
|[Update cloudPcServicePlan](../api/cloudpcserviceplan-update.md)|[cloudPcServicePlan](../resources/cloudpcserviceplan.md)|Update the properties of a [cloudPcServicePlan](../resources/cloudpcserviceplan.md) object.|
|[Delete cloudPcServicePlan](../api/cloudpcserviceplan-delete.md)|None|Deletes a [cloudPcServicePlan](../resources/cloudpcserviceplan.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|category|cloudPcServicePlanCategory|**TODO: Add Description**. The possible values are: `test`, `internal`, `commercial`, `unknownFutureValue`.|
|displayName|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|ramInGB|Int32|**TODO: Add Description**|
|storageInGB|Int32|**TODO: Add Description**|
|type|cloudPcServicePlanType|**TODO: Add Description**. The possible values are: `enterprise`, `business`, `unknownFutureValue`.|
|userProfileInGB|Int32|**TODO: Add Description**|
|vCpuCount|Int32|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.cloudPcServicePlan",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.cloudPcServicePlan",
  "id": "String (identifier)",
  "category": "String",
  "displayName": "String",
  "ramInGB": "Integer",
  "storageInGB": "Integer",
  "type": "String",
  "userProfileInGB": "Integer",
  "vCpuCount": "Integer"
}
```


---
title: "managementTemplateStep resource type"
description: "**TODO: Add Description**"
author: "idwilliams"
ms.localizationpriority: medium
ms.prod: "microsoft-365-lighthouse"
doc_type: resourcePageType
---

# managementTemplateStep resource type

Namespace: microsoft.graph.managedTenants

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List managementTemplateSteps](../api/managedtenants-managedtenant-list-managementtemplatesteps.md)|[microsoft.graph.managedTenants.managementTemplateStep](../resources/managedtenants-managementtemplatestep.md) collection|Get a list of the [microsoft.graph.managedTenants.managementTemplateStep](../resources/managedtenants-managementtemplatestep.md) objects and their properties.|
|[Get managementTemplateStep](../api/managedtenants-managementtemplatestep-get.md)|[microsoft.graph.managedTenants.managementTemplateStep](../resources/managedtenants-managementtemplatestep.md)|Read the properties and relationships of a [microsoft.graph.managedTenants.managementTemplateStep](../resources/managedtenants-managementtemplatestep.md) object.|
|[List managementTemplate](../api/managedtenants-managementtemplatestep-list-managementtemplate.md)|[microsoft.graph.managedTenants.managementTemplate](../resources/managedtenants-managementtemplate.md) collection|Get the managementTemplate resources from the managementTemplate navigation property.|
|[List stepVersions](../api/managedtenants-managementtemplatestep-list-stepversions.md)|[microsoft.graph.managedTenants.managementTemplateStepVersion](../resources/managedtenants-managementtemplatestepversion.md) collection|Get the managementTemplateStepVersion resources from the stepVersions navigation property.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|category|managementCategory|**TODO: Add Description**.The possible values are: `custom`, `devices`, `identity`, `data`, `unknownFutureValue`.|
|description|String|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|id|String|**TODO: Add Description**|
|managementPortal|String|**TODO: Add Description**|
|portalLink|String|**TODO: Add Description**|
|priority|Int32|**TODO: Add Description**|
|provider|managementProvider|**TODO: Add Description**.The possible values are: `microsoft`, `community`, `indirectProvider`, `self`, `unknownFutureValue`.|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|managementTemplate|[managementTemplate](../resources/managedtenants-managementtemplate.md)|**TODO: Add Description**|
|stepVersions|[microsoft.graph.managedTenants.managementTemplateStepVersion](../resources/managedtenants-managementtemplatestepversion.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.managedTenants.managementTemplateStep",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.managedTenants.managementTemplateStep",
  "id": "String (identifier)",
  "displayName": "String",
  "description": "String",
  "priority": "Integer",
  "category": "String",
  "provider": "String",
  "managementPortal": "String",
  "portalLink": "String"
}
```


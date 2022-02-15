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


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List managementTemplateSteps](../api/managedtenants-managementtemplatestep-list.md)|[microsoft.graph.managedTenants.managementTemplateStep](../resources/managedtenants-managementtemplatestep.md) collection|Get a list of the [managementTemplateStep](../resources/managedtenants-managementtemplatestep.md) objects and their properties.|
|[Create managementTemplateStep](../api/managedtenants-managementtemplate-post-managementtemplatesteps.md)|[microsoft.graph.managedTenants.managementTemplateStep](../resources/managedtenants-managementtemplatestep.md)|Create a new [managementTemplateStep](../resources/managedtenants-managementtemplatestep.md) object.|
|[Get managementTemplateStep](../api/managedtenants-managementtemplatestep-get.md)|[microsoft.graph.managedTenants.managementTemplateStep](../resources/managedtenants-managementtemplatestep.md)|Read the properties and relationships of a [managementTemplateStep](../resources/managedtenants-managementtemplatestep.md) object.|
|[Update managementTemplateStep](../api/managedtenants-managementtemplatestep-update.md)|[microsoft.graph.managedTenants.managementTemplateStep](../resources/managedtenants-managementtemplatestep.md)|Update the properties of a [managementTemplateStep](../resources/managedtenants-managementtemplatestep.md) object.|
|[Delete managementTemplateStep](../api/managedtenants-managementtemplatestep-delete.md)|None|Deletes a [managementTemplateStep](../resources/managedtenants-managementtemplatestep.md) object.|
|[List managementTemplateStepVersion](../api/managedtenants-managementtemplatestep-list-acceptedversion.md)|[microsoft.graph.managedTenants.managementTemplateStepVersion](../resources/managedtenants-managementtemplatestepversion.md) collection|Get the managementTemplateStepVersion resources from the acceptedVersion navigation property.|
|[Add managementTemplateStepVersion](../api/managedtenants-managementtemplatestep-post-acceptedversion.md)|[microsoft.graph.managedTenants.managementTemplateStepVersion](../resources/managedtenants-managementtemplatestepversion.md)|Add acceptedVersion by posting to the acceptedVersion collection.|
|[List versions](../api/managedtenants-managementtemplatestep-list-versions.md)|[microsoft.graph.managedTenants.managementTemplateStepVersion](../resources/managedtenants-managementtemplatestepversion.md) collection|Get the managementTemplateStepVersion resources from the versions navigation property.|
|[Add managementTemplateStepVersion](../api/managedtenants-managementtemplatestep-post-versions.md)|[microsoft.graph.managedTenants.managementTemplateStepVersion](../resources/managedtenants-managementtemplatestepversion.md)|Add versions by posting to the versions collection.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|category|managementCategory|**TODO: Add Description**.The possible values are: `custom`, `devices`, `identity`, `data`, `unknownFutureValue`.|
|createdByUserId|String|**TODO: Add Description**|
|createdDateTime|DateTimeOffset|**TODO: Add Description**|
|description|String|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|lastActionByUserId|String|**TODO: Add Description**|
|lastActionDateTime|DateTimeOffset|**TODO: Add Description**|
|portalLink|[microsoft.graph.actionUrl](../resources/actionurl.md)|**TODO: Add Description**|
|priority|Int32|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|acceptedVersion|[managementTemplateStepVersion](../resources/managedtenants-managementtemplatestepversion.md)|**TODO: Add Description**|
|managementTemplate|[managementTemplate](../resources/managedtenants-managementtemplate.md)|**TODO: Add Description**|
|versions|[microsoft.graph.managedTenants.managementTemplateStepVersion](../resources/managedtenants-managementtemplatestepversion.md) collection|**TODO: Add Description**|

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
  "portalLink": {
    "@odata.type": "microsoft.graph.actionUrl"
  },
  "createdDateTime": "String (timestamp)",
  "createdByUserId": "String",
  "lastActionDateTime": "String (timestamp)",
  "lastActionByUserId": "String"
}
```


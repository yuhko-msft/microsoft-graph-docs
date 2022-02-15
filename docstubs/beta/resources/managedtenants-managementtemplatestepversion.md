---
title: "managementTemplateStepVersion resource type"
description: "**TODO: Add Description**"
author: "idwilliams"
ms.localizationpriority: medium
ms.prod: "microsoft-365-lighthouse"
doc_type: resourcePageType
---

# managementTemplateStepVersion resource type

Namespace: microsoft.graph.managedTenants

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List managementTemplateStepVersions](../api/managedtenants-managementtemplatestepversion-list.md)|[microsoft.graph.managedTenants.managementTemplateStepVersion](../resources/managedtenants-managementtemplatestepversion.md) collection|Get a list of the [managementTemplateStepVersion](../resources/managedtenants-managementtemplatestepversion.md) objects and their properties.|
|[Create managementTemplateStepVersion](../api/managedtenants-managementtemplatestep-post-versions.md)|[microsoft.graph.managedTenants.managementTemplateStepVersion](../resources/managedtenants-managementtemplatestepversion.md)|Create a new [managementTemplateStepVersion](../resources/managedtenants-managementtemplatestepversion.md) object.|
|[Get managementTemplateStepVersion](../api/managedtenants-managementtemplatestepversion-get.md)|[microsoft.graph.managedTenants.managementTemplateStepVersion](../resources/managedtenants-managementtemplatestepversion.md)|Read the properties and relationships of a [managementTemplateStepVersion](../resources/managedtenants-managementtemplatestepversion.md) object.|
|[Update managementTemplateStepVersion](../api/managedtenants-managementtemplatestepversion-update.md)|[microsoft.graph.managedTenants.managementTemplateStepVersion](../resources/managedtenants-managementtemplatestepversion.md)|Update the properties of a [managementTemplateStepVersion](../resources/managedtenants-managementtemplatestepversion.md) object.|
|[Delete managementTemplateStepVersion](../api/managedtenants-managementtemplatestepversion-delete.md)|None|Deletes a [managementTemplateStepVersion](../resources/managedtenants-managementtemplatestepversion.md) object.|
|[List managementTemplateStep](../api/managedtenants-managementtemplatestepversion-list-acceptedfor.md)|[microsoft.graph.managedTenants.managementTemplateStep](../resources/managedtenants-managementtemplatestep.md) collection|Get the managementTemplateStep resources from the acceptedFor navigation property.|
|[Add managementTemplateStep](../api/managedtenants-managementtemplatestepversion-post-acceptedfor.md)|[microsoft.graph.managedTenants.managementTemplateStep](../resources/managedtenants-managementtemplatestep.md)|Add acceptedFor by posting to the acceptedFor collection.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|contentMarkdown|String|**TODO: Add Description**|
|createdByUserId|String|**TODO: Add Description**|
|createdDateTime|DateTimeOffset|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|lastActionByUserId|String|**TODO: Add Description**|
|lastActionDateTime|DateTimeOffset|**TODO: Add Description**|
|name|String|**TODO: Add Description**|
|version|Int32|**TODO: Add Description**|
|versionInformation|String|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|acceptedFor|[managementTemplateStep](../resources/managedtenants-managementtemplatestep.md)|**TODO: Add Description**|
|deployments|[microsoft.graph.managedTenants.managementTemplateStepDeployment](../resources/managedtenants-managementtemplatestepdeployment.md) collection|**TODO: Add Description**|
|templateStep|[managementTemplateStep](../resources/managedtenants-managementtemplatestep.md)|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.managedTenants.managementTemplateStepVersion",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.managedTenants.managementTemplateStepVersion",
  "id": "String (identifier)",
  "version": "Integer",
  "name": "String",
  "versionInformation": "String",
  "contentMarkdown": "String",
  "createdDateTime": "String (timestamp)",
  "createdByUserId": "String",
  "lastActionDateTime": "String (timestamp)",
  "lastActionByUserId": "String"
}
```


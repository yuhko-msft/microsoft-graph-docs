---
title: "managementTemplateStepDeployment resource type"
description: "**TODO: Add Description**"
author: "idwilliams"
ms.localizationpriority: medium
ms.prod: "microsoft-365-lighthouse"
doc_type: resourcePageType
---

# managementTemplateStepDeployment resource type

Namespace: microsoft.graph.managedTenants

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List managementTemplateStepDeployments](../api/managedtenants-managementtemplatestepdeployment-list.md)|[microsoft.graph.managedTenants.managementTemplateStepDeployment](../resources/managedtenants-managementtemplatestepdeployment.md) collection|Get a list of the [managementTemplateStepDeployment](../resources/managedtenants-managementtemplatestepdeployment.md) objects and their properties.|
|[Create managementTemplateStepDeployment](../api/managedtenants-managementtemplatestepversion-post-deployments.md)|[microsoft.graph.managedTenants.managementTemplateStepDeployment](../resources/managedtenants-managementtemplatestepdeployment.md)|Create a new [managementTemplateStepDeployment](../resources/managedtenants-managementtemplatestepdeployment.md) object.|
|[Get managementTemplateStepDeployment](../api/managedtenants-managementtemplatestepdeployment-get.md)|[microsoft.graph.managedTenants.managementTemplateStepDeployment](../resources/managedtenants-managementtemplatestepdeployment.md)|Read the properties and relationships of a [managementTemplateStepDeployment](../resources/managedtenants-managementtemplatestepdeployment.md) object.|
|[Update managementTemplateStepDeployment](../api/managedtenants-managementtemplatestepdeployment-update.md)|[microsoft.graph.managedTenants.managementTemplateStepDeployment](../resources/managedtenants-managementtemplatestepdeployment.md)|Update the properties of a [managementTemplateStepDeployment](../resources/managedtenants-managementtemplatestepdeployment.md) object.|
|[Delete managementTemplateStepDeployment](../api/managedtenants-managementtemplatestepdeployment-delete.md)|None|Deletes a [managementTemplateStepDeployment](../resources/managedtenants-managementtemplatestepdeployment.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|createdByUserId|String|**TODO: Add Description**|
|createdDateTime|DateTimeOffset|**TODO: Add Description**|
|error|[microsoft.graph.managedTenants.graphAPIErrorDetails](../resources/managedtenants-graphapierrordetails.md)|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|lastActionByUserId|String|**TODO: Add Description**|
|lastActionDateTime|DateTimeOffset|**TODO: Add Description**|
|status|managementTemplateDeploymentStatus|**TODO: Add Description**.The possible values are: `unknown`, `inProgress`, `completed`, `failed`, `ineligible`, `unknownFutureValue`.|
|tenantId|String|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|templateStepVersion|[managementTemplateStepVersion](../resources/managedtenants-managementtemplatestepversion.md)|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.managedTenants.managementTemplateStepDeployment",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.managedTenants.managementTemplateStepDeployment",
  "id": "String (identifier)",
  "tenantId": "String",
  "status": "String",
  "error": {
    "@odata.type": "microsoft.graph.managedTenants.graphAPIErrorDetails"
  },
  "createdDateTime": "String (timestamp)",
  "createdByUserId": "String",
  "lastActionDateTime": "String (timestamp)",
  "lastActionByUserId": "String"
}
```


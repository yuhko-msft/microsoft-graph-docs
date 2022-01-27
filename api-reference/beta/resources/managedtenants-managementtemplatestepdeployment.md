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

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List managementTemplateStepDeployments](../api/managedtenants-managementtemplatestepdeployment-list.md)|[microsoft.graph.managedTenants.managementTemplateStepDeployment](../resources/managedtenants-managementtemplatestepdeployment.md) collection|Get a list of the [managementTemplateStepDeployment](../resources/managedtenants-managementtemplatestepdeployment.md) objects and their properties.|
|[Get managementTemplateStepDeployment](../api/managedtenants-managementtemplatestepdeployment-get.md)|[microsoft.graph.managedTenants.managementTemplateStepDeployment](../resources/managedtenants-managementtemplatestepdeployment.md)|Read the properties and relationships of a [managementTemplateStepDeployment](../resources/managedtenants-managementtemplatestepdeployment.md) object.|
|[changeDeploymentStatus](../api/managedtenants-managementtemplatestepdeployment-changedeploymentstatus.md)|[microsoft.graph.managedTenants.managementTemplateStepDeployment](../resources/managedtenants-managementtemplatestepdeployment.md)|**TODO: Add Description**|
|[List managementTemplateStepVersion](../api/managedtenants-managementtemplatestepdeployment-list-templatestepversion.md)|[microsoft.graph.managedTenants.managementTemplateStepVersion](../resources/managedtenants-managementtemplatestepversion.md) collection|Get the managementTemplateStepVersion resources from the templateStepVersion navigation property.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|error|[microsoft.graph.managedTenants.graphAPIErrorDetails](../resources/managedtenants-graphapierrordetails.md)|**TODO: Add Description**|
|id|String|**TODO: Add Description**|
|settings|[microsoft.graph.managedTenants.setting](../resources/managedtenants-setting.md) collection|**TODO: Add Description**|
|status|[microsoft.graph.managedTenants.managementTemplateDeploymentStatus](#managementtemplatedeploymentstatus-values)|**TODO: Add Description**.The possible values are: `toAddress`, `completed`, `error`, `timeOut`, `inProgress`, `planned`, `resolvedBy3rdParty`, `resolvedThroughAlternateMitigation`, `riskAccepted`, `unknownFutureValue`.|
|tenantId|String|**TODO: Add Description**|

### managementTemplateDeploymentStatus values

|Member|Description|
|:---|:---|
|toAddress|**TODO: Add Description**|
|completed|**TODO: Add Description**|
|error|**TODO: Add Description**|
|timeOut|**TODO: Add Description**|
|inProgress|**TODO: Add Description**|
|planned|**TODO: Add Description**|
|resolvedBy3rdParty|**TODO: Add Description**|
|resolvedThroughAlternateMitigation|**TODO: Add Description**|
|riskAccepted|**TODO: Add Description**|
|unknownFutureValue|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|templateStepVersion|[microsoft.graph.managedTenants.managementTemplateStepVersion](../resources/managedtenants-managementtemplatestepversion.md)|**TODO: Add Description**|

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
  "settings": [
    {
      "@odata.type": "microsoft.graph.managedTenants.setting"
    }
  ],
  "status": "String",
  "error": {
    "@odata.type": "microsoft.graph.managedTenants.graphAPIErrorDetails"
  }
}
```

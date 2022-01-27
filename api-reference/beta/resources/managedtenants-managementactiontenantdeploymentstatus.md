---
title: "managementActionTenantDeploymentStatus resource type"
description: "**TODO: Add Description**"
author: "idwilliams"
ms.localizationpriority: medium
ms.prod: "microsoft-365-lighthouse"
doc_type: resourcePageType
---

# managementActionTenantDeploymentStatus resource type

Namespace: microsoft.graph.managedTenants

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List managementActionTenantDeploymentStatus](../api/managedtenants-managedtenant-list-managementactiontenantdeploymentstatuses.md)|[microsoft.graph.managedTenants.managementActionTenantDeploymentStatus](../resources/managedtenants-managementactiontenantdeploymentstatus.md) collection|Get a list of the [managementActionTenantDeploymentStatus](../resources/managedtenants-managementactiontenantdeploymentstatus.md) objects and their properties.|
|[Get managementActionTenantDeploymentStatus](../api/managedtenants-managementactiontenantdeploymentstatus-get.md)|[microsoft.graph.managedTenants.managementActionTenantDeploymentStatus](../resources/managedtenants-managementactiontenantdeploymentstatus.md)|Read the properties and relationships of a [managementActionTenantDeploymentStatus](../resources/managedtenants-managementactiontenantdeploymentstatus.md) object.|
|[changeDeploymentStatus](../api/managedtenants-managementactiontenantdeploymentstatus-changedeploymentstatus.md)|[microsoft.graph.managedTenants.managementActionDeploymentStatus](../resources/managedtenants-managementactiondeploymentstatus.md)|**TODO: Add Description**|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description**|
|statuses|[microsoft.graph.managedTenants.managementActionDeploymentStatus](../resources/managedtenants-managementactiondeploymentstatus.md) collection|**TODO: Add Description**|
|tenantGroupId|String|**TODO: Add Description**|
|tenantId|String|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.managedTenants.managementActionTenantDeploymentStatus",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.managedTenants.managementActionTenantDeploymentStatus",
  "id": "String (identifier)",
  "tenantGroupId": "String",
  "tenantId": "String",
  "statuses": [
    {
      "@odata.type": "microsoft.graph.managedTenants.managementActionDeploymentStatus"
    }
  ]
}
```


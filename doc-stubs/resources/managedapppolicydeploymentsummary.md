---
title: "managedAppPolicyDeploymentSummary resource type"
description: "The ManagedAppEntity is the base entity type for all other entity types under app management workflow."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# managedAppPolicyDeploymentSummary resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

The ManagedAppEntity is the base entity type for all other entity types under app management workflow.


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List managedAppPolicyDeploymentSummaries](../api/managedapppolicydeploymentsummary-list.md)|[managedAppPolicyDeploymentSummary](../resources/managedapppolicydeploymentsummary.md) collection|Get a list of the [managedAppPolicyDeploymentSummary](../resources/managedapppolicydeploymentsummary.md) objects and their properties.|
|[Create managedAppPolicyDeploymentSummary](../api/managedapppolicydeploymentsummary-create.md)|[managedAppPolicyDeploymentSummary](../resources/managedapppolicydeploymentsummary.md)|Create a new [managedAppPolicyDeploymentSummary](../resources/managedapppolicydeploymentsummary.md) object.|
|[Get managedAppPolicyDeploymentSummary](../api/managedapppolicydeploymentsummary-get.md)|[managedAppPolicyDeploymentSummary](../resources/managedapppolicydeploymentsummary.md)|Read the properties and relationships of a [managedAppPolicyDeploymentSummary](../resources/managedapppolicydeploymentsummary.md) object.|
|[Update managedAppPolicyDeploymentSummary](../api/managedapppolicydeploymentsummary-update.md)|[managedAppPolicyDeploymentSummary](../resources/managedapppolicydeploymentsummary.md)|Update the properties of a [managedAppPolicyDeploymentSummary](../resources/managedapppolicydeploymentsummary.md) object.|
|[Delete managedAppPolicyDeploymentSummary](../api/managedapppolicydeploymentsummary-delete.md)|None|Deletes a [managedAppPolicyDeploymentSummary](../resources/managedapppolicydeploymentsummary.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|configurationDeployedUserCount|Int32|**TODO: Add Description**|
|configurationDeploymentSummaryPerApp|[managedAppPolicyDeploymentSummaryPerApp](../resources/managedapppolicydeploymentsummaryperapp.md) collection|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|lastRefreshTime|DateTimeOffset|**TODO: Add Description**|
|version|String|Version of the entity.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.managedAppPolicyDeploymentSummary",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.managedAppPolicyDeploymentSummary",
  "id": "String (identifier)",
  "configurationDeployedUserCount": "Integer",
  "configurationDeploymentSummaryPerApp": [
    {
      "@odata.type": "microsoft.graph.managedAppPolicyDeploymentSummaryPerApp"
    }
  ],
  "displayName": "String",
  "lastRefreshTime": "String (timestamp)",
  "version": "String"
}
```


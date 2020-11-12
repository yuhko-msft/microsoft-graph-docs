---
title: "featureConfiguration resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# featureConfiguration resource type

Namespace: microsoft.graph

**TODO: Add Description**

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List featureConfigurations](../api/identitycontainer-list-featureconfigurations.md)|[featureConfiguration](../resources/featureconfiguration.md) collection|Get the featureConfiguration resources from the featureConfigurations navigation property.|
|[Create featureConfigurations](../api/identitycontainer-post-featureconfigurations.md)|[featureConfiguration](../resources/featureconfiguration.md)|Create a new featureConfiguration object.|
|[Update featureConfigurations](../api/identitycontainer-update-featureconfigurations.md)|[featureConfiguration](../resources/featureconfiguration.md)|Update the properties of a featureConfigurations object.|
|[Get featureConfigurations](../api/identitycontainer-get-featureconfiguration.md)|[featureConfiguration](../resources/featureconfiguration.md)|Read the properties and relationships of a [featureConfiguration](../resources/featureconfiguration.md) object.|
|[Delete featureConfigurations](../api/identitycontainer-delete-featureconfigurations.md)|None|Delete a [featureConfiguration](../resources/featureconfiguration.md) object.|
|[List featureConfigurations](../api/featureconfiguration-list.md)|[featureConfiguration](../resources/featureconfiguration.md) collection|Get a list of the [featureConfiguration](../resources/featureconfiguration.md) objects and their properties.|
|[Create featureConfiguration](../api/featureconfiguration-create.md)|[featureConfiguration](../resources/featureconfiguration.md)|Create a new [featureConfiguration](../resources/featureconfiguration.md) object.|
|[Get featureConfiguration](../api/featureconfiguration-get.md)|[featureConfiguration](../resources/featureconfiguration.md)|Read the properties and relationships of a [featureConfiguration](../resources/featureconfiguration.md) object.|
|[Update featureConfiguration](../api/featureconfiguration-update.md)|[featureConfiguration](../resources/featureconfiguration.md)|Update the properties of a [featureConfiguration](../resources/featureconfiguration.md) object.|
|[Delete featureConfiguration](../api/featureconfiguration-delete.md)|None|Deletes a [featureConfiguration](../resources/featureconfiguration.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|activatedFeatureTiers|identityFeatureTier|**TODO: Add Description**. Possible values are: `Standard`, `PremiumP1`, `PremiumP2`, `unknownFutureValue`.|
|azureResourceGroupName|String|**TODO: Add Description**|
|azureResourceName|String|**TODO: Add Description**|
|azureSubscriptionId|String|**TODO: Add Description**|
|azureSubscriptionTenantId|String|**TODO: Add Description**|
|id|String|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.featureConfiguration",
  "baseType": "",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.featureConfiguration",
  "id": "String (identifier)",
  "activatedFeatureTiers": "String",
  "azureResourceGroupName": "String",
  "azureResourceName": "String",
  "azureSubscriptionId": "String",
  "azureSubscriptionTenantId": "String"
}
```


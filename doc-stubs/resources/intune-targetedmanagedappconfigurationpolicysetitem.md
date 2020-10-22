---
title: "targetedManagedAppConfigurationPolicySetItem resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# targetedManagedAppConfigurationPolicySetItem resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [policySetItem](../resources/policysetitem.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List targetedManagedAppConfigurationPolicySetItems](../api/intune-targetedmanagedappconfigurationpolicysetitem-list.md)|[targetedManagedAppConfigurationPolicySetItem](../resources/intune-targetedmanagedappconfigurationpolicysetitem.md) collection|Get a list of the [targetedManagedAppConfigurationPolicySetItem](../resources/targetedmanagedappconfigurationpolicysetitem.md) objects and their properties.|
|[Create targetedManagedAppConfigurationPolicySetItem](../api/intune-targetedmanagedappconfigurationpolicysetitem-create.md)|[targetedManagedAppConfigurationPolicySetItem](../resources/intune-targetedmanagedappconfigurationpolicysetitem.md)|Create a new [targetedManagedAppConfigurationPolicySetItem](../resources/intune-targetedmanagedappconfigurationpolicysetitem.md) object.|
|[Get targetedManagedAppConfigurationPolicySetItem](../api/intune-targetedmanagedappconfigurationpolicysetitem-get.md)|[targetedManagedAppConfigurationPolicySetItem](../resources/intune-targetedmanagedappconfigurationpolicysetitem.md)|Read the properties and relationships of a [targetedManagedAppConfigurationPolicySetItem](../resources/intune-targetedmanagedappconfigurationpolicysetitem.md) object.|
|[Update targetedManagedAppConfigurationPolicySetItem](../api/intune-targetedmanagedappconfigurationpolicysetitem-update.md)|[targetedManagedAppConfigurationPolicySetItem](../resources/intune-targetedmanagedappconfigurationpolicysetitem.md)|Update the properties of a [targetedManagedAppConfigurationPolicySetItem](../resources/intune-targetedmanagedappconfigurationpolicysetitem.md) object.|
|[Delete targetedManagedAppConfigurationPolicySetItem](../api/intune-targetedmanagedappconfigurationpolicysetitem-delete.md)|None|Deletes a [targetedManagedAppConfigurationPolicySetItem](../resources/intune-targetedmanagedappconfigurationpolicysetitem.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [policySetItem](../resources/intune-policysetitem.md)|
|displayName|String|**TODO: Add Description** Inherited from [policySetItem](../resources/intune-policysetitem.md)|
|errorCode|errorCode|**TODO: Add Description** Inherited from [policySetItem](../resources/intune-policysetitem.md). Possible values are: `noError`, `unauthorized`, `notFound`, `deleted`.|
|guidedDeploymentTags|String collection|**TODO: Add Description** Inherited from [policySetItem](../resources/intune-policysetitem.md)|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|itemType|String|**TODO: Add Description** Inherited from [policySetItem](../resources/intune-policysetitem.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [policySetItem](../resources/intune-policysetitem.md)|
|payloadId|String|**TODO: Add Description** Inherited from [policySetItem](../resources/intune-policysetitem.md)|
|status|policySetStatus|**TODO: Add Description** Inherited from [policySetItem](../resources/intune-policysetitem.md). Possible values are: `unknown`, `validating`, `partialSuccess`, `success`, `error`, `notAssigned`.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.targetedManagedAppConfigurationPolicySetItem",
  "baseType": "microsoft.graph.policySetItem",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.targetedManagedAppConfigurationPolicySetItem",
  "id": "String (identifier)",
  "createdDateTime": "String (timestamp)",
  "lastModifiedDateTime": "String (timestamp)",
  "payloadId": "String",
  "itemType": "String",
  "displayName": "String",
  "status": "String",
  "errorCode": "String",
  "guidedDeploymentTags": [
    "String"
  ]
}
```


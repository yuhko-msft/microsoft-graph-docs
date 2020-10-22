---
title: "enrollmentRestrictionsConfigurationPolicySetItem resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# enrollmentRestrictionsConfigurationPolicySetItem resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [policySetItem](../resources/policysetitem.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List enrollmentRestrictionsConfigurationPolicySetItems](../api/intune-enrollmentrestrictionsconfigurationpolicysetitem-list.md)|[enrollmentRestrictionsConfigurationPolicySetItem](../resources/intune-enrollmentrestrictionsconfigurationpolicysetitem.md) collection|Get a list of the [enrollmentRestrictionsConfigurationPolicySetItem](../resources/enrollmentrestrictionsconfigurationpolicysetitem.md) objects and their properties.|
|[Create enrollmentRestrictionsConfigurationPolicySetItem](../api/intune-enrollmentrestrictionsconfigurationpolicysetitem-create.md)|[enrollmentRestrictionsConfigurationPolicySetItem](../resources/intune-enrollmentrestrictionsconfigurationpolicysetitem.md)|Create a new [enrollmentRestrictionsConfigurationPolicySetItem](../resources/intune-enrollmentrestrictionsconfigurationpolicysetitem.md) object.|
|[Get enrollmentRestrictionsConfigurationPolicySetItem](../api/intune-enrollmentrestrictionsconfigurationpolicysetitem-get.md)|[enrollmentRestrictionsConfigurationPolicySetItem](../resources/intune-enrollmentrestrictionsconfigurationpolicysetitem.md)|Read the properties and relationships of an [enrollmentRestrictionsConfigurationPolicySetItem](../resources/intune-enrollmentrestrictionsconfigurationpolicysetitem.md) object.|
|[Update enrollmentRestrictionsConfigurationPolicySetItem](../api/intune-enrollmentrestrictionsconfigurationpolicysetitem-update.md)|[enrollmentRestrictionsConfigurationPolicySetItem](../resources/intune-enrollmentrestrictionsconfigurationpolicysetitem.md)|Update the properties of an [enrollmentRestrictionsConfigurationPolicySetItem](../resources/intune-enrollmentrestrictionsconfigurationpolicysetitem.md) object.|
|[Delete enrollmentRestrictionsConfigurationPolicySetItem](../api/intune-enrollmentrestrictionsconfigurationpolicysetitem-delete.md)|None|Deletes an [enrollmentRestrictionsConfigurationPolicySetItem](../resources/intune-enrollmentrestrictionsconfigurationpolicysetitem.md) object.|

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
|limit|Int32|**TODO: Add Description**|
|payloadId|String|**TODO: Add Description** Inherited from [policySetItem](../resources/intune-policysetitem.md)|
|priority|Int32|**TODO: Add Description**|
|status|policySetStatus|**TODO: Add Description** Inherited from [policySetItem](../resources/intune-policysetitem.md). Possible values are: `unknown`, `validating`, `partialSuccess`, `success`, `error`, `notAssigned`.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.enrollmentRestrictionsConfigurationPolicySetItem",
  "baseType": "microsoft.graph.policySetItem",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.enrollmentRestrictionsConfigurationPolicySetItem",
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
  ],
  "priority": "Integer",
  "limit": "Integer"
}
```


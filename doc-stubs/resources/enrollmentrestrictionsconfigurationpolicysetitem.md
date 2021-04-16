---
title: "enrollmentRestrictionsConfigurationPolicySetItem resource type"
description: "A class containing the properties used for enrollment restriction PolicySetItem."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# enrollmentRestrictionsConfigurationPolicySetItem resource type

Namespace: microsoft.graph



A class containing the properties used for enrollment restriction PolicySetItem.


Inherits from [policySetItem](../resources/policysetitem.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List enrollmentRestrictionsConfigurationPolicySetItems](../api/enrollmentrestrictionsconfigurationpolicysetitem-list.md)|[enrollmentRestrictionsConfigurationPolicySetItem](../resources/enrollmentrestrictionsconfigurationpolicysetitem.md) collection|Get a list of the [enrollmentRestrictionsConfigurationPolicySetItem](../resources/enrollmentrestrictionsconfigurationpolicysetitem.md) objects and their properties.|
|[Create enrollmentRestrictionsConfigurationPolicySetItem](../api/enrollmentrestrictionsconfigurationpolicysetitem-create.md)|[enrollmentRestrictionsConfigurationPolicySetItem](../resources/enrollmentrestrictionsconfigurationpolicysetitem.md)|Create a new [enrollmentRestrictionsConfigurationPolicySetItem](../resources/enrollmentrestrictionsconfigurationpolicysetitem.md) object.|
|[Get enrollmentRestrictionsConfigurationPolicySetItem](../api/enrollmentrestrictionsconfigurationpolicysetitem-get.md)|[enrollmentRestrictionsConfigurationPolicySetItem](../resources/enrollmentrestrictionsconfigurationpolicysetitem.md)|Read the properties and relationships of an [enrollmentRestrictionsConfigurationPolicySetItem](../resources/enrollmentrestrictionsconfigurationpolicysetitem.md) object.|
|[Update enrollmentRestrictionsConfigurationPolicySetItem](../api/enrollmentrestrictionsconfigurationpolicysetitem-update.md)|[enrollmentRestrictionsConfigurationPolicySetItem](../resources/enrollmentrestrictionsconfigurationpolicysetitem.md)|Update the properties of an [enrollmentRestrictionsConfigurationPolicySetItem](../resources/enrollmentrestrictionsconfigurationpolicysetitem.md) object.|
|[Delete enrollmentRestrictionsConfigurationPolicySetItem](../api/enrollmentrestrictionsconfigurationpolicysetitem-delete.md)|None|Deletes an [enrollmentRestrictionsConfigurationPolicySetItem](../resources/enrollmentrestrictionsconfigurationpolicysetitem.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|createdDateTime|DateTimeOffset|Creation time of the PolicySetItem. Inherited from [policySetItem](../resources/policysetitem.md)|
|displayName|String|DisplayName of the PolicySetItem. Inherited from [policySetItem](../resources/policysetitem.md)|
|errorCode|errorCode|Error code if any occured. Inherited from [policySetItem](../resources/policysetitem.md). Possible values are: `noError`, `unauthorized`, `notFound`, `deleted`.|
|guidedDeploymentTags|String collection|Tags of the guided deployment Inherited from [policySetItem](../resources/policysetitem.md)|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|itemType|String|policySetType of the PolicySetItem. Inherited from [policySetItem](../resources/policysetitem.md)|
|lastModifiedDateTime|DateTimeOffset|Last modified time of the PolicySetItem. Inherited from [policySetItem](../resources/policysetitem.md)|
|limit|Int32|Limit of the EnrollmentRestrictionsConfigurationPolicySetItem.|
|payloadId|String|PayloadId of the PolicySetItem. Inherited from [policySetItem](../resources/policysetitem.md)|
|priority|Int32|Priority of the EnrollmentRestrictionsConfigurationPolicySetItem.|
|status|policySetStatus|Status of the PolicySetItem. Inherited from [policySetItem](../resources/policysetitem.md). Possible values are: `unknown`, `validating`, `partialSuccess`, `success`, `error`, `notAssigned`.|

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
  "displayName": "String",
  "errorCode": "String",
  "guidedDeploymentTags": [
    "String"
  ],
  "itemType": "String",
  "lastModifiedDateTime": "String (timestamp)",
  "payloadId": "String",
  "status": "String",
  "limit": "Integer",
  "priority": "Integer"
}
```


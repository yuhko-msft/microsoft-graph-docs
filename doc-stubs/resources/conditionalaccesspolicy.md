---
title: "conditionalAccessPolicy resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# conditionalAccessPolicy resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List conditionalAccessPolicies](../api/conditionalaccesspolicy-list.md)|[conditionalAccessPolicy](../resources/conditionalaccesspolicy.md) collection|Get a list of the [conditionalAccessPolicy](../resources/conditionalaccesspolicy.md) objects and their properties.|
|[Create conditionalAccessPolicy](../api/conditionalaccesspolicy-create.md)|[conditionalAccessPolicy](../resources/conditionalaccesspolicy.md)|Create a new [conditionalAccessPolicy](../resources/conditionalaccesspolicy.md) object.|
|[Get conditionalAccessPolicy](../api/conditionalaccesspolicy-get.md)|[conditionalAccessPolicy](../resources/conditionalaccesspolicy.md)|Read the properties and relationships of a [conditionalAccessPolicy](../resources/conditionalaccesspolicy.md) object.|
|[Update conditionalAccessPolicy](../api/conditionalaccesspolicy-update.md)|[conditionalAccessPolicy](../resources/conditionalaccesspolicy.md)|Update the properties of a [conditionalAccessPolicy](../resources/conditionalaccesspolicy.md) object.|
|[Delete conditionalAccessPolicy](../api/conditionalaccesspolicy-delete.md)|None|Deletes a [conditionalAccessPolicy](../resources/conditionalaccesspolicy.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|conditions|[conditionalAccessConditionSet](../resources/conditionalaccessconditionset.md)|**TODO: Add Description**|
|createdDateTime|DateTimeOffset|**TODO: Add Description**|
|description|String|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|grantControls|[conditionalAccessGrantControls](../resources/conditionalaccessgrantcontrols.md)|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|modifiedDateTime|DateTimeOffset|**TODO: Add Description**|
|sessionControls|[conditionalAccessSessionControls](../resources/conditionalaccesssessioncontrols.md)|**TODO: Add Description**|
|state|conditionalAccessPolicyState|**TODO: Add Description**. Possible values are: `enabled`, `disabled`, `enabledForReportingButNotEnforced`.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.conditionalAccessPolicy",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.conditionalAccessPolicy",
  "id": "String (identifier)",
  "conditions": {
    "@odata.type": "microsoft.graph.conditionalAccessConditionSet"
  },
  "createdDateTime": "String (timestamp)",
  "description": "String",
  "displayName": "String",
  "grantControls": {
    "@odata.type": "microsoft.graph.conditionalAccessGrantControls"
  },
  "modifiedDateTime": "String (timestamp)",
  "sessionControls": {
    "@odata.type": "microsoft.graph.conditionalAccessSessionControls"
  },
  "state": "String"
}
```


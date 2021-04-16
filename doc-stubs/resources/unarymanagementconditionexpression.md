---
title: "unaryManagementConditionExpression resource type"
description: "A management condition expression that is evaluated using a unary operation."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# unaryManagementConditionExpression resource type

Namespace: microsoft.graph



A management condition expression that is evaluated using a unary operation.


Inherits from [managementConditionExpressionModel](../resources/managementconditionexpressionmodel.md).

## Properties
|Property|Type|Description|
|:---|:---|:---|
|operand|[managementConditionExpressionModel](../resources/managementconditionexpressionmodel.md)|The operand of the unary operation.|
|operator|unaryManagementConditionExpressionOperatorType|The operator used in the evaluation of the unary operation. Possible values are: `not`.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.unaryManagementConditionExpression"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.unaryManagementConditionExpression",
  "operand": {
    "@odata.type": "microsoft.graph.managementConditionExpressionModel"
  },
  "operator": "String"
}
```


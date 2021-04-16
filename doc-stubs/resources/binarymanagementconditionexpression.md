---
title: "binaryManagementConditionExpression resource type"
description: "A management condition expression that is evaluated using a binary operation."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# binaryManagementConditionExpression resource type

Namespace: microsoft.graph



A management condition expression that is evaluated using a binary operation.


Inherits from [managementConditionExpressionModel](../resources/managementconditionexpressionmodel.md).

## Properties
|Property|Type|Description|
|:---|:---|:---|
|firstOperand|[managementConditionExpressionModel](../resources/managementconditionexpressionmodel.md)|The first operand of the binary operation.|
|operator|binaryManagementConditionExpressionOperatorType|The operator used in the evaluation of the binary operation. Possible values are: `or`, `and`.|
|secondOperand|[managementConditionExpressionModel](../resources/managementconditionexpressionmodel.md)|The second operand of the binary operation.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.binaryManagementConditionExpression"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.binaryManagementConditionExpression",
  "firstOperand": {
    "@odata.type": "microsoft.graph.managementConditionExpressionModel"
  },
  "operator": "String",
  "secondOperand": {
    "@odata.type": "microsoft.graph.managementConditionExpressionModel"
  }
}
```


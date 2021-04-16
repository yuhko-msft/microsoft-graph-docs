---
title: "variableManagementConditionExpression resource type"
description: "Evaluates the management condition state as a Boolean expression."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# variableManagementConditionExpression resource type

Namespace: microsoft.graph



Evaluates the management condition state as a Boolean expression.


Inherits from [managementConditionExpressionModel](../resources/managementconditionexpressionmodel.md).

## Properties
|Property|Type|Description|
|:---|:---|:---|
|managementConditionId|String|The management condition id that is used to evaluate the expression.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.variableManagementConditionExpression"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.variableManagementConditionExpression",
  "managementConditionId": "String"
}
```


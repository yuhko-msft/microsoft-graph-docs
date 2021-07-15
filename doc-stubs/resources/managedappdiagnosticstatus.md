---
title: "managedAppDiagnosticStatus resource type"
description: "Represents diagnostics status."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# managedAppDiagnosticStatus resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Represents diagnostics status.

## Properties
|Property|Type|Description|
|:---|:---|:---|
|mitigationInstruction|String|Instruction on how to mitigate a failed validation|
|state|String|The state of the operation|
|validationName|String|The validation friendly name|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.managedAppDiagnosticStatus"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.managedAppDiagnosticStatus",
  "mitigationInstruction": "String",
  "state": "String",
  "validationName": "String"
}
```


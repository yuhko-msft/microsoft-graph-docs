---
title: "EmployeeEducationActivity resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# EmployeeEducationActivity resource type

Namespace: microsoft.graph.linkedIn

**TODO: Add Description**

## Properties
|Property|Type|Description|
|:---|:---|:---|
|completionMonthYear|String|**TODO: Add Description**|
|institution|[MicrosoftInstitution](../resources/linkedin-microsoftinstitution.md)|**TODO: Add Description**|
|program|[MicrosoftProgram](../resources/linkedin-microsoftprogram.md)|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.linkedIn.EmployeeEducationActivity"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.linkedIn.EmployeeEducationActivity",
  "program": {
    "@odata.type": "microsoft.graph.linkedIn.MicrosoftProgram"
  },
  "institution": {
    "@odata.type": "microsoft.graph.linkedIn.MicrosoftInstitution"
  },
  "completionMonthYear": "String"
}
```


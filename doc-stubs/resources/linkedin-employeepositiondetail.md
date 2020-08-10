---
title: "EmployeePositionDetail resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# EmployeePositionDetail resource type

Namespace: microsoft.graph.linkedIn

**TODO: Add Description**

## Properties
|Property|Type|Description|
|:---|:---|:---|
|company|[MicrosoftCompany](../resources/linkedin-microsoftcompany.md)|**TODO: Add Description**|
|description|String|**TODO: Add Description**|
|endMonthYear|String|**TODO: Add Description**|
|role|String|**TODO: Add Description**|
|startMonthYear|String|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.linkedIn.EmployeePositionDetail"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.linkedIn.EmployeePositionDetail",
  "startMonthYear": "String",
  "endMonthYear": "String",
  "description": "String",
  "role": "String",
  "company": {
    "@odata.type": "microsoft.graph.linkedIn.MicrosoftCompany"
  }
}
```


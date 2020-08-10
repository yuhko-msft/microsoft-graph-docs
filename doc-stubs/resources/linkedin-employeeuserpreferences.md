---
title: "EmployeeUserPreferences resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# EmployeeUserPreferences resource type

Namespace: microsoft.graph.linkedIn

**TODO: Add Description**

## Properties
|Property|Type|Description|
|:---|:---|:---|
|advisorPreference|[EmployeeAdvisorPreference](../resources/linkedin-employeeadvisorpreference.md)|**TODO: Add Description**|
|careerTopicNoviceIn|[EmployeePreferenceDetail](../resources/linkedin-employeepreferencedetail.md) collection|**TODO: Add Description**|
|skillsNoviceIn|[EmployeePreferenceDetail](../resources/linkedin-employeepreferencedetail.md) collection|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.linkedIn.EmployeeUserPreferences"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.linkedIn.EmployeeUserPreferences",
  "advisorPreference": {
    "@odata.type": "microsoft.graph.linkedIn.EmployeeAdvisorPreference"
  },
  "careerTopicNoviceIn": [
    {
      "@odata.type": "microsoft.graph.linkedIn.EmployeePreferenceDetail"
    }
  ],
  "skillsNoviceIn": [
    {
      "@odata.type": "microsoft.graph.linkedIn.EmployeePreferenceDetail"
    }
  ]
}
```


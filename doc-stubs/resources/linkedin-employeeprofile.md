---
title: "EmployeeProfile resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# EmployeeProfile resource type

Namespace: microsoft.graph.linkedIn

**TODO: Add Description**

## Properties
|Property|Type|Description|
|:---|:---|:---|
|advisorProfile|[EmployeeAdvisorProfile](../resources/linkedin-employeeadvisorprofile.md)|**TODO: Add Description**|
|awards|[EmployeeAward](../resources/linkedin-employeeaward.md) collection|**TODO: Add Description**|
|certifications|[EmployeeCertification](../resources/linkedin-employeecertification.md) collection|**TODO: Add Description**|
|educationalActivities|[EmployeeEducationActivity](../resources/linkedin-employeeeducationactivity.md) collection|**TODO: Add Description**|
|interests|[EmployeeInterest](../resources/linkedin-employeeinterest.md) collection|**TODO: Add Description**|
|languages|[EmployeeLanguage](../resources/linkedin-employeelanguage.md) collection|**TODO: Add Description**|
|patents|[EmployeePatent](../resources/linkedin-employeepatent.md) collection|**TODO: Add Description**|
|positions|[EmployeePosition](../resources/linkedin-employeeposition.md) collection|**TODO: Add Description**|
|projects|[EmployeeProject](../resources/linkedin-employeeproject.md) collection|**TODO: Add Description**|
|publications|[EmployeePublication](../resources/linkedin-employeepublication.md) collection|**TODO: Add Description**|
|skills|[EmployeeSkill](../resources/linkedin-employeeskill.md) collection|**TODO: Add Description**|
|softSkills|[EmployeeSoftSkill](../resources/linkedin-employeesoftskill.md) collection|**TODO: Add Description**|
|summary|String|**TODO: Add Description**|
|tagLine|String|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.linkedIn.EmployeeProfile"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.linkedIn.EmployeeProfile",
  "summary": "String",
  "tagLine": "String",
  "advisorProfile": {
    "@odata.type": "microsoft.graph.linkedIn.EmployeeAdvisorProfile"
  },
  "softSkills": [
    {
      "@odata.type": "microsoft.graph.linkedIn.EmployeeSoftSkill"
    }
  ],
  "interests": [
    {
      "@odata.type": "microsoft.graph.linkedIn.EmployeeInterest"
    }
  ],
  "skills": [
    {
      "@odata.type": "microsoft.graph.linkedIn.EmployeeSkill"
    }
  ],
  "projects": [
    {
      "@odata.type": "microsoft.graph.linkedIn.EmployeeProject"
    }
  ],
  "positions": [
    {
      "@odata.type": "microsoft.graph.linkedIn.EmployeePosition"
    }
  ],
  "educationalActivities": [
    {
      "@odata.type": "microsoft.graph.linkedIn.EmployeeEducationActivity"
    }
  ],
  "languages": [
    {
      "@odata.type": "microsoft.graph.linkedIn.EmployeeLanguage"
    }
  ],
  "certifications": [
    {
      "@odata.type": "microsoft.graph.linkedIn.EmployeeCertification"
    }
  ],
  "awards": [
    {
      "@odata.type": "microsoft.graph.linkedIn.EmployeeAward"
    }
  ],
  "patents": [
    {
      "@odata.type": "microsoft.graph.linkedIn.EmployeePatent"
    }
  ],
  "publications": [
    {
      "@odata.type": "microsoft.graph.linkedIn.EmployeePublication"
    }
  ]
}
```


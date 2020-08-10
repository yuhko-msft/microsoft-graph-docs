---
title: "LIMemberDetails resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# LIMemberDetails resource type

Namespace: microsoft.graph.linkedIn

**TODO: Add Description**

## Properties
|Property|Type|Description|
|:---|:---|:---|
|certifications|[LIMemberCertification](../resources/linkedin-limembercertification.md) collection|**TODO: Add Description**|
|connectionInfo|[LIMemberConnectionInfo](../resources/linkedin-limemberconnectioninfo.md)|**TODO: Add Description**|
|defaultLocale|[Locale](../resources/linkedin-locale.md)|**TODO: Add Description**|
|educations|[LIMemberEducation](../resources/linkedin-limembereducation.md) collection|**TODO: Add Description**|
|emails|String collection|**TODO: Add Description**|
|endorsedSkills|[SkillEndorsement](../resources/linkedin-skillendorsement.md) collection|**TODO: Add Description**|
|firstName|[MultiLocaleString](../resources/linkedin-multilocalestring.md)|**TODO: Add Description**|
|headline|[MultiLocaleString](../resources/linkedin-multilocalestring.md)|**TODO: Add Description**|
|honors|[LIMemberHonor](../resources/linkedin-limemberhonor.md) collection|**TODO: Add Description**|
|id|String|**TODO: Add Description**|
|industryName|[MultiLocaleString](../resources/linkedin-multilocalestring.md)|**TODO: Add Description**|
|languages|[LIMemberLanguage](../resources/linkedin-limemberlanguage.md) collection|**TODO: Add Description**|
|lastName|[MultiLocaleString](../resources/linkedin-multilocalestring.md)|**TODO: Add Description**|
|location|[LILocation](../resources/linkedin-lilocation.md)|**TODO: Add Description**|
|organizations|[LIMemberOrganization](../resources/linkedin-limemberorganization.md) collection|**TODO: Add Description**|
|patents|[LIMemberPatent](../resources/linkedin-limemberpatent.md) collection|**TODO: Add Description**|
|positions|[LIMemberPosition](../resources/linkedin-limemberposition.md) collection|**TODO: Add Description**|
|profilePicture|String|**TODO: Add Description**|
|profileUrl|String|**TODO: Add Description**|
|projects|[LIMemberProject](../resources/linkedin-limemberproject.md) collection|**TODO: Add Description**|
|publications|[LIMemberPublication](../resources/linkedin-limemberpublication.md) collection|**TODO: Add Description**|
|skills|[LISkill](../resources/linkedin-liskill.md) collection|**TODO: Add Description**|
|summary|[MultiLocaleRichText](../resources/linkedin-multilocalerichtext.md)|**TODO: Add Description**|
|totalEndorsedSkillCount|Int32|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.linkedIn.LIMemberDetails"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.linkedIn.LIMemberDetails",
  "id": "String (identifier)",
  "firstName": {
    "@odata.type": "microsoft.graph.linkedIn.MultiLocaleString"
  },
  "lastName": {
    "@odata.type": "microsoft.graph.linkedIn.MultiLocaleString"
  },
  "headline": {
    "@odata.type": "microsoft.graph.linkedIn.MultiLocaleString"
  },
  "summary": {
    "@odata.type": "microsoft.graph.linkedIn.MultiLocaleRichText"
  },
  "industryName": {
    "@odata.type": "microsoft.graph.linkedIn.MultiLocaleString"
  },
  "profilePicture": "String",
  "defaultLocale": {
    "@odata.type": "microsoft.graph.linkedIn.Locale"
  },
  "profileUrl": "String",
  "positions": [
    {
      "@odata.type": "microsoft.graph.linkedIn.LIMemberPosition"
    }
  ],
  "educations": [
    {
      "@odata.type": "microsoft.graph.linkedIn.LIMemberEducation"
    }
  ],
  "certifications": [
    {
      "@odata.type": "microsoft.graph.linkedIn.LIMemberCertification"
    }
  ],
  "honors": [
    {
      "@odata.type": "microsoft.graph.linkedIn.LIMemberHonor"
    }
  ],
  "languages": [
    {
      "@odata.type": "microsoft.graph.linkedIn.LIMemberLanguage"
    }
  ],
  "organizations": [
    {
      "@odata.type": "microsoft.graph.linkedIn.LIMemberOrganization"
    }
  ],
  "patents": [
    {
      "@odata.type": "microsoft.graph.linkedIn.LIMemberPatent"
    }
  ],
  "projects": [
    {
      "@odata.type": "microsoft.graph.linkedIn.LIMemberProject"
    }
  ],
  "publications": [
    {
      "@odata.type": "microsoft.graph.linkedIn.LIMemberPublication"
    }
  ],
  "skills": [
    {
      "@odata.type": "microsoft.graph.linkedIn.LISkill"
    }
  ],
  "endorsedSkills": [
    {
      "@odata.type": "microsoft.graph.linkedIn.SkillEndorsement"
    }
  ],
  "totalEndorsedSkillCount": "Integer",
  "emails": [
    "String"
  ],
  "connectionInfo": {
    "@odata.type": "microsoft.graph.linkedIn.LIMemberConnectionInfo"
  },
  "location": {
    "@odata.type": "microsoft.graph.linkedIn.LILocation"
  }
}
```


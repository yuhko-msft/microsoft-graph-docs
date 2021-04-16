---
title: "windows10XCustomSubjectAlternativeName resource type"
description: "Base Profile Type for Authentication Certificates (SCEP or PFX Create)"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# windows10XCustomSubjectAlternativeName resource type

Namespace: microsoft.graph



Base Profile Type for Authentication Certificates (SCEP or PFX Create)

## Properties
|Property|Type|Description|
|:---|:---|:---|
|name|String|Custom SAN Name|
|sanType|subjectAlternativeNameType|Custom SAN Type. Possible values are: `none`, `emailAddress`, `userPrincipalName`, `customAzureADAttribute`, `domainNameService`, `universalResourceIdentifier`.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.windows10XCustomSubjectAlternativeName"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.windows10XCustomSubjectAlternativeName",
  "name": "String",
  "sanType": "String"
}
```


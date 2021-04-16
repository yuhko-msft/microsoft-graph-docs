---
title: "customSubjectAlternativeName resource type"
description: "Custom Subject Alternative Name definition"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# customSubjectAlternativeName resource type

Namespace: microsoft.graph



Custom Subject Alternative Name definition

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
  "@odata.type": "microsoft.graph.customSubjectAlternativeName"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.customSubjectAlternativeName",
  "name": "String",
  "sanType": "String"
}
```


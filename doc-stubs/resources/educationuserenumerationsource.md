---
title: "educationUserEnumerationSource resource type"
description: "Type to define a subset of education users in the canonical store to enumerate."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# educationUserEnumerationSource resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Type to define a subset of education users in the canonical store to enumerate.


Inherits from [educationEnumerationSource](../resources/educationenumerationsource.md).

## Properties
|Property|Type|Description|
|:---|:---|:---|
|gradeLevelFilters|String collection|**TODO: Add Description** Inherited from [educationEnumerationSource](../resources/educationenumerationsource.md).|
|organizationFilters|String collection|**TODO: Add Description** Inherited from [educationEnumerationSource](../resources/educationenumerationsource.md).|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|roleGroupsFilter|[roleGroup](../resources/rolegroup.md) collection|Filter to reduce the enumeration set of education users to those belonging to a role in a specified set of role groups.|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.educationUserEnumerationSource"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.educationUserEnumerationSource",
  "organizationFilters": [
    "String"
  ],
  "gradeLevelFilters": [
    "String"
  ]
}
```


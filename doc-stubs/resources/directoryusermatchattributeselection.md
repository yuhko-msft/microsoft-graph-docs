---
title: "directoryUserMatchAttributeSelection resource type"
description: "The per-roleGroup detail of matching Users in Azure Active Directory with users in the canonical store."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# directoryUserMatchAttributeSelection resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

The per-roleGroup detail of matching Users in Azure Active Directory with users in the canonical store.

## Properties
|Property|Type|Description|
|:---|:---|:---|
|domain|String|The DNS domain to select for matching within Azure Active Directory.|
|primaryDirectoryUserMatchProperty|String|The property to use for matching within Azure Active Directory.|
|primaryRosteringUserMatchProperty|String|The property to use for matching within the canonical store.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.directoryUserMatchAttributeSelection"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.directoryUserMatchAttributeSelection",
  "primaryRosteringUserMatchProperty": "String",
  "primaryDirectoryUserMatchProperty": "String",
  "domain": "String"
}
```


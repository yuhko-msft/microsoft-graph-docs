---
title: "directoryUserMatchingSettings resource type"
description: "Settings to match a specified set of users in Azure Active Directory with users in the canonical store."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# directoryUserMatchingSettings resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Settings to match a specified set of users in Azure Active Directory with users in the canonical store.

## Properties
|Property|Type|Description|
|:---|:---|:---|
|enumerationSource|[enumerationSource](../resources/enumerationsource.md)|The set of users to match from the canonical store.|
|matchAttributeSelection|[directoryUserMatchAttributeSelectionRoleGroupDictionary](../resources/directoryusermatchattributeselectionrolegroupdictionary.md)|Dictionary of user matching details per role group.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.directoryUserMatchingSettings"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.directoryUserMatchingSettings",
  "enumerationSource": {
    "@odata.type": "microsoft.graph.enumerationSource"
  },
  "matchAttributeSelection": {
    "@odata.type": "microsoft.graph.directoryUserMatchAttributeSelectionRoleGroupDictionary"
  }
}
```


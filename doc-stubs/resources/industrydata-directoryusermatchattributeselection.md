---
title: "directoryUserMatchAttributeSelection resource type"
description: "The per-roleGroup detail of matching Users in Azure Active Directory with users in the canonical store."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# directoryUserMatchAttributeSelection resource type

Namespace: microsoft.graph.industryData

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

The per-roleGroup detail of matching Users in Azure Active Directory with users in the canonical store.

## Properties
|Property|Type|Description|
|:---|:---|:---|
|directoryUserMatchProperty|directoryUserProperty|**TODO: Add Description**. The possible values are: `objectId`, `userPrincipalName`, `mail`, `mailNickname`, `anchorId`, `studentId`, `teacherId`, `unknownFutureValue`.|
|priorityOrder|Int32|**TODO: Add Description**|
|sourceUserMatchProperty|[microsoft.graph.industryData.identifierTypeReferenceValue](../resources/industrydata-identifiertypereferencevalue.md)|**TODO: Add Description**|
|sourceUserSuffix|String|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|roleGroup|[roleGroup](../resources/industrydata-rolegroup.md)|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.industryData.directoryUserMatchAttributeSelection"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.industryData.directoryUserMatchAttributeSelection",
  "sourceUserMatchProperty": {
    "@odata.type": "microsoft.graph.industryData.identifierTypeReferenceValue"
  },
  "directoryUserMatchProperty": "String",
  "sourceUserSuffix": "String",
  "priorityOrder": "Integer"
}
```


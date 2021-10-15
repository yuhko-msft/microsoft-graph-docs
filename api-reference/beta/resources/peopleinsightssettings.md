---
title: "PeopleInsightsSettings resource type"
description: "Represents privacy settings for itemInsights."
ms.localizationpriority: medium
author: "PeterNjorogeMS"
ms.prod: "insights"
doc_type: resourcePageType
---

# PeopleInsightsSettings resource type

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Represents privacy settings for [peopleInsights](peopleinsight.md) also known as Working-With. Use this API to disable/enable generation and visibility of people insights. 
- People insights: Calculates the relationship between users based on public relationships to create a list of people most relevant to a user.

## Methods

| Method       | Return Type | Description |
|:-------------------------------------------------------------|:----------------------------------------------|:-----------------------------------------------------------------|
| [Get](../api/peopleinsightssettings-get.md)| [peopleInsightsSettings](peopleinsightssettings.md) | Read the properties of an **PeopleInsightsSettings** object. |
| [Update](../api/peopleinsightssettings-update.md)| [peopleInsightsSettings](peopleinsightssettings.md) | Update an **PeopleInsightsSettings** object.|


## Properties
| Property   | Type|Description|
|:---------------|:--------|:----------|
|isEnabledInOrganization|Boolean| `true` if organization people insights are enabled; `false` if organization people insights are disabled for all users without exceptions. Default is `true`. Optional.|
|disabledForGroup|String| The ID of an Azure AD group, of which the members' people insights are disabled. Default is `empty`. Optional.|

## JSON representation

Here is a JSON representation of the resource
<!-- {
  "blockType": "resource",
  "optionalProperties": [],
  "@odata.type": "microsoft.graph.peopleInsightsSettings"
}-->

```json
{
  "isEnabledInOrganization": "Boolean",
  "disabledForGroup": "String"
}
```



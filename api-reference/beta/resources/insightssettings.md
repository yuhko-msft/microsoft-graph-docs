---
title: "InsightsSettings resource type"
description: "Represents privacy settings for itemInsights."
ms.localizationpriority: medium
author: "simonhult"
ms.prod: "insights"
doc_type: resourcePageType
---

# InsightsSettings resource type

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Represents privacy settings for [itemInsights](iteminsights.md), privacy setting for [meeting hours insights](https://support.microsoft.com/en-us/office/update-your-meeting-hours-using-the-profile-card-0613d113-d7c1-4faa-bb11-c8ba30a78ef1) and privacy setting for [peopleInsights](peopleinsights.md). Use this API to disable/enable calculation and visibility of item insights and meeting hours insights. 

- Item insights: Calculates relationship between users and items such as documents or sites in Microsoft 365.  
- Meeting hours insights: Calculates a person's calendar meeting hours based on activities in Word, Excel, PowerPoint, email, and Outlook calendar in Microsoft 365.
- People insights: Calculates the relationship between users based on public relationships to create a list of people most relevant to a user.

Use the [userInsightsSettings](userinsightssettings.md) resource to disable/enable calculation and visibility of item insights and meeting hours insights of a user.

## Methods

| Method       | Return Type | Description |
|:-------------------------------------------------------------|:----------------------------------------------|:-----------------------------------------------------------------|
| [Get](../api/insightssettings-get.md)| [insightsSettings](insightssettings.md) | Read the properties of an **insightsSettings** object. |
| [Update](../api/insightssettings-update.md)| [insightsSettings](insightssettings.md) | Update an **insightsSettings** object.|


## Properties
| Property   | Type|Description|
|:---------------|:--------|:----------|
|isEnabledInOrganization|Boolean| `true` if organization insights are enabled; `false` if organization insights are disabled for all users without exceptions. Default is `true`. Optional.|
|disabledForGroup|String| The ID of an Azure AD group, of which the members' item insights are disabled. Default is `empty`. Optional.|

## JSON representation

Here is a JSON representation of the resource
<!-- {
  "blockType": "resource",
  "optionalProperties": [],
  "@odata.type": "microsoft.graph.itemInsightsSettings"
}-->

```json
{
  "isEnabledInOrganization": "Boolean",
  "disabledForGroup": "String"
}
```



---
title: "insightsSettings resource type"
description: "Represents privacy settings for itemInsights and peopleInsights."
localization_priority: Normal
author: "simonhult"
ms.prod: "insights"
doc_type: resourcePageType
---

# insightsSettings resource type

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Represents privacy settings for [itemInsights](iteminsights.md), [peopleInsights](peopleinsights.md), andÂ privacy setting forÂ [meeting hours insights](https://support.microsoft.com/en-us/office/update-your-meeting-hours-using-the-profile-card-0613d113-d7c1-4faa-bb11-c8ba30a78ef1)
.Â Use this API to disable/enable calculation andÂ visibilityÂ of itemÂ insightsÂ and meetingÂ hoursÂ insights.Â 

- Item insights:Â Calculates relationship between users and items such asÂ documents or sitesÂ in Microsoft 365.Â Â 
- People insights:Â Calculates relationship between users based on commonly accessible communications history. See [Implementation of the Working With Feature](/graph/people-example#implementation-of-the-working-with-feature).Â Â 
- MeetingÂ hoursÂ insights:Â Calculates a person'sÂ calendar meeting hoursÂ based on activities in Word, Excel, PowerPoint, email, and OutlookÂ calendar in Microsoft 365.

Use the [userInsightsSettings](userinsightssettings.md) resource to disable/enable calculation and visibility of item insights and meeting hours insights of a user.

## Methods

| Method       | Return Type | Description |
|:-------------------------------------------------------------|:----------------------------------------------|:-----------------------------------------------------------------|
| [Get](../api/iteminsightssettings-get.md)| [insightsSettings](insightssettings.md) | Read the properties of an **itemInsightsSettings** object. |
| [Update](../api/iteminsightssettings-update.md)| [insightsSettings](insightssettings.md) | Update an **itemInsightsSettings** object.|
| [Get](../api/peopleinsightssettings-get.md)| [insightsSettings](insightssettings.md) | Read the properties of an **peopleInsightsSettings** object. |
| [Update](../api/peopleinsightssettings-update.md)| [insightsSettings](insightssettings.md) | Update an **peopleInsightsSettings** object.|


## Properties
| Property   | Type|Description|
|:---------------|:--------|:----------|
|isEnabledInOrganization|Boolean| `true` if organization item insights are enabled; `false` if organization item insights are disabled for all users without exceptions. Default is `true`. Optional.|
|disabledForGroup|String| The ID of an Azure AD group, of which the members' item insights are disabled. Default is `empty`. Optional.|

## JSON representation

Here is a JSON representation of the resource
<!-- {
  "blockType": "resource",
  "optionalProperties": [],
  "@odata.type": "microsoft.graph.insightsSettings"
}-->

```json
{
  "isEnabledInOrganization": "Boolean",
  "disabledForGroup": "String"
}
```



---
title: "peopleInsights resource type"
description: "Relationship between a user and people relevantant to the user is calclated based on public relationship. The calculation generates a list of people a user works with"
author: "PeterNjorogeMS"
ms.localizationpriority: high
ms.prod: "insights"
doc_type: resourcePageType
---

# peopleInsights resource type

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

The relationship between various users is generated based on user's public relationships, this relationship generates a list of people relevant to a user. The following are examples of public relationships:
- Individuals connected in the org chart: Manager, Direct report, Peers (share the same manager)
- Members of a public group or distribution list with fewer than 30 people. Public groups have membership lists that are available in the directory.

Relevance is determined by the user’s communication and collaboration patterns and business relationships. People can be local contacts or from an organization’s directory, and people from recent communications. Follow the link to learn more about the [Implementation of the working-with feature](people-example.md#implementation-of-the-working-with-feature). 

## Disabling Working-With
There are two controls available to administrations:
* Organization Wide Control - to help switch off Working-With for the whole organization
* Azure AD Group Control - to help disable the control for a group of people.
Update [InsightSetting](insightssettings.md) to disable people insights.Read more on how to [Customize people insight privacy control](customize-people-insights-privacy.md)


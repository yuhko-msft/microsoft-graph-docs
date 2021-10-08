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

There is a relationship between various users in the same 
Microsoft Graph applications can use the People API to retrieve the people who are most relevant to a user. Relevance is determined by the user’s communication and collaboration patterns and business relationships. People can be local contacts or from an organization’s directory, and people from recent communications. Along with generating this insight, the People API also provides fuzzy matching search support and the ability to retrieve the list of users relevant to another user in the signed-in user's organization. The People API is particularly useful for people picking scenarios, such as composing an email or creating a meeting. For example, you can use the People API in email compose scenarios.

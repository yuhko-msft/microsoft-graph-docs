---
title: "teamworkNotificationRecipient resource type"
description: "Represents the base class that serves as the basis for all the valid recipients for notifications."
author: "nkramer"
localization_priority: Normal
ms.prod: microsoft-teams
doc_type: resourcePageType
---

# teamworkNotificationRecipient resource type

Namespace: microsoft.graph

It is the base class that serves as the basis for all the valid recipients for [activity notifications](../api/team-sendactivitynotification.md). Notifications can be directed at a notification recipient. Eventually notification recipients will always resolve to one or more users.
Subclasses include [aadUserNotificationRecipient](aadusernotificationrecipient.md).

## Properties
This type has no properties.

## Relationships
None

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.teamworkNotificationRecipient"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.teamworkNotificationRecipient"
}
```

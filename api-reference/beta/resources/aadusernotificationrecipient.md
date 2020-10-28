---
title: "aadUserNotificationRecipient resource type"
description: "Send a notification to a single user."
author: "nkramer"
localization_priority: Normal
ms.prod: Priority
doc_type: resourcePageType
---

# aadUserNotificationRecipient resource type

Namespace: microsoft.graph

Represents the [activity notification](../api/team-sendactivitynotification.md) sent to a single user (recipient). This type inherits from [teamworkNotificationRecipient](../resources/teamworknotificationrecipient.md).

## Properties

|Property|Type|Description|
|:---|:---|:---|
|userId|String|The guid of the user.|

## Relationships
None

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.aadUserNotificationRecipient"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.aadUserNotificationRecipient",
  "userId": "String"
}
```

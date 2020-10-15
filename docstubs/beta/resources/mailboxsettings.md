---
title: "mailboxSettings resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: ""
doc_type: "resourcePageType"
---

# mailboxSettings resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Properties

| Property                              | Type                                                               | Description |
| :------------------------------------ | :----------------------------------------------------------------- | :---------- |
| archiveFolder                         | String                                                             |             |
| automaticRepliesSetting               | [automaticRepliesSetting](../resources/automaticrepliessetting.md) |             |
| dateFormat                            | String                                                             |             |
| delegateMeetingMessageDeliveryOptions | String                                                             |             |
| language                              | [localeInfo](../resources/localeinfo.md)                           |             |
| timeFormat                            | String                                                             |             |
| timeZone                              | String                                                             |             |
| userPurpose                           | [userPurpose](../resources/userpurpose.md)                         |             |
| userPurposeV2                         | String                                                             |             |
| workingHours                          | [workingHours](../resources/workinghours.md)                       |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.mailboxSettings",
}
-->

```json
{
  "@odata.type": "#microsoft.graph.mailboxSettings",
  "archiveFolder": "String",
  "automaticRepliesSetting": {"@odata.type": "microsoft.graph.automaticRepliesSetting"},
  "dateFormat": "String",
  "delegateMeetingMessageDeliveryOptions": "sendToDelegateAndInformationToPrincipal | sendToDelegateAndPrincipal | sendToDelegateOnly",
  "language": {"@odata.type": "microsoft.graph.localeInfo"},
  "timeFormat": "String",
  "timeZone": "String",
  "userPurpose": {"@odata.type": "microsoft.graph.userPurpose"},
  "userPurposeV2": "unknown | user | linked | shared | room | equipment | others",
  "workingHours": {"@odata.type": "microsoft.graph.workingHours"}
}
```

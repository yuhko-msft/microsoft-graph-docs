---
title: "uriClickSecurityState resource type"
description: "Represent the URL Click information (malicious and benign ones)."
localization_priority: Normal
author: "fengzhums"
ms.prod: "security"
doc_type: resourcePageType
---

# uriClickSecurityState resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Represents detection pertinent information for alerts.

## Properties

| Property     | Type        | Description |
|:-------------|:------------|:------------|
|clickAction|String| Click action for the URI based on the organization's policies. For example, For Office, it's [Office 365 ATP Safe Links](https://docs.microsoft.com/office365/securitycompliance/atp-safe-links). |
|clickDateTime|DateTimeOffset| The date and time when the user clicked the URI. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'. |
|id|String| ID of the click. |
|sourceId|String| Identifier for the service from which the URI was clicked. For example, for Office 365 email this is the Exchange Online Network Message Id). |
|verdict|String| The message verdict. |
|uriDomain|String| Identifies the domain where the URI click originated. |

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "optionalProperties": [

  ],
  "@odata.type": "microsoft.graph.uriClickSecurityState",
  "baseType": null
}-->

```json
{
  "clickAction": "String",
  "clickDateTime": "DateTimeOffset",
  "id": "String",
  "sourceId": "String",
  "verdict": "String",
  "uriDomain": "String"
}
```

<!-- uuid: 16cd6b66-4b1a-43a1-adaf-3a886856ed98
2019-02-04 14:57:30 UTC -->
<!-- {
  "type": "#page.annotation",
  "description": "uriClickSecurityState resource",
  "keywords": "",
  "section": "documentation",
  "tocPath": ""
}-->


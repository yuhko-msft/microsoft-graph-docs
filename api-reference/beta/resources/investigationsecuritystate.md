---
title: "investigationSecurityState resource type"
description: "Represents the investigation state for the alerts. The security provider will populate this field and set it to initiated or done, etc. when the alert is queried by the customer (to reflect the correct state of the investigation a the time of query)."
localization_priority: Normal
author: "fengzhums"
ms.prod: "security"
doc_type: resourcePageType
---

# investigationSecurityState resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Represents the investigation state for the alerts. The security provider will populate this field and set it to initiated or done, etc.
when the alert is queried by the customer (to reflect the correct state of the investigation a the time of query).

## Properties

| Property     | Type        | Description |
|:-------------|:------------|:------------|
|name|String| Name or ID of the ingestigation as specified by alert providers.|
|status|String|Status of the investigation as specified by alert providers.|

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "optionalProperties": [

  ],
  "@odata.type": "microsoft.graph.investigationSecurityState",
  "baseType": null
}-->

```json
{
  "name": "String",
  "status": "String"
}
```

<!-- uuid: 16cd6b66-4b1a-43a1-adaf-3a886856ed98
2019-02-04 14:57:30 UTC -->
<!-- {
  "type": "#page.annotation",
  "description": "investigationSecurityState resource",
  "keywords": "",
  "section": "documentation",
  "tocPath": ""
}-->


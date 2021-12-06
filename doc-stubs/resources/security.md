---
title: "security resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# security resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[Get security](../api/security-get.md)|[security](../resources/security.md)|Read the properties and relationships of a [security](../resources/security.md) object.|
|[Update security](../api/security-update.md)|[security](../resources/security.md)|Update the properties of a [security](../resources/security.md) object.|
|[List emailSecurityEventsRoot](../api/security-list-emailsecurityevents.md)|[emailSecurityEventsRoot](../resources/emailsecurityeventsroot.md) collection|Get the emailSecurityEventsRoot resources from the emailSecurityEvents navigation property.|
|[Add emailSecurityEventsRoot](../api/security-post-emailsecurityevents.md)|[emailSecurityEventsRoot](../resources/emailsecurityeventsroot.md)|Add emailSecurityEvents by posting to the emailSecurityEvents collection.|

## Properties
|Property|Type|Description|
|:---|:---|:---|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|emailSecurityEvents|[emailSecurityEventsRoot](../resources/emailsecurityeventsroot.md)|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.security",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.security"
}
```


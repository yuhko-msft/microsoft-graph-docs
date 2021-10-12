---
title: "teamworkOnlineMeetingInfo resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# teamworkOnlineMeetingInfo resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**

## Properties
|Property|Type|Description|
|:---|:---|:---|
|calendarEventId|String|**TODO: Add Description**|
|joinWebUrl|String|**TODO: Add Description**|
|organizer|[teamworkUserIdentity](../resources/teamworkuseridentity.md)|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.teamworkOnlineMeetingInfo"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.teamworkOnlineMeetingInfo",
  "calendarEventId": "String",
  "joinWebUrl": "String",
  "organizer": {
    "@odata.type": "microsoft.graph.teamworkUserIdentity"
  }
}
```


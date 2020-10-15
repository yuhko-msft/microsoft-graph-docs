---
title: "jobResponseBase resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# jobResponseBase resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Methods

| Method                                                     | Return Type                                      | Description                                                    |
| :--------------------------------------------------------- | :----------------------------------------------- | :------------------------------------------------------------- |
| [List jobResponseBase](../api/jobresponsebase-list.md)     | [jobResponseBase](jobResponseBase.md) collection | List properties and relationships of a jobResponseBase object. |
| [Create jobResponseBase](../api/jobresponsebase-create.md) | [jobResponseBase](jobResponseBase.md)            | Create a new jobResponseBase object.                           |
| [Get jobResponseBase](../api/jobresponsebase-get.md)       | [jobResponseBase](jobResponseBase.md)            | Read properties and relationships of a jobResponseBase object. |
| [Update jobResponseBase](../api/jobresponsebase-update.md) | [jobResponseBase](jobResponseBase.md)            | Update the properties of a jobResponseBase object.             |
| [Delete jobResponseBase](../api/jobresponsebase-delete.md) |                                                  | Delete a jobResponseBase object.                               |

## Properties

| Property         | Type                                                       | Description |
| :--------------- | :--------------------------------------------------------- | :---------- |
| creationDateTime | DateTimeOffset                                             |             |
| endDateTime      | DateTimeOffset                                             |             |
| error            | [classificationError](../resources/classificationerror.md) |             |
| id               | String                                                     | Read-only.  |
| startDateTime    | DateTimeOffset                                             |             |
| status           | String                                                     |             |
| tenantId         | String                                                     |             |
| type             | String                                                     |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.jobResponseBase",
  "baseType": "microsoft.graph.entity",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.jobResponseBase",
  "creationDateTime": "DateTimeOffset",
  "endDateTime": "DateTimeOffset",
  "error": {"@odata.type": "microsoft.graph.classificationError"},
  "id": "String (identifier)",
  "startDateTime": "DateTimeOffset",
  "status": "String",
  "tenantId": "String",
  "type": "String"
}
```

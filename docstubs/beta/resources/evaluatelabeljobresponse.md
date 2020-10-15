---
title: "evaluateLabelJobResponse resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# evaluateLabelJobResponse resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Inherits from [jobResponseBase](jobresponsebase.md)

## Methods

| Method                                                                       | Return Type                                                        | Description                                                              |
| :--------------------------------------------------------------------------- | :----------------------------------------------------------------- | :----------------------------------------------------------------------- |
| [List evaluateLabelJobResponse](../api/evaluatelabeljobresponse-list.md)     | [evaluateLabelJobResponse](evaluateLabelJobResponse.md) collection | List properties and relationships of an evaluateLabelJobResponse object. |
| [Create evaluateLabelJobResponse](../api/evaluatelabeljobresponse-create.md) | [evaluateLabelJobResponse](evaluateLabelJobResponse.md)            | Create a new evaluateLabelJobResponse object.                            |
| [Get evaluateLabelJobResponse](../api/evaluatelabeljobresponse-get.md)       | [evaluateLabelJobResponse](evaluateLabelJobResponse.md)            | Read properties and relationships of an evaluateLabelJobResponse object. |
| [Update evaluateLabelJobResponse](../api/evaluatelabeljobresponse-update.md) | [evaluateLabelJobResponse](evaluateLabelJobResponse.md)            | Update the properties of an evaluateLabelJobResponse object.             |
| [Delete evaluateLabelJobResponse](../api/evaluatelabeljobresponse-delete.md) |                                                                    | Delete an evaluateLabelJobResponse object.                               |

## Properties

| Property         | Type                                                                       | Description |
| :--------------- | :------------------------------------------------------------------------- | :---------- |
| creationDateTime | DateTimeOffset                                                             |             |
| endDateTime      | DateTimeOffset                                                             |             |
| error            | [classificationError](../resources/classificationerror.md)                 |             |
| id               | String                                                                     | Read-only.  |
| result           | [evaluateLabelJobResultGroup](../resources/evaluatelabeljobresultgroup.md) |             |
| startDateTime    | DateTimeOffset                                                             |             |
| status           | String                                                                     |             |
| tenantId         | String                                                                     |             |
| type             | String                                                                     |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.evaluateLabelJobResponse",
  "baseType": "microsoft.graph.jobResponseBase",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.evaluateLabelJobResponse",
  "creationDateTime": "DateTimeOffset",
  "endDateTime": "DateTimeOffset",
  "error": {"@odata.type": "microsoft.graph.classificationError"},
  "id": "String (identifier)",
  "result": {"@odata.type": "microsoft.graph.evaluateLabelJobResultGroup"},
  "startDateTime": "DateTimeOffset",
  "status": "String",
  "tenantId": "String",
  "type": "String"
}
```

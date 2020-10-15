---
title: "evaluateLabelsAndPoliciesJobResponse resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# evaluateLabelsAndPoliciesJobResponse resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Inherits from [jobResponseBase](jobresponsebase.md)

## Methods

| Method                                                                                               | Return Type                                                                                | Description                                                                          |
| :--------------------------------------------------------------------------------------------------- | :----------------------------------------------------------------------------------------- | :----------------------------------------------------------------------------------- |
| [List evaluateLabelsAndPoliciesJobResponse](../api/evaluatelabelsandpoliciesjobresponse-list.md)     | [evaluateLabelsAndPoliciesJobResponse](evaluateLabelsAndPoliciesJobResponse.md) collection | List properties and relationships of an evaluateLabelsAndPoliciesJobResponse object. |
| [Create evaluateLabelsAndPoliciesJobResponse](../api/evaluatelabelsandpoliciesjobresponse-create.md) | [evaluateLabelsAndPoliciesJobResponse](evaluateLabelsAndPoliciesJobResponse.md)            | Create a new evaluateLabelsAndPoliciesJobResponse object.                            |
| [Get evaluateLabelsAndPoliciesJobResponse](../api/evaluatelabelsandpoliciesjobresponse-get.md)       | [evaluateLabelsAndPoliciesJobResponse](evaluateLabelsAndPoliciesJobResponse.md)            | Read properties and relationships of an evaluateLabelsAndPoliciesJobResponse object. |
| [Update evaluateLabelsAndPoliciesJobResponse](../api/evaluatelabelsandpoliciesjobresponse-update.md) | [evaluateLabelsAndPoliciesJobResponse](evaluateLabelsAndPoliciesJobResponse.md)            | Update the properties of an evaluateLabelsAndPoliciesJobResponse object.             |
| [Delete evaluateLabelsAndPoliciesJobResponse](../api/evaluatelabelsandpoliciesjobresponse-delete.md) |                                                                                            | Delete an evaluateLabelsAndPoliciesJobResponse object.                               |

## Properties

| Property         | Type                                                                               | Description |
| :--------------- | :--------------------------------------------------------------------------------- | :---------- |
| creationDateTime | DateTimeOffset                                                                     |             |
| endDateTime      | DateTimeOffset                                                                     |             |
| error            | [classificationError](../resources/classificationerror.md)                         |             |
| id               | String                                                                             | Read-only.  |
| result           | [evaluateLabelsAndPoliciesResult](../resources/evaluatelabelsandpoliciesresult.md) |             |
| startDateTime    | DateTimeOffset                                                                     |             |
| status           | String                                                                             |             |
| tenantId         | String                                                                             |             |
| type             | String                                                                             |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.evaluateLabelsAndPoliciesJobResponse",
  "baseType": "microsoft.graph.jobResponseBase",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.evaluateLabelsAndPoliciesJobResponse",
  "creationDateTime": "DateTimeOffset",
  "endDateTime": "DateTimeOffset",
  "error": {"@odata.type": "microsoft.graph.classificationError"},
  "id": "String (identifier)",
  "result": {"@odata.type": "microsoft.graph.evaluateLabelsAndPoliciesResult"},
  "startDateTime": "DateTimeOffset",
  "status": "String",
  "tenantId": "String",
  "type": "String"
}
```

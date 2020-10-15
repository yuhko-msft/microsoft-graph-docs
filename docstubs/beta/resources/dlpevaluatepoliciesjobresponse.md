---
title: "dlpEvaluatePoliciesJobResponse resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# dlpEvaluatePoliciesJobResponse resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Inherits from [jobResponseBase](jobresponsebase.md)

## Methods

| Method                                                                                   | Return Type                                                                    | Description                                                                   |
| :--------------------------------------------------------------------------------------- | :----------------------------------------------------------------------------- | :---------------------------------------------------------------------------- |
| [List dlpEvaluatePoliciesJobResponse](../api/dlpevaluatepoliciesjobresponse-list.md)     | [dlpEvaluatePoliciesJobResponse](dlpEvaluatePoliciesJobResponse.md) collection | List properties and relationships of a dlpEvaluatePoliciesJobResponse object. |
| [Create dlpEvaluatePoliciesJobResponse](../api/dlpevaluatepoliciesjobresponse-create.md) | [dlpEvaluatePoliciesJobResponse](dlpEvaluatePoliciesJobResponse.md)            | Create a new dlpEvaluatePoliciesJobResponse object.                           |
| [Get dlpEvaluatePoliciesJobResponse](../api/dlpevaluatepoliciesjobresponse-get.md)       | [dlpEvaluatePoliciesJobResponse](dlpEvaluatePoliciesJobResponse.md)            | Read properties and relationships of a dlpEvaluatePoliciesJobResponse object. |
| [Update dlpEvaluatePoliciesJobResponse](../api/dlpevaluatepoliciesjobresponse-update.md) | [dlpEvaluatePoliciesJobResponse](dlpEvaluatePoliciesJobResponse.md)            | Update the properties of a dlpEvaluatePoliciesJobResponse object.             |
| [Delete dlpEvaluatePoliciesJobResponse](../api/dlpevaluatepoliciesjobresponse-delete.md) |                                                                                | Delete a dlpEvaluatePoliciesJobResponse object.                               |

## Properties

| Property         | Type                                                         | Description |
| :--------------- | :----------------------------------------------------------- | :---------- |
| creationDateTime | DateTimeOffset                                               |             |
| endDateTime      | DateTimeOffset                                               |             |
| error            | [classificationError](../resources/classificationerror.md)   |             |
| id               | String                                                       | Read-only.  |
| result           | [dlpPoliciesJobResult](../resources/dlppoliciesjobresult.md) |             |
| startDateTime    | DateTimeOffset                                               |             |
| status           | String                                                       |             |
| tenantId         | String                                                       |             |
| type             | String                                                       |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.dlpEvaluatePoliciesJobResponse",
  "baseType": "microsoft.graph.jobResponseBase",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.dlpEvaluatePoliciesJobResponse",
  "creationDateTime": "DateTimeOffset",
  "endDateTime": "DateTimeOffset",
  "error": {"@odata.type": "microsoft.graph.classificationError"},
  "id": "String (identifier)",
  "result": {"@odata.type": "microsoft.graph.dlpPoliciesJobResult"},
  "startDateTime": "DateTimeOffset",
  "status": "String",
  "tenantId": "String",
  "type": "String"
}
```

---
title: "classificationJobResponse resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# classificationJobResponse resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Inherits from [jobResponseBase](jobresponsebase.md)

## Methods

| Method                                                                         | Return Type                                                          | Description                                                              |
| :----------------------------------------------------------------------------- | :------------------------------------------------------------------- | :----------------------------------------------------------------------- |
| [List classificationJobResponse](../api/classificationjobresponse-list.md)     | [classificationJobResponse](classificationJobResponse.md) collection | List properties and relationships of a classificationJobResponse object. |
| [Create classificationJobResponse](../api/classificationjobresponse-create.md) | [classificationJobResponse](classificationJobResponse.md)            | Create a new classificationJobResponse object.                           |
| [Get classificationJobResponse](../api/classificationjobresponse-get.md)       | [classificationJobResponse](classificationJobResponse.md)            | Read properties and relationships of a classificationJobResponse object. |
| [Update classificationJobResponse](../api/classificationjobresponse-update.md) | [classificationJobResponse](classificationJobResponse.md)            | Update the properties of a classificationJobResponse object.             |
| [Delete classificationJobResponse](../api/classificationjobresponse-delete.md) |                                                                      | Delete a classificationJobResponse object.                               |

## Properties

| Property         | Type                                                                               | Description |
| :--------------- | :--------------------------------------------------------------------------------- | :---------- |
| creationDateTime | DateTimeOffset                                                                     |             |
| endDateTime      | DateTimeOffset                                                                     |             |
| error            | [classificationError](../resources/classificationerror.md)                         |             |
| id               | String                                                                             | Read-only.  |
| result           | [detectedSensitiveContentWrapper](../resources/detectedsensitivecontentwrapper.md) |             |
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
  "@odata.type": "microsoft.graph.classificationJobResponse",
  "baseType": "microsoft.graph.jobResponseBase",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.classificationJobResponse",
  "creationDateTime": "DateTimeOffset",
  "endDateTime": "DateTimeOffset",
  "error": {"@odata.type": "microsoft.graph.classificationError"},
  "id": "String (identifier)",
  "result": {"@odata.type": "microsoft.graph.detectedSensitiveContentWrapper"},
  "startDateTime": "DateTimeOffset",
  "status": "String",
  "tenantId": "String",
  "type": "String"
}
```

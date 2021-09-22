---
author: "SanjoyanM"
title: "sensitivityLabel resource type"
description: "Represents a sensitivity label of a file in SharePoint and OneDrive for Business."
ms.localizationpriority: medium
ms.prod: "sharepoint"
doc_type: resourcePageType
---

# sensitivityLabel resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Represents a sensitivity label of a file in SharePoint and OneDrive for Business.

## Methods
| Method		   | Return Type	|Description|
|:---------------|:--------|:----------|
| method  | returnType | description |

## Properties

| Property             | Type               | Description |
|:---------------------|:-------------------|:---------------------------------|
| applicableTo | graph.sensitivityLabelTarget | .|
| applicationMode | graph.applicationMode | .|
| assignedPolicies | Collection(graph.labelPolicy) | .|
| autoLabeling | graph.graph.autoLabeling | .|
| description | Edm.String | .|
| displayName | Edm.String | .|
| isDefault | Edm.Boolean | .|
| isEndpointProtectionEnabled | Edm.Boolean | .|
| labelActions | Collection(graph.labelActionBase) | .|
| name | string | Name of the sensitivity label applied on the file.|
| priority | Edm.Int32 | .|
| toolTip | Edm.String | .|


## Relationships
| Relationship | Type |Description|
|:---------------|:--------|:----------|
| sublabels | Collection(graph.sensitivityLabel) | Description |

## JSON representation

Here is a JSON representation of a sensitivityLabel resource.

```json
{
  "id": "string",
  "name": "string",
  "assignmentMethod": [ "standard | privileged | auto"]
}
```
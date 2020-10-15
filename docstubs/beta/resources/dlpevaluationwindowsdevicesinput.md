---
title: "dlpEvaluationWindowsDevicesInput resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: ""
doc_type: "resourcePageType"
---

# dlpEvaluationWindowsDevicesInput resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Properties

| Property                 | Type                                                                          | Description |
| :----------------------- | :---------------------------------------------------------------------------- | :---------- |
| accessScope              | String                                                                        |             |
| contentProperties        | [contentProperties](../resources/contentproperties.md)                        |             |
| currentLabel             | [currentLabel](../resources/currentlabel.md)                                  |             |
| discoveredSensitiveTypes | [discoveredSensitiveType](../resources/discoveredsensitivetype.md) collection |             |
| sharedBy                 | String                                                                        |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.dlpEvaluationWindowsDevicesInput",
}
-->

```json
{
  "@odata.type": "#microsoft.graph.dlpEvaluationWindowsDevicesInput",
  "accessScope": "inOrganization | notInOrganization",
  "contentProperties": {"@odata.type": "microsoft.graph.contentProperties"},
  "currentLabel": {"@odata.type": "microsoft.graph.currentLabel"},
  "discoveredSensitiveTypes": [{"@odata.type": "microsoft.graph.discoveredSensitiveType"}],
  "sharedBy": "String"
}
```

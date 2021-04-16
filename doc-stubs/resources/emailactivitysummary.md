---
title: "emailActivitySummary resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# emailActivitySummary resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List emailActivitySummaries](../api/emailactivitysummary-list.md)|[emailActivitySummary](../resources/emailactivitysummary.md) collection|Get a list of the [emailActivitySummary](../resources/emailactivitysummary.md) objects and their properties.|
|[Create emailActivitySummary](../api/emailactivitysummary-create.md)|[emailActivitySummary](../resources/emailactivitysummary.md)|Create a new [emailActivitySummary](../resources/emailactivitysummary.md) object.|
|[Get emailActivitySummary](../api/emailactivitysummary-get.md)|[emailActivitySummary](../resources/emailactivitysummary.md)|Read the properties and relationships of an [emailActivitySummary](../resources/emailactivitysummary.md) object.|
|[Update emailActivitySummary](../api/emailactivitysummary-update.md)|[emailActivitySummary](../resources/emailactivitysummary.md)|Update the properties of an [emailActivitySummary](../resources/emailactivitysummary.md) object.|
|[Delete emailActivitySummary](../api/emailactivitysummary-delete.md)|None|Deletes an [emailActivitySummary](../resources/emailactivitysummary.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|read|Int64|**TODO: Add Description**|
|receive|Int64|**TODO: Add Description**|
|reportDate|Date|**TODO: Add Description**|
|reportPeriod|String|**TODO: Add Description**|
|reportRefreshDate|Date|**TODO: Add Description**|
|send|Int64|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.emailActivitySummary",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.emailActivitySummary",
  "id": "String (identifier)",
  "read": "Integer",
  "receive": "Integer",
  "reportDate": "Date",
  "reportPeriod": "String",
  "reportRefreshDate": "Date",
  "send": "Integer"
}
```


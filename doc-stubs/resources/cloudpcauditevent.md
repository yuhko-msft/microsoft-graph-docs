---
title: "cloudPcAuditEvent resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# cloudPcAuditEvent resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List cloudPcAuditEvents](../api/cloudpcauditevent-list.md)|[cloudPcAuditEvent](../resources/cloudpcauditevent.md) collection|Get a list of the [cloudPcAuditEvent](../resources/cloudpcauditevent.md) objects and their properties.|
|[Create cloudPcAuditEvent](../api/cloudpcauditevent-create.md)|[cloudPcAuditEvent](../resources/cloudpcauditevent.md)|Create a new [cloudPcAuditEvent](../resources/cloudpcauditevent.md) object.|
|[Get cloudPcAuditEvent](../api/cloudpcauditevent-get.md)|[cloudPcAuditEvent](../resources/cloudpcauditevent.md)|Read the properties and relationships of a [cloudPcAuditEvent](../resources/cloudpcauditevent.md) object.|
|[Update cloudPcAuditEvent](../api/cloudpcauditevent-update.md)|[cloudPcAuditEvent](../resources/cloudpcauditevent.md)|Update the properties of a [cloudPcAuditEvent](../resources/cloudpcauditevent.md) object.|
|[Delete cloudPcAuditEvent](../api/cloudpcauditevent-delete.md)|None|Deletes a [cloudPcAuditEvent](../resources/cloudpcauditevent.md) object.|
|[getAuditActivityTypes](../api/cloudpcauditevent-getauditactivitytypes.md)|String collection|**TODO: Add Description**|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|activity|String|**TODO: Add Description**|
|activityDateTime|DateTimeOffset|**TODO: Add Description**|
|activityOperationType|cloudPcAuditActivityOperationType|**TODO: Add Description**. Possible values are: `create`, `delete`, `patch`, `other`.|
|activityResult|cloudPcAuditActivityResult|**TODO: Add Description**. Possible values are: `success`, `clientError`, `failure`, `timeout`, `other`.|
|activityType|String|**TODO: Add Description**|
|actor|[cloudPcAuditActor](../resources/cloudpcauditactor.md)|**TODO: Add Description**|
|category|cloudPcAuditCategory|**TODO: Add Description**. Possible values are: `cloudPC`, `other`.|
|componentName|String|**TODO: Add Description**|
|correlationId|String|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|id|String|**TODO: Add Description**|
|resources|[cloudPcAuditResource](../resources/cloudpcauditresource.md) collection|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.cloudPcAuditEvent",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.cloudPcAuditEvent",
  "id": "String (identifier)",
  "displayName": "String",
  "componentName": "String",
  "actor": {
    "@odata.type": "microsoft.graph.cloudPcAuditActor"
  },
  "activity": "String",
  "activityDateTime": "String (timestamp)",
  "activityType": "String",
  "activityOperationType": "String",
  "activityResult": "String",
  "correlationId": "String",
  "resources": [
    {
      "@odata.type": "microsoft.graph.cloudPcAuditResource"
    }
  ],
  "category": "String"
}
```


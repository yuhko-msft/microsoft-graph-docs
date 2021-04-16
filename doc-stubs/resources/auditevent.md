---
title: "auditEvent resource type"
description: "A class containing the properties for Audit Event."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# auditEvent resource type

Namespace: microsoft.graph



A class containing the properties for Audit Event.


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List auditEvents](../api/auditevent-list.md)|[auditEvent](../resources/auditevent.md) collection|Get a list of the [auditEvent](../resources/auditevent.md) objects and their properties.|
|[Create auditEvent](../api/auditevent-create.md)|[auditEvent](../resources/auditevent.md)|Create a new [auditEvent](../resources/auditevent.md) object.|
|[Get auditEvent](../api/auditevent-get.md)|[auditEvent](../resources/auditevent.md)|Read the properties and relationships of an [auditEvent](../resources/auditevent.md) object.|
|[Update auditEvent](../api/auditevent-update.md)|[auditEvent](../resources/auditevent.md)|Update the properties of an [auditEvent](../resources/auditevent.md) object.|
|[Delete auditEvent](../api/auditevent-delete.md)|None|Deletes an [auditEvent](../resources/auditevent.md) object.|
|[getAuditActivityTypes](../api/auditevent-getauditactivitytypes.md)|String collection|**TODO: Add Description**|
|[getAuditCategories](../api/auditevent-getauditcategories.md)|String collection|**TODO: Add Description**|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|activity|String|Friendly name of the activity.|
|activityDateTime|DateTimeOffset|The date time in UTC when the activity was performed.|
|activityOperationType|String|The HTTP operation type of the activity.|
|activityResult|String|The result of the activity.|
|activityType|String|The type of activity that was being performed.|
|actor|[auditActor](../resources/auditactor.md)|AAD user and application that are associated with the audit event.|
|category|String|Audit category.|
|componentName|String|Component name.|
|correlationId|Guid|The client request Id that is used to correlate activity within the system.|
|displayName|String|Event display name.|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|resources|[auditResource](../resources/auditresource.md) collection|Resources being modified.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.auditEvent",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.auditEvent",
  "id": "String (identifier)",
  "activity": "String",
  "activityDateTime": "String (timestamp)",
  "activityOperationType": "String",
  "activityResult": "String",
  "activityType": "String",
  "actor": {
    "@odata.type": "microsoft.graph.auditActor"
  },
  "category": "String",
  "componentName": "String",
  "correlationId": "Guid",
  "displayName": "String",
  "resources": [
    {
      "@odata.type": "microsoft.graph.auditResource"
    }
  ]
}
```


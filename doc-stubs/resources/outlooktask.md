---
title: "outlookTask resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# outlookTask resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [outlookItem](../resources/outlookitem.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List outlookTasks](../api/outlooktask-list.md)|[outlookTask](../resources/outlooktask.md) collection|Get a list of the [outlookTask](../resources/outlooktask.md) objects and their properties.|
|[Create outlookTask](../api/outlooktask-create.md)|[outlookTask](../resources/outlooktask.md)|Create a new [outlookTask](../resources/outlooktask.md) object.|
|[Get outlookTask](../api/outlooktask-get.md)|[outlookTask](../resources/outlooktask.md)|Read the properties and relationships of an [outlookTask](../resources/outlooktask.md) object.|
|[Update outlookTask](../api/outlooktask-update.md)|[outlookTask](../resources/outlooktask.md)|Update the properties of an [outlookTask](../resources/outlooktask.md) object.|
|[Delete outlookTask](../api/outlooktask-delete.md)|None|Deletes an [outlookTask](../resources/outlooktask.md) object.|
|[complete](../api/outlooktask-complete.md)|[outlookTask](../resources/outlooktask.md) collection|**TODO: Add Description**|
|[List attachments](../api/outlooktask-list-attachments.md)|[attachment](../resources/attachment.md) collection|Get the attachment resources from the attachments navigation property.|
|[Create attachment](../api/outlooktask-post-attachments.md)|[attachment](../resources/attachment.md)|Create a new attachment object.|
|[List multiValueExtendedProperties](../api/outlooktask-list-multivalueextendedproperties.md)|[multiValueLegacyExtendedProperty](../resources/multivaluelegacyextendedproperty.md) collection|Get the multiValueLegacyExtendedProperty resources from the multiValueExtendedProperties navigation property.|
|[Create multiValueLegacyExtendedProperty](../api/outlooktask-post-multivalueextendedproperties.md)|[multiValueLegacyExtendedProperty](../resources/multivaluelegacyextendedproperty.md)|Create a new multiValueLegacyExtendedProperty object.|
|[List singleValueExtendedProperties](../api/outlooktask-list-singlevalueextendedproperties.md)|[singleValueLegacyExtendedProperty](../resources/singlevaluelegacyextendedproperty.md) collection|Get the singleValueLegacyExtendedProperty resources from the singleValueExtendedProperties navigation property.|
|[Create singleValueLegacyExtendedProperty](../api/outlooktask-post-singlevalueextendedproperties.md)|[singleValueLegacyExtendedProperty](../resources/singlevaluelegacyextendedproperty.md)|Create a new singleValueLegacyExtendedProperty object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|assignedTo|String|**TODO: Add Description**|
|body|[itemBody](../resources/itembody.md)|**TODO: Add Description**|
|categories|String collection|**TODO: Add Description** Inherited from [outlookItem](../resources/outlookitem.md)|
|changeKey|String|**TODO: Add Description** Inherited from [outlookItem](../resources/outlookitem.md)|
|completedDateTime|[dateTimeTimeZone](../resources/datetimetimezone.md)|**TODO: Add Description**|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [outlookItem](../resources/outlookitem.md)|
|dueDateTime|[dateTimeTimeZone](../resources/datetimetimezone.md)|**TODO: Add Description**|
|hasAttachments|Boolean|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|importance|importance|**TODO: Add Description**. Possible values are: `low`, `normal`, `high`.|
|isReminderOn|Boolean|**TODO: Add Description**|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [outlookItem](../resources/outlookitem.md)|
|owner|String|**TODO: Add Description**|
|parentFolderId|String|**TODO: Add Description**|
|recurrence|[patternedRecurrence](../resources/patternedrecurrence.md)|**TODO: Add Description**|
|reminderDateTime|[dateTimeTimeZone](../resources/datetimetimezone.md)|**TODO: Add Description**|
|sensitivity|sensitivity|**TODO: Add Description**. Possible values are: `normal`, `personal`, `private`, `confidential`.|
|startDateTime|[dateTimeTimeZone](../resources/datetimetimezone.md)|**TODO: Add Description**|
|status|taskStatus|**TODO: Add Description**. Possible values are: `notStarted`, `inProgress`, `completed`, `waitingOnOthers`, `deferred`.|
|subject|String|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|attachments|[attachment](../resources/attachment.md) collection|**TODO: Add Description**|
|multiValueExtendedProperties|[multiValueLegacyExtendedProperty](../resources/multivaluelegacyextendedproperty.md) collection|**TODO: Add Description**|
|singleValueExtendedProperties|[singleValueLegacyExtendedProperty](../resources/singlevaluelegacyextendedproperty.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.outlookTask",
  "baseType": "microsoft.graph.outlookItem",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.outlookTask",
  "id": "String (identifier)",
  "categories": [
    "String"
  ],
  "changeKey": "String",
  "createdDateTime": "String (timestamp)",
  "lastModifiedDateTime": "String (timestamp)",
  "assignedTo": "String",
  "body": {
    "@odata.type": "microsoft.graph.itemBody"
  },
  "completedDateTime": {
    "@odata.type": "microsoft.graph.dateTimeTimeZone"
  },
  "dueDateTime": {
    "@odata.type": "microsoft.graph.dateTimeTimeZone"
  },
  "hasAttachments": "Boolean",
  "importance": "String",
  "isReminderOn": "Boolean",
  "owner": "String",
  "parentFolderId": "String",
  "recurrence": {
    "@odata.type": "microsoft.graph.patternedRecurrence"
  },
  "reminderDateTime": {
    "@odata.type": "microsoft.graph.dateTimeTimeZone"
  },
  "sensitivity": "String",
  "startDateTime": {
    "@odata.type": "microsoft.graph.dateTimeTimeZone"
  },
  "status": "String",
  "subject": "String"
}
```


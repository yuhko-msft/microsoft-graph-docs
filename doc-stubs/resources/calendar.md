---
title: "calendar resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# calendar resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List calendars](../api/calendar-list.md)|[calendar](../resources/calendar.md) collection|Get a list of the [calendar](../resources/calendar.md) objects and their properties.|
|[Create calendar](../api/calendar-create.md)|[calendar](../resources/calendar.md)|Create a new [calendar](../resources/calendar.md) object.|
|[Get calendar](../api/calendar-get.md)|[calendar](../resources/calendar.md)|Read the properties and relationships of a [calendar](../resources/calendar.md) object.|
|[Update calendar](../api/calendar-update.md)|[calendar](../resources/calendar.md)|Update the properties of a [calendar](../resources/calendar.md) object.|
|[Delete calendar](../api/calendar-delete.md)|None|Deletes a [calendar](../resources/calendar.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|allowedOnlineMeetingProviders|onlineMeetingProviderType collection|**TODO: Add Description**|
|calendarGroupId|String|**TODO: Add Description**|
|canEdit|Boolean|**TODO: Add Description**|
|canShare|Boolean|**TODO: Add Description**|
|canViewPrivateItems|Boolean|**TODO: Add Description**|
|changeKey|String|**TODO: Add Description**|
|color|calendarColor|**TODO: Add Description**. Possible values are: `auto`, `lightBlue`, `lightGreen`, `lightOrange`, `lightGray`, `lightYellow`, `lightTeal`, `lightPink`, `lightBrown`, `lightRed`, `maxColor`.|
|defaultOnlineMeetingProvider|onlineMeetingProviderType|**TODO: Add Description**. Possible values are: `unknown`, `skypeForBusiness`, `skypeForConsumer`, `teamsForBusiness`.|
|hexColor|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|isDefaultCalendar|Boolean|**TODO: Add Description**|
|isRemovable|Boolean|**TODO: Add Description**|
|isShared|Boolean|**TODO: Add Description**|
|isSharedWithMe|Boolean|**TODO: Add Description**|
|isTallyingResponses|Boolean|**TODO: Add Description**|
|name|String|**TODO: Add Description**|
|owner|[emailAddress](../resources/emailaddress.md)|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|calendarPermissions|[calendarPermission](../resources/calendarpermission.md) collection|**TODO: Add Description**|
|calendarView|[event](../resources/event.md) collection|**TODO: Add Description**|
|events|[event](../resources/event.md) collection|**TODO: Add Description**|
|multiValueExtendedProperties|[multiValueLegacyExtendedProperty](../resources/multivaluelegacyextendedproperty.md) collection|**TODO: Add Description**|
|singleValueExtendedProperties|[singleValueLegacyExtendedProperty](../resources/singlevaluelegacyextendedproperty.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.calendar",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.calendar",
  "id": "String (identifier)",
  "allowedOnlineMeetingProviders": [
    "String"
  ],
  "calendarGroupId": "String",
  "canEdit": "Boolean",
  "canShare": "Boolean",
  "canViewPrivateItems": "Boolean",
  "changeKey": "String",
  "color": "String",
  "defaultOnlineMeetingProvider": "String",
  "hexColor": "String",
  "isDefaultCalendar": "Boolean",
  "isRemovable": "Boolean",
  "isShared": "Boolean",
  "isSharedWithMe": "Boolean",
  "isTallyingResponses": "Boolean",
  "name": "String",
  "owner": {
    "@odata.type": "microsoft.graph.emailAddress"
  }
}
```


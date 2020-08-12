---
title: "calendarPermission resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# calendarPermission resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List calendarPermissions](../api/calendar-list-calendarpermissions.md)|[calendarPermission](../resources/calendarpermission.md) collection|Get the calendarPermissions from the calendarPermissions navigation property.|
|[Create calendarPermissions](../api/calendar-post-calendarpermissions.md)|[calendarPermission](../resources/calendarpermission.md)|Create a new calendarPermissions object.|
|[Update calendarPermissions](../api/calendar-update-calendarpermissions.md)|[calendarPermission](../resources/calendarpermission.md)|Update the properties of a calendarPermissions object.|
|[Get calendarPermissions](../api/calendar-get-calendarpermission.md)|[calendarPermission](../resources/calendarpermission.md)|Read the properties and relationships of a [calendarPermission](../resources/calendarpermission.md) object.|
|[Delete calendarPermissions](../api/calendar-delete-calendarpermissions.md)|None|Delete a [calendarPermission](../resources/calendarpermission.md) object.|
|[List calendarPermissions](../api/calendarpermission-list.md)|[calendarPermission](../resources/calendarpermission.md) collection|Get a list of the [calendarPermission](../resources/calendarpermission.md) objects and their properties.|
|[Create calendarPermission](../api/calendarpermission-create.md)|[calendarPermission](../resources/calendarpermission.md)|Create a new [calendarPermission](../resources/calendarpermission.md) object.|
|[Get calendarPermission](../api/calendarpermission-get.md)|[calendarPermission](../resources/calendarpermission.md)|Read the properties and relationships of a [calendarPermission](../resources/calendarpermission.md) object.|
|[Update calendarPermission](../api/calendarpermission-update.md)|[calendarPermission](../resources/calendarpermission.md)|Update the properties of a [calendarPermission](../resources/calendarpermission.md) object.|
|[Delete calendarPermission](../api/calendarpermission-delete.md)|None|Deletes a [calendarPermission](../resources/calendarpermission.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|allowedRoles|calendarRoleType collection|**TODO: Add Description**|
|emailAddress|[emailAddress](../resources/emailaddress.md)|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|isInsideOrganization|Boolean|**TODO: Add Description**|
|isRemovable|Boolean|**TODO: Add Description**|
|role|calendarRoleType|**TODO: Add Description**. Possible values are: `none`, `freeBusyRead`, `limitedRead`, `read`, `write`, `delegateWithoutPrivateEventAccess`, `delegateWithPrivateEventAccess`, `custom`.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.calendarPermission",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.calendarPermission",
  "id": "String (identifier)",
  "emailAddress": {
    "@odata.type": "microsoft.graph.emailAddress"
  },
  "isRemovable": "Boolean",
  "isInsideOrganization": "Boolean",
  "role": "String",
  "allowedRoles": [
    "String"
  ]
}
```


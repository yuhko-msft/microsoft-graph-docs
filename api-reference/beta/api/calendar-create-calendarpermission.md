---
title: "Create calendarPermission"
description: "Create a new calendarPermission object."
author: Bhupesh12Hub
localization_priority: Normal
ms.prod: outlook
doc_type: apiPageType
---

# Create calendarPermission
Namespace: microsoft.graph

Create a new [calendarPermission](../resources/calendarpermission.md) object.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from most to least privileged)|
|:---|:---|
|Delegated (work or school account)|Calendars.ReadWrite|
|Delegated (personal Microsoft account)|Calendars.ReadWrite|
|Application|Calendars.ReadWrite|

## HTTP request

<!-- {
  "blockType": "ignored"
}
-->
``` http
POST /users/{id}/calendar/calendarPermissions/{id}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [calendarPermission](../resources/calendarpermission.md) object.

The following table shows the properties that are required when you create the [calendarPermission](../resources/calendarpermission.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|The unique identifier of the user with whom the calendar has been shared. Inherited from [entity](../resources/entity.md)|
|emailAddress|[emailAddress](../resources/emailaddress.md)|Represents a sharee or delegate who has access to the calendar. For the "My Organization" sharee, the address property is null. Read-only|
|isRemovable|Boolean|True if the user can be removed from the list of delegates for the specified calendar, false otherwise.|
|isInsideOrganization|Boolean|True if the user in context delegate is inside the same organization as the calendar owner, false otherwise.|
|role|calendarRoleType| Possible values are: `none`, `freeBusyRead`, `limitedRead`, `read`, `write`, `delegateWithoutPrivateEventAccess`, `delegateWithPrivateEventAccess`, `custom`.|
|allowedRoles|calendarRoleType collection| Possible values are: `none`, `freeBusyRead`, `limitedRead`, `read`, `write`, `delegateWithoutPrivateEventAccess`, `delegateWithPrivateEventAccess`, `custom`.|



## Response

If successful, this method returns a `201 Created` response code and a [calendarPermission](../resources/calendarpermission.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_calendarpermission_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/users/{id}/calendar/calendarPermissions/{id}
Content-Type: application/json
Content-length: 267

{
  "@odata.type": "#microsoft.graph.calendarPermission",
  "emailAddress": {
    "@odata.type": "microsoft.graph.emailAddress"
  },
  "isRemovable": "true",
  "isInsideOrganization": "true",
  "role": "write",
  "allowedRoles": [
    "freeBusyRead",
    "limitedRead",
    "read",
    "write"
  ]
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.calendarPermission"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.calendarPermission",
  "id": "ddac8d4b-8d4b-ddac-4b8d-acdd4b8dacdd",
  "emailAddress": {
    "@odata.type": "microsoft.graph.emailAddress"
  },
  "isRemovable": "true",
  "isInsideOrganization": "true",
  "role": "write",
  "allowedRoles": [
    "freeBusyRead",
    "limitedRead",
    "read",
    "write"
  ]
}
```


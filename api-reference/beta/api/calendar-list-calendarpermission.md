---
title: "List calendarPermissions"
description: "Get a list of the calendarPermission objects and their properties."
author: Bhupesh12Hub
localization_priority: Normal
ms.prod: outlook
doc_type: apiPageType
---

# List calendarPermissions
Namespace: microsoft.graph

Get a list of the [calendarPermission](../resources/calendarpermission.md) objects and their properties.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from most to least privileged)|
|:---|:---|
|Delegated (work or school account)|Calendars.Read, Calendars.ReadWrite|
|Delegated (personal Microsoft account)|Calendars.Read, Calendars.ReadWrite|
|Application|Calendars.Read, Calendars.ReadWrite|

## HTTP request

<!-- {
  "blockType": "ignored"
}
-->
``` http
GET /users/{id}/calendar/calendarPermissions/{id}
```

## Optional query parameters
This method supports some of the OData query parameters to help customize the response. For general information, see [OData query parameters](/graph/query-parameters).

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|

## Request body
Do not supply a request body for this method.

## Response

If successful, this method returns a `200 OK` response code and a collection of [calendarPermission](../resources/calendarpermission.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_calendarpermission"
}
-->
``` http
GET https://graph.microsoft.com/beta/users/{id}/calendar/calendarPermissions/{id}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.calendarPermission)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
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
  ]
}
```


---
title: "calendarSharingMessage: accept"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# calendarSharingMessage: accept
Namespace: microsoft.graph

**TODO: Add Description**

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from most to least privileged)|
|:---|:---|
|Delegated (work or school account)|**TODO: Provide applicable permissions.**|
|Delegated (personal Microsoft account)|**TODO: Provide applicable permissions.**|
|Application|**TODO: Provide applicable permissions.**|

## HTTP request

<!-- {
  "blockType": "ignored"
}
-->
``` http
POST ** Entity URI for microsoft.graph.calendarSharingMessage not found/accept
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
Do not supply a request body for this method.

## Response

If successful, this action returns a `200 OK` response code and a [calendar](../resources/calendar.md) in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "calendarsharingmessage_accept"
}
-->
``` http
POST https://graph.microsoft.com/beta** Entity URI for microsoft.graph.calendarSharingMessage not found/accept
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.calendar"
}
-->
``` http
HTTP/1.1 200 OK

Content-Type: application/json
{
  "value": {
    "@odata.type": "#microsoft.graph.calendar",
    "id": "String (identifier)",
    "name": "String",
    "color": "String",
    "hexColor": "String",
    "isDefaultCalendar": "Boolean",
    "changeKey": "String",
    "canShare": "Boolean",
    "canViewPrivateItems": "Boolean",
    "isShared": "Boolean",
    "isSharedWithMe": "Boolean",
    "canEdit": "Boolean",
    "owner": {
      "@odata.type": "microsoft.graph.emailAddress"
    },
    "calendarGroupId": "String",
    "allowedOnlineMeetingProviders": [
      "String"
    ],
    "defaultOnlineMeetingProvider": "String",
    "isTallyingResponses": "Boolean",
    "isRemovable": "Boolean"
  }
}
```


---
title: "Create calendar"
description: "Create a new calendar object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create calendar
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new calendar object.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from least to most privileged)|
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
POST /groups/{groupsId}/calendar
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [calendar](../resources/calendar.md) object.

The following table shows the properties that are required when you create the [calendar](../resources/calendar.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|allowedOnlineMeetingProviders|onlineMeetingProviderType collection|**TODO: Add Description**. Possible values are: `unknown`, `skypeForBusiness`, `skypeForConsumer`, `teamsForBusiness`.|
|calendarGroupId|String|**TODO: Add Description**|
|canEdit|Boolean|**TODO: Add Description**|
|canShare|Boolean|**TODO: Add Description**|
|canViewPrivateItems|Boolean|**TODO: Add Description**|
|changeKey|String|**TODO: Add Description**|
|color|calendarColor|**TODO: Add Description**. Possible values are: `auto`, `lightBlue`, `lightGreen`, `lightOrange`, `lightGray`, `lightYellow`, `lightTeal`, `lightPink`, `lightBrown`, `lightRed`, `maxColor`.|
|defaultOnlineMeetingProvider|onlineMeetingProviderType|**TODO: Add Description**. Possible values are: `unknown`, `skypeForBusiness`, `skypeForConsumer`, `teamsForBusiness`.|
|hexColor|String|**TODO: Add Description**|
|isDefaultCalendar|Boolean|**TODO: Add Description**|
|isRemovable|Boolean|**TODO: Add Description**|
|isShared|Boolean|**TODO: Add Description**|
|isSharedWithMe|Boolean|**TODO: Add Description**|
|isTallyingResponses|Boolean|**TODO: Add Description**|
|name|String|**TODO: Add Description**|
|owner|[emailAddress](../resources/emailaddress.md)|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and a [calendar](../resources/calendar.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_calendar_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/groups/{groupsId}/calendar
Content-Type: application/json
Content-length: 597

{
  "@odata.type": "#microsoft.graph.calendar",
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


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.calendar"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.calendar",
  "id": "b0b0f208-f208-b0b0-08f2-b0b008f2b0b0",
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


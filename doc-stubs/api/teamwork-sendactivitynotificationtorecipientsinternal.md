---
title: "teamwork: sendActivityNotificationToRecipientsInternal"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# teamwork: sendActivityNotificationToRecipientsInternal
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
POST /teamwork/sendActivityNotificationToRecipientsInternal
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply JSON representation of the parameters.

The following table shows the parameters that can be used with this action.

|Parameter|Type|Description|
|:---|:---|:---|
|topic|[teamworkActivityTopic](../resources/teamworkactivitytopic.md)|**TODO: Add Description**|
|activityType|String|**TODO: Add Description**|
|chainId|Int64|**TODO: Add Description**|
|previewText|[itemBody](../resources/itembody.md)|**TODO: Add Description**|
|teamsAppId|String|**TODO: Add Description**|
|from|[identitySet](../resources/identityset.md)|**TODO: Add Description**|
|templateParameters|[keyValuePair](../resources/keyvaluepair.md) collection|**TODO: Add Description**|
|recipients|[teamworkNotificationRecipient](../resources/teamworknotificationrecipient.md) collection|**TODO: Add Description**|



## Response

If successful, this action returns a `204 No Content` response code.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "teamwork_sendactivitynotificationtorecipientsinternal"
}
-->
``` http
POST https://graph.microsoft.com/beta/teamwork/sendActivityNotificationToRecipientsInternal

Content-Type: application/json
Content-length: 514

{
  "topic": {
    "@odata.type": "microsoft.graph.teamworkActivityTopic"
  },
  "activityType": "String",
  "chainId": "Integer",
  "previewText": {
    "@odata.type": "microsoft.graph.itemBody"
  },
  "teamsAppId": "String",
  "from": {
    "@odata.type": "microsoft.graph.identitySet"
  },
  "templateParameters": [
    {
      "@odata.type": "microsoft.graph.keyValuePair"
    }
  ],
  "recipients": [
    {
      "@odata.type": "microsoft.graph.aadUserNotificationRecipient"
    }
  ]
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true
}
-->
``` http
HTTP/1.1 204 No Content
```


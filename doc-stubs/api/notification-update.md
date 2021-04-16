---
title: "Update notification"
description: "Update the properties of a notification object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update notification
Namespace: microsoft.graph



Update the properties of a [notification](../resources/notification.md) object.

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
PATCH /me/notifications/{notificationId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [notification](../resources/notification.md) object.

The following table shows the properties that are required when you update the [notification](../resources/notification.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|displayTimeToLive|Int32|**TODO: Add Description**|
|expirationDateTime|DateTimeOffset|**TODO: Add Description**|
|groupName|String|**TODO: Add Description**|
|payload|[payloadTypes](../resources/payloadtypes.md)|**TODO: Add Description**|
|priority|priority|**TODO: Add Description**. Possible values are: `None`, `High`, `Low`.|
|targetHostName|String|**TODO: Add Description**|
|targetPolicy|[targetPolicyEndpoints](../resources/targetpolicyendpoints.md)|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [notification](../resources/notification.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_notification"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/me/notifications/{notificationId}
Content-Type: application/json
Content-length: 378

{
  "@odata.type": "#microsoft.graph.notification",
  "displayTimeToLive": "Integer",
  "expirationDateTime": "String (timestamp)",
  "groupName": "String",
  "payload": {
    "@odata.type": "microsoft.graph.payloadTypes"
  },
  "priority": "String",
  "targetHostName": "String",
  "targetPolicy": {
    "@odata.type": "microsoft.graph.targetPolicyEndpoints"
  }
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
HTTP/1.1 200 OK
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.notification",
  "id": "0b23df16-df16-0b23-16df-230b16df230b",
  "displayTimeToLive": "Integer",
  "expirationDateTime": "String (timestamp)",
  "groupName": "String",
  "payload": {
    "@odata.type": "microsoft.graph.payloadTypes"
  },
  "priority": "String",
  "targetHostName": "String",
  "targetPolicy": {
    "@odata.type": "microsoft.graph.targetPolicyEndpoints"
  }
}
```


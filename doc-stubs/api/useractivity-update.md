---
title: "Update userActivity"
description: "Update the properties of a userActivity object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update userActivity
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of a [userActivity](../resources/useractivity.md) object.

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
PATCH /me/activities/{userActivityId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [userActivity](../resources/useractivity.md) object.

The following table shows the properties that are required when you update the [userActivity](../resources/useractivity.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|activationUrl|String|**TODO: Add Description**|
|activitySourceHost|String|**TODO: Add Description**|
|appActivityId|String|**TODO: Add Description**|
|appDisplayName|String|**TODO: Add Description**|
|contentInfo|[Json](../resources/json.md)|**TODO: Add Description**|
|contentUrl|String|**TODO: Add Description**|
|createdDateTime|DateTimeOffset|**TODO: Add Description**|
|expirationDateTime|DateTimeOffset|**TODO: Add Description**|
|fallbackUrl|String|**TODO: Add Description**|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description**|
|status|status|**TODO: Add Description**. Possible values are: `active`, `updated`, `deleted`, `ignored`, `unknownFutureValue`.|
|userTimezone|String|**TODO: Add Description**|
|visualElements|[visualInfo](../resources/visualinfo.md)|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [userActivity](../resources/useractivity.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_useractivity"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/me/activities/{userActivityId}
Content-Type: application/json
Content-length: 481

{
  "@odata.type": "#microsoft.graph.userActivity",
  "activationUrl": "String",
  "activitySourceHost": "String",
  "appActivityId": "String",
  "appDisplayName": "String",
  "contentInfo": {
    "@odata.type": "microsoft.graph.Json"
  },
  "contentUrl": "String",
  "expirationDateTime": "String (timestamp)",
  "fallbackUrl": "String",
  "status": "String",
  "userTimezone": "String",
  "visualElements": {
    "@odata.type": "microsoft.graph.visualInfo"
  }
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.userActivity",
  "id": "5a4d2c1f-2c1f-5a4d-1f2c-4d5a1f2c4d5a",
  "activationUrl": "String",
  "activitySourceHost": "String",
  "appActivityId": "String",
  "appDisplayName": "String",
  "contentInfo": {
    "@odata.type": "microsoft.graph.Json"
  },
  "contentUrl": "String",
  "createdDateTime": "String (timestamp)",
  "expirationDateTime": "String (timestamp)",
  "fallbackUrl": "String",
  "lastModifiedDateTime": "String (timestamp)",
  "status": "String",
  "userTimezone": "String",
  "visualElements": {
    "@odata.type": "microsoft.graph.visualInfo"
  }
}
```


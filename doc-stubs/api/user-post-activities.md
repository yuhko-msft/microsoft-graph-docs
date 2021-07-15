---
title: "Create userActivity"
description: "Create a new userActivity object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create userActivity
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new userActivity object.

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
POST /me/activities
POST /users/{usersId}/activities
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [userActivity](../resources/useractivity.md) object.

The following table shows the properties that are required when you create the [userActivity](../resources/useractivity.md).

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

If successful, this method returns a `201 Created` response code and a [userActivity](../resources/useractivity.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_useractivity_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/me/activities
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
  "truncated": true,
  "@odata.type": "microsoft.graph.userActivity"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.userActivity",
  "id": "e2182161-2161-e218-6121-18e2612118e2",
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


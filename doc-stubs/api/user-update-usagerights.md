---
title: "Update usageRights"
description: "Update the properties of an usageRights object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update usageRights
Namespace: microsoft.graph

Update the properties of an usageRights object.

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
PATCH /users/{usersId}/usageRights
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [UsageRight](../resources/usageright.md) object.

The following table shows the properties that are required when you create the [UsageRight](../resources/usageright.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description**|
|catalogId|String|**TODO: Add Description**|
|serviceIdentifier|String|**TODO: Add Description**|
|state|usageRightState|**TODO: Add Description**. Possible values are: `active`, `inactive`, `warning`, `suspended`, `unknownFutureValue`.|



## Response

If successful, this method returns a `200 OK` response code and an updated [UsageRight](../resources/usageright.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_usagerights"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/users/{usersId}/usageRights
Content-Type: application/json
Content-length: 134

{
  "@odata.type": "#microsoft.graph.UsageRight",
  "catalogId": "String",
  "serviceIdentifier": "String",
  "state": "String"
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
  "@odata.type": "#microsoft.graph.UsageRight",
  "id": "9301ad43-ad43-9301-43ad-019343ad0193",
  "catalogId": "String",
  "serviceIdentifier": "String",
  "state": "String"
}
```


---
title: "Update iosVppAppAssignedLicense"
description: "Update the properties of an iosVppAppAssignedLicense object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update iosVppAppAssignedLicense
Namespace: microsoft.graph



Update the properties of an [iosVppAppAssignedLicense](../resources/iosvppappassignedlicense.md) object.

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
PATCH /iosVppAppAssignedLicense
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [iosVppAppAssignedLicense](../resources/iosvppappassignedlicense.md) object.

The following table shows the properties that are required when you update the [iosVppAppAssignedLicense](../resources/iosvppappassignedlicense.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|userEmailAddress|String|The user email address.|
|userId|String|The user ID.|
|userName|String|The user name.|
|userPrincipalName|String|The user principal name.|



## Response

If successful, this method returns a `200 OK` response code and an updated [iosVppAppAssignedLicense](../resources/iosvppappassignedlicense.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_iosvppappassignedlicense"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/iosVppAppAssignedLicense
Content-Type: application/json
Content-length: 181

{
  "@odata.type": "#microsoft.graph.iosVppAppAssignedLicense",
  "userEmailAddress": "String",
  "userId": "String",
  "userName": "String",
  "userPrincipalName": "String"
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
  "@odata.type": "#microsoft.graph.iosVppAppAssignedLicense",
  "id": "ff61124a-124a-ff61-4a12-61ff4a1261ff",
  "userEmailAddress": "String",
  "userId": "String",
  "userName": "String",
  "userPrincipalName": "String"
}
```


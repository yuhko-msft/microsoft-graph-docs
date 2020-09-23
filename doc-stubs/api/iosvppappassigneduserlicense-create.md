---
title: "Create iosVppAppAssignedUserLicense"
description: "Create a new iosVppAppAssignedUserLicense object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create iosVppAppAssignedUserLicense
Namespace: microsoft.graph

Create a new [iosVppAppAssignedUserLicense](../resources/iosvppappassigneduserlicense.md) object.

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
POST ** Collection URI for microsoft.management.services.api.iosVppAppAssignedUserLicense not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [iosVppAppAssignedUserLicense](../resources/iosvppappassigneduserlicense.md) object.

The following table shows the properties that are required when you create the [iosVppAppAssignedUserLicense](../resources/iosvppappassigneduserlicense.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|Key of the entity. Inherited from [iosVppAppAssignedLicense](../resources/iosvppappassignedlicense.md)|
|userEmailAddress|String|The user email address. Inherited from [iosVppAppAssignedLicense](../resources/iosvppappassignedlicense.md)|
|userId|String|The user ID. Inherited from [iosVppAppAssignedLicense](../resources/iosvppappassignedlicense.md)|
|userName|String|The user name. Inherited from [iosVppAppAssignedLicense](../resources/iosvppappassignedlicense.md)|
|userPrincipalName|String|The user principal name. Inherited from [iosVppAppAssignedLicense](../resources/iosvppappassignedlicense.md)|



## Response

If successful, this method returns a `201 Created` response code and an [iosVppAppAssignedUserLicense](../resources/iosvppappassigneduserlicense.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_iosvppappassigneduserlicense_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta** Collection URI for microsoft.management.services.api.iosVppAppAssignedUserLicense not found
Content-Type: application/json
Content-length: 203

{
  "@odata.type": "#microsoft.management.services.api.iosVppAppAssignedUserLicense",
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
  "truncated": true,
  "@odata.type": "microsoft.management.services.api.iosVppAppAssignedUserLicense"
}
-->
``` http
HTTP/1.1 201 Created

Content-Type: application/json
{
  "@odata.type": "#microsoft.management.services.api.iosVppAppAssignedUserLicense",
  "id": "01f4aaec-aaec-01f4-ecaa-f401ecaaf401",
  "userEmailAddress": "String",
  "userId": "String",
  "userName": "String",
  "userPrincipalName": "String"
}
```


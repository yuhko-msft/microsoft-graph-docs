---
title: "Update iosVppAppAssignedUserLicense"
description: "Update the properties of an iosVppAppAssignedUserLicense object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update iosVppAppAssignedUserLicense
Namespace: microsoft.graph

Update the properties of an [iosVppAppAssignedUserLicense](../resources/iosvppappassigneduserlicense.md) object.

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
PATCH /iosVppAppAssignedUserLicense
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
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|userEmailAddress|String|**TODO: Add Description** Inherited from [iosVppAppAssignedLicense](../resources/intune-iosvppappassignedlicense.md)|
|userId|String|**TODO: Add Description** Inherited from [iosVppAppAssignedLicense](../resources/intune-iosvppappassignedlicense.md)|
|userName|String|**TODO: Add Description** Inherited from [iosVppAppAssignedLicense](../resources/intune-iosvppappassignedlicense.md)|
|userPrincipalName|String|**TODO: Add Description** Inherited from [iosVppAppAssignedLicense](../resources/intune-iosvppappassignedlicense.md)|



## Response

If successful, this method returns a `200 OK` response code and an updated [iosVppAppAssignedUserLicense](../resources/iosvppappassigneduserlicense.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_iosvppappassigneduserlicense"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/iosVppAppAssignedUserLicense
Content-Type: application/json
Content-length: 185

{
  "@odata.type": "#microsoft.graph.iosVppAppAssignedUserLicense",
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
  "@odata.type": "#microsoft.graph.iosVppAppAssignedUserLicense",
  "id": "a5b53093-3093-a5b5-9330-b5a59330b5a5",
  "userEmailAddress": "String",
  "userId": "String",
  "userName": "String",
  "userPrincipalName": "String"
}
```


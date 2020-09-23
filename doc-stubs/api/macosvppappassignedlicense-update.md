---
title: "Update macOsVppAppAssignedLicense"
description: "Update the properties of a macOsVppAppAssignedLicense object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update macOsVppAppAssignedLicense
Namespace: microsoft.graph

Update the properties of a [macOsVppAppAssignedLicense](../resources/macosvppappassignedlicense.md) object.

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
PATCH /macOsVppAppAssignedLicense
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [macOsVppAppAssignedLicense](../resources/macosvppappassignedlicense.md) object.

The following table shows the properties that are required when you create the [macOsVppAppAssignedLicense](../resources/macosvppappassignedlicense.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|Key of the entity.|
|userEmailAddress|String|The user email address.|
|userId|String|The user ID.|
|userName|String|The user name.|
|userPrincipalName|String|The user principal name.|



## Response

If successful, this method returns a `200 OK` response code and an updated [macOsVppAppAssignedLicense](../resources/macosvppappassignedlicense.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_macosvppappassignedlicense"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/macOsVppAppAssignedLicense
Content-Type: application/json
Content-length: 183

{
  "@odata.type": "#microsoft.graph.macOsVppAppAssignedLicense",
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
  "@odata.type": "#microsoft.graph.macOsVppAppAssignedLicense",
  "id": "789a38a3-38a3-789a-a338-9a78a3389a78",
  "userEmailAddress": "String",
  "userId": "String",
  "userName": "String",
  "userPrincipalName": "String"
}
```


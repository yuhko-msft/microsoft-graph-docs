---
title: "Add oAuth2PermissionGrant"
description: "Add oauth2PermissionGrants by posting to the oauth2PermissionGrants collection."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Add oAuth2PermissionGrant
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Add oauth2PermissionGrants by posting to the oauth2PermissionGrants collection.

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
POST /me/oauth2PermissionGrants/$ref
POST /users/{usersId}/oauth2PermissionGrants/$ref
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [oAuth2PermissionGrant](../resources/oauth2permissiongrant.md) object.

You can specify the following properties when creating an **oAuth2PermissionGrant**.

|Property|Type|Description|
|:---|:---|:---|
|clientId|String|**TODO: Add Description** Required.|
|consentType|String|**TODO: Add Description** Optional.|
|principalId|String|**TODO: Add Description** Optional.|
|resourceId|String|**TODO: Add Description** Required.|
|scope|String|**TODO: Add Description** Optional.|



## Response

If successful, this method returns a `204 No Content` response code and an [oAuth2PermissionGrant](../resources/oauth2permissiongrant.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_oauth2permissiongrant_from_oauth2permissiongrants"
}
-->
``` http
POST https://graph.microsoft.com/beta/me/oauth2PermissionGrants/$ref
Content-Type: application/json
Content-length: 205

{
  "@odata.type": "#Microsoft.DirectoryServices.oAuth2PermissionGrant",
  "clientId": "String",
  "consentType": "String",
  "principalId": "String",
  "resourceId": "String",
  "scope": "String"
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Microsoft.DirectoryServices.oAuth2PermissionGrant"
}
-->
``` http
HTTP/1.1 204 No Content
Content-Type: application/json

{
  "@odata.type": "#Microsoft.DirectoryServices.oAuth2PermissionGrant",
  "clientId": "String",
  "consentType": "String",
  "id": "823276bf-76bf-8232-bf76-3282bf763282",
  "principalId": "String",
  "resourceId": "String",
  "scope": "String"
}
```


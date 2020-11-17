---
title: "Update userScopeTeamsAppInstallation"
description: "Update the properties of a userScopeTeamsAppInstallation object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update userScopeTeamsAppInstallation
Namespace: microsoft.graph

Update the properties of a [userScopeTeamsAppInstallation](../resources/userscopeteamsappinstallation.md) object.

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
PATCH /users/{usersId}/teamwork/installedApps/{userScopeTeamsAppInstallationId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [userScopeTeamsAppInstallation](../resources/userscopeteamsappinstallation.md) object.

The following table shows the properties that are required when you create the [userScopeTeamsAppInstallation](../resources/userscopeteamsappinstallation.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [teamsAppInstallation](../resources/teamsappinstallation.md)|
|grantedResourceSpecificApplicationPermissions|String collection|**TODO: Add Description** Inherited from [teamsAppInstallation](../resources/teamsappinstallation.md)|



## Response

If successful, this method returns a `200 OK` response code and an updated [userScopeTeamsAppInstallation](../resources/userscopeteamsappinstallation.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_userscopeteamsappinstallation"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/users/{usersId}/teamwork/installedApps/{userScopeTeamsAppInstallationId}
Content-Type: application/json
Content-length: 145

{
  "@odata.type": "#microsoft.graph.userScopeTeamsAppInstallation",
  "grantedResourceSpecificApplicationPermissions": [
    "String"
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
HTTP/1.1 200 OK

Content-Type: application/json
{
  "@odata.type": "#microsoft.graph.userScopeTeamsAppInstallation",
  "id": "9c7be941-e941-9c7b-41e9-7b9c41e97b9c",
  "grantedResourceSpecificApplicationPermissions": [
    "String"
  ]
}
```


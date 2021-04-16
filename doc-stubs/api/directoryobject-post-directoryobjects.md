---
title: "Create directoryObject"
description: "Create a new directoryObject object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create directoryObject
Namespace: microsoft.graph



Create a new [directoryObject](../resources/directoryobject.md) object.

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
POST /me/memberOf
POST /me/ownedDevices
POST /me/ownedObjects
POST /directoryObjects
POST /me/directReports
POST /me/createdObjects
POST /stsPolicy/appliesTo
POST /me/registeredDevices
POST /me/transitiveReports
POST /me/transitiveMemberOf
POST /directory/deletedItems
POST /groups/{groupsId}/owners
POST /users/{usersId}/memberOf
POST /groups/{groupsId}/members
POST /groups/{groupsId}/memberOf
POST /users/{usersId}/ownedDevices
POST /users/{usersId}/ownedObjects
POST /users/{usersId}/directReports
POST /users/{usersId}/createdObjects
POST /groups/{groupsId}/acceptedSenders
POST /groups/{groupsId}/rejectedSenders
POST /users/{usersId}/registeredDevices
POST /users/{usersId}/transitiveReports
POST /users/{usersId}/transitiveMemberOf
POST /groups/{groupsId}/transitiveMembers
POST /groups/{groupsId}/transitiveMemberOf
POST /domains/{domainsId}/domainNameReferences
POST /directoryRoles/{directoryRolesId}/members
POST /groups/{groupsId}/membersWithLicenseErrors
POST /servicePrincipals/{servicePrincipalsId}/owners
POST /servicePrincipals/{servicePrincipalsId}/memberOf
POST /servicePrincipals/{servicePrincipalsId}/policies
POST /servicePrincipals/{servicePrincipalsId}/ownedObjects
POST /servicePrincipals/{servicePrincipalsId}/createdObjects
POST /servicePrincipals/{servicePrincipalsId}/transitiveMemberOf
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [directoryObject](../resources/directoryobject.md) object.

The following table shows the properties that are required when you create the [directoryObject](../resources/directoryobject.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|deletedDateTime|DateTimeOffset|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and a [directoryObject](../resources/directoryobject.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_directoryobject_from_directoryobjects"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/me/memberOf
Content-Type: application/json
Content-length: 101

{
  "@odata.type": "#microsoft.graph.directoryObject",
  "deletedDateTime": "String (timestamp)"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.directoryObject"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.directoryObject",
  "id": "8f7e2d7a-2d7a-8f7e-7a2d-7e8f7a2d7e8f",
  "deletedDateTime": "String (timestamp)"
}
```


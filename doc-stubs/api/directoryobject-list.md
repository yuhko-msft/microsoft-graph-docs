---
title: "List directoryObjects"
description: "Get a list of the directoryObject objects and their properties."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List directoryObjects
Namespace: microsoft.graph



Get a list of the [directoryObject](../resources/directoryobject.md) objects and their properties.

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
GET /me/memberOf
GET /me/ownedDevices
GET /me/ownedObjects
GET /directoryObjects
GET /me/directReports
GET /me/createdObjects
GET /stsPolicy/appliesTo
GET /me/registeredDevices
GET /me/transitiveReports
GET /me/transitiveMemberOf
GET /directory/deletedItems
GET /groups/{groupsId}/owners
GET /users/{usersId}/memberOf
GET /groups/{groupsId}/members
GET /groups/{groupsId}/memberOf
GET /users/{usersId}/ownedDevices
GET /users/{usersId}/ownedObjects
GET /users/{usersId}/directReports
GET /users/{usersId}/createdObjects
GET /groups/{groupsId}/acceptedSenders
GET /groups/{groupsId}/rejectedSenders
GET /users/{usersId}/registeredDevices
GET /users/{usersId}/transitiveReports
GET /users/{usersId}/transitiveMemberOf
GET /groups/{groupsId}/transitiveMembers
GET /groups/{groupsId}/transitiveMemberOf
GET /domains/{domainsId}/domainNameReferences
GET /directoryRoles/{directoryRolesId}/members
GET /groups/{groupsId}/membersWithLicenseErrors
GET /servicePrincipals/{servicePrincipalsId}/owners
GET /servicePrincipals/{servicePrincipalsId}/memberOf
GET /servicePrincipals/{servicePrincipalsId}/policies
GET /servicePrincipals/{servicePrincipalsId}/ownedObjects
GET /servicePrincipals/{servicePrincipalsId}/createdObjects
GET /servicePrincipals/{servicePrincipalsId}/transitiveMemberOf
```

## Optional query parameters
This method supports some of the OData query parameters to help customize the response. For general information, see [OData query parameters](/graph/query-parameters).

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|

## Request body
Do not supply a request body for this method.

## Response

If successful, this method returns a `200 OK` response code and a collection of [directoryObject](../resources/directoryobject.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "list_directoryobject"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/me/memberOf
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.directoryObject)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
    {
      "@odata.type": "#microsoft.graph.directoryObject",
      "id": "8f7e2d7a-2d7a-8f7e-7a2d-7e8f7a2d7e8f",
      "deletedDateTime": "String (timestamp)"
    }
  ]
}
```


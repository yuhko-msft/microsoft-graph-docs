---
title: "directoryObject: getUserOwnedObjects"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# directoryObject: getUserOwnedObjects
Namespace: microsoft.graph



**TODO: Add Description**

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
POST /me/memberOf/getUserOwnedObjects
POST /me/ownedDevices/getUserOwnedObjects
POST /me/ownedObjects/getUserOwnedObjects
POST /directoryObjects/getUserOwnedObjects
POST /me/directReports/getUserOwnedObjects
POST /me/createdObjects/getUserOwnedObjects
POST /stsPolicy/appliesTo/getUserOwnedObjects
POST /me/registeredDevices/getUserOwnedObjects
POST /me/transitiveReports/getUserOwnedObjects
POST /me/transitiveMemberOf/getUserOwnedObjects
POST /directory/deletedItems/getUserOwnedObjects
POST /groups/{groupsId}/owners/getUserOwnedObjects
POST /users/{usersId}/memberOf/getUserOwnedObjects
POST /groups/{groupsId}/members/getUserOwnedObjects
POST /groups/{groupsId}/memberOf/getUserOwnedObjects
POST /users/{usersId}/ownedDevices/getUserOwnedObjects
POST /users/{usersId}/ownedObjects/getUserOwnedObjects
POST /users/{usersId}/directReports/getUserOwnedObjects
POST /users/{usersId}/createdObjects/getUserOwnedObjects
POST /groups/{groupsId}/acceptedSenders/getUserOwnedObjects
POST /groups/{groupsId}/rejectedSenders/getUserOwnedObjects
POST /users/{usersId}/registeredDevices/getUserOwnedObjects
POST /users/{usersId}/transitiveReports/getUserOwnedObjects
POST /users/{usersId}/transitiveMemberOf/getUserOwnedObjects
POST /groups/{groupsId}/transitiveMembers/getUserOwnedObjects
POST /groups/{groupsId}/transitiveMemberOf/getUserOwnedObjects
POST /domains/{domainsId}/domainNameReferences/getUserOwnedObjects
POST /directoryRoles/{directoryRolesId}/members/getUserOwnedObjects
POST /groups/{groupsId}/membersWithLicenseErrors/getUserOwnedObjects
POST /servicePrincipals/{servicePrincipalsId}/owners/getUserOwnedObjects
POST /servicePrincipals/{servicePrincipalsId}/memberOf/getUserOwnedObjects
POST /servicePrincipals/{servicePrincipalsId}/policies/getUserOwnedObjects
POST /servicePrincipals/{servicePrincipalsId}/ownedObjects/getUserOwnedObjects
POST /servicePrincipals/{servicePrincipalsId}/createdObjects/getUserOwnedObjects
POST /servicePrincipals/{servicePrincipalsId}/transitiveMemberOf/getUserOwnedObjects
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply JSON representation of the parameters.

The following table shows the parameters that can be used with this action.

|Parameter|Type|Description|
|:---|:---|:---|
|userId|String|**TODO: Add Description**|
|type|String|**TODO: Add Description**|



## Response

If successful, this action returns a `200 OK` response code and a [directoryObject](../resources/directoryobject.md) in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "directoryobject_getuserownedobjects"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/me/memberOf/getUserOwnedObjects

Content-Type: application/json
Content-length: 47

{
  "userId": "String",
  "type": "String"
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
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.directoryObject",
    "id": "String (identifier)",
    "deletedDateTime": "String (timestamp)"
  }
}
```


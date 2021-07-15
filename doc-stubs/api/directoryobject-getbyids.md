---
title: "directoryObject: getByIds"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# directoryObject: getByIds
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

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
POST /directoryObjects/getByIds
POST /stsPolicy/appliesTo/getByIds
POST /directory/deletedItems/getByIds
POST /groups/{groupsId}/owners/getByIds
POST /groups/{groupsId}/members/getByIds
POST /groups/{groupsId}/memberOf/getByIds
POST /groups/{groupsId}/acceptedSenders/getByIds
POST /groups/{groupsId}/rejectedSenders/getByIds
POST /groups/{groupsId}/transitiveMembers/getByIds
POST /groups/{groupsId}/transitiveMemberOf/getByIds
POST /domains/{domainsId}/domainNameReferences/getByIds
POST /directoryRoles/{directoryRolesId}/members/getByIds
POST /groups/{groupsId}/membersWithLicenseErrors/getByIds
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
|ids|String collection|**TODO: Add Description**|
|types|String collection|**TODO: Add Description**|



## Response

If successful, this action returns a `200 OK` response code and a [directoryObject](../resources/directoryobject.md) collection in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "directoryobject_getbyids"
}
-->
``` http
POST https://graph.microsoft.com/beta/directoryObjects/getByIds
Content-Type: application/json
Content-length: 69

{
  "ids": [
    "String"
  ],
  "types": [
    "String"
  ]
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
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
      "id": "String (identifier)",
      "deletedDateTime": "String (timestamp)"
    }
  ]
}
```


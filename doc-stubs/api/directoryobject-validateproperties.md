---
title: "directoryObject: validateProperties"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# directoryObject: validateProperties
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
POST /directoryObjects/validateProperties
POST /stsPolicy/appliesTo/validateProperties
POST /directory/deletedItems/validateProperties
POST /groups/{groupsId}/owners/validateProperties
POST /groups/{groupsId}/members/validateProperties
POST /groups/{groupsId}/memberOf/validateProperties
POST /groups/{groupsId}/acceptedSenders/validateProperties
POST /groups/{groupsId}/rejectedSenders/validateProperties
POST /groups/{groupsId}/transitiveMembers/validateProperties
POST /groups/{groupsId}/transitiveMemberOf/validateProperties
POST /domains/{domainsId}/domainNameReferences/validateProperties
POST /directoryRoles/{directoryRolesId}/members/validateProperties
POST /groups/{groupsId}/membersWithLicenseErrors/validateProperties
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
|entityType|String|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|mailNickname|String|**TODO: Add Description**|
|onBehalfOfUserId|Guid|**TODO: Add Description**|



## Response

If successful, this action returns a `204 No Content` response code.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "directoryobject_validateproperties"
}
-->
``` http
POST https://graph.microsoft.com/beta/directoryObjects/validateProperties
Content-Type: application/json
Content-length: 118

{
  "entityType": "String",
  "displayName": "String",
  "mailNickname": "String",
  "onBehalfOfUserId": "Guid"
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true
}
-->
``` http
HTTP/1.1 204 No Content
```


---
title: "Create resourceSpecificPermissionGrant"
description: "Create a new resourceSpecificPermissionGrant object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create resourceSpecificPermissionGrant
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new [resourceSpecificPermissionGrant](../resources/resourcespecificpermissiongrant.md) object.

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
POST /onlineMeeting/permissionGrants
POST /chats/{chatsId}/permissionGrants
POST /teams/{teamsId}/permissionGrants
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [resourceSpecificPermissionGrant](../resources/resourcespecificpermissiongrant.md) object.

You can specify the following properties when creating a **resourceSpecificPermissionGrant**.

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [directoryObject](../resources/directoryobject.md). Required.|



## Response

If successful, this method returns a `201 Created` response code and a [resourceSpecificPermissionGrant](../resources/resourcespecificpermissiongrant.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_resourcespecificpermissiongrant_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/onlineMeeting/permissionGrants
Content-Type: application/json
Content-length: 82

{
  "@odata.type": "#Microsoft.Teams.GraphSvc.resourceSpecificPermissionGrant"
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Microsoft.Teams.GraphSvc.resourceSpecificPermissionGrant"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#Microsoft.Teams.GraphSvc.resourceSpecificPermissionGrant",
  "id": "36dc0f9f-0f9f-36dc-9f0f-dc369f0fdc36"
}
```


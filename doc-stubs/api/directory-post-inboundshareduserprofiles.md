---
title: "Create inboundSharedUserProfile"
description: "Create a new inboundSharedUserProfile object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create inboundSharedUserProfile
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new [inboundSharedUserProfile](../resources/inboundshareduserprofile.md) object.

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
POST /directory/inboundSharedUserProfiles
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [inboundSharedUserProfile](../resources/inboundshareduserprofile.md) object.

You can specify the following properties when creating an **inboundSharedUserProfile**.

|Property|Type|Description|
|:---|:---|:---|
|deletedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [directoryObject](../resources/directoryobject.md). Optional.|
|userId|String|**TODO: Add Description** Required.|
|userPrincipalName|String|**TODO: Add Description** Required.|
|displayName|String|**TODO: Add Description** Required.|
|homeTenantId|String|**TODO: Add Description** Required.|



## Response

If successful, this method returns a `201 Created` response code and an [inboundSharedUserProfile](../resources/inboundshareduserprofile.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_inboundshareduserprofile_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/directory/inboundSharedUserProfiles
Content-Type: application/json
Content-length: 236

{
  "@odata.type": "#Microsoft.DirectoryServices.inboundSharedUserProfile",
  "deletedDateTime": "String (timestamp)",
  "userId": "String",
  "userPrincipalName": "String",
  "displayName": "String",
  "homeTenantId": "String"
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Microsoft.DirectoryServices.inboundSharedUserProfile"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#Microsoft.DirectoryServices.inboundSharedUserProfile",
  "id": "51ed5f15-5f15-51ed-155f-ed51155fed51",
  "deletedDateTime": "String (timestamp)",
  "userId": "String",
  "userPrincipalName": "String",
  "displayName": "String",
  "homeTenantId": "String"
}
```


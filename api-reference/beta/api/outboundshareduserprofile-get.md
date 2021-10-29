---
title: "Get outboundSharedUserProfile"
description: "Read the properties and relationships of a outboundSharedUserProfile object."
author: "adimitui"
ms.localizationpriority: medium
ms.prod: "directory-management"
doc_type: apiPageType
---

# Get outboundSharedUserProfile
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Read the properties and relationships of a [outboundSharedUserProfile](../resources/outboundSharedUserProfile.md) object.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from least to most privileged)|
|:---|:---|
|Delegated (work or school account)|CrossTenantUserProfileSharing.Read, CrossTenantUserProfileSharing.Read.All|
|Delegated (personal Microsoft account)|Not supported.|
|Application|Not supported.|

## HTTP request

<!-- {
  "blockType": "ignored"
}
-->
``` http
GET /directory/outboundSharedUserProfile/{userId}
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

If successful, this method returns a `200 OK` response code and a [outboundSharedUserProfile](../resources/outboundSharedUserProfile.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_tenantreference"
}
-->
``` http
GET https://graph.microsoft.com/beta/directory/outboundSharedUserProfile/c228b2ae-c4fb-4eda-9620-7e73dddd1cac
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Microsoft.DirectoryServices.tenantReference"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#Microsoft.DirectoryServices.userProfileSharedWithExternalTenant",
    "id":"ZAMkAAIAAAoZDOFAAA=",
    "userId":"c228b2ae-c4fb-4eda-9620-7e73dddd1cac",
    "userPrincipalName":"Bob@contoso.onmicrosoft.com",
    "displayName":"Bob",
    "externalTenantId":"62bfb458-9474-4c44-896b-b30942d055f0"
  }
}
```


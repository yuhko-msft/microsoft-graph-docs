---
title: "exportPersonalData (inboundSharedUserProfile)"
description: "Creates a request to export all personal data associated with an inbound shared user. If approved, the external user's personal data will be exported from the resource tenant."
author: "adimitui"
ms.localizationpriority: medium
ms.prod: "directory-management"
doc_type: apiPageType
---

# exportPersonalData (inboundSharedUserProfile)
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Creates a request to export all personal data associated with an inbound shared user. If approved, the external user's personal data will be exported from the resource tenant.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from least to most privileged)|
|:---|:---|
|Delegated (work or school account)|CrossTenantUserProfileSharing.Read.All|
|Delegated (personal Microsoft account)|Not supported.|
|Application|Not supported.|

## HTTP request

<!-- {
  "blockType": "ignored"
}
-->
``` http
POST /directory/inboundSharedUserProfiles/{inboundSharedUserProfileId}/exportPersonalData
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
Do not supply a request body for this method.

Note that resource tenant ID is inferred from the caller identity.

## Response

If successful, this method returns a `202 Accepted` response code.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_inboundshareduserprofile"
}
-->
``` http
POST https://graph.microsoft.com/beta/directory/inboundSharedUserProfiles/c228b2ae-c4fb-4eda-9620-7e73dddd1cac/exportPersonalData
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true
}
-->
``` http
HTTP/1.1 202 Accepted
{
  Location: https://graph.microsoft.com/v1.0/dataPolicyOperations/d007e3da-cd9b-4b02-8d66-422403c53e3f
  Retry-After: 60
}
```
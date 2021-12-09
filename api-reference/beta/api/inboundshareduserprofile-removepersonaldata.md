---
title: "removePersonalData (inboundSharedUserProfile)"
description: "Creates a request to remove all personal data associated with an inbound shared user. If approved, the external user's personal data will be removed from the resource tenant (the tenant from which this API was invoked)."
author: "adimitui"
ms.localizationpriority: medium
ms.prod: "directory-management"
doc_type: apiPageType
---

# removePersonalData (inboundSharedUserProfile)
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Creates a request to remove all personal data associated with an inbound shared user. If approved, the external user's personal data will be removed from the resource tenant (the tenant from which this API was invoked).

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from least to most privileged)|
|:---|:---|
|Delegated (work or school account)|CrossTenantUserProfileSharing.ReadWrite.All|
|Delegated (personal Microsoft account)|Not supported.|
|Application|Not supported.|

## HTTP request

<!-- {
  "blockType": "ignored"
}
-->
``` http
POST /directory/inboundSharedUserProfiles/{inboundSharedUserProfileId}/removePersonalData
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

If successful, this method returns a `204 No Content` response code.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_inboundshareduserprofile"
}
-->
``` http
POST https://graph.microsoft.com/beta/directory/inboundSharedUserProfiles/c228b2ae-c4fb-4eda-9620-7e73dddd1cac/removePersonalData
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


---
title: "Create settings"
description: "Create a new settings object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create settings
Namespace: microsoft.graph.admin

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new settings object.

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
POST /admin/sharepoint/settings
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [settings](../resources/admin-settings.md) object.

The following table shows the properties that are required when you create the [settings](../resources/admin-settings.md).

|Property|Type|Description|
|:---|:---|:---|
|isSitePagesEnabled|Boolean|**TODO: Add Description**|
|isFluidEnabled|Boolean|**TODO: Add Description**|
|isCommentsOnSitePagesEnabled|Boolean|**TODO: Add Description**|
|isSharePointNewsfeedEnabled|Boolean|**TODO: Add Description**|
|sharingCapability|sharingCapabilities|**TODO: Add Description**. Possible values are: `disabled`, `externalUserSharingOnly`, `externalUserAndGuestSharing`, `existingExternalUserSharingOnly`.|



## Response

If successful, this method returns a `201 Created` response code and a [settings](../resources/admin-settings.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_settings_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/admin/sharepoint/settings
Content-Type: application/json
Content-length: 249

{
  "@odata.type": "#microsoft.graph.admin.settings",
  "isSitePagesEnabled": "Boolean",
  "isFluidEnabled": "Boolean",
  "isCommentsOnSitePagesEnabled": "Boolean",
  "isSharePointNewsfeedEnabled": "Boolean",
  "sharingCapability": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.admin.settings"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.admin.settings",
  "isSitePagesEnabled": "Boolean",
  "isFluidEnabled": "Boolean",
  "isCommentsOnSitePagesEnabled": "Boolean",
  "isSharePointNewsfeedEnabled": "Boolean",
  "sharingCapability": "String"
}
```


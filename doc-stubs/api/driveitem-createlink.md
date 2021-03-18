---
title: "driveItem: createLink"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# driveItem: createLink
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
POST /drive/root/createLink
POST /drives/{drivesId}/root/createLink
POST /shares/{sharesId}/root/createLink
POST /drive/items/{driveItemId}/createLink
POST /shares/{sharesId}/driveItem/createLink
POST /drive/special/{driveItemId}/createLink
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
|type|String|**TODO: Add Description**|
|scope|String|**TODO: Add Description**|



## Response

If successful, this action returns a `200 OK` response code and a [permission](../resources/permission.md) in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "driveitem_createlink"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/drive/root/createLink

Content-Type: application/json
Content-length: 46

{
  "type": "String",
  "scope": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.permission"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.permission",
    "id": "String (identifier)",
    "grantedTo": {
      "@odata.type": "microsoft.graph.identitySet"
    },
    "inheritedFrom": {
      "@odata.type": "microsoft.graph.itemReference"
    },
    "invitation": {
      "@odata.type": "microsoft.graph.sharingInvitation"
    },
    "link": {
      "@odata.type": "microsoft.graph.sharingLink"
    },
    "roles": [
      "String"
    ],
    "shareId": "String"
  }
}
```


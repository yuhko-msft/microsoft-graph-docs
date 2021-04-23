---
title: "Create sharepoint"
description: "Create a new sharepoint object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create sharepoint
Namespace: microsoft.graph.admin

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new sharepoint object.

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
POST /admin/sharepoint
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [sharepoint](../resources/admin-sharepoint.md) object.

The following table shows the properties that are required when you create the [sharepoint](../resources/admin-sharepoint.md).

|Property|Type|Description|
|:---|:---|:---|



## Response

If successful, this method returns a `201 Created` response code and a [sharepoint](../resources/admin-sharepoint.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_sharepoint_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/admin/sharepoint
Content-Type: application/json
Content-length: 58

{
  "@odata.type": "#microsoft.graph.admin.sharepoint"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.admin.sharepoint"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.admin.sharepoint"
}
```


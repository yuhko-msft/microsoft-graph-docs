---
title: "Update userFlowPageLayout"
description: "Update the properties of a userFlowPageLayout object."
author: "almars"
ms.localizationpriority: medium
ms.prod: "identity-and-sign-in"
doc_type: apiPageType
---

# Update userFlowPageLayout
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of a [userFlowPageLayout](../resources/userflowpagelayout.md) object.

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
PATCH /identity/b2cUserFlows/{b2cIdentityUserFlowId}/pageLayouts/{userFlowPageLayoutId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
[!INCLUDE [table-intro](../../includes/update-property-table-intro.md)]


|Property|Type|Description|
|:---|:---|:---|
|displayName|String|**TODO: Add Description** Optional.|
|isCustomPageUri|Boolean|**TODO: Add Description** Required.|
|pageUri|String|**TODO: Add Description** Optional.|
|version|String|**TODO: Add Description** Optional.|



## Response

If successful, this method returns a `200 OK` response code and an updated [userFlowPageLayout](../resources/userflowpagelayout.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_userflowpagelayout"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/identity/b2cUserFlows/{b2cIdentityUserFlowId}/pageLayouts/{userFlowPageLayoutId}
Content-Type: application/json
Content-length: 169

{
  "@odata.type": "#microsoft.graph.userFlowPageLayout",
  "displayName": "String",
  "isCustomPageUri": "Boolean",
  "pageUri": "String",
  "version": "String"
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
HTTP/1.1 200 OK
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.userFlowPageLayout",
  "id": "8073a745-debc-c577-dfc9-e5b451c6b227",
  "displayName": "String",
  "isCustomPageUri": "Boolean",
  "pageUri": "String",
  "version": "String"
}
```


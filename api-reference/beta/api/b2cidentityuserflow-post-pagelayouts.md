---
title: "Create userFlowPageLayout"
description: "Create a new userFlowPageLayout object."
author: "almars"
ms.localizationpriority: medium
ms.prod: "identity-and-sign-in"
doc_type: apiPageType
---

# Create userFlowPageLayout
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new [userFlowPageLayout](../resources/userflowpagelayout.md) object.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from least to most privileged)|
|:---|:---|
|Delegated (work or school account)|IdentityUserFlow.ReadWrite.All|
|Delegated (personal Microsoft account)|Not supported.|
|Application|IdentityUserFlow.ReadWrite.All|

## HTTP request

<!-- {
  "blockType": "ignored"
}
-->
``` http
POST /identity/b2cUserFlows/{b2cIdentityUserFlowId}/pageLayouts
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [userFlowPageLayout](../resources/userflowpagelayout.md) object.

You can specify the following properties when creating a **userFlowPageLayout**.

|Property|Type|Description|
|:---|:---|:---|
|displayName|String|Page name used to provide more description. Optional.|
|isCustomPageUri|Boolean|If the page has a custom page uri, for query purpose. Required.|
|pageUri|String|Location for the ".html" resource used to load the custom content, as show in [documentation](https://docs.microsoft.com/en-us/azure/active-directory-b2c/customize-ui-with-html?pivots=b2c-user-flow#4-update-the-user-flow). Optional.|
|version|String|Version of the page layout. Optional.|



## Response

If successful, this method returns a `201 Created` response code and a [userFlowPageLayout](../resources/userflowpagelayout.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_userflowpagelayout_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/identity/b2cUserFlows/{b2cIdentityUserFlowId}/pageLayouts
Content-Type: application/json
Content-length: 183

{
  "@odata.type": "#Microsoft.Cpim.Api.DataModels.userFlowPageLayout",
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
  "truncated": true,
  "@odata.type": "Microsoft.Cpim.Api.DataModels.userFlowPageLayout"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#Microsoft.Cpim.Api.DataModels.userFlowPageLayout",
  "id": "8073a745-debc-c577-dfc9-e5b451c6b227",
  "displayName": "String",
  "isCustomPageUri": "Boolean",
  "pageUri": "String",
  "version": "String"
}
```


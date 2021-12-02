---
title: "Create unifiedRbacResourceNamespace"
description: "Create a new unifiedRbacResourceNamespace object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create unifiedRbacResourceNamespace
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new [unifiedRbacResourceNamespace](../resources/unifiedrbacresourcenamespace.md) object.

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
POST /rbacApplication/resourceNamespaces
POST /rbacApplicationMultiple/resourceNamespaces
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [unifiedRbacResourceNamespace](../resources/unifiedrbacresourcenamespace.md) object.

You can specify the following properties when creating an **unifiedRbacResourceNamespace**.

|Property|Type|Description|
|:---|:---|:---|
|name|String|**TODO: Add Description** Required.|



## Response

If successful, this method returns a `201 Created` response code and an [unifiedRbacResourceNamespace](../resources/unifiedrbacresourcenamespace.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_unifiedrbacresourcenamespace_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/rbacApplication/resourceNamespaces
Content-Type: application/json
Content-length: 100

{
  "@odata.type": "#Microsoft.EnterpriseRbac.unifiedRbacResourceNamespace",
  "name": "String"
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Microsoft.EnterpriseRbac.unifiedRbacResourceNamespace"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#Microsoft.EnterpriseRbac.unifiedRbacResourceNamespace",
  "id": "0fa9bb39-bb39-0fa9-39bb-a90f39bba90f",
  "name": "String"
}
```


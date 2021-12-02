---
title: "Create unifiedRbacResourceAction"
description: "Create a new unifiedRbacResourceAction object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create unifiedRbacResourceAction
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new [unifiedRbacResourceAction](../resources/unifiedrbacresourceaction.md) object.

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
POST /rbacApplication/resourceNamespaces/{unifiedRbacResourceNamespaceId}/resourceActions
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [unifiedRbacResourceAction](../resources/unifiedrbacresourceaction.md) object.

You can specify the following properties when creating an **unifiedRbacResourceAction**.

|Property|Type|Description|
|:---|:---|:---|
|name|String|**TODO: Add Description** Required.|
|description|String|**TODO: Add Description** Optional.|
|actionVerb|String|**TODO: Add Description** Optional.|
|resourceScopeId|String|**TODO: Add Description** Optional.|
|isEnabledForCustomRole|Boolean|**TODO: Add Description** Optional.|



## Response

If successful, this method returns a `201 Created` response code and an [unifiedRbacResourceAction](../resources/unifiedrbacresourceaction.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_unifiedrbacresourceaction_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/rbacApplication/resourceNamespaces/{unifiedRbacResourceNamespaceId}/resourceActions
Content-Type: application/json
Content-length: 224

{
  "@odata.type": "#Microsoft.EnterpriseRbac.unifiedRbacResourceAction",
  "name": "String",
  "description": "String",
  "actionVerb": "String",
  "resourceScopeId": "String",
  "isEnabledForCustomRole": "Boolean"
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Microsoft.EnterpriseRbac.unifiedRbacResourceAction"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#Microsoft.EnterpriseRbac.unifiedRbacResourceAction",
  "id": "3146bafe-bafe-3146-feba-4631feba4631",
  "name": "String",
  "description": "String",
  "actionVerb": "String",
  "resourceScopeId": "String",
  "isEnabledForCustomRole": "Boolean"
}
```


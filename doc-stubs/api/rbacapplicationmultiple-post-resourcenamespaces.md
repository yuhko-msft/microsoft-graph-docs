---
title: "Create unifiedRbacResourceNamespace"
description: "Create a new unifiedRbacResourceNamespace object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create unifiedRbacResourceNamespace
Namespace: microsoft.graph



Create a new unifiedRbacResourceNamespace object.

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
POST /roleManagement/cloudPC/resourceNamespaces
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [unifiedRbacResourceNamespace](../resources/unifiedrbacresourcenamespace.md) object.

The following table shows the properties that are required when you create the [unifiedRbacResourceNamespace](../resources/unifiedrbacresourcenamespace.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|name|String|**TODO: Add Description**|



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
POST https://graph.microsoft.com/v1.0/roleManagement/cloudPC/resourceNamespaces
Content-Type: application/json
Content-length: 91

{
  "@odata.type": "#microsoft.graph.unifiedRbacResourceNamespace",
  "name": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.unifiedRbacResourceNamespace"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.unifiedRbacResourceNamespace",
  "id": "ea0686b5-86b5-ea06-b586-06eab58606ea",
  "name": "String"
}
```


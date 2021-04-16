---
title: "unifiedRbacResourceNamespace: importResourceActions"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# unifiedRbacResourceNamespace: importResourceActions
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
POST /roleManagement/cloudPC/resourceNamespaces/{unifiedRbacResourceNamespaceId}/importResourceActions
POST /roleManagement/directory/resourceNamespaces/{unifiedRbacResourceNamespaceId}/importResourceActions
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
|format|String|**TODO: Add Description**|
|value|String|**TODO: Add Description**|
|overwriteResourceNamespace|Boolean|**TODO: Add Description**|



## Response

If successful, this action returns a `200 OK` response code and a [unifiedRbacResourceNamespace](../resources/unifiedrbacresourcenamespace.md) in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "unifiedrbacresourcenamespace_importresourceactions"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/roleManagement/cloudPC/resourceNamespaces/{unifiedRbacResourceNamespaceId}/importResourceActions

Content-Type: application/json
Content-length: 92

{
  "format": "String",
  "value": "String",
  "overwriteResourceNamespace": "Boolean"
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
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.unifiedRbacResourceNamespace",
    "id": "String (identifier)",
    "name": "String"
  }
}
```


---
title: "Update unifiedRbacResourceScope"
description: "Update the properties of an unifiedRbacResourceScope object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update unifiedRbacResourceScope
Namespace: microsoft.graph



Update the properties of an [unifiedRbacResourceScope](../resources/unifiedrbacresourcescope.md) object.

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
PATCH /roleManagement/cloudPC/resourceNamespaces/{unifiedRbacResourceNamespaceId}/resourceActions/{unifiedRbacResourceActionId}/resourceScope
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [unifiedRbacResourceScope](../resources/unifiedrbacresourcescope.md) object.

The following table shows the properties that are required when you update the [unifiedRbacResourceScope](../resources/unifiedrbacresourcescope.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|displayName|String|**TODO: Add Description**|
|scope|String|**TODO: Add Description**|
|type|String|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [unifiedRbacResourceScope](../resources/unifiedrbacresourcescope.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_unifiedrbacresourcescope"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/roleManagement/cloudPC/resourceNamespaces/{unifiedRbacResourceNamespaceId}/resourceActions/{unifiedRbacResourceActionId}/resourceScope
Content-Type: application/json
Content-length: 137

{
  "@odata.type": "#microsoft.graph.unifiedRbacResourceScope",
  "displayName": "String",
  "scope": "String",
  "type": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.unifiedRbacResourceScope",
  "id": "b076dc6e-dc6e-b076-6edc-76b06edc76b0",
  "displayName": "String",
  "scope": "String",
  "type": "String"
}
```


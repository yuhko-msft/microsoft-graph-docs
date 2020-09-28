---
title: "Create resourceActions"
description: "Create a new unifiedRbacResourceAction object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create resourceActions
Namespace: microsoft.graph

Create a new unifiedRbacResourceAction object.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from most to least privileged)|
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
POST /roleManagement/directory/resourceNamespaces/{unifiedRbacResourceNamespaceId}/resourceActions
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [unifiedRbacResourceAction](../resources/unifiedrbacresourceaction.md) object.

The following table shows the properties that are required when you create the [unifiedRbacResourceAction](../resources/unifiedrbacresourceaction.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|name|String|**TODO: Add Description**|
|description|String|**TODO: Add Description**|
|actionVerb|String|**TODO: Add Description**|
|resourceScopeId|String|**TODO: Add Description**|



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
POST https://graph.microsoft.com/beta/roleManagement/directory/resourceNamespaces/{unifiedRbacResourceNamespaceId}/resourceActions
Content-Type: application/json
Content-length: 175

{
  "@odata.type": "#microsoft.graph.unifiedRbacResourceAction",
  "name": "String",
  "description": "String",
  "actionVerb": "String",
  "resourceScopeId": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.unifiedRbacResourceAction"
}
-->
``` http
HTTP/1.1 201 Created

Content-Type: application/json
{
  "@odata.type": "#microsoft.graph.unifiedRbacResourceAction",
  "id": "787c3b51-3b51-787c-513b-7c78513b7c78",
  "name": "String",
  "description": "String",
  "actionVerb": "String",
  "resourceScopeId": "String"
}
```


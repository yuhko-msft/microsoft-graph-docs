---
title: "Create roleScopeTag"
description: "Create a new roleScopeTag object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create roleScopeTag
Namespace: microsoft.graph



Create a new roleScopeTag object.

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
POST /deviceManagement/roleScopeTags
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [roleScopeTag](../resources/rolescopetag.md) object.

The following table shows the properties that are required when you create the [roleScopeTag](../resources/rolescopetag.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|description|String|Description of the Role Scope Tag.|
|displayName|String|The display or friendly name of the Role Scope Tag.|
|isBuiltIn|Boolean|Description of the Role Scope Tag.|



## Response

If successful, this method returns a `201 Created` response code and a [roleScopeTag](../resources/rolescopetag.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_rolescopetag_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/deviceManagement/roleScopeTags
Content-Type: application/json
Content-length: 137

{
  "@odata.type": "#microsoft.graph.roleScopeTag",
  "description": "String",
  "displayName": "String",
  "isBuiltIn": "Boolean"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.roleScopeTag"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.roleScopeTag",
  "id": "f78dc0dd-c0dd-f78d-ddc0-8df7ddc08df7",
  "description": "String",
  "displayName": "String",
  "isBuiltIn": "Boolean"
}
```


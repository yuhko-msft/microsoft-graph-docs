---
title: "Update roleScopeTag"
description: "Update the properties of a roleScopeTag object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update roleScopeTag
Namespace: microsoft.graph



Update the properties of a [roleScopeTag](../resources/rolescopetag.md) object.

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
PATCH /deviceManagement/roleScopeTags/{roleScopeTagId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [roleScopeTag](../resources/rolescopetag.md) object.

The following table shows the properties that are required when you update the [roleScopeTag](../resources/rolescopetag.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|description|String|Description of the Role Scope Tag.|
|displayName|String|The display or friendly name of the Role Scope Tag.|
|isBuiltIn|Boolean|Description of the Role Scope Tag.|



## Response

If successful, this method returns a `200 OK` response code and an updated [roleScopeTag](../resources/rolescopetag.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_rolescopetag"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/deviceManagement/roleScopeTags/{roleScopeTagId}
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
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.roleScopeTag",
  "id": "f78dc0dd-c0dd-f78d-ddc0-8df7ddc08df7",
  "description": "String",
  "displayName": "String",
  "isBuiltIn": "Boolean"
}
```


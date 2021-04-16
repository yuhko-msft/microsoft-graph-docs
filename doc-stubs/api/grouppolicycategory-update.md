---
title: "Update groupPolicyCategory"
description: "Update the properties of a groupPolicyCategory object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update groupPolicyCategory
Namespace: microsoft.graph



Update the properties of a [groupPolicyCategory](../resources/grouppolicycategory.md) object.

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
PATCH /deviceManagement/groupPolicyCategories/{groupPolicyCategoryId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [groupPolicyCategory](../resources/grouppolicycategory.md) object.

The following table shows the properties that are required when you update the [groupPolicyCategory](../resources/grouppolicycategory.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|displayName|String|The string id of the category's display name|
|isRoot|Boolean|Defines if the category is a root category|
|lastModifiedDateTime|DateTimeOffset|The date and time the entity was last modified.|



## Response

If successful, this method returns a `200 OK` response code and an updated [groupPolicyCategory](../resources/grouppolicycategory.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_grouppolicycategory"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/deviceManagement/groupPolicyCategories/{groupPolicyCategoryId}
Content-Type: application/json
Content-length: 113

{
  "@odata.type": "#microsoft.graph.groupPolicyCategory",
  "displayName": "String",
  "isRoot": "Boolean"
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
  "@odata.type": "#microsoft.graph.groupPolicyCategory",
  "id": "7aa8bc41-bc41-7aa8-41bc-a87a41bca87a",
  "displayName": "String",
  "isRoot": "Boolean",
  "lastModifiedDateTime": "String (timestamp)"
}
```


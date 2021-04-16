---
title: "Add groupPolicyCategory"
description: "Add children by posting to the children collection."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Add groupPolicyCategory
Namespace: microsoft.graph



Add children by posting to the children collection.

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
POST /deviceManagement/groupPolicyCategories/{groupPolicyCategoryId}/children/$ref
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [groupPolicyCategory](../resources/grouppolicycategory.md) object.

The following table shows the properties that are required when you create the [groupPolicyCategory](../resources/grouppolicycategory.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|displayName|String|The string id of the category's display name|
|isRoot|Boolean|Defines if the category is a root category|
|lastModifiedDateTime|DateTimeOffset|The date and time the entity was last modified.|



## Response

If successful, this method returns a `204 No Content` response code and a [groupPolicyCategory](../resources/grouppolicycategory.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_grouppolicycategory_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/deviceManagement/groupPolicyCategories/{groupPolicyCategoryId}/children/$ref
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
  "truncated": true,
  "@odata.type": "microsoft.graph.groupPolicyCategory"
}
-->
``` http
HTTP/1.1 204 No Content
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.groupPolicyCategory",
  "id": "7aa8bc41-bc41-7aa8-41bc-a87a41bca87a",
  "displayName": "String",
  "isRoot": "Boolean",
  "lastModifiedDateTime": "String (timestamp)"
}
```


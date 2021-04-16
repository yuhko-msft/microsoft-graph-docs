---
title: "Add managedEBookCategory"
description: "Add categories by posting to the categories collection."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Add managedEBookCategory
Namespace: microsoft.graph



Add categories by posting to the categories collection.

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
POST /deviceAppManagement/managedEBooks/{managedEBookId}/categories/$ref
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [managedEBookCategory](../resources/managedebookcategory.md) object.

The following table shows the properties that are required when you create the [managedEBookCategory](../resources/managedebookcategory.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|displayName|String|The name of the eBook category.|
|lastModifiedDateTime|DateTimeOffset|The date and time the ManagedEBookCategory was last modified.|



## Response

If successful, this method returns a `204 No Content` response code and a [managedEBookCategory](../resources/managedebookcategory.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_managedebookcategory_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/deviceAppManagement/managedEBooks/{managedEBookId}/categories/$ref
Content-Type: application/json
Content-length: 90

{
  "@odata.type": "#microsoft.graph.managedEBookCategory",
  "displayName": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.managedEBookCategory"
}
-->
``` http
HTTP/1.1 204 No Content
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.managedEBookCategory",
  "id": "be5340ac-40ac-be53-ac40-53beac4053be",
  "displayName": "String",
  "lastModifiedDateTime": "String (timestamp)"
}
```


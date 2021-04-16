---
title: "Create authenticationContextClassReference"
description: "Create a new authenticationContextClassReference object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create authenticationContextClassReference
Namespace: microsoft.graph



Create a new [authenticationContextClassReference](../resources/authenticationcontextclassreference.md) object.

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
POST /conditionalAccess/authenticationContextClassReferences
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [authenticationContextClassReference](../resources/authenticationcontextclassreference.md) object.

The following table shows the properties that are required when you create the [authenticationContextClassReference](../resources/authenticationcontextclassreference.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|description|String|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|isAvailable|Boolean|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and an [authenticationContextClassReference](../resources/authenticationcontextclassreference.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_authenticationcontextclassreference_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/conditionalAccess/authenticationContextClassReferences
Content-Type: application/json
Content-length: 162

{
  "@odata.type": "#microsoft.graph.authenticationContextClassReference",
  "description": "String",
  "displayName": "String",
  "isAvailable": "Boolean"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.authenticationContextClassReference"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.authenticationContextClassReference",
  "id": "38b4d34b-d34b-38b4-4bd3-b4384bd3b438",
  "description": "String",
  "displayName": "String",
  "isAvailable": "Boolean"
}
```


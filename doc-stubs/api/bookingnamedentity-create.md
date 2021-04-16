---
title: "Create bookingNamedEntity"
description: "Create a new bookingNamedEntity object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create bookingNamedEntity
Namespace: microsoft.graph



Create a new [bookingNamedEntity](../resources/bookingnamedentity.md) object.

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
POST ** Collection URI for microsoft.graph.bookingNamedEntity not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [bookingNamedEntity](../resources/bookingnamedentity.md) object.

The following table shows the properties that are required when you create the [bookingNamedEntity](../resources/bookingnamedentity.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|displayName|String|Display name of this entity.
The display name is suitable for human-readable interfaces.|



## Response

If successful, this method returns a `201 Created` response code and a [bookingNamedEntity](../resources/bookingnamedentity.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_bookingnamedentity_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0** Collection URI for microsoft.graph.bookingNamedEntity not found
Content-Type: application/json
Content-length: 88

{
  "@odata.type": "#microsoft.graph.bookingNamedEntity",
  "displayName": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.bookingNamedEntity"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.bookingNamedEntity",
  "id": "7fcadb94-db94-7fca-94db-ca7f94dbca7f",
  "displayName": "String"
}
```


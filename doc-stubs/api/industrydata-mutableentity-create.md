---
title: "Create mutableEntity"
description: "Create a new mutableEntity object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create mutableEntity
Namespace: microsoft.graph.industryData

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new [mutableEntity](../resources/industrydata-mutableentity.md) object.

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
POST ** Collection URI for microsoft.graph.industryData.mutableEntity not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [mutableEntity](../resources/industrydata-mutableentity.md) object.

The following table shows the properties that are required when you create the [mutableEntity](../resources/industrydata-mutableentity.md).

|Property|Type|Description|
|:---|:---|:---|
|eTag|String|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and a [mutableEntity](../resources/industrydata-mutableentity.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_mutableentity_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta** Collection URI for microsoft.graph.industryData.mutableEntity not found
Content-Type: application/json
Content-length: 89

{
  "@odata.type": "#microsoft.graph.industryData.mutableEntity",
  "eTag": "String"
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.industryData.mutableEntity"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.industryData.mutableEntity",
  "eTag": "String"
}
```


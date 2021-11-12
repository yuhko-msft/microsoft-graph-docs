---
title: "Update validateOperation"
description: "Update the properties of a validateOperation object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update validateOperation
Namespace: microsoft.graph.industryData

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of a [validateOperation](../resources/industrydata-validateoperation.md) object.

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
PATCH /validateOperation
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
[!INCLUDE [table-intro](../../includes/update-property-table-intro.md)]


|Property|Type|Description|
|:---|:---|:---|
|errors|** Unknown Type `microsoft.graph.publicError` ** collection|Set of errors discovered by validation. Required.|
|warnings|** Unknown Type `microsoft.graph.publicError` ** collection|Set of warnings discovered by validation. Required.|



## Response

If successful, this method returns a `200 OK` response code and an updated [validateOperation](../resources/industrydata-validateoperation.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_validateoperation"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/validateOperation
Content-Type: application/json
Content-length: 160

{
  "@odata.type": "#microsoft.graph.industryData.validateOperation",
  "errors": [
    "<Unknown None>"
  ],
  "warnings": [
    "<Unknown None>"
  ]
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.industryData.validateOperation",
  "errors": [
    "<Unknown None>"
  ],
  "warnings": [
    "<Unknown None>"
  ]
}
```

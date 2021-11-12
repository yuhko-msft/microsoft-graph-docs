---
title: "Update fileValidateOperation"
description: "Update the properties of a fileValidateOperation object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update fileValidateOperation
Namespace: microsoft.graph.industryData

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of a [fileValidateOperation](../resources/industrydata-filevalidateoperation.md) object.

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
PATCH /fileValidateOperation
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
|errors|** Unknown Type `microsoft.graph.publicError` ** collection|Set of errors discovered by validation. Inherited from [validateOperation](../resources/industrydata-validateoperation.md). Required.|
|warnings|** Unknown Type `microsoft.graph.publicError` ** collection|Set of warnings discovered by validation. Inherited from [validateOperation](../resources/industrydata-validateoperation.md). Required.|
|filesValidated|String collection|Set of files validated by the validate operation. Required.|



## Response

If successful, this method returns a `200 OK` response code and an updated [fileValidateOperation](../resources/industrydata-filevalidateoperation.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_filevalidateoperation"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/fileValidateOperation
Content-Type: application/json
Content-length: 207

{
  "@odata.type": "#microsoft.graph.industryData.fileValidateOperation",
  "errors": [
    "<Unknown None>"
  ],
  "warnings": [
    "<Unknown None>"
  ],
  "filesValidated": [
    "String"
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
  "@odata.type": "#microsoft.graph.industryData.fileValidateOperation",
  "errors": [
    "<Unknown None>"
  ],
  "warnings": [
    "<Unknown None>"
  ],
  "filesValidated": [
    "String"
  ]
}
```


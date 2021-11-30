---
title: "Get fileValidateOperation"
description: "Read the properties and relationships of a fileValidateOperation object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get fileValidateOperation
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Read the properties and relationships of a [fileValidateOperation](../resources/filevalidateoperation.md) object.

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
GET /fileValidateOperation
```

## Optional query parameters
This method supports some of the OData query parameters to help customize the response. For general information, see [OData query parameters](/graph/query-parameters).

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|

## Request body
Do not supply a request body for this method.

## Response

If successful, this method returns a `200 OK` response code and a [fileValidateOperation](../resources/filevalidateoperation.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_filevalidateoperation"
}
-->
``` http
GET https://graph.microsoft.com/beta/fileValidateOperation
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.industryData.fileValidateOperation"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.industryData.fileValidateOperation",
    "id": "9e5e3391-3391-9e5e-9133-5e9e91335e9e",
    "createdDateTime": "String (timestamp)",
    "lastActionDateTime": "String (timestamp)",
    "status": "String",
    "statusDetail": "String",
    "resourceLocation": "String",
    "errors": [
      {
        "@odata.type": "microsoft.graph.publicError"
      }
    ],
    "warnings": [
      {
        "@odata.type": "microsoft.graph.publicError"
      }
    ],
    "validatedFiles": [
      "String"
    ]
  }
}
```


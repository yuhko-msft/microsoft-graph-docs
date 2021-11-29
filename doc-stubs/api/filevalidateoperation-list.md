---
title: "List fileValidateOperations"
description: "Get a list of the fileValidateOperation objects and their properties."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List fileValidateOperations
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Get a list of the [fileValidateOperation](../resources/filevalidateoperation.md) objects and their properties.

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
GET ** Collection URI for microsoft.industryData.fileValidateOperation not found
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

If successful, this method returns a `200 OK` response code and a collection of [fileValidateOperation](../resources/filevalidateoperation.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "list_filevalidateoperation"
}
-->
``` http
GET https://graph.microsoft.com/beta** Collection URI for microsoft.industryData.fileValidateOperation not found
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.industryData.fileValidateOperation)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
    {
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
  ]
}
```


---
title: "Update fileValidateOperation"
description: "Update the properties of a fileValidateOperation object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update fileValidateOperation
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of a [fileValidateOperation](../resources/filevalidateoperation.md) object.

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
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [longRunningOperation](../resources/longrunningoperation.md). Optional.|
|lastActionDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [longRunningOperation](../resources/longrunningoperation.md). Optional.|
|status|longRunningOperationStatus|**TODO: Add Description** Inherited from [longRunningOperation](../resources/longrunningoperation.md). The possible values are: `notStarted`, `running`, `succeeded`, `failed`, `unknownFutureValue`. Optional.|
|statusDetail|String|**TODO: Add Description** Inherited from [longRunningOperation](../resources/longrunningoperation.md). Optional.|
|resourceLocation|String|**TODO: Add Description** Inherited from [longRunningOperation](../resources/longrunningoperation.md). Optional.|
|errors|[microsoft.industryData.publicError](../resources/publicerror.md) collection|Set of errors discovered by validation. Inherited from [validateOperation](../resources/validateoperation.md). Required.|
|warnings|[microsoft.industryData.publicError](../resources/publicerror.md) collection|Set of warnings discovered by validation. Inherited from [validateOperation](../resources/validateoperation.md). Required.|
|validatedFiles|String collection|**TODO: Add Description** Required.|



## Response

If successful, this method returns a `200 OK` response code and an updated [fileValidateOperation](../resources/filevalidateoperation.md) object in the response body.

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
Content-length: 414

{
  "@odata.type": "#microsoft.graph.fileValidateOperation",
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
  "@odata.type": "#microsoft.graph.fileValidateOperation",
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
```


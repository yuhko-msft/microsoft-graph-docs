---
title: "Update validateOperation"
description: "Update the properties of a validateOperation object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update validateOperation
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of a [validateOperation](../resources/validateoperation.md) object.

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
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [longRunningOperation](../resources/longrunningoperation.md). Optional.|
|lastActionDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [longRunningOperation](../resources/longrunningoperation.md). Optional.|
|status|longRunningOperationStatus|**TODO: Add Description** Inherited from [longRunningOperation](../resources/longrunningoperation.md). The possible values are: `notStarted`, `running`, `succeeded`, `failed`, `unknownFutureValue`. Optional.|
|statusDetail|String|**TODO: Add Description** Inherited from [longRunningOperation](../resources/longrunningoperation.md). Optional.|
|resourceLocation|String|**TODO: Add Description** Inherited from [longRunningOperation](../resources/longrunningoperation.md). Optional.|
|errors|[microsoft.industryData.publicError](../resources/publicerror.md) collection|**TODO: Add Description** Required.|
|warnings|[microsoft.industryData.publicError](../resources/publicerror.md) collection|**TODO: Add Description** Required.|



## Response

If successful, this method returns a `200 OK` response code and an updated [validateOperation](../resources/validateoperation.md) object in the response body.

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
Content-length: 367

{
  "@odata.type": "#microsoft.graph.validateOperation",
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
  "@odata.type": "#microsoft.graph.validateOperation",
  "id": "1d91d4c0-d4c0-1d91-c0d4-911dc0d4911d",
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
  ]
}
```


---
title: "Create workbookOperation"
description: "Create a new workbookOperation object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create workbookOperation
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new workbookOperation object.

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
POST /workbooks/{workbooksId}/workbook/operations
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [workbookOperation](../resources/workbookoperation.md) object.

The following table shows the properties that are required when you create the [workbookOperation](../resources/workbookoperation.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|error|[workbookOperationError](../resources/workbookoperationerror.md)|**TODO: Add Description**|
|resourceLocation|String|**TODO: Add Description**|
|status|workbookOperationStatus|**TODO: Add Description**. Possible values are: `notStarted`, `running`, `succeeded`, `failed`.|



## Response

If successful, this method returns a `201 Created` response code and a [workbookOperation](../resources/workbookoperation.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_workbookoperation_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/workbooks/{workbooksId}/workbook/operations
Content-Type: application/json
Content-length: 196

{
  "@odata.type": "#microsoft.graph.workbookOperation",
  "error": {
    "@odata.type": "microsoft.graph.workbookOperationError"
  },
  "resourceLocation": "String",
  "status": "String"
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.workbookOperation"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.workbookOperation",
  "id": "8f812e2c-2e2c-8f81-2c2e-818f2c2e818f",
  "error": {
    "@odata.type": "microsoft.graph.workbookOperationError"
  },
  "resourceLocation": "String",
  "status": "String"
}
```


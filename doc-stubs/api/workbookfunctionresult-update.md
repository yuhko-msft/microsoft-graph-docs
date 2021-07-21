---
title: "Update workbookFunctionResult"
description: "Update the properties of a workbookFunctionResult object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update workbookFunctionResult
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of a [workbookFunctionResult](../resources/workbookfunctionresult.md) object.

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
PATCH /workbookFunctionResult
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [workbookFunctionResult](../resources/workbookfunctionresult.md) object.

The following table shows the properties that are required when you update the [workbookFunctionResult](../resources/workbookfunctionresult.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|error|String|**TODO: Add Description**|
|value|[Json](../resources/json.md)|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [workbookFunctionResult](../resources/workbookfunctionresult.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_workbookfunctionresult"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/workbookFunctionResult
Content-Type: application/json
Content-length: 149

{
  "@odata.type": "#microsoft.graph.workbookFunctionResult",
  "error": "String",
  "value": {
    "@odata.type": "microsoft.graph.Json"
  }
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
  "@odata.type": "#microsoft.graph.workbookFunctionResult",
  "id": "e8c835e1-35e1-e8c8-e135-c8e8e135c8e8",
  "error": "String",
  "value": {
    "@odata.type": "microsoft.graph.Json"
  }
}
```


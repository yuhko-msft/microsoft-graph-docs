---
title: "Create workbookRangeFont"
description: "Create a new workbookRangeFont object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create workbookRangeFont
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new [workbookRangeFont](../resources/workbookrangefont.md) object.

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
POST ** Collection URI for microsoft.graph.workbookRangeFont not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [workbookRangeFont](../resources/workbookrangefont.md) object.

The following table shows the properties that are required when you create the [workbookRangeFont](../resources/workbookrangefont.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|bold|Boolean|**TODO: Add Description**|
|color|String|**TODO: Add Description**|
|italic|Boolean|**TODO: Add Description**|
|name|String|**TODO: Add Description**|
|size|Double|**TODO: Add Description**|
|underline|String|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and a [workbookRangeFont](../resources/workbookrangefont.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_workbookrangefont_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta** Collection URI for microsoft.graph.workbookRangeFont not found
Content-Type: application/json
Content-length: 195

{
  "@odata.type": "#microsoft.graph.workbookRangeFont",
  "bold": "Boolean",
  "color": "String",
  "italic": "Boolean",
  "name": "String",
  "size": "Double",
  "underline": "String"
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.workbookRangeFont"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.workbookRangeFont",
  "id": "3949931b-931b-3949-1b93-49391b934939",
  "bold": "Boolean",
  "color": "String",
  "italic": "Boolean",
  "name": "String",
  "size": "Double",
  "underline": "String"
}
```


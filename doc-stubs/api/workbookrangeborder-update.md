---
title: "Update workbookRangeBorder"
description: "Update the properties of a workbookRangeBorder object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update workbookRangeBorder
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of a [workbookRangeBorder](../resources/workbookrangeborder.md) object.

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
PATCH /workbookRange/format/borders/{workbookRangeBorderId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [workbookRangeBorder](../resources/workbookrangeborder.md) object.

The following table shows the properties that are required when you update the [workbookRangeBorder](../resources/workbookrangeborder.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|color|String|**TODO: Add Description**|
|sideIndex|String|**TODO: Add Description**|
|style|String|**TODO: Add Description**|
|weight|String|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [workbookRangeBorder](../resources/workbookrangeborder.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_workbookrangeborder"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/workbookRange/format/borders/{workbookRangeBorderId}
Content-Type: application/json
Content-length: 154

{
  "@odata.type": "#microsoft.graph.workbookRangeBorder",
  "color": "String",
  "sideIndex": "String",
  "style": "String",
  "weight": "String"
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
  "@odata.type": "#microsoft.graph.workbookRangeBorder",
  "id": "061b2285-2285-061b-8522-1b0685221b06",
  "color": "String",
  "sideIndex": "String",
  "style": "String",
  "weight": "String"
}
```


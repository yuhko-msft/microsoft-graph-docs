---
title: "Create lookupResultRow"
description: "Create a new lookupResultRow object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create lookupResultRow
Namespace: microsoft.graph



Create a new [lookupResultRow](../resources/lookupresultrow.md) object.

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
POST /exactMatchLookupJob/matchingRows
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [lookupResultRow](../resources/lookupresultrow.md) object.

The following table shows the properties that are required when you create the [lookupResultRow](../resources/lookupresultrow.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|row|String|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and a [lookupResultRow](../resources/lookupresultrow.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_lookupresultrow_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/exactMatchLookupJob/matchingRows
Content-Type: application/json
Content-length: 77

{
  "@odata.type": "#microsoft.graph.lookupResultRow",
  "row": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.lookupResultRow"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.lookupResultRow",
  "id": "b57dd80b-d80b-b57d-0bd8-7db50bd87db5",
  "row": "String"
}
```


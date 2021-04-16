---
title: "Update taxArea"
description: "Update the properties of a taxArea object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update taxArea
Namespace: microsoft.graph



Update the properties of a [taxArea](../resources/taxarea.md) object.

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
PATCH /financials/companies/{companyId}/taxAreas/{taxAreaId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [taxArea](../resources/taxarea.md) object.

The following table shows the properties that are required when you update the [taxArea](../resources/taxarea.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|code|String|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description**|
|taxType|String|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [taxArea](../resources/taxarea.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_taxarea"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/financials/companies/{companyId}/taxAreas/{taxAreaId}
Content-Type: application/json
Content-length: 122

{
  "@odata.type": "#microsoft.graph.taxArea",
  "code": "String",
  "displayName": "String",
  "taxType": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.taxArea",
  "id": "88f8f6f7-f6f7-88f8-f7f6-f888f7f6f888",
  "code": "String",
  "displayName": "String",
  "lastModifiedDateTime": "String (timestamp)",
  "taxType": "String"
}
```


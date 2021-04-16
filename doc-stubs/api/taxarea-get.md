---
title: "Get taxArea"
description: "Read the properties and relationships of a taxArea object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get taxArea
Namespace: microsoft.graph



Read the properties and relationships of a [taxArea](../resources/taxarea.md) object.

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
GET /financials/companies/{companyId}/taxAreas/{taxAreaId}
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

If successful, this method returns a `200 OK` response code and a [taxArea](../resources/taxarea.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_taxarea"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/financials/companies/{companyId}/taxAreas/{taxAreaId}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.taxArea"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.taxArea",
    "id": "88f8f6f7-f6f7-88f8-f7f6-f888f7f6f888",
    "code": "String",
    "displayName": "String",
    "lastModifiedDateTime": "String (timestamp)",
    "taxType": "String"
  }
}
```


---
title: "Get taxGroup"
description: "Read the properties and relationships of a taxGroup object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get taxGroup
Namespace: microsoft.graph



Read the properties and relationships of a [taxGroup](../resources/taxgroup.md) object.

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
GET /financials/companies/{companyId}/taxGroups/{taxGroupId}
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

If successful, this method returns a `200 OK` response code and a [taxGroup](../resources/taxgroup.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_taxgroup"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/financials/companies/{companyId}/taxGroups/{taxGroupId}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.taxGroup"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.taxGroup",
    "id": "6a8dbaef-baef-6a8d-efba-8d6aefba8d6a",
    "code": "String",
    "displayName": "String",
    "lastModifiedDateTime": "String (timestamp)",
    "taxType": "String"
  }
}
```


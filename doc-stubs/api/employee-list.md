---
title: "List employees"
description: "Get a list of the employee objects and their properties."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List employees
Namespace: microsoft.graph



Get a list of the [employee](../resources/employee.md) objects and their properties.

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
GET /financials/companies/{companyId}/employees
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

If successful, this method returns a `200 OK` response code and a collection of [employee](../resources/employee.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "list_employee"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/financials/companies/{companyId}/employees
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.employee)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
    {
      "@odata.type": "#microsoft.graph.employee",
      "id": "30082e85-2e85-3008-852e-0830852e0830",
      "address": {
        "@odata.type": "microsoft.graph.postalAddressType"
      },
      "birthDate": "Date",
      "displayName": "String",
      "email": "String",
      "employmentDate": "Date",
      "givenName": "String",
      "jobTitle": "String",
      "lastModifiedDateTime": "String (timestamp)",
      "middleName": "String",
      "mobilePhone": "String",
      "number": "String",
      "personalEmail": "String",
      "phoneNumber": "String",
      "statisticsGroupCode": "String",
      "status": "String",
      "surname": "String",
      "terminationDate": "Date"
    }
  ]
}
```


---
title: "Update employee"
description: "Update the properties of an employee object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update employee
Namespace: microsoft.graph



Update the properties of an [employee](../resources/employee.md) object.

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
PATCH /financials/companies/{companyId}/employees/{employeeId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [employee](../resources/employee.md) object.

The following table shows the properties that are required when you update the [employee](../resources/employee.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|address|[postalAddressType](../resources/postaladdresstype.md)|**TODO: Add Description**|
|birthDate|Date|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|email|String|**TODO: Add Description**|
|employmentDate|Date|**TODO: Add Description**|
|givenName|String|**TODO: Add Description**|
|jobTitle|String|**TODO: Add Description**|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description**|
|middleName|String|**TODO: Add Description**|
|mobilePhone|String|**TODO: Add Description**|
|number|String|**TODO: Add Description**|
|personalEmail|String|**TODO: Add Description**|
|phoneNumber|String|**TODO: Add Description**|
|statisticsGroupCode|String|**TODO: Add Description**|
|status|String|**TODO: Add Description**|
|surname|String|**TODO: Add Description**|
|terminationDate|Date|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [employee](../resources/employee.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_employee"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/financials/companies/{companyId}/employees/{employeeId}
Content-Type: application/json
Content-length: 531

{
  "@odata.type": "#microsoft.graph.employee",
  "address": {
    "@odata.type": "microsoft.graph.postalAddressType"
  },
  "birthDate": "Date",
  "displayName": "String",
  "email": "String",
  "employmentDate": "Date",
  "givenName": "String",
  "jobTitle": "String",
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
```


---
title: "Create companyInformation"
description: "Create a new companyInformation object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create companyInformation
Namespace: microsoft.graph



Create a new [companyInformation](../resources/companyinformation.md) object.

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
POST /financials/companies/{companyId}/companyInformation
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [companyInformation](../resources/companyinformation.md) object.

The following table shows the properties that are required when you create the [companyInformation](../resources/companyinformation.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|address|[postalAddressType](../resources/postaladdresstype.md)|**TODO: Add Description**|
|currencyCode|String|**TODO: Add Description**|
|currentFiscalYearStartDate|Date|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|email|String|**TODO: Add Description**|
|faxNumber|String|**TODO: Add Description**|
|industry|String|**TODO: Add Description**|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description**|
|phoneNumber|String|**TODO: Add Description**|
|picture|Stream|**TODO: Add Description**|
|taxRegistrationNumber|String|**TODO: Add Description**|
|website|String|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and a [companyInformation](../resources/companyinformation.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_companyinformation_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/financials/companies/{companyId}/companyInformation
Content-Type: application/json
Content-length: 423

{
  "@odata.type": "#microsoft.graph.companyInformation",
  "address": {
    "@odata.type": "microsoft.graph.postalAddressType"
  },
  "currencyCode": "String",
  "currentFiscalYearStartDate": "Date",
  "displayName": "String",
  "email": "String",
  "faxNumber": "String",
  "industry": "String",
  "phoneNumber": "String",
  "picture": "Stream",
  "taxRegistrationNumber": "String",
  "website": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.companyInformation"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.companyInformation",
  "id": "37c5f5cf-f5cf-37c5-cff5-c537cff5c537",
  "address": {
    "@odata.type": "microsoft.graph.postalAddressType"
  },
  "currencyCode": "String",
  "currentFiscalYearStartDate": "Date",
  "displayName": "String",
  "email": "String",
  "faxNumber": "String",
  "industry": "String",
  "lastModifiedDateTime": "String (timestamp)",
  "phoneNumber": "String",
  "picture": "Stream",
  "taxRegistrationNumber": "String",
  "website": "String"
}
```


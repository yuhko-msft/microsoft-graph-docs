---
title: "Update journalLine"
description: "Update the properties of a journalLine object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update journalLine
Namespace: microsoft.graph



Update the properties of a [journalLine](../resources/journalline.md) object.

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
PATCH /financials/companies/{companyId}/journalLines/{journalLineId}
PATCH /financials/companies/{companyId}/journals/{journalId}/journalLines/{journalLineId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [journalLine](../resources/journalline.md) object.

The following table shows the properties that are required when you update the [journalLine](../resources/journalline.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|accountId|Guid|**TODO: Add Description**|
|accountNumber|String|**TODO: Add Description**|
|amount|Decimal|**TODO: Add Description**|
|comment|String|**TODO: Add Description**|
|description|String|**TODO: Add Description**|
|documentNumber|String|**TODO: Add Description**|
|externalDocumentNumber|String|**TODO: Add Description**|
|journalDisplayName|String|**TODO: Add Description**|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description**|
|lineNumber|Int32|**TODO: Add Description**|
|postingDate|Date|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [journalLine](../resources/journalline.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_journalline"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/financials/companies/{companyId}/journalLines/{journalLineId}
Content-Type: application/json
Content-length: 342

{
  "@odata.type": "#microsoft.graph.journalLine",
  "accountId": "Guid",
  "accountNumber": "String",
  "amount": "Decimal",
  "comment": "String",
  "description": "String",
  "documentNumber": "String",
  "externalDocumentNumber": "String",
  "journalDisplayName": "String",
  "lineNumber": "Integer",
  "postingDate": "Date"
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
  "@odata.type": "#microsoft.graph.journalLine",
  "id": "5b14e786-e786-5b14-86e7-145b86e7145b",
  "accountId": "Guid",
  "accountNumber": "String",
  "amount": "Decimal",
  "comment": "String",
  "description": "String",
  "documentNumber": "String",
  "externalDocumentNumber": "String",
  "journalDisplayName": "String",
  "lastModifiedDateTime": "String (timestamp)",
  "lineNumber": "Integer",
  "postingDate": "Date"
}
```


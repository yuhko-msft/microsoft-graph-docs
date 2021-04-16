---
title: "Get office365ActiveUserDetail"
description: "Read the properties and relationships of an office365ActiveUserDetail object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get office365ActiveUserDetail
Namespace: microsoft.graph



Read the properties and relationships of an [office365ActiveUserDetail](../resources/office365activeuserdetail.md) object.

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
GET /office365ActiveUserDetail
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

If successful, this method returns a `200 OK` response code and an [office365ActiveUserDetail](../resources/office365activeuserdetail.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_office365activeuserdetail"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/office365ActiveUserDetail
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.office365ActiveUserDetail"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.office365ActiveUserDetail",
    "id": "34536f3c-6f3c-3453-3c6f-53343c6f5334",
    "assignedProducts": [
      "String"
    ],
    "deletedDate": "Date",
    "displayName": "String",
    "exchangeLastActivityDate": "Date",
    "exchangeLicenseAssignDate": "Date",
    "hasExchangeLicense": "Boolean",
    "hasOneDriveLicense": "Boolean",
    "hasSharePointLicense": "Boolean",
    "hasSkypeForBusinessLicense": "Boolean",
    "hasTeamsLicense": "Boolean",
    "hasYammerLicense": "Boolean",
    "isDeleted": "Boolean",
    "oneDriveLastActivityDate": "Date",
    "oneDriveLicenseAssignDate": "Date",
    "reportRefreshDate": "Date",
    "sharePointLastActivityDate": "Date",
    "sharePointLicenseAssignDate": "Date",
    "skypeForBusinessLastActivityDate": "Date",
    "skypeForBusinessLicenseAssignDate": "Date",
    "teamsLastActivityDate": "Date",
    "teamsLicenseAssignDate": "Date",
    "userPrincipalName": "String",
    "yammerLastActivityDate": "Date",
    "yammerLicenseAssignDate": "Date"
  }
}
```


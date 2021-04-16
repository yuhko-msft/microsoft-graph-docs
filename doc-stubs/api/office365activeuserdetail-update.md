---
title: "Update office365ActiveUserDetail"
description: "Update the properties of an office365ActiveUserDetail object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update office365ActiveUserDetail
Namespace: microsoft.graph



Update the properties of an [office365ActiveUserDetail](../resources/office365activeuserdetail.md) object.

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
PATCH /office365ActiveUserDetail
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [office365ActiveUserDetail](../resources/office365activeuserdetail.md) object.

The following table shows the properties that are required when you update the [office365ActiveUserDetail](../resources/office365activeuserdetail.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|assignedProducts|String collection|**TODO: Add Description**|
|deletedDate|Date|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|exchangeLastActivityDate|Date|**TODO: Add Description**|
|exchangeLicenseAssignDate|Date|**TODO: Add Description**|
|hasExchangeLicense|Boolean|**TODO: Add Description**|
|hasOneDriveLicense|Boolean|**TODO: Add Description**|
|hasSharePointLicense|Boolean|**TODO: Add Description**|
|hasSkypeForBusinessLicense|Boolean|**TODO: Add Description**|
|hasTeamsLicense|Boolean|**TODO: Add Description**|
|hasYammerLicense|Boolean|**TODO: Add Description**|
|isDeleted|Boolean|**TODO: Add Description**|
|oneDriveLastActivityDate|Date|**TODO: Add Description**|
|oneDriveLicenseAssignDate|Date|**TODO: Add Description**|
|reportRefreshDate|Date|**TODO: Add Description**|
|sharePointLastActivityDate|Date|**TODO: Add Description**|
|sharePointLicenseAssignDate|Date|**TODO: Add Description**|
|skypeForBusinessLastActivityDate|Date|**TODO: Add Description**|
|skypeForBusinessLicenseAssignDate|Date|**TODO: Add Description**|
|teamsLastActivityDate|Date|**TODO: Add Description**|
|teamsLicenseAssignDate|Date|**TODO: Add Description**|
|userPrincipalName|String|**TODO: Add Description**|
|yammerLastActivityDate|Date|**TODO: Add Description**|
|yammerLicenseAssignDate|Date|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [office365ActiveUserDetail](../resources/office365activeuserdetail.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_office365activeuserdetail"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/office365ActiveUserDetail
Content-Type: application/json
Content-length: 964

{
  "@odata.type": "#microsoft.graph.office365ActiveUserDetail",
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
```


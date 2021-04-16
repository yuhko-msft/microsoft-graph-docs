---
title: "Get sharePointSiteUsageDetail"
description: "Read the properties and relationships of a sharePointSiteUsageDetail object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get sharePointSiteUsageDetail
Namespace: microsoft.graph



Read the properties and relationships of a [sharePointSiteUsageDetail](../resources/sharepointsiteusagedetail.md) object.

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
GET /sharePointSiteUsageDetail
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

If successful, this method returns a `200 OK` response code and a [sharePointSiteUsageDetail](../resources/sharepointsiteusagedetail.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_sharepointsiteusagedetail"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/sharePointSiteUsageDetail
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.sharePointSiteUsageDetail"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.sharePointSiteUsageDetail",
    "id": "896b302f-302f-896b-2f30-6b892f306b89",
    "activeFileCount": "Integer",
    "anonymousLinkCount": "Integer",
    "companyLinkCount": "Integer",
    "externalSharing": "Boolean",
    "fileCount": "Integer",
    "geolocation": "String",
    "isDeleted": "Boolean",
    "lastActivityDate": "Date",
    "ownerDisplayName": "String",
    "ownerPrincipalName": "String",
    "pageViewCount": "Integer",
    "reportPeriod": "String",
    "reportRefreshDate": "Date",
    "rootWebTemplate": "String",
    "secureLinkForGuestCount": "Integer",
    "secureLinkForMemberCount": "Integer",
    "siteId": "Guid",
    "siteSensitivityLabelId": "String",
    "siteUrl": "String",
    "storageAllocatedInBytes": "Integer",
    "storageUsedInBytes": "Integer",
    "unmanagedDevicePolicy": "String",
    "visitedPageCount": "Integer"
  }
}
```


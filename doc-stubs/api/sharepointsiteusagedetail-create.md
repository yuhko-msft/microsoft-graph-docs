---
title: "Create sharePointSiteUsageDetail"
description: "Create a new sharePointSiteUsageDetail object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create sharePointSiteUsageDetail
Namespace: microsoft.graph



Create a new [sharePointSiteUsageDetail](../resources/sharepointsiteusagedetail.md) object.

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
POST ** Collection URI for microsoft.graph.sharePointSiteUsageDetail not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [sharePointSiteUsageDetail](../resources/sharepointsiteusagedetail.md) object.

The following table shows the properties that are required when you create the [sharePointSiteUsageDetail](../resources/sharepointsiteusagedetail.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|activeFileCount|Int64|**TODO: Add Description**|
|anonymousLinkCount|Int64|**TODO: Add Description**|
|companyLinkCount|Int64|**TODO: Add Description**|
|externalSharing|Boolean|**TODO: Add Description**|
|fileCount|Int64|**TODO: Add Description**|
|geolocation|String|**TODO: Add Description**|
|isDeleted|Boolean|**TODO: Add Description**|
|lastActivityDate|Date|**TODO: Add Description**|
|ownerDisplayName|String|**TODO: Add Description**|
|ownerPrincipalName|String|**TODO: Add Description**|
|pageViewCount|Int64|**TODO: Add Description**|
|reportPeriod|String|**TODO: Add Description**|
|reportRefreshDate|Date|**TODO: Add Description**|
|rootWebTemplate|String|**TODO: Add Description**|
|secureLinkForGuestCount|Int64|**TODO: Add Description**|
|secureLinkForMemberCount|Int64|**TODO: Add Description**|
|siteId|Guid|**TODO: Add Description**|
|siteSensitivityLabelId|String|**TODO: Add Description**|
|siteUrl|String|**TODO: Add Description**|
|storageAllocatedInBytes|Int64|**TODO: Add Description**|
|storageUsedInBytes|Int64|**TODO: Add Description**|
|unmanagedDevicePolicy|String|**TODO: Add Description**|
|visitedPageCount|Int64|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and a [sharePointSiteUsageDetail](../resources/sharepointsiteusagedetail.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_sharepointsiteusagedetail_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0** Collection URI for microsoft.graph.sharePointSiteUsageDetail not found
Content-Type: application/json
Content-length: 824

{
  "@odata.type": "#microsoft.graph.sharePointSiteUsageDetail",
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
HTTP/1.1 201 Created
Content-Type: application/json

{
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
```


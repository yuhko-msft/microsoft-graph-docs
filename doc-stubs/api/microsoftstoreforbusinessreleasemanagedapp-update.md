---
title: "Update microsoftStoreForBusinessReleaseManagedApp"
description: "Update the properties of a microsoftStoreForBusinessReleaseManagedApp object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update microsoftStoreForBusinessReleaseManagedApp
Namespace: microsoft.graph

Update the properties of a [microsoftStoreForBusinessReleaseManagedApp](../resources/microsoftstoreforbusinessreleasemanagedapp.md) object.

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
PATCH ** Entity URI for microsoft.graph.microsoftStoreForBusinessReleaseManagedApp not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [microsoftStoreForBusinessReleaseManagedApp](../resources/microsoftstoreforbusinessreleasemanagedapp.md) object.

The following table shows the properties that are required when you update the [microsoftStoreForBusinessReleaseManagedApp](../resources/microsoftstoreforbusinessreleasemanagedapp.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|displayName|String|**TODO: Add Description** Inherited from [mobileApp](../resources/intune-mobileapp.md)|
|description|String|**TODO: Add Description** Inherited from [mobileApp](../resources/intune-mobileapp.md)|
|publisher|String|**TODO: Add Description** Inherited from [mobileApp](../resources/intune-mobileapp.md)|
|largeIcon|[mimeContent](../resources/intune-mimecontent.md)|**TODO: Add Description** Inherited from [mobileApp](../resources/intune-mobileapp.md)|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [mobileApp](../resources/intune-mobileapp.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [mobileApp](../resources/intune-mobileapp.md)|
|isFeatured|Boolean|**TODO: Add Description** Inherited from [mobileApp](../resources/intune-mobileapp.md)|
|privacyInformationUrl|String|**TODO: Add Description** Inherited from [mobileApp](../resources/intune-mobileapp.md)|
|informationUrl|String|**TODO: Add Description** Inherited from [mobileApp](../resources/intune-mobileapp.md)|
|owner|String|**TODO: Add Description** Inherited from [mobileApp](../resources/intune-mobileapp.md)|
|developer|String|**TODO: Add Description** Inherited from [mobileApp](../resources/intune-mobileapp.md)|
|notes|String|**TODO: Add Description** Inherited from [mobileApp](../resources/intune-mobileapp.md)|
|uploadState|Int32|**TODO: Add Description** Inherited from [mobileApp](../resources/intune-mobileapp.md)|
|publishingState|mobileAppPublishingState|**TODO: Add Description** Inherited from [mobileApp](../resources/intune-mobileapp.md). Possible values are: `notPublished`, `processing`, `published`.|
|isAssigned|Boolean|**TODO: Add Description** Inherited from [mobileApp](../resources/intune-mobileapp.md)|
|roleScopeTagIds|String collection|**TODO: Add Description** Inherited from [mobileApp](../resources/intune-mobileapp.md)|
|dependentAppCount|Int32|**TODO: Add Description** Inherited from [mobileApp](../resources/intune-mobileapp.md)|
|supersedingAppCount|Int32|**TODO: Add Description** Inherited from [mobileApp](../resources/intune-mobileapp.md)|
|supersededAppCount|Int32|**TODO: Add Description** Inherited from [mobileApp](../resources/intune-mobileapp.md)|
|usedLicenseCount|Int32|**TODO: Add Description** Inherited from [microsoftStoreForBusinessApp](../resources/microsoftstoreforbusinessapp.md)|
|totalLicenseCount|Int32|**TODO: Add Description** Inherited from [microsoftStoreForBusinessApp](../resources/microsoftstoreforbusinessapp.md)|
|productKey|String|**TODO: Add Description** Inherited from [microsoftStoreForBusinessApp](../resources/microsoftstoreforbusinessapp.md)|
|licenseType|microsoftStoreForBusinessLicenseType|**TODO: Add Description** Inherited from [microsoftStoreForBusinessApp](../resources/microsoftstoreforbusinessapp.md). Possible values are: `offline`, `online`.|
|packageIdentityName|String|**TODO: Add Description** Inherited from [microsoftStoreForBusinessApp](../resources/microsoftstoreforbusinessapp.md)|
|licensingType|[vppLicensingType](../resources/intune-vpplicensingtype.md)|**TODO: Add Description** Inherited from [microsoftStoreForBusinessApp](../resources/microsoftstoreforbusinessapp.md)|
|selectedChannelAndReleaseId|String|**TODO: Add Description**|
|selectedPackageIds|String collection|**TODO: Add Description**|
|selectedChannelAndReleaseExpirationDateTime|DateTimeOffset|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [microsoftStoreForBusinessReleaseManagedApp](../resources/microsoftstoreforbusinessreleasemanagedapp.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_microsoftstoreforbusinessreleasemanagedapp"
}
-->
``` http
PATCH https://graph.microsoft.com/beta** Entity URI for microsoft.graph.microsoftStoreForBusinessReleaseManagedApp not found
Content-Type: application/json
Content-length: 1054

{
  "@odata.type": "#microsoft.graph.microsoftStoreForBusinessReleaseManagedApp",
  "displayName": "String",
  "description": "String",
  "publisher": "String",
  "largeIcon": {
    "@odata.type": "microsoft.graph.mimeContent"
  },
  "isFeatured": "Boolean",
  "privacyInformationUrl": "String",
  "informationUrl": "String",
  "owner": "String",
  "developer": "String",
  "notes": "String",
  "uploadState": "Integer",
  "publishingState": "String",
  "isAssigned": "Boolean",
  "roleScopeTagIds": [
    "String"
  ],
  "dependentAppCount": "Integer",
  "supersedingAppCount": "Integer",
  "supersededAppCount": "Integer",
  "usedLicenseCount": "Integer",
  "totalLicenseCount": "Integer",
  "productKey": "String",
  "licenseType": "String",
  "packageIdentityName": "String",
  "licensingType": {
    "@odata.type": "microsoft.graph.vppLicensingType"
  },
  "selectedChannelAndReleaseId": "String",
  "selectedPackageIds": [
    "String"
  ],
  "selectedChannelAndReleaseExpirationDateTime": "String (timestamp)"
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
  "@odata.type": "#microsoft.graph.microsoftStoreForBusinessReleaseManagedApp",
  "id": "a605bb29-bb29-a605-29bb-05a629bb05a6",
  "displayName": "String",
  "description": "String",
  "publisher": "String",
  "largeIcon": {
    "@odata.type": "microsoft.graph.mimeContent"
  },
  "createdDateTime": "String (timestamp)",
  "lastModifiedDateTime": "String (timestamp)",
  "isFeatured": "Boolean",
  "privacyInformationUrl": "String",
  "informationUrl": "String",
  "owner": "String",
  "developer": "String",
  "notes": "String",
  "uploadState": "Integer",
  "publishingState": "String",
  "isAssigned": "Boolean",
  "roleScopeTagIds": [
    "String"
  ],
  "dependentAppCount": "Integer",
  "supersedingAppCount": "Integer",
  "supersededAppCount": "Integer",
  "usedLicenseCount": "Integer",
  "totalLicenseCount": "Integer",
  "productKey": "String",
  "licenseType": "String",
  "packageIdentityName": "String",
  "licensingType": {
    "@odata.type": "microsoft.graph.vppLicensingType"
  },
  "selectedChannelAndReleaseId": "String",
  "selectedPackageIds": [
    "String"
  ],
  "selectedChannelAndReleaseExpirationDateTime": "String (timestamp)"
}
```


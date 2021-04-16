---
title: "Create macOsVppApp"
description: "Create a new macOsVppApp object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create macOsVppApp
Namespace: microsoft.graph



Create a new [macOsVppApp](../resources/macosvppapp.md) object.

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
POST ** Collection URI for microsoft.graph.macOsVppApp not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [macOsVppApp](../resources/macosvppapp.md) object.

The following table shows the properties that are required when you create the [macOsVppApp](../resources/macosvppapp.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|createdDateTime|DateTimeOffset|The date and time the app was created. Inherited from [mobileApp](../resources/mobileapp.md)|
|dependentAppCount|Int32|The total number of dependencies the child app has. Inherited from [mobileApp](../resources/mobileapp.md)|
|description|String|The description of the app. Inherited from [mobileApp](../resources/mobileapp.md)|
|developer|String|The developer of the app. Inherited from [mobileApp](../resources/mobileapp.md)|
|displayName|String|The admin provided or imported title of the app. Inherited from [mobileApp](../resources/mobileapp.md)|
|informationUrl|String|The more information Url. Inherited from [mobileApp](../resources/mobileapp.md)|
|isAssigned|Boolean|The value indicating whether the app is assigned to at least one group. Inherited from [mobileApp](../resources/mobileapp.md)|
|isFeatured|Boolean|The value indicating whether the app is marked as featured by the admin. Inherited from [mobileApp](../resources/mobileapp.md)|
|largeIcon|[mimeContent](../resources/mimecontent.md)|The large icon, to be displayed in the app details and used for upload of the icon. Inherited from [mobileApp](../resources/mobileapp.md)|
|lastModifiedDateTime|DateTimeOffset|The date and time the app was last modified. Inherited from [mobileApp](../resources/mobileapp.md)|
|notes|String|Notes for the app. Inherited from [mobileApp](../resources/mobileapp.md)|
|owner|String|The owner of the app. Inherited from [mobileApp](../resources/mobileapp.md)|
|privacyInformationUrl|String|The privacy statement Url. Inherited from [mobileApp](../resources/mobileapp.md)|
|publisher|String|The publisher of the app. Inherited from [mobileApp](../resources/mobileapp.md)|
|publishingState|mobileAppPublishingState|The publishing state for the app. The app cannot be assigned unless the app is published. Inherited from [mobileApp](../resources/mobileapp.md). Possible values are: `notPublished`, `processing`, `published`.|
|roleScopeTagIds|String collection|List of scope tag ids for this mobile app. Inherited from [mobileApp](../resources/mobileapp.md)|
|supersededAppCount|Int32|The total number of apps this app is directly or indirectly superseded by. Inherited from [mobileApp](../resources/mobileapp.md)|
|supersedingAppCount|Int32|The total number of apps this app directly or indirectly supersedes. Inherited from [mobileApp](../resources/mobileapp.md)|
|uploadState|Int32|The upload state. Possible values are: 0 - `Not Ready`, 1 - `Ready`, 2 - `Processing`. Inherited from [mobileApp](../resources/mobileapp.md)|
|appStoreUrl|String|The store URL.|
|bundleId|String|The Identity Name.|
|licensingType|[vppLicensingType](../resources/vpplicensingtype.md)|The supported License Type.|
|releaseDateTime|DateTimeOffset|The VPP application release date and time.|
|revokeLicenseActionResults|[macOsVppAppRevokeLicensesActionResult](../resources/macosvppapprevokelicensesactionresult.md) collection|Results of revoke license actions on this app.|
|totalLicenseCount|Int32|The total number of VPP licenses.|
|usedLicenseCount|Int32|The number of VPP licenses in use.|
|vppTokenAccountType|vppTokenAccountType|The type of volume purchase program which the given Apple Volume Purchase Program Token is associated with. Possible values are: `business`, `education`. Possible values are: `business`, `education`.|
|vppTokenAppleId|String|The Apple Id associated with the given Apple Volume Purchase Program Token.|
|vppTokenId|String|Identifier of the VPP token associated with this app.|
|vppTokenOrganizationName|String|The organization associated with the Apple Volume Purchase Program Token|



## Response

If successful, this method returns a `201 Created` response code and a [macOsVppApp](../resources/macosvppapp.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_macosvppapp_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0** Collection URI for microsoft.graph.macOsVppApp not found
Content-Type: application/json
Content-length: 1135

{
  "@odata.type": "#microsoft.graph.macOsVppApp",
  "dependentAppCount": "Integer",
  "description": "String",
  "developer": "String",
  "displayName": "String",
  "informationUrl": "String",
  "isAssigned": "Boolean",
  "isFeatured": "Boolean",
  "largeIcon": {
    "@odata.type": "microsoft.graph.mimeContent"
  },
  "notes": "String",
  "owner": "String",
  "privacyInformationUrl": "String",
  "publisher": "String",
  "publishingState": "String",
  "roleScopeTagIds": [
    "String"
  ],
  "supersededAppCount": "Integer",
  "supersedingAppCount": "Integer",
  "uploadState": "Integer",
  "appStoreUrl": "String",
  "bundleId": "String",
  "licensingType": {
    "@odata.type": "microsoft.graph.vppLicensingType"
  },
  "releaseDateTime": "String (timestamp)",
  "revokeLicenseActionResults": [
    {
      "@odata.type": "microsoft.graph.macOsVppAppRevokeLicensesActionResult"
    }
  ],
  "totalLicenseCount": "Integer",
  "usedLicenseCount": "Integer",
  "vppTokenAccountType": "String",
  "vppTokenAppleId": "String",
  "vppTokenId": "String",
  "vppTokenOrganizationName": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.macOsVppApp"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.macOsVppApp",
  "id": "c290ed91-ed91-c290-91ed-90c291ed90c2",
  "createdDateTime": "String (timestamp)",
  "dependentAppCount": "Integer",
  "description": "String",
  "developer": "String",
  "displayName": "String",
  "informationUrl": "String",
  "isAssigned": "Boolean",
  "isFeatured": "Boolean",
  "largeIcon": {
    "@odata.type": "microsoft.graph.mimeContent"
  },
  "lastModifiedDateTime": "String (timestamp)",
  "notes": "String",
  "owner": "String",
  "privacyInformationUrl": "String",
  "publisher": "String",
  "publishingState": "String",
  "roleScopeTagIds": [
    "String"
  ],
  "supersededAppCount": "Integer",
  "supersedingAppCount": "Integer",
  "uploadState": "Integer",
  "appStoreUrl": "String",
  "bundleId": "String",
  "licensingType": {
    "@odata.type": "microsoft.graph.vppLicensingType"
  },
  "releaseDateTime": "String (timestamp)",
  "revokeLicenseActionResults": [
    {
      "@odata.type": "microsoft.graph.macOsVppAppRevokeLicensesActionResult"
    }
  ],
  "totalLicenseCount": "Integer",
  "usedLicenseCount": "Integer",
  "vppTokenAccountType": "String",
  "vppTokenAppleId": "String",
  "vppTokenId": "String",
  "vppTokenOrganizationName": "String"
}
```


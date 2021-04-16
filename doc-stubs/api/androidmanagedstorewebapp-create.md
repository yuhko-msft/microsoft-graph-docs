---
title: "Create androidManagedStoreWebApp"
description: "Create a new androidManagedStoreWebApp object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create androidManagedStoreWebApp
Namespace: microsoft.graph



Create a new [androidManagedStoreWebApp](../resources/androidmanagedstorewebapp.md) object.

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
POST ** Collection URI for microsoft.graph.androidManagedStoreWebApp not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [androidManagedStoreWebApp](../resources/androidmanagedstorewebapp.md) object.

The following table shows the properties that are required when you create the [androidManagedStoreWebApp](../resources/androidmanagedstorewebapp.md).

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
|appIdentifier|String|The Identity Name. Inherited from [androidManagedStoreApp](../resources/androidmanagedstoreapp.md)|
|appStoreUrl|String|The Play for Work Store app URL. Inherited from [androidManagedStoreApp](../resources/androidmanagedstoreapp.md)|
|appTracks|[androidManagedStoreAppTrack](../resources/androidmanagedstoreapptrack.md) collection|The tracks that are visible to this enterprise. Inherited from [androidManagedStoreApp](../resources/androidmanagedstoreapp.md)|
|isPrivate|Boolean|Indicates whether the app is only available to a given enterprise's users. Inherited from [androidManagedStoreApp](../resources/androidmanagedstoreapp.md)|
|isSystemApp|Boolean|Indicates whether the app is a preinstalled system app. Inherited from [androidManagedStoreApp](../resources/androidmanagedstoreapp.md)|
|packageId|String|The package identifier. Inherited from [androidManagedStoreApp](../resources/androidmanagedstoreapp.md)|
|supportsOemConfig|Boolean|Whether this app supports OEMConfig policy. Inherited from [androidManagedStoreApp](../resources/androidmanagedstoreapp.md)|
|totalLicenseCount|Int32|The total number of VPP licenses. Inherited from [androidManagedStoreApp](../resources/androidmanagedstoreapp.md)|
|usedLicenseCount|Int32|The number of VPP licenses in use. Inherited from [androidManagedStoreApp](../resources/androidmanagedstoreapp.md)|



## Response

If successful, this method returns a `201 Created` response code and an [androidManagedStoreWebApp](../resources/androidmanagedstorewebapp.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_androidmanagedstorewebapp_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0** Collection URI for microsoft.graph.androidManagedStoreWebApp not found
Content-Type: application/json
Content-length: 981

{
  "@odata.type": "#microsoft.graph.androidManagedStoreWebApp",
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
  "appIdentifier": "String",
  "appStoreUrl": "String",
  "appTracks": [
    {
      "@odata.type": "microsoft.graph.androidManagedStoreAppTrack"
    }
  ],
  "isPrivate": "Boolean",
  "isSystemApp": "Boolean",
  "packageId": "String",
  "supportsOemConfig": "Boolean",
  "totalLicenseCount": "Integer",
  "usedLicenseCount": "Integer"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.androidManagedStoreWebApp"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.androidManagedStoreWebApp",
  "id": "38b60f4f-0f4f-38b6-4f0f-b6384f0fb638",
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
  "appIdentifier": "String",
  "appStoreUrl": "String",
  "appTracks": [
    {
      "@odata.type": "microsoft.graph.androidManagedStoreAppTrack"
    }
  ],
  "isPrivate": "Boolean",
  "isSystemApp": "Boolean",
  "packageId": "String",
  "supportsOemConfig": "Boolean",
  "totalLicenseCount": "Integer",
  "usedLicenseCount": "Integer"
}
```


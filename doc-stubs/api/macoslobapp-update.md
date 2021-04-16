---
title: "Update macOSLobApp"
description: "Update the properties of a macOSLobApp object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update macOSLobApp
Namespace: microsoft.graph



Update the properties of a [macOSLobApp](../resources/macoslobapp.md) object.

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
PATCH ** Entity URI for microsoft.graph.macOSLobApp not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [macOSLobApp](../resources/macoslobapp.md) object.

The following table shows the properties that are required when you update the [macOSLobApp](../resources/macoslobapp.md).

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
|committedContentVersion|String|The internal committed content version. Inherited from [mobileLobApp](../resources/mobilelobapp.md)|
|fileName|String|The name of the main Lob application file. Inherited from [mobileLobApp](../resources/mobilelobapp.md)|
|size|Int64|The total size, including all uploaded files. Inherited from [mobileLobApp](../resources/mobilelobapp.md)|
|buildNumber|String|The build number of MacOS Line of Business (LoB) app.|
|bundleId|String|The bundle id.|
|childApps|[macOSLobChildApp](../resources/macoslobchildapp.md) collection|The app list in this bundle package|
|identityVersion|String|The identity version.|
|ignoreVersionDetection|Boolean|A boolean to control whether the app's version will be used to detect the app after it is installed on a device. Set this to true for macOS Line of Business (LoB) apps that use a self update feature.|
|installAsManaged|Boolean|A boolean to control whether the app will be installed as managed (requires macOS 11.0 and other PKG restrictions).|
|md5Hash|String collection|The MD5 hash codes|
|md5HashChunkSize|Int32|The chunk size for MD5 hash|
|minimumSupportedOperatingSystem|[macOSMinimumOperatingSystem](../resources/macosminimumoperatingsystem.md)|The value for the minimum applicable operating system.|
|versionNumber|String|The version number of MacOS Line of Business (LoB) app.|



## Response

If successful, this method returns a `200 OK` response code and an updated [macOSLobApp](../resources/macoslobapp.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_macoslobapp"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0** Entity URI for microsoft.graph.macOSLobApp not found
Content-Type: application/json
Content-length: 1170

{
  "@odata.type": "#microsoft.graph.macOSLobApp",
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
  "committedContentVersion": "String",
  "fileName": "String",
  "size": "Integer",
  "buildNumber": "String",
  "bundleId": "String",
  "childApps": [
    {
      "@odata.type": "microsoft.graph.macOSLobChildApp"
    }
  ],
  "identityVersion": "String",
  "ignoreVersionDetection": "Boolean",
  "installAsManaged": "Boolean",
  "md5Hash": [
    "String"
  ],
  "md5HashChunkSize": "Integer",
  "minimumSupportedOperatingSystem": {
    "@odata.type": "microsoft.graph.macOSMinimumOperatingSystem"
  },
  "versionNumber": "String"
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
  "@odata.type": "#microsoft.graph.macOSLobApp",
  "id": "a6eb7baa-7baa-a6eb-aa7b-eba6aa7beba6",
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
  "committedContentVersion": "String",
  "fileName": "String",
  "size": "Integer",
  "buildNumber": "String",
  "bundleId": "String",
  "childApps": [
    {
      "@odata.type": "microsoft.graph.macOSLobChildApp"
    }
  ],
  "identityVersion": "String",
  "ignoreVersionDetection": "Boolean",
  "installAsManaged": "Boolean",
  "md5Hash": [
    "String"
  ],
  "md5HashChunkSize": "Integer",
  "minimumSupportedOperatingSystem": {
    "@odata.type": "microsoft.graph.macOSMinimumOperatingSystem"
  },
  "versionNumber": "String"
}
```


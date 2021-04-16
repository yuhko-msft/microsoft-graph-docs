---
title: "Update windowsPhone81AppXBundle"
description: "Update the properties of a windowsPhone81AppXBundle object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update windowsPhone81AppXBundle
Namespace: microsoft.graph



Update the properties of a [windowsPhone81AppXBundle](../resources/windowsphone81appxbundle.md) object.

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
PATCH ** Entity URI for microsoft.graph.windowsPhone81AppXBundle not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [windowsPhone81AppXBundle](../resources/windowsphone81appxbundle.md) object.

The following table shows the properties that are required when you update the [windowsPhone81AppXBundle](../resources/windowsphone81appxbundle.md).

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
|applicableArchitectures|windowsArchitecture|The Windows architecture(s) for which this app can run on. Inherited from [windowsPhone81AppX](../resources/windowsphone81appx.md). Possible values are: `none`, `x86`, `x64`, `arm`, `neutral`, `arm64`.|
|identityName|String|The Identity Name. Inherited from [windowsPhone81AppX](../resources/windowsphone81appx.md)|
|identityPublisherHash|String|The Identity Publisher Hash. Inherited from [windowsPhone81AppX](../resources/windowsphone81appx.md)|
|identityResourceIdentifier|String|The Identity Resource Identifier. Inherited from [windowsPhone81AppX](../resources/windowsphone81appx.md)|
|identityVersion|String|The identity version. Inherited from [windowsPhone81AppX](../resources/windowsphone81appx.md)|
|minimumSupportedOperatingSystem|[windowsMinimumOperatingSystem](../resources/windowsminimumoperatingsystem.md)|The value for the minimum applicable operating system. Inherited from [windowsPhone81AppX](../resources/windowsphone81appx.md)|
|phoneProductIdentifier|String|The Phone Product Identifier. Inherited from [windowsPhone81AppX](../resources/windowsphone81appx.md)|
|phonePublisherId|String|The Phone Publisher Id. Inherited from [windowsPhone81AppX](../resources/windowsphone81appx.md)|
|appXPackageInformationList|[windowsPackageInformation](../resources/windowspackageinformation.md) collection|The list of AppX Package Information.|



## Response

If successful, this method returns a `200 OK` response code and an updated [windowsPhone81AppXBundle](../resources/windowsphone81appxbundle.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_windowsphone81appxbundle"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0** Entity URI for microsoft.graph.windowsPhone81AppXBundle not found
Content-Type: application/json
Content-length: 1206

{
  "@odata.type": "#microsoft.graph.windowsPhone81AppXBundle",
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
  "applicableArchitectures": "String",
  "identityName": "String",
  "identityPublisherHash": "String",
  "identityResourceIdentifier": "String",
  "identityVersion": "String",
  "minimumSupportedOperatingSystem": {
    "@odata.type": "microsoft.graph.windowsMinimumOperatingSystem"
  },
  "phoneProductIdentifier": "String",
  "phonePublisherId": "String",
  "appXPackageInformationList": [
    {
      "@odata.type": "microsoft.graph.windowsPackageInformation"
    }
  ]
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
  "@odata.type": "#microsoft.graph.windowsPhone81AppXBundle",
  "id": "06e47359-7359-06e4-5973-e4065973e406",
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
  "applicableArchitectures": "String",
  "identityName": "String",
  "identityPublisherHash": "String",
  "identityResourceIdentifier": "String",
  "identityVersion": "String",
  "minimumSupportedOperatingSystem": {
    "@odata.type": "microsoft.graph.windowsMinimumOperatingSystem"
  },
  "phoneProductIdentifier": "String",
  "phonePublisherId": "String",
  "appXPackageInformationList": [
    {
      "@odata.type": "microsoft.graph.windowsPackageInformation"
    }
  ]
}
```


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

|Permission type|Permissions (from most to least privileged)|
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
|packageId|String|**TODO: Add Description** Inherited from [androidManagedStoreApp](../resources/androidmanagedstoreapp.md)|
|appIdentifier|String|**TODO: Add Description** Inherited from [androidManagedStoreApp](../resources/androidmanagedstoreapp.md)|
|usedLicenseCount|Int32|**TODO: Add Description** Inherited from [androidManagedStoreApp](../resources/androidmanagedstoreapp.md)|
|totalLicenseCount|Int32|**TODO: Add Description** Inherited from [androidManagedStoreApp](../resources/androidmanagedstoreapp.md)|
|appStoreUrl|String|**TODO: Add Description** Inherited from [androidManagedStoreApp](../resources/androidmanagedstoreapp.md)|
|isPrivate|Boolean|**TODO: Add Description** Inherited from [androidManagedStoreApp](../resources/androidmanagedstoreapp.md)|
|isSystemApp|Boolean|**TODO: Add Description** Inherited from [androidManagedStoreApp](../resources/androidmanagedstoreapp.md)|
|appTracks|[androidManagedStoreAppTrack](../resources/intune-androidmanagedstoreapptrack.md) collection|**TODO: Add Description** Inherited from [androidManagedStoreApp](../resources/androidmanagedstoreapp.md)|
|supportsOemConfig|Boolean|**TODO: Add Description** Inherited from [androidManagedStoreApp](../resources/androidmanagedstoreapp.md)|



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
POST https://graph.microsoft.com/beta** Collection URI for microsoft.graph.androidManagedStoreWebApp not found
Content-Type: application/json
Content-length: 981

{
  "@odata.type": "#microsoft.graph.androidManagedStoreWebApp",
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
  "packageId": "String",
  "appIdentifier": "String",
  "usedLicenseCount": "Integer",
  "totalLicenseCount": "Integer",
  "appStoreUrl": "String",
  "isPrivate": "Boolean",
  "isSystemApp": "Boolean",
  "appTracks": [
    {
      "@odata.type": "microsoft.graph.androidManagedStoreAppTrack"
    }
  ],
  "supportsOemConfig": "Boolean"
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
  "id": "60321d59-1d59-6032-591d-3260591d3260",
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
  "packageId": "String",
  "appIdentifier": "String",
  "usedLicenseCount": "Integer",
  "totalLicenseCount": "Integer",
  "appStoreUrl": "String",
  "isPrivate": "Boolean",
  "isSystemApp": "Boolean",
  "appTracks": [
    {
      "@odata.type": "microsoft.graph.androidManagedStoreAppTrack"
    }
  ],
  "supportsOemConfig": "Boolean"
}
```


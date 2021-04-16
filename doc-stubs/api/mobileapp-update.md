---
title: "Update mobileApp"
description: "Update the properties of a mobileApp object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update mobileApp
Namespace: microsoft.graph



Update the properties of a [mobileApp](../resources/mobileapp.md) object.

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
PATCH /deviceAppManagement/mobileApps/{mobileAppId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [mobileApp](../resources/mobileapp.md) object.

The following table shows the properties that are required when you update the [mobileApp](../resources/mobileapp.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|createdDateTime|DateTimeOffset|The date and time the app was created.|
|dependentAppCount|Int32|The total number of dependencies the child app has.|
|description|String|The description of the app.|
|developer|String|The developer of the app.|
|displayName|String|The admin provided or imported title of the app.|
|informationUrl|String|The more information Url.|
|isAssigned|Boolean|The value indicating whether the app is assigned to at least one group.|
|isFeatured|Boolean|The value indicating whether the app is marked as featured by the admin.|
|largeIcon|[mimeContent](../resources/mimecontent.md)|The large icon, to be displayed in the app details and used for upload of the icon.|
|lastModifiedDateTime|DateTimeOffset|The date and time the app was last modified.|
|notes|String|Notes for the app.|
|owner|String|The owner of the app.|
|privacyInformationUrl|String|The privacy statement Url.|
|publisher|String|The publisher of the app.|
|publishingState|mobileAppPublishingState|The publishing state for the app. The app cannot be assigned unless the app is published. Possible values are: `notPublished`, `processing`, `published`.|
|roleScopeTagIds|String collection|List of scope tag ids for this mobile app.|
|supersededAppCount|Int32|The total number of apps this app is directly or indirectly superseded by.|
|supersedingAppCount|Int32|The total number of apps this app directly or indirectly supersedes.|
|uploadState|Int32|The upload state. Possible values are: 0 - `Not Ready`, 1 - `Ready`, 2 - `Processing`.|



## Response

If successful, this method returns a `200 OK` response code and an updated [mobileApp](../resources/mobileapp.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_mobileapp"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/deviceAppManagement/mobileApps/{mobileAppId}
Content-Type: application/json
Content-length: 615

{
  "@odata.type": "#microsoft.graph.mobileApp",
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
  "uploadState": "Integer"
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
  "@odata.type": "#microsoft.graph.mobileApp",
  "id": "3fcac8d3-c8d3-3fca-d3c8-ca3fd3c8ca3f",
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
  "uploadState": "Integer"
}
```


---
title: "Create windowsFeatureUpdateProfile"
description: "Create a new windowsFeatureUpdateProfile object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create windowsFeatureUpdateProfile
Namespace: microsoft.graph



Create a new windowsFeatureUpdateProfile object.

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
POST /deviceManagement/windowsFeatureUpdateProfiles
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [windowsFeatureUpdateProfile](../resources/windowsfeatureupdateprofile.md) object.

The following table shows the properties that are required when you create the [windowsFeatureUpdateProfile](../resources/windowsfeatureupdateprofile.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|createdDateTime|DateTimeOffset|The date time that the profile was created.|
|deployableContentDisplayName|String|Friendly display name of the quality update profile deployable content|
|description|String|The description of the profile which is specified by the user.|
|displayName|String|The display name of the profile.|
|featureUpdateVersion|String|The feature update version that will be deployed to the devices targeted by this profile. The version could be any supported version for example 1709, 1803 or 1809 and so on.|
|lastModifiedDateTime|DateTimeOffset|The date time that the profile was last modified.|
|roleScopeTagIds|String collection|List of Scope Tags for this Feature Update entity.|



## Response

If successful, this method returns a `201 Created` response code and a [windowsFeatureUpdateProfile](../resources/windowsfeatureupdateprofile.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_windowsfeatureupdateprofile_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/deviceManagement/windowsFeatureUpdateProfiles
Content-Type: application/json
Content-length: 251

{
  "@odata.type": "#microsoft.graph.windowsFeatureUpdateProfile",
  "deployableContentDisplayName": "String",
  "description": "String",
  "displayName": "String",
  "featureUpdateVersion": "String",
  "roleScopeTagIds": [
    "String"
  ]
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.windowsFeatureUpdateProfile"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.windowsFeatureUpdateProfile",
  "id": "0a732156-2156-0a73-5621-730a5621730a",
  "createdDateTime": "String (timestamp)",
  "deployableContentDisplayName": "String",
  "description": "String",
  "displayName": "String",
  "featureUpdateVersion": "String",
  "lastModifiedDateTime": "String (timestamp)",
  "roleScopeTagIds": [
    "String"
  ]
}
```


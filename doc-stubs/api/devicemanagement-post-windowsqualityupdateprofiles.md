---
title: "Create windowsQualityUpdateProfile"
description: "Create a new windowsQualityUpdateProfile object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create windowsQualityUpdateProfile
Namespace: microsoft.graph



Create a new windowsQualityUpdateProfile object.

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
POST /deviceManagement/windowsQualityUpdateProfiles
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [windowsQualityUpdateProfile](../resources/windowsqualityupdateprofile.md) object.

The following table shows the properties that are required when you create the [windowsQualityUpdateProfile](../resources/windowsqualityupdateprofile.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|createdDateTime|DateTimeOffset|The date time that the profile was created.|
|deployableContentDisplayName|String|Friendly display name of the quality update profile deployable content|
|description|String|The description of the profile which is specified by the user.|
|displayName|String|The display name for the profile.|
|expeditedUpdateSettings|[expeditedWindowsQualityUpdateSettings](../resources/expeditedwindowsqualityupdatesettings.md)|Expedited update settings.|
|lastModifiedDateTime|DateTimeOffset|The date time that the profile was last modified.|
|releaseDateDisplayName|String|Friendly release date to display for a Quality Update release|
|roleScopeTagIds|String collection|List of Scope Tags for this Quality Update entity.|



## Response

If successful, this method returns a `201 Created` response code and a [windowsQualityUpdateProfile](../resources/windowsqualityupdateprofile.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_windowsqualityupdateprofile_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/deviceManagement/windowsQualityUpdateProfiles
Content-Type: application/json
Content-length: 367

{
  "@odata.type": "#microsoft.graph.windowsQualityUpdateProfile",
  "deployableContentDisplayName": "String",
  "description": "String",
  "displayName": "String",
  "expeditedUpdateSettings": {
    "@odata.type": "microsoft.graph.expeditedWindowsQualityUpdateSettings"
  },
  "releaseDateDisplayName": "String",
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
  "@odata.type": "microsoft.graph.windowsQualityUpdateProfile"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.windowsQualityUpdateProfile",
  "id": "4a1eb33e-b33e-4a1e-3eb3-1e4a3eb31e4a",
  "createdDateTime": "String (timestamp)",
  "deployableContentDisplayName": "String",
  "description": "String",
  "displayName": "String",
  "expeditedUpdateSettings": {
    "@odata.type": "microsoft.graph.expeditedWindowsQualityUpdateSettings"
  },
  "lastModifiedDateTime": "String (timestamp)",
  "releaseDateDisplayName": "String",
  "roleScopeTagIds": [
    "String"
  ]
}
```


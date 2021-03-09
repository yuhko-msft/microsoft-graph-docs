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

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new [windowsQualityUpdateProfile](../resources/intune-windowsqualityupdateprofile.md) object.

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
In the request body, supply a JSON representation of the [windowsQualityUpdateProfile](../resources/intune-windowsqualityupdateprofile.md) object.

The following table shows the properties that are required when you create the [windowsQualityUpdateProfile](../resources/intune-windowsqualityupdateprofile.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|displayName|String|**TODO: Add Description**|
|description|String|**TODO: Add Description**|
|expeditedUpdateSettings|[expeditedWindowsQualityUpdateSettings](../resources/intune-expeditedwindowsqualityupdatesettings.md)|**TODO: Add Description**|
|createdDateTime|DateTimeOffset|**TODO: Add Description**|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description**|
|roleScopeTagIds|String collection|**TODO: Add Description**|
|releaseDateDisplayName|String|**TODO: Add Description**|
|deployableContentDisplayName|String|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and a [windowsQualityUpdateProfile](../resources/intune-windowsqualityupdateprofile.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_windowsqualityupdateprofile_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/deviceManagement/windowsQualityUpdateProfiles
Content-Type: application/json
Content-length: 367

{
  "@odata.type": "#microsoft.graph.windowsQualityUpdateProfile",
  "displayName": "String",
  "description": "String",
  "expeditedUpdateSettings": {
    "@odata.type": "microsoft.graph.expeditedWindowsQualityUpdateSettings"
  },
  "roleScopeTagIds": [
    "String"
  ],
  "releaseDateDisplayName": "String",
  "deployableContentDisplayName": "String"
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
  "id": "dd2eaf77-af77-dd2e-77af-2edd77af2edd",
  "displayName": "String",
  "description": "String",
  "expeditedUpdateSettings": {
    "@odata.type": "microsoft.graph.expeditedWindowsQualityUpdateSettings"
  },
  "createdDateTime": "String (timestamp)",
  "lastModifiedDateTime": "String (timestamp)",
  "roleScopeTagIds": [
    "String"
  ],
  "releaseDateDisplayName": "String",
  "deployableContentDisplayName": "String"
}
```


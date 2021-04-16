---
title: "Update windowsAssignedAccessProfile"
description: "Update the properties of a windowsAssignedAccessProfile object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update windowsAssignedAccessProfile
Namespace: microsoft.graph



Update the properties of a [windowsAssignedAccessProfile](../resources/windowsassignedaccessprofile.md) object.

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
PATCH /windowsAssignedAccessProfile
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [windowsAssignedAccessProfile](../resources/windowsassignedaccessprofile.md) object.

The following table shows the properties that are required when you update the [windowsAssignedAccessProfile](../resources/windowsassignedaccessprofile.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|appUserModelIds|String collection|These are the only Windows Store Apps that will be available to launch from the Start menu.|
|desktopAppPaths|String collection|These are the paths of the Desktop Apps that will be available on the Start menu and the only apps the user will be able to launch.|
|profileName|String|This is a friendly name used to identify a group of applications, the layout of these apps on the start menu and the users to whom this kiosk configuration is assigned.|
|showTaskBar|Boolean|This setting allows the admin to specify whether the Task Bar is shown or not.|
|startMenuLayoutXml|Binary|Allows admins to override the default Start layout and prevents the user from changing it. The layout is modified by specifying an XML file based on a layout modification schema. XML needs to be in Binary format.|
|userAccounts|String collection|The user accounts that will be locked to this kiosk configuration.|



## Response

If successful, this method returns a `200 OK` response code and an updated [windowsAssignedAccessProfile](../resources/windowsassignedaccessprofile.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_windowsassignedaccessprofile"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/windowsAssignedAccessProfile
Content-Type: application/json
Content-length: 291

{
  "@odata.type": "#microsoft.graph.windowsAssignedAccessProfile",
  "appUserModelIds": [
    "String"
  ],
  "desktopAppPaths": [
    "String"
  ],
  "profileName": "String",
  "showTaskBar": "Boolean",
  "startMenuLayoutXml": "Binary",
  "userAccounts": [
    "String"
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
  "@odata.type": "#microsoft.graph.windowsAssignedAccessProfile",
  "id": "4b7f5d46-5d46-4b7f-465d-7f4b465d7f4b",
  "appUserModelIds": [
    "String"
  ],
  "desktopAppPaths": [
    "String"
  ],
  "profileName": "String",
  "showTaskBar": "Boolean",
  "startMenuLayoutXml": "Binary",
  "userAccounts": [
    "String"
  ]
}
```


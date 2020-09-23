---
title: "Update windowsUniversalAppXContainedApp"
description: "Update the properties of a windowsUniversalAppXContainedApp object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update windowsUniversalAppXContainedApp
Namespace: microsoft.graph

Update the properties of a [windowsUniversalAppXContainedApp](../resources/windowsuniversalappxcontainedapp.md) object.

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
PATCH /windowsUniversalAppXContainedApp
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [windowsUniversalAppXContainedApp](../resources/windowsuniversalappxcontainedapp.md) object.

The following table shows the properties that are required when you create the [windowsUniversalAppXContainedApp](../resources/windowsuniversalappxcontainedapp.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|Key of the entity. Inherited from [mobileContainedApp](../resources/mobilecontainedapp.md)|
|appUserModelId|String|The app user model ID of the contained app of a WindowsUniversalAppX app.|



## Response

If successful, this method returns a `200 OK` response code and an updated [windowsUniversalAppXContainedApp](../resources/windowsuniversalappxcontainedapp.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_windowsuniversalappxcontainedapp"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/windowsUniversalAppXContainedApp
Content-Type: application/json
Content-length: 105

{
  "@odata.type": "#microsoft.graph.windowsUniversalAppXContainedApp",
  "appUserModelId": "String"
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
  "@odata.type": "#microsoft.graph.windowsUniversalAppXContainedApp",
  "id": "342e4a53-4a53-342e-534a-2e34534a2e34",
  "appUserModelId": "String"
}
```


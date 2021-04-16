---
title: "androidForWorkCustomConfiguration: assignedAccessMultiModeProfiles"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# androidForWorkCustomConfiguration: assignedAccessMultiModeProfiles
Namespace: microsoft.graph



**TODO: Add Description**

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
POST ** Entity URI for microsoft.graph.androidForWorkCustomConfiguration not found/assignedAccessMultiModeProfiles
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply JSON representation of the parameters.

The following table shows the parameters that can be used with this action.

|Parameter|Type|Description|
|:---|:---|:---|
|assignedAccessMultiModeProfiles|[windowsAssignedAccessProfile](../resources/windowsassignedaccessprofile.md) collection|**TODO: Add Description**|



## Response

If successful, this action returns a `204 No Content` response code.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "androidforworkcustomconfiguration_assignedaccessmultimodeprofiles"
}
-->
``` http
POST https://graph.microsoft.com/v1.0** Entity URI for microsoft.graph.androidForWorkCustomConfiguration not found/assignedAccessMultiModeProfiles

Content-Type: application/json
Content-length: 438

{
  "assignedAccessMultiModeProfiles": [
    {
      "@odata.type": "#microsoft.graph.windowsAssignedAccessProfile",
      "id": "String (identifier)",
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
HTTP/1.1 204 No Content
```


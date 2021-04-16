---
title: "List windowsQualityUpdateProfiles"
description: "Get the windowsQualityUpdateProfile resources from the windowsQualityUpdateProfiles navigation property."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List windowsQualityUpdateProfiles
Namespace: microsoft.graph



Get the windowsQualityUpdateProfile resources from the windowsQualityUpdateProfiles navigation property.

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
GET /deviceManagement/windowsQualityUpdateProfiles
```

## Optional query parameters
This method supports some of the OData query parameters to help customize the response. For general information, see [OData query parameters](/graph/query-parameters).

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|

## Request body
Do not supply a request body for this method.

## Response

If successful, this method returns a `200 OK` response code and a collection of [windowsQualityUpdateProfile](../resources/windowsqualityupdateprofile.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "list_windowsqualityupdateprofile"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/deviceManagement/windowsQualityUpdateProfiles
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.windowsQualityUpdateProfile)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
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
  ]
}
```


---
title: "Create appLogCollectionRequest"
description: "Create a new appLogCollectionRequest object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create appLogCollectionRequest
Namespace: microsoft.graph



Create a new [appLogCollectionRequest](../resources/applogcollectionrequest.md) object.

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
POST /me/mobileAppTroubleshootingEvents/{mobileAppTroubleshootingEventId}/appLogCollectionRequests
POST /users/{usersId}/mobileAppTroubleshootingEvents/{mobileAppTroubleshootingEventId}/appLogCollectionRequests
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [appLogCollectionRequest](../resources/applogcollectionrequest.md) object.

The following table shows the properties that are required when you create the [appLogCollectionRequest](../resources/applogcollectionrequest.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|completedDateTime|DateTimeOffset|Time at which the upload log request reached a terminal state|
|customLogFolders|String collection|List of log folders. |
|errorMessage|String|Error message if any during the upload process|
|status|appLogUploadState|Log upload status. Possible values are: `pending`, `completed`, `failed`.|



## Response

If successful, this method returns a `201 Created` response code and an [appLogCollectionRequest](../resources/applogcollectionrequest.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_applogcollectionrequest_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/me/mobileAppTroubleshootingEvents/{mobileAppTroubleshootingEventId}/appLogCollectionRequests
Content-Type: application/json
Content-length: 208

{
  "@odata.type": "#microsoft.graph.appLogCollectionRequest",
  "completedDateTime": "String (timestamp)",
  "customLogFolders": [
    "String"
  ],
  "errorMessage": "String",
  "status": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.appLogCollectionRequest"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.appLogCollectionRequest",
  "id": "f35d319a-319a-f35d-9a31-5df39a315df3",
  "completedDateTime": "String (timestamp)",
  "customLogFolders": [
    "String"
  ],
  "errorMessage": "String",
  "status": "String"
}
```


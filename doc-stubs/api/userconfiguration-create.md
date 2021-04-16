---
title: "Create userConfiguration"
description: "Create a new userConfiguration object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create userConfiguration
Namespace: microsoft.graph



Create a new [userConfiguration](../resources/userconfiguration.md) object.

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
POST /me/mailFolders/{mailFolderId}/userConfigurations
POST /users/{usersId}/mailFolders/{mailFolderId}/userConfigurations
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [userConfiguration](../resources/userconfiguration.md) object.

The following table shows the properties that are required when you create the [userConfiguration](../resources/userconfiguration.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|binaryData|Binary|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and a [userConfiguration](../resources/userconfiguration.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_userconfiguration_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/me/mailFolders/{mailFolderId}/userConfigurations
Content-Type: application/json
Content-length: 86

{
  "@odata.type": "#microsoft.graph.userConfiguration",
  "binaryData": "Binary"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.userConfiguration"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.userConfiguration",
  "id": "5ca6567f-567f-5ca6-7f56-a65c7f56a65c",
  "binaryData": "Binary"
}
```


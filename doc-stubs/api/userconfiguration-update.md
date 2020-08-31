---
title: "Update userConfiguration"
description: "Update the properties of a userConfiguration object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update userConfiguration
Namespace: microsoft.graph

Update the properties of a [userConfiguration](../resources/userconfiguration.md) object.

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
PATCH /users/{usersId}/mailFolders/{mailFolderId}/userConfigurations/{userConfigurationId}
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

If successful, this method returns a `200 OK` response code and an updated [userConfiguration](../resources/userconfiguration.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_userconfiguration"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/users/{usersId}/mailFolders/{mailFolderId}/userConfigurations/{userConfigurationId}
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
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK

Content-Type: application/json
{
  "@odata.type": "#microsoft.graph.userConfiguration",
  "id": "2abf3b9f-3b9f-2abf-9f3b-bf2a9f3bbf2a",
  "binaryData": "Binary"
}
```


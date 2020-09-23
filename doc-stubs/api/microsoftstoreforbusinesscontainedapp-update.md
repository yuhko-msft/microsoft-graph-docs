---
title: "Update microsoftStoreForBusinessContainedApp"
description: "Update the properties of a microsoftStoreForBusinessContainedApp object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update microsoftStoreForBusinessContainedApp
Namespace: microsoft.graph

Update the properties of a [microsoftStoreForBusinessContainedApp](../resources/microsoftstoreforbusinesscontainedapp.md) object.

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
PATCH /microsoftStoreForBusinessContainedApp
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [microsoftStoreForBusinessContainedApp](../resources/microsoftstoreforbusinesscontainedapp.md) object.

The following table shows the properties that are required when you create the [microsoftStoreForBusinessContainedApp](../resources/microsoftstoreforbusinesscontainedapp.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|Key of the entity. Inherited from [mobileContainedApp](../resources/mobilecontainedapp.md)|
|appUserModelId|String|The app user model ID of the contained app of a MicrosoftStoreForBusinessApp.|



## Response

If successful, this method returns a `200 OK` response code and an updated [microsoftStoreForBusinessContainedApp](../resources/microsoftstoreforbusinesscontainedapp.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_microsoftstoreforbusinesscontainedapp"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/microsoftStoreForBusinessContainedApp
Content-Type: application/json
Content-length: 110

{
  "@odata.type": "#microsoft.graph.microsoftStoreForBusinessContainedApp",
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
  "@odata.type": "#microsoft.graph.microsoftStoreForBusinessContainedApp",
  "id": "8f335710-5710-8f33-1057-338f1057338f",
  "appUserModelId": "String"
}
```


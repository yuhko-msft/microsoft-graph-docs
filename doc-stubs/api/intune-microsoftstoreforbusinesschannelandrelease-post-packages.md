---
title: "Add microsoftStoreForBusinessPackage"
description: "Add packages by posting to the packages collection."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Add microsoftStoreForBusinessPackage
Namespace: microsoft.graph

Add packages by posting to the packages collection.

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
POST /deviceAppManagement/microsoftStoreForBusinessReleaseManagedAppTemplates/{microsoftStoreForBusinessReleaseManagedAppTemplateId}/channelsAndReleases/{microsoftStoreForBusinessChannelAndReleaseId}/packages/$ref
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [microsoftStoreForBusinessPackage](../resources/intune-microsoftstoreforbusinesspackage.md) object.

The following table shows the properties that are required when you create the [microsoftStoreForBusinessPackage](../resources/intune-microsoftstoreforbusinesspackage.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|name|String|**TODO: Add Description**|



## Response

If successful, this method returns a `204 No Content` response code and a [microsoftStoreForBusinessPackage](../resources/intune-microsoftstoreforbusinesspackage.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_microsoftstoreforbusinesspackage_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/deviceAppManagement/microsoftStoreForBusinessReleaseManagedAppTemplates/{microsoftStoreForBusinessReleaseManagedAppTemplateId}/channelsAndReleases/{microsoftStoreForBusinessChannelAndReleaseId}/packages/$ref
Content-Type: application/json
Content-length: 95

{
  "@odata.type": "#microsoft.graph.microsoftStoreForBusinessPackage",
  "name": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.microsoftStoreForBusinessPackage"
}
-->
``` http
HTTP/1.1 204 No Content
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.microsoftStoreForBusinessPackage",
  "id": "49ecb255-b255-49ec-55b2-ec4955b2ec49",
  "name": "String"
}
```


---
title: "Update microsoftStoreForBusinessChannelAndRelease"
description: "Update the properties of a microsoftStoreForBusinessChannelAndRelease object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update microsoftStoreForBusinessChannelAndRelease
Namespace: microsoft.graph

Update the properties of a [microsoftStoreForBusinessChannelAndRelease](../resources/intune-microsoftstoreforbusinesschannelandrelease.md) object.

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
PATCH /deviceAppManagement/microsoftStoreForBusinessReleaseManagedAppTemplates/{microsoftStoreForBusinessReleaseManagedAppTemplateId}/channelsAndReleases/{microsoftStoreForBusinessChannelAndReleaseId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [microsoftStoreForBusinessChannelAndRelease](../resources/intune-microsoftstoreforbusinesschannelandrelease.md) object.

The following table shows the properties that are required when you update the [microsoftStoreForBusinessChannelAndRelease](../resources/intune-microsoftstoreforbusinesschannelandrelease.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|channel|String|**TODO: Add Description**|
|release|String|**TODO: Add Description**|
|expiryDateTime|DateTimeOffset|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [microsoftStoreForBusinessChannelAndRelease](../resources/intune-microsoftstoreforbusinesschannelandrelease.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_microsoftstoreforbusinesschannelandrelease"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/deviceAppManagement/microsoftStoreForBusinessReleaseManagedAppTemplates/{microsoftStoreForBusinessReleaseManagedAppTemplateId}/channelsAndReleases/{microsoftStoreForBusinessChannelAndReleaseId}
Content-Type: application/json
Content-length: 175

{
  "@odata.type": "#microsoft.graph.microsoftStoreForBusinessChannelAndRelease",
  "channel": "String",
  "release": "String",
  "expiryDateTime": "String (timestamp)"
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
  "@odata.type": "#microsoft.graph.microsoftStoreForBusinessChannelAndRelease",
  "id": "855b9f1d-9f1d-855b-1d9f-5b851d9f5b85",
  "channel": "String",
  "release": "String",
  "expiryDateTime": "String (timestamp)"
}
```


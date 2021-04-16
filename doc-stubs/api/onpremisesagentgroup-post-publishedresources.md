---
title: "Add publishedResource"
description: "Add publishedResources by posting to the publishedResources collection."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Add publishedResource
Namespace: microsoft.graph



Add publishedResources by posting to the publishedResources collection.

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
POST /onPremisesPublishingProfiles/{onPremisesPublishingProfilesId}/agentGroups/{onPremisesAgentGroupId}/publishedResources/$ref
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [publishedResource](../resources/publishedresource.md) object.

The following table shows the properties that are required when you create the [publishedResource](../resources/publishedresource.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|displayName|String|**TODO: Add Description**|
|publishingType|onPremisesPublishingType|**TODO: Add Description**. Possible values are: `applicationProxy`, `exchangeOnline`, `authentication`, `provisioning`, `intunePfx`, `oflineDomainJoin`, `unknownFutureValue`.|
|resourceName|String|**TODO: Add Description**|



## Response

If successful, this method returns a `204 No Content` response code and a [publishedResource](../resources/publishedresource.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_publishedresource_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/onPremisesPublishingProfiles/{onPremisesPublishingProfilesId}/agentGroups/{onPremisesAgentGroupId}/publishedResources/$ref
Content-Type: application/json
Content-length: 147

{
  "@odata.type": "#microsoft.graph.publishedResource",
  "displayName": "String",
  "publishingType": "String",
  "resourceName": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.publishedResource"
}
-->
``` http
HTTP/1.1 204 No Content
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.publishedResource",
  "id": "5c8aed06-ed06-5c8a-06ed-8a5c06ed8a5c",
  "displayName": "String",
  "publishingType": "String",
  "resourceName": "String"
}
```


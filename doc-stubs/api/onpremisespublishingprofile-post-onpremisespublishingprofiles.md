---
title: "Create onPremisesPublishingProfile"
description: "Create a new onPremisesPublishingProfile object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create onPremisesPublishingProfile
Namespace: microsoft.graph



Create a new [onPremisesPublishingProfile](../resources/onpremisespublishingprofile.md) object.

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
POST /onPremisesPublishingProfiles
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [onPremisesPublishingProfile](../resources/onpremisespublishingprofile.md) object.

The following table shows the properties that are required when you create the [onPremisesPublishingProfile](../resources/onpremisespublishingprofile.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|hybridAgentUpdaterConfiguration|[hybridAgentUpdaterConfiguration](../resources/hybridagentupdaterconfiguration.md)|**TODO: Add Description**|
|isEnabled|Boolean|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and an [onPremisesPublishingProfile](../resources/onpremisespublishingprofile.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_onpremisespublishingprofile_from_onpremisespublishingprofiles"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/onPremisesPublishingProfiles
Content-Type: application/json
Content-length: 212

{
  "@odata.type": "#microsoft.graph.onPremisesPublishingProfile",
  "hybridAgentUpdaterConfiguration": {
    "@odata.type": "microsoft.graph.hybridAgentUpdaterConfiguration"
  },
  "isEnabled": "Boolean"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.onPremisesPublishingProfile"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.onPremisesPublishingProfile",
  "id": "84787196-7196-8478-9671-788496717884",
  "hybridAgentUpdaterConfiguration": {
    "@odata.type": "microsoft.graph.hybridAgentUpdaterConfiguration"
  },
  "isEnabled": "Boolean"
}
```


---
title: "Update onPremisesAgent"
description: "Update the properties of an onPremisesAgent object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update onPremisesAgent
Namespace: microsoft.graph



Update the properties of an [onPremisesAgent](../resources/onpremisesagent.md) object.

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
PATCH /onPremisesPublishingProfiles/{onPremisesPublishingProfilesId}/agents/{onPremisesAgentId}
PATCH /onPremisesPublishingProfiles/{onPremisesPublishingProfilesId}/agentGroups/{onPremisesAgentGroupId}/agents/{onPremisesAgentId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [onPremisesAgent](../resources/onpremisesagent.md) object.

The following table shows the properties that are required when you update the [onPremisesAgent](../resources/onpremisesagent.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|externalIp|String|**TODO: Add Description**|
|machineName|String|**TODO: Add Description**|
|status|agentStatus|**TODO: Add Description**. Possible values are: `active`, `inactive`.|
|supportedPublishingTypes|onPremisesPublishingType collection|**TODO: Add Description**. Possible values are: `applicationProxy`, `exchangeOnline`, `authentication`, `provisioning`, `intunePfx`, `oflineDomainJoin`, `unknownFutureValue`.|



## Response

If successful, this method returns a `200 OK` response code and an updated [onPremisesAgent](../resources/onpremisesagent.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_onpremisesagent"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/onPremisesPublishingProfiles/{onPremisesPublishingProfilesId}/agents/{onPremisesAgentId}
Content-Type: application/json
Content-length: 188

{
  "@odata.type": "#microsoft.graph.onPremisesAgent",
  "externalIp": "String",
  "machineName": "String",
  "status": "String",
  "supportedPublishingTypes": [
    "String"
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
HTTP/1.1 200 OK
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.onPremisesAgent",
  "id": "c7d08c23-8c23-c7d0-238c-d0c7238cd0c7",
  "externalIp": "String",
  "machineName": "String",
  "status": "String",
  "supportedPublishingTypes": [
    "String"
  ]
}
```


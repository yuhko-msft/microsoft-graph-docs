---
title: "Add onPremisesAgent"
description: "Add agents by posting to the agents collection."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Add onPremisesAgent
Namespace: microsoft.graph



Add agents by posting to the agents collection.

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
POST /onPremisesPublishingProfiles/{onPremisesPublishingProfilesId}/agentGroups/{onPremisesAgentGroupId}/agents/$ref
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [onPremisesAgent](../resources/onpremisesagent.md) object.

The following table shows the properties that are required when you create the [onPremisesAgent](../resources/onpremisesagent.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|externalIp|String|**TODO: Add Description**|
|machineName|String|**TODO: Add Description**|
|status|agentStatus|**TODO: Add Description**. Possible values are: `active`, `inactive`.|
|supportedPublishingTypes|onPremisesPublishingType collection|**TODO: Add Description**. Possible values are: `applicationProxy`, `exchangeOnline`, `authentication`, `provisioning`, `intunePfx`, `oflineDomainJoin`, `unknownFutureValue`.|



## Response

If successful, this method returns a `204 No Content` response code and an [onPremisesAgent](../resources/onpremisesagent.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_onpremisesagent_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/onPremisesPublishingProfiles/{onPremisesPublishingProfilesId}/agentGroups/{onPremisesAgentGroupId}/agents/$ref
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
  "truncated": true,
  "@odata.type": "microsoft.graph.onPremisesAgent"
}
-->
``` http
HTTP/1.1 204 No Content
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


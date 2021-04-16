---
title: "Create onPremisesAgentGroup"
description: "Create a new onPremisesAgentGroup object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create onPremisesAgentGroup
Namespace: microsoft.graph



Create a new onPremisesAgentGroup object.

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
POST /onPremisesPublishingProfiles/{onPremisesPublishingProfilesId}/agentGroups
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [onPremisesAgentGroup](../resources/onpremisesagentgroup.md) object.

The following table shows the properties that are required when you create the [onPremisesAgentGroup](../resources/onpremisesagentgroup.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|displayName|String|**TODO: Add Description**|
|isDefault|Boolean|**TODO: Add Description**|
|publishingType|onPremisesPublishingType|**TODO: Add Description**. Possible values are: `applicationProxy`, `exchangeOnline`, `authentication`, `provisioning`, `intunePfx`, `oflineDomainJoin`, `unknownFutureValue`.|



## Response

If successful, this method returns a `201 Created` response code and an [onPremisesAgentGroup](../resources/onpremisesagentgroup.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_onpremisesagentgroup_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/onPremisesPublishingProfiles/{onPremisesPublishingProfilesId}/agentGroups
Content-Type: application/json
Content-length: 148

{
  "@odata.type": "#microsoft.graph.onPremisesAgentGroup",
  "displayName": "String",
  "isDefault": "Boolean",
  "publishingType": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.onPremisesAgentGroup"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.onPremisesAgentGroup",
  "id": "c42ed12f-d12f-c42e-2fd1-2ec42fd12ec4",
  "displayName": "String",
  "isDefault": "Boolean",
  "publishingType": "String"
}
```


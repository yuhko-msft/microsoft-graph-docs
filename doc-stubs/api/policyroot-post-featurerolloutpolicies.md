---
title: "Create featureRolloutPolicy"
description: "Create a new featureRolloutPolicy object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create featureRolloutPolicy
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new featureRolloutPolicy object.

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
POST /policies/featureRolloutPolicies
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [featureRolloutPolicy](../resources/featurerolloutpolicy.md) object.

The following table shows the properties that are required when you create the [featureRolloutPolicy](../resources/featurerolloutpolicy.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|displayName|String|**TODO: Add Description**|
|description|String|**TODO: Add Description**|
|feature|stagedFeatureName|**TODO: Add Description**. Possible values are: `passthroughAuthentication`, `seamlessSso`, `passwordHashSync`, `emailAsAlternateId`, `unknownFutureValue`.|
|isEnabled|Boolean|**TODO: Add Description**|
|isAppliedToOrganization|Boolean|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and a [featureRolloutPolicy](../resources/featurerolloutpolicy.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_featurerolloutpolicy_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/policies/featureRolloutPolicies
Content-Type: application/json
Content-length: 210

{
  "@odata.type": "#microsoft.graph.featureRolloutPolicy",
  "displayName": "String",
  "description": "String",
  "feature": "String",
  "isEnabled": "Boolean",
  "isAppliedToOrganization": "Boolean"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.featureRolloutPolicy"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.featureRolloutPolicy",
  "id": "8dc67b0a-7b0a-8dc6-0a7b-c68d0a7bc68d",
  "displayName": "String",
  "description": "String",
  "feature": "String",
  "isEnabled": "Boolean",
  "isAppliedToOrganization": "Boolean"
}
```


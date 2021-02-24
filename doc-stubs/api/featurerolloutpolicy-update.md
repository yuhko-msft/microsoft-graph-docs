---
title: "Update featureRolloutPolicy"
description: "Update the properties of a featureRolloutPolicy object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update featureRolloutPolicy
Namespace: microsoft.graph



Update the properties of a [featureRolloutPolicy](../resources/featurerolloutpolicy.md) object.

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
PATCH /policyRoot/featureRolloutPolicies/{featureRolloutPolicyId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [featureRolloutPolicy](../resources/featurerolloutpolicy.md) object.

The following table shows the properties that are required when you update the [featureRolloutPolicy](../resources/featurerolloutpolicy.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|description|String|**TODO: Add Description**|
|feature|stagedFeatureName|**TODO: Add Description**. Possible values are: `passthroughAuthentication`, `seamlessSso`, `passwordHashSync`, `emailAsAlternateId`, `unknownFutureValue`.|
|isEnabled|Boolean|**TODO: Add Description**|
|isAppliedToOrganization|Boolean|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [featureRolloutPolicy](../resources/featurerolloutpolicy.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_featurerolloutpolicy"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/policyRoot/featureRolloutPolicies/{featureRolloutPolicyId}
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
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.featureRolloutPolicy",
  "id": "442fdb62-db62-442f-62db-2f4462db2f44",
  "displayName": "String",
  "description": "String",
  "feature": "String",
  "isEnabled": "Boolean",
  "isAppliedToOrganization": "Boolean"
}
```


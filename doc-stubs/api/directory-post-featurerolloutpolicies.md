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
POST /directory/featureRolloutPolicies
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
|description|String|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|feature|stagedFeatureName|**TODO: Add Description**. Possible values are: `passthroughAuthentication`, `seamlessSso`, `passwordHashSync`, `emailAsAlternateId`, `unknownFutureValue`.|
|isAppliedToOrganization|Boolean|**TODO: Add Description**|
|isEnabled|Boolean|**TODO: Add Description**|



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
POST https://graph.microsoft.com/v1.0/directory/featureRolloutPolicies
Content-Type: application/json
Content-length: 210

{
  "@odata.type": "#microsoft.graph.featureRolloutPolicy",
  "description": "String",
  "displayName": "String",
  "feature": "String",
  "isAppliedToOrganization": "Boolean",
  "isEnabled": "Boolean"
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
  "id": "298df850-f850-298d-50f8-8d2950f88d29",
  "description": "String",
  "displayName": "String",
  "feature": "String",
  "isAppliedToOrganization": "Boolean",
  "isEnabled": "Boolean"
}
```


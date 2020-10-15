---
title: "Create ProvisionPolicyODataModel"
description: "Create a new ProvisionPolicyODataModel object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create ProvisionPolicyODataModel
Namespace: microsoft.graph

Create a new [ProvisionPolicyODataModel](../resources/provisionpolicyodatamodel.md) object.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from most to least privileged)|
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
POST /provisioningPolicies
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [ProvisionPolicyODataModel](../resources/provisionpolicyodatamodel.md) object.

The following table shows the properties that are required when you create the [ProvisionPolicyODataModel](../resources/provisionpolicyodatamodel.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|displayName|String|**TODO: Add Description**|
|description|String|**TODO: Add Description**|
|onPremisesConnectionId|String|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and a [ProvisionPolicyODataModel](../resources/provisionpolicyodatamodel.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_provisionpolicyodatamodel_from_provisioningpolicies"
}
-->
``` http
POST https://graph.microsoft.com/beta/provisioningPolicies
Content-Type: application/json
Content-length: 162

{
  "@odata.type": "#microsoft.graph.ProvisionPolicyODataModel",
  "displayName": "String",
  "description": "String",
  "onPremisesConnectionId": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.ProvisionPolicyODataModel"
}
-->
``` http
HTTP/1.1 201 Created

Content-Type: application/json
{
  "@odata.type": "#microsoft.graph.ProvisionPolicyODataModel",
  "id": "551c9fd6-9fd6-551c-d69f-1c55d69f1c55",
  "displayName": "String",
  "description": "String",
  "onPremisesConnectionId": "String"
}
```


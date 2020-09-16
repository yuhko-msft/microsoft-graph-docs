---
title: "Create featureConfigurations"
description: "Create a new featureConfiguration object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create featureConfigurations
Namespace: microsoft.graph

Create a new featureConfiguration object.

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
POST /identity/featureConfigurations
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [featureConfiguration](../resources/featureconfiguration.md) object.

The following table shows the properties that are required when you create the [featureConfiguration](../resources/featureconfiguration.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description**|
|activatedFeatureTiers|identityFeatureTier|**TODO: Add Description**. Possible values are: `Standard`, `PremiumP1`, `PremiumP2`, `unknownFutureValue`.|
|azureResourceGroupName|String|**TODO: Add Description**|
|azureResourceName|String|**TODO: Add Description**|
|azureSubscriptionId|String|**TODO: Add Description**|
|azureSubscriptionTenantId|String|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and a [featureConfiguration](../resources/featureconfiguration.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_featureconfiguration_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/identity/featureConfigurations
Content-Type: application/json
Content-length: 265

{
  "@odata.type": "#Microsoft.Cpim.Api.DataModels.featureConfiguration",
  "activatedFeatureTiers": "String",
  "azureResourceGroupName": "String",
  "azureResourceName": "String",
  "azureSubscriptionId": "String",
  "azureSubscriptionTenantId": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Microsoft.Cpim.Api.DataModels.featureConfiguration"
}
-->
``` http
HTTP/1.1 201 Created

Content-Type: application/json
{
  "@odata.type": "#Microsoft.Cpim.Api.DataModels.featureConfiguration",
  "id": "623203f2-03f2-6232-f203-3262f2033262",
  "activatedFeatureTiers": "String",
  "azureResourceGroupName": "String",
  "azureResourceName": "String",
  "azureSubscriptionId": "String",
  "azureSubscriptionTenantId": "String"
}
```


---
title: "Create azureADUserFeatureUsage"
description: "Create a new azureADUserFeatureUsage object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create azureADUserFeatureUsage
Namespace: microsoft.graph



Create a new [azureADUserFeatureUsage](../resources/azureaduserfeatureusage.md) object.

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
POST ** Collection URI for microsoft.graph.azureADUserFeatureUsage not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [azureADUserFeatureUsage](../resources/azureaduserfeatureusage.md) object.

The following table shows the properties that are required when you create the [azureADUserFeatureUsage](../resources/azureaduserfeatureusage.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|featureUsageDetails|[featureUsageDetail](../resources/featureusagedetail.md) collection|**TODO: Add Description**|
|lastUpdatedDateTime|DateTimeOffset|**TODO: Add Description**|
|licenseAssigned|azureADLicenseType|**TODO: Add Description**. Possible values are: `none`, `free`, `basic`, `premiumP1`, `premiumP2`, `unknownFutureValue`.|
|licenseRecommended|azureADLicenseType|**TODO: Add Description**. Possible values are: `none`, `free`, `basic`, `premiumP1`, `premiumP2`, `unknownFutureValue`.|
|userDisplayName|String|**TODO: Add Description**|
|userId|String|**TODO: Add Description**|
|userPrincipalName|String|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and an [azureADUserFeatureUsage](../resources/azureaduserfeatureusage.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_azureaduserfeatureusage_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0** Collection URI for microsoft.graph.azureADUserFeatureUsage not found
Content-Type: application/json
Content-length: 376

{
  "@odata.type": "#microsoft.graph.azureADUserFeatureUsage",
  "featureUsageDetails": [
    {
      "@odata.type": "microsoft.graph.featureUsageDetail"
    }
  ],
  "lastUpdatedDateTime": "String (timestamp)",
  "licenseAssigned": "String",
  "licenseRecommended": "String",
  "userDisplayName": "String",
  "userId": "String",
  "userPrincipalName": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.azureADUserFeatureUsage"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.azureADUserFeatureUsage",
  "id": "519d1255-1255-519d-5512-9d5155129d51",
  "featureUsageDetails": [
    {
      "@odata.type": "microsoft.graph.featureUsageDetail"
    }
  ],
  "lastUpdatedDateTime": "String (timestamp)",
  "licenseAssigned": "String",
  "licenseRecommended": "String",
  "userDisplayName": "String",
  "userId": "String",
  "userPrincipalName": "String"
}
```


---
title: "Create managedAppPolicyDeploymentSummary"
description: "Create a new managedAppPolicyDeploymentSummary object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create managedAppPolicyDeploymentSummary
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new [managedAppPolicyDeploymentSummary](../resources/managedapppolicydeploymentsummary.md) object.

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
POST ** Collection URI for microsoft.graph.managedAppPolicyDeploymentSummary not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [managedAppPolicyDeploymentSummary](../resources/managedapppolicydeploymentsummary.md) object.

The following table shows the properties that are required when you create the [managedAppPolicyDeploymentSummary](../resources/managedapppolicydeploymentsummary.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|configurationDeployedUserCount|Int32|**TODO: Add Description**|
|configurationDeploymentSummaryPerApp|[managedAppPolicyDeploymentSummaryPerApp](../resources/managedapppolicydeploymentsummaryperapp.md) collection|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|lastRefreshTime|DateTimeOffset|**TODO: Add Description**|
|version|String|Version of the entity.|



## Response

If successful, this method returns a `201 Created` response code and a [managedAppPolicyDeploymentSummary](../resources/managedapppolicydeploymentsummary.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_managedapppolicydeploymentsummary_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta** Collection URI for microsoft.graph.managedAppPolicyDeploymentSummary not found
Content-Type: application/json
Content-length: 364

{
  "@odata.type": "#microsoft.graph.managedAppPolicyDeploymentSummary",
  "configurationDeployedUserCount": "Integer",
  "configurationDeploymentSummaryPerApp": [
    {
      "@odata.type": "microsoft.graph.managedAppPolicyDeploymentSummaryPerApp"
    }
  ],
  "displayName": "String",
  "lastRefreshTime": "String (timestamp)",
  "version": "String"
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.managedAppPolicyDeploymentSummary"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.managedAppPolicyDeploymentSummary",
  "id": "5e541862-1862-5e54-6218-545e6218545e",
  "configurationDeployedUserCount": "Integer",
  "configurationDeploymentSummaryPerApp": [
    {
      "@odata.type": "microsoft.graph.managedAppPolicyDeploymentSummaryPerApp"
    }
  ],
  "displayName": "String",
  "lastRefreshTime": "String (timestamp)",
  "version": "String"
}
```


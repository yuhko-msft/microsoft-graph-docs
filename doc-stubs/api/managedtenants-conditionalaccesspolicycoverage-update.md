---
title: "Update conditionalAccessPolicyCoverage"
description: "Update the properties of a conditionalAccessPolicyCoverage object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update conditionalAccessPolicyCoverage
Namespace: microsoft.graph.managedTenants

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of a [conditionalAccessPolicyCoverage](../resources/managedtenants-conditionalaccesspolicycoverage.md) object.

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
PATCH /tenantRelationships/managedTenants/conditionalAccessPolicyCoverages/{conditionalAccessPolicyCoverageId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [conditionalAccessPolicyCoverage](../resources/managedtenants-conditionalaccesspolicycoverage.md) object.

The following table shows the properties that are required when you update the [conditionalAccessPolicyCoverage](../resources/managedtenants-conditionalaccesspolicycoverage.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/managedtenants-entity.md)|
|conditionalAccessPolicyState|String|**TODO: Add Description**|
|latestPolicyModifiedDateTime|DateTimeOffset|**TODO: Add Description**|
|requiresDeviceCompliance|Boolean|**TODO: Add Description**|
|tenantDisplayName|String|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [conditionalAccessPolicyCoverage](../resources/managedtenants-conditionalaccesspolicycoverage.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_conditionalaccesspolicycoverage"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/tenantRelationships/managedTenants/conditionalAccessPolicyCoverages/{conditionalAccessPolicyCoverageId}
Content-Type: application/json
Content-length: 266

{
  "@odata.type": "#microsoft.graph.managedTenants.conditionalAccessPolicyCoverage",
  "conditionalAccessPolicyState": "String",
  "latestPolicyModifiedDateTime": "String (timestamp)",
  "requiresDeviceCompliance": "Boolean",
  "tenantDisplayName": "String"
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.managedTenants.conditionalAccessPolicyCoverage",
  "id": "3dbd260c-260c-3dbd-0c26-bd3d0c26bd3d",
  "conditionalAccessPolicyState": "String",
  "latestPolicyModifiedDateTime": "String (timestamp)",
  "requiresDeviceCompliance": "Boolean",
  "tenantDisplayName": "String"
}
```


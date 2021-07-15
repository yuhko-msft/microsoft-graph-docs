---
title: "Update tenant"
description: "Update the properties of a tenant object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update tenant
Namespace: microsoft.graph.managedTenants

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of a [tenant](../resources/managedtenants-tenant.md) object.

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
PATCH /tenantRelationships/managedTenants/tenants/{tenantId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [tenant](../resources/managedtenants-tenant.md) object.

The following table shows the properties that are required when you update the [tenant](../resources/managedtenants-tenant.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/managedtenants-entity.md)|
|contract|[microsoft.graph.managedTenants.tenantContract](../resources/managedtenants-tenantcontract.md)|**TODO: Add Description**|
|createdDateTime|DateTimeOffset|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|lastUpdatedDateTime|DateTimeOffset|**TODO: Add Description**|
|tenantId|String|**TODO: Add Description**|
|tenantStatusInformation|[microsoft.graph.managedTenants.tenantStatusInformation](../resources/managedtenants-tenantstatusinformation.md)|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [tenant](../resources/managedtenants-tenant.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_tenant"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/tenantRelationships/managedTenants/tenants/{tenantId}
Content-Type: application/json
Content-length: 370

{
  "@odata.type": "#microsoft.graph.managedTenants.tenant",
  "contract": {
    "@odata.type": "microsoft.graph.managedTenants.tenantContract"
  },
  "displayName": "String",
  "lastUpdatedDateTime": "String (timestamp)",
  "tenantId": "String",
  "tenantStatusInformation": {
    "@odata.type": "microsoft.graph.managedTenants.tenantStatusInformation"
  }
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
  "@odata.type": "#microsoft.graph.managedTenants.tenant",
  "id": "9008fb4d-fb4d-9008-4dfb-08904dfb0890",
  "contract": {
    "@odata.type": "microsoft.graph.managedTenants.tenantContract"
  },
  "createdDateTime": "String (timestamp)",
  "displayName": "String",
  "lastUpdatedDateTime": "String (timestamp)",
  "tenantId": "String",
  "tenantStatusInformation": {
    "@odata.type": "microsoft.graph.managedTenants.tenantStatusInformation"
  }
}
```


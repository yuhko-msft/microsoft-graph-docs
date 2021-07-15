---
title: "Update riskyUser"
description: "Update the properties of a riskyUser object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update riskyUser
Namespace: microsoft.graph.managedTenants

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of a [riskyUser](../resources/managedtenants-riskyuser.md) object.

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
PATCH /tenantRelationships/managedTenants/riskyUsers/{riskyUserId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [riskyUser](../resources/managedtenants-riskyuser.md) object.

The following table shows the properties that are required when you update the [riskyUser](../resources/managedtenants-riskyuser.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/managedtenants-entity.md)|
|isDeleted|Boolean|**TODO: Add Description**|
|lastRefreshedDateTime|DateTimeOffset|**TODO: Add Description**|
|riskDetail|String|**TODO: Add Description**|
|riskLastUpdatedDateTime|DateTimeOffset|**TODO: Add Description**|
|riskLevel|String|**TODO: Add Description**|
|riskState|String|**TODO: Add Description**|
|tenantDisplayName|String|**TODO: Add Description**|
|tenantId|String|**TODO: Add Description**|
|userDisplayName|String|**TODO: Add Description**|
|userId|String|**TODO: Add Description**|
|userPrincipalName|String|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [riskyUser](../resources/managedtenants-riskyuser.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_riskyuser"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/tenantRelationships/managedTenants/riskyUsers/{riskyUserId}
Content-Type: application/json
Content-length: 422

{
  "@odata.type": "#microsoft.graph.managedTenants.riskyUser",
  "isDeleted": "Boolean",
  "lastRefreshedDateTime": "String (timestamp)",
  "riskDetail": "String",
  "riskLastUpdatedDateTime": "String (timestamp)",
  "riskLevel": "String",
  "riskState": "String",
  "tenantDisplayName": "String",
  "tenantId": "String",
  "userDisplayName": "String",
  "userId": "String",
  "userPrincipalName": "String"
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
  "@odata.type": "#microsoft.graph.managedTenants.riskyUser",
  "id": "22cfdd55-dd55-22cf-55dd-cf2255ddcf22",
  "isDeleted": "Boolean",
  "lastRefreshedDateTime": "String (timestamp)",
  "riskDetail": "String",
  "riskLastUpdatedDateTime": "String (timestamp)",
  "riskLevel": "String",
  "riskState": "String",
  "tenantDisplayName": "String",
  "tenantId": "String",
  "userDisplayName": "String",
  "userId": "String",
  "userPrincipalName": "String"
}
```


---
title: "Update tenantTag"
description: "Update the properties of a tenantTag object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update tenantTag
Namespace: microsoft.graph.managedTenants

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of a [tenantTag](../resources/managedtenants-tenanttag.md) object.

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
PATCH /tenantRelationships/managedTenants/tenantTags/{tenantTagId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [tenantTag](../resources/managedtenants-tenanttag.md) object.

The following table shows the properties that are required when you update the [tenantTag](../resources/managedtenants-tenanttag.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/managedtenants-entity.md)|
|createdByUserId|String|**TODO: Add Description**|
|createdDateTime|DateTimeOffset|**TODO: Add Description**|
|deletedDateTime|DateTimeOffset|**TODO: Add Description**|
|description|String|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|lastActionByUserId|String|**TODO: Add Description**|
|lastActionDateTime|DateTimeOffset|**TODO: Add Description**|
|tenants|[microsoft.graph.managedTenants.tenantInfo](../resources/managedtenants-tenantinfo.md) collection|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [tenantTag](../resources/managedtenants-tenanttag.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_tenanttag"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/tenantRelationships/managedTenants/tenantTags/{tenantTagId}
Content-Type: application/json
Content-length: 382

{
  "@odata.type": "#microsoft.graph.managedTenants.tenantTag",
  "createdByUserId": "String",
  "deletedDateTime": "String (timestamp)",
  "description": "String",
  "displayName": "String",
  "lastActionByUserId": "String",
  "lastActionDateTime": "String (timestamp)",
  "tenants": [
    {
      "@odata.type": "microsoft.graph.managedTenants.tenantInfo"
    }
  ]
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
  "@odata.type": "#microsoft.graph.managedTenants.tenantTag",
  "id": "280d9d2f-9d2f-280d-2f9d-0d282f9d0d28",
  "createdByUserId": "String",
  "createdDateTime": "String (timestamp)",
  "deletedDateTime": "String (timestamp)",
  "description": "String",
  "displayName": "String",
  "lastActionByUserId": "String",
  "lastActionDateTime": "String (timestamp)",
  "tenants": [
    {
      "@odata.type": "microsoft.graph.managedTenants.tenantInfo"
    }
  ]
}
```


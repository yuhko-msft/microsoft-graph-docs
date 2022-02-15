---
title: "Update managementTemplateCollection"
description: "Update the properties of a managementTemplateCollection object."
author: "idwilliams"
ms.localizationpriority: medium
ms.prod: "microsoft-365-lighthouse"
doc_type: apiPageType
---

# Update managementTemplateCollection
Namespace: microsoft.graph.managedTenants

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of a [managementTemplateCollection](../resources/managedtenants-managementtemplatecollection.md) object.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from least to most privileged)|
|:---|:---|
|Delegated (work or school account)|ManagedTenants.Read.All, ManagedTenants.ReadWrite.All|
|Delegated (personal Microsoft account)|Not supported.|
|Application|Not supported.|

## HTTP request

<!-- {
  "blockType": "ignored"
}
-->
``` http
PATCH /tenantRelationships/managedTenants/managementTemplateCollections/{managementTemplateCollectionId}
PATCH /tenantRelationships/managedTenants/managementTemplates/{managementTemplateId}/managementTemplateCollections/{managementTemplateCollectionId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
[!INCLUDE [table-intro](../../includes/update-property-table-intro.md)]


|Property|Type|Description|
|:---|:---|:---|
|displayName|String|**TODO: Add Description** Optional.|
|description|String|**TODO: Add Description** Optional.|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Optional.|
|createdByUserId|String|**TODO: Add Description** Optional.|
|lastActionDateTime|DateTimeOffset|**TODO: Add Description** Optional.|
|lastActionByUserId|String|**TODO: Add Description** Optional.|



## Response

If successful, this method returns a `200 OK` response code and an updated [managementTemplateCollection](../resources/managedtenants-managementtemplatecollection.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_managementtemplatecollection"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/tenantRelationships/managedTenants/managementTemplateCollections/{managementTemplateCollectionId}
Content-Type: application/json
Content-length: 255

{
  "@odata.type": "#microsoft.graph.managedTenants.managementTemplateCollection",
  "displayName": "String",
  "description": "String",
  "createdByUserId": "String",
  "lastActionDateTime": "String (timestamp)",
  "lastActionByUserId": "String"
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
  "@odata.type": "#microsoft.graph.managedTenants.managementTemplateCollection",
  "id": "c3a3e023-ef41-5ebb-ba76-b2f53923bed6",
  "displayName": "String",
  "description": "String",
  "createdDateTime": "String (timestamp)",
  "createdByUserId": "String",
  "lastActionDateTime": "String (timestamp)",
  "lastActionByUserId": "String"
}
```


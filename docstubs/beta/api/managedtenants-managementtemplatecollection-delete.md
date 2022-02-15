---
title: "Delete managementTemplateCollection"
description: "Deletes a managementTemplateCollection object."
author: "idwilliams"
ms.localizationpriority: medium
ms.prod: "microsoft-365-lighthouse"
doc_type: apiPageType
---

# Delete managementTemplateCollection
Namespace: microsoft.graph.managedTenants

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Deletes a [managementTemplateCollection](../resources/managedtenants-managementtemplatecollection.md) object.

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
DELETE /tenantRelationships/managedTenants/managementTemplateCollections/{managementTemplateCollectionId}
DELETE /tenantRelationships/managedTenants/managementTemplates/{managementTemplateId}/managementTemplateCollections/{managementTemplateCollectionId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|

## Request body
Do not supply a request body for this method.

## Response

If successful, this method returns a `204 No Content` response code.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "delete_managementtemplatecollection"
}
-->
``` http
DELETE https://graph.microsoft.com/beta/tenantRelationships/managedTenants/managementTemplateCollections/{managementTemplateCollectionId}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true
}
-->
``` http
HTTP/1.1 204 No Content
```


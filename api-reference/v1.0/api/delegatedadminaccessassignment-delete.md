---
title: "Delete delegatedAdminAccessAssignment"
description: "Deletes a delegatedAdminAccessAssignment object."
author: "smrtsec"
ms.localizationpriority: medium
ms.prod: "partnercustomersvcadmin"
doc_type: apiPageType
---

# Delete delegatedAdminAccessAssignment
Namespace: microsoft.partner.customerServiceAdministration

**TODO: Callout status progression (active -> deleting -> deleted)**
Deletes a [delegatedAdminAccessAssignment](../resources/delegatedadminaccessassignment.md) object.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from least to most privileged)|
|:---|:---|
|Delegated (work or school account)| DelegatedAdminRelationship.ReadWrite.All |
|Delegated (personal Microsoft account)| Not Supported.|
|Application| Not Supported.|

## HTTP request

<!-- {
  "blockType": "ignored"
}
-->
``` http
DELETE /tenantRelationship/delegatedAdminRelationships/{delegatedAdminRelationshipId}/accessAssignments/{delegatedAdminAccessAssignmentId}
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
  "name": "delete_delegatedadminaccessassignment"
}
-->
``` http
DELETE https://graph.microsoft.com/beta/tenantRelationships/delegatedAdminRelationships/5e5594d3-6f82-458b-b567-77db4811f0cd-00000000-0000-0000-0000-000000001234/accessAssignments/587a6f8b-c0ee-4c85-b1d4-24550e850e17
Content-Type: application/json
Authorization: Bearer token
If-match: "W/\"JyIxYjAwMDM3Zi0wMDAwLTE5MDAtMDAwMC02MGY0YjMwMDAwMDAiJw==\""
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


---
title: "Get delegatedAdminRelationshipRequest"
description: "Read the properties and relationships of a delegatedAdminRelationshipRequest object."
author: "adtangir"
ms.localizationpriority: medium
ms.prod: "partnercustomersvcadmin"
doc_type: apiPageType
---

# Get delegatedAdminRelationshipRequest
Namespace: microsoft.partner.customerServiceAdministration



Read the properties and relationships of a [delegatedAdminRelationshipRequest](../resources/delegatedadminrelationshiprequest.md) object.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from least to most privileged)|
|:---|:---|
|Delegated (work or school account)| DelegatedAdminRelationship.Read.All, DelegatedAdminRelationship.ReadWrite.All |
|Delegated (personal Microsoft account)| Not Supported. |
|Application| Not Supported. |

## HTTP request

<!-- {
  "blockType": "ignored"
}
-->
``` http
GET /tenantRelationship/delegatedAdminRelationships/{delegatedAdminRelationshipId}/requests/{delegatedAdminRelationshipRequestId}
```

## Optional query parameters
This method supports some of the OData query parameters to help customize the response. For general information, see [OData query parameters](/graph/query-parameters).

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|

## Request body
Do not supply a request body for this method.

## Response

If successful, this method returns a `200 OK` response code and a [delegatedAdminRelationshipRequest](../resources/delegatedadminrelationshiprequest.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_delegatedadminrelationshiprequest"
}
-->
``` http
GET https://graph.microsoft.com/beta/tenantRelationships/delegatedAdminRelationships/d19a2db9-164c-4e46-8731-aa1d691f2260-00000000-0000-0000-0000-000000001234/requests/d328edec-f388-4a5d-a7df-658e317c1a67
Content-Type: application/json
Authorization: Bearer token
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.partner.customerServiceAdministration.delegatedAdminRelationshipRequest"
}
-->
``` http
HTTP/1.1 200 OK
{
    "@odata.context": "https://graph.microsoft.com/beta/tenantRelationships/$metadata#delegatedAdminRelationshipRequests/$entity",
    "@odata.etag": "W/\"JyIxODAwZDQwYi0wMDAwLTE5MDAtMDAwMC02MGVmMGE3MzAwMDAiJw==\"",
    "id": "d328edec-f388-4a5d-a7df-658e317c1a67",
    "action": "lockForApproval",
    "status": "completed"
}
```


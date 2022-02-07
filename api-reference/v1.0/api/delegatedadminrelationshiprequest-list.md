---
title: "List delegatedAdminRelationshipRequests"
description: "Get a list of the delegatedAdminRelationshipRequest objects and their properties."
author: "adtangir"
ms.localizationpriority: medium
ms.prod: "partnercustomersvcadmin"
doc_type: apiPageType
---

# List delegatedAdminRelationshipRequests
Namespace: microsoft.partner.customerServiceAdministration



Get a list of the [delegatedAdminRelationshipRequest](../resources/delegatedadminrelationshiprequest.md) objects and their properties.

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
GET /tenantRelationship/delegatedAdminRelationships/{delegatedAdminRelationshipId}/requests
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

If successful, this method returns a `200 OK` response code and a collection of [delegatedAdminRelationshipRequest](../resources/delegatedadminrelationshiprequest.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "list_delegatedadminrelationshiprequest"
}
-->
``` http
GET https://graph.microsoft.com/beta/tenantRelationships/delegatedAdminRelationships/d19a2db9-164c-4e46-8731-aa1d691f2260-00000000-0000-0000-0000-000000001234/requests
Content-Type: application/json
Authorization: Bearer token
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.partner.customerServiceAdministration.delegatedAdminRelationshipRequest)"
}
-->
``` http
HTTP/1.1 200 OK
{
    "@odata.context": "https://graph.microsoft.com/beta/tenantRelationships/$metadata#delegatedAdminRelationshipRequests",
    "value": [
        {
            "@odata.etag": "W/\"JyIxODAwMzYwYy0wMDAwLTE5MDAtMDAwMC02MGVmMGI1NzAwMDAiJw==\"",
            "id": "d328edec-f388-4a5d-a7df-658e317c1a67",
            "action": "lockForApproval",
            "status": "completed"
        },
        {
            "id": "e2a74b92-5422-4e21-9a00-43e666dabd3b",
            "action": "terminate",
            "status": "completed"
        },
    ]
}
```


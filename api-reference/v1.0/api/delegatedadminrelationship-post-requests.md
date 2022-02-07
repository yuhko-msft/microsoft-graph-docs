---
title: "Create delegatedAdminRelationshipRequest"
description: "Create a new delegatedAdminRelationshipRequest object."
author: "adtangir"
ms.localizationpriority: medium
ms.prod: "partnercustomersvcadmin"
doc_type: apiPageType
---

# Create delegatedAdminRelationshipRequest
Namespace: microsoft.partner.customerServiceAdministration



Create a new [delegatedAdminRelationshipRequest](../resources/delegatedadminrelationshiprequest.md) object.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from least to most privileged)|
|:---|:---|
|Delegated (work or school account)| DelegatedAdminRelationship.ReadWrite.All |
|Delegated (personal Microsoft account)| Not Supported. |
|Application| Not Supported. |

## HTTP request

<!-- {
  "blockType": "ignored"
}
-->
``` http
POST /tenantRelationship/delegatedAdminRelationships/{delegatedAdminRelationshipId}/requests
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [delegatedAdminRelationshipRequest](../resources/delegatedadminrelationshiprequest.md) object.

You can specify the following properties when creating a **delegatedAdminRelationshipRequest**.

|Property|Type|Description|
|:---|:---|:---|
|action|String|**TODO: Add Description** Required.|
|status|String|**TODO: Add Description** Optional.|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Optional.|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Optional.|



## Response

If successful, this method returns a `201 Created` response code and a [delegatedAdminRelationshipRequest](../resources/delegatedadminrelationshiprequest.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_delegatedadminrelationshiprequest_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/tenantRelationships/delegatedAdminRelationships/d19a2db9-164c-4e46-8731-aa1d691f2260-00000000-0000-0000-0000-000000001234/requests
Content-Type: application/json
Authorization: Bearer token
{
    "action": "lockForApproval"
}
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
HTTP/1.1 201 CREATED
{
    "@odata.context": "https://graph.microsoft.com/beta/tenantRelationships/$metadata#delegatedAdminRelationshipRequests/$entity",
    "@odata.etag": "W/\"JyIxYjAwMDM3Zi0wMDAwLTE5MDAtMDAwMC02MGY0YjMwMDAwMDAiJw==\"",
    "id": "d328edec-f388-4a5d-a7df-658e317c1a67",
    "action": "lockForApproval",
    "status": "created"
}
```


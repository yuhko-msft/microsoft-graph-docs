---
title: "List delegatedAdminRelationships"
description: "Get a list of the delegatedAdminRelationship objects and their properties."
author: "adtangir"
ms.localizationpriority: medium
ms.prod: "partnercustomersvcadmin"
doc_type: apiPageType
---

# List delegatedAdminRelationships
Namespace: microsoft.partner.customerServiceAdministration



Get a list of the [delegatedAdminRelationship](../resources/delegatedadminrelationship.md) objects and their properties.

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
GET /tenantRelationship/delegatedAdminRelationships
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

If successful, this method returns a `200 OK` response code and a collection of [delegatedAdminRelationship](../resources/delegatedadminrelationship.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "list_delegatedadminrelationship"
}
-->
``` http
GET https://graph.microsoft.com/beta/tenantRelationships/delegatedAdminRelationships
Content-Type: application/json
Authorization: Bearer token
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.partner.customerServiceAdministration.delegatedAdminRelationship)"
}
-->
``` http
HTTP/1.1 200 OK
{
  "@odata.context": "https://graph.microsoft.com/beta/tenantRelationships/$metadata#DelegatedAdminRelationships",
  "value": [
    {
        "@odata.etag": "W/\"JyIxODAwMzYwYy0wMDAwLTE5MDAtMDAwMC02MGVmMGI1NzAwMDAiJw==\"",
        "id": "8db14414-2f0a-414e-ad66-361a892ed585-00000000-0000-0000-0000-000000001234",
        "displayName": "Contoso Admin Relationship",
        "duration": "P20D",
        "status": "active",
        "activatedDateTime": "07/14/2021 16:05:43",
        "endDateTime": "08/03/2021 16:05:43",
        "partner": {
            "tenantId": "00000000-0000-0000-0000-000000001234"
        },
        "customer": {
            "tenantId": "00000000-0000-0000-0000-00000000abcd",
            "displayName": "Contoso Inc."
        },
        "accessDetails": {
            "unifiedRoles": [
                {
                    "roleDefinitionId": "44367163-eba1-44c3-98af-f5787879f96a"
                },
                {
                    "roleDefinitionId": "0f971eea-41eb-4569-a71e-57bb8a3eff1e"
                },
                {
                    "roleDefinitionId": "ac16e43d-7b2d-40e0-ac05-243ff356ab5b"
                },
                {
                    "roleDefinitionId": "7495fdc4-34c4-4d15-a289-98788ce399fd"
                },
                {
                    "roleDefinitionId": "5f2222b1-57c3-48ba-8ad5-d4759f1fde6f"
                }
            ]
        }
    },
    {
      …
    },
  ]
}
```


---
title: "Update delegatedAdminRelationship"
description: "Update the properties of a delegatedAdminRelationship object."
author: "adtangir"
ms.localizationpriority: medium
ms.prod: "partnercustomersvcadmin"
doc_type: apiPageType
---

# Update delegatedAdminRelationship
Namespace: microsoft.partner.customerServiceAdministration



Update the properties of a [delegatedAdminRelationship](../resources/delegatedadminrelationship.md) object. This can only be performed by the partner when the relationship is in the "created" (i.e., draft) status.

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
PATCH /tenantRelationship/delegatedAdminRelationships/{delegatedAdminRelationshipId}
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
|name|String|**TODO: Add Description** Required.|
|duration|Duration|**TODO: Add Description** Required.|
|customer|[microsoft.partner.customerServiceAdministration.delegatedAdminRelationshipCustomerParticipant](../resources/delegatedadminrelationshipcustomerparticipant.md)|**TODO: Add Description** Optional.|
|accessDetails|[microsoft.partner.customerServiceAdministration.delegatedAdminAccessDetails](../resources/delegatedadminaccessdetails.md)|**TODO: Add Description** Required.|


## Response

If successful, this method returns a `200 OK` response code and an updated [delegatedAdminRelationship](../resources/delegatedadminrelationship.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_delegatedadminrelationship"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/tenantRelationships/delegatedAdminRelationships/d19a2db9-164c-4e46-8731-aa1d691f2260-00000000-0000-0000-0000-000000001234
Content-Type: application/json
Authorization: Bearer token
If-match: "W/\"JyIxODAwZDQwYi0wMDAwLTE5MDAtMDAwMC02MGVmMGE3MzAwMDAiJw==\""
{
    "duration": "P1Y",
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
{
    "@odata.context": "https://graph.microsoft.com/beta/tenantRelationships/$metadata#DelegatedAdminRelationships/$entity",
    "@odata.etag": "W/\"JyIxYjAwMDM3Zi0wMDAwLTE5MDAtMDAwMC02MGY0YjMwMDAwMDAiJw==\"",
    "id": "d19a2db9-164c-4e46-8731-aa1d691f2260-00000000-0000-0000-0000-000000001234",
    "displayName": "Contoso Admin Relationship",
    "duration": "P1Y",
    "status": "created", 
    "partner": {
        "tenantId": "00000000-0000-0000-0000-000000001234"
    },
    "customer": null,
    "accessDetails": { 
        "unifiedRoles": [
            {
                "roleDefinitionId": "29232cdf-9323-42fd-ade2-1d097af3e4de"
            },
            {
                "roleDefinitionId": "f28a1f50-f6e7-4571-818b-6a12f2af6b6c"
            },
            {
                "roleDefinitionId": "69091246-20e8-4a56-aa4d-066075b2a7a8"
            }
        ]
    }
}
```


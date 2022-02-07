---
title: "Get delegatedAdminRelationship"
description: "Read the properties and relationships of a delegatedAdminRelationship object."
author: "adtangir"
ms.localizationpriority: medium
ms.prod: "partnercustomersvcadmin"
doc_type: apiPageType
---

# Get delegatedAdminRelationship
Namespace: microsoft.partner.customerServiceAdministration



Read the properties and relationships of a [delegatedAdminRelationship](../resources/delegatedadminrelationship.md) object.

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
GET /tenantRelationship/delegatedAdminRelationships/{delegatedAdminRelationshipId}
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

If successful, this method returns a `200 OK` response code and a [delegatedAdminRelationship](../resources/delegatedadminrelationship.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_delegatedadminrelationship"
}
-->
``` http
GET https://graph.microsoft.com/beta/tenantRelationships/delegatedAdminRelationships/5e5594d3-6f82-458b-b567-77db4811f0cd-00000000-0000-0000-0000-000000001234
Content-Type: application/json
Authorization: Bearer token
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.partner.customerServiceAdministration.delegatedAdminRelationship"
}
-->
``` http
HTTP/1.1 200 OK
{
  "@odata.context": "https://graph.microsoft.com/beta/tenantRelationships/$metadata#DelegatedAdminRelationships/$entity",
  "@odata.etag": "W/\"JyIxODAwZDQwYi0wMDAwLTE5MDAtMDAwMC02MGVmMGE3MzAwMDAiJw==\"",
  "id": "5e5594d3-6f82-458b-b567-77db4811f0cd-00000000-0000-0000-0000-000000001234",
  "displayName": "Contoso Admin Relationship",
  "duration": "P20D",
  "status": "active",
  "activatedDateTime": "07/14/2021 16:01:55",
  "endDateTime": "08/03/2021 16:01:55",
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
              "roleDefinitionId": "29232cdf-9323-42fd-ade2-1d097af3e4de"
          },
          {
              "roleDefinitionId": "729827e3-9c14-49f7-bb1b-9608f156bbb8"
          },
          {
              "roleDefinitionId": "b0f54661-2d74-4c50-afa3-1ec803f12efe"
          },
          {
              "roleDefinitionId": "f2ef992c-3afb-46b9-b7cf-a126ee74c451"
          },
          {
              "roleDefinitionId": "17315797-102d-40b4-93e0-432062caca18"
          }
      ]
  }
}
```


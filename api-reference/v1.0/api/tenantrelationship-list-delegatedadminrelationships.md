---
title: "List delegatedAdminRelationships"
description: "Get the delegatedAdminRelationship resources from the delegatedAdminRelationships navigation property."
author: "adtangir"
ms.localizationpriority: medium
ms.prod: "partnercustomersvcadmin"
doc_type: apiPageType
---

# List delegatedAdminRelationships
Namespace: microsoft.partner.customerServiceAdministration



Get the delegatedAdminRelationship resources from the delegatedAdminRelationships navigation property.

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
GET https://graph.microsoft.com/v1.0/tenantRelationship/delegatedAdminRelationships
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
Content-Type: application/json

{
  "value": [
    {
      "@odata.type": "#microsoft.partner.customerServiceAdministration.delegatedAdminRelationship",
      "id": "46763d8a-eeee-1d36-3885-bf7af3c5edf1",
      "name": "String",
      "duration": "String (duration)",
      "partner": {
        "@odata.type": "microsoft.graph.delegatedAdminRelationshipParticipant"
      },
      "customer": {
        "@odata.type": "microsoft.graph.delegatedAdminRelationshipCustomerParticipant"
      },
      "accessDetails": {
        "@odata.type": "microsoft.graph.delegatedAdminAccessDetails"
      },
      "status": "String",
      "createdDateTime": "String (timestamp)",
      "lastModifiedDateTime": "String (timestamp)",
      "activatedDateTime": "String (timestamp)",
      "endDateTime": "String (timestamp)"
    }
  ]
}
```


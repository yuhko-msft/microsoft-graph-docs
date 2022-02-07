---
title: "Create delegatedAdminRelationship"
description: "Create a new delegatedAdminRelationship object."
author: "adtangir"
ms.localizationpriority: medium
ms.prod: "partnercustomersvcadmin"
doc_type: apiPageType
---

# Create delegatedAdminRelationship
Namespace: microsoft.partner.customerServiceAdministration



Create a new [delegatedAdminRelationship](../resources/delegatedadminrelationship.md) object.

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
POST /tenantRelationship/delegatedAdminRelationships
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [delegatedAdminRelationship](../resources/delegatedadminrelationship.md) object.

You can specify the following properties when creating a **delegatedAdminRelationship**.

|Property|Type|Description|
|:---|:---|:---|
|name|String|**TODO: Add Description** Required.|
|duration|Duration|**TODO: Add Description** Required.|
|partner|[microsoft.partner.customerServiceAdministration.delegatedAdminRelationshipParticipant](../resources/delegatedadminrelationshipparticipant.md)|**TODO: Add Description** Required.|
|customer|[microsoft.partner.customerServiceAdministration.delegatedAdminRelationshipCustomerParticipant](../resources/delegatedadminrelationshipcustomerparticipant.md)|**TODO: Add Description** Optional.|
|accessDetails|[microsoft.partner.customerServiceAdministration.delegatedAdminAccessDetails](../resources/delegatedadminaccessdetails.md)|**TODO: Add Description** Required.|
|status|String|**TODO: Add Description** Optional.|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Optional.|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Optional.|
|activatedDateTime|DateTimeOffset|**TODO: Add Description** Optional.|
|endDateTime|DateTimeOffset|**TODO: Add Description** Optional.|



## Response

If successful, this method returns a `201 Created` response code and a [delegatedAdminRelationship](../resources/delegatedadminrelationship.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_delegatedadminrelationship_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/tenantRelationship/delegatedAdminRelationships
Content-Type: application/json
Content-length: 565

{
  "@odata.type": "#microsoft.partner.customerServiceAdministration.delegatedAdminRelationship",
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
  "activatedDateTime": "String (timestamp)",
  "endDateTime": "String (timestamp)"
}
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
HTTP/1.1 201 Created
Content-Type: application/json

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
```


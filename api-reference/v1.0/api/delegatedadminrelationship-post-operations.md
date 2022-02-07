---
title: "Create delegatedAdminOperation"
description: "Create a new delegatedAdminOperation object."
author: "adtangir"
ms.localizationpriority: medium
ms.prod: "partnercustomersvcadmin"
doc_type: apiPageType
---

# Create delegatedAdminOperation
Namespace: microsoft.partner.customerServiceAdministration



Create a new [delegatedAdminOperation](../resources/delegatedadminoperation.md) object.

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
POST /tenantRelationship/delegatedAdminRelationships/{delegatedAdminRelationshipId}/operations
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [delegatedAdminOperation](../resources/delegatedadminoperation.md) object.

You can specify the following properties when creating a **delegatedAdminOperation**.

|Property|Type|Description|
|:---|:---|:---|
|operationType|String|**TODO: Add Description** Required.|
|data|String|**TODO: Add Description** Required.|
|status|String|**TODO: Add Description** Required.|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Required.|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Required.|



## Response

If successful, this method returns a `201 Created` response code and a [delegatedAdminOperation](../resources/delegatedadminoperation.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_delegatedadminoperation_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/tenantRelationship/delegatedAdminRelationships/{delegatedAdminRelationshipId}/operations
Content-Type: application/json
Content-length: 171

{
  "@odata.type": "#microsoft.partner.customerServiceAdministration.delegatedAdminOperation",
  "operationType": "String",
  "data": "String",
  "status": "String"
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.partner.customerServiceAdministration.delegatedAdminOperation"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.partner.customerServiceAdministration.delegatedAdminOperation",
  "id": "0c9970f6-75f5-20dd-47fc-fd30aab0a38f",
  "operationType": "String",
  "data": "String",
  "status": "String",
  "createdDateTime": "String (timestamp)",
  "lastModifiedDateTime": "String (timestamp)"
}
```


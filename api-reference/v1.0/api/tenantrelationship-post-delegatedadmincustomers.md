---
title: "Create delegatedAdminCustomer"
description: "Create a new delegatedAdminCustomer object."
author: "adtangir"
ms.localizationpriority: medium
ms.prod: "partnercustomersvcadmin"
doc_type: apiPageType
---

# Create delegatedAdminCustomer
Namespace: microsoft.partner.customerServiceAdministration



Create a new [delegatedAdminCustomer](../resources/delegatedadmincustomer.md) object.

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
POST /tenantRelationship/delegatedAdminCustomers
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [delegatedAdminCustomer](../resources/delegatedadmincustomer.md) object.

You can specify the following properties when creating a **delegatedAdminCustomer**.

|Property|Type|Description|
|:---|:---|:---|
|tenantId|String|**TODO: Add Description** Required.|
|displayName|String|**TODO: Add Description** Required.|



## Response

If successful, this method returns a `201 Created` response code and a [delegatedAdminCustomer](../resources/delegatedadmincustomer.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_delegatedadmincustomer_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/tenantRelationship/delegatedAdminCustomers
Content-Type: application/json
Content-length: 149

{
  "@odata.type": "#microsoft.partner.customerServiceAdministration.delegatedAdminCustomer",
  "tenantId": "String",
  "displayName": "String"
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.partner.customerServiceAdministration.delegatedAdminCustomer"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.partner.customerServiceAdministration.delegatedAdminCustomer",
  "id": "2cf4d9a5-5661-8858-da96-13b707815d8a",
  "tenantId": "String",
  "displayName": "String"
}
```


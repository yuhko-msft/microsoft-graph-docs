---
title: "Create delegatedAdminAccessAssignment"
description: "Create a new delegatedAdminAccessAssignment object."
author: "adtangir"
ms.localizationpriority: medium
ms.prod: "partnercustomersvcadmin"
doc_type: apiPageType
---

# Create delegatedAdminAccessAssignment
Namespace: microsoft.partner.customerServiceAdministration


**TODO: Callout status progression (pending -> active/)**
Create a new [delegatedAdminAccessAssignment](../resources/delegatedadminaccessassignment.md) object.

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
POST /tenantRelationship/delegatedAdminRelationships/{delegatedAdminRelationshipId}/accessAssignments
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [delegatedAdminAccessAssignment](../resources/delegatedadminaccessassignment.md) object.

You can specify the following properties when creating a **delegatedAdminAccessAssignment**.

|Property|Type|Description|
|:---|:---|:---|
|status|String|**TODO: Add Description** Optional.|
|accessContainer|[microsoft.partner.customerServiceAdministration.delegatedAdminAccessContainer](../resources/delegatedadminaccesscontainer.md)|**TODO: Add Description** Required.|
|accessDetails|[microsoft.partner.customerServiceAdministration.delegatedAdminAccessDetails](../resources/delegatedadminaccessdetails.md)|**TODO: Add Description** Required.|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Optional.|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Optional.|



## Response

If successful, this method returns a `201 Created` response code and a [delegatedAdminAccessAssignment](../resources/delegatedadminaccessassignment.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_delegatedadminaccessassignment_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/tenantRelationship/delegatedAdminRelationships/{delegatedAdminRelationshipId}/accessAssignments
Content-Type: application/json
Content-length: 319

{
  "@odata.type": "#microsoft.partner.customerServiceAdministration.delegatedAdminAccessAssignment",
  "status": "String",
  "accessContainer": {
    "@odata.type": "microsoft.graph.delegatedAdminAccessContainer"
  },
  "accessDetails": {
    "@odata.type": "microsoft.graph.delegatedAdminAccessDetails"
  }
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.partner.customerServiceAdministration.delegatedAdminAccessAssignment"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.partner.customerServiceAdministration.delegatedAdminAccessAssignment",
  "id": "4eecfef5-cefe-3b10-0658-6039d4e3472d",
  "status": "String",
  "accessContainer": {
    "@odata.type": "microsoft.graph.delegatedAdminAccessContainer"
  },
  "accessDetails": {
    "@odata.type": "microsoft.graph.delegatedAdminAccessDetails"
  },
  "createdDateTime": "String (timestamp)",
  "lastModifiedDateTime": "String (timestamp)"
}
```


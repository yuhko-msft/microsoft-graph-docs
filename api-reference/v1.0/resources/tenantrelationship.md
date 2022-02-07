---
title: "tenantRelationship resource type"
description: "**TODO: Add Description**"
author: "adtangir"
ms.localizationpriority: medium
ms.prod: "partnercustomersvcadmin"
doc_type: resourcePageType
---

# tenantRelationship resource type

Namespace: microsoft.graph



**TODO: Add Description**

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List tenantRelationships](../api/tenantrelationship-list.md)|[tenantRelationship](../resources/tenantrelationship.md) collection|Get a list of the [tenantRelationship](../resources/tenantrelationship.md) objects and their properties.|
|[Get tenantRelationship](../api/tenantrelationship-get.md)|[tenantRelationship](../resources/tenantrelationship.md)|Read the properties and relationships of a [tenantRelationship](../resources/tenantrelationship.md) object.|
|[Update tenantRelationship](../api/tenantrelationship-update.md)|[tenantRelationship](../resources/tenantrelationship.md)|Update the properties of a [tenantRelationship](../resources/tenantrelationship.md) object.|
|[Delete tenantRelationship](../api/tenantrelationship-delete.md)|None|Deletes a [tenantRelationship](../resources/tenantrelationship.md) object.|
|[List delegatedAdminCustomers](../api/tenantrelationship-list-delegatedadmincustomers.md)|[delegatedAdminCustomer](../resources/delegatedadmincustomer.md) collection|Get the delegatedAdminCustomer resources from the delegatedAdminCustomers navigation property.|
|[Create delegatedAdminCustomer](../api/tenantrelationship-post-delegatedadmincustomers.md)|[delegatedAdminCustomer](../resources/delegatedadmincustomer.md)|Create a new delegatedAdminCustomer object.|
|[List delegatedAdminRelationships](../api/tenantrelationship-list-delegatedadminrelationships.md)|[delegatedAdminRelationship](../resources/delegatedadminrelationship.md) collection|Get the delegatedAdminRelationship resources from the delegatedAdminRelationships navigation property.|
|[Create delegatedAdminRelationship](../api/tenantrelationship-post-delegatedadminrelationships.md)|[delegatedAdminRelationship](../resources/delegatedadminrelationship.md)|Create a new delegatedAdminRelationship object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|delegatedAdminCustomers|[delegatedAdminCustomer](../resources/delegatedadmincustomer.md) collection|**TODO: Add Description**|
|delegatedAdminRelationships|[delegatedAdminRelationship](../resources/delegatedadminrelationship.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.tenantRelationship",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.tenantRelationship"
}
```


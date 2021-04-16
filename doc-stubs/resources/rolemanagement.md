---
title: "roleManagement resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# roleManagement resource type

Namespace: microsoft.graph



**TODO: Add Description**

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[Get roleManagement](../api/rolemanagement-get.md)|[roleManagement](../resources/rolemanagement.md)|Read the properties and relationships of a [roleManagement](../resources/rolemanagement.md) object.|
|[Update roleManagement](../api/rolemanagement-update.md)|[roleManagement](../resources/rolemanagement.md)|Update the properties of a [roleManagement](../resources/rolemanagement.md) object.|
|[List rbacApplicationMultiple](../api/rolemanagement-list-cloudpc.md)|[rbacApplicationMultiple](../resources/rbacapplicationmultiple.md) collection|Get the rbacApplicationMultiple resources from the cloudPC navigation property.|
|[Create rbacApplicationMultiple](../api/rolemanagement-post-cloudpc.md)|[rbacApplicationMultiple](../resources/rbacapplicationmultiple.md)|Create a new rbacApplicationMultiple object.|
|[List rbacApplicationMultiple](../api/rolemanagement-list-devicemanagement.md)|[rbacApplicationMultiple](../resources/rbacapplicationmultiple.md) collection|Get the rbacApplicationMultiple resources from the deviceManagement navigation property.|
|[Create rbacApplicationMultiple](../api/rolemanagement-post-devicemanagement.md)|[rbacApplicationMultiple](../resources/rbacapplicationmultiple.md)|Create a new rbacApplicationMultiple object.|
|[List rbacApplication](../api/rolemanagement-list-directory.md)|[rbacApplication](../resources/rbacapplication.md) collection|Get the rbacApplication resources from the directory navigation property.|
|[Create rbacApplication](../api/rolemanagement-post-directory.md)|[rbacApplication](../resources/rbacapplication.md)|Create a new rbacApplication object.|
|[List rbacApplication](../api/rolemanagement-list-entitlementmanagement.md)|[rbacApplication](../resources/rbacapplication.md) collection|Get the rbacApplication resources from the entitlementManagement navigation property.|
|[Create rbacApplication](../api/rolemanagement-post-entitlementmanagement.md)|[rbacApplication](../resources/rbacapplication.md)|Create a new rbacApplication object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|cloudPC|[rbacApplicationMultiple](../resources/rbacapplicationmultiple.md)|**TODO: Add Description**|
|deviceManagement|[rbacApplicationMultiple](../resources/rbacapplicationmultiple.md)|The RbacApplication for Device Management|
|directory|[rbacApplication](../resources/rbacapplication.md)|**TODO: Add Description**|
|entitlementManagement|[rbacApplication](../resources/rbacapplication.md)|The RbacApplication for Entitlement Management|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.roleManagement",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.roleManagement"
}
```


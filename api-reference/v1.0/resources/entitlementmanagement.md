---
title: "entitlementManagement resource type"
description: "The container for entitlement management resources."
author: "markwahl-msft"
ms.localizationpriority: medium
ms.prod: "governance"
doc_type: resourcePageType
---

# entitlementManagement resource type

The entitlement management singleton is the container for entitlement management resources, including [accessPackageCatalog](accesspackagecatalog.md), [connectedOrganization](connectedorganization.md), and [entitlementManagementSettings](entitlementmanagementsettings.md).  For a full list of resources see [entitlement management overview](entitlementmanagement-overview.md).

Inherits from [entity](entity.md).

## Methods

None.

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|This value indicates the resource is a singleton. Read-only. Inherited from [entity](entity.md).|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|accessPackageAssignmentApprovals|[approval](../resources/approval.md) collection | Approval stages for assignment requests.|
|accessPackages|[accessPackage](../resources/accesspackage.md) collection|Represents access package objects.|
|assignmentPolicies|[accessPackageAssignmentPolicy](../resources/accesspackageassignmentpolicy.md) collection|Access package assignment policies.|
|assignmentRequests|[accessPackageAssignmentRequest](../resources/accesspackageassignmentrequest.md) collection|Represents access package assignment requests created by or on behalf of a user.|
|assignments|[accessPackageAssignment](../resources/accesspackageassignment.md) collection| Represents the grant of an access package to a subject (user or group).|
|catalogs|[accessPackageCatalog](../resources/accesspackagecatalog.md) collection| Represents a collection of access packages.|
|connectedOrganizations|[connectedOrganization](../resources/connectedorganization.md) collection|Represents references to a directory or domain of another organization whose users can request access.|
|settings|[entitlementManagementSettings](../resources/entitlementmanagementsettings.md)| Represents the settings that control the behavior of Azure AD entitlement management.|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.entitlementManagement",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.entitlementManagement",
  "id": "String (identifier)"
}
```



---
title: "preApprovedPermissions resource type"
description: "A preApprovedPermissions describes the permissions that has been pre-approved"
author: "yuhko-msft"
ms.localizationpriority: medium
ms.prod: "applications"
doc_type: resourcePageType
---

# preApprovedPermissions resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

A **preApprovedPermissions** type describes the set of permission that has been pre-approved. This is an abstract base type and cannot be used directly. Instead, use one of the following derived types: 

* [allPreApprovedPermissions](allPreApprovedPermissions.md) for indicating all permissions for all APIs are pre-approved
* [allPreApprovedPermissionsOnResourceApp](allPreApprovedPermissionsOnResourceApp.md) for indicating all permissions for a specified API are pre-approved
* [enumeratedPreApprovedPermissions](enumeratedPreApprovedPermissions.md) for indicating that only the specified permissions have been pre-approved

## Properties
|Property|Type|Description|
|:---|:---|:---|
|permissionKind|[permissionKind](enums.md#permissionKind-values)| Indicates how permissions are being included in this condition set. Possible values: `all` for all permissions, `enumerated` for a given list of permissions, or `allPermissionsOnResourceApp` for all permissions from a given API. Required.|
|permissionType|permissionType|The permission type of the permission being granted. Possible values: `application` for application permissions, or `delegated` for delegated permissions. Required.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.preApprovedPermissions"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.preApprovedPermissions",
  "permissionKind": "String",
  "permissionType": "String"
}
```


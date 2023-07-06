---
title: "preApprovedPermissions resource type"
description: "A preApprovedPermissions describes the collection of permission that has been preApproved"
author: "yuhko-msft"
ms.localizationpriority: medium
ms.prod: "applications"
doc_type: resourcePageType
---

# preApprovedPermissions resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

A preApproved describes the list of permission that has been pre-approved. This is an abstract base type that's inherited by the following derived types: [allPreApprovedPermissions](/allPreApprovedPermissions.md), [allPreApprovedPermissionsOnResourceApp](/allPreApprovedPermissionsOnResourceApp.md), [enumeratedPreApprovedPermissions](/enumeratedPreApprovedPermissions.md)

## Properties
|Property|Type|Description|
|:---|:---|:---|
|permissionKind|permissionKind| It indicates what kind of permissions has been included in the condition sets. Possible values: `all` for all  permissions is allowed, `enumerated` for a selected set of permissions from a single resource application are allowed, or `allPermissionsOnResourceApp` for all permissions from the specific resource application are allowed. Required.|
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


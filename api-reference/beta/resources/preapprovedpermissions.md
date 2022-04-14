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

A preApprovedPermissions describes the collection of permission that has been pre-approved.

## Properties
|Property|Type|Description|
|:---|:---|:---|
|permissionKind|permissionKind| It indicates what kind of permissions has been icnluded in the condition sets. Possible values: `all` for all  permissions are allowed, or `enumerated` for a selected set of permissions from a signle resource application are allowed. The value `allPermissionsOnResourceApp` indicates all permissions from the specific resource application are allowed. Required.|
|permissionType|Microsoft.DirectoryServices.permissionType|The permission type of the permission being granted. Possible values: `application` for application permissions, or `delegated` for delegated permissions. Required.|

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


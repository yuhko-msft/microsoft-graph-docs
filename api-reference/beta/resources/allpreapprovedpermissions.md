---
title: "allPreApprovedPermissions resource type"
description: "When this type is used, if the client application requests more permissions after the policy is created, the policy will still apply"
author: "yuhko-msft"
ms.localizationpriority: medium
ms.prod: "applications"
doc_type: resourcePageType
---

# allPreApprovedPermissions resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

The derived type when all permissions from any resource app are pre-approved for consent. When this type is used, if the client application requests more permissions after the policy is created, the policy will still apply.

## Properties
|Property|Type|Description|
|:---|:---|:---|
|permissionKind|permissionKind| It indicates what kind of permissions has been icnludes in the condition sets. Possible values: `all` for all  permissions are allowed, or `enumerated` for a selected set of permissions from a signle resource application are allowed. The value `allPermissionsOnResourceApp` indicates all permissions from the specific resource application are allowed. Required.|
|permissionType|permissionType|The permission type of the permission being granted. Possible values: `application` for application permissions (e.g. app roles), or `delegated` for delegated permissions. Required.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.allPreApprovedPermissions"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.allPreApprovedPermissions",
  "permissionKind": "all",
  "permissionType": "String"
}
```


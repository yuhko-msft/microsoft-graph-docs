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

This type is used in a [preApprovalDetail](preapprovaldetail.md) resource to indicate that all permissions for all APIs are included in the pre-approval.

## Properties
|Property|Type|Description|
|:---|:---|:---|
|permissionKind|permissionKind| It indicates what kind of permissions has been included in the condition sets. Possible value: `all` to indicate all permissions for all APIs are included. Required.|
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


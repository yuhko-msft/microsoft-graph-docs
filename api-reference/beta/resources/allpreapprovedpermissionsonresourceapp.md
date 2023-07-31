---
title: "allPreApprovedPermissionsOnResourceApp resource type"
description: "When this type is used, consent are allowed **ONLY** for permissions on the resource app that is specified in the policy"
author: "yuhko-msft"
ms.localizationpriority: medium
ms.prod: "applications"
doc_type: resourcePageType
---

# allPreApprovedPermissionsOnResourceApp resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

This type is used in a [preApprovalDetail](preapprovaldetail.md) resource to indicate that all permissions for a specific API are included in the pre-approval. When this type is used, the pre-approval only includes for permissions for the specified resource app (API).

## Properties
|Property|Type|Description|
|:---|:---|:---|
|permissionKind|permissionKind| It indicates what kind of permissions has been included in the condition sets. It only accepts the value `allPermissionsOnResourceApp` indicates all permissions from the specific resource application are allowed. Required.|
|permissionType|permissionType|The permission type of the permission being granted. Possible values: `application` for application permissions (e.g. app roles), or `delegated` for delegated permissions. Required.|
|resourceApplicationId|String|The **appId** of the resource application (the API). Required.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.allPreApprovedPermissionsOnResourceApp"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.allPreApprovedPermissionsOnResourceApp",
  "permissionKind": "allPermissionsOnResourceApp",
  "permissionType": "String",
  "resourceApplicationId": "String"
}
```


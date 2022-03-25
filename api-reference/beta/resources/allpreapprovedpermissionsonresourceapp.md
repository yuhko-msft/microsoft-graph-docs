---
title: "allPreApprovedPermissionsOnResourceApp resource type"
description: "**TODO: Add Description**"
author: "yuhko-msft"
ms.localizationpriority: medium
ms.prod: "applications"
doc_type: resourcePageType
---

# allPreApprovedPermissionsOnResourceApp resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

The derived type when all permissions from a resource app are pre-approved for consent. When this type is used, consent are allowed ONLY for permissions on the resource app that is specified in the policy. If the client application requests more permissions from the same resource app after the policy is created, the policy will apply. However, if the client application requests more permissions from other resource app, the policy will not apply.

## Properties
|Property|Type|Description|
|:---|:---|:---|
|permissionKind|permissionKind| It indicates what kind of permissions has been icnludes in the condition sets. Possible values: `all` for all  permissions are allowed, or `enumerated` for a selected set of permissions from a signle resource application are allowed. The value `allPermissionsOnResourceApp` indicates all permissions from the specific resource application are allowed. Required.|
|permissionType|permissionType|The permission type of the permission being granted. Possible values: `application` for application permissions (e.g. app roles), or `delegated` for delegated permissions. The value `delegatedUserConsentable` indicates delegated permissions which have not been configured by the API publisher to require admin consent—this value may be used in built-in permission grant policies, but cannot be used in custom permission grant policies. Required.|
|resourceApplicationId|String|The resource application id. Required.|

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
  "permissionKind": "String",
  "permissionType": "String",
  "resourceApplicationId": "String"
}
```


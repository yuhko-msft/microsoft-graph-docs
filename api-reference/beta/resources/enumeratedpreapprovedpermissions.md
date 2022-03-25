---
title: "enumeratedPreApprovedPermissions resource type"
description: "**TODO: Add Description**"
author: "yuhko-msft"
ms.localizationpriority: medium
ms.prod: "applications"
doc_type: resourcePageType
---

# enumeratedPreApprovedPermissions resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

The derived type when all permissions from any resource app are pre-approved for consent. When this type is used, if the client application requests more permissions after the policy is created, the policy will still apply.

## Properties
|Property|Type|Description|
|:---|:---|:---|
|permissionIds|String collection|The list of **id** values for the specific permissions to match with. The **id** of resource-specific application permissions can be found in the **resourceSpecificApplicationPermissions** property of the API's [**servicePrincipal**](serviceprincipal.md) object.|
|permissionKind|permissionKind| It indicates what kind of permissions has been icnludes in the condition sets. Possible values: `all` for all  permissions are allowed, or `enumerated` for a selected set of permissions from a signle resource application are allowed. The value `allPermissionsOnResourceApp` indicates all permissions from the specific resource application are allowed. Required.|
|permissionType|permissionType|The permission type of the permission being granted. Possible values: `application` for application permissions (e.g. app roles), or `delegated` for delegated permissions. The value `delegatedUserConsentable` indicates delegated permissions which have not been configured by the API publisher to require admin consent—this value may be used in built-in permission grant policies, but cannot be used in custom permission grant policies. Required.|
|resourceApplicationId|String|The resource application id. Required.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.enumeratedPreApprovedPermissions"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.enumeratedPreApprovedPermissions",
  "permissionKind": "String",
  "permissionType": "String",
  "permissionIds": [
    "String"
  ],
  "resourceApplicationId": "String"
}
```


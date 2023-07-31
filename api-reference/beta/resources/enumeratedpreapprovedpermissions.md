---
title: "enumeratedPreApprovedPermissions resource type"
description: "The derived type is when only permissions explicitly preapproved will be allowed for consent."
author: "yuhko-msft"
ms.localizationpriority: medium
ms.prod: "applications"
doc_type: resourcePageType
---

# enumeratedPreApprovedPermissions resource type

Namespace: microsoft.graph.enumeratedPreApprovedPermissions

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

The derived type is when only specific permissions on a resource app are pre-approved for consent. When this type is used, consent is allowed ONLY for permissions that are specified in the policy. If the client application requests more permissions after the policy is created, the policy will not apply.

## Properties
|Property|Type|Description|
|:---|:---|:---|
|permissionIds|String collection|The list of **id** values for the specific permissions to match with. The **id** of resource-specific application permissions can be found in the **resourceSpecificApplicationPermissions** property of the API's [**servicePrincipal**](serviceprincipal.md) object.|
|permissionKind|permissionKind| It indicates what kind of permissions has been included in the condition sets. It only accepts `enumerated` for a selected set of permissions from a single resource application are allowed. Required.|
|permissionType|permissionType|The permission type of the permission being granted. Possible values: `application` for application permissions (e.g. app roles), or `delegated` for delegated permissions.  Required.|
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
  "permissionKind": "enumerated",
  "permissionType": "String",
  "permissionIds": [
    "String"
  ],
  "resourceApplicationId": "String"
}
```


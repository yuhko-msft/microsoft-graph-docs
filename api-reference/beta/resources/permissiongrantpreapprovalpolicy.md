---
title: "permissionGrantPreApprovalPolicy resource type"
description: "**TODO: Add Description**"
author: "yuhko-msft"
ms.localizationpriority: medium
ms.prod: "applications"
doc_type: resourcePageType
---

# permissionGrantPreApprovalPolicy resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

A permission grant pre-approval policy is used to help tenant admin granularly control which user can consent to which applications under what conditions.

A permission grant pre-approval policy consists of a list of condition sets.


## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List permissionGrantPreApprovalPolicies](../api/policyroot-list-permissiongrantpreapprovalpolicies.md)|[permissionGrantPreApprovalPolicy](../resources/permissiongrantpreapprovalpolicy.md) collection|Get a list of the [permissionGrantPreApprovalPolicy](../resources/permissiongrantpreapprovalpolicy.md) objects and their properties.|
|[Create permissionGrantPreApprovalPolicy](../api/policyroot-post-permissiongrantpreapprovalpolicies.md)|[permissionGrantPreApprovalPolicy](../resources/permissiongrantpreapprovalpolicy.md)|Create a new [permissionGrantPreApprovalPolicy](../resources/permissiongrantpreapprovalpolicy.md) object.|
|[Get permissionGrantPreApprovalPolicy](../api/permissiongrantpreapprovalpolicy-get.md)|[permissionGrantPreApprovalPolicy](../resources/permissiongrantpreapprovalpolicy.md)|Read the properties and relationships of a [permissionGrantPreApprovalPolicy](../resources/permissiongrantpreapprovalpolicy.md) object.|
|[Update permissionGrantPreApprovalPolicy](../api/permissiongrantpreapprovalpolicy-update.md)|[permissionGrantPreApprovalPolicy](../resources/permissiongrantpreapprovalpolicy.md)|Update the properties of a [permissionGrantPreApprovalPolicy](../resources/permissiongrantpreapprovalpolicy.md) object.|
|[Delete permissionGrantPreApprovalPolicy](../api/permissiongrantpreapprovalpolicy-delete.md)|None|Deletes a [permissionGrantPreApprovalPolicy](../resources/permissiongrantpreapprovalpolicy.md) object.|


## Properties
|Property|Type|Description|
|:---|:---|:---|
|conditions|[preApprovalDetail](../resources/preapprovaldetail.md) collection|A list of conditions that tenant admin has pre-approved for the given service principal.|
|id|String|The unique identifier for the permission grant pre-approval policy.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.permissionGrantPreApprovalPolicy",
  "baseType": "microsoft.graph.directoryObject",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.permissionGrantPreApprovalPolicy",
  "id": "String (identifier)",
  "deletedDateTime": "String (timestamp)",
  "conditions": [
    {
      "@odata.type": "microsoft.graph.preApprovalDetail"
    }
  ]
}
```


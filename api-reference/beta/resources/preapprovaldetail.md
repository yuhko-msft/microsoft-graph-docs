---
title: "preApprovalDetail resource type"
description: "list of conditions that has pre-approved for consent"
author: "yuhko-msft"
ms.localizationpriority: medium
ms.prod: "applications"
doc_type: resourcePageType
---

# preApprovalDetail resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

A preApprovalDetail describes a list of conditions that has pre-approved for consent. The conditions include permissions, resource scope type, and sensitivity labels that has been tagged for the resource scope.

## Properties
|Property|Type|Description|
|:---|:---|:---|
|permissions|[preApprovedPermissions](../resources/preapprovedpermissions.md)|The conditions relating to permissions being granted. Required.|
|scopeType|String| The resource scope type the pre-approval applies to. Possible values: `group` for (groups)[../resources/group.md] and (teams)[../resources/team.md], `chat` for (chats)[../resources/chat.md],  or `tenant` for tenant-wide access. Required.|
|sensitivityLabels|[scopeSensitivityLabels](../resources/scopesensitivitylabels.md)|Conditions on the [sensitivity labels](/microsoft-365/compliance/sensitivity-labels) the pre-approval applies to. 
> **Note:** Chat resource **does not** support sensitivityLabels yet. Please set labelKind to `all` for all sensitivity labels are allowed.



## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.preApprovalDetail"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.preApprovalDetail",
  "scopeType": "String",
  "sensitivityLabels": {
    "@odata.type": "microsoft.graph.scopeSensitivityLabels"
  },
  "permissions": {
    "@odata.type": "microsoft.graph.preApprovedPermissions"
  }
}
```


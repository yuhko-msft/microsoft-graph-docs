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
|permissions|[preApprovedPermissions](../resources/preapprovedpermissions.md)|The collection for permission settings related to taeget resource. Required.|
|scopeType|String|It indicates what resource scope this permission is requested. Possible values: `group` represents an Azure Active Directory (Azure AD) group, which can be a Microsoft 365 group, or a security group, `chat` is a collection of [chatMessages](../resources/chatmessage.md) between one or more participants. Participants can be users or apps., `tenant` for all resources in the tenant. Required.|
|sensitivityLabels|[scopeSensitivityLabels](../resources/scopesensitivitylabels.md)|The sensitivity labels that are applicable to the scope type and has been pre-approved. It allows you to protect sensitive organizational data. Learn about [sensitivity labels](/microsoft-365/compliance/sensitivity-labels) 
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

